package com.pslonczewski.chad_chess_variant_impl.engine.board;

import com.pslonczewski.chad_chess_variant_impl.engine.board.Board.Builder;
import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Pawn;
import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Piece;

public class PawnPromotion extends Move {

    final Move decoratedMove;
    final Pawn promotedPawn;

    public PawnPromotion(final Move decoratedMove) {
        super(decoratedMove.getBoard(), decoratedMove.getMovedPiece(), decoratedMove.getDestinationCoordinate());
        this.decoratedMove = decoratedMove;
        this.promotedPawn = (Pawn)decoratedMove.getMovedPiece();
    }

    @Override
    public int hashCode() {
        return decoratedMove.hashCode() + (31 * promotedPawn.hashCode());
    }

    @Override
    public boolean equals(final Object other) {
        return this == other || other instanceof PawnPromotion && this.decoratedMove.equals(other);
    }

    @Override
    public Board execute() {
        final Board pawnMovedBoard = this.decoratedMove.execute();
        final Builder builder = new Builder();

        for (final Piece piece : pawnMovedBoard.getCurrentPlayer().getActivePieces()) {
            if (!this.promotedPawn.equals(piece)) {
                builder.setPiece(piece);
            }
        }

        for (final Piece piece : pawnMovedBoard.getCurrentPlayer().getOpponent().getActivePieces()) {
            builder.setPiece(piece);
        }
        builder.setPiece(this.promotedPawn.getPromotionPiece().movePiece(this));
        builder.setMoveMaker(pawnMovedBoard.getCurrentPlayer().getAlliance());

        return builder.build();
    }

    @Override
    public boolean isAttack() {
        return this.decoratedMove.isAttack();
    }

    @Override
    public Piece getAttackedPiece() {
        return this.decoratedMove.getAttackedPiece();
    }

    @Override
    public String toString() {
        return "";
    }
}

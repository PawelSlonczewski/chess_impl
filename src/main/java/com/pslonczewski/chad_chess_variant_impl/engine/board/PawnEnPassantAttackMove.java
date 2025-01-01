package com.pslonczewski.chad_chess_variant_impl.engine.board;

import com.pslonczewski.chad_chess_variant_impl.engine.board.Board.Builder;
import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Piece;

public final class PawnEnPassantAttackMove extends PawnAttackMove {

    public PawnEnPassantAttackMove(final Board board, final Piece movedPiece, final int destinationCoordinate,
                                   final Piece attackedPiece) {
        super(board, movedPiece, destinationCoordinate, attackedPiece);
        System.out.println("En Passant Move created!");
    }

    @Override
    public boolean equals(final Object other) {
        return this == other || other instanceof PawnEnPassantAttackMove && super.equals(other);
    }

    @Override
    public Board execute() {
        final Builder builder = new Builder();

        for (final Piece piece : this.board.getCurrentPlayer().getActivePieces()) {
            if (!this.movedPiece.equals(piece)) {
                builder.setPiece(piece);
            }
        }

        for (final Piece piece: this.board.getCurrentPlayer().getOpponent().getActivePieces()) {
            if (!this.getAttackedPiece().equals(piece)) {
                builder.setPiece(piece);
            }
        }

        builder.setPiece(this.movedPiece.movePiece(this));
        builder.setMoveMaker(this.board.getCurrentPlayer().getOpponent().getAlliance());
        return builder.build();
    }
}

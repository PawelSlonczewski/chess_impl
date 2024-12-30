package com.pslonczewski.chad_chess_variant_impl.engine.board;

import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Piece;

public class PawnAttackMove extends AttackMove {

    public PawnAttackMove(final Board board, Piece movedPiece, final int destinationCoordinate,
                             final Piece attackedPiece) {
        super(board, movedPiece, destinationCoordinate, attackedPiece);
    }

    @Override
    public boolean equals(final Object other) {
        return this == other || other instanceof PawnAttackMove && super.equals(other);
    }

    @Override
    public String toString() {
        return BoardUtils.getPositionAtCoordinate(this.movedPiece.getPiecePosition()).substring(0, 1) + "x"
                + BoardUtils.getPositionAtCoordinate(this.destinationCoordinate);
    }
}

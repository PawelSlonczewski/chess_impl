package com.pslonczewski.chad_chess_variant_impl.engine.board;

import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Piece;

public class PawnAttackMove extends AttackMove {

    public PawnAttackMove(final Board board, Piece movedPiece, final int destinationCoordinate,
                             final Piece attackedPiece) {
        super(board, movedPiece, destinationCoordinate, attackedPiece);
    }
}

package com.pslonczewski.chad_chess_variant_impl.engine.board;

import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Piece;

public final class PawnEnPassantAttackMove extends PawnAttackMove {

    public PawnEnPassantAttackMove(final Board board, final Piece movedPiece, final int destinationCoordinate,
                                   final Piece attackedPiece) {
        super(board, movedPiece, destinationCoordinate, attackedPiece);
    }
}

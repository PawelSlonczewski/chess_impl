package com.pslonczewski.chad_chess_variant_impl.engine.board;

import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Piece;

public class PawnMove extends Move {

    public PawnMove(final Board board, Piece movedPiece, final int destinationCoordinate) {
        super(board, movedPiece, destinationCoordinate);
    }
}

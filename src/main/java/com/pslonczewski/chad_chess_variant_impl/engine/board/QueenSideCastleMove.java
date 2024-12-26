package com.pslonczewski.chad_chess_variant_impl.engine.board;

import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Piece;

public class QueenSideCastleMove extends CastleMove {
    public QueenSideCastleMove(final Board board, final Piece movedPiece, final int destinationCoordinate) {
        super(board, movedPiece, destinationCoordinate);
    }
}

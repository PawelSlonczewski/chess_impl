package com.pslonczewski.chad_chess_variant_impl.engine.board;

import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Piece;
import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Rook;

public class QueenSideCastleMove extends CastleMove {
    public QueenSideCastleMove(final Board board, final Piece movedPiece, final int destinationCoordinate,
                               final Rook castleRook, final int castleRookStart, final int castleRookDestination) {
        super(board, movedPiece, destinationCoordinate, castleRook, castleRookStart, castleRookDestination);
        System.out.println("Queen Side castle move created!");
    }

    @Override
    public boolean equals(final Object other) {
        return this == other || other instanceof QueenSideCastleMove && super.equals(other);
    }

    @Override
    public String toString() {
        return "0-0-0";
    }
}

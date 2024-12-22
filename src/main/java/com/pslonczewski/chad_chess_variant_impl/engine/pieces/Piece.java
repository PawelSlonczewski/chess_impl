package com.pslonczewski.chad_chess_variant_impl.engine.pieces;

import com.pslonczewski.chad_chess_variant_impl.Alliance;
import com.pslonczewski.chad_chess_variant_impl.engine.board.Board;
import com.pslonczewski.chad_chess_variant_impl.engine.board.Move;

import java.util.Collection;

public abstract class Piece {

    protected final int piecePosition;

    protected final Alliance pieceAlliance;

    protected Piece(final int piecePosition, final Alliance pieceAlliance) {
        this.piecePosition = piecePosition;
        this.pieceAlliance = pieceAlliance;
    }

    public Alliance getPieceAlliance() {
        return this.pieceAlliance;
    }

    public abstract Collection<Move> calculateLegalMoves(final Board board);
}

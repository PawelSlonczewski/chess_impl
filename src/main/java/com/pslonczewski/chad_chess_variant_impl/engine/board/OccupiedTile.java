package com.pslonczewski.chad_chess_variant_impl.engine.board;

import com.pslonczewski.chad_chess_variant_impl.engine.pieces.Piece;

public final class OccupiedTile extends Tile {

    private final Piece pieceOnTile;

    protected OccupiedTile(final int tileCoordinate, Piece piece) {
        super(tileCoordinate);
        this.pieceOnTile = piece;
    }

    @Override
    public boolean isTileOccupied() {
        return true;
    }

    @Override
    public Piece getPiece() {
        return this.pieceOnTile;
    }
}

package com.pslonczewski.chad_chess_variant_impl.board;

import com.pslonczewski.chad_chess_variant_impl.pieces.Piece;

public final class EmptyTile extends Tile {

    protected EmptyTile(final int tileCoordinate) {
        super(tileCoordinate);
    }

    @Override
    public boolean isTileOccupied() {
        return false;
    }

    @Override
    public Piece getPiece() {
        return null;
    }
}

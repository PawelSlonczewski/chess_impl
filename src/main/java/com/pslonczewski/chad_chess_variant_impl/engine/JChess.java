package com.pslonczewski.chad_chess_variant_impl.engine;

import com.pslonczewski.chad_chess_variant_impl.engine.board.Board;

public class JChess {

    public static void main(String[] args) {

        Board board = Board.createStandardBoard();

        System.out.println(board);
    }
}

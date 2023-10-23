package com.ljm.service;

import java.util.List;

import com.ljm.domain.Board;

public interface BoardService {
	 List<Board> getAllBoards();
	 void insertBoardS(Board board);
}

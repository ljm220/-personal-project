package com.ljm.mapper;

import java.util.List;

import com.ljm.domain.Board;

public interface BoardMapper {
	
	List<Board> boardAll();
	void insertBoard(Board board);
}

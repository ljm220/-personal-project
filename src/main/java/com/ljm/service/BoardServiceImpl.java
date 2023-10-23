package com.ljm.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ljm.domain.Board;
import com.ljm.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	  private final BoardMapper boardMapper;

	    @Autowired
	    public BoardServiceImpl(BoardMapper boardMapper) {
	        this.boardMapper = boardMapper;
	    }

	    @Override
	    public List<Board> getAllBoards() {
	        return boardMapper.boardAll();
	    }
	    
	    @Override
	    public void insertBoardS(Board board) {
	    	boardMapper.insertBoard(board);
	    }
}

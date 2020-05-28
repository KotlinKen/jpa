package com.pure.service;

import org.springframework.stereotype.Service;

import com.pure.model.Board;
import com.pure.repository.BoardRepository;

@Service
public class BoardService {

	
	BoardRepository boardRepository;
	
	public BoardService(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	
	public Board getBoard(Long boardId) throws Exception {
		return boardRepository.findById(boardId).orElseThrow(() -> 
        		new Exception("test"));
	}
	
	
	
}

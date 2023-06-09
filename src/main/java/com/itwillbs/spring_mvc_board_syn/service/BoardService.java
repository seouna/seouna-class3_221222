package com.itwillbs.spring_mvc_board_syn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.spring_mvc_board_syn.mapper.BoardMapper;
import com.itwillbs.spring_mvc_board_syn.vo.BoardVO;

@Service
public class BoardService {

	@Autowired
	private BoardMapper mapper;

	// 글 등록 작업 요청
	// BoardMapper - insertBoard()
	public int registBoard(BoardVO board) {
		return mapper.insertBoard(board);
	}
	
}

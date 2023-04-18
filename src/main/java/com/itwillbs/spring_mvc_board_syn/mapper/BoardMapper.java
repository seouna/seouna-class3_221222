package com.itwillbs.spring_mvc_board_syn.mapper;

import com.itwillbs.spring_mvc_board_syn.vo.BoardVO;

public interface BoardMapper {

	// 글 쓰기
	int insertBoard(BoardVO board);

}

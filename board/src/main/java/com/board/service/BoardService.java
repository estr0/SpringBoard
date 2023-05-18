package com.board.service;

import java.util.List;

import com.board.domain.BoardDTO;

public interface BoardService {
	public List list() throws Exception;
	int regi(BoardDTO dto) throws Exception;
	BoardDTO view(int seq);
	int update(BoardDTO dto);
	int delete(int seq);
}

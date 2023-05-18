package com.board.dao;

import java.util.List;

import com.board.domain.BoardDTO;

public interface BoardDAO {
	public List list() throws Exception;
	Integer getMaxSeq();
	int regi(BoardDTO dto);
	BoardDTO view(int seq);
	void updateReadCount(int seq);
	int update(BoardDTO dto);
	public int delete(int seq);
}

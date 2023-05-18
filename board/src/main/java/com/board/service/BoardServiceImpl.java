package com.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.board.dao.BoardDAO;
import com.board.domain.BoardDTO;

@Service
public class BoardServiceImpl  implements BoardService {

	@Inject
	private BoardDAO dao;

	@Override
	public List list() throws Exception {
		return dao.list();
	}
	
	@Override
	public int regi(BoardDTO dto) throws Exception {
		
		if (dao.getMaxSeq() == null) {
			dto.setSeq(1); 
		} else { 
			dto.setSeq(dao.getMaxSeq() + 1);
		}
		
		return dao.regi(dto);
	}

	@Override
	public BoardDTO view(int seq) {
		dao.updateReadCount(seq);
		return dao.view(seq);
	}

	@Override
	public int update(BoardDTO dto) {
		return dao.update(dto);
	}

	@Override
	public int delete(int seq) {
		return dao.delete(seq);
	}
	
}

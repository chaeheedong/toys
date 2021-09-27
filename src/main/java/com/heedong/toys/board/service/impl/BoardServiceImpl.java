package com.heedong.toys.board.service.impl;

import com.heedong.toys.board.dto.Board;
import com.heedong.toys.board.mapper.BoardMapper;
import com.heedong.toys.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    /**
     * 게시판 전체 조회
     * @return Board
     */
    @Override
    public List<Board> findAllBoard() {
        return boardMapper.findAllBoard();
    }
}

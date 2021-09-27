package com.heedong.toys.board.service;


import com.heedong.toys.board.dto.Board;

import java.util.List;

public interface BoardService {

    List<Board> findAllBoard(); // 게시판 전체 조회
}

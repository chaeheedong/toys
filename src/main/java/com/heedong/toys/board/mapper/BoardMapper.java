package com.heedong.toys.board.mapper;

import com.heedong.toys.board.dto.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<Board> findAllBoard(); // 게시판 전체 조회
}

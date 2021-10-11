package com.heedong.toys.board.controller;

import com.heedong.toys.board.dto.Board;
import com.heedong.toys.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping(path = "/view", method = RequestMethod.GET)
    public String view() {
        return "board/view";
    }

    /**
     * 게시판 전체 조회
     * @return Board
     */
    @RequestMapping(path = "/get", method = RequestMethod.GET)
    public List<Board> board() {
        return boardService.findAllBoard();
    }
}

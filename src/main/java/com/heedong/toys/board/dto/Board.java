package com.heedong.toys.board.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Board {

    private int boardIdx;               // 글 번호
    private String author;              // 작성자
    private LocalDateTime createdDt;    // 작성일
    private LocalDateTime updatedDt;    // 수정일
    private String title;               // 제목
    private String contents;            // 내용
    private int viewCnt;                // 조회수
    private char isDeleted;             // 삭제여부

}

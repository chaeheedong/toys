package com.heedong.toys.thymeleaf.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ThymeleafVO {

    private String title;
    private String contents;
    private LocalDateTime currentTime;

}

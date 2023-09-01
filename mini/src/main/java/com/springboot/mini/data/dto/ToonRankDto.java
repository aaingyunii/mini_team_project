package com.springboot.mini.data.dto;

import com.springboot.mini.data.entity.Genre;
import com.springboot.mini.data.entity.Webtoon;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ToonRankDto {
    private Long numb;
    private Integer genreRank;
    private Genre genre;
    private Webtoon webtoon;   
}

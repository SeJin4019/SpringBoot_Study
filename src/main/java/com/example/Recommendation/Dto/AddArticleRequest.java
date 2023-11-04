package com.example.Recommendation.Dto;

import com.example.Recommendation.Entity.Article;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
// dto
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity(){ // entity 생성하는 메서드
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}

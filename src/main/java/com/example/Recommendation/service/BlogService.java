package com.example.Recommendation.service;

import com.example.Recommendation.Dto.AddArticleRequest;
import com.example.Recommendation.Entity.Article;
import com.example.Recommendation.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }
}

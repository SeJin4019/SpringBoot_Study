package com.example.Recommendation.Controller;

import com.example.Recommendation.Dto.AddArticleRequest;
import com.example.Recommendation.Entity.Article;
import com.example.Recommendation.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

   private final BlogService blogService;

   @PostMapping("/api/articles")
   public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request){
       Article savedArticle = blogService.save(request);
       return ResponseEntity.status(HttpStatus.CREATED).body(savedArticle);   }

}

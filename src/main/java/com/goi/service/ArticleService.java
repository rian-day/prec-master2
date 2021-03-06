package com.goi.service;

import com.goi.entity.Article;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public interface ArticleService {

    @Transactional
    Object getArticles(Long userId);

    @Transactional
    List<Article> getArticleById(Long labelId) throws Exception;
}

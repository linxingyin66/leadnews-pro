package com.heima.article.service;

import com.heima.model.article.pojos.ApArticle;

/**
 * @ClassName ArticleFreemarkerService
 * @Description
 * @Author LXY
 * @Date 2023/9/9 16:52
 **/
public interface ArticleFreemarkerService {
    /**
     * 生成静态文件上传到minIO中
     * @param apArticle
     * @param content
     */
    public void buildArticleToMinIO(ApArticle apArticle, String content);
}

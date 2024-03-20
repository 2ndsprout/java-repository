package org.example.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.base.CommonUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ArticleFileRepository {

    private int latestId = 1;
    CommonUtil commonUtil = new CommonUtil();
    ObjectMapper mapper = new ObjectMapper();
    ArrayList<Article> articleList = new ArrayList<>();
    public void saveArticle(String title, String body) {
        // 번호 latestId 제목이 title, 내용이 body, 조회수0, 등록날짜 현재시간
        // json 파일로 저장

        Article article = new Article(latestId, title, body,0,commonUtil.getCurrentDateTime());
        articleList.add(article);
        latestId++;
        try {
            // 객체를 JSON 형태로 변환하여 파일에 저장
            mapper.writeValue(new File("article.json"),articleList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Article> findAll() {
        return articleList;
    }
}

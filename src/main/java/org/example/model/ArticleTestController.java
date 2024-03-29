package org.example.model;

import org.example.base.CommonUtil;
import org.example.view.ArticleView;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticleTestController {

    CommonUtil commonUtil = new CommonUtil();
    ArticleView articleView = new ArticleView();
    ArticleFileRepository articleRepository = new ArticleFileRepository();
    Scanner scan = commonUtil.getScanner();
    int WRONG_VALUE = -1;
    public void add() {

        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = scan.nextLine();

        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = scan.nextLine();

        articleRepository.saveArticle(title, body);
        System.out.println("게시물이 등록되었습니다.");

    }
    public void list() {

        ArrayList<Article> articleList = articleRepository.findAll();
        articleView.printArticleList(articleList);
    }

}

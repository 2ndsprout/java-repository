package org.example.base;

import org.example.model.ArticleController;
import org.example.model.ArticleTestController;

public class BoardApp {
    ArticleTestController articleController = new ArticleTestController();
    CommonUtil commonUtil = new CommonUtil();
    public void run() {

        while (true) { // 반복 조건이 true이기 때문에 무한 반복

            System.out.print("명령어 : ");
            String cmd = commonUtil.getScanner().nextLine();
            if(cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (cmd) {
                case "add" -> articleController.add();
                case "list" -> articleController.list();
//                case "update" -> articleController.update();
//                case "delete" -> articleController.delete();
//                case "detail" -> articleController.detail();
//                case "search" -> articleController.search();
                default -> System.out.println("올바른 명령어가 아닙니다.");
            }
        }
    }
}

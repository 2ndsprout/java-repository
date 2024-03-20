package org.example;
import org.example.base.BoardApp;

public class Main {
    public static void main(String[] args) {
        BoardApp app = new BoardApp();
        app.run();

        // ArrayList <- 배열 객체
        // 객체는 힙메모리에 저장
        // 메모리는 휘발성. 영구적으로 저장(영속성 Persistance) 불가능.
        // 프로그램 다시시작할때 데이터가 다 날아감.
        // 영속성 부여
        //      파일로 저장
        //      DB로 저장

        // 자바로 파일 저장, 로드 ->

    }
}
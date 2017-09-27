package java07;

public class jv07_01array {
    public static void main(String[] args) {
        
        // 변수선언
        int score1 = 0, score2 = 0, score3 = 0, score4 = 0, score5 = 0;
        // 배열로 변수선언
        int[] score = new int[5];
        
        score[0] = 0; // 0층에 정수0을 넣음
        score[1] = 1; // 1층에 0넣음
        score[2] = 2;
        score[3] = 3;
        score[4] = 4;
        
        System.out.println("score1:" + score1);
        
        
        System.out.println("score[0]:" + score[0]);
    }
}

package java18;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ex18_05_Date {
    public static void main(String[] args) {
        SimpleDateFormat tf = null;
        //현재 날짜와 시간 출력
        Date from = new Date();
        
        //2017 로 출력
        tf = new SimpleDateFormat("yyyy");
        //년
        System.out.println(tf.format(from)+"년");
        tf = new SimpleDateFormat("MM");
        //월
        System.out.println(tf.format(from));
        
        //일
        System.out.println(from.getDate());
        //시
        System.out.println(from.getHours());
        //분
        System.out.println(from.getMinutes());
        //초
        System.out.println(from.getSeconds());
        
        
    }   
   
    
}

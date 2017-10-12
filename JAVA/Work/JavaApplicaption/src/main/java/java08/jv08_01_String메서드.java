package java08;

public class jv08_01_String메서드 {
    
    public static void main(String[] args) {
        
        // 0번째부터 12번째 자리까지 있음.
        // prov 길이는 13이다.
        String prov = "A barking Dog";
        
        // 문자열 길이: length() . 13이 출력
        int length = prov.length();
        System.out.println(prov.length());
        
        // 문자열 추출 : substring()
        // (2번째부터 4번째 자리까지 추출: bar)
        String bar = prov.substring(2, 5);
        System.out.println(bar);
        
        // Dog 를 출력하시오
        String d = prov.substring(10, 13);
        System.out.println(d);
        
        // 문자열 추출 : substring()
        // "A barking dog"에서 마지막 g 빼고 "A barking do" 를 출력하시오.
        String bar1 = prov.substring(0, 12);
        System.out.println(bar1);
        String str = prov.substring(0, prov.length() - 1);
        System.out.println(str);
        
        // 한개 문자 추출
        // substring() --> 문자열 반환:
        // charAt() --> 문자 한개 반환:
        // 첫번째 b 를 추출하시오. substring 이용 문자열
        str = prov.substring(2, 3);
        System.out.println(str);
        
        // 첫번째 b 를 추출하시오. charAt 이용 '문자'
        char b = prov.charAt(2);
        System.out.println(b);
        
        // 문자열 결합 : +
        // "A barking Dog never Bites!"를 출력하시오.
        String s1 = " never Bites!";
        String s2 = prov + s1;
        System.out.println(s2);
        
        // 빈 문자열 확인 : StringUtils.isEmpty()
        String s3 = "";
        boolean empty = s3.isEmpty();
        System.out.println(empty);
        
        s3 = "a";
        empty = s3.isEmpty();
        System.out.println(empty);
        
        // 문자열 포함 여부 확인: contains()
        boolean contains = prov.contains("Dog");
        System.out.println(contains);
        
        // 문자열 치환 : replace()
        // Dog --> Cat 으로 바꾸시오
        String s6 = prov.replace("Dog", "Cat");
        System.out.println(s6);
        
        if (prov.contains("Dog")) {
            
            String s7 = prov.replace("Dog", "Cat");
            System.out.println(s7);
        } else {
            System.out.println(prov);
        }
        
        // 문자열 치환 : replaceAll(). 정규표현식을 사용한 패턴 치환
        // 정규 표현식: ^ --> 시작
        // $ --> 끝
        // []
        
        // 문자열 자르기: split()은 배열로 돌려준다.
        // 지정한 문자로 문자열을 나눈다.(배열로 반환)
        // 문자열 prov 를 공백을 기준으로 자르고 결과를 출력하시오.
        String[] arr = prov.split(" ");
        for(int  i = 0; i  <= arr.length -1; i=i+1){
            System.out.println(arr[i] + ",");
        }
        
        
        // 문자열 비교 : equal()
        String s9 = "abcde";
        String s10 = "abcde";
        
        if(s9.equals(s10)){
            System.out.println("same");
            
        }else{
            System.out.println("s");
        }if( s9 == s10){
            System.out.println("same");
        }else{
            
        }
        
        
        // String.format() 사용법
        // %s : 문자열
        // %d : 정수
        // %f : 부동소수점
        // %c : 문자한개
        // %tc: 날짜와 시간 전부 표시
        // %tr: 시간만 표시할때
        // %A %B %C 요일,월,일 표시
        
        // 날짜 출력 포맷 지정 하기: SimpleDateFormat 클래스 사용
        
    }
    
}

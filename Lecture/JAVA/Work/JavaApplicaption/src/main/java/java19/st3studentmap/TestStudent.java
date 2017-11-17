package java19.st3studentmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TestStudent {
    public static void main(String[] args) {
        
        //HashMap 인스턴스 생성
        Map<String, Student> map =  new HashMap<String, Student>();        
        //map 추가
        
        //key -->       (d이름 학번 )
        map.put("170101",new Student(170101,"구준표"));
        map.put("170102",new Student(170102,"금잔디"));
        map.put("170103",new Student(170103,"윤지후"));
        
        // entrySet, foreach map 에 항목출력
        
  System.out.println("foreach문으로 map 출력 ");
  
        print(map);
        
        
        //학번 170102 삭제
        
        map.remove("170102");
        // 윤지후 이름이 윤후로 개명
        
        Integer key = 0;
        for (Student s : map.values()) {
            if(s.getName().equals("윤지후")){
                key = s.getNumber();
                break;
            }
                
        }
      map.put(String.valueOf(key) , new Student(170103, "윤후"));
       
      print(map);
    }

    public static void print(Map<String, Student> map) {
        
        System.out.println("학생목록출력 >> ");
        
        for (Map.Entry<String, Student> e : map.entrySet()) {    
            int no = e.getValue().getNumber();
            
            String name = e.getValue().getName();
            
            System.out.format("학번 : %10d, 이름 :%5", no, name);
            
        }
        System.out.println();
    }
}

public class _03_stringcompare {
    public static void main(String[] args) {
        //문자열 비고
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); //문자열 내용이 같으면 true, 다르면 false
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        
        //문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234"; 
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false

        /*new String으로 만들면 내용이 같아도 서로 다른 참조를 한다고 할 수 있음. */
        /*내용이 동일한지 비교하고 싶으면 equals를 사용해야함. */




    }
    
}

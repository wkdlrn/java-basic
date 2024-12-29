package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; //NullPoiterException 예외 발생
        System.out.println("data = " + data.value);
        // data 참조형 변수에 null 값이 들어 있어서.
    }

}

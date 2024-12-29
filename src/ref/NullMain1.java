package ref;

public class NullMain1 { //Null은 참조형 값에만 사용할 수 있다.
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null; // null을 다시 넣어버리면서 더이상 data인스턴스 아무도 참조하지 않아서
        //참조 값을 다시 구할 방법이 없다. => 해당 인스턴스에 접근할 방법이 없다.
        //JVM에서 자동으로 메모리에서 제거해줌.
        System.out.println("3. data = " + data);

    }
}

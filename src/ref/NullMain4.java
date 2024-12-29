package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //참조할 것을 줌.
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException => null값에 .을 찍었다고 생각하면 문제를 쉽게 생각할 수 있다.
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}

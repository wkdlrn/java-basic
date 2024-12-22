package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전: dataA.value = " + dataA.value);
        changePrimitive(dataA);
        // 메서드를 호출할 때 매개변수 dataX에 변수 dataA의 값을 전달한다.
        // => int dataX = dataA라고 해석할 수 있다.
        // 자바에서 변수에 값을 대입하는 것은 항상 값을 복사해서 대입한다.
        // 변수 dataA는 참조값 x001 가지고 있으므로 참조값을 복사해서 전달했다.
        // 따라서 변수 dataA, dataX 둘다 같은 참조값인 x001을 가지게 된다.
        // 이제 dataX를 통해서도 x001에 있는 Data 인스턴스에 접근할 수 있다.
        System.out.println("메서드 호출 후: dataA.value = " + dataA.value);
    }

    static void changePrimitive(Data dataX) {
        dataX.value = 20;
    }
}

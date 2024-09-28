package generic.ex1;

public class BoxMain1 {

    // 구체클래스, 코드 재사용성이 낮음, 대신 타입 안정성은 높음
    public static void main(String[] args) {
        System.out.println("구체 클래스 사용, 코드 재사용성이 낮음, 대신 타입 안정성은 높음");

        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10);
        Integer integer = integerBox.getValue();
        System.out.println(integer);

        StringBox stringBox = new StringBox();
        stringBox.setValue("hello");
        String string = stringBox.getValue();
        System.out.println(string);

        // Object를 이용한 다형성, 코드 재사용성은 증가하지만 다운 캐스팅 해야하므로 타입 안정성이 떨어짐
        System.out.println("Object를 이용한 다형성, 코드 재사용성은 증가하지만 다운 캐스팅 해야하므로 타입 안정성이 떨어짐");
        ObjectBox objectBox1 = new ObjectBox();
        objectBox1.setValue(10);
        Integer integer1 = (Integer) objectBox1.getValue();
        System.out.println(integer1);

        ObjectBox objectBox2 = new ObjectBox();
        objectBox2.setValue("hello");
        String string1 = (String) objectBox2.getValue();
        System.out.println(string1);

        // generic을 이용하면 코드 재사용성, 타입 안정성 두마리 토끼를 잡을 수 있다.
        System.out.println("generic을 이용하면 코드 재사용성, 타입 안정성 두마리 토끼를 잡을 수 있다.");
        GenericBox<Integer> genericBox = new GenericBox<>();
        genericBox.setValue(20);
        Integer integer2 = genericBox.getValue();
        System.out.println(integer2);

        GenericBox<String> genericBox1 = new GenericBox<>();
        genericBox1.setValue("hello generic");
        String string2 = genericBox1.getValue();
        System.out.println(string2);


    }
}

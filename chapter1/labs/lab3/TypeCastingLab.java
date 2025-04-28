package chapter1.labs.lab3;

/**
 * Lab 3: 자바 타입 변환(Type Casting) 실습
 * 
 * 이 실습은 자바의 타입 변환에 대해 이해하고 실습하는 것을 목표로 합니다.
 */
public class TypeCastingLab {
    public static void main(String[] args) {
        // TODO: 1. 자동 형변환(Implicit Casting) 예제
        // byte -> int, int -> long, long -> float, float -> double 순으로 
        // 변수를 선언하고 자동 형변환을 수행한 뒤 결과 출력하기
        byte b = 127;
        int i = b;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(b);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        
        // TODO: 2. 명시적 형변환(Explicit Casting) 예제
        // double -> float -> long -> int -> char -> short -> byte 순으로
        // 변수를 선언하고 명시적 형변환을 수행한 뒤 결과 출력하기
        double d1 = 3.14;
        float f1 = (float) d1;
        long l1 = (long) f1;
        int i1 = (int) l1;
        char c1 = (char) i1;
        short s1 = (short) c1;
        byte b1 = (byte) s1;

        System.out.println(d1);
        System.out.println(f1);
        System.out.println(l1);
        System.out.println(i1);
        System.out.println(c1);
        System.out.println(s1);
        System.out.println(b1);
        
        
        // TODO: 3. 데이터 손실 확인하기
        // int 값을 byte로 변환하여 데이터 손실이 발생하는 예제 작성하기
        int i2 = 128;
        byte b2 = (byte) i2;
        System.out.println(b2);
        
        
        // TODO: 4. 문자열과 숫자 간 변환하기
        // 문자열 "123"을 정수로, "3.14"를 실수로 변환하기
        String st = "123";
        int i3 = Integer.parseInt(st);

        String st1 = "3.14";
        double d3 = Double.parseDouble(st1);

        System.out.printf("i3 = %d, d3 = %.2f\n", i3, d3);

        
        // TODO: 5. 숫자를 문자열로 변환하기
        // 정수 456과 실수 7.89를 문자열로 변환하기
        int i4 = 456;
        String st2 = String.valueOf(i4);

        double d4 = 7.89;
        String st3 = String.valueOf(d4);

        System.out.printf("id = %d, d4 = %.2f\n", i4, d4);

    }
} 
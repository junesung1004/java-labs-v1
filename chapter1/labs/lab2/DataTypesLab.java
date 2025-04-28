package chapter1.labs.lab2;

/**
 * Lab 2: 자바 데이터 타입 실습
 * 
 * 이 실습은 자바의 기본 데이터 타입을 이해하고 사용하는 것을 목표로 합니다.
 */
public class DataTypesLab {
    public static void main(String[] args) {
        // TODO: 다음 기본 데이터 타입의 변수를 선언하고 값을 할당하세요.
        // 1. 정수형(byte, short, int, long) 변수 선언 및 할당
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 32768;
        long num4 = 9223372036854775807L;
        
        // TODO: 2. 실수형(float, double) 변수 선언 및 할당
        float num5 = 3.14159265f;
        double num6 = 3.14159265;
        
        
        // TODO: 3. 문자형(char) 변수 선언 및 할당
        char ch1 = 'A';
        
        
        // TODO: 4. 논리형(boolean) 변수 선언 및 할당
        boolean bool1 = true;
        boolean bool2 = false;
        
        
        // TODO: 5. 모든 변수 값을 출력하세요.
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(ch1);
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5 + " " + num6 + " " + ch1 + " " + bool1 + " " + bool2);




        // TODO: 6. 자신의 키(cm)와 몸무게(kg)를 저장하는 변수를 선언하고 
        // BMI 지수를 계산하여 출력하세요. (BMI = 몸무게(kg) / (키(m) * 키(m)))

        float bmi;

        int weight = 66;
        float height = 176.2f;

        height = height / 100;
        bmi = weight / (height  * height);
        System.out.println(bmi);

        
    }
} 
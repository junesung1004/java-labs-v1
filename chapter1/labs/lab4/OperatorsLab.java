package chapter1.labs.lab4;

/**
 * Lab 4: 자바 연산자 실습
 * 
 * 이 실습은 자바의 다양한 연산자를 이해하고 활용하는 것을 목표로 합니다.
 */
public class OperatorsLab {
    public static void main(String[] args) {
        // TODO: 1. 산술 연산자 사용하기
        // 두 개의 정수형 변수를 선언하고 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산을 수행하세요.
        int num1 = 10;
        int num2 = 20;

        int result1 = num1 + num2;
        int result2 = num1 - num2;
        int result3 = num1 * num2;
        int result4 = num1 / num2;
        int result5 = num1 % num2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        
        // TODO: 2. 증감 연산자 사용하기
        // 변수를 선언하고 전위 증가, 후위 증가, 전위 감소, 후위 감소 연산을 수행하세요.
        // 각 단계별로 변수의 값을 출력하여 변화를 확인하세요.
        System.out.println();


        int num10 = 10;
        System.out.println(num10);

        int num11 = ++num10;
        System.out.println(num11);

        int num12 = num11++;
        System.out.println(num12);

        int num13 = --num12;
        System.out.println(num13);

        int num14 = num13--;
        System.out.println(num14);
        
        
        // TODO: 3. 비교 연산자 사용하기
        // 두 변수를 비교하여 결과를 출력하세요 (==, !=, >, <, >=, <=).

        System.out.println();
        int a = 10;
        int b = 20;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b); // false
        System.out.println(a < b); // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        
        
        // TODO: 4. 논리 연산자 사용하기
        // boolean 변수를 사용하여 AND(&&), OR(||), NOT(!) 연산을 수행하세요.
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 && b2);
        System.out.println(b1 || b2);
        System.out.println(!b1);
        System.out.println(!b2);
        
        
        // TODO: 5. 대입 연산자 사용하기
        // 변수를 선언하고 복합 대입 연산자(+=, -=, *=, /=, %=)를 사용하여 값을 변경하세요.
        System.out.println();

        int number = 10;
        int number1 = 20;
        number1 += number;
        System.out.println(number1); // 30

        number1 -= number;
        System.out.println(number1); // 20

        number1 *= number;
        System.out.println(number1); // 200

        number1 /= number;
        System.out.println(number1); // 20

        number1 %= number;
        System.out.println(number1); // 0

        
        // TODO: 6. 삼항 연산자 사용하기
        // 조건에 따라 다른 값을 할당하는 예제를 작성하세요.
        System.out.println();
        int age = 15;
        int age1 = 20;

        int result = (age >= 19) ? age1 : age;
        System.out.println(result);

        int age2 = 20;
        String result10 = (age2 >= 19) ? "성인" : "학생";
        System.out.println(result10);
    }
} 
package package2;

import package1.Lion;

public class Step3 {
    public static void main(String[] args) {
        Lion lion = new Lion("김멋사", "컴퓨터공학과", 14);

        System.out.println("🦁 아기사자 객체를 생성합니다.");
        System.out.println("🦁 아기사자 정보를 출력합니다.");
        lion.printInfo();

        System.out.println();
        System.out.println("📌 Step 3-1. public 필드 접근을 시도합니다.");

        lion.name = "홍길동";
        System.out.println("✅ name 필드 값을 변경합니다.");
        System.out.println("✅ public 필드 접근 성공");

        System.out.println("🦁 아기사자 정보를 출력합니다.");
        lion.printInfo();

        /*
        System.out.println();
        System.out.println("📌 Step 3-2. default 필드 접근을 시도합니다.");

        lion.major = "소프트웨어응용학과";
        // 오류 발생:
        // major is not public in package1.Lion; cannot be accessed from outside package
        */

        /*
        System.out.println();
        System.out.println("📌 Step 3-3. private 필드 접근을 시도합니다.");

        lion.generation = 15;
        // 오류 발생:
        // generation has private access in package1.Lion
        */
    }
}
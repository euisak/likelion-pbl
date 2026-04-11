import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int likelionNum;
        do{
            System.out.println("저장할 아기사자 수를 5이상 입력해주세요. >>");
            likelionNum = sc.nextInt();
            sc.nextLine();
            if (likelionNum <5 ){
                System.out.println("[오류] 5 이상을 입력해주세요.");
            }
        } while (likelionNum < 5);

        System.out.println("아기사자 이름을 입력해주세요. >>");
        for (int i = 0; i < likelionNum; i++) {
            String name = sc.nextLine();
            list.add(name);
        }

        System.out.println("아기사자 명단을 최종적으로 출력합니다.");
        for (int i=0; i<list.size(); i++){
            System.out.println((i+1) +". " + list.get(i));
        }

        sc.close();

    }
}
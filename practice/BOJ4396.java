import java.util.Scanner;
import java.io.*;

public class BOJ4396 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int size = 0;
        size = scanner.nextInt();

        String[] landmine_temp = new String[size];
        String[] open_temp = new String[size];
        for (int i = 0; i < size; i++) {
            landmine_temp[i] = scanner.nextLine();
        }
        for (int i = 0; i < size; i++) {
            open_temp[i] = scanner.nextLine();
        }

        String[][] landmine = new String[size][size]; // 지뢰찾기 판
        char[][] open = new char[size][size]; // 입력한 정답

        for (int i = 0; i < size; i++) {
            String temp = landmine_temp[i];
            for (int j = 0; j < size; j++) {
                System.out.println("현재 지뢰는?:" + landmine[i][j] + "i=" + i + "j=" + j);
            }
        }
        System.out.println("지뢰 입력");
        // 스트링으로 받자니 문자 구분이 안돼서 split 쓰려그러면 split""는 사용하지 못한다고 하고..
        // char로 받자니 자바에는 따로 자바를 입력하는 함수가 없다그래서 charAt쓰려그러면 반복문을 어떻게 돌려야될지모르겠고...

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                open[i][j] = scanner.next().charAt(j);
            }
        }
        System.out.println("정답 입력");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(landmine[i][j]);
            }
        }

        System.out.println("지뢰 출력");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(open[i][j]);
            }
        }

        System.out.println("정답 출력");
        scanner.close();
    }
}

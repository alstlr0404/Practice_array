import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Array_Practice {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력할 Int : ");
        int row = Integer.parseInt(reader.readLine());

        String aaa = Integer.toString(row);

        //Array_Practice
        String [] classGroup = {"0","1","2","3","4","5"};

        if(classGroup[0].equals(aaa)){
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("원하는 중간 행 입력: ");
            int row1 = Integer.parseInt(reader1.readLine());

            //상단-중간
            for (int i=0; i<row1; i++) {
                for (int j=1; j<row1-i; j++) {
                    System.out.print(" ");
                }
                for (int j=0; j<i*2+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            //하단(상단 뒤집기)
            for (int i=row1-1; i>0; i--) {
                for (int j=row1-i; j>0; j--) {
                    System.out.print(" ");
                }
                for (int j=i*2-1; j>0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }else {
            BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("원하는 숫자 입력: ");
            int row3 = Integer.parseInt(reader3.readLine());

            String bbb = Integer.toString(row3);

            System.out.println("입력된 숫자 : " + bbb);
        }

    }
}
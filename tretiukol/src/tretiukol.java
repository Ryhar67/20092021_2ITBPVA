import java.util.ArrayList;
import java.util.Scanner;

public class tretiukol { public static void main(String[] args) {
    ArrayList<Integer> cisla = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);
    int b = 0;
    boolean bool = true;
    System.out.println("napiš kolik chceš");
    int pole = scanner.nextInt();
    int o=0;

    while(bool){
        if (pole > o){
            int o++;
            System.out.println("NAPIŠ:");
            cisla.add(scanner.nextInt());
        } else {
            bool=false;
        }
    }
    for (int i = 0; i < pole; i++){
        b += (int)cisla.get(i);
    }
    System.out.println(""+b);
}


}
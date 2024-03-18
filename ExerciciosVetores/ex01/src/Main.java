import java.util.Scanner;
import java.util.Locale;

public static void main(String[] args){

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int n = sc.nextInt();

    int[] vect = new int[n];

    sc.close();
}
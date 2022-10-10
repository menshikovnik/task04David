import java.util.Scanner;

public class Main {

    static int ReadNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        return scanner.nextInt();
    }

    static int functionForCountNumbers(){
        int n = ReadNumber();
        int min;
        int count = 0;
        while (n > 0){
            min = n % 10;
            n /= 10;
            count += 1;

        }
        return count;
    }

    static void f1(){
        int n = ReadNumber();
        int count = functionForCountNumbers();
        for(int i = 0; i < count; i++ ){
            n /= 10;
        }
    }

    public static void main(String[] args){
        functionForCountNumbers();
    }

}

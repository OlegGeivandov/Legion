import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        long countSolders = inputData();
        System.out.println(calculation(countSolders));
    }

    private static long calculation(long rank){
        if (rank < 3) return 0;
        if (rank == 3) return 1;

        long rank1 = rank/2;
        long rank2 = rank - rank1;;

        long size1 = calculation(rank1);
        long size2 = calculation(rank2);

        return size1 + size2;
    }

    private static long inputData() {
        System.out.println("Введите целое цело число от 0 до 1.0Е18");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
import java.io.*;
import java.util.*;

public class Selde {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();

        if(Selde(kata))
            System.out.println(kata + " adalah selde. ");
        else
            System.out.println(kata + " bukan selde. ");
    }

    public static boolean Selde(String word) {
        int kiri = 0;
        int kanan = word.length() - 1;

        while (kiri < kanan) {
            if (word.charAt(kiri) != word.charAt(kanan)) {
                return false;
            }
            kiri++;
            kanan--;
        }

        return true;
    }
}

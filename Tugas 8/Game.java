// Nama : Nadia Raisa Khairani
// NIM : 215150700111008
// Praktikum Pemlan TI A

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat Datang di game Defend FILKOM!");
        System.out.print("Silahkan masukkan nama player: ");
        String name = scanner.nextLine();

        Character player;
        Character enemy = new Titan();

        loop: while (true) {
            System.out.println("Silahkan pilih karakter yang anda inginkan: ");
            System.out.println("1. Magician");
            System.out.println("2. Healer");
            System.out.println("3. Warrior");

            try {
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        player = new Magician();
                        break loop;
                    case 2:
                        player = new Healer();
                        break loop;
                    case 3:
                        player = new Warrior();
                        break loop;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                        continue loop;
                }

            } catch (InputMismatchException error) {
                System.out.println("Tolong masukkan angka!");
                scanner.nextLine();
            }
        }

        System.out.println("Selamat datang, " + name + "!");
        player.infoCharacter();

        int turn = 1;
        while (enemy.getHP() > 0 && player.getHP() > 0) {
            System.out.println("================ TURN " + turn + " ================");

            if (player.dealDamage())
                enemy.recieveDamage(player.getAttack());

            if (enemy.dealDamage())
                player.recieveDamage(enemy.getAttack());

            if (player instanceof Healer && turn % 2 == 0) {
                ((Healer) player).healCharacter();
                System.out.println("Menggunakan Skill Heal.");
            }

            System.out.println("Enemy's HP\t: " + enemy.getHP());
            System.out.println(name + "'s HP\t: " + player.getHP());

            turn++;
        }
        System.out.println("========================================");

        if (player.getHP() > 0)
            System.out.println(name + " menang");
        else
            System.out.println("Enemy menang");

        System.out.println();
        System.out.println("================ PLAYER ================");
        player.infoCharacter();
        System.out.println("================ MUSUH ================");
        enemy.infoCharacter();

        scanner.close();
    }

}

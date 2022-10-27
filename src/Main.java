import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MagicBox<String> rainbow = new MagicBox<>("Color", 4);
        while (true) {
            System.out.println("Введи цвета: " + rainbow.getBoxSize() + " шт. для магической коробки rainbow или end: ");
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            rainbow.add(input);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(rainbow.pick());
        }

        MagicBox<Integer> cube = new MagicBox<>("Cube", 3);
        while (true) {
            System.out.println("Введи числа: " + cube.getBoxSize() + " шт. для магической коробки Cube или end: ");
            String input = sc.nextLine();
            if (input.equals("end")) {
                break;
            }
            Integer number = Integer.parseInt(input);
            cube.add(number);
        }

        System.out.println(cube.pick());

    }
}
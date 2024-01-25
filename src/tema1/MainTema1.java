package tema1;

import java.util.Scanner;

public class MainTema1 {

    // Tema a.1

    public static void main(String[] args) {
        System.out.println("Imi place Java!");


        // Tema a.2

        System.out.println("Cursul aceste este foarte fain!");
        System.out.println("Cursul aceste este foarte fain!");
        System.out.println("Cursul aceste este foarte fain!");
        System.out.println("Cursul aceste este foarte fain!");
        System.out.println("Cursul aceste este foarte fain!");
        System.out.println("Cursul aceste este foarte fain!");


        // Tema a.3

        int varsta_ana = 24;
        int varsta_david = varsta_ana - 6;
        System.out.println("Varsta lui David este " + varsta_david);


        // Tema a.4

        Scanner nou = new Scanner(System.in);
        System.out.println("Spune-ne ceva despre tine");
        String propozitie = nou.nextLine();
        System.out.println("R: " + propozitie);


        // Tema a.5

        Scanner cititor = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int numberr1 = cititor.nextInt();
        System.out.println("Introduceti al doilea numar:");
        double numberr2 = cititor.nextDouble();
        cititor.close();
        boolean c = true;
        System.out.println("Numarul " + numberr1);
        System.out.println("este mai mare decat");
        System.out.println("numarul " + numberr2);
        System.out.print(numberr1 > numberr2);


        // Tema a.6

        Scanner object = new Scanner(System.in);
        System.out.println("Primul numar este : ");
        int number1 = object.nextInt();

        Scanner object2 = new Scanner(System.in);
        System.out.println("Al doilea numar este : ");
        int number2 = object.nextInt();

        System.out.println("Primul numar : " + number1);
        System.out.println("Al doilea numar : " + number2);


        // Tema a.7

        Scanner calcule = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        double numar = calcule.nextDouble();

        System.out.println("rezultatul sumei cu 5 este " + (numar + 5));
        System.out.println("rezultatul scaderii cu 12.3 este " + (numar - 12.3));
        System.out.println("rezultatul inmultirii cu -3.2 este " + (numar * -3.2));
        System.out.println("rezultatul imparirii cu 4 este " + (numar / 4));
        System.out.println("rezultatul modulului cu 6 este " + (numar % 6));


        // Tema a.8


        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);


    }
}


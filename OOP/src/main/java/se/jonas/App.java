package se.jonas;

import java.util.ArrayList;

//hejsan
public final class App {

        public static void main(String[] args) {
        /* Point labb1 = new Point(300, 200);

        System.out.println(labb1.getxPosition() + "\n" + labb1.getyPosition()); */
/* 
        Rectangle labb2 = new Rectangle(10, 20);

        System.out.println("Areaan av rektngeln är " + labb2.calculateArea()); */

        /* Circle labb3 = new Circle(15.0);

        System.out.println("Arean av circeln är " + labb3.calculateArea()); */

        /* Person labb4 = new Person("Jonas", 24);

        System.out.println(labb4.getRovarAndÅlder()); */

        ArrayList<String> meny = new ArrayList<String>();

        String namn = "";
        String pris = "";
        String typ = "";
        String kcal = "";

        for(int i = 0; i < 2; i++){
        System.out.println("Namn på maträtt: ");
        namn = System.console().readLine();
        System.out.println("Pris på maträtt: ");
        pris = (System.console().readLine());
        System.out.println("Typ av maträtt(Vegitarisk, Vegansk, Kött): ");
        typ = System.console().readLine();
        System.out.println("Antal kalorier: ");
        kcal = (System.console().readLine());

        Matratt labb5 = new Matratt(namn, pris, typ, kcal);

        meny.add(labb5.getMatratt());
        }

        System.out.println("----MENY----");

        for (int i = 0; i < meny.size(); i++){
                System.out.println(meny.get(i));
        }
    }
}

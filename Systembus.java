package systembus;

import java.util.Scanner;

public class Systembus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        booking ticket1 = new booking("ali", "ali@gmail.com", 35, "al haram,st", 1242, 30, 100, "giza", "alex");
        booking ticket2 = new booking("mohamed", "mohamed@gmail.com", 45, "al tahrir square",1243, 40, 200, "cairo", "sharm el sheikh");
        System.out.println("Welcome to our Systembus appication\n");
        System.out.println("Enter 0 to continues in this application");
        int z = sc.nextInt();

        if (z == 0) {
            int g = 1;

            while (g != 0) {
                System.out.println("\n\n\t\t\t\t===================================================");
                System.out.println("\t\t\t\t\t\tBus Ticketing System\n");
                System.out.println("\t\t\t\t===================================================");
                System.out.println("\t\t\t\t\t 1 => details about bus\n\t\t\t\t\t 2 => details about captain \n\t\t\t\t\t 3 => Book Tickets\n\t\t\t\t\t 4 => Exit");
                System.out.println("\n\t\t\t\t\t Enter your choice: ");

                int x = sc.nextInt();

                if (x == 1) {
                    System.out.print(ticket1.tostring(null));
                    System.out.print("\n" + ticket2.tostring(null));
                    System.out.print("\n enter any number to continue ...");
                    int q = sc.nextInt();
                }
                if (x == 2) {
                    System.out.print("\n captainname: " + ticket1.getusername() + "\n" + " captainemail: " + ticket1.getuseremail() + "\n" + " captain age: " + ticket1.getage()+"\n"+ " phone no:01118124411"+ "\n" + " plate bus number : " + ticket1.getnumberofbus() + "\n"  + " captain adress: " + ticket1.getadress());
                    System.out.print("\n" + "\n captainrname: " +ticket2.getusername() + "\n" + " captainemail: " + ticket2.getuseremail() + "\n" +" captain age: " +ticket2.getage()+"\n"+" phone no:01543127231"+ "\n" + " plate bus number : " + ticket2.getnumberofbus() + "\n" + " captain adress: " + ticket2.getadress());
                    System.out.print("\n enter any number to continue ...");
                    int w = sc.nextInt();
                }
                if (x == 3) {
                    System.out.println("enter plate bus number");
                    System.out.println("( " + ticket1.getnumberofbus() + " - " + ticket2.getnumberofbus() + " )");
                    int o = sc.nextInt();
                    if (o == ticket1.numberofbus) {
                        System.out.println("\ndate and time of ticket\t" + ticket1.get_date_and_time());

                        ticket1.add_ticket();

                        System.out.println("boarding pass:" + ticket1.boardingpass());

                        System.out.println("enter your name ");
                        String s = sc.next();

                        System.out.println("please enter numbers of seats do you want to book");
                        ticket1.numberofseat = sc.nextInt();
                        while (ticket1.seatofbus - ticket1.numberofseat < 0) {
                            System.out.printf("Please enter a number between 1 and %d", ticket1.seatofbus);
                            ticket1.numberofseat = sc.nextInt();}
                        ticket1.totalnumofseat(ticket1.numberofseat);
                        System.out.println(" price of boarding pass is ");
                        System.out.println(ticket1.price * ticket1.numberofseat);
                        System.out.print("\n enter any number to continue ...");
                        int l = sc.nextInt();
                    }

                    if (o == ticket2.numberofbus) {
                        System.out.println("\ndate and time of ticket\t" + ticket2.get_date_and_time());

                        ticket2.add_ticket();

                        System.out.println("boarding pass:" + ticket2.boardingpass());

                        System.out.println("enter your name ");
                        String s = sc.next();

                        System.out.println("please enter numbers of seats do you want to book");
                        ticket2.numberofseat = sc.nextInt();
                        while (ticket2.seatofbus - ticket2.numberofseat < 0) {
                            System.out.printf("Please enter a number between 1 and %d", ticket2.seatofbus);
                            ticket2.numberofseat = sc.nextInt();
                        }
                        ticket2.totalnumofseat(ticket2.numberofseat);
                        System.out.println(" price of boarding pass is ");
                        System.out.println(ticket2.price * ticket2.numberofseat);
                        System.out.print("\n enter any number to continue ...");
                        int r = sc.nextInt();
                    }

                }
                if (x == 4) {
                    g = 0;
                }
            }
        } else {
            System.out.println("you have clicked wrong button  ");
        }

    }
}

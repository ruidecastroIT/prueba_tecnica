/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba_tecnica;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Rui
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    private static Timer timer;
    private static Boolean timerActive = false, timerRegister = false;
    private static int registrar;
    private static String optionMsg = "Select new option before the door is closed";

    static class RemindTask extends TimerTask {

        public void run() {
            System.out.println("Door closed!\n"+"Select new option: ");
            timer.cancel(); //Terminate the timer thread
            timerActive = false;
        }
    }

    public static void main(String args[]) {
        menu();
    }

    private static int Registrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the timer time: ");
        int registro;
        //timerActive = true;
        timerRegister = true;
        return registro = sc.nextInt();
    }

    private static void Unblock(int seconds) {
        if (timerRegister == false) {
            System.out.println("you can't unblock the door. The timer isn't initialized");
        } else {
            timer = new Timer();
            timer.schedule(new RemindTask(), seconds * 1000);
            timerActive = true;
            System.out.println("Door Opened. Now you can enter");
        }
    }

    private static void Block() {
        if (timerActive == false) {
            System.out.println("the door is actually closed. You can't close");
        } else {
            System.out.println("Door closed!");
            timer.cancel(); //Terminate the timer thread
            timerActive = false;
        }
    }

    private static void Enter() {
        if (timerActive == true) {
            System.out.println("You entered");
        } else {
            System.out.println("You can't enter, the door is closed");
        }
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("menu options: \n" + "1. Register Timer\n" + "2. Unlbock door\n" + "3. Enter door\n" + "4. Close door\n" + "5. Exit\n" + "enter the menu option: ");
        int option = sc.nextInt();
        while (option != 5) {
            switch (option) {
                case 1:
                    registrar = Registrar();
                    System.out.println(optionMsg);
                    option = sc.nextInt();
                    break;
                case 2:
                    Unblock(registrar);                   
                    System.out.println(optionMsg);
                    option = sc.nextInt();
                    break;
                case 3:
                    Enter();
                    System.out.println(optionMsg);
                    option = sc.nextInt();
                    break;
                case 4:
                    Block();
                    System.out.println(optionMsg);
                    option = sc.nextInt();
                    break;
                case 5:
                    option = 5;
                    break;
                default:
                    System.out.println("Enter valid number");
                    option = sc.nextInt();
                    break;

            }
        }
    }
}

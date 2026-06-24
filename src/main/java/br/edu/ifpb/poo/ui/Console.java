package br.edu.ifpb.poo.ui;
import java.util.Scanner;


public class Console {
    private Scanner in;

    public Console() {
        this.in = new Scanner(System.in);
    }

    public void println(String s) {
        System.out.println(s);
    }

    public void print(String s) {
        System.out.print(s);
    }

     public String nextLine() {
        return in.nextLine();
    }


    public void clrscr() {
        System.out.print("\u001B[2J\u001B[H");
        System.out.flush();
    }


    public void showCursor() {
        System.out.print(Cores.SHOW_CURSOR);
    }

    public void clearCursor() {
        System.out.print(Cores.CLEAR_CURSOR);
    }


}
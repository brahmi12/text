package com.brahmi;
import java.util.Scanner;

public class Main {
            Scanner in = new Scanner(System.in);
            public static void main(String[] args) {
                Main play = new Main();
                play.start();
            }
            public void start(){
                System.out.println("welcome to text adventure");
                System.out.println("Enter your name");
                String name=in.nextLine();
                System.out.println("your name is " + name);
                System.out.println("you are in the living room,Let's start treasure hunt");
                livingRoom();
            }
            public void livingRoom() {
                System.out.println("Do you want to take left or right(right/left),if you go right you will get stairs and if you take left you will go to kitchen");
                String l = in.nextLine();
                while((!l.equalsIgnoreCase("right"))&&(!l.equalsIgnoreCase("left"))){
                    System.out.println("please choose the correct word");
                    l=in.nextLine();
                }
                if (l.equalsIgnoreCase("right")) {
                    stairs();
                }
                if (l.equalsIgnoreCase("left")) {
                    kitchen();
                }
            }
            public void stairs(){
                System.out.println("Do you want to take stairs");
                System.out.println("if you want to take stairs please choose either down stairs or upstairs,down stairs will lead you to basement where as upstairs will lead to two more different directions ");
                String s=in.nextLine();
                while((!s.equalsIgnoreCase("downstairs"))&&(!s.equalsIgnoreCase("upstairs"))){
                    System.out.println("please choose the correct word");
                    s=in.nextLine();
                }
                if(s.equalsIgnoreCase("downstairs")){
                    downstairs();
                }if(s.equalsIgnoreCase("upstairs")){
                    upstairs();
                }
            }
            public void kitchen(){
                System.out.println("you just entered kitchen");
                System.out.println("Do you want to have food from the refrigerator");
                System.out.println("please choose Yes or No");
                String k= in.nextLine();
                while((!k.equalsIgnoreCase("yes"))&&(!k.equalsIgnoreCase("no"))){
                    System.out.println("please choose the correct word");
                    k=in.nextLine();
                }
                if(k.equalsIgnoreCase("yes")){
                    System.out.println("you opened  the refrigerator that contain toxics, you are dead");
                   exit();
                }
                if(k.equalsIgnoreCase("no")){
                    System.out.println("As you chose no,You will be redirected to playroom");
                   playroom();
                }
            }
            public void downstairs() {
                System.out.println("now you are at the basement");
              basement();
              }

                public void upstairs(){
                    System.out.println("you are at the upstairs");
                    System.out.println("choose north or west,where north direction will end up in basement and west will have some interesting factor");
                    String u=in.nextLine();
                    while((!u.equalsIgnoreCase("north"))&&(!u.equalsIgnoreCase("west"))){
                        System.out.println("please choose the correct word");
                        u=in.nextLine();
                    }
                    if(u.equalsIgnoreCase("north")){
                        basement();
                    }
                    if(u.equalsIgnoreCase("west")){
                        System.out.println("you are killed by a monster");
                       exit();
                    }
                }
                public void basement() {
                    System.out.println("you are at the basement");
                    System.out.println("would you like to go to backyard or storeroom,this is the last level in finding treasure");
                    String b = in.nextLine();
                    while((!b.equalsIgnoreCase("backyard"))&&(!b.equalsIgnoreCase("storeroom"))){
                        System.out.println("please choose the correct word");
                        b=in.nextLine();
                    }
                    if (b.equalsIgnoreCase("backyard")) {
                        System.out.println("you exited the house,game over.");
                        exit();
                    }
                    if (b.equalsIgnoreCase("storeroom")) {
                        System.out.println("You found the treasure!You Won!!");
                        exit();
                    }
                }
                public void playroom(){
                    System.out.println("you are in playing room");
                    String p = in.nextLine();
                    while((!p.equalsIgnoreCase("indoor"))&&(!p.equalsIgnoreCase("outdoor"))){
                        System.out.println("please choose the correct word");
                        p=in.nextLine();
                    }
                    if (p.equalsIgnoreCase("indoor")) {
                        System.out.println("as u choose indoor you got a hint to find treasure in basement");
                        basement();
                    }
                    if (p.equalsIgnoreCase("outdoor")) {
                        System.out.println("You are killed because of UV rays");
                        exit();
                    }

                }
                public void exit() {
                    System.out.println("your game has ended,Do you want to play again(Y/N)?");
                    String e = in.nextLine();
                    while((!e.equalsIgnoreCase("Y"))&&(!e.equalsIgnoreCase("N"))){
                        System.out.println("please choose the correct word");
                        e=in.nextLine();
                    }
                    if (e.equalsIgnoreCase("Y")) {
                        System.out.println("you chose to play again");
                        start();
                    }
                    if (e.equalsIgnoreCase("N")) {
                        System.out.println("Thanks for playing!");
                    }
                }

}


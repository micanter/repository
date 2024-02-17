package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      var scanner = new Scanner(System.in);   
      
      while (true) {      
        System.out.println("Яка швидкість авто?");
        var speed = scanner.nextDouble();
        System.out.println(speed + "км/год.");
        
        if (speed == 0) 
        break;
        
        System.out.println("Скільки годин тривала поїздка?");
        var time = scanner.nextDouble();
        System.out.println(time + "год.");

        var distance = speed * time;
        System.out.println("Відстань = " + distance + "км");
        }
      }
  }

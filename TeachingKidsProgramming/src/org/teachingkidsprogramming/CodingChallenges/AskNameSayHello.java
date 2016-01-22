package org.teachingkidsprogramming.CodingChallenges;

import java.util.Scanner;

public class AskNameSayHello
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("What's your name?");
    String name = input.next();
    System.out.print("Hello, " + name);
  }
}

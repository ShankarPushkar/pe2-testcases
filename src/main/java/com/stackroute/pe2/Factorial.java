package com.stackroute.pe2;

public class Factorial {
    public int factorialFinder(int fact){
      int sendBack,number=1;
      if(fact==0){
          sendBack=1;//if the fact=0 it gives the result as 1
      }
      else {
          for (int i = 1; i <=fact ; i++) {
              number = number * i;
          }
          sendBack=number;
          //if the fact number is 5 it gives the factorial of 5 result

          }return sendBack;
      }

}

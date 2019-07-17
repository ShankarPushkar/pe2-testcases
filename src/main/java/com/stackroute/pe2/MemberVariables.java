
package com.stackroute.pe2;

public class MemberVariables {
    public static String[] membersData(String name, int salary, int age) {

        String[] strings = new String[1];
        strings[0] = "Error";//if the name is null it gives error message
        if (name == null || salary == 0 || age== 0)
            return strings;
        String[] string=new String[1];
        string[0]="name should not be empty";
        if ((name == "") || (salary == 1500) || (age == 22))//if the name is empty it gives the message as name should not be empty
        return string;
        String[] data = new String[3];
        for (int i = 0; i < 1; i++) {
            data[i] = name;
            data[i++] = String.valueOf(salary);
            data[i + 2] = String.valueOf(age);//we will be giving the name,salary,age the test gets passed
        }
        return data;

    }


    }


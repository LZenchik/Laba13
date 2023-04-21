package org.example;

public class Main
{
    public static void main(String[] args)
    {
        double salary = 50.0;
        System.out.println(salary);
        salary = Tester.doubleSalary(salary);
        System.out.println(salary);
        Tester tester=new Tester(salary);
    }
}
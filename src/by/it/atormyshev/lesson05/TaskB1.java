package by.it.atormyshev.lesson05;
/*
Создайте 5 различных строк в списке ArrayList:

1. Создайте список строк.
2. Добавьте в него 5 различных строк.
3. Выведите его размер на экран.
4. Используя цикл выведите его содержимое на экран, каждое значение с новой строки.

*/


import java.util.ArrayList;

public class TaskB1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String a="Hello";
        String b="my dear";
        String c="friend";
        String d="How are you?";
        String e="Bay bay!";
            list.add(a);
            list.add(b);
            list.add(c);
            list.add(d);
            list.add(e);
        System.out.println(list.size());
        for(String x:list){
            System.out.println(x);
        }
    }
}
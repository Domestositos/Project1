package ua.kpi;

import java.util.ArrayList;
import java.util.Scanner;

public class Functional {
    public static void write(ArrayList<String> list){
        System.out.println("Список:");
        for(int i=0;i<list.size();i++) {
            System.out.printf("%d. %s\n", i + 1, list.get(i));
        }
    }

    public static ArrayList<String> add(ArrayList<String> list){
        System.out.println("Введите новую запись");
        Scanner s=new Scanner(System.in);
        list.add(s.nextLine());
        return list;
    }

    public static ArrayList<String> delete(ArrayList<String> list){
        int count;
        System.out.println("Введите индекс элемента, который хотите удалить");
        Scanner k=new Scanner(System.in);
        count=k.nextInt();
        if(count>list.size() || count<1){
            System.out.println("Данной записи нет в списке");
        }
        else{
            list.remove(count-1);
        }
        return list;
    }
}

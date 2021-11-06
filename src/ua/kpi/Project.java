package ua.kpi;

import java.util.ArrayList;
import java.util.Scanner;

import static ua.kpi.Functional.*;

public class Project {

    public static void main(String[] args) {
        menu();
    }

    static void menu(){
        boolean exit=true;
        ArrayList<String> list0=new ArrayList<>();
        ListDTO list=new ListDTO(list0);
        while(exit) {
            System.out.println();
            System.out.println("1.Показать все записи\n2.Добавить запись\n3.Удалить запись\n4.Выйти");
            Scanner k0 = new Scanner(System.in);
            int k = k0.nextInt();
            switch (k) {
                case 1:
                    write(list.getList());
                    break;
                case 2:
                    list.setList(add(list.getList()));
                    break;
                case 3:
                    list.setList(delete(list.getList()));
                    break;
                case 4:
                    exit=false;
                    break;
            }
        }
    }
}

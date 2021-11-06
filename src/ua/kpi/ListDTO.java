package ua.kpi;

import java.util.ArrayList;

public class ListDTO {
    private ArrayList<String> list=new ArrayList<>();

    public ListDTO(ArrayList<String> list) {
        this.list = list;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
}

package com.company.Iterator;

import java.util.*;

public class PancakeHouseMenu {
    ArrayList menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList();
        addItem("김치 팬케이크 세트", "김치와 에그토스트가 곁들어진 팬케이크", true, 3.49);
        addItem("레귤러 팬케이크 세트", "달걀 후라이와 소시지가 들어간 팬케이크", false, 2.99);
        addItem("블루베리 팬케이크", "신선한 블루베리 시럽으로 만든 팬케이크", true, 3.29);
        addItem("와플", "와플 취향에 따라서 시럽추가 가능.", true, 3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator(){
        return new PancakeHouseIterator(menuItems);
    }
}

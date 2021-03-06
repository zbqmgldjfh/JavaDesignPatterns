package com.company.Iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu{
    Hashtable menuItems = new Hashtable();

    public CafeMenu() {
        addItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토 가 첨가된 베지 버거", true, 3.99);
        addItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", false, 3.69);
        addItem("베리또", "통 핀토콩과 살사, 구아카몰이 첨가된 베리또", true, 4.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Iterator createIterator() {
        return menuItems.values().iterator(); // 값들에 대한 반복자를 반환
    }
}

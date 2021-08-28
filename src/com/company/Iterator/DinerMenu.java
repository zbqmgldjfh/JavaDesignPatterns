package com.company.Iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("체식주의자용 BLT", "통밀에 상추, 베이컨, 토마토", true, 2.99);
        addItem("BLT", "통밀위에 베이컨, 상추, 토마토", false, 2.99);
        addItem("오늘의 스프", "옥수수를 곁들인 스프", false, 3.29);
        addItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS){
            System.out.println("죄송합니다. 메뉴가 꽉 찼습니다.");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}

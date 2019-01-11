package design_patterns.iterator.version1;

/**
 * Created by dell on 2019/1/11.
 */
public class Test {


    public static void main(String[] args) {
        MenuManager menuManager = new MenuManager();
        menuManager.addMenu("PANCAKE HOUSE MENU","breakfast");
        menuManager.addMenu("DINER MENU","Lunch");
        menuManager.addMenu("Cafe Menu","Dinner");


        menuManager.addChildMenu("DINER MENU",new Menu("DESSERT MENU","Deaaert"));

        menuManager.addMenuItem("PANCAKE HOUSE MENU",new MenuItem("1","1",true,1.1));
        menuManager.addMenuItem("DINER MENU",new MenuItem("2","2",true,2.2));
        menuManager.addMenuItem("DESSERT MENU",new MenuItem("3","3",true,3.3));
        menuManager.addMenuItem("Cafe Menu",new MenuItem("5","5",true,5.5));

        new Waitress(menuManager.getAllMenu()).printMenu();
    }
}

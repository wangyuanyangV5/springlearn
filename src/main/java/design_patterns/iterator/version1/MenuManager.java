package design_patterns.iterator.version1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by dell on 2019/1/11.
 */
public class MenuManager {

    private Map<String,MenuComponent> allMenuMap = new ConcurrentHashMap<>();
    private Map<String,Menu> menus = new ConcurrentHashMap<>();


    public void addMenu(String name,String description){
        if(allMenuMap.get(name) != null)
            return;
        Menu menu = new Menu(name,description);
        allMenuMap.put(name,menu);
        menus.put(name,menu);
    }

    public void addMenuItem(String menuName,MenuItem menuItem){
        if(menus.get(menuName) == null)
            return;
        menus.get(menuName).add(menuItem);
    }

    public void addChildMenu(String menuName,Menu menu){
        if (menus.get(menuName) == null || menus.get(menu.getName()) != null)
            return;
        menus.put(menu.getName(),menu);
        menus.get(menuName).add(menu);
    }

    public MenuComponent getAllMenu(){
        Menu menu = new Menu("AllMenu","AllMenu");
        allMenuMap.values().forEach(menuComponent -> menu.add(menuComponent));
        return menu;
    }

}

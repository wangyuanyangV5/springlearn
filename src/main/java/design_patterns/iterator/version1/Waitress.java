package design_patterns.iterator.version1;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

/**
 * Created by dell on 2019/1/11.
 */
public class Waitress {

    private MenuComponent allMenus;

    public Waitress( MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }
}

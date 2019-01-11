package design_patterns.iterator.version1;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by dell on 2019/1/11.
 */
public class CompositeIterator implements Iterator {

    private Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else {
          Iterator iterator = (Iterator) stack.pop();
          if(!iterator.hasNext()){
              stack.pop();
              return hasNext();
          }else {
              return true;
          }
        }
    }

    @Override
    public Object next() {
        if(hasNext()){
            Iterator iterator = stack.pop();
            MenuComponent component = (MenuComponent) iterator.next();
            if(component instanceof Menu){
                stack.push(component.createIterator());
            }
            return component;
        }else {
            return null;
        }
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}

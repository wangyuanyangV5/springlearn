package design_patterns.iterator.version1;

import java.util.Iterator;

/**
 * Created by dell on 2019/1/11.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}

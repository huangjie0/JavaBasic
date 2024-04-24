package GenericInterface;

import java.util.ArrayList;

/**
 * 泛型接口
 * */

public interface Data<T extends People> {
    void add(T t);
    ArrayList<T> getByName(String name);
}

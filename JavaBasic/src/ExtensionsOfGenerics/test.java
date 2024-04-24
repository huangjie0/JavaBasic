package ExtensionsOfGenerics;

import java.util.ArrayList;

/****
 *泛型方法
 */

public class test {
    public static void main(String[] args) {
        String s = test("java");
        System.out.println(s);
        Dog d =  test(new Dog());
        System.out.println(d);

        //所有汽车一起参加比赛
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new BMW());
        cars.add(new BENG());
        go(cars);

        ArrayList<BMW> bms = new ArrayList<>();
        bms.add(new BMW());
        bms.add(new BMW());
        go(bms);

        ArrayList<BENG> bc = new ArrayList<>();
        bc.add(new BENG());
        bc.add(new BENG());
        go(bc);

//        ArrayList<Dog> dogs = new ArrayList<>();
//        dogs.add(new Dog());
//        dogs.add(new Dog());
//        go(dogs);

    }
    //泛型方法
    public static <T> T test(T t){
        return t;
    }

//    public static <T extends Car> void go(ArrayList<T> cars) {
//
//    }

    //?通配符，在使用泛型时候代表一切类型
    public static void go(ArrayList<?> cars){

    }
}

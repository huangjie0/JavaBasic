package ObjectOrientedTest;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //准备数据
        Movie[] movies = new Movie[4];

        movies[0] = new Movie(1,"三枪拍案惊奇",38.5,98,"张艺谋","成龙","无");
        movies[1] = new Movie(2,"宝贝计划",45.5,95,"张艺谋","古天乐","无");
        movies[2] = new Movie(3,"你好，李焕英",66.5,93,"张艺谋","贾玲","无");
        movies[3] = new Movie(4,"人在囧途",77.5,98,"王宝强","王宝强","好看的不行！");
        MovieControls m = new MovieControls(movies);

        Scanner sr = new Scanner(System.in);
        while (true) {
            System.out.println("+++++电影信息系统++++");
            System.out.println("1、查询全部电影信息");
            System.out.println("2、根据id查询电影信息");
            System.out.println("请输入操作命令");
            int s =  sr.nextInt();
            switch (s){
                case 1:
                    //展示全部信息
                    m.printAllMovies();
                    break;
                case 2:
                    System.out.println("请您输入查询的电影id");
                    int id = sr.nextInt();
                    m.seachMovieById(id);
                    break;
                default:
                    System.out.println("输入的命令有问题！");
            }
        }
    }

}

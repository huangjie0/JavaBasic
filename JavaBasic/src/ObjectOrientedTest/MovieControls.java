package ObjectOrientedTest;

public class MovieControls {
    private Movie[] movies;
    public MovieControls(Movie[] movies){
        this.movies = movies;
    }
    //展示全部消息
    public void printAllMovies(){
        System.out.println("-----系统全部消息如下-------");
        for (int i = 0; i < movies.length; i++) {
            Movie e = movies[i];
            System.out.println("编号" + e.getId());
            System.out.println("名称" + e.getName());
            System.out.println("价格" + e.getPrice());
            System.out.println("-------------------------");
        }
    }
    public void seachMovieById(int id){
        for (int i = 0; i < movies.length; i++) {
            Movie e = movies[i];
            if(e.getId() == id){
                System.out.println("电影详情如下：");
                System.out.println("编号" + e.getId());
                System.out.println("名称" + e.getName());
                System.out.println("价格" + e.getPrice());
                System.out.println("评分" + e.getScore());
                System.out.println("-------------------------");
                return;
            }
        }
    }
}

package Stream;
/*
 * Stream流操作集合数组的数据,相当于流水线操作数据
 * */

import SimpleSuccession.D;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"张三丰","张无忌","赵敏","张强");
//        System.out.println(list);

        //找出姓张的名字，存入到集合中去
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张") && s.length()==3){
                newList.add(s);
            }
        }
//        System.out.println(newList);

        //使用Stream流解决问题,链式调用
        List<String> l = list.stream().filter(s -> s.startsWith("张")).filter(s->s.length()==3).collect(Collectors.toList());
//        System.out.println(l);
        //获取stream流


        //List集合
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"小明","小张","小李","小兰");
        Stream<String> stream1 = names.stream();


        //Set集合
        Set<String> set = new HashSet<>();
        Collections.addAll(set,"成龙","李小龙","赵信","马德华");
        Stream<String> s = set.stream();
//       s.filter(v -> v.contains("德")).forEach(e -> System.out.println(e));


        //Map集合Stream
        Map<String,Double> map = new HashMap();
        map.put("迪丽热巴",180.2);
        map.put("德玛西亚",160.2);
        map.put("刘德华",178.2);
        Set<String> key = map.keySet();
        Stream ks = key.stream();

        Collection<Double> vs = map.values();
        Stream sv = vs.stream();

        Set<Map.Entry<String,Double>> entries = map.entrySet();
        Stream<Map.Entry<String,Double>> se = entries.stream();
//        se.filter(w -> w.getKey().contains("巴")).forEach(r-> System.out.println(r.getKey() + "---->" + r.getValue()));

        //数组的Stream流
        String[] ss = {"张消化","张明","张力","王奕斐"};
        Stream<String> stream4 = Arrays.stream(ss);
        Stream<String> stream5 = Stream.of(ss);

        //Stream流的中间方法，链式调用
        List<Double> score = new ArrayList<>();
        Collections.addAll(score,88.5,89.9,87.6,82.3,98.3);
        //需求1，找出及格的分数
//        score.stream().filter(sq -> sq>= 60).sorted().forEach(System.out::println);

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("黄杰",18,176.5);
        Student s2 = new Student("小红",20,177.5);
        Student s3 = new Student("小蓝",21,179.5);
        Student s4 = new Student("小蓝",21,179.5);
        Student s5 = new Student("小刘",28,169.5);
        Student s6 = new Student("小明",34,199.5);
        Collections.addAll(students,s1,s2,s3,s4,s5,s6);
        //需求2，找出年龄大于20岁的小于30岁的学生，按照学生年龄降序排列
//        students.stream().filter(o->o.getAge() >= 20 && o.getAge() <= 30).sorted((o1,o2)->o2.getAge()-o1.getAge()).forEach(fd-> System.out.println(fd));
        //需求3，找出身高前三的数据，并输出
//        students.stream().sorted(((o1, o2) -> Double.compare(o2.getHeight(),o1.getHeight()))).limit(3).forEach(df-> System.out.println(df));
        //需求4，找出身高倒数2名的学生
//        students.stream().sorted(((o1, o2) -> Double.compare(o2.getHeight(),o1.getHeight()))).skip(students.size()-2).forEach(System.out::println);
        //需求5，找出身高超过168的学生什么名字，去重
//        students.stream().filter(j->j.getHeight() > 168).map(Student::getName).distinct().forEach(System.out::println);
        //stream流中的合并流
        Stream<String>  sdsd = Stream.of("张三","李四");
        Stream<String>  sds = Stream.of("张三2","王五");

        Stream<String> alls = Stream.concat(sdsd,sds);
        alls.forEach(System.out::println);

        //stream的终极方法
        long size = students.stream().filter(sw -> sw.getAge() > 20).count(); //返回统计的结果
        System.out.println(size);

        Student sb = students.stream().max((o1,o2)->Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(sb);

        Student sp = students.stream().min((o1,o2)->Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(sp);

        //将stream流处理后的结果以集合/数组的方式返回,流只能收集一次
        List<Student> sr = students.stream().filter(w -> w.getHeight() > 170).collect(Collectors.toList());//collect收集，收集到List集合中去
        System.out.println(sr);

        Set<Student> st = students.stream().filter(w -> w.getHeight() > 170).collect(Collectors.toSet());//collect收集，收集到Set集合中去
        System.out.println(st);

        //需求将流收集到map集合中去,指定键值对
        Map<String,Double> ml = students.stream().filter(a->a.getHeight() > 170).distinct().collect(Collectors.toMap(a -> a.getName(), a->a.getHeight()));
        System.out.println(ml);

        //将stream流收集到数组中去
        Object[] arr = students.stream().filter(a->a.getHeight()>170).toArray();
        //收集学生类型的数组
        Student[] studentArr = students.stream().filter(a->a.getHeight()>170).toArray(len -> new Student[len]);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(studentArr));

    }
}

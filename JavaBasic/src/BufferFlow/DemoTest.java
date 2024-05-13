package BufferFlow;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DemoTest {
    public static void main(String[] args) {
        try(
            BufferedReader br = new BufferedReader(new FileReader("src/testDemo.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/ln.txt"))){
            //目标,排序重新读入新文件
//        定义一个容器来装，arrayList集合
            List<String> list = new ArrayList<>();

            String line;
            while ((line = br.readLine()) != null){
                list.add(line);
            }

            //4.对list集合进行排序
            Collections.sort(list);

            //遍历list集合依次写入到新文件中去
            for (String s : list) {
                bw.write(s);
                bw.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

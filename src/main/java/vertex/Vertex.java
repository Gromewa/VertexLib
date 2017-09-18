package vertex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by qw-user on 18.09.2017.
 */
public class Vertex {

    public void write(String text, String path) throws IOException {
        final File file = new File(path);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);
            writer.flush();
        }
    }

    public void read(String path) throws IOException {
        final File file = new File(path);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String buff;
        while ((buff = reader.readLine())!= null) {
            System.out.println("В вашем файле находится такой текст: " + " " + buff);
        }

    }

    public List<Integer> returnList(int number) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < number; i++) {
            list.add(i);
        }
        return list;
    }
}

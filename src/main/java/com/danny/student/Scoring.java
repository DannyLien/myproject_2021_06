package com.danny.student;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scoring {
    public static void main(String[] args) {
        Map<String , Student> studentMap = new HashMap<>();
//        List<Student> stulist = new ArrayList<>();
        File file = new File("student.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();

            while (line != null) {
                String[] tokens = line.split(" ");
                Student stu = new Student(tokens[0],
                        Integer.parseInt(tokens[1]),
                        Integer.parseInt(tokens[2]));
                stu.average = stu.getAverage();
                stu.grading = stu.getGrading();
                studentMap.put(stu.name, stu);
//                stulist.add(stu);
                line = br.readLine();
            }
            for (Map.Entry<String, Student> studentEntry : studentMap.entrySet()) {
                System.out.println(studentEntry.getValue());
            }
//            for (Student student : stulist) {
//                student.printAll();
//            }
//            System.out.println("get(0) : "+stulist.get(0));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

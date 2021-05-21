package cn.code.test.list;

import java.util.ArrayList;

public class MyArrayListAdd {

  public static void main(String[] args){
    ArrayList<String> demo = new ArrayList<>();
    demo.add("diego");
    demo.add("amos");
    demo.forEach(System.out::println);
  }
}

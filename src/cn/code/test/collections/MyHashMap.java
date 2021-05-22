package cn.code.test.collections;

public class MyHashMap {

  public static void main(String[] args){
    int cap = 13;
    System.out.println(cap+":"+tableSizeFor(cap));
  }

  static int tableSizeFor(int cap) {
    int n = cap - 1;
    n |= n >>> 1;
    n |= n >>> 2;
    n |= n >>> 4;
    n |= n >>> 8;
    n |= n >>> 16;
    return (n < 0) ? 1 : (n >= Integer.MAX_VALUE) ? Integer.MAX_VALUE : n + 1;
  }

}

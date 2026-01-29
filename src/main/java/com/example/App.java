package com.example;

public class App {
    public static void main(String[] args) {
        // 引数の個数を表示
        System.out.println("引数の数: " + args.length);

        // 各引数を表示
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
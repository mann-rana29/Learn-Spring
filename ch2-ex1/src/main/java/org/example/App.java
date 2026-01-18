package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
        var n = context.getBean(Integer.class);
        String str = context.getBean(String.class);

        System.out.println(str);
        System.out.println(n);

    }
}

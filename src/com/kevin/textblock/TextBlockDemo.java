package com.kevin.textblock;

public class TextBlockDemo {
    public static void main(String[] args) {
        String textBlock = """
                this is a demo text block\
                ,you can see the example as this;
                this new line %s
                """;
        System.out.println(textBlock);
    }

}

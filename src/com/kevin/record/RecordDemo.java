package com.kevin.record;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * record 类型成员属性必须在头部中声明,在类体中只能声明静态属性,其所有成员属性都是 final 非 static 的
 * 每个属性都有一个 对应的无参数返回类型为属性类型方法名称为属性名称的方法 如 name()
 * 类体可以声明成员方法和静态方法，和一般类一样。但是不能声明 abstract 或者 native 方法
 * 不能包含初始化块
 *
 * @param name
 * @param age
 */
public record RecordDemo(@A @B String name, int age) implements RecordAbs {
    private static int id;

    public static int getId() {
        return id;
    }

    public RecordDemo(int age) {
        this(null, age);
    }

    public void checkName() {
        System.out.println("check name");
    }

    @Override
    public void show() {

        System.out.println("Record");
    }


    // {
    //     System.out.println(); //编译异常
    // }


}

interface RecordAbs {
    void show();
}

@Target({ElementType.RECORD_COMPONENT, ElementType.METHOD,})
@Retention(RetentionPolicy.RUNTIME)
@interface A {
}

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface B {
}

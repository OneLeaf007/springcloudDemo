package com.mystudy.springCloud.common;



public class Dept {

    int age ;

    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    /**
     * 测试分支啦啦啦
     */
}

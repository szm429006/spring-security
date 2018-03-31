package com.example.demo.params;

public class UserParams {

    private String username;

    private int age;

    private int ageTo;

    public UserParams() {}

    public UserParams(String username, int age, int ageTo) {
        this.username = username;
        this.age = age;
        this.ageTo = ageTo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(int ageTo) {
        this.ageTo = ageTo;
    }

    @Override
    public String toString() {
        return "UserParams{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", ageTo=" + ageTo +
                '}';
    }
}

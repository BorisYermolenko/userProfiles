package model;

import java.util.Objects;

public class UserProfile implements Comparable<UserProfile> {

    private String userName;
    private String email;
    private int age;

    public UserProfile(String userName, String email, int age) {
        this.userName = userName;
        this.email = email;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 12 && age < 120) {
            this.age = age;
        }
    }

    public void editProfile(String newEmail, int newAge) {
        setEmail(newEmail);
        setAge(newAge);
    }

    public void showInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProfile that = (UserProfile) o;
        return age == that.age && Objects.equals(userName, that.userName) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, email, age);
    }

    @Override
    public int compareTo(UserProfile o) {
        return this.userName.compareTo(o.getUserName());
    }
}

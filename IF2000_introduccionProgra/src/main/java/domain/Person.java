/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author miran
 */
public class Person {
    private String name;
    private String lastname;
    private String id;
    private String phone;
    private String age;

    public Person(String name, String lastname, String id, String phone, String age) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
     
      return "Person{" + "name=" + getName() + ", lastname=" + getLastname () + ", id=" + getId () + ", phone=" + getPhone () + ", age=" + getAge() + '}';
        
    
    
    }

        Person p = new  Person("Nidia","Rivera","703150544","71411617", "20");

    
}

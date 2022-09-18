package ru.netology.delivery.data;

import lombok.AllArgsConstructor;
import lombok.Value;
@Value
@AllArgsConstructor
public class UserInfo {
    private  String city;
   private String name;
    private String phone;}

//    public UserInfo(String city, String name, String phone) {
//        this.city = city;
//        this.name = name;
//        this.phone = phone;
//    }
//
//
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//}

package ru.netology.delivery.data;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserInfo {
    private String city;
    private String name;
    private String phone;
}


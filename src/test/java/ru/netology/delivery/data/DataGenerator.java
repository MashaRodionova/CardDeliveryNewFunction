package ru.netology.delivery.data;

import com.github.javafaker.Faker;
import com.github.javafaker.service.RandomService;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import java.util.Random;

public class DataGenerator {
    private String date;



    private String dateShift;
    private String city;
   private String name;
    private String phone;

    public String getDate() {
        return date;
    }

    public String getDateShift() {
        return dateShift;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public DataGenerator(int shift1, int shift2) {
        this.date = generateDate(shift1);
        this.dateShift = generateDate(shift2);
        //this.city = generateCity();
        this.name = generateName();
        this.phone = generatePhone();
    }


    public static String generateDate(int shift) {
        // TODO: добавить логику для объявления переменной date и задания её значения, для генерации строки с датой
        // Вы можете использовать класс LocalDate и его методы для получения и форматирования даты

        String date = LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        return date;

    }

    /*public static String generateCity() {
        // TODO: добавить логику для объявления переменной city и задания её значения, генерацию можно выполнить
        // с помощью Faker, либо используя массив валидных городов и класс Random
        Faker faker = new Faker(new Locale("ru"));
        String [] cities = {"Майкоп",
                "Горно-Алтайск",
                "Уфа",
                "Улан-Удэ",
                "Махачкала",
                "Магас",
                "Нальчик",
                "Элиста",
                "Черкесск",
                "Петрозаводск",
                "Сыктывкар",
                "Симферополь",
                "Йошкар-Ола",
                "Саранск",
                "Якутск",
                "Владикавказ",
                "Казань",
                "Кызыл",
                "Ижевск",
                "Абакан",
                "Грозный",
                "Чебоксары",
                "Барнаул",
                "Чита",
                "Петропавловск-Камчатский",
                "Краснодар",
                "Красноярск",
                "Пермь",
                "Владивосток",
                    "Ставрополь",
                "Хабаровск",
                "Благовещенск",
                "Архангельск",
                "Астрахань",
                "Белгород",
                "Брянск",
                "Владимир",
                "Волгоград",
                "Вологда",
                "Воронеж",
                "Иваново",
                "Иркутск"};



        return city;
    }
*/
    public static String generateName() {
        // TODO: добавить логику для объявления переменной name и задания её значения, для генерации можно
        // использовать Faker
        Faker faker = new Faker(new Locale("ru"));
        String name = faker.name().fullName();

        return name;
    }

    public static String generatePhone() {
        // TODO: добавить логику для объявления переменной phone и задания её значения, для генерации можно
        // использовать Faker
        Faker faker = new Faker(new Locale("ru"));
        String phone = faker.phoneNumber().phoneNumber();
        return phone;
    }


        public static UserInfo generateUser(String locale) {
            // TODO: добавить логику для создания пользователя user с использованием методов generateCity(locale),
            // generateName(locale), generatePhone(locale)
            UserInfo user = new UserInfo();
            return user;
        }
    public static class UserInfo {
        String city;
        String name;
        String phone;
    }
    }




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
    private String name1;
    private String name2;
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

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public String getPhone() {
        return phone;
    }

    public DataGenerator(int shift1, int shift2) {
        this.date = generateDate(shift1);
        this.dateShift = generateDate(shift2);
        this.city = generateCity();
        this.name1 = generateName();
        this.name2 = generateName();
        this.phone = generatePhone();
    }


    public static String generateDate(int shift) {
        // TODO: добавить логику для объявления переменной date и задания её значения, для генерации строки с датой
        // Вы можете использовать класс LocalDate и его методы для получения и форматирования даты

        String date = LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));

        return date;

    }

    public static String generateCity() {
        // TODO: добавить логику для объявления переменной city и задания её значения, генерацию можно выполнить
        // с помощью Faker, либо используя массив валидных городов и класс Random
        Faker faker = new Faker(new Locale("ru"));
        String[] cities = {
                "Абакан",
                "Анадырь",
                "Архангельск",
                "Астрахань",
                "Барнаул",
                "Белгород",
                "Биробиджан",
                "Благовещенск",
                "Брянск",
                "Великий Новгород",
                "Владивосток",
                "Владикавказ",
                "Владимир",
                "Волгоград",
                "Вологда",
                "Воронеж",
                "Горно-Алтайск",
                "Грозный",
                "Екатеринбург",
                "Иваново",
                "Ижевск",
                "Иркутск",
                "Йошкар-Ола",
                "Казань",
                "Калининград",
                "Калуга",
                "Кемерово",
                "Киров",
                "Кострома",
                "Краснодар",
                "Красноярск",
                "Курган",
                "Курск",
                "Кызыл",
                "Липецк",
                "Магадан",
                "Магас",
                "Майкоп",
                "Махачкала",
                "Москва",
                "Мурманск",
                "Нальчик",
                "Нарьян-Мар",
                "Нижний Новгород",
                "Новосибирск",
                "Омск",
                "Орёл",
                "Оренбург",
                "Пенза",
                "Пермь",
                "Петрозаводск",
                "Петропавловск-Камчатский",
                "Псков",
                "Ростов-на-Дону",
                "Рязань",
                "Салехард",
                "Самара",
                "Санкт-Петербург",
                "Саранск",
                "Саратов",
                "Севастополь",
                "Симферополь",
                "Смоленск",
                "Ставрополь",
                "Сыктывкар",
                "Тамбов",
                "Тверь",
                "Томск",
                "Тула",
                "Тюмень",
                "Улан-Удэ",
                "Ульяновск",
                "Уфа",
                "Хабаровск",
                "Ханты-Мансийск",
                "Чебоксары",
                "Челябинск",
                "Черкесск",
                "Чита",
                "Элиста",
                "Южно-Сахалинск",
                "Якутск",
                "Ярославль"};
    Random randomCities = new Random();
    int indexOfCity = randomCities.nextInt(cities.length);
String city = cities[indexOfCity];
        return city;
    }

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




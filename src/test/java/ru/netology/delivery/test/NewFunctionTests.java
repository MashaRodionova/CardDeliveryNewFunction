package ru.netology.delivery.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import ru.netology.delivery.data.DataGenerator;
import ru.netology.delivery.data.DataGenerator;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

class NewFunctionTests {

    /*@BeforeEach
    void setup() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
    }*/

    @Test
    void shouldRegisterTest1() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
        //DataGenerator userInfo = new DataGenerator(3, 4);
        $("div [data-test-id='city'] input").setValue("Москва");
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue("28.08.2022");
        $("div [data-test-id='name'] input").setValue("Маша");
        $("div [data-test-id='phone'] input").setValue("+87776661122");
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__text")).first().click();
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue("30.08.2022");
        $$(By.className("button__text")).first().click();
        $$(By.className("button__text")).last().click();
        $(".notification__content")
                .shouldHave(Condition.text("Встреча успешно забронирована на " + "30.08.2022"), Duration.ofSeconds(15))
                .shouldBe(Condition.visible);


    }
/*
    @Test
    @DisplayName("Should successful plan and replan meeting")
    void shouldSuccessfulPlanAndReplanMeeting() {
        var validUser = DataGenerator.Registration.generateUser("ru");
        var daysToAddForFirstMeeting = 4;
        var firstMeetingDate = DataGenerator.generateDate(daysToAddForFirstMeeting);
        var daysToAddForSecondMeeting = 7;
        var secondMeetingDate = DataGenerator.generateDate(daysToAddForSecondMeeting);
        // TODO: добавить логику теста в рамках которого будет выполнено планирование и перепланирование встречи.
        // Для заполнения полей формы можно использовать пользователя validUser и строки с датами в переменных
        // firstMeetingDate и secondMeetingDate. Можно также вызывать методы generateCity(locale),
        // generateName(locale), generatePhone(locale) для генерации и получения в тесте соответственно города,
        // имени и номера телефона без создания пользователя в методе generateUser(String locale) в датагенераторе
    }*/
}
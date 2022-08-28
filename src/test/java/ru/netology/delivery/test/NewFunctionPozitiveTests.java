package ru.netology.delivery.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.conditions.ExactText;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import ru.netology.delivery.data.DataGenerator;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

class NewFunctionPozitiveTests {

    @BeforeEach
    void setup() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void shouldReplanTest1() {
        DataGenerator userInfo = new DataGenerator(3, 4);
        $("div [data-test-id='city'] input").setValue(userInfo.getCity());
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(userInfo.getDate());
        $("div [data-test-id='name'] input").setValue(userInfo.getName1());
        $("div [data-test-id='phone'] input").setValue(userInfo.getPhone());
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__text")).first().click();
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(userInfo.getDateShift());
        $$(By.className("button__text")).first().click();
        $$(By.className("button__text")).last().click();
        $$(".notification__content").first().shouldHave(exactText("Встреча успешно запланирована на " + userInfo.getDateShift()), Duration.ofSeconds(40));

    }

    @Test
    void shouldReplanTest2() {
        DataGenerator userInfo = new DataGenerator(3, 3);
        $("div [data-test-id='city'] input").setValue(userInfo.getCity());
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(userInfo.getDate());
        $("div [data-test-id='name'] input").setValue(userInfo.getName1());
        $("div [data-test-id='phone'] input").setValue(userInfo.getPhone());
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__text")).first().click();
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(userInfo.getDateShift());
        $$(By.className("button__text")).first().click();
        $$(By.className("button__text")).last().click();
        $$(".notification__content").first().shouldHave(exactText("Встреча успешно запланирована на " + userInfo.getDateShift()), Duration.ofSeconds(40));


    }

    @Test
    void shouldReplanTest3() {
        DataGenerator userInfo = new DataGenerator(3, 10);
        $("div [data-test-id='city'] input").setValue(userInfo.getCity());
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(userInfo.getDate());
        $("div [data-test-id='name'] input").setValue(userInfo.getName1());
        $("div [data-test-id='phone'] input").setValue(userInfo.getPhone());
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__text")).first().click();
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(userInfo.getDateShift());
        $$(By.className("button__text")).first().click();
        $$(By.className("button__text")).last().click();
        $$(".notification__content").first().shouldHave(exactText("Встреча успешно запланирована на " + userInfo.getDateShift()), Duration.ofSeconds(40));

    }
    @Test
    void shouldReplanTest4() {
        DataGenerator userInfo = new DataGenerator(3, 10);
        $("div [data-test-id='city'] input").setValue(userInfo.getCity());
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(userInfo.getDate());
        $("div [data-test-id='name'] input").setValue(userInfo.getName1());
        $("div [data-test-id='phone'] input").setValue(userInfo.getPhone());
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__text")).first().click();
        $("div [data-test-id='city'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='city'] input").setValue(userInfo.getCity());
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(userInfo.getDate());
        $("div [data-test-id='name'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        //$("div [data-test-id='name'] input").clear();
        $("div [data-test-id='name'] input").setValue(userInfo.getName1());
        $("div [data-test-id='phone'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='phone'] input").setValue(userInfo.getPhone());
        $$(By.className("button__text")).first().click();
        $$(By.className("button__text")).last().click();
        $$(".notification__content").first().shouldHave(exactText("Встреча успешно запланирована на " + userInfo.getDateShift()), Duration.ofSeconds(15));

    }
}
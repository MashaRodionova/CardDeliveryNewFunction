package ru.netology.delivery.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import ru.netology.delivery.data.DataGenerator;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.*;

class NewFunctionNegativeTests {

    @BeforeEach
    void setup() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void shouldGetNotificationTest1() {
        DataGenerator userInfo = new DataGenerator(3, 0);
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
        $("[data-test-id='date'] span.input__sub").shouldHave(exactText("Заказ на выбранную дату невозможен"), Duration.ofSeconds(15));

    }

    @Test
    void shouldGetNotificationTest2() {
        DataGenerator userInfo = new DataGenerator(3, 5);
        $("div [data-test-id='city'] input").setValue(userInfo.getCity());
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(userInfo.getDate());
        $("div [data-test-id='name'] input").setValue(userInfo.getName1());
        $("div [data-test-id='phone'] input").setValue(userInfo.getPhone());
        $$("[data-test-id='agreement']").last().click();
        $$(By.className("button__text")).first().click();
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(userInfo.getDateShift());
        $("div [data-test-id='name'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='name'] input").setValue(userInfo.getName2());
        $$(By.className("button__text")).first().click();
        $$(".notification__content").first().shouldHave(exactText("Встреча успешно запланирована на " + userInfo.getDateShift()), Duration.ofSeconds(15));

    }


}
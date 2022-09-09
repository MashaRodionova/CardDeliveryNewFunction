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
       DataGenerator tmp = new DataGenerator(3, 5);
        $("div [data-test-id='city'] input").setValue(tmp.getUser().getCity());
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(tmp.getDate1());
        $("div [data-test-id='name'] input").setValue(tmp.getUser().getName());
        $("div [data-test-id='phone'] input").setValue(tmp.getUser().getPhone());
        $("span.checkbox__box").click();
        $("div.grid-row span.button__text").click();
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(tmp.getDate2());
        $("div.grid-row span.button__text").click();
        $("div.notification__content span.button__text").click();
        $("div [data-test-id='success-notification'] .notification__content").shouldHave(exactText("Встреча успешно запланирована на " + tmp.getDate2()), Duration.ofSeconds(40));

    }

    @Test
    void shouldReplanTest2() {
        DataGenerator tmp = new DataGenerator(3, 5);
        $("div [data-test-id='city'] input").setValue(tmp.getUser().getCity());
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(tmp.getDate1());
        $("div [data-test-id='name'] input").setValue(tmp.getUser().getName());
        $("div [data-test-id='phone'] input").setValue(tmp.getUser().getPhone());
        $("span.checkbox__box").click();
        $("div.grid-row span.button__text").click();
        $("div [data-test-id='success-notification'] .notification__content").shouldHave(exactText("Встреча успешно запланирована на " + tmp.getDate1()), Duration.ofSeconds(40));
        $("div [data-test-id='city'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='city'] input").setValue(tmp.getUser().getCity());
        $("div [data-test-id='date'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='date'] input").setValue(tmp.getDate2());
        $("div [data-test-id='name'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='name'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='name'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='name'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='name'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='name'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='name'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='name'] input").setValue(tmp.getUser().getName());
        $("div [data-test-id='phone'] input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("div [data-test-id='phone'] input").setValue(tmp.getUser().getPhone());
        $("div.grid-row span.button__text").click();
        $("div.notification__content span.button__text").click();
        $("div [data-test-id='success-notification'] .notification__content").shouldHave(exactText("Встреча успешно запланирована на " + tmp.getDate2()), Duration.ofSeconds(40));

    }


}
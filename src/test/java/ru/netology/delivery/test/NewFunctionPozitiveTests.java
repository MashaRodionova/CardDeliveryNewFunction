package ru.netology.delivery.test;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
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
import static org.openqa.selenium.Keys.HOME;
import static org.openqa.selenium.Keys.SHIFT;

class NewFunctionPozitiveTests {
private SelenideElement nameField = $("div [data-test-id='name'] input");
private SelenideElement cityField = $("div [data-test-id='city'] input");
    private SelenideElement dateField = $("div [data-test-id='date'] input");
    private SelenideElement phoneField = $("div [data-test-id='phone'] input");
    private SelenideElement checkbox = $("span.checkbox__box");
    private SelenideElement buttonPlan = $("div.grid-row span.button__text");
    private SelenideElement buttonReplan = $("div.notification__content span.button__text");
    @BeforeEach
    void setup() {
        open("http://localhost:9999");
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void shouldPlanAndReplanMeetWithShiftThreeDays() {
        var validUser = DataGenerator.generateUser("ru");
        var daysToAddForFirstMeeting = 4;
        var firstMeetingDate = DataGenerator.generateDate(daysToAddForFirstMeeting);
        var daysToAddForSecondMeeting = 7;
        var secondMeetingDate = DataGenerator.generateDate(daysToAddForSecondMeeting);
        cityField.setValue(validUser.getCity());
        dateField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        dateField.setValue(firstMeetingDate);
        nameField.setValue(validUser.getName());
        phoneField.setValue(validUser.getPhone());
        checkbox.click();
        buttonPlan.click();
        $("div [data-test-id='success-notification'] .notification__content").shouldHave(exactText("Встреча успешно запланирована на " + firstMeetingDate), Duration.ofSeconds(40));
        cityField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        cityField.setValue(validUser.getCity());
        dateField.doubleClick().sendKeys(Keys.BACK_SPACE);
        dateField.setValue(secondMeetingDate);
        nameField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        nameField.setValue(validUser.getName());
        phoneField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        phoneField.setValue(validUser.getPhone());
        buttonPlan.click();
        buttonReplan.click();
        $("div [data-test-id='success-notification'] .notification__content").shouldHave(exactText("Встреча успешно запланирована на " + secondMeetingDate), Duration.ofSeconds(40));

    }

    @Test
    void shouldPlanAndReplanMeetWithShiftNullDays() {
        var validUser = DataGenerator.generateUser("ru");
        var daysToAddForFirstMeeting = 4;
        var firstMeetingDate = DataGenerator.generateDate(daysToAddForFirstMeeting);
        var daysToAddForSecondMeeting = 4;
        var secondMeetingDate = DataGenerator.generateDate(daysToAddForSecondMeeting);
        cityField.setValue(validUser.getCity());
        dateField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        dateField.setValue(firstMeetingDate);
        nameField.setValue(validUser.getName());
        phoneField.setValue(validUser.getPhone());
        checkbox.click();
        buttonPlan.click();
        $("div [data-test-id='success-notification'] .notification__content").shouldHave(exactText("Встреча успешно запланирована на " + firstMeetingDate), Duration.ofSeconds(40));
        cityField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        cityField.setValue(validUser.getCity());
        dateField.doubleClick().sendKeys(Keys.BACK_SPACE);
        dateField.setValue(secondMeetingDate);
        nameField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        nameField.setValue(validUser.getName());
        phoneField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        phoneField.setValue(validUser.getPhone());
        buttonPlan.click();
        buttonReplan.click();
        $("div [data-test-id='success-notification'] .notification__content").shouldHave(exactText("Встреча успешно запланирована на " + secondMeetingDate), Duration.ofSeconds(40));

    }

    @Test
    void shouldPlanAndReplanMeetWithShiftMinusFiveDays() {
        var validUser = DataGenerator.generateUser("ru");
        var daysToAddForFirstMeeting = 9;
        var firstMeetingDate = DataGenerator.generateDate(daysToAddForFirstMeeting);
        var daysToAddForSecondMeeting = 4;
        var secondMeetingDate = DataGenerator.generateDate(daysToAddForSecondMeeting);
        cityField.setValue(validUser.getCity());
        dateField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        dateField.setValue(firstMeetingDate);
        nameField.setValue(validUser.getName());
        phoneField.setValue(validUser.getPhone());
        checkbox.click();
        buttonPlan.click();
        $("div [data-test-id='success-notification'] .notification__content").shouldHave(exactText("Встреча успешно запланирована на " + firstMeetingDate), Duration.ofSeconds(40));
        cityField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        cityField.setValue(validUser.getCity());
        dateField.doubleClick().sendKeys(Keys.BACK_SPACE);
        dateField.setValue(secondMeetingDate);
        nameField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        nameField.setValue(validUser.getName());
        phoneField.sendKeys(Keys.SHIFT, HOME, Keys.BACK_SPACE);
        phoneField.setValue(validUser.getPhone());
        buttonPlan.click();
        buttonReplan.click();
        $("div [data-test-id='success-notification'] .notification__content").shouldHave(exactText("Встреча успешно запланирована на " + secondMeetingDate), Duration.ofSeconds(40));

    }



}
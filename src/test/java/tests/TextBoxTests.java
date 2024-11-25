package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://demoqa.com";
    }




    @Test
    void fillFormTest() {

        open("/text-box");
        $("#userName").setValue("Alex");
        $("#userEmail").setValue("Alex@provet.com");
        $("#currentAddress").setValue("Some street one");
        $("#permanentAddress").setValue("Another street one");
        $("#submit").click();

        $("#output #name").shouldHave(text("Alex"));
        $("#output #email").shouldHave(text("Alex@provet.com"));
        $("#output #currentAddress").shouldHave(text("Some street one"));
        $("#output #permanentAddress").shouldHave(text("Another street one"));
    }

}

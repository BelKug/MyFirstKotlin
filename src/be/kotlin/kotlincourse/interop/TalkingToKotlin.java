package be.kotlin.kotlincourse.interop;

import be.kotlin.kotlincourse.classes.CustomerKotlin;
import be.kotlin.kotlincourse.classes.CustomerKotlinKt;
import be.kotlin.kotlincourse.classes.Status;

import java.io.IOException;

/**
 * Created by guyheylens on 17/04/17.
 */
public class TalkingToKotlin {

    public static void main(String[] args) {
        CustomerKotlin customerKotlin = new CustomerKotlin(1, "Hadi", "mail@kotlin.be");

        customerKotlin.setEmail("admin@kotlin.be");
        customerKotlin.changeStatus(Status.Current);
        //check the default parameter
        customerKotlin.changeStatus();

        //Annotation set name for Java.
        customerKotlin.Preferential();


        try {
            customerKotlin.loadStatistics("filename");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Invoke Top Level Function
        //Like Kotlin created a static class with a static method.
        //TopLevelFunctionsKt.prefix("some", "value");
        UtilityClass.prefix("some", "value");
        UtilityClass.getCopyrightYear();

        //Talking to the extension function it requires an instance of the class "customerKotlin"
        CustomerKotlinKt.extensions(customerKotlin, "Test");


    }
}

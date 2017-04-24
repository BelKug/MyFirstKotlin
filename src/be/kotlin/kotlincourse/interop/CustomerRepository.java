package be.kotlin.kotlincourse.interop;

import be.kotlin.kotlincourse.classes.CustomerJava;

import java.util.List;

/**
 * Created by guyheylens on 17/04/17.
 */
public interface CustomerRepository {
    CustomerJava getById(int id);
    List<CustomerJava> getAll();
}

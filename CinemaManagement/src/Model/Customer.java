/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;

/**
 *
 * @author ADMIN
 */
public class Customer extends Person {

    public Customer(String userName, String password, String lastName, String firstName, String address, String phoneNum, String dob) throws ParseException {
        super(userName, password, lastName, firstName, address, phoneNum, dob);
    }

}

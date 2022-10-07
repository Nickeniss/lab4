/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sait.services;

import ca.sait.models.User;

/**
 * Service provider for accounts
 *
 * @author Nico
 */
public class AccountService {

    public User login(String username, String password) {
        if (username.equals("abe") && password.equals("password")) {
            User user = new User(username, password);
            return user;
        } else if (username.equals("barb") && password.equals("password")) {
            User user = new User(username, password);
            return user;
        } else {
            return null;
        }
    }

}

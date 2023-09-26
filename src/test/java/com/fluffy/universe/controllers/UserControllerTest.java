package com.fluffy.universe.controllers;

import com.fluffy.universe.controllers.UserController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import io.javalin.Javalin;
import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    Javalin controller = Javalin.create();
    UserController user;
    @BeforeEach
    void setUp() {
        user = new UserController(controller);
    }

    @Test
    void validateEmail() {

    }
    @Test
    void signUpPage() {

    }

    @Test
    void signInPage() {
    }

    @Test
    void forgotPasswordPage() {
    }

    @Test
    void resetPasswordPage() {
    }

    @Test
    void accountPage() {
    }

    @Test
    void dashboardPage() {
    }

    @Test
    void signUp() {
    }

    @Test
    void signIn() {
    }

    @Test
    void signOut() {
    }

    @Test
    void forgotPassword() {
    }

    @Test
    void resetPassword() {
    }

    @Test
    void updateAccount() {
    }

    @Test
    void registerRoutes() {
    }
}
package com.fluffy.universe.controllers;

import io.javalin.http.Context;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
class UserControllerTest {
    UserController userController = mock(UserController.class);


    @Test
    void signUpPage() {
        doNothing().when(userController).signUpPage(null);
        userController.signUpPage(null);
        verify(userController, times(1)).signUpPage(null);
    }

    @Test
    void signInPage() {
        doNothing().when(userController).signInPage(null);
        userController.signInPage(null);
        verify(userController, times(1)).signInPage(null);
    }

    @Test
    void forgotPasswordPage() {
        doNothing().when(userController).forgotPasswordPage(null);
        userController.forgotPasswordPage(null);
        verify(userController, times(1)).forgotPasswordPage(null);
    }

    @Test
    void resetPasswordPage() {
        Context context = mock(Context.class);

        doNothing().when(userController).resetPasswordPage(context);
        userController.resetPasswordPage(context);
        verify(userController, times(1)).resetPasswordPage(context);
    }

    @Test
    void accountPage() {
        doNothing().when(userController).accountPage(null);
        userController.accountPage(null);
        verify(userController, times(1)).accountPage(null);
    }

    @Test
    void dashboardPage() {
        doNothing().when(userController).dashboardPage(null);
        userController.dashboardPage(null);
        verify(userController, times(1)).dashboardPage(null);
    }

    @Test
    void signUp() {
        doNothing().when(userController).signUp(null);
        userController.signUp(null);
        verify(userController, times(1)).signUp(null);
    }
}
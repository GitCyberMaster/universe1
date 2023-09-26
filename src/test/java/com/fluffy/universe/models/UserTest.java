package com.fluffy.universe.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;


class UserTest {
    User user = new User();


    @BeforeEach
    public void init(){
        String email = "login@addr.mail";
        user.setEmail(email);
        user.setFirstName("Anton");
        user.setLastName("Antonov");
        user.setPassword("12345");
        user.setId(12);
        user.setAddress("Address");
        user.setBirthday("01.12.2000");
        user.setGender("male");
        user.setResetPasswordToken("No");
        user.setRoleId(1);
        user.setWebsite("http://address");
    }
    @Test
    void getId() {
        assertEquals(12,user.getId());
    }

    @Test
    void setId() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setId(1);
        mockUser.setId(1);
        verify(mockUser, times(1)).setId(1);

    }

    @Test
    void getRoleId() {
        assertEquals(1,user.getRoleId());
    }

    @Test
    void setRoleId() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setRoleId(1);
        mockUser.setRoleId(1);
        verify(mockUser, times(1)).setRoleId(1);

    }

    @Test
    void getFirstName() {
        assertEquals("Anton",user.getFirstName());
    }

    @Test
    void setFirstName() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setFirstName("Maria");
        mockUser.setFirstName("Maria");
        verify(mockUser, times(1)).setFirstName("Maria");

    }

    @Test
    void getLastName() {
        assertEquals("Antonov",user.getLastName());
    }

    @Test
    void setLastName() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setLastName("Ivanov");
        mockUser.setLastName("Ivanov");
        verify(mockUser, times(1)).setLastName("Ivanov");

    }

    @Test
    void getGender() {
        assertEquals("male",user.getGender());
    }

    @Test
    void setGender() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setGender("female");
        mockUser.setGender("female");
        verify(mockUser, times(1)).setGender("female");

    }

    @Test
    void getEmail() {
        assertEquals("login@addr.mail",user.getEmail());
    }

    @Test
    void setEmail() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setEmail("login@email.org");
        mockUser.setEmail("login@email.org");
        verify(mockUser, times(1)).setEmail("login@email.org");

    }

    @Test
    void getPassword() {
        assertEquals("12345",user.getPassword());
    }

    @Test
    void setPassword() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setPassword("1");
        mockUser.setPassword("1");
        verify(mockUser, times(1)).setPassword("1");

    }

    @Test
    void getBirthday() {
        assertEquals("01.12.2000",user.getBirthday());
    }

    @Test
    void setBirthday() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setBirthday("01.01.2000");
        mockUser.setBirthday("01.01.2000");
        verify(mockUser, times(1)).setBirthday("01.01.2000");

    }

    @Test
    void getAddress() {
        assertEquals("Address",user.getAddress());
    }

    @Test
    void setAddress() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setAddress("home");
        mockUser.setAddress("home");
        verify(mockUser, times(1)).setAddress("home");

    }

    @Test
    void getWebsite() {
        assertEquals("http://address",user.getWebsite());
    }

    @Test
    void setWebsite() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setWebsite("http://");
        mockUser.setWebsite("http://");
        verify(mockUser, times(1)).setWebsite("http://");

    }

    @Test
    void getResetPasswordToken() {
        assertEquals("No",user.getResetPasswordToken());
    }

    @Test
    void setResetPasswordToken() {
        User mockUser = mock(User.class);
        doNothing().when(mockUser).setResetPasswordToken("Yes");
        mockUser.setResetPasswordToken("Yes");
        verify(mockUser, times(1)).setResetPasswordToken("Yes");

    }
}
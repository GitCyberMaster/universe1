package com.fluffy.universe.models;
import com.fluffy.universe.models.Role;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {



    @Test
    void getId() {
        Role roleTest = Role.USER;
        assertEquals(1, roleTest.getId());
    }

    @Test
    void getName() {
        Role roleTest = Role.USER;
        assertEquals("User", roleTest.getName());
    }

    @Test
    void getRoleById() {
        Role roleTest = Role.USER;
        assertSame(Role.GUEST, roleTest.getRoleById(0));

    }


}
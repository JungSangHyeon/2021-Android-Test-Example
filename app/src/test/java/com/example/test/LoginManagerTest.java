package com.example.test;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class LoginManagerTest {

    private LoginManager loginManager;

    @Before
    public void createLoginManager(){
        this.loginManager = new LoginManager();
    }

    @Test
    public void loginManager_GetWholeName() {
        String wholeName = this.loginManager.getWholeName("Jung", "SangHyeon");
        assertThat(wholeName).isEqualTo("JungSangHyeon");
    }

    @Test
    public void loginManager_GetAge() {
        int age = this.loginManager.getAge(1999, 2021);
        assertThat(age).isEqualTo(23);
    }
}

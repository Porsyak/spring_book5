package com.example.ch4.config;

import com.example.ch4.FoodProviderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {KindergartenConfig.class, HighschoolConfig.class})
@ActiveProfiles("kindergarten")
public class ProfilesJavaConfigTest {

    @Autowired
    FoodProviderService foodProviderService;

    @Test
    public void testProvider(){
        assertTrue (foodProviderService.provideLunchSet() != null);
        assertFalse(foodProviderService.provideLunchSet().isEmpty());
    }



}

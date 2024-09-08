package com.scaler.lld.design.creational.abstractfactory.button;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractButtonFactoryTest {

    @Test
    public void testLightTheme() {
        ThemeFactory lightThemeFactory = new LightThemeFactory();

        Button button = lightThemeFactory.createButton(10.0, 0.4, null);
        assertTrue(button instanceof LightButton,
                "If the factory is light, it should be a light button"
        );

        Radio radio = lightThemeFactory.createRadio();
        assertTrue(radio instanceof LightRadio,
                "If the factory is light, it should be a light radio"
        );

    }

    @Test
    public void testDarkTheme(){
        DarkThemeFactory darkThemeFactory=new DarkThemeFactory();
        Button button=darkThemeFactory.createButton(20.0,0.8,null);
        Radio radio=darkThemeFactory.createRadio();

        assertTrue(button instanceof  DarkButton,"If the factory is dark, it should be a dark button");
        assertTrue(radio instanceof DarkRadio,
                "If the factory is dark, it should be a dark radio"
                );
    }
}

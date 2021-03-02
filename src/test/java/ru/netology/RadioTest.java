package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    // Тест на текущую станцию
    @Test
    public void setCurrentWave() {
        Radio radio = new Radio();
        int expected = 7;
        radio.setCurrentWave(expected);
        assertEquals(0, radio.getCurrentWave());

    }

    // Тест на текущий уровень звука
    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentVolume(expected);
        assertEquals(0, radio.getCurrentVolume());
    }

    // тест на 10 волну из 9
    @Test
    public void setOverLimitWave() {
        Radio radio = new Radio();
        radio.setCurrentWave(10);
        assertEquals(0, radio.getCurrentWave());
    }

    // тест на 11 звук из 10
    @Test
    public void setOverLimitVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        assertEquals(0, radio.getCurrentVolume());
    }
    //Можно еще накидать звук на -1,волну на -1, максимальный звук на 10,волну на 9.
}

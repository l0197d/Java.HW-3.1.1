package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    Radio radio = new Radio(10);

    @Test
    public void setCurrentWave() {
        int expected = 9;
        radio.setCurrentWave(expected);
        assertEquals(expected, radio.getCurrentWave());
    }

    @Test
    public void setCurrentWaveOutLimit() {
        radio.setCurrentWave(10);
        assertEquals(0, radio.getCurrentWave());
    }

    @Test
    public void setCurrentVolume() {
        int expected = 85;
        radio.setCurrentVolume(expected);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeOutLimit() {
        radio.setCurrentVolume(101);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpStationInLimit() {
        radio.setCurrentWave(8);
        int CurrentWave = radio.upStation();
        radio.setCurrentWave(CurrentWave);
        assertEquals(9, radio.getCurrentWave());
    }

    @Test
    public void shouldDownStationInLimit() {
        radio.setCurrentWave(10);
        int CurrentWave = radio.downStation();
        radio.setCurrentWave(CurrentWave);
        assertEquals(9, radio.getCurrentWave());
    }

    @Test
    public void shouldUpStationMax() {
        radio.setCurrentWave(9);
        int CurrentWave = radio.upStation();
        radio.setCurrentWave(CurrentWave);
        assertEquals(0, radio.getCurrentWave());
    }

    @Test
    public void shouldDownStationMin() {
        radio.setCurrentWave(0);
        int CurrentWave = radio.downStation();
        radio.setCurrentWave(CurrentWave);
        assertEquals(9, radio.getCurrentWave());
    }

    @Test
    public void shouldUpVolumeInLimit() {
        radio.setCurrentVolume(50);
        int currentVolume = radio.upVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownVolumeInLimit() {
        radio.setCurrentVolume(60);
        int currentVolume = radio.downVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(59, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpVolumeMax() {
        radio.setCurrentVolume(100);
        int currentVolume = radio.upVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownVolumeMin() {
        radio.setCurrentVolume(0);
        int currentVolume = radio.downVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpStationOutLimit() {
        radio.setCurrentWave(11);
        int CurrentWave = radio.upStation();
        radio.setCurrentWave(CurrentWave);
        assertEquals(1, radio.getCurrentWave());
    }

    @Test
    public void shouldDownStationOutLimit() {
        radio.setCurrentWave(-1);
        int CurrentWave = radio.downStation();
        radio.setCurrentWave(CurrentWave);
        assertEquals(9, radio.getCurrentWave());
    }

    @Test
    public void shouldUpVolumeOutLimit() {
        radio.setCurrentVolume(110);
        int currentVolume = radio.upVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(1, radio.getCurrentVolume());
    }


    @Test
    public void shouldDownVolumeOutLimit() {
        radio.setCurrentVolume(-1);
        int currentVolume = radio.downVolume();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

}
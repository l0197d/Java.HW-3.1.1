package ru.netology;

// Класс
public class Radio {

    private final int minWave = 0;
    private final int maxVolume = 100;
    private final int minVolume = 0;
    private int maxWave = 9;
    private int currentWave;
    private int currentVolume;
    private int numberStation = 5;


    public Radio(int numberStation) {
        this.numberStation = numberStation;
        this.maxWave = numberStation - 1;
    }


    // Логика работы выбора станций
    public int getCurrentWave() {
        return currentWave;
    }

    public void setCurrentWave(int currentWave) {
        if (currentWave > maxWave) {
            return;
        }
        if (currentWave < minWave) {
            return;
        }
        this.currentWave = currentWave;
    }

    public int upStation() {
        if (currentWave >= maxWave) {
            setCurrentWave(minWave);
        } else {
            setCurrentWave(currentWave + 1);
        }
        return currentWave;
    }

    public int downStation() {
        if (currentWave <= minWave) {
            setCurrentWave(maxWave);
        } else {
            setCurrentWave(currentWave - 1);
        }
        return currentWave;
    }


    public int getMinWave() {
        return minWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int upVolume() {
        setCurrentVolume(currentVolume + 1);
        return currentVolume;
    }
    public int downVolume() {

        setCurrentVolume(currentVolume - 1);
        return currentVolume;
    }
}


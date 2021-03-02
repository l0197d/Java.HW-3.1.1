package ru.netology;

public class Radio {

    private final int maxWave = 9;
    private final int minWave = 0;
    private final int maxVolume = 10;
    private final int minVolume = 0;
    private int currentWave;
    private int currentVolume;

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

    public int getMaxWave() {
        return maxWave;
    }

    public int getMinWave() {
        return minWave;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    // Контроль громкости
    // Прикручиваем громкость
    public int upVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
        return currentVolume;
    }

    // Опускаем громкость
    public int downVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
        return currentVolume;
    }

    // Переключение станций
// Увеличиваем станции
    public int upStation() {
        if (currentWave < maxWave) {
            currentWave++;
        }
        return currentWave;
    }

    // Убавляем станции
    public int downStation() {
        if (currentWave < minWave) {
            currentWave--;
        }
        return currentWave;
    }
}

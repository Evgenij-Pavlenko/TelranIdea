package de.telran.action;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GrayscaleImageAction implements ImageAction {
    @Override
    public String getName() {
        return "GRAYSCALE";
    }
    @Override
    public BufferedImage doAction(BufferedImage source) {
        System.out.println("Grayscale an image");

        return doGrayScale(source);
    }

    public BufferedImage doGrayScale(BufferedImage source) {
        // Создаем новое пустое изображение, такого же размера
        BufferedImage result = new BufferedImage(source.getWidth(), source.getHeight(), source.getType());
        // Делаем двойной цикл, чтобы обработать каждый пиксель
        for (int x = 0; x < source.getWidth(); x++) {
            for (int y = 0; y < source.getHeight(); y++) {

                // Получаем цвет текущего пикселя
                Color color = new Color(source.getRGB(x, y));

                // Получаем каналы этого цвета
                int blue = color.getBlue();
                int red = color.getRed();
                int green = color.getGreen();

                // Применяем стандартный алгоритм для получения черно-белого изображения
                int grey = (int) (red * 0.299 + green * 0.587 + blue * 0.114);

                // Если вы понаблюдаете, то заметите что у любого оттенка серого цвета, все каналы имеют
                // одно и то же значение. Так, как у нас изображение тоже будет состоять из оттенков серого
                // то, все канали будут иметь одно и то же значение.
                int newRed = grey;
                int newGreen = grey;
                int newBlue = grey;

                //  Cоздаем новый цвет
                Color newColor = new Color(newRed, newGreen, newBlue);

                // И устанавливаем этот цвет в текущий пиксель результирующего изображения
                result.setRGB(x, y, newColor.getRGB());
            }
        }
        return result;
    }
}

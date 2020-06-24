package de.telran.entity;

import java.awt.image.BufferedImage;

public class DownloadedImage {
    private BufferedImage image;
    private boolean isSuccessfull;
    private ImageDescriptor imageDescriptor;

    public BufferedImage getImage() {
        return image;
    }

    public boolean isSuccessfull() {
        return isSuccessfull;
    }

    public DownloadedImage(BufferedImage image, boolean status, ImageDescriptor imageDescriptor) {
        this.image = image;
        this.isSuccessfull = status;
        this.imageDescriptor = imageDescriptor;
    }

    @Override
    public String toString() {
        return "DownloadedImage{" +
                "image=" + image +
                ", isSuccessfull=" + isSuccessfull +
                '}';
    }
}

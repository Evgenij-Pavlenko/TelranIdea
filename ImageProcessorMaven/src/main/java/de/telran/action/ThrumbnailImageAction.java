package de.telran.action;

import java.awt.image.BufferedImage;

public class ThrumbnailImageAction implements ImageAction {
    @Override
    public BufferedImage doAction(BufferedImage source) {
        System.out.println("Creating a thrumbnail");
        return null;
    }
}

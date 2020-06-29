package de.telran.service;

import de.telran.entity.ActionableImage;
import de.telran.entity.DownloadedImage;
import de.telran.entity.ImageDescriptor;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DownloadService {
    public List<ActionableImage> downloadImages(List<ActionableImage> images) {
        List<ActionableImage> imageList = new ArrayList<>(images);
        for (ActionableImage actionableImage : images) {
            try {
                URL url = new URL(actionableImage.getSourceUrl());
                BufferedImage image = ImageIO.read(url);
                actionableImage.setImage(image);
                actionableImage.setSuccessfull(true);
            } catch (Exception ex) {
                System.err.println(actionableImage.getSourceUrl());
                System.err.println(ex.getMessage());
                actionableImage.setSuccessfull(false);            }
        }
        return imageList;
    }
}

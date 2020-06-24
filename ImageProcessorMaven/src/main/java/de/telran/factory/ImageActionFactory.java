package de.telran.factory;

import de.telran.action.*;

public class ImageActionFactory {
    public ImageAction getImageAction(String actionName) {
        switch (actionName) {
            case "GRAYSCALE": return new GrayscaleImageAction();
            case "THRUMBNAIL": return new ThrumbnailImageAction();
            case "PREVIEW": return new PreviewImageAction();
            default: return new DefaultImageAction();
        }
    }
}

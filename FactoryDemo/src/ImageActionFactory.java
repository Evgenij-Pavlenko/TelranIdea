public class ImageActionFactory {
    public ImageAction getImageAction(String actionName) {
        switch (actionName) {
            case "GRAYSCALE": return new CrayscaleImageAction();
            case "THRUMBNAIL": return new TrumbnailImageAction();
            case "PREVIEW": return new PreviewImageAction();
            default: return null;
        }
    }
}

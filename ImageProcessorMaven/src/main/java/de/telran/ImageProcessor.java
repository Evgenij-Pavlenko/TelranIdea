package de.telran;

import de.telran.entity.ActionableImage;
import de.telran.entity.ImageDescriptor;
import de.telran.factory.ImageActionFactory;
import de.telran.service.*;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static de.telran.service.CreateOriginName.createOriginNameFromUrl;

public class ImageProcessor {
    private ImageDescriptorService imageDescriptorService;
    private DownloadService downloadService;
    private FileService fileService;
    private ImageService imageService;

    //...
    public ImageProcessor(ImageDescriptorService imageDescriptorService,
                          DownloadService downloadService,
                          ImageService imageService,
                          FileService fileService) {
        this.imageDescriptorService = imageDescriptorService;
        this.downloadService = downloadService;
        this.imageService = imageService;
        this.fileService = fileService;
    }

    public void doProcessing(String fileName) {
        List<ImageDescriptor> imageDescriptors = imageDescriptorService.getImageDescriptors(fileName);

        List<ActionableImage> actionableImages = imageDescriptors
                .stream()
                .map(i-> new ActionableImage(null, false, i))
                .collect(Collectors.toList());

        List<ActionableImage> downloadedImages = downloadService.downloadImages(actionableImages);

        List<ActionableImage> successfullDownloadImages = downloadedImages.stream()
                .filter(ActionableImage::isSuccessfull)
                .collect(Collectors.toList());

        List<ActionableImage> processedImages = successfullDownloadImages
                .stream()
                .map(i -> imageService.processImage(i))
                .collect(Collectors.toList());
        processedImages.forEach(i -> fileService.saveImageAsFile(i));
    }

    public static void main(String[] args) throws Exception{
        String fileName = args[0];
        FileService fileService = new FileService(new ConfigService());
        ImageDescriptorService imageDescriptorService = new ImageDescriptorService(fileService);
        DownloadService downloadService = new DownloadService();
        ImageService imageService = new ImageService(new ImageActionFactory(new ActionsConfigService()));
        ImageProcessor processor = new ImageProcessor(imageDescriptorService,
                downloadService, imageService, fileService);
        processor.doProcessing(fileName);
        createOriginNameFromUrl("https://s3-eu-west-1.amazonaws.com/lukaroundimg/beelitz2017/1a.jpg");
    }
}

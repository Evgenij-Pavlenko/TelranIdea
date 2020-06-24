package de.telran;

import de.telran.entity.DownloadedImage;
import de.telran.entity.ImageDescriptor;
import de.telran.factory.ImageActionFactory;
import de.telran.service.DownloadService;
import de.telran.service.FileService;
import de.telran.service.ImageDescriptorService;
import de.telran.service.ImageService;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.stream.Collectors;

import static de.telran.service.CreateOriginName.createOriginNameFromUrl;

public class ImageProcessor {
    private ImageDescriptorService imageDescriptorService;
    private DownloadService downloadService;
    private FileService fileService;
    private ImageService imageService;

    //private DownloadService downloadService;
    //private ImageService imageService;
    //...
    public ImageProcessor(ImageDescriptorService imageDescriptorService,
                          DownloadService downloadService,
                          FileService fileService,
                          ImageService imageService) {
        this.imageDescriptorService = imageDescriptorService;
        this.downloadService = downloadService;
        this.fileService = fileService;
        this.imageService = imageService;
    }

    public void doProcessimg(String fileName) {
        List<ImageDescriptor> imageDescriptors = imageDescriptorService.getImageDescriptor(fileName);

        List<DownloadedImage> downloadedImages = downloadService.downloadImages(imageDescriptors);
        List<DownloadedImage> successfullDownloadImages = downloadedImages.stream()
                .filter(DownloadedImage::isSuccessfull)
                .collect(Collectors.toList());

        List<BufferedImage> processedImages = successfullDownloadImages.
                stream()
                .map(i -> imageService.processImage(i.getImage(), i.ge);
//        successfullDownloadImage.forEach(i -> fileService.saveImageAsFile(i));

        processedImages.forEach(System.out::println);

        // call download service
        // call image service
        //
    }

    public static void main(String[] args) {
        String fileName = args[0];
        FileService fileService = new FileService();
        ImageDescriptorService imageDescriptorService = new ImageDescriptorService(fileService);
        DownloadService downloadService = new DownloadService();
        ImageService imageService = new ImageService(new ImageActionFactory());
        ImageProcessor processor = new ImageProcessor(imageDescriptorService, downloadService, fileService, imageService);
        processor.doProcessimg(fileName);
        createOriginNameFromUrl("https://s3-eu-west-1.amazonaws.com/lukaroundimg/beelitz2017/1a.jpg");
    }
}

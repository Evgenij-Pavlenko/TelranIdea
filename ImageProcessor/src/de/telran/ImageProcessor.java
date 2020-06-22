package de.telran;

import de.telran.entity.ImageDescriptor;
import de.telran.service.FileService;
import de.telran.service.ImageDescriptorService;

import java.util.List;

public class ImageProcessor {
    private ImageDescriptorService imageDescriptorService;
    //private DownloadService downloadService;
    //private ImageService imageService;1

    public ImageProcessor(ImageDescriptorService imageDescriptorService) {
        this.imageDescriptorService = imageDescriptorService;
    }

    public void doProcessimg(String fileName) {
        List<ImageDescriptor> imageDescriptors = imageDescriptorService.getImageDescriptor(fileName);

        imageDescriptors.forEach(System.out::println);

        // call download service
        //call image service
        //
    }

    public static void main(String[] args) {
        String fileName = args[0];
        FileService fileService = new FileService();
        ImageDescriptorService imageDescriptorService = new ImageDescriptorService(fileService);
        ImageProcessor processor = new ImageProcessor(imageDescriptorService);
        processor.doProcessimg(fileName);
    }
}

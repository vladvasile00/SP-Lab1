package services;

import services.ImageLoader;

public class JPGImageLoader implements ImageLoader {
    private String imageName;
    public JPGImageLoader(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void load(String str) {
        System.out.println("Loaded JPG models.Image: " + str);
    }
}

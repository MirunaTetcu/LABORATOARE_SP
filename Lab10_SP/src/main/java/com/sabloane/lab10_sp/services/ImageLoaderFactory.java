package com.sabloane.lab10_sp.services;

import com.sabloane.lab10_sp.services.BMPImageLoader;
import com.sabloane.lab10_sp.services.ImageLoader;

public class ImageLoaderFactory {
    public static ImageLoader create(String imageName) throws Exception {
        if (imageName.endsWith(".jpg"))
            return new JPGImageLoader(imageName);
        else if (imageName.endsWith(".bmp"))
            return new BMPImageLoader(imageName);
        else
            throw new Exception("Unsupported image type");
    }
}
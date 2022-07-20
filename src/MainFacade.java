import facade.VideoConversionFacade;

import java.io.File;

public class MainFacade {
    public static void main(String[] args) {
        //FACADE
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg","mp4");
        //


    }
}
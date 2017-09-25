package ytstudios.wall.plus;

import java.io.Serializable;

/**
 * Created by Yugansh Tyagi on 15-09-2017.
 */

public class WallpapersModel implements Serializable{

    private String  wallpaperURL;
    private String  wallpaperFullURL;
    private String fileType;
    private int wallId;

    public WallpapersModel(String wallpaperURL, String wallpaperFullURL, String fileType, int wallId) {
        this.wallpaperURL = wallpaperURL;
        this.wallpaperFullURL = wallpaperFullURL;
        this.fileType = fileType;
        this.wallId = wallId;

    }

    public WallpapersModel(String wallpaperURL, String wallpaperFullURL) {
        this.wallpaperURL = wallpaperURL;
        this.wallpaperFullURL = wallpaperFullURL;
    }

    public String getWallpaperFullURL() {
        return wallpaperFullURL;
    }

    public String getWallpaperURL() {
        return wallpaperURL;
    }


    public String getFileType() {
        return fileType;
    }

    public int getWallId() {
        return wallId;
    }

}

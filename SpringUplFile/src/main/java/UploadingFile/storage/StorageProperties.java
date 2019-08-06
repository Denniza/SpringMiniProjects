package UploadingFile.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {
    /**
     * Folder location for storing files
     */
    private String location = "C:\\Users\\ametelev\\IdeaProjects\\TestSpringApps\\src\\main\\resources\\uploadedFiles";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}

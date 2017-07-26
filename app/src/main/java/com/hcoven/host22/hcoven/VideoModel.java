package com.hcoven.host22.hcoven;


class VideoModel {
    private String Description;

    private String Duration;

    private String Image;

    private String Level;

    private String Title;


    public VideoModel() {
    }
    public VideoModel(String title, String level, String duration, String description, String image) {
        Title = title;
        Level = level;
        Duration = duration;
        Description = description;
        Image = image;

    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String duration) {
        Duration = duration;
    }

    public String getImage() {
       return Image;
   }


    public void setImage(String image) {
        Image = image;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}

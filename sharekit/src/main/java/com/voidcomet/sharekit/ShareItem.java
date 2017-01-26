package com.voidcomet.sharekit;

import android.net.Uri;

public class ShareItem {
    private String title;
    private String description;
    private String url;

    public ShareItem(){
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public Uri getUrl() {
        return Uri.parse(url);
    }


}

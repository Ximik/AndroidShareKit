package share;

/**
 * Created by ihor on 26.01.17.
 */

public class ShareLinkContent extends Object {
    private int a;
    private int b;
    private String yourTitle;
    private String yourDescription;
    private String url;


    public ShareLinkContent(int a, int b, String yourTitle){
        this.a = a;
        this.b = b;
        this.yourTitle = yourTitle;
    }
    public ShareLinkContent(int a, int b, String yourTitle, String url){
        this.a = a;
        this.b = b;
        this.yourTitle = yourTitle;
        this.url = url;
    }

    public void setContentTitle(String yourTitle){
        this.yourTitle = yourTitle;
    }
    public void setContentDescription(String yourDescription){
        this.yourDescription = yourDescription;
    }
    public void setContentUrl(String url){
        this.url = url;
    }


}

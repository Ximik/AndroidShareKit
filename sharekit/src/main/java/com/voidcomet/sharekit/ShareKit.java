package com.voidcomet.sharekit;

import android.app.Activity;

import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;

public class ShareKit {
    public ShareKit() {
    }

    public void setAPIKey(Provider provider, String key) {

    }

    public void share(Activity activity, Provider provider, ShareItem item) {
        switch (provider) {
            case FACEBOOK:
                ShareLinkContent shareLinkContent = new ShareLinkContent.Builder()
                        .setContentTitle(item.getTitle())
                        .setContentDescription(item.getDescription())
                        .setContentUrl(item.getUrl())
//                        .setImageUrl(Uri.parse("image or logo [if playstore or app store url then no need of this image url]"))
                        .build();
                ShareDialog.show(activity, shareLinkContent);
                break;
        }
    }
}

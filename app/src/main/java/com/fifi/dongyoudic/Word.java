package com.fifi.dongyoudic;

/**
 * Created by fifi on 2017/10/5.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }

    /**
     * Create a new Word object
     * @param defaultTranslation
     * @param miwokTranslation
     * @param imageResourceId is the drawable resource ID for the image assets
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage(){
        return imageResourceId != NO_IMAGE_PROVIDED;
    }
}

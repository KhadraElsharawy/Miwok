package com.example.basmet.miwok;

/**
 * Created by basmet on 3/6/2018.
 */

public class Word {
    private String DefaultTranslation;
    private String MikowTranslation;
    private int mIcon = NO_IMAGE_PROVIDED;
    private int mAudio;
    private int nAudio;
    private static int NO_IMAGE_PROVIDED = -1;
    public Word(String defaultTranslation, String mikowTranslation, int audio){
        DefaultTranslation = defaultTranslation;
        MikowTranslation = mikowTranslation;
        nAudio = audio;
    }

    public int getnAudio() {
        return nAudio;
    }

    public Word(String defaultTranslation, String mikowTranslation, int icon, int audio){
        DefaultTranslation = defaultTranslation;
        MikowTranslation = mikowTranslation;

        mIcon = icon;
        mAudio = audio;
    }

    public String getDefaultTranslation() {
        return DefaultTranslation;
    }

    public String getMikowTranslation() {
        return MikowTranslation;
    }

    public int getmIcon() {
        return mIcon;
    }
    public boolean hasImage(){
        return mIcon != NO_IMAGE_PROVIDED;
    }

    public int getmAudio() {
        return mAudio;
    }
}

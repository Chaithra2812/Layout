package com.example.layoutdesign;

import android.graphics.drawable.Drawable;

public class Model {
    Drawable img1,img2,img3,img4;
    String txt1,txt2,txt3,txt4;


    public Drawable getImg1() {
        return img1;
    }

    public void setImg1(Drawable img1) {
        this.img1 = img1;
    }

    public Drawable getImg2() {
        return img2;
    }

    public void setImg2(Drawable img2) {
        this.img2 = img2;
    }

    public Drawable getImg3() {
        return img3;
    }

    public void setImg3(Drawable img3) {
        this.img3 = img3;
    }

    public Drawable getImg4() {
        return img4;
    }

    public void setImg4(Drawable img4) {
        this.img4 = img4;
    }

    public String getTxt1() {
        return txt1;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }

    public String getTxt4() {
        return txt4;
    }

    public void setTxt4(String txt4) {
        this.txt4 = txt4;
    }

    public Model(Drawable img1, Drawable img2, Drawable img3, Drawable img4, String txt1, String txt2, String txt3, String txt4) {
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
        this.img4 = img4;
        this.txt1 = txt1;
        this.txt2 = txt2;
        this.txt3 = txt3;
        this.txt4 = txt4;
    }
}
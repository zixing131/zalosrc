package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMRect {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public ZOMRect() {
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
    }

    public static ZOMRect createObject() {
        return new ZOMRect();
    }

    public boolean contains(int i11, int i12) {
        int i13;
        int i14;
        int i15 = this.left;
        int i16 = this.right;
        return i15 < i16 && (i13 = this.top) < (i14 = this.bottom) && i11 >= i15 && i11 <= i16 && i12 >= i13 && i12 <= i14;
    }

    public int getHeight() {
        return this.bottom - this.top;
    }

    public int getWidth() {
        return this.right - this.left;
    }

    public int[] toArray() {
        return new int[]{this.left, this.top, this.right, this.bottom};
    }

    public String toString() {
        return "ZOMRect(" + this.left + ", " + this.top + " - " + this.right + ", " + this.bottom + ")";
    }

    public ZOMRect(float f11, float f12, float f13, float f14) {
        this.left = (int) f11;
        this.top = (int) f12;
        this.right = (int) f13;
        this.bottom = (int) f14;
    }

    public boolean contains(ZOMRect zOMRect) {
        int i11;
        int i12;
        int i13 = this.left;
        int i14 = this.right;
        return i13 < i14 && (i11 = this.top) < (i12 = this.bottom) && i13 <= zOMRect.left && i11 <= zOMRect.top && i14 >= zOMRect.right && i12 >= zOMRect.bottom;
    }
}

package com.zing.zalo.zinstant.zom.properties;

import android.text.TextUtils;
import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMBackground {
    public ZOMClickEffect mClickEffect;
    public ZOMFilter[] mFilters;
    public ZOMGradient mGradient;
    public ZOMValue mHeight;
    public ZOMValue mHorizontalPosition;
    String mImgSrc;
    public String mImgSrcExt;
    public boolean mPressedOverlay;
    public ZOMValue mVerticalPosition;
    public ZOMValue mWidth;
    public int mColor = 0;
    public int mPressedColor = 0;
    int mType = 0;
    public int mTintColor = 0;
    public int mRepeat = 0;

    /* renamed from: com.zing.zalo.zinstant.zom.properties.ZOMBackground$a */
    /* loaded from: classes7.dex */
    static class C17282a {
        /* renamed from: a */
        public void m92120a(ZOMBackground zOMBackground, int i11, int i12) {
            if (i11 < 3) {
                int i13 = zOMBackground.mColor;
                int i14 = 0;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = 0;
                }
                zOMBackground.mColor = i13;
                int i15 = zOMBackground.mPressedColor;
                if (i15 == Integer.MIN_VALUE) {
                    i15 = 0;
                }
                zOMBackground.mPressedColor = i15;
                int i16 = zOMBackground.mTintColor;
                if (i16 != Integer.MIN_VALUE) {
                    i14 = i16;
                }
                zOMBackground.mTintColor = i14;
            }
        }
    }

    public static ZOMBackground createObject() {
        return new ZOMBackground();
    }

    public String getSrc() {
        int i11 = this.mType;
        if (i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5 && i11 != 6) {
            return this.mImgSrc;
        }
        if (!TextUtils.isEmpty(this.mImgSrcExt)) {
            return this.mImgSrcExt;
        }
        return this.mImgSrc;
    }

    public int getType() {
        int i11 = this.mType;
        switch (i11) {
            case 0:
            case 1:
                return i11;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                if (!TextUtils.isEmpty(this.mImgSrcExt)) {
                    return this.mType;
                }
            default:
                return 0;
        }
    }

    public void updateData(int i11, int i12, byte[] bArr, byte[] bArr2, int i13, int i14, boolean z11, int i15, ZOMGradient zOMGradient, ZOMValue zOMValue, ZOMValue zOMValue2, ZOMValue zOMValue3, ZOMValue zOMValue4, Object[] objArr, ZOMClickEffect zOMClickEffect) {
        this.mColor = i11;
        this.mPressedColor = i12;
        this.mImgSrc = AbstractC28268b.m142407b(bArr);
        this.mImgSrcExt = AbstractC28268b.m142407b(bArr2);
        this.mType = i13;
        this.mTintColor = i14;
        this.mPressedOverlay = z11;
        this.mRepeat = i15;
        this.mGradient = zOMGradient;
        this.mHorizontalPosition = zOMValue;
        this.mVerticalPosition = zOMValue2;
        this.mWidth = zOMValue3;
        this.mHeight = zOMValue4;
        this.mFilters = (ZOMFilter[]) objArr;
        this.mClickEffect = zOMClickEffect;
    }
}

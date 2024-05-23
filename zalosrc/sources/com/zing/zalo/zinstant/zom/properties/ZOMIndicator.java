package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMIndicator {
    public int mActiveColor;
    public float mGapWidth;
    public float mHeight;
    public int mHorizontalAlign;
    public int mInactiveColor;
    public int mShape;
    public float mSize;
    public int mStrokeColor;
    public float mStrokeWidth;
    public float mTranslateX;
    public float mTranslateY;
    public int mVerticalAlign;
    public boolean mVisibleForOneItem;

    /* renamed from: com.zing.zalo.zinstant.zom.properties.ZOMIndicator$a */
    /* loaded from: classes7.dex */
    static class C17285a {
        /* renamed from: a */
        public void m92123a(ZOMIndicator zOMIndicator, int i11, int i12) {
            if (i11 < 2) {
                int i13 = zOMIndicator.mActiveColor;
                int i14 = 0;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = 0;
                }
                zOMIndicator.mActiveColor = i13;
                int i15 = zOMIndicator.mInactiveColor;
                if (i15 == Integer.MIN_VALUE) {
                    i15 = 0;
                }
                zOMIndicator.mInactiveColor = i15;
                int i16 = zOMIndicator.mStrokeColor;
                if (i16 != Integer.MIN_VALUE) {
                    i14 = i16;
                }
                zOMIndicator.mStrokeColor = i14;
            }
        }
    }

    public static ZOMIndicator createObject() {
        return new ZOMIndicator();
    }

    public void setData(int i11, int i12, float f11, float f12, int i13, float f13, float f14, float f15, float f16, int i14, int i15, int i16, boolean z11) {
        this.mVerticalAlign = i11;
        this.mHorizontalAlign = i12;
        this.mTranslateX = f11;
        this.mTranslateY = f12;
        this.mShape = i13;
        this.mSize = f13;
        this.mHeight = f14;
        this.mGapWidth = f15;
        this.mActiveColor = i14;
        this.mInactiveColor = i15;
        this.mStrokeColor = i16;
        this.mStrokeWidth = f16;
        this.mVisibleForOneItem = z11;
    }
}

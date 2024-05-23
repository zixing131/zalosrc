package com.zing.zalo.zinstant.zom.node;

/* loaded from: classes7.dex */
public class ZOMFontFace {
    public ZOMFont[] mFonts;
    private boolean invalidate = true;
    private boolean allowPreloadFont = true;

    public boolean needInvalidate() {
        ZOMFont[] zOMFontArr;
        if (this.invalidate && (zOMFontArr = this.mFonts) != null) {
            for (ZOMFont zOMFont : zOMFontArr) {
                if (zOMFont != null && zOMFont.needInvalidate()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean needPreload() {
        ZOMFont[] zOMFontArr;
        if (this.allowPreloadFont && (zOMFontArr = this.mFonts) != null) {
            for (ZOMFont zOMFont : zOMFontArr) {
                if (zOMFont != null && zOMFont.needPreload()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void preloadFontSuccess() {
        this.allowPreloadFont = false;
    }

    public void requestInvalidate() {
        this.invalidate = true;
    }

    public void setData(Object[] objArr) {
        this.mFonts = (ZOMFont[]) objArr;
        this.invalidate = false;
    }
}

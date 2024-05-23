package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMTransformElement {

    /* loaded from: classes7.dex */
    public static class Identity {
        public static ZOMTransformElement create(int i11) {
            ZOMTransformElement identity;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                identity = null;
                            } else {
                                identity = ZOMMatrix2D.identity();
                            }
                        } else {
                            identity = ZOMSkew.identity();
                        }
                    } else {
                        identity = ZOMRotate.identity();
                    }
                } else {
                    identity = ZOMScale.identity();
                }
            } else {
                identity = ZOMTranslate.identity();
            }
            if (identity == null) {
                return ZOMTranslate.identity();
            }
            return identity;
        }
    }

    public ZOMTransformElement cloneTransform() {
        return this;
    }

    public void combine(ZOMTransformElement zOMTransformElement, ZOMTransformElement zOMTransformElement2, float f11, float f12) {
    }

    public int getType() {
        return -1;
    }

    public boolean isIdentity() {
        return false;
    }

    public void postMatrix(ZOMMatrix2D zOMMatrix2D) {
    }

    public ZOMMatrix2D toMatrix2d() {
        return new ZOMMatrix2D();
    }
}

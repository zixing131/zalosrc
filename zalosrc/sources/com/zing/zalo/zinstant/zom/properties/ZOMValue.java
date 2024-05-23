package com.zing.zalo.zinstant.zom.properties;

import com.zing.zalo.zinstant.utils.AbstractC17201m;

/* loaded from: classes7.dex */
public class ZOMValue {
    public int mType;
    public float mValue;

    public ZOMValue() {
    }

    public ZOMValue(int i11, float f11) {
        this.mType = i11;
        this.mValue = f11;
    }

    public static ZOMValue createObject() {
        return new ZOMValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZOMValue)) {
            return false;
        }
        ZOMValue zOMValue = (ZOMValue) obj;
        if (this.mValue == zOMValue.mValue && this.mType == zOMValue.mType) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AbstractC17201m.m91818j(Float.valueOf(this.mValue), Integer.valueOf(this.mType));
    }
}

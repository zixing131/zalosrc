package com.zing.zalo.zinstant.zom.properties;

import vj0.AbstractC28268b;

/* loaded from: classes7.dex */
public class ZOMClick {
    public String mAction;
    public boolean mClickable;
    public String mData;

    public ZOMClick() {
        this.mClickable = false;
    }

    public static ZOMClick createObject() {
        return new ZOMClick();
    }

    public boolean valid() {
        return this.mClickable;
    }

    public ZOMClick(boolean z11, byte[] bArr, byte[] bArr2) {
        this.mClickable = z11;
        this.mAction = AbstractC28268b.m142407b(bArr);
        this.mData = AbstractC28268b.m142407b(bArr2);
    }
}

package com.zing.zalo.zinstant.zom.node;

import vj0.AbstractC28268b;
import vj0.C28273g;

/* loaded from: classes7.dex */
public class ZOMFont {
    public String fontFamily = "";
    public String fontSrc = "";
    public boolean preload = false;
    private boolean invalidate = false;

    public static ZOMFont createObject() {
        return new ZOMFont();
    }

    public void invalidate() {
        this.invalidate = true;
    }

    public boolean needInvalidate() {
        return this.invalidate;
    }

    public boolean needPreload() {
        if (this.preload && !C28273g.m142439i().m142456n(this)) {
            return true;
        }
        return false;
    }

    public void setData(byte[] bArr, byte[] bArr2, boolean z11) {
        this.fontFamily = AbstractC28268b.m142407b(bArr);
        this.fontSrc = AbstractC28268b.m142407b(bArr2);
        this.preload = z11;
        this.invalidate = false;
    }
}

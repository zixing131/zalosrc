package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMBoxShadow {
    public int blur;
    public int color;
    public int hOffset;
    public int spread;
    public int vOffset;

    /* renamed from: com.zing.zalo.zinstant.zom.properties.ZOMBoxShadow$a */
    /* loaded from: classes7.dex */
    static class C17284a {
        /* renamed from: a */
        public void m92122a(ZOMBoxShadow zOMBoxShadow, int i11, int i12) {
            if (i11 < 1) {
                int i13 = zOMBoxShadow.color;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = 0;
                }
                zOMBoxShadow.color = i13;
            }
        }
    }

    public ZOMBoxShadow() {
        this.hOffset = 0;
        this.vOffset = 0;
        this.blur = 0;
        this.spread = 0;
        this.color = 0;
    }

    public static ZOMBoxShadow createObject() {
        return new ZOMBoxShadow();
    }

    public String hash() {
        return String.valueOf(this.hOffset) + this.vOffset + this.blur + this.spread + this.color;
    }

    public ZOMBoxShadow(int i11, int i12, int i13, int i14, int i15) {
        this.hOffset = i11;
        this.vOffset = i12;
        this.blur = i13;
        this.color = i15;
        this.spread = i14;
    }
}

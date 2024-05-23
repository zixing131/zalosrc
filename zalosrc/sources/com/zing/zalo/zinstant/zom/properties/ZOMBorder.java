package com.zing.zalo.zinstant.zom.properties;

/* loaded from: classes7.dex */
public class ZOMBorder {
    public int color;
    public int width;

    /* renamed from: com.zing.zalo.zinstant.zom.properties.ZOMBorder$a */
    /* loaded from: classes7.dex */
    static class C17283a {
        /* renamed from: a */
        public void m92121a(ZOMBorder zOMBorder, int i11, int i12) {
            if (i11 < 1) {
                int i13 = zOMBorder.color;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = 0;
                }
                zOMBorder.color = i13;
            }
        }
    }

    public ZOMBorder() {
        this.color = 0;
        this.width = 0;
    }

    public static ZOMBorder createObject() {
        return new ZOMBorder();
    }

    public String hash() {
        return String.valueOf(this.color) + this.width;
    }

    public ZOMBorder(int i11, int i12) {
        this.width = i11;
        this.color = i12;
    }
}

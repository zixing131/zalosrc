package com.zing.zalo.location;

/* renamed from: com.zing.zalo.location.x */
/* loaded from: classes4.dex */
public enum EnumC8996x {
    TIME_INTERVAL(0),
    AIRPLANE_MODE(1),
    JOIN_NEW_WIFI(2);


    /* renamed from: p */
    private final int f48158p;

    EnumC8996x(int i11) {
        this.f48158p = i11;
    }

    /* renamed from: c */
    public static EnumC8996x m48092c(int i11) {
        for (EnumC8996x enumC8996x : values()) {
            if (enumC8996x.f48158p == i11) {
                return enumC8996x;
            }
        }
        return null;
    }

    /* renamed from: d */
    public int m48093d() {
        return this.f48158p;
    }
}

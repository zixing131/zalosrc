package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ev */
/* loaded from: classes2.dex */
public enum EnumC4478ev implements vu3 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);


    /* renamed from: w */
    private static final wu3 f19815w = new wu3() { // from class: com.google.android.gms.internal.ads.cv
    };

    /* renamed from: p */
    private final int f19817p;

    EnumC4478ev(int i11) {
        this.f19817p = i11;
    }

    /* renamed from: c */
    public static EnumC4478ev m21813c(int i11) {
        if (i11 == 0) {
            return UNSPECIFIED;
        }
        if (i11 == 1) {
            return CONNECTING;
        }
        if (i11 == 2) {
            return CONNECTED;
        }
        if (i11 == 3) {
            return DISCONNECTING;
        }
        if (i11 == 4) {
            return DISCONNECTED;
        }
        if (i11 != 5) {
            return null;
        }
        return SUSPENDED;
    }

    /* renamed from: d */
    public static xu3 m21814d() {
        return C4441dv.f19420a;
    }

    /* renamed from: b */
    public final int m21815b() {
        return this.f19817p;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f19817p);
    }
}

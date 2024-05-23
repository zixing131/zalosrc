package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u23 extends o33 {

    /* renamed from: a */
    private IBinder f28713a;

    /* renamed from: b */
    private String f28714b;

    /* renamed from: c */
    private int f28715c;

    /* renamed from: d */
    private float f28716d;

    /* renamed from: e */
    private int f28717e;

    /* renamed from: f */
    private String f28718f;

    /* renamed from: g */
    private byte f28719g;

    @Override // com.google.android.gms.internal.ads.o33
    /* renamed from: a */
    public final o33 mo25067a(String str) {
        this.f28718f = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.o33
    /* renamed from: b */
    public final o33 mo25068b(String str) {
        this.f28714b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.o33
    /* renamed from: c */
    public final o33 mo25069c(int i11) {
        this.f28719g = (byte) (this.f28719g | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.o33
    /* renamed from: d */
    public final o33 mo25070d(int i11) {
        this.f28715c = i11;
        this.f28719g = (byte) (this.f28719g | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.o33
    /* renamed from: e */
    public final o33 mo25071e(float f11) {
        this.f28716d = f11;
        this.f28719g = (byte) (this.f28719g | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.o33
    /* renamed from: f */
    public final o33 mo25072f(boolean z11) {
        this.f28719g = (byte) (this.f28719g | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.o33
    /* renamed from: g */
    public final o33 mo25073g(IBinder iBinder) {
        if (iBinder != null) {
            this.f28713a = iBinder;
            return this;
        }
        throw new NullPointerException("Null windowToken");
    }

    @Override // com.google.android.gms.internal.ads.o33
    /* renamed from: h */
    public final o33 mo25074h(int i11) {
        this.f28717e = i11;
        this.f28719g = (byte) (this.f28719g | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.o33
    /* renamed from: i */
    public final p33 mo25075i() {
        IBinder iBinder;
        if (this.f28719g == 31 && (iBinder = this.f28713a) != null) {
            return new w23(iBinder, false, this.f28714b, this.f28715c, this.f28716d, 0, null, this.f28717e, this.f28718f, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f28713a == null) {
            sb2.append(" windowToken");
        }
        if ((this.f28719g & 1) == 0) {
            sb2.append(" stableSessionToken");
        }
        if ((this.f28719g & 2) == 0) {
            sb2.append(" layoutGravity");
        }
        if ((this.f28719g & 4) == 0) {
            sb2.append(" layoutVerticalMargin");
        }
        if ((this.f28719g & 8) == 0) {
            sb2.append(" displayMode");
        }
        if ((this.f28719g & 16) == 0) {
            sb2.append(" windowWidthPx");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes2.dex */
public final class ps0 {

    /* renamed from: a */
    private final int f26322a;

    /* renamed from: b */
    public final int f26323b;

    /* renamed from: c */
    public final int f26324c;

    private ps0(int i11, int i12, int i13) {
        this.f26322a = i11;
        this.f26324c = i12;
        this.f26323b = i13;
    }

    /* renamed from: a */
    public static ps0 m25531a() {
        return new ps0(0, 0, 0);
    }

    /* renamed from: b */
    public static ps0 m25532b(int i11, int i12) {
        return new ps0(1, i11, i12);
    }

    /* renamed from: c */
    public static ps0 m25533c(zzq zzqVar) {
        if (zzqVar.zzd) {
            return new ps0(3, 0, 0);
        }
        if (zzqVar.zzi) {
            return new ps0(2, 0, 0);
        }
        if (zzqVar.zzh) {
            return m25531a();
        }
        return m25532b(zzqVar.zzf, zzqVar.zzc);
    }

    /* renamed from: d */
    public static ps0 m25534d() {
        return new ps0(5, 0, 0);
    }

    /* renamed from: e */
    public static ps0 m25535e() {
        return new ps0(4, 0, 0);
    }

    /* renamed from: f */
    public final boolean m25536f() {
        return this.f26322a == 0;
    }

    /* renamed from: g */
    public final boolean m25537g() {
        return this.f26322a == 2;
    }

    /* renamed from: h */
    public final boolean m25538h() {
        return this.f26322a == 5;
    }

    /* renamed from: i */
    public final boolean m25539i() {
        return this.f26322a == 3;
    }

    /* renamed from: j */
    public final boolean m25540j() {
        return this.f26322a == 4;
    }
}

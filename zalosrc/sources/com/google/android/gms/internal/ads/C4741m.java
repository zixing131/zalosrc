package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.m */
/* loaded from: classes2.dex */
public class C4741m implements InterfaceC4779n {

    /* renamed from: a */
    private final long f24322a;

    /* renamed from: b */
    private final C4704l f24323b;

    public C4741m(long j11, long j12) {
        C4816o c4816o;
        this.f24322a = j11;
        if (j12 == 0) {
            c4816o = C4816o.f25384c;
        } else {
            c4816o = new C4816o(0L, j12);
        }
        this.f24323b = new C4704l(c4816o, c4816o);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        return this.f24323b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f24322a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return false;
    }
}

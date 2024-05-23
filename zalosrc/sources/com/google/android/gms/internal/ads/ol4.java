package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class ol4 implements InterfaceC4779n {

    /* renamed from: a */
    private final rl4 f25685a;

    /* renamed from: b */
    private final long f25686b;

    /* renamed from: c */
    private final long f25687c;

    /* renamed from: d */
    private final long f25688d;

    /* renamed from: e */
    private final long f25689e;

    /* renamed from: f */
    private final long f25690f;

    public ol4(rl4 rl4Var, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.f25685a = rl4Var;
        this.f25686b = j11;
        this.f25687c = j13;
        this.f25688d = j14;
        this.f25689e = j15;
        this.f25690f = j16;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    /* renamed from: b */
    public final C4704l mo20362b(long j11) {
        C4816o c4816o = new C4816o(j11, ql4.m25785f(this.f25685a.mo24425a(j11), 0L, this.f25687c, this.f25688d, this.f25689e, this.f25690f));
        return new C4704l(c4816o, c4816o);
    }

    /* renamed from: g */
    public final long m25215g(long j11) {
        return this.f25685a.mo24425a(j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final long zze() {
        return this.f25686b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4779n
    public final boolean zzh() {
        return true;
    }
}

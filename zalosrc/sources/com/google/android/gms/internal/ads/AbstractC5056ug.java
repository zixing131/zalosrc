package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ug */
/* loaded from: classes2.dex */
public abstract class AbstractC5056ug implements InterfaceC4760mh, InterfaceC4797nh {

    /* renamed from: a */
    private final int f28857a;

    /* renamed from: b */
    private C4834oh f28858b;

    /* renamed from: c */
    private int f28859c;

    /* renamed from: d */
    private int f28860d;

    /* renamed from: e */
    private InterfaceC4951rm f28861e;

    /* renamed from: f */
    private long f28862f;

    /* renamed from: g */
    private boolean f28863g = true;

    /* renamed from: h */
    private boolean f28864h;

    public AbstractC5056ug(int i11) {
        this.f28857a = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean m26923d() {
        if (this.f28863g) {
            return this.f28864h;
        }
        return this.f28861e.zze();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final int m26924e() {
        return this.f28859c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public final int m26925f(C4648jh c4648jh, C4392cj c4392cj, boolean z11) {
        int mo20172b = this.f28861e.mo20172b(c4648jh, c4392cj, z11);
        if (mo20172b == -4) {
            if (c4392cj.m26971f()) {
                this.f28863g = true;
                if (this.f28864h) {
                    return -4;
                }
                return -3;
            }
            c4392cj.f18448d += this.f28862f;
        } else if (mo20172b == -5) {
            zzasw zzaswVar = c4648jh.f22819a;
            long j11 = zzaswVar.f31826L;
            if (j11 != Long.MAX_VALUE) {
                c4648jh.f22819a = new zzasw(zzaswVar.f31831p, zzaswVar.f31835t, zzaswVar.f31836u, zzaswVar.f31833r, zzaswVar.f31832q, zzaswVar.f31837v, zzaswVar.f31840y, zzaswVar.f31841z, zzaswVar.f31815A, zzaswVar.f31816B, zzaswVar.f31817C, zzaswVar.f31819E, zzaswVar.f31818D, zzaswVar.f31820F, zzaswVar.f31821G, zzaswVar.f31822H, zzaswVar.f31823I, zzaswVar.f31824J, zzaswVar.f31825K, zzaswVar.f31827M, zzaswVar.f31828N, zzaswVar.f31829O, j11 + this.f28862f, zzaswVar.f31838w, zzaswVar.f31839x, zzaswVar.f31834s);
                return -5;
            }
        }
        return mo20172b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public final C4834oh m26926g() {
        return this.f28858b;
    }

    /* renamed from: i */
    protected abstract void mo21475i();

    /* renamed from: j */
    protected abstract void mo21476j(boolean z11);

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    /* renamed from: k */
    public final void mo24568k() {
        boolean z11 = true;
        if (this.f28860d != 1) {
            z11 = false;
        }
        AbstractC4361bo.m20613e(z11);
        this.f28860d = 2;
        mo25715t();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    /* renamed from: l */
    public final void mo24569l(int i11) {
        this.f28859c = i11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    /* renamed from: n */
    public final void mo24570n(zzasw[] zzaswVarArr, InterfaceC4951rm interfaceC4951rm, long j11) {
        AbstractC4361bo.m20613e(!this.f28864h);
        this.f28861e = interfaceC4951rm;
        this.f28863g = false;
        this.f28862f = j11;
        mo26927v(zzaswVarArr, j11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    /* renamed from: o */
    public final void mo24571o(long j11) {
        this.f28864h = false;
        this.f28863g = false;
        mo21478s(j11, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    /* renamed from: r */
    public final void mo24572r(C4834oh c4834oh, zzasw[] zzaswVarArr, InterfaceC4951rm interfaceC4951rm, long j11, boolean z11, long j12) {
        boolean z12;
        if (this.f28860d == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC4361bo.m20613e(z12);
        this.f28858b = c4834oh;
        this.f28860d = 1;
        mo21476j(z11);
        mo24570n(zzaswVarArr, interfaceC4951rm, j12);
        mo21478s(j11, z11);
    }

    /* renamed from: s */
    protected abstract void mo21478s(long j11, boolean z11);

    /* renamed from: t */
    protected abstract void mo25715t();

    /* renamed from: u */
    protected abstract void mo25716u();

    /* renamed from: v */
    protected void mo26927v(zzasw[] zzaswVarArr, long j11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: w */
    public final void m26928w(long j11) {
        this.f28861e.mo20171a(j11 - this.f28862f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public final boolean zzA() {
        return this.f28863g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public final boolean zzB() {
        return this.f28864h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public final int zzb() {
        return this.f28860d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh, com.google.android.gms.internal.ads.InterfaceC4797nh
    public final int zzc() {
        return this.f28857a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public final InterfaceC4797nh zzf() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public final InterfaceC4951rm zzh() {
        return this.f28861e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public InterfaceC4508fo zzi() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public final void zzj() {
        boolean z11 = true;
        if (this.f28860d != 1) {
            z11 = false;
        }
        AbstractC4361bo.m20613e(z11);
        this.f28860d = 0;
        this.f28861e = null;
        this.f28864h = false;
        mo21475i();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public final void zzm() {
        this.f28861e.zzc();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public final void zzv() {
        this.f28864h = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4760mh
    public final void zzz() {
        boolean z11;
        if (this.f28860d == 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20613e(z11);
        this.f28860d = 1;
        mo25716u();
    }
}

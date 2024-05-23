package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class mg4 extends he4 implements dg4 {

    /* renamed from: h */
    private final C4330au f24515h;

    /* renamed from: i */
    private final AbstractC4432dm f24516i;

    /* renamed from: j */
    private final pi2 f24517j;

    /* renamed from: k */
    private final jc4 f24518k;

    /* renamed from: l */
    private final int f24519l;

    /* renamed from: m */
    private boolean f24520m;

    /* renamed from: n */
    private long f24521n;

    /* renamed from: o */
    private boolean f24522o;

    /* renamed from: p */
    private boolean f24523p;

    /* renamed from: q */
    private dc3 f24524q;

    /* renamed from: r */
    private final jg4 f24525r;

    /* renamed from: s */
    private final nj4 f24526s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ mg4(C4330au c4330au, pi2 pi2Var, jg4 jg4Var, jc4 jc4Var, nj4 nj4Var, int i11, lg4 lg4Var, byte[] bArr) {
        AbstractC4432dm abstractC4432dm = c4330au.f17245b;
        abstractC4432dm.getClass();
        this.f24516i = abstractC4432dm;
        this.f24515h = c4330au;
        this.f24517j = pi2Var;
        this.f24525r = jg4Var;
        this.f24518k = jc4Var;
        this.f24526s = nj4Var;
        this.f24519l = i11;
        this.f24520m = true;
        this.f24521n = -9223372036854775807L;
    }

    /* renamed from: z */
    private final void m24567z() {
        C4688kk c4688kk;
        mr0 mr0Var;
        long j11 = this.f24521n;
        boolean z11 = this.f24522o;
        boolean z12 = this.f24523p;
        C4330au c4330au = this.f24515h;
        if (z12) {
            c4688kk = c4330au.f17247d;
        } else {
            c4688kk = null;
        }
        ah4 ah4Var = new ah4(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j11, j11, 0L, 0L, z11, false, false, null, c4330au, c4688kk);
        if (this.f24520m) {
            mr0Var = new ig4(this, ah4Var);
        } else {
            mr0Var = ah4Var;
        }
        m22814w(mr0Var);
    }

    @Override // com.google.android.gms.internal.ads.dg4
    /* renamed from: c */
    public final void mo21385c(long j11, boolean z11, boolean z12) {
        if (j11 == -9223372036854775807L) {
            j11 = this.f24521n;
        }
        if (!this.f24520m && this.f24521n == j11 && this.f24522o == z11 && this.f24523p == z12) {
            return;
        }
        this.f24521n = j11;
        this.f24522o = z11;
        this.f24523p = z12;
        this.f24520m = false;
        m24567z();
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: d */
    public final void mo20506d(ef4 ef4Var) {
        ((hg4) ef4Var).m22854v();
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: g */
    public final void mo20507g() {
    }

    @Override // com.google.android.gms.internal.ads.if4
    /* renamed from: j */
    public final ef4 mo20508j(gf4 gf4Var, jj4 jj4Var, long j11) {
        qj2 zza = this.f24517j.zza();
        dc3 dc3Var = this.f24524q;
        if (dc3Var != null) {
            zza.mo20854g(dc3Var);
        }
        Uri uri = this.f24516i.f19327a;
        jg4 jg4Var = this.f24525r;
        m22807o();
        ie4 ie4Var = new ie4(jg4Var.f22818a);
        jc4 jc4Var = this.f24518k;
        dc4 m22808p = m22808p(gf4Var);
        nj4 nj4Var = this.f24526s;
        pf4 m22810r = m22810r(gf4Var);
        String str = this.f24516i.f19330d;
        return new hg4(uri, zza, ie4Var, jc4Var, m22808p, nj4Var, m22810r, this, jj4Var, null, this.f24519l, null);
    }

    @Override // com.google.android.gms.internal.ads.he4
    /* renamed from: v */
    protected final void mo20509v(dc3 dc3Var) {
        this.f24524q = dc3Var;
        Looper.myLooper().getClass();
        m22807o();
        m24567z();
    }

    @Override // com.google.android.gms.internal.ads.he4
    /* renamed from: x */
    protected final void mo20510x() {
    }

    @Override // com.google.android.gms.internal.ads.if4
    public final C4330au zzz() {
        return this.f24515h;
    }
}

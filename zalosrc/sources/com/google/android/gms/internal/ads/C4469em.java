package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.ads.em */
/* loaded from: classes2.dex */
public final class C4469em implements InterfaceC4617im, InterfaceC4580hm {

    /* renamed from: p */
    private final Uri f19674p;

    /* renamed from: q */
    private final InterfaceC4803nn f19675q;

    /* renamed from: r */
    private final InterfaceC4724lj f19676r;

    /* renamed from: s */
    private final int f19677s;

    /* renamed from: t */
    private final Handler f19678t;

    /* renamed from: u */
    private final InterfaceC4395cm f19679u;

    /* renamed from: v */
    private final C4909qh f19680v = new C4909qh();

    /* renamed from: w */
    private final int f19681w;

    /* renamed from: x */
    private InterfaceC4580hm f19682x;

    /* renamed from: y */
    private AbstractC4983sh f19683y;

    /* renamed from: z */
    private boolean f19684z;

    public C4469em(Uri uri, InterfaceC4803nn interfaceC4803nn, InterfaceC4724lj interfaceC4724lj, int i11, Handler handler, InterfaceC4395cm interfaceC4395cm, String str, int i12) {
        this.f19674p = uri;
        this.f19675q = interfaceC4803nn;
        this.f19676r = interfaceC4724lj;
        this.f19677s = i11;
        this.f19678t = handler;
        this.f19679u = interfaceC4395cm;
        this.f19681w = i12;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4617im
    /* renamed from: a */
    public final InterfaceC4543gm mo21747a(int i11, C4915qn c4915qn) {
        boolean z11;
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4361bo.m20611c(z11);
        return new C4359bm(this.f19674p, this.f19675q.zza(), this.f19676r.zza(), this.f19677s, this.f19678t, this.f19679u, this, c4915qn, null, this.f19681w, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4580hm
    /* renamed from: b */
    public final void mo21748b(AbstractC4983sh abstractC4983sh, Object obj) {
        C4909qh c4909qh = this.f19680v;
        boolean z11 = false;
        abstractC4983sh.mo25467d(0, c4909qh, false);
        if (c4909qh.f26778c != -9223372036854775807L) {
            z11 = true;
        }
        if (this.f19684z && !z11) {
            return;
        }
        this.f19683y = abstractC4983sh;
        this.f19684z = z11;
        this.f19682x.mo21748b(abstractC4983sh, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4617im
    /* renamed from: c */
    public final void mo21749c(InterfaceC5242zg interfaceC5242zg, boolean z11, InterfaceC4580hm interfaceC4580hm) {
        this.f19682x = interfaceC4580hm;
        C5062um c5062um = new C5062um(-9223372036854775807L, false);
        this.f19683y = c5062um;
        interfaceC4580hm.mo21748b(c5062um, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4617im
    /* renamed from: d */
    public final void mo21750d(InterfaceC4543gm interfaceC4543gm) {
        ((C4359bm) interfaceC4543gm).m20584A();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4617im
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4617im
    public final void zzd() {
        this.f19682x = null;
    }
}

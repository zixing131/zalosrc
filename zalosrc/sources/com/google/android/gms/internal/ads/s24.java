package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes2.dex */
public final class s24 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, dl4, z94, eh4, ge4, ps3, lo3, j44, c14 {

    /* renamed from: p */
    final /* synthetic */ w24 f27510p;

    public /* synthetic */ s24(w24 w24Var, r24 r24Var) {
        this.f27510p = w24Var;
    }

    @Override // com.google.android.gms.internal.ads.dl4
    /* renamed from: a */
    public final void mo21480a(C4671k3 c4671k3, lw3 lw3Var) {
        r44 r44Var;
        this.f27510p.f29690K = c4671k3;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25969d(c4671k3, lw3Var);
    }

    @Override // com.google.android.gms.internal.ads.dl4
    /* renamed from: b */
    public final void mo21481b(long j11, int i11) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25973i(j11, i11);
    }

    @Override // com.google.android.gms.internal.ads.z94
    /* renamed from: c */
    public final void mo26233c(lv3 lv3Var) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25966a(lv3Var);
        this.f27510p.f29691L = null;
        this.f27510p.f29699T = null;
    }

    @Override // com.google.android.gms.internal.ads.z94
    /* renamed from: d */
    public final void mo26234d(lv3 lv3Var) {
        r44 r44Var;
        this.f27510p.f29699T = lv3Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25972g(lv3Var);
    }

    @Override // com.google.android.gms.internal.ads.z94
    /* renamed from: e */
    public final void mo26235e(Exception exc) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25975k(exc);
    }

    @Override // com.google.android.gms.internal.ads.z94
    /* renamed from: f */
    public final void mo26236f(C4671k3 c4671k3, lw3 lw3Var) {
        r44 r44Var;
        this.f27510p.f29691L = c4671k3;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25959B(c4671k3, lw3Var);
    }

    @Override // com.google.android.gms.internal.ads.dl4
    /* renamed from: g */
    public final void mo21482g(lv3 lv3Var) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25961K(lv3Var);
        this.f27510p.f29690K = null;
        this.f27510p.f29698S = null;
    }

    @Override // com.google.android.gms.internal.ads.dl4
    /* renamed from: h */
    public final void mo21483h(lv3 lv3Var) {
        r44 r44Var;
        this.f27510p.f29698S = lv3Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25977m(lv3Var);
    }

    @Override // com.google.android.gms.internal.ads.z94
    /* renamed from: i */
    public final void mo26237i(long j11) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25958A(j11);
    }

    @Override // com.google.android.gms.internal.ads.z94
    /* renamed from: j */
    public final void mo26238j(boolean z11) {
        boolean z12;
        jo1 jo1Var;
        w24 w24Var = this.f27510p;
        z12 = w24Var.f29703X;
        if (z12 != z11) {
            w24Var.f29703X = z11;
            jo1Var = this.f27510p.f29724k;
            jo1Var.m23692d(23, new gl1() { // from class: com.google.android.gms.internal.ads.p24

                /* renamed from: a */
                public final /* synthetic */ boolean f26045a;

                public /* synthetic */ p24(boolean z112) {
                    r1 = z112;
                }

                @Override // com.google.android.gms.internal.ads.gl1
                public final void zza(Object obj) {
                    ((ih0) obj).mo23257h(r1);
                }
            });
            jo1Var.m23691c();
        }
    }

    @Override // com.google.android.gms.internal.ads.dl4
    /* renamed from: k */
    public final void mo21484k(int i11, long j11) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25960E(i11, j11);
    }

    @Override // com.google.android.gms.internal.ads.dl4
    /* renamed from: l */
    public final void mo21485l(String str) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25971f(str);
    }

    @Override // com.google.android.gms.internal.ads.z94
    /* renamed from: m */
    public final void mo26239m(Exception exc) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25976l(exc);
    }

    @Override // com.google.android.gms.internal.ads.z94
    /* renamed from: n */
    public final void mo26240n(String str, long j11, long j12) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25978o(str, j11, j12);
    }

    @Override // com.google.android.gms.internal.ads.z94
    /* renamed from: o */
    public final void mo26241o(String str) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.zzA(str);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
        w24.m27495o(this.f27510p, surfaceTexture);
        this.f27510p.m27469Q(i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f27510p.m27472T(null);
        this.f27510p.m27469Q(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
        this.f27510p.m27469Q(i11, i12);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.google.android.gms.internal.ads.z94
    /* renamed from: p */
    public final void mo26242p(int i11, long j11, long j12) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25962R(i11, j11, j12);
    }

    @Override // com.google.android.gms.internal.ads.dl4
    /* renamed from: q */
    public final void mo21486q(Exception exc) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25967b(exc);
    }

    @Override // com.google.android.gms.internal.ads.dl4
    /* renamed from: r */
    public final void mo21487r(String str, long j11, long j12) {
        r44 r44Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25968c(str, j11, j12);
    }

    @Override // com.google.android.gms.internal.ads.dl4
    /* renamed from: s */
    public final void mo21488s(s41 s41Var) {
        jo1 jo1Var;
        this.f27510p.f29710c0 = s41Var;
        jo1Var = this.f27510p.f29724k;
        jo1Var.m23692d(25, new gl1() { // from class: com.google.android.gms.internal.ads.q24
            public /* synthetic */ q24() {
            }

            @Override // com.google.android.gms.internal.ads.gl1
            public final void zza(Object obj) {
                ((ih0) obj).mo23261s(s41.this);
            }
        });
        jo1Var.m23691c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
        this.f27510p.m27469Q(i12, i13);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f27510p.m27469Q(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.dl4
    /* renamed from: t */
    public final void mo21489t(Object obj, long j11) {
        r44 r44Var;
        Object obj2;
        jo1 jo1Var;
        r44Var = this.f27510p.f29730q;
        r44Var.mo25964V(obj, j11);
        w24 w24Var = this.f27510p;
        obj2 = w24Var.f29693N;
        if (obj2 == obj) {
            jo1Var = w24Var.f29724k;
            jo1Var.m23692d(26, m24.f24352a);
            jo1Var.m23691c();
        }
    }

    @Override // com.google.android.gms.internal.ads.c14
    public final void zza(boolean z11) {
        this.f27510p.m27476X();
    }
}

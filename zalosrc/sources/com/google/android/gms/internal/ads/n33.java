package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import p342m6.C22890k;

/* loaded from: classes2.dex */
final class n33 {

    /* renamed from: c */
    private static final a43 f24995c = new a43("OverlayDisplayService");

    /* renamed from: d */
    private static final Intent f24996d = new Intent("com.google.android.play.core.lmd.BIND_OVERLAY_DISPLAY_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    final l43 f24997a;

    /* renamed from: b */
    private final String f24998b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n33(Context context) {
        if (n43.m24853a(context)) {
            this.f24997a = new l43(context.getApplicationContext(), f24995c, "OverlayDisplayService", f24996d, i33.f22038a, null, null);
        } else {
            this.f24997a = null;
        }
        this.f24998b = context.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m24807c() {
        if (this.f24997a == null) {
            return;
        }
        f24995c.m19981d("unbind LMD display overlay service", new Object[0]);
        this.f24997a.m24132r();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m24808d(e33 e33Var, s33 s33Var) {
        if (this.f24997a == null) {
            f24995c.m19979b("error: %s", "Play Store not found.");
        } else {
            C22890k c22890k = new C22890k();
            this.f24997a.m24130p(new k33(this, c22890k, e33Var, s33Var, c22890k), c22890k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m24809e(p33 p33Var, s33 s33Var) {
        if (this.f24997a == null) {
            f24995c.m19979b("error: %s", "Play Store not found.");
            return;
        }
        if (p33Var.mo25393g() == null) {
            f24995c.m19979b("Failed to convert OverlayDisplayShowRequest when to create a new session: appId cannot be null.", new Object[0]);
            q33 m25946c = r33.m25946c();
            m25946c.mo25650b(8160);
            s33Var.zza(m25946c.mo25651c());
            return;
        }
        C22890k c22890k = new C22890k();
        this.f24997a.m24130p(new j33(this, c22890k, p33Var, s33Var, c22890k), c22890k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m24810f(u33 u33Var, s33 s33Var, int i11) {
        if (this.f24997a == null) {
            f24995c.m19979b("error: %s", "Play Store not found.");
        } else {
            C22890k c22890k = new C22890k();
            this.f24997a.m24130p(new l33(this, c22890k, u33Var, i11, s33Var, c22890k), c22890k);
        }
    }
}

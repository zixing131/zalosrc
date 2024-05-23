package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Collections;

/* loaded from: classes2.dex */
final class wk2 implements cb2 {

    /* renamed from: a */
    final /* synthetic */ xk2 f29980a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wk2(xk2 xk2Var) {
        this.f29980a = xk2Var;
    }

    @Override // com.google.android.gms.internal.ads.cb2
    public final void zza() {
        this.f29980a.f30516z = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0048, code lost:            if (r0.f32032r < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzay.zzc().m21823b(com.google.android.gms.internal.ads.AbstractC4554gx.f21341p4)).intValue()) goto L9;     */
    @Override // com.google.android.gms.internal.ads.cb2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        int i11;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        zzq m23005a;
        ViewGroup viewGroup5;
        zzq m23005a2;
        yl2 yl2Var;
        zzcgv zzcgvVar;
        a11 a11Var = (a11) obj;
        a11 a11Var2 = this.f29980a.f30516z;
        if (a11Var2 != null) {
            a11Var2.mo23795a();
        }
        xk2 xk2Var = this.f29980a;
        xk2Var.f30516z = a11Var;
        viewGroup = xk2Var.f30508r;
        viewGroup.removeAllViews();
        viewGroup2 = this.f29980a.f30508r;
        View m19946i = a11Var.m19946i();
        zzt.zzp();
        viewGroup2.addView(m19946i, zzs.zzn());
        if (!a11Var.m19949l()) {
            zzcgvVar = this.f29980a.f30513w;
        }
        zzr m27918I3 = xk2.m27918I3(this.f29980a, a11Var);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        boolean z11 = true;
        if (true != a11Var.m19952o()) {
            i11 = 9;
        } else {
            i11 = 11;
        }
        layoutParams.addRule(i11);
        if (!a11Var.m19951n() || a11Var.m19950m()) {
            z11 = false;
        }
        m27918I3.zzb(z11);
        viewGroup3 = this.f29980a.f30508r;
        viewGroup3.addView(m27918I3, layoutParams);
        a11Var.m19948k(this.f29980a);
        xk2 xk2Var2 = this.f29980a;
        viewGroup4 = xk2Var2.f30508r;
        m23005a = hr2.m23005a(xk2Var2.f30507q, Collections.singletonList(xk2Var2.f30516z.m19947j()));
        viewGroup4.setMinimumHeight(m23005a.zzc);
        xk2 xk2Var3 = this.f29980a;
        viewGroup5 = xk2Var3.f30508r;
        m23005a2 = hr2.m23005a(xk2Var3.f30507q, Collections.singletonList(xk2Var3.f30516z.m19947j()));
        viewGroup5.setMinimumWidth(m23005a2.zzf);
        xk2 xk2Var4 = this.f29980a;
        yl2Var = xk2Var4.f30512v;
        yl2Var.m28228k(new n11(a11Var, xk2Var4));
        a11Var.mo20375b();
    }
}

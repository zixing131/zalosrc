package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;

/* loaded from: classes2.dex */
public final class l11 extends AbstractBinderC4622ir {

    /* renamed from: p */
    private final k11 f23669p;

    /* renamed from: q */
    private final zzbs f23670q;

    /* renamed from: r */
    private final yl2 f23671r;

    /* renamed from: s */
    private boolean f23672s = false;

    public l11(k11 k11Var, zzbs zzbsVar, yl2 yl2Var) {
        this.f23669p = k11Var;
        this.f23670q = zzbsVar;
        this.f23671r = yl2Var;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658jr
    /* renamed from: E1 */
    public final void mo23001E1(zzde zzdeVar) {
        AbstractC4205o.m19717f("setOnPaidEventListener must be called on the main UI thread.");
        yl2 yl2Var = this.f23671r;
        if (yl2Var != null) {
            yl2Var.m28231r(zzdeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658jr
    /* renamed from: u2 */
    public final void mo23002u2(boolean z11) {
        this.f23672s = z11;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658jr
    /* renamed from: v3 */
    public final void mo23725v3(C4807nr c4807nr) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658jr
    /* renamed from: x3 */
    public final void mo23003x3(InterfaceC4271b interfaceC4271b, InterfaceC4919qr interfaceC4919qr) {
        try {
            this.f23671r.m28226G(interfaceC4919qr);
            this.f23669p.m23798j((Activity) BinderC4273d.m19914Q(interfaceC4271b), interfaceC4919qr, this.f23672s);
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658jr
    public final zzbs zze() {
        return this.f23670q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4658jr
    public final zzdh zzf() {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21097Q5)).booleanValue()) {
            return null;
        }
        return this.f23669p.m27145c();
    }
}

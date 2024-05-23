package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.BinderC4273d;

/* loaded from: classes2.dex */
public final class d00 implements NativeCustomTemplateAd.DisplayOpenMeasurement {

    /* renamed from: a */
    private final e10 f19048a;

    public d00(e10 e10Var) {
        this.f19048a = e10Var;
        try {
            e10Var.zzm();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final void setView(View view) {
        try {
            this.f19048a.mo20782e1(BinderC4273d.m19913I3(view));
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd.DisplayOpenMeasurement
    public final boolean start() {
        try {
            return this.f19048a.zzs();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return false;
        }
    }
}

package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzdn;

/* loaded from: classes2.dex */
public final class hp1 extends VideoController.VideoLifecycleCallbacks {

    /* renamed from: a */
    private final vj1 f21871a;

    public hp1(vj1 vj1Var) {
        this.f21871a = vj1Var;
    }

    /* renamed from: a */
    private static zzdn m22992a(vj1 vj1Var) {
        com.google.android.gms.ads.internal.client.zzdk m27249R = vj1Var.m27249R();
        if (m27249R == null) {
            return null;
        }
        try {
            return m27249R.zzi();
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoEnd() {
        zzdn m22992a = m22992a(this.f21871a);
        if (m22992a == null) {
            return;
        }
        try {
            m22992a.zze();
        } catch (RemoteException e11) {
            yk0.zzk("Unable to call onVideoEnd()", e11);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoPause() {
        zzdn m22992a = m22992a(this.f21871a);
        if (m22992a == null) {
            return;
        }
        try {
            m22992a.zzg();
        } catch (RemoteException e11) {
            yk0.zzk("Unable to call onVideoEnd()", e11);
        }
    }

    @Override // com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks
    public final void onVideoStart() {
        zzdn m22992a = m22992a(this.f21871a);
        if (m22992a == null) {
            return;
        }
        try {
            m22992a.zzi();
        } catch (RemoteException e11) {
            yk0.zzk("Unable to call onVideoEnd()", e11);
        }
    }
}

package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* loaded from: classes2.dex */
final class cm0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ MediaPlayer f18480p;

    /* renamed from: q */
    final /* synthetic */ zzcic f18481q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cm0(zzcic zzcicVar, MediaPlayer mediaPlayer) {
        this.f18481q = zzcicVar;
        this.f18480p = mediaPlayer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm0 mm0Var;
        mm0 mm0Var2;
        zzcic.m28728K(this.f18481q, this.f18480p);
        zzcic zzcicVar = this.f18481q;
        mm0Var = zzcicVar.f32041F;
        if (mm0Var != null) {
            mm0Var2 = zzcicVar.f32041F;
            mm0Var2.zzf();
        }
    }
}

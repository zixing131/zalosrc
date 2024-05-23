package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class jm0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzcic f22880p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jm0(zzcic zzcicVar) {
        this.f22880p = zzcicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm0 mm0Var;
        boolean z11;
        mm0 mm0Var2;
        mm0 mm0Var3;
        zzcic zzcicVar = this.f22880p;
        mm0Var = zzcicVar.f32041F;
        if (mm0Var != null) {
            z11 = zzcicVar.f32042G;
            if (!z11) {
                mm0Var3 = zzcicVar.f32041F;
                mm0Var3.zzg();
                this.f22880p.f32042G = true;
            }
            mm0Var2 = this.f22880p.f32041F;
            mm0Var2.zze();
        }
    }
}

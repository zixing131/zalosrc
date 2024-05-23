package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class fm0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzcic f20189p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public fm0(zzcic zzcicVar) {
        this.f20189p = zzcicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm0 mm0Var;
        mm0 mm0Var2;
        zzcic zzcicVar = this.f20189p;
        mm0Var = zzcicVar.f32041F;
        if (mm0Var != null) {
            mm0Var2 = zzcicVar.f32041F;
            mm0Var2.zzh();
        }
    }
}

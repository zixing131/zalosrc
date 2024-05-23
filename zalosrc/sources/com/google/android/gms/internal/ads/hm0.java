package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class hm0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ zzcic f21837p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hm0(zzcic zzcicVar) {
        this.f21837p = zzcicVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm0 mm0Var;
        mm0 mm0Var2;
        mm0 mm0Var3;
        zzcic zzcicVar = this.f21837p;
        mm0Var = zzcicVar.f32041F;
        if (mm0Var != null) {
            mm0Var2 = zzcicVar.f32041F;
            mm0Var2.zzd();
            mm0Var3 = this.f21837p.f32041F;
            mm0Var3.zzi();
        }
    }
}

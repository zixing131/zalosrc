package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class gm0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ int f20730p;

    /* renamed from: q */
    final /* synthetic */ int f20731q;

    /* renamed from: r */
    final /* synthetic */ zzcic f20732r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gm0(zzcic zzcicVar, int i11, int i12) {
        this.f20732r = zzcicVar;
        this.f20730p = i11;
        this.f20731q = i12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm0 mm0Var;
        mm0 mm0Var2;
        zzcic zzcicVar = this.f20732r;
        mm0Var = zzcicVar.f32041F;
        if (mm0Var != null) {
            mm0Var2 = zzcicVar.f32041F;
            mm0Var2.mo24630a(this.f20730p, this.f20731q);
        }
    }
}

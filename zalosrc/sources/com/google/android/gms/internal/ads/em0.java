package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class em0 implements Runnable {

    /* renamed from: p */
    final /* synthetic */ String f19685p;

    /* renamed from: q */
    final /* synthetic */ String f19686q;

    /* renamed from: r */
    final /* synthetic */ zzcic f19687r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public em0(zzcic zzcicVar, String str, String str2) {
        this.f19687r = zzcicVar;
        this.f19685p = str;
        this.f19686q = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mm0 mm0Var;
        mm0 mm0Var2;
        zzcic zzcicVar = this.f19687r;
        mm0Var = zzcicVar.f32041F;
        if (mm0Var != null) {
            mm0Var2 = zzcicVar.f32041F;
            mm0Var2.mo24631c(this.f19685p, this.f19686q);
        }
    }
}

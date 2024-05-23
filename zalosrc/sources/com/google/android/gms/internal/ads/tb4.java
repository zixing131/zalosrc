package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class tb4 implements aa4 {

    /* renamed from: a */
    final /* synthetic */ vb4 f28283a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ tb4(vb4 vb4Var, sb4 sb4Var) {
        this.f28283a = vb4Var;
    }

    @Override // com.google.android.gms.internal.ads.aa4
    /* renamed from: a */
    public final void mo20042a(Exception exc) {
        lr1.m24354c("MediaCodecAudioRenderer", "Audio sink error", exc);
        vb4.m27203x0(this.f28283a).m28144b(exc);
    }

    @Override // com.google.android.gms.internal.ads.aa4
    public final void zzb() {
        vb4 vb4Var = this.f28283a;
        if (vb4.m27202w0(vb4Var) != null) {
            vb4.m27202w0(vb4Var).zzb();
        }
    }
}

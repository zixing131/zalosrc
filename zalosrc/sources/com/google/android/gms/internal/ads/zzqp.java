package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public final class zzqp extends Exception {

    /* renamed from: p */
    public final String f32156p;

    /* renamed from: q */
    public final boolean f32157q;

    /* renamed from: r */
    public final hd4 f32158r;

    /* renamed from: s */
    public final String f32159s;

    /* renamed from: t */
    public final zzqp f32160t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqp(C4671k3 c4671k3, Throwable th2, boolean z11, int i11) {
        this("Decoder init failed: [" + i11 + "], " + r13, th2, c4671k3.f23099l, false, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + Math.abs(i11), null);
        String valueOf = String.valueOf(c4671k3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ zzqp m28834a(zzqp zzqpVar, zzqp zzqpVar2) {
        return new zzqp(zzqpVar.getMessage(), zzqpVar.getCause(), zzqpVar.f32156p, false, zzqpVar.f32158r, zzqpVar.f32159s, zzqpVar2);
    }

    public zzqp(C4671k3 c4671k3, Throwable th2, boolean z11, hd4 hd4Var) {
        this("Decoder init failed: " + hd4Var.f21638a + ", " + String.valueOf(c4671k3), th2, c4671k3.f23099l, false, hd4Var, (g92.f20474a < 21 || !(th2 instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th2).getDiagnosticInfo(), null);
    }

    private zzqp(String str, Throwable th2, String str2, boolean z11, hd4 hd4Var, String str3, zzqp zzqpVar) {
        super(str, th2);
        this.f32156p = str2;
        this.f32157q = false;
        this.f32158r = hd4Var;
        this.f32159s = str3;
        this.f32160t = zzqpVar;
    }
}

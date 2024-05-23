package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public class zzqm extends zzgg {

    /* renamed from: p */
    public final hd4 f32154p;

    /* renamed from: q */
    public final String f32155q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqm(Throwable th2, hd4 hd4Var) {
        super("Decoder failed: ".concat(String.valueOf(r1)), th2);
        String str;
        String str2 = null;
        if (hd4Var == null) {
            str = null;
        } else {
            str = hd4Var.f21638a;
        }
        this.f32154p = hd4Var;
        if (g92.f20474a >= 21 && (th2 instanceof MediaCodec.CodecException)) {
            str2 = ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        this.f32155q = str2;
    }
}

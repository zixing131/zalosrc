package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* loaded from: classes2.dex */
public final class zzawt extends Exception {

    /* renamed from: p */
    public final String f31851p;

    /* renamed from: q */
    public final String f31852q;

    /* renamed from: r */
    public final String f31853r;

    public zzawt(zzasw zzaswVar, Throwable th2, boolean z11, int i11) {
        super("Decoder init failed: [" + i11 + "], " + String.valueOf(zzaswVar), th2);
        this.f31851p = zzaswVar.f31836u;
        this.f31852q = null;
        this.f31853r = "com.google.android.exoplayer.MediaCodecTrackRenderer_neg_" + Math.abs(i11);
    }

    public zzawt(zzasw zzaswVar, Throwable th2, boolean z11, String str) {
        super("Decoder init failed: " + str + ", " + String.valueOf(zzaswVar), th2);
        this.f31851p = zzaswVar.f31836u;
        this.f31852q = str;
        String str2 = null;
        if (AbstractC4916qo.f26898a >= 21 && (th2 instanceof MediaCodec.CodecException)) {
            str2 = ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        this.f31853r = str2;
    }
}

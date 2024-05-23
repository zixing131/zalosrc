package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes2.dex */
final class xd4 implements ud4 {

    /* renamed from: a */
    private final int f30429a;

    /* renamed from: b */
    private MediaCodecInfo[] f30430b;

    public xd4(boolean z11, boolean z12) {
        int i11 = 1;
        if (!z11 && !z12) {
            i11 = 0;
        }
        this.f30429a = i11;
    }

    /* renamed from: c */
    private final void m27884c() {
        if (this.f30430b == null) {
            this.f30430b = new MediaCodecList(this.f30429a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.ud4
    /* renamed from: a */
    public final boolean mo26916a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // com.google.android.gms.internal.ads.ud4
    /* renamed from: b */
    public final boolean mo26917b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // com.google.android.gms.internal.ads.ud4
    public final int zza() {
        m27884c();
        return this.f30430b.length;
    }

    @Override // com.google.android.gms.internal.ads.ud4
    public final MediaCodecInfo zzb(int i11) {
        m27884c();
        return this.f30430b[i11];
    }

    @Override // com.google.android.gms.internal.ads.ud4
    public final boolean zze() {
        return true;
    }
}

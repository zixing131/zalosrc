package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.ml */
/* loaded from: classes2.dex */
final class C4764ml implements InterfaceC4652jl {

    /* renamed from: a */
    private final int f24642a;

    /* renamed from: b */
    private MediaCodecInfo[] f24643b;

    public C4764ml(boolean z11) {
        this.f24642a = z11 ? 1 : 0;
    }

    /* renamed from: b */
    private final void m24622b() {
        if (this.f24643b == null) {
            this.f24643b = new MediaCodecList(this.f24642a).getCodecInfos();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4652jl
    /* renamed from: a */
    public final boolean mo23630a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4652jl
    public final int zza() {
        m24622b();
        return this.f24643b.length;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4652jl
    public final MediaCodecInfo zzb(int i11) {
        m24622b();
        return this.f24643b[i11];
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4652jl
    public final boolean zzd() {
        return true;
    }
}

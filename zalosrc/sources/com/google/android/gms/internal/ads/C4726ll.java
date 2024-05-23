package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.ll */
/* loaded from: classes2.dex */
final class C4726ll implements InterfaceC4652jl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C4726ll(AbstractC4689kl abstractC4689kl) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4652jl
    /* renamed from: a */
    public final boolean mo23630a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4652jl
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4652jl
    public final MediaCodecInfo zzb(int i11) {
        return MediaCodecList.getCodecInfoAt(i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4652jl
    public final boolean zzd() {
        return false;
    }
}

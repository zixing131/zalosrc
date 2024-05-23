package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes2.dex */
final class wd4 implements ud4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ wd4(vd4 vd4Var) {
    }

    @Override // com.google.android.gms.internal.ads.ud4
    /* renamed from: a */
    public final boolean mo26916a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ud4
    /* renamed from: b */
    public final boolean mo26917b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ud4
    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.google.android.gms.internal.ads.ud4
    public final MediaCodecInfo zzb(int i11) {
        return MediaCodecList.getCodecInfoAt(i11);
    }

    @Override // com.google.android.gms.internal.ads.ud4
    public final boolean zze() {
        return false;
    }
}

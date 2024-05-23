package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.AbstractC4826o9;
import com.google.android.gms.internal.ads.InterfaceC4862p8;
import com.google.android.gms.internal.ads.InterfaceC4900q8;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.zzajl;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzbi extends AbstractC4826o9 {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ xk0 zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbi(zzbo zzboVar, int i11, String str, InterfaceC4900q8 interfaceC4900q8, InterfaceC4862p8 interfaceC4862p8, byte[] bArr, Map map, xk0 xk0Var) {
        super(i11, str, interfaceC4900q8, interfaceC4862p8);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = xk0Var;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4788n8
    public final Map zzl() throws zzajl {
        Map map = this.zzb;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4788n8
    public final /* bridge */ /* synthetic */ void zzo(Object obj) {
        zzz((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4788n8
    public final byte[] zzx() throws zzajl {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC4826o9
    public final void zzz(String str) {
        this.zzc.m27915g(str);
        super.zzz(str);
    }
}

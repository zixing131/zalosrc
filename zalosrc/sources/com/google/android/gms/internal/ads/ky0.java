package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ky0 implements iy0 {

    /* renamed from: a */
    private final zzg f23644a;

    public ky0(zzg zzgVar) {
        this.f23644a = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.iy0
    /* renamed from: a */
    public final void mo20772a(Map map) {
        this.f23644a.zzx(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzg;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ny0 implements iy0 {

    /* renamed from: a */
    private final zzg f25374a;

    public ny0(zzg zzgVar) {
        this.f25374a = zzgVar;
    }

    @Override // com.google.android.gms.internal.ads.iy0
    /* renamed from: a */
    public final void mo20772a(Map map) {
        this.f25374a.zzz(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}

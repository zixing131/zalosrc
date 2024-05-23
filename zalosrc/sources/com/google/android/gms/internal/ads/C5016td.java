package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.td */
/* loaded from: classes2.dex */
public final class C5016td extends AbstractC5126wb {

    /* renamed from: a */
    public long f28287a;

    /* renamed from: b */
    public long f28288b;

    public C5016td(String str) {
        this.f28287a = -1L;
        this.f28288b = -1L;
        HashMap m27586a = AbstractC5126wb.m27586a(str);
        if (m27586a != null) {
            this.f28287a = ((Long) m27586a.get(0)).longValue();
            this.f28288b = ((Long) m27586a.get(1)).longValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC5126wb
    /* renamed from: b */
    protected final HashMap mo21352b() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, Long.valueOf(this.f28287a));
        hashMap.put(1, Long.valueOf(this.f28288b));
        return hashMap;
    }
}

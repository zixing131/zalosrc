package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class n04 extends f04 {

    /* renamed from: b */
    private static final w04 f24971b = k04.m23792a(Collections.emptyMap());

    public /* synthetic */ n04(Map map, l04 l04Var) {
        super(map);
    }

    /* renamed from: b */
    public static m04 m24789b(int i11) {
        return new m04(i11, null);
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: c */
    public final Map zzb() {
        LinkedHashMap m22258b = g04.m22258b(m21861a().size());
        for (Map.Entry entry : m21861a().entrySet()) {
            m22258b.put(entry.getKey(), ((w04) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(m22258b);
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zh1 implements y31 {

    /* renamed from: a */
    private final Map f31506a;

    /* renamed from: b */
    private final Map f31507b;

    /* renamed from: c */
    private final Map f31508c;

    /* renamed from: d */
    private final w04 f31509d;

    /* renamed from: e */
    private final hk1 f31510e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zh1(Map map, Map map2, Map map3, w04 w04Var, hk1 hk1Var) {
        this.f31506a = map;
        this.f31507b = map2;
        this.f31508c = map3;
        this.f31509d = w04Var;
        this.f31510e = hk1Var;
    }

    @Override // com.google.android.gms.internal.ads.y31
    /* renamed from: a */
    public final c32 mo27824a(int i11, String str) {
        c32 mo27824a;
        c32 c32Var = (c32) this.f31506a.get(str);
        if (c32Var != null) {
            return c32Var;
        }
        if (i11 != 1) {
            if (i11 != 4) {
                return null;
            }
            q52 q52Var = (q52) this.f31508c.get(str);
            if (q52Var != null) {
                return new d32(q52Var, new y43() { // from class: com.google.android.gms.internal.ads.a41
                    @Override // com.google.android.gms.internal.ads.y43
                    public final Object apply(Object obj) {
                        return new c41((List) obj);
                    }
                });
            }
            c32 c32Var2 = (c32) this.f31507b.get(str);
            if (c32Var2 == null) {
                return null;
            }
            return c41.m20794a(c32Var2);
        }
        if (this.f31510e.m22952e() == null || (mo27824a = ((y31) this.f31509d.zzb()).mo27824a(i11, str)) == null) {
            return null;
        }
        return c41.m20794a(mo27824a);
    }
}

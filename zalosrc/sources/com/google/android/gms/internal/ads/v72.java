package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class v72 implements e32 {

    /* renamed from: a */
    private final a92 f29218a;

    public v72(a92 a92Var) {
        this.f29218a = a92Var;
    }

    @Override // com.google.android.gms.internal.ads.e32
    /* renamed from: a */
    public final f32 mo21611a(String str, JSONObject jSONObject) {
        pb0 m20037a = this.f29218a.m20037a(str);
        if (m20037a == null) {
            return null;
        }
        return new f32(m20037a, new x42(), str);
    }
}

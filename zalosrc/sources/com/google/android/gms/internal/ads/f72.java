package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f72 implements e32 {

    /* renamed from: a */
    private final Map f20053a = new HashMap();

    /* renamed from: b */
    private final wq1 f20054b;

    public f72(wq1 wq1Var) {
        this.f20054b = wq1Var;
    }

    @Override // com.google.android.gms.internal.ads.e32
    /* renamed from: a */
    public final f32 mo21611a(String str, JSONObject jSONObject) {
        f32 f32Var;
        synchronized (this) {
            try {
                f32Var = (f32) this.f20053a.get(str);
                if (f32Var == null) {
                    f32Var = new f32(this.f20054b.m27690c(str, jSONObject), new y42(), str);
                    this.f20053a.put(str, f32Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f32Var;
    }
}

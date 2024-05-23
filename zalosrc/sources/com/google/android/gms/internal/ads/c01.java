package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c01 implements j04 {

    /* renamed from: a */
    private final w04 f18067a;

    /* renamed from: b */
    private final w04 f18068b;

    /* renamed from: c */
    private final w04 f18069c;

    /* renamed from: d */
    private final w04 f18070d;

    public c01(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f18067a = w04Var;
        this.f18068b = w04Var2;
        this.f18069c = w04Var3;
        this.f18070d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        ((l41) this.f18067a).m24112a();
        zzcgv m24707a = ((mt0) this.f18068b).m24707a();
        JSONObject jSONObject = (JSONObject) this.f18069c.zzb();
        String str = (String) this.f18070d.zzb();
        boolean equals = "native".equals(str);
        zzt.zzp();
        return new C4730lp(UUID.randomUUID().toString(), m24707a, str, jSONObject, false, equals);
    }
}

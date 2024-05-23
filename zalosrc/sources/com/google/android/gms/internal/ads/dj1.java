package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class dj1 implements j04 {

    /* renamed from: a */
    private final w04 f19271a;

    /* renamed from: b */
    private final w04 f19272b;

    public dj1(w04 w04Var, w04 w04Var2) {
        this.f19271a = w04Var;
        this.f19272b = w04Var2;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcgv m24707a = ((mt0) this.f19271a).m24707a();
        zzt.zzp();
        return new C4730lp(UUID.randomUUID().toString(), m24707a, "native", new JSONObject(), false, true);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class sv2 implements j04 {

    /* renamed from: a */
    private final w04 f28037a;

    /* renamed from: b */
    private final w04 f28038b;

    /* renamed from: c */
    private final w04 f28039c;

    public sv2(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f28037a = w04Var;
        this.f28038b = w04Var2;
        this.f28039c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Object obj;
        d04 m23103a = i04.m23103a(this.f28037a);
        d04 m23103a2 = i04.m23103a(this.f28038b);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f28039c.zzb();
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21384t7)).booleanValue()) {
            obj = new uv2((rv2) m23103a.zzb(), scheduledExecutorService);
        } else {
            obj = (rv2) m23103a2.zzb();
        }
        r04.m25935b(obj);
        return obj;
    }
}

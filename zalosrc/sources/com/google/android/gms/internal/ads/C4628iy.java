package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.iy */
/* loaded from: classes2.dex */
public final class C4628iy implements j04 {

    /* renamed from: a */
    private final w04 f22549a;

    /* renamed from: b */
    private final w04 f22550b;

    /* renamed from: c */
    private final w04 f22551c;

    /* renamed from: d */
    private final w04 f22552d;

    public C4628iy(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f22549a = w04Var;
        this.f22550b = w04Var2;
        this.f22551c = w04Var3;
        this.f22552d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* synthetic */ Object zzb() {
        return new C4592hy(((bt0) this.f22549a).m20710a(), (ScheduledExecutorService) this.f22550b.zzb(), new C4665jy(), (vw2) this.f22552d.zzb(), null);
    }
}

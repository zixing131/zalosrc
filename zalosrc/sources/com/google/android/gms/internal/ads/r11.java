package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class r11 implements j04 {

    /* renamed from: a */
    private final w04 f27037a;

    /* renamed from: b */
    private final w04 f27038b;

    public r11(w04 w04Var, w04 w04Var2) {
        this.f27037a = w04Var;
        this.f27038b = w04Var2;
    }

    @Override // com.google.android.gms.internal.ads.w04
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final na1 zzb() {
        return new na1((ScheduledExecutorService) this.f27037a.zzb(), (InterfaceC20285f) this.f27038b.zzb());
    }
}

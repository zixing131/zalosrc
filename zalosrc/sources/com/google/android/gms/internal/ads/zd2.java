package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class zd2 implements sh2 {

    /* renamed from: a */
    private final AtomicReference f31470a = new AtomicReference();

    /* renamed from: b */
    private final InterfaceC20285f f31471b;

    /* renamed from: c */
    private final sh2 f31472c;

    /* renamed from: d */
    private final long f31473d;

    public zd2(sh2 sh2Var, long j11, InterfaceC20285f interfaceC20285f) {
        this.f31471b = interfaceC20285f;
        this.f31472c = sh2Var;
        this.f31473d = j11;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        yd2 yd2Var = (yd2) this.f31470a.get();
        if (yd2Var == null || yd2Var.m28191a()) {
            yd2Var = new yd2(this.f31472c.zzb(), this.f31473d, this.f31471b);
            this.f31470a.set(yd2Var);
        }
        return yd2Var.f30910a;
    }
}

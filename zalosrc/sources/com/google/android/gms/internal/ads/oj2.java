package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class oj2 implements sh2 {

    /* renamed from: a */
    final uc3 f25659a;

    /* renamed from: b */
    final String f25660b;

    /* renamed from: c */
    final vj0 f25661c;

    public oj2(vj0 vj0Var, uc3 uc3Var, String str, byte[] bArr) {
        this.f25661c = vj0Var;
        this.f25659a = uc3Var;
        this.f25660b = str;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        final tc3 m23877i = kc3.m23877i(null);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21126T4)).booleanValue()) {
            m23877i = kc3.m23877i(null);
        }
        final tc3 m23877i2 = kc3.m23877i(null);
        return kc3.m23872d(m23877i, m23877i2).m23601a(new Callable() { // from class: com.google.android.gms.internal.ads.nj2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new pj2((String) tc3.this.get(), (String) m23877i2.get());
            }
        }, kl0.f23363a);
    }
}

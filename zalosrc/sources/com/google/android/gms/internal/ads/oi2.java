package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class oi2 implements sh2 {

    /* renamed from: a */
    private final Executor f25648a;

    /* renamed from: b */
    private final String f25649b;

    /* renamed from: c */
    private final PackageInfo f25650c;

    /* renamed from: d */
    private final yj0 f25651d;

    public oi2(yj0 yj0Var, Executor executor, String str, PackageInfo packageInfo, int i11, byte[] bArr) {
        this.f25651d = yj0Var;
        this.f25648a = executor;
        this.f25649b = str;
        this.f25650c = packageInfo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ tc3 m25197a(Throwable th2) {
        return kc3.m23877i(new qi2(this.f25649b));
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return kc3.m23875g(kc3.m23881m(kc3.m23877i(this.f25649b), new y43() { // from class: com.google.android.gms.internal.ads.mi2
            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                return new qi2((String) obj);
            }
        }, this.f25648a), Throwable.class, new qb3() { // from class: com.google.android.gms.internal.ads.ni2
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return oi2.this.m25197a((Throwable) obj);
            }
        }, this.f25648a);
    }
}

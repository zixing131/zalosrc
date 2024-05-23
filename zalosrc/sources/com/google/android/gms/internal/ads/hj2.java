package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class hj2 implements sh2 {

    /* renamed from: a */
    final uc3 f21789a;

    /* renamed from: b */
    final Context f21790b;

    /* renamed from: c */
    final C4401cs f21791c;

    public hj2(C4401cs c4401cs, uc3 uc3Var, Context context, byte[] bArr) {
        this.f21791c = c4401cs;
        this.f21789a = uc3Var;
        this.f21790b = context;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f21789a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.gj2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ij2(new JSONObject());
            }
        });
    }
}

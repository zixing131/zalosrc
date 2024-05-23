package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class si2 implements sh2 {

    /* renamed from: a */
    private final Context f27704a;

    /* renamed from: b */
    private final String f27705b;

    /* renamed from: c */
    private final uc3 f27706c;

    public si2(of0 of0Var, Context context, String str, uc3 uc3Var) {
        this.f27704a = context;
        this.f27705b = str;
        this.f27706c = uc3Var;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f27706c.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.ri2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new ti2(new JSONObject());
            }
        });
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class sd2 implements sh2 {

    /* renamed from: a */
    private final uc3 f27629a;

    /* renamed from: b */
    private final Context f27630b;

    public sd2(uc3 uc3Var, Context context) {
        this.f27629a = uc3Var;
        this.f27630b = context;
    }

    /* renamed from: a */
    public final /* synthetic */ td2 m26277a() {
        Intent registerReceiver;
        double d11;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20980E8)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            registerReceiver = this.f27630b.registerReceiver(null, intentFilter, 4);
        } else {
            registerReceiver = this.f27630b.registerReceiver(null, intentFilter);
        }
        boolean z11 = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            d11 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z11 = true;
            }
        } else {
            d11 = -1.0d;
        }
        return new td2(d11, z11);
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.sh2
    public final tc3 zzb() {
        return this.f27629a.mo21339R(new Callable() { // from class: com.google.android.gms.internal.ads.rd2
            public /* synthetic */ rd2() {
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return sd2.this.m26277a();
            }
        });
    }
}

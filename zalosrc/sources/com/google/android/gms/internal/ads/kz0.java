package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;

/* loaded from: classes2.dex */
final class kz0 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ mz0 f23651a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kz0(mz0 mz0Var) {
        this.f23651a = mz0Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        lr2 lr2Var;
        kx2 kx2Var;
        tq2 tq2Var;
        iq2 iq2Var;
        iq2 iq2Var2;
        Context context;
        String str = (String) obj;
        mz0 mz0Var = this.f23651a;
        lr2Var = mz0Var.f24962w;
        kx2Var = mz0Var.f24961v;
        tq2Var = mz0Var.f24959t;
        iq2Var = mz0Var.f24960u;
        iq2Var2 = mz0Var.f24960u;
        List m24081d = kx2Var.m24081d(tq2Var, iq2Var, false, "", str, iq2Var2.f22317c);
        hk0 zzo = zzt.zzo();
        context = this.f23651a.f24955p;
        boolean m22947v = zzo.m22947v(context);
        int i11 = 1;
        if (true == m22947v) {
            i11 = 2;
        }
        lr2Var.m24361c(m24081d, i11);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class hk2 implements j04 {
    /* renamed from: a */
    public static vh2 m22957a(Context context, vj0 vj0Var, wj0 wj0Var, Object obj, oi2 oi2Var, tj2 tj2Var, d04 d04Var, d04 d04Var2, d04 d04Var3, d04 d04Var4, d04 d04Var5, d04 d04Var6, d04 d04Var7, d04 d04Var8, d04 d04Var9, Executor executor, vw2 vw2Var, dt1 dt1Var) {
        HashSet hashSet = new HashSet();
        hashSet.add((lj2) obj);
        hashSet.add(oi2Var);
        hashSet.add(tj2Var);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21076O4)).booleanValue()) {
            hashSet.add((sh2) d04Var.zzb());
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21086P4)).booleanValue()) {
            hashSet.add((sh2) d04Var2.zzb());
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21096Q4)).booleanValue()) {
            hashSet.add((sh2) d04Var3.zzb());
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21106R4)).booleanValue()) {
            hashSet.add((sh2) d04Var4.zzb());
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21146V4)).booleanValue()) {
            hashSet.add((sh2) d04Var6.zzb());
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21155W4)).booleanValue()) {
            hashSet.add((sh2) d04Var7.zzb());
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21369s2)).booleanValue()) {
            hashSet.add((sh2) d04Var9.zzb());
        }
        return new vh2(context, executor, hashSet, vw2Var, dt1Var);
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class mn2 implements y43 {

    /* renamed from: a */
    final /* synthetic */ qn2 f24675a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mn2(qn2 qn2Var) {
        this.f24675a = qn2Var;
    }

    @Override // com.google.android.gms.internal.ads.y43
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        ys2 m25823e;
        pn2 pn2Var;
        yk0.zzh("", (zzedj) obj);
        zze.zza("Failed to get a cache key, reverting to legacy flow.");
        qn2 qn2Var = this.f24675a;
        m25823e = qn2Var.m25823e();
        qn2Var.f26897d = new pn2(null, m25823e, null);
        pn2Var = this.f24675a.f26897d;
        return pn2Var;
    }
}

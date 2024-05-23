package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes2.dex */
final class mv3 extends ov3 {
    public /* synthetic */ mv3(kv3 kv3Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.ov3
    /* renamed from: a */
    public final List mo23760a(Object obj, long j11) {
        int i11;
        cv3 cv3Var = (cv3) ix3.m23454p(obj, j11);
        if (!cv3Var.zzc()) {
            int size = cv3Var.size();
            if (size == 0) {
                i11 = 10;
            } else {
                i11 = size + size;
            }
            cv3 mo21159c = cv3Var.mo21159c(i11);
            ix3.m23434D(obj, j11, mo21159c);
            return mo21159c;
        }
        return cv3Var;
    }

    @Override // com.google.android.gms.internal.ads.ov3
    /* renamed from: b */
    public final void mo23761b(Object obj, long j11) {
        ((cv3) ix3.m23454p(obj, j11)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.ov3
    /* renamed from: c */
    public final void mo23762c(Object obj, Object obj2, long j11) {
        cv3 cv3Var = (cv3) ix3.m23454p(obj, j11);
        cv3 cv3Var2 = (cv3) ix3.m23454p(obj2, j11);
        int size = cv3Var.size();
        int size2 = cv3Var2.size();
        if (size > 0 && size2 > 0) {
            if (!cv3Var.zzc()) {
                cv3Var = cv3Var.mo21159c(size2 + size);
            }
            cv3Var.addAll(cv3Var2);
        }
        if (size > 0) {
            cv3Var2 = cv3Var;
        }
        ix3.m23434D(obj, j11, cv3Var2);
    }
}

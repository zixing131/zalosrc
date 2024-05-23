package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ie0 extends ce0 {

    /* renamed from: p */
    final /* synthetic */ List f22157p;

    public ie0(le0 le0Var, List list) {
        this.f22157p = list;
    }

    @Override // com.google.android.gms.internal.ads.de0
    /* renamed from: c */
    public final void mo20484c(String str) {
        yk0.zzg("Error recording impression urls: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.de0
    /* renamed from: t0 */
    public final void mo20485t0(List list) {
        yk0.zzi("Recorded impression urls: ".concat(this.f22157p.toString()));
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class je0 extends ce0 {

    /* renamed from: p */
    final /* synthetic */ List f22789p;

    public je0(le0 le0Var, List list) {
        this.f22789p = list;
    }

    @Override // com.google.android.gms.internal.ads.de0
    /* renamed from: c */
    public final void mo20484c(String str) {
        yk0.zzg("Error recording click: ".concat(String.valueOf(str)));
    }

    @Override // com.google.android.gms.internal.ads.de0
    /* renamed from: t0 */
    public final void mo20485t0(List list) {
        yk0.zzi("Recorded click: ".concat(this.f22789p.toString()));
    }
}

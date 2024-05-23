package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class gw0 implements bq2 {

    /* renamed from: a */
    private final gu0 f20924a;

    /* renamed from: b */
    private Context f20925b;

    /* renamed from: c */
    private String f20926c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ gw0(gu0 gu0Var, fw0 fw0Var) {
        this.f20924a = gu0Var;
    }

    @Override // com.google.android.gms.internal.ads.bq2
    /* renamed from: a */
    public final /* synthetic */ bq2 mo20644a(Context context) {
        context.getClass();
        this.f20925b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bq2
    public final /* synthetic */ bq2 zza(String str) {
        this.f20926c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.bq2
    public final cq2 zzc() {
        r04.m25936c(this.f20925b, Context.class);
        return new iw0(this.f20924a, this.f20925b, this.f20926c, null);
    }
}

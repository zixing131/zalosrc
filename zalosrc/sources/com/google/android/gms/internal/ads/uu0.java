package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class uu0 implements zk2 {

    /* renamed from: a */
    private final gu0 f29042a;

    /* renamed from: b */
    private Context f29043b;

    /* renamed from: c */
    private String f29044c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ uu0(gu0 gu0Var, tu0 tu0Var) {
        this.f29042a = gu0Var;
    }

    @Override // com.google.android.gms.internal.ads.zk2
    /* renamed from: a */
    public final /* synthetic */ zk2 mo27060a(Context context) {
        context.getClass();
        this.f29043b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zk2
    public final /* synthetic */ zk2 zza(String str) {
        str.getClass();
        this.f29044c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zk2
    public final al2 zzc() {
        r04.m25936c(this.f29043b, Context.class);
        r04.m25936c(this.f29044c, String.class);
        return new wu0(this.f29042a, this.f29043b, this.f29044c, null);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class sv0 implements mu1 {

    /* renamed from: a */
    private final gu0 f28032a;

    /* renamed from: b */
    private Context f28033b;

    /* renamed from: c */
    private f50 f28034c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ sv0(gu0 gu0Var, rv0 rv0Var) {
        this.f28032a = gu0Var;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    /* renamed from: a */
    public final /* synthetic */ mu1 mo24740a(Context context) {
        context.getClass();
        this.f28033b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    /* renamed from: b */
    public final /* synthetic */ mu1 mo24741b(f50 f50Var) {
        f50Var.getClass();
        this.f28034c = f50Var;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.mu1
    public final nu1 zzc() {
        r04.m25936c(this.f28033b, Context.class);
        r04.m25936c(this.f28034c, f50.class);
        return new uv0(this.f28032a, this.f28033b, this.f28034c, null);
    }
}

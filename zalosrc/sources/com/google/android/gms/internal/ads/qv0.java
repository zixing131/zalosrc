package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
final class qv0 implements fu1 {

    /* renamed from: a */
    private final Long f26972a;

    /* renamed from: b */
    private final String f26973b;

    /* renamed from: c */
    private final gu0 f26974c;

    /* renamed from: d */
    private final uv0 f26975d;

    /* renamed from: e */
    private final qv0 f26976e = this;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ qv0(gu0 gu0Var, uv0 uv0Var, Long l11, String str, pv0 pv0Var) {
        this.f26974c = gu0Var;
        this.f26975d = uv0Var;
        this.f26972a = l11;
        this.f26973b = str;
    }

    @Override // com.google.android.gms.internal.ads.fu1
    public final qu1 zza() {
        Context context;
        iu1 m23753b;
        long longValue = this.f26972a.longValue();
        uv0 uv0Var = this.f26975d;
        context = uv0Var.f29052a;
        m23753b = ju1.m23753b(uv0Var.f29053b);
        return ru1.m26190a(longValue, context, m23753b, this.f26974c, this.f26973b);
    }

    @Override // com.google.android.gms.internal.ads.fu1
    public final uu1 zzb() {
        Context context;
        iu1 m23753b;
        long longValue = this.f26972a.longValue();
        uv0 uv0Var = this.f26975d;
        context = uv0Var.f29052a;
        m23753b = ju1.m23753b(uv0Var.f29053b);
        return vu1.m27356a(longValue, context, m23753b, this.f26974c, this.f26973b);
    }
}

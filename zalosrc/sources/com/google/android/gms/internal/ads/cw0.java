package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes2.dex */
final class cw0 implements lo2 {

    /* renamed from: a */
    private final gu0 f18981a;

    /* renamed from: b */
    private Context f18982b;

    /* renamed from: c */
    private String f18983c;

    /* renamed from: d */
    private zzq f18984d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ cw0(gu0 gu0Var, bw0 bw0Var) {
        this.f18981a = gu0Var;
    }

    @Override // com.google.android.gms.internal.ads.lo2
    /* renamed from: a */
    public final /* synthetic */ lo2 mo21160a(zzq zzqVar) {
        zzqVar.getClass();
        this.f18984d = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.lo2
    /* renamed from: b */
    public final /* synthetic */ lo2 mo21161b(Context context) {
        context.getClass();
        this.f18982b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.lo2
    public final /* synthetic */ lo2 zzb(String str) {
        str.getClass();
        this.f18983c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.lo2
    public final mo2 zzd() {
        r04.m25936c(this.f18982b, Context.class);
        r04.m25936c(this.f18983c, String.class);
        r04.m25936c(this.f18984d, zzq.class);
        return new ew0(this.f18981a, this.f18982b, this.f18983c, this.f18984d, null);
    }
}

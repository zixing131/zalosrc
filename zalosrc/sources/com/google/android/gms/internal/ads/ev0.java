package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;

/* loaded from: classes2.dex */
final class ev0 implements om2 {

    /* renamed from: a */
    private final gu0 f19818a;

    /* renamed from: b */
    private Context f19819b;

    /* renamed from: c */
    private String f19820c;

    /* renamed from: d */
    private zzq f19821d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ ev0(gu0 gu0Var, dv0 dv0Var) {
        this.f19818a = gu0Var;
    }

    @Override // com.google.android.gms.internal.ads.om2
    /* renamed from: a */
    public final /* synthetic */ om2 mo21816a(zzq zzqVar) {
        zzqVar.getClass();
        this.f19821d = zzqVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.om2
    /* renamed from: b */
    public final /* synthetic */ om2 mo21817b(Context context) {
        context.getClass();
        this.f19819b = context;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.om2
    public final /* synthetic */ om2 zzb(String str) {
        str.getClass();
        this.f19820c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.om2
    public final pm2 zzd() {
        r04.m25936c(this.f19819b, Context.class);
        r04.m25936c(this.f19820c, String.class);
        r04.m25936c(this.f19821d, zzq.class);
        return new gv0(this.f19818a, this.f19819b, this.f19820c, this.f19821d, null);
    }
}

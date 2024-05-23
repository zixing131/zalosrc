package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import p229i5.InterfaceC20285f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class hi0 {

    /* renamed from: a */
    private Context f21763a;

    /* renamed from: b */
    private InterfaceC20285f f21764b;

    /* renamed from: c */
    private zzg f21765c;

    /* renamed from: d */
    private dj0 f21766d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ hi0(gi0 gi0Var) {
    }

    /* renamed from: a */
    public final hi0 m22900a(zzg zzgVar) {
        this.f21765c = zzgVar;
        return this;
    }

    /* renamed from: b */
    public final hi0 m22901b(Context context) {
        context.getClass();
        this.f21763a = context;
        return this;
    }

    /* renamed from: c */
    public final hi0 m22902c(InterfaceC20285f interfaceC20285f) {
        interfaceC20285f.getClass();
        this.f21764b = interfaceC20285f;
        return this;
    }

    /* renamed from: d */
    public final hi0 m22903d(dj0 dj0Var) {
        this.f21766d = dj0Var;
        return this;
    }

    /* renamed from: e */
    public final ej0 m22904e() {
        r04.m25936c(this.f21763a, Context.class);
        r04.m25936c(this.f21764b, InterfaceC20285f.class);
        r04.m25936c(this.f21765c, zzg.class);
        r04.m25936c(this.f21766d, dj0.class);
        return new ki0(this.f21763a, this.f21764b, this.f21765c, this.f21766d, null);
    }
}

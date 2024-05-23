package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class l14 {

    /* renamed from: a */
    final Context f23675a;

    /* renamed from: b */
    w81 f23676b;

    /* renamed from: c */
    a63 f23677c;

    /* renamed from: d */
    a63 f23678d;

    /* renamed from: e */
    a63 f23679e;

    /* renamed from: f */
    a63 f23680f;

    /* renamed from: g */
    a63 f23681g;

    /* renamed from: h */
    y43 f23682h;

    /* renamed from: i */
    Looper f23683i;

    /* renamed from: j */
    b44 f23684j;

    /* renamed from: k */
    int f23685k;

    /* renamed from: l */
    boolean f23686l;

    /* renamed from: m */
    f44 f23687m;

    /* renamed from: n */
    long f23688n;

    /* renamed from: o */
    long f23689o;

    /* renamed from: p */
    boolean f23690p;

    /* renamed from: q */
    boolean f23691q;

    /* renamed from: r */
    yx3 f23692r;

    public l14(Context context, hq0 hq0Var, byte[] bArr) {
        f14 f14Var = new f14(hq0Var, null);
        g14 g14Var = new g14(context);
        h14 h14Var = new a63() { // from class: com.google.android.gms.internal.ads.h14

            /* renamed from: p */
            public final /* synthetic */ Context f21504p;

            public /* synthetic */ h14(Context context2) {
                r1 = context2;
            }

            @Override // com.google.android.gms.internal.ads.a63
            public final Object zza() {
                return new si4(r1);
            }
        };
        i14 i14Var = i14.f22018p;
        j14 j14Var = new j14(context2);
        k14 k14Var = k14.f23068a;
        context2.getClass();
        this.f23675a = context2;
        this.f23677c = f14Var;
        this.f23678d = g14Var;
        this.f23679e = h14Var;
        this.f23680f = i14Var;
        this.f23681g = j14Var;
        this.f23682h = k14Var;
        this.f23683i = g92.m22341e();
        this.f23684j = b44.f17580c;
        this.f23685k = 1;
        this.f23686l = true;
        this.f23687m = f44.f20008g;
        this.f23692r = new yx3(0.97f, 1.03f, 1000L, 1.0E-7f, g92.m22344f0(20L), g92.m22344f0(500L), 0.999f, null);
        this.f23676b = w81.f29846a;
        this.f23688n = 500L;
        this.f23689o = 2000L;
        this.f23690p = true;
    }

    /* renamed from: a */
    public static /* synthetic */ ff4 m24104a(Context context) {
        return new se4(context, new em4());
    }
}

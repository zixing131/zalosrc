package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes2.dex */
public final class ah4 extends mr0 {

    /* renamed from: h */
    private static final Object f17040h = new Object();

    /* renamed from: i */
    private static final C4330au f17041i;

    /* renamed from: c */
    private final long f17042c;

    /* renamed from: d */
    private final long f17043d;

    /* renamed from: e */
    private final boolean f17044e;

    /* renamed from: f */
    private final C4330au f17045f;

    /* renamed from: g */
    private final C4688kk f17046g;

    static {
        C4787n7 c4787n7 = new C4787n7();
        c4787n7.m24856a("SinglePeriodTimeline");
        c4787n7.m24857b(Uri.EMPTY);
        f17041i = c4787n7.m24858c();
    }

    public ah4(long j11, long j12, long j13, long j14, long j15, long j16, long j17, boolean z11, boolean z12, boolean z13, Object obj, C4330au c4330au, C4688kk c4688kk) {
        this.f17042c = j14;
        this.f17043d = j15;
        this.f17044e = z11;
        this.f17045f = c4330au;
        this.f17046g = c4688kk;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: a */
    public final int mo20105a(Object obj) {
        if (f17040h.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: b */
    public final int mo20106b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: c */
    public final int mo20107c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: d */
    public final ho0 mo20108d(int i11, ho0 ho0Var, boolean z11) {
        Object obj;
        v71.m27170a(i11, 0, 1);
        if (z11) {
            obj = f17040h;
        } else {
            obj = null;
        }
        ho0Var.m22989k(null, obj, 0, this.f17042c, 0L, r41.f27076d, false);
        return ho0Var;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: e */
    public final jq0 mo20109e(int i11, jq0 jq0Var, long j11) {
        v71.m27170a(i11, 0, 1);
        jq0Var.m23720a(jq0.f22926o, this.f17045f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f17044e, false, this.f17046g, 0L, this.f17043d, 0, 0, 0L);
        return jq0Var;
    }

    @Override // com.google.android.gms.internal.ads.mr0
    /* renamed from: f */
    public final Object mo20110f(int i11) {
        v71.m27170a(i11, 0, 1);
        return f17040h;
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: com.google.android.gms.measurement.internal.q */
/* loaded from: classes.dex */
final class C6100q {

    /* renamed from: a */
    final String f34343a;

    /* renamed from: b */
    final String f34344b;

    /* renamed from: c */
    final long f34345c;

    /* renamed from: d */
    final long f34346d;

    /* renamed from: e */
    final long f34347e;

    /* renamed from: f */
    final long f34348f;

    /* renamed from: g */
    final long f34349g;

    /* renamed from: h */
    final Long f34350h;

    /* renamed from: i */
    final Long f34351i;

    /* renamed from: j */
    final Long f34352j;

    /* renamed from: k */
    final Boolean f34353k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6100q(String str, String str2, long j11, long j12, long j13, long j14, long j15, Long l11, Long l12, Long l13, Boolean bool) {
        boolean z11;
        boolean z12;
        boolean z13;
        AbstractC4205o.m19718g(str);
        AbstractC4205o.m19718g(str2);
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19712a(z11);
        if (j12 >= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        AbstractC4205o.m19712a(z12);
        if (j13 >= 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        AbstractC4205o.m19712a(z13);
        AbstractC4205o.m19712a(j15 >= 0);
        this.f34343a = str;
        this.f34344b = str2;
        this.f34345c = j11;
        this.f34346d = j12;
        this.f34347e = j13;
        this.f34348f = j14;
        this.f34349g = j15;
        this.f34350h = l11;
        this.f34351i = l12;
        this.f34352j = l13;
        this.f34353k = bool;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6100q m31278a(Long l11, Long l12, Boolean bool) {
        if (bool != null) {
            bool.booleanValue();
        }
        return new C6100q(this.f34343a, this.f34344b, this.f34345c, this.f34346d, this.f34347e, this.f34348f, this.f34349g, this.f34350h, l11, l12, bool);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final C6100q m31279b(long j11, long j12) {
        return new C6100q(this.f34343a, this.f34344b, this.f34345c, this.f34346d, this.f34347e, this.f34348f, j11, Long.valueOf(j12), this.f34351i, this.f34352j, this.f34353k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final C6100q m31280c(long j11) {
        return new C6100q(this.f34343a, this.f34344b, this.f34345c, this.f34346d, this.f34347e, j11, this.f34349g, this.f34350h, this.f34351i, this.f34352j, this.f34353k);
    }
}

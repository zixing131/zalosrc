package com.google.android.gms.internal.ads;

import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.vg */
/* loaded from: classes2.dex */
public abstract class AbstractC5093vg {

    /* renamed from: a */
    public static final int f29305a;

    /* renamed from: b */
    public static final UUID f29306b;

    /* renamed from: c */
    public static final UUID f29307c;

    /* renamed from: d */
    public static final UUID f29308d;

    /* renamed from: e */
    public static final UUID f29309e;

    static {
        int i11;
        if (AbstractC4916qo.f26898a < 23) {
            i11 = 1020;
        } else {
            i11 = 6396;
        }
        f29305a = i11;
        f29306b = new UUID(0L, 0L);
        f29307c = new UUID(1186680826959645954L, -5988876978535335093L);
        f29308d = new UUID(-1301668207276963122L, -6645017420763422227L);
        f29309e = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    /* renamed from: a */
    public static long m27218a(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j11 * 1000;
    }

    /* renamed from: b */
    public static long m27219b(long j11) {
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j11 / 1000;
    }
}

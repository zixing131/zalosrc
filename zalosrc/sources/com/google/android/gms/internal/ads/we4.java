package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class we4 {

    /* renamed from: d */
    private static final AtomicLong f29898d = new AtomicLong();

    /* renamed from: a */
    public final wo2 f29899a;

    /* renamed from: b */
    public final Uri f29900b;

    /* renamed from: c */
    public final Map f29901c;

    public we4(long j11, wo2 wo2Var, Uri uri, Map map, long j12, long j13, long j14) {
        this.f29899a = wo2Var;
        this.f29900b = uri;
        this.f29901c = map;
    }

    /* renamed from: a */
    public static long m27603a() {
        return f29898d.getAndIncrement();
    }
}

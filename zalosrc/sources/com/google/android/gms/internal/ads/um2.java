package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class um2 {

    /* renamed from: a */
    private Uri f28988a;

    /* renamed from: b */
    private final int f28989b = 1;

    /* renamed from: c */
    private Map f28990c = Collections.emptyMap();

    /* renamed from: d */
    private long f28991d;

    /* renamed from: e */
    private int f28992e;

    /* renamed from: a */
    public final um2 m27000a(int i11) {
        this.f28992e = 6;
        return this;
    }

    /* renamed from: b */
    public final um2 m27001b(Map map) {
        this.f28990c = map;
        return this;
    }

    /* renamed from: c */
    public final um2 m27002c(long j11) {
        this.f28991d = j11;
        return this;
    }

    /* renamed from: d */
    public final um2 m27003d(Uri uri) {
        this.f28988a = uri;
        return this;
    }

    /* renamed from: e */
    public final wo2 m27004e() {
        if (this.f28988a != null) {
            return new wo2(this.f28988a, this.f28990c, this.f28991d, this.f28992e);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}

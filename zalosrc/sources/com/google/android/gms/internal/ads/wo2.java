package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class wo2 {

    /* renamed from: a */
    public final Uri f30043a;

    /* renamed from: b */
    public final int f30044b;

    /* renamed from: c */
    public final byte[] f30045c;

    /* renamed from: d */
    public final Map f30046d;

    /* renamed from: e */
    public final long f30047e;

    /* renamed from: f */
    public final long f30048f;

    /* renamed from: g */
    public final long f30049g;

    /* renamed from: h */
    public final String f30050h;

    /* renamed from: i */
    public final int f30051i;

    static {
        AbstractC4368bv.m20759b("media3.datasource");
    }

    /* renamed from: a */
    public static String m27669a(int i11) {
        return "GET";
    }

    /* renamed from: b */
    public final boolean m27670b(int i11) {
        return (this.f30051i & i11) == i11;
    }

    public final String toString() {
        return "DataSpec[" + m27669a(1) + " " + String.valueOf(this.f30043a) + ", " + this.f30048f + ", " + this.f30049g + ", null, " + this.f30051i + "]";
    }

    private wo2(Uri uri, long j11, int i11, byte[] bArr, Map map, long j12, long j13, String str, int i12, Object obj) {
        long j14 = j11 + j12;
        boolean z11 = false;
        v71.m27173d(j14 >= 0);
        v71.m27173d(j12 >= 0);
        if (j13 <= 0) {
            j13 = j13 == -1 ? -1L : j13;
            v71.m27173d(z11);
            this.f30043a = uri;
            this.f30044b = 1;
            this.f30045c = null;
            this.f30046d = Collections.unmodifiableMap(new HashMap(map));
            this.f30048f = j12;
            this.f30047e = j14;
            this.f30049g = j13;
            this.f30050h = null;
            this.f30051i = i12;
        }
        z11 = true;
        v71.m27173d(z11);
        this.f30043a = uri;
        this.f30044b = 1;
        this.f30045c = null;
        this.f30046d = Collections.unmodifiableMap(new HashMap(map));
        this.f30048f = j12;
        this.f30047e = j14;
        this.f30049g = j13;
        this.f30050h = null;
        this.f30051i = i12;
    }

    public wo2(Uri uri, byte[] bArr, long j11, long j12, long j13, String str, int i11) {
        this(uri, j11 - j12, 1, null, Collections.emptyMap(), j12, j13, null, i11, null);
    }
}

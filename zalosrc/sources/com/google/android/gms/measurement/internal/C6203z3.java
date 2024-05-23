package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: com.google.android.gms.measurement.internal.z3 */
/* loaded from: classes.dex */
public final class C6203z3 {

    /* renamed from: a */
    private final String f34641a;

    /* renamed from: b */
    private final long f34642b;

    /* renamed from: c */
    private boolean f34643c;

    /* renamed from: d */
    private long f34644d;

    /* renamed from: e */
    final /* synthetic */ C5950c4 f34645e;

    public C6203z3(C5950c4 c5950c4, String str, long j11) {
        this.f34645e = c5950c4;
        AbstractC4205o.m19718g(str);
        this.f34641a = str;
        this.f34642b = j11;
    }

    /* renamed from: a */
    public final long m31502a() {
        if (!this.f34643c) {
            this.f34643c = true;
            this.f34644d = this.f34645e.m30817n().getLong(this.f34641a, this.f34642b);
        }
        return this.f34644d;
    }

    /* renamed from: b */
    public final void m31503b(long j11) {
        SharedPreferences.Editor edit = this.f34645e.m30817n().edit();
        edit.putLong(this.f34641a, j11);
        edit.apply();
        this.f34644d = j11;
    }
}

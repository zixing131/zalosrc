package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: com.google.android.gms.measurement.internal.x3 */
/* loaded from: classes.dex */
public final class C6181x3 {

    /* renamed from: a */
    private final String f34571a;

    /* renamed from: b */
    private final boolean f34572b;

    /* renamed from: c */
    private boolean f34573c;

    /* renamed from: d */
    private boolean f34574d;

    /* renamed from: e */
    final /* synthetic */ C5950c4 f34575e;

    public C6181x3(C5950c4 c5950c4, String str, boolean z11) {
        this.f34575e = c5950c4;
        AbstractC4205o.m19718g(str);
        this.f34571a = str;
        this.f34572b = z11;
    }

    /* renamed from: a */
    public final void m31484a(boolean z11) {
        SharedPreferences.Editor edit = this.f34575e.m30817n().edit();
        edit.putBoolean(this.f34571a, z11);
        edit.apply();
        this.f34574d = z11;
    }

    /* renamed from: b */
    public final boolean m31485b() {
        if (!this.f34573c) {
            this.f34573c = true;
            this.f34574d = this.f34575e.m30817n().getBoolean(this.f34571a, this.f34572b);
        }
        return this.f34574d;
    }
}

package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: com.google.android.gms.measurement.internal.b4 */
/* loaded from: classes.dex */
public final class C5938b4 {

    /* renamed from: a */
    private final String f33785a;

    /* renamed from: b */
    private boolean f33786b;

    /* renamed from: c */
    private String f33787c;

    /* renamed from: d */
    final /* synthetic */ C5950c4 f33788d;

    public C5938b4(C5950c4 c5950c4, String str, String str2) {
        this.f33788d = c5950c4;
        AbstractC4205o.m19718g(str);
        this.f33785a = str;
    }

    /* renamed from: a */
    public final String m30803a() {
        if (!this.f33786b) {
            this.f33786b = true;
            this.f33787c = this.f33788d.m30817n().getString(this.f33785a, null);
        }
        return this.f33787c;
    }

    /* renamed from: b */
    public final void m30804b(String str) {
        SharedPreferences.Editor edit = this.f33788d.m30817n().edit();
        edit.putString(this.f33785a, str);
        edit.apply();
        this.f33787c = str;
    }
}

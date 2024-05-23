package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
public final class ky2 {

    /* renamed from: a */
    private final pz2 f23646a;

    /* renamed from: b */
    private final String f23647b;

    /* renamed from: c */
    private final zx2 f23648c;

    /* renamed from: d */
    private final String f23649d = "Ad overlay";

    public ky2(View view, zx2 zx2Var, String str) {
        this.f23646a = new pz2(view);
        this.f23647b = view.getClass().getCanonicalName();
        this.f23648c = zx2Var;
    }

    /* renamed from: a */
    public final zx2 m24092a() {
        return this.f23648c;
    }

    /* renamed from: b */
    public final pz2 m24093b() {
        return this.f23646a;
    }

    /* renamed from: c */
    public final String m24094c() {
        return this.f23649d;
    }

    /* renamed from: d */
    public final String m24095d() {
        return this.f23647b;
    }
}

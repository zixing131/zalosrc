package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* loaded from: classes2.dex */
public final class zk4 {

    /* renamed from: a */
    private final SparseBooleanArray f31552a = new SparseBooleanArray();

    /* renamed from: b */
    private boolean f31553b;

    /* renamed from: a */
    public final zk4 m28538a(int i11) {
        v71.m27175f(!this.f31553b);
        this.f31552a.append(i11, true);
        return this;
    }

    /* renamed from: b */
    public final C4336b m28539b() {
        v71.m27175f(!this.f31553b);
        this.f31553b = true;
        return new C4336b(this.f31552a, null);
    }
}

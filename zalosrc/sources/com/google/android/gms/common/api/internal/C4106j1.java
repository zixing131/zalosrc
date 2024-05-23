package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4205o;

/* renamed from: com.google.android.gms.common.api.internal.j1 */
/* loaded from: classes2.dex */
final class C4106j1 {

    /* renamed from: a */
    private final int f16383a;

    /* renamed from: b */
    private final ConnectionResult f16384b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4106j1(ConnectionResult connectionResult, int i11) {
        AbstractC4205o.m19722k(connectionResult);
        this.f16384b = connectionResult;
        this.f16383a = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final int m19488a() {
        return this.f16383a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final ConnectionResult m19489b() {
        return this.f16384b;
    }
}

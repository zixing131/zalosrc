package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.AbstractC5766h;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.android.billingclient.api.d0 */
/* loaded from: classes2.dex */
public final class CallableC3891d0 implements Callable {

    /* renamed from: a */
    final /* synthetic */ String f15485a;

    /* renamed from: b */
    final /* synthetic */ InterfaceC3946t f15486b;

    /* renamed from: c */
    final /* synthetic */ C3898f f15487c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CallableC3891d0(C3898f c3898f, String str, InterfaceC3946t interfaceC3946t) {
        this.f15487c = c3898f;
        this.f15485a = str;
        this.f15486b = interfaceC3946t;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C3930n1 m18544F = C3898f.m18544F(this.f15487c, this.f15485a, 9);
        if (m18544F.m18665b() != null) {
            this.f15486b.mo18699a(m18544F.m18664a(), m18544F.m18665b());
            return null;
        }
        this.f15486b.mo18699a(m18544F.m18664a(), AbstractC5766h.m30237r());
        return null;
    }
}

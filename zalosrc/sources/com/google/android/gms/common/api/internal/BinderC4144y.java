package com.google.android.gms.common.api.internal;

import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;
import p290k6.AbstractBinderC21479a;

/* renamed from: com.google.android.gms.common.api.internal.y */
/* loaded from: classes2.dex */
final class BinderC4144y extends AbstractBinderC21479a {

    /* renamed from: p */
    private final WeakReference f16467p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BinderC4144y(C4081b0 c4081b0) {
        this.f16467p = new WeakReference(c4081b0);
    }

    @Override // p290k6.InterfaceC21481c
    /* renamed from: u0 */
    public final void mo19558u0(zak zakVar) {
        C4105j0 c4105j0;
        C4081b0 c4081b0 = (C4081b0) this.f16467p.get();
        if (c4081b0 != null) {
            c4105j0 = c4081b0.f16239a;
            c4105j0.m19486m(new C4142x(this, c4081b0, c4081b0, zakVar));
        }
    }
}

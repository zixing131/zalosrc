package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
import p704z4.AbstractC31252u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.f0 */
/* loaded from: classes2.dex */
public final class C4093f0 extends AbstractC31252u {

    /* renamed from: a */
    private final WeakReference f16302a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4093f0(C4096g0 c4096g0) {
        this.f16302a = new WeakReference(c4096g0);
    }

    @Override // p704z4.AbstractC31252u
    /* renamed from: a */
    public final void mo19408a() {
        C4096g0 c4096g0 = (C4096g0) this.f16302a.get();
        if (c4096g0 == null) {
            return;
        }
        C4096g0.m19419u(c4096g0);
    }
}

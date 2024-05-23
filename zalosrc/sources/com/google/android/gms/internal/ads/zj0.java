package com.google.android.gms.internal.ads;

import android.os.Bundle;
import p229i5.InterfaceC20285f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zj0 {

    /* renamed from: a */
    private long f31528a = -1;

    /* renamed from: b */
    private long f31529b = -1;

    /* renamed from: c */
    final /* synthetic */ ak0 f31530c;

    public zj0(ak0 ak0Var) {
        this.f31530c = ak0Var;
    }

    /* renamed from: a */
    public final long m28520a() {
        return this.f31529b;
    }

    /* renamed from: b */
    public final Bundle m28521b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f31528a);
        bundle.putLong("tclose", this.f31529b);
        return bundle;
    }

    /* renamed from: c */
    public final void m28522c() {
        InterfaceC20285f interfaceC20285f;
        interfaceC20285f = this.f31530c.f17141a;
        this.f31529b = interfaceC20285f.mo105914b();
    }

    /* renamed from: d */
    public final void m28523d() {
        InterfaceC20285f interfaceC20285f;
        interfaceC20285f = this.f31530c.f17141a;
        this.f31528a = interfaceC20285f.mo105914b();
    }
}

package com.google.android.gms.common.api.internal;

import java.util.Map;
import p342m6.AbstractC22888j;
import p342m6.C22890k;
import p342m6.InterfaceC22878e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.l */
/* loaded from: classes2.dex */
public final class C4110l implements InterfaceC22878e {

    /* renamed from: a */
    final /* synthetic */ C22890k f16390a;

    /* renamed from: b */
    final /* synthetic */ C4113m f16391b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4110l(C4113m c4113m, C22890k c22890k) {
        this.f16391b = c4113m;
        this.f16390a = c22890k;
    }

    @Override // p342m6.InterfaceC22878e
    /* renamed from: a */
    public final void mo16804a(AbstractC22888j abstractC22888j) {
        Map map;
        map = this.f16391b.f16396b;
        map.remove(this.f16390a);
    }
}

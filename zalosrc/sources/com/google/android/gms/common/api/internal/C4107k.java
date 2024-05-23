package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import p669y4.AbstractC30286c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.k */
/* loaded from: classes2.dex */
public final class C4107k implements AbstractC30286c.a {

    /* renamed from: a */
    final /* synthetic */ BasePendingResult f16385a;

    /* renamed from: b */
    final /* synthetic */ C4113m f16386b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4107k(C4113m c4113m, BasePendingResult basePendingResult) {
        this.f16386b = c4113m;
        this.f16385a = basePendingResult;
    }

    @Override // p669y4.AbstractC30286c.a
    /* renamed from: a */
    public final void mo19490a(Status status) {
        Map map;
        map = this.f16386b.f16395a;
        map.remove(this.f16385a);
    }
}

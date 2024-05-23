package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC4202n;
import java.util.concurrent.TimeUnit;
import p342m6.C22890k;
import p669y4.AbstractC30286c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.internal.k0 */
/* loaded from: classes2.dex */
public final class C4194k0 implements AbstractC30286c.a {

    /* renamed from: a */
    final /* synthetic */ AbstractC30286c f16620a;

    /* renamed from: b */
    final /* synthetic */ C22890k f16621b;

    /* renamed from: c */
    final /* synthetic */ AbstractC4202n.a f16622c;

    /* renamed from: d */
    final /* synthetic */ InterfaceC4200m0 f16623d;

    public C4194k0(AbstractC30286c abstractC30286c, C22890k c22890k, AbstractC4202n.a aVar, InterfaceC4200m0 interfaceC4200m0) {
        this.f16620a = abstractC30286c;
        this.f16621b = c22890k;
        this.f16622c = aVar;
        this.f16623d = interfaceC4200m0;
    }

    @Override // p669y4.AbstractC30286c.a
    /* renamed from: a */
    public final void mo19490a(Status status) {
        if (status.m19223M()) {
            this.f16621b.m117596c(this.f16622c.mo19135a(this.f16620a.mo19277b(0L, TimeUnit.MILLISECONDS)));
        } else {
            this.f16621b.m117595b(AbstractC4166b.m19628a(status));
        }
    }
}

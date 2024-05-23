package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.InterfaceC4187i;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.w */
/* loaded from: classes2.dex */
public final class C4140w extends AbstractRunnableC4078a0 {

    /* renamed from: q */
    private final ArrayList f16461q;

    /* renamed from: r */
    final /* synthetic */ C4081b0 f16462r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4140w(C4081b0 c4081b0, ArrayList arrayList) {
        super(c4081b0, null);
        this.f16462r = c4081b0;
        this.f16461q = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC4078a0
    /* renamed from: a */
    public final void mo19305a() {
        C4105j0 c4105j0;
        InterfaceC4187i interfaceC4187i;
        C4105j0 c4105j02;
        C4081b0 c4081b0 = this.f16462r;
        c4105j0 = c4081b0.f16239a;
        c4105j0.f16370C.f16328p = C4081b0.m19338x(c4081b0);
        ArrayList arrayList = this.f16461q;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            C4071a.f fVar = (C4071a.f) arrayList.get(i11);
            C4081b0 c4081b02 = this.f16462r;
            interfaceC4187i = c4081b02.f16253o;
            c4105j02 = c4081b02.f16239a;
            fVar.getRemoteService(interfaceC4187i, c4105j02.f16370C.f16328p);
        }
    }
}

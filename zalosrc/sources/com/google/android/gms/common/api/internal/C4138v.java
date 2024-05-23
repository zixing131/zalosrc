package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4071a;
import com.google.android.gms.common.internal.AbstractC4172d;
import com.google.android.gms.common.internal.C4182g0;
import java.util.ArrayList;
import java.util.Map;
import p257j6.InterfaceC20935e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.common.api.internal.v */
/* loaded from: classes2.dex */
public final class C4138v extends AbstractRunnableC4078a0 {

    /* renamed from: q */
    private final Map f16455q;

    /* renamed from: r */
    final /* synthetic */ C4081b0 f16456r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4138v(C4081b0 c4081b0, Map map) {
        super(c4081b0, null);
        this.f16456r = c4081b0;
        this.f16455q = map;
    }

    @Override // com.google.android.gms.common.api.internal.AbstractRunnableC4078a0
    /* renamed from: a */
    public final void mo19305a() {
        C4148b c4148b;
        Context context;
        boolean z11;
        Context context2;
        C4105j0 c4105j0;
        InterfaceC20935e interfaceC20935e;
        InterfaceC20935e interfaceC20935e2;
        C4105j0 c4105j02;
        Context context3;
        boolean z12;
        c4148b = this.f16456r.f16242d;
        C4182g0 c4182g0 = new C4182g0(c4148b);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C4071a.f fVar : this.f16455q.keySet()) {
            if (fVar.requiresGooglePlayServices()) {
                z12 = ((C4131s) this.f16455q.get(fVar)).f16435c;
                if (!z12) {
                    arrayList.add(fVar);
                }
            }
            arrayList2.add(fVar);
        }
        int i11 = -1;
        int i12 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (i12 < size) {
                C4071a.f fVar2 = (C4071a.f) arrayList2.get(i12);
                context3 = this.f16456r.f16241c;
                i11 = c4182g0.m19686b(context3, fVar2);
                i12++;
                if (i11 == 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (i12 < size2) {
                C4071a.f fVar3 = (C4071a.f) arrayList.get(i12);
                context = this.f16456r.f16241c;
                i11 = c4182g0.m19686b(context, fVar3);
                i12++;
                if (i11 != 0) {
                    break;
                }
            }
        }
        if (i11 != 0) {
            ConnectionResult connectionResult = new ConnectionResult(i11, null);
            C4081b0 c4081b0 = this.f16456r;
            c4105j02 = c4081b0.f16239a;
            c4105j02.m19486m(new C4134t(this, c4081b0, connectionResult));
            return;
        }
        C4081b0 c4081b02 = this.f16456r;
        z11 = c4081b02.f16251m;
        if (z11) {
            interfaceC20935e = c4081b02.f16249k;
            if (interfaceC20935e != null) {
                interfaceC20935e2 = c4081b02.f16249k;
                interfaceC20935e2.mo31517b();
            }
        }
        for (C4071a.f fVar4 : this.f16455q.keySet()) {
            AbstractC4172d.c cVar = (AbstractC4172d.c) this.f16455q.get(fVar4);
            if (fVar4.requiresGooglePlayServices()) {
                context2 = this.f16456r.f16241c;
                if (c4182g0.m19686b(context2, fVar4) != 0) {
                    C4081b0 c4081b03 = this.f16456r;
                    c4105j0 = c4081b03.f16239a;
                    c4105j0.m19486m(new C4136u(this, c4081b03, cVar));
                }
            }
            fVar4.connect(cVar);
        }
    }
}

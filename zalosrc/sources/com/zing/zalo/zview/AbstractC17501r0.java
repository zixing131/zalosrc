package com.zing.zalo.zview;

import androidx.lifecycle.C1800v0;
import androidx.lifecycle.C1802w0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mn0.InterfaceC23364b;
import pm0.InterfaceC24854k;

/* renamed from: com.zing.zalo.zview.r0 */
/* loaded from: classes7.dex */
public abstract class AbstractC17501r0 {

    /* renamed from: com.zing.zalo.zview.r0$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f89192q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ZaloView zaloView) {
            super(0);
            this.f89192q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C1802w0.b mo12V4() {
            C1802w0.b mo4646Xs = this.f89192q.mo4646Xs();
            AbstractC19074t.m100207e(mo4646Xs, "defaultViewModelProviderFactory");
            return mo4646Xs;
        }
    }

    /* renamed from: a */
    public static final InterfaceC24854k m93124a(ZaloView zaloView, InterfaceC23364b interfaceC23364b, InterfaceC18494a interfaceC18494a, InterfaceC18494a interfaceC18494a2) {
        AbstractC19074t.m100208f(zaloView, "<this>");
        AbstractC19074t.m100208f(interfaceC23364b, "viewModelClass");
        AbstractC19074t.m100208f(interfaceC18494a, "storeProducer");
        if (interfaceC18494a2 == null) {
            interfaceC18494a2 = new a(zaloView);
        }
        return new C1800v0(interfaceC23364b, interfaceC18494a, interfaceC18494a2, null, 8, null);
    }
}

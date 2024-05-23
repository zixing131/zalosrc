package com.zing.zalo.zinstant.zom.profiler;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes7.dex */
public final class ZOMDocumentEventHandler {
    public static final ZOMDocumentEventHandler INSTANCE = new ZOMDocumentEventHandler();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.zinstant.zom.profiler.ZOMDocumentEventHandler$a */
    /* loaded from: classes7.dex */
    public static final class C17281a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f87999t;

        /* renamed from: u */
        final /* synthetic */ Runnable f88000u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C17281a(Runnable runnable, Continuation continuation) {
            super(2, continuation);
            this.f88000u = runnable;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C17281a(this.f88000u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f87999t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f88000u.run();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C17281a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    private ZOMDocumentEventHandler() {
    }

    public static final void prepareLayout(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "prepareTask");
        runnable.run();
    }

    public static final void syncLayout(Runnable runnable) {
        AbstractC19074t.m100208f(runnable, "syncTask");
        BuildersKt.m112532e(Dispatchers.m112681c(), new C17281a(runnable, null));
    }
}

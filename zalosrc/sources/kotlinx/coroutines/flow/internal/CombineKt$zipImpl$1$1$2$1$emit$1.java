package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1", m145345f = "Combine.kt", m145346l = {128}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class CombineKt$zipImpl$1$1$2$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f107293s;

    /* renamed from: t */
    final /* synthetic */ CombineKt$zipImpl$1$1.C218662.AnonymousClass1 f107294t;

    /* renamed from: u */
    int f107295u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$2$1$emit$1(CombineKt$zipImpl$1$1.C218662.AnonymousClass1 anonymousClass1, Continuation continuation) {
        super(continuation);
        this.f107294t = anonymousClass1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107293s = obj;
        this.f107295u |= Integer.MIN_VALUE;
        return this.f107294t.mo12109b(null, this);
    }
}

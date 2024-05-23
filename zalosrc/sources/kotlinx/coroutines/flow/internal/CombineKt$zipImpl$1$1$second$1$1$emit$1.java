package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1$1", m145345f = "Combine.kt", m145346l = {90}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class CombineKt$zipImpl$1$1$second$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f107300s;

    /* renamed from: t */
    final /* synthetic */ CombineKt$zipImpl$1$1$second$1.C218671 f107301t;

    /* renamed from: u */
    int f107302u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$zipImpl$1$1$second$1$1$emit$1(CombineKt$zipImpl$1$1$second$1.C218671 c218671, Continuation continuation) {
        super(continuation);
        this.f107301t = c218671;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107300s = obj;
        this.f107302u |= Integer.MIN_VALUE;
        return this.f107301t.mo12109b(null, this);
    }
}

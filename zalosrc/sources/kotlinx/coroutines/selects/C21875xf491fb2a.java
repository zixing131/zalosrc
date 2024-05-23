package kotlinx.coroutines.selects;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.selects.SelectImplementation", m145345f = "Select.kt", m145346l = {706}, m145347m = "processResultAndInvokeBlockRecoveringException")
/* renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 */
/* loaded from: classes7.dex */
public final class C21875xf491fb2a extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f107542s;

    /* renamed from: t */
    final /* synthetic */ SelectImplementation f107543t;

    /* renamed from: u */
    int f107544u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21875xf491fb2a(SelectImplementation selectImplementation, Continuation continuation) {
        super(continuation);
        this.f107543t = selectImplementation;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m113851u;
        this.f107542s = obj;
        this.f107544u |= Integer.MIN_VALUE;
        m113851u = this.f107543t.m113851u(null, null, this);
        return m113851u;
    }
}

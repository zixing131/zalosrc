package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.SharedFlowImpl", m145345f = "SharedFlow.kt", m145346l = {372, 379, 382}, m145347m = "collect$suspendImpl")
/* loaded from: classes7.dex */
public final class SharedFlowImpl$collect$1<T> extends AbstractC29096d {

    /* renamed from: s */
    Object f107122s;

    /* renamed from: t */
    Object f107123t;

    /* renamed from: u */
    Object f107124u;

    /* renamed from: v */
    Object f107125v;

    /* renamed from: w */
    /* synthetic */ Object f107126w;

    /* renamed from: x */
    final /* synthetic */ SharedFlowImpl f107127x;

    /* renamed from: y */
    int f107128y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedFlowImpl$collect$1(SharedFlowImpl sharedFlowImpl, Continuation continuation) {
        super(continuation);
        this.f107127x = sharedFlowImpl;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107126w = obj;
        this.f107128y |= Integer.MIN_VALUE;
        return SharedFlowImpl.m113440C(this.f107127x, null, this);
    }
}

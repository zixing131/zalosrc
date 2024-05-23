package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18510q;
import fn0.C19071q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes7.dex */
/* synthetic */ class SafeCollectorKt$emitFun$1 extends C19071q implements InterfaceC18510q {

    /* renamed from: y */
    public static final SafeCollectorKt$emitFun$1 f107323y = new SafeCollectorKt$emitFun$1();

    SafeCollectorKt$emitFun$1() {
        super(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object mo45599Hr(FlowCollector flowCollector, Object obj, Continuation continuation) {
        return flowCollector.mo12109b(obj, continuation);
    }
}

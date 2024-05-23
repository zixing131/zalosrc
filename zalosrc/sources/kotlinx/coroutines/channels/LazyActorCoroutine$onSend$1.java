package kotlinx.coroutines.channels;

import en0.InterfaceC18510q;
import fn0.C19071q;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.C24848g0;

/* loaded from: classes7.dex */
/* synthetic */ class LazyActorCoroutine$onSend$1 extends C19071q implements InterfaceC18510q {

    /* renamed from: y */
    public static final LazyActorCoroutine$onSend$1 f106294y = new LazyActorCoroutine$onSend$1();

    LazyActorCoroutine$onSend$1() {
        super(3, LazyActorCoroutine.class, "onSendRegFunction", "onSendRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: Hr */
    public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
        m113183h((LazyActorCoroutine) obj, (SelectInstance) obj2, obj3);
        return C24848g0.f119245a;
    }

    /* renamed from: h */
    public final void m113183h(LazyActorCoroutine lazyActorCoroutine, SelectInstance selectInstance, Object obj) {
        lazyActorCoroutine.m113182w1(selectInstance, obj);
    }
}

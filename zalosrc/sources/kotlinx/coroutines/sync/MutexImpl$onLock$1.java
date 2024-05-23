package kotlinx.coroutines.sync;

import en0.InterfaceC18510q;
import fn0.C19071q;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final /* synthetic */ class MutexImpl$onLock$1 extends C19071q implements InterfaceC18510q {

    /* renamed from: y */
    public static final MutexImpl$onLock$1 f107584y = new MutexImpl$onLock$1();

    MutexImpl$onLock$1() {
        super(3, MutexImpl.class, "onLockRegFunction", "onLockRegFunction(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: Hr */
    public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
        m113905h((MutexImpl) obj, (SelectInstance) obj2, obj3);
        return C24848g0.f119245a;
    }

    /* renamed from: h */
    public final void m113905h(MutexImpl mutexImpl, SelectInstance selectInstance, Object obj) {
        mutexImpl.m113898v(selectInstance, obj);
    }
}

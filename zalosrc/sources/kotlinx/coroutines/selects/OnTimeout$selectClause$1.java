package kotlinx.coroutines.selects;

import en0.InterfaceC18510q;
import fn0.C19071q;
import pm0.C24848g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public /* synthetic */ class OnTimeout$selectClause$1 extends C19071q implements InterfaceC18510q {

    /* renamed from: y */
    public static final OnTimeout$selectClause$1 f107507y = new OnTimeout$selectClause$1();

    OnTimeout$selectClause$1() {
        super(3, OnTimeout.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: Hr */
    public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
        m113827h((OnTimeout) obj, (SelectInstance) obj2, obj3);
        return C24848g0.f119245a;
    }

    /* renamed from: h */
    public final void m113827h(OnTimeout onTimeout, SelectInstance selectInstance, Object obj) {
        onTimeout.m113825c(selectInstance, obj);
    }
}

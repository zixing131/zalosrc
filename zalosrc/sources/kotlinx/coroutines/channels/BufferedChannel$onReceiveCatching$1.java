package kotlinx.coroutines.channels;

import en0.InterfaceC18510q;
import fn0.C19071q;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.C24848g0;

/* loaded from: classes7.dex */
/* synthetic */ class BufferedChannel$onReceiveCatching$1 extends C19071q implements InterfaceC18510q {

    /* renamed from: y */
    public static final BufferedChannel$onReceiveCatching$1 f106021y = new BufferedChannel$onReceiveCatching$1();

    BufferedChannel$onReceiveCatching$1() {
        super(3, BufferedChannel.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: Hr */
    public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
        m113034h((BufferedChannel) obj, (SelectInstance) obj2, obj3);
        return C24848g0.f119245a;
    }

    /* renamed from: h */
    public final void m113034h(BufferedChannel bufferedChannel, SelectInstance selectInstance, Object obj) {
        bufferedChannel.m112935G0(selectInstance, obj);
    }
}

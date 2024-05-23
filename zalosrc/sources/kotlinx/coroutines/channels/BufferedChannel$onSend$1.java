package kotlinx.coroutines.channels;

import en0.InterfaceC18510q;
import fn0.C19071q;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.C24848g0;

/* loaded from: classes7.dex */
/* synthetic */ class BufferedChannel$onSend$1 extends C19071q implements InterfaceC18510q {

    /* renamed from: y */
    public static final BufferedChannel$onSend$1 f106025y = new BufferedChannel$onSend$1();

    BufferedChannel$onSend$1() {
        super(3, BufferedChannel.class, "registerSelectForSend", "registerSelectForSend(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: Hr */
    public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
        m113038h((BufferedChannel) obj, (SelectInstance) obj2, obj3);
        return C24848g0.f119245a;
    }

    /* renamed from: h */
    public final void m113038h(BufferedChannel bufferedChannel, SelectInstance selectInstance, Object obj) {
        bufferedChannel.mo112907H0(selectInstance, obj);
    }
}

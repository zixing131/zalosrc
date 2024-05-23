package kotlinx.coroutines;

import en0.InterfaceC18510q;
import fn0.C19071q;
import kotlinx.coroutines.selects.SelectInstance;
import pm0.C24848g0;

/* loaded from: classes7.dex */
final /* synthetic */ class JobSupport$onJoin$1 extends C19071q implements InterfaceC18510q {

    /* renamed from: y */
    public static final JobSupport$onJoin$1 f105926y = new JobSupport$onJoin$1();

    JobSupport$onJoin$1() {
        super(3, JobSupport.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: Hr */
    public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
        m112852h((JobSupport) obj, (SelectInstance) obj2, obj3);
        return C24848g0.f119245a;
    }

    /* renamed from: h */
    public final void m112852h(JobSupport jobSupport, SelectInstance selectInstance, Object obj) {
        jobSupport.m112796c1(selectInstance, obj);
    }
}

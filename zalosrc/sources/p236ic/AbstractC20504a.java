package p236ic;

import fn0.AbstractC19074t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import p205hc.AbstractC19962a;

/* renamed from: ic.a */
/* loaded from: classes3.dex */
public abstract class AbstractC20504a {
    /* renamed from: a */
    public static final CoroutineScope m106544a(AbstractC19962a abstractC19962a) {
        AbstractC19074t.m100208f(abstractC19962a, "$this$presenterScope");
        CoroutineScope coroutineScope = (CoroutineScope) abstractC19962a.m103743Ep("com.zing.zalo.ui.base.PresenterCoroutineScope.JOB_KEY");
        if (coroutineScope != null) {
            return coroutineScope;
        }
        return (CoroutineScope) abstractC19962a.m103745Gp("com.zing.zalo.ui.base.PresenterCoroutineScope.JOB_KEY", new C20505b(SupervisorKt.m112864b(null, 1, null).mo112823d0(Dispatchers.m112681c().mo112861G0())));
    }
}

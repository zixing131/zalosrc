package nn0;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* renamed from: nn0.i */
/* loaded from: classes7.dex */
public abstract class AbstractC23900i {
    /* renamed from: a */
    public abstract Object mo124992a(Object obj, Continuation continuation);

    /* renamed from: d */
    public abstract Object mo124993d(Iterator it, Continuation continuation);

    /* renamed from: e */
    public final Object m124995e(InterfaceC23898g interfaceC23898g, Continuation continuation) {
        Object m142578e;
        Object mo124993d = mo124993d(interfaceC23898g.iterator(), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo124993d == m142578e) {
            return mo124993d;
        }
        return C24848g0.f119245a;
    }
}

package wn0;

import fn0.AbstractC19060k;
import java.util.List;
import kotlinx.serialization.KSerializer;
import mn0.InterfaceC23364b;
import qm0.AbstractC25368s;
import qn0.InterfaceC25386a;
import qn0.InterfaceC25393h;

/* renamed from: wn0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC29112b {
    private AbstractC29112b() {
    }

    public /* synthetic */ AbstractC29112b(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    public static /* synthetic */ KSerializer m145364c(AbstractC29112b abstractC29112b, InterfaceC23364b interfaceC23364b, List list, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                list = AbstractC25368s.m131502j();
            }
            return abstractC29112b.mo145361b(interfaceC23364b, list);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
    }

    /* renamed from: a */
    public abstract void mo145360a(InterfaceC29114d interfaceC29114d);

    /* renamed from: b */
    public abstract KSerializer mo145361b(InterfaceC23364b interfaceC23364b, List list);

    /* renamed from: d */
    public abstract InterfaceC25386a mo145362d(InterfaceC23364b interfaceC23364b, String str);

    /* renamed from: e */
    public abstract InterfaceC25393h mo145363e(InterfaceC23364b interfaceC23364b, Object obj);
}

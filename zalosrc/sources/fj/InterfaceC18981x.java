package fj;

import hm0.InterfaceC20094a;
import java.util.List;
import java.util.Map;

/* renamed from: fj.x */
/* loaded from: classes.dex */
public interface InterfaceC18981x {

    /* renamed from: fj.x$a */
    /* loaded from: classes3.dex */
    public static final class a {
        /* renamed from: a */
        public static /* synthetic */ void m99615a(InterfaceC18981x interfaceC18981x, List list, boolean z11, int i11, int i12, InterfaceC20094a interfaceC20094a, int i13, Object obj) {
            if (obj == null) {
                if ((i13 & 16) != 0) {
                    interfaceC20094a = null;
                }
                interfaceC18981x.mo99478a(list, z11, i11, i12, interfaceC20094a);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAckMsg");
        }
    }

    /* renamed from: a */
    void mo99478a(List list, boolean z11, int i11, int i12, InterfaceC20094a interfaceC20094a);

    /* renamed from: b */
    void mo99479b(Map map, String str, InterfaceC20094a interfaceC20094a);
}

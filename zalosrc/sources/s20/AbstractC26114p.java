package s20;

import androidx.lifecycle.AbstractC1803x;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import um0.C27316g;
import um0.InterfaceC27315f;

/* renamed from: s20.p */
/* loaded from: classes5.dex */
public abstract class AbstractC26114p {
    /* renamed from: a */
    public static final void m134443a(ZaloView zaloView, InterfaceC27315f interfaceC27315f, CoroutineStart coroutineStart, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(zaloView, "<this>");
        AbstractC19074t.m100208f(interfaceC27315f, "context");
        AbstractC19074t.m100208f(coroutineStart, "start");
        AbstractC19074t.m100208f(interfaceC18509p, "block");
        InterfaceC1801w m92657cJ = zaloView.m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        BuildersKt.m112530c(AbstractC1803x.m9388a(m92657cJ), interfaceC27315f, coroutineStart, interfaceC18509p);
    }

    /* renamed from: b */
    public static /* synthetic */ void m134444b(ZaloView zaloView, InterfaceC27315f interfaceC27315f, CoroutineStart coroutineStart, InterfaceC18509p interfaceC18509p, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            interfaceC27315f = C27316g.f128559p;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        m134443a(zaloView, interfaceC27315f, coroutineStart, interfaceC18509p);
    }
}

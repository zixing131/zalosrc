package kotlinx.coroutines.flow;

import com.zing.zalo.feed.mvp.profile.model.theme.Image;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
public final class StateFlowKt {

    /* renamed from: a */
    private static final Symbol f107170a = new Symbol(Image.SCALE_TYPE_NONE);

    /* renamed from: b */
    private static final Symbol f107171b = new Symbol("PENDING");

    /* renamed from: a */
    public static final MutableStateFlow m113503a(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.f107313a;
        }
        return new StateFlowImpl(obj);
    }

    /* renamed from: d */
    public static final Flow m113506d(StateFlow stateFlow, InterfaceC27315f interfaceC27315f, int i11, BufferOverflow bufferOverflow) {
        if (((i11 >= 0 && i11 < 2) || i11 == -2) && bufferOverflow == BufferOverflow.DROP_OLDEST) {
            return stateFlow;
        }
        return SharedFlowKt.m113481e(stateFlow, interfaceC27315f, i11, bufferOverflow);
    }
}

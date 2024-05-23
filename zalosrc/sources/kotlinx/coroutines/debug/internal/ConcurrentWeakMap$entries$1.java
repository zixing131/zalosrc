package kotlinx.coroutines.debug.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19075u;
import java.util.Map;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;

/* loaded from: classes7.dex */
final class ConcurrentWeakMap$entries$1 extends AbstractC19075u implements InterfaceC18509p {

    /* renamed from: q */
    public static final ConcurrentWeakMap$entries$1 f106347q = new ConcurrentWeakMap$entries$1();

    ConcurrentWeakMap$entries$1() {
        super(2);
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: a */
    public final Map.Entry mo240pC(Object obj, Object obj2) {
        return new ConcurrentWeakMap.Entry(obj, obj2);
    }
}

package kotlinx.coroutines.internal;

import en0.InterfaceC18509p;
import fn0.AbstractC19075u;
import kotlinx.coroutines.ThreadContextElement;
import um0.InterfaceC27315f;

/* loaded from: classes.dex */
final class ThreadContextKt$countAll$1 extends AbstractC19075u implements InterfaceC18509p {

    /* renamed from: q */
    public static final ThreadContextKt$countAll$1 f107426q = new ThreadContextKt$countAll$1();

    ThreadContextKt$countAll$1() {
        super(2);
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(Object obj, InterfaceC27315f.b bVar) {
        Integer num;
        int i11;
        if (bVar instanceof ThreadContextElement) {
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i11 = num.intValue();
            } else {
                i11 = 1;
            }
            if (i11 != 0) {
                return Integer.valueOf(i11 + 1);
            }
            return bVar;
        }
        return obj;
    }
}

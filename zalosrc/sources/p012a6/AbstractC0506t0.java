package p012a6;

import java.util.Iterator;

/* renamed from: a6.t0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0506t0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m875a(Iterator it) {
        it.getClass();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}

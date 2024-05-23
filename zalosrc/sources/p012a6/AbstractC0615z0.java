package p012a6;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: a6.z0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0615z0 {
    /* renamed from: a */
    public static List m903a(List list, InterfaceC0428oh interfaceC0428oh) {
        if (list instanceof RandomAccess) {
            return new C0561w0(list, interfaceC0428oh);
        }
        return new C0597y0(list, interfaceC0428oh);
    }
}

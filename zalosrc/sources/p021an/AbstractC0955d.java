package p021an;

import android.content.Context;
import fn0.AbstractC19074t;
import mn0.InterfaceC23364b;

/* renamed from: an.d */
/* loaded from: classes3.dex */
public abstract class AbstractC0955d {
    /* renamed from: a */
    public static final Object m4496a(Context context, InterfaceC23364b interfaceC23364b) {
        Object obj;
        InterfaceC0954c interfaceC0954c;
        AbstractC19074t.m100208f(interfaceC23364b, "cls");
        if (context != null) {
            obj = context.getApplicationContext();
        } else {
            obj = null;
        }
        if (obj instanceof InterfaceC0954c) {
            interfaceC0954c = (InterfaceC0954c) obj;
        } else {
            interfaceC0954c = null;
        }
        if (interfaceC0954c == null) {
            return null;
        }
        return interfaceC0954c.mo4494b(interfaceC23364b);
    }
}

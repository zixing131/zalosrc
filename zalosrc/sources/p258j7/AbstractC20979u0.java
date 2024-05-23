package p258j7;

import android.content.Context;
import p291k7.AbstractC21532p0;

/* renamed from: j7.u0 */
/* loaded from: classes3.dex */
public abstract class AbstractC20979u0 {

    /* renamed from: a */
    private static InterfaceC20969p0 f102891a;

    /* renamed from: a */
    public static synchronized InterfaceC20969p0 m109516a(Context context) {
        InterfaceC20969p0 interfaceC20969p0;
        synchronized (AbstractC20979u0.class) {
            try {
                if (f102891a == null) {
                    C20943c0 c20943c0 = new C20943c0(null);
                    c20943c0.m109475a(new C20954i(AbstractC21532p0.m111187a(context)));
                    f102891a = c20943c0.m109476b();
                }
                interfaceC20969p0 = f102891a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC20969p0;
    }
}

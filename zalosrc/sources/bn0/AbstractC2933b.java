package bn0;

import java.io.Closeable;
import pm0.AbstractC24845f;

/* renamed from: bn0.b */
/* loaded from: classes.dex */
public abstract class AbstractC2933b {
    /* renamed from: a */
    public static final void m13890a(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                AbstractC24845f.m129182a(th2, th3);
            }
        }
    }
}

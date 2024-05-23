package kotlinx.coroutines.internal;

import pm0.AbstractC24862s;
import pm0.C24861r;

/* loaded from: classes7.dex */
public final class FastServiceLoaderKt {

    /* renamed from: a */
    private static final boolean f107373a = false;

    static {
        Object m129218b;
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        C24861r.m129224h(m129218b);
    }

    /* renamed from: a */
    public static final boolean m113633a() {
        return f107373a;
    }
}

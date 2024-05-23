package kotlinx.coroutines.internal;

import p001a.C0001a;
import pm0.AbstractC24862s;
import pm0.C24861r;
import wm0.AbstractC29093a;

/* loaded from: classes7.dex */
public final class StackTraceRecoveryKt {

    /* renamed from: a */
    private static final StackTraceElement f107417a = new C0001a().m0a();

    /* renamed from: b */
    private static final String f107418b;

    /* renamed from: c */
    private static final String f107419c;

    static {
        Object m129218b;
        Object m129218b2;
        try {
            C24861r.a aVar = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC29093a.class.getCanonicalName());
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (C24861r.m129221e(m129218b) != null) {
            m129218b = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f107418b = (String) m129218b;
        try {
            m129218b2 = C24861r.m129218b(StackTraceRecoveryKt.class.getCanonicalName());
        } catch (Throwable th3) {
            C24861r.a aVar3 = C24861r.f119264q;
            m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th3));
        }
        if (C24861r.m129221e(m129218b2) != null) {
            m129218b2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f107419c = (String) m129218b2;
    }

    /* renamed from: a */
    public static final Throwable m113712a(Throwable th2) {
        return th2;
    }
}

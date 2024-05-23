package me0;

import am.AbstractC0924m0;
import au.C2352i0;
import ck.C3560a;
import com.zing.zalocore.CoreUtility;
import de0.C17907e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.concurrent.atomic.AtomicBoolean;
import mm0.AbstractC23350e;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import pm0.C24848g0;

/* renamed from: me0.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC23138m0 {
    public static final a Companion = new a(null);

    /* renamed from: me0.m0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m118774a() {
            boolean z11 = false;
            if (AbstractC23304d.f113427q1.get()) {
                return false;
            }
            String str = CoreUtility.f89233i;
            if (str == null || str.length() == 0) {
                CoreUtility.f89233i = AbstractC23309i.m121738b1();
            }
            String str2 = CoreUtility.f89233i;
            if (str2 == null || str2.length() == 0) {
                z11 = true;
            }
            return !z11;
        }

        /* renamed from: b */
        public final String m118775b() {
            try {
                String str = CoreUtility.f89233i;
                if (str != null && str.length() != 0) {
                    String str2 = CoreUtility.f89233i;
                    AbstractC19074t.m100207e(str2, "currentUserUid");
                    return str2;
                }
                String m121738b1 = AbstractC23309i.m121738b1();
                if (m121738b1 != null && m121738b1.length() != 0) {
                    AbstractC19074t.m100205c(m121738b1);
                    return m121738b1;
                }
                return "";
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }

        /* renamed from: c */
        public final long m118776c() {
            long m3328P1 = AbstractC0924m0.m3328P1();
            if (m3328P1 != -1) {
                return m3328P1;
            }
            long m121260O5 = AbstractC23309i.m121260O5();
            AbstractC0924m0.m3316Oi(m121260O5);
            return m121260O5;
        }

        /* renamed from: d */
        public final boolean m118777d() {
            String str;
            String str2 = CoreUtility.f89233i;
            if (str2 != null && str2.length() != 0 && (str = CoreUtility.f89232h) != null && str.length() != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final boolean m118778e() {
            String str;
            int i11;
            boolean z11;
            String m121675Zd = AbstractC23309i.m121675Zd();
            String str2 = CoreUtility.f89233i;
            if (str2 == null || str2.length() == 0 || (str = CoreUtility.f89232h) == null || str.length() == 0) {
                return false;
            }
            AbstractC19074t.m100205c(m121675Zd);
            int length = m121675Zd.length() - 1;
            int i12 = 0;
            boolean z12 = false;
            while (i12 <= length) {
                if (!z12) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(m121675Zd.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z12) {
                    if (!z11) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                } else {
                    if (!z11) {
                        break;
                    }
                    length--;
                }
            }
            if (m121675Zd.subSequence(i12, length + 1).toString().length() == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public final void m118779f(boolean z11) {
            m118782i(z11, true);
        }

        /* renamed from: g */
        public final void m118780g(boolean z11, C3560a c3560a, boolean z12) {
            m118781h(z11, c3560a, z12, null);
        }

        /* renamed from: h */
        public final void m118781h(boolean z11, C3560a c3560a, boolean z12, C2352i0 c2352i0) {
            try {
                try {
                    Object obj = AbstractC23304d.f113423p1;
                    AbstractC19074t.m100207e(obj, "lockLogout");
                    synchronized (obj) {
                        AbstractC23304d.f113415n1 = false;
                        AbstractC23304d.f113419o1 = false;
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                    AtomicBoolean atomicBoolean = AbstractC23304d.f113427q1;
                    atomicBoolean.set(true);
                    C17907e m120719v0 = AbstractC23306f.m120719v0();
                    AbstractC19074t.m100207e(m120719v0, "provideLogOutUseCase(...)");
                    m120719v0.m101508a(new C17907e.b(z11, c3560a, z12, c2352i0));
                    atomicBoolean.set(false);
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("LogOutUseCase", e11);
                    AbstractC23304d.f113427q1.set(false);
                }
            } catch (Throwable th2) {
                AbstractC23304d.f113427q1.set(false);
                throw th2;
            }
        }

        /* renamed from: i */
        public final void m118782i(boolean z11, boolean z12) {
            m118780g(z11, null, z12);
        }
    }

    /* renamed from: a */
    public static final String m118769a() {
        return Companion.m118775b();
    }

    /* renamed from: b */
    public static final boolean m118770b() {
        return Companion.m118777d();
    }

    /* renamed from: c */
    public static final void m118771c(boolean z11) {
        Companion.m118779f(z11);
    }

    /* renamed from: d */
    public static final void m118772d(boolean z11, C3560a c3560a, boolean z12) {
        Companion.m118780g(z11, c3560a, z12);
    }

    /* renamed from: e */
    public static final void m118773e(boolean z11, C3560a c3560a, boolean z12, C2352i0 c2352i0) {
        Companion.m118781h(z11, c3560a, z12, c2352i0);
    }
}

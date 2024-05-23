package p621wu;

import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Map;
import p140ev.C18622k;

/* renamed from: wu.f */
/* loaded from: classes4.dex */
public final class C29249f {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static C29249f f135460b;

    /* renamed from: a */
    private final Map f135461a = new HashMap();

    /* renamed from: wu.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C29249f m146031a() {
            return C29249f.f135460b;
        }

        /* renamed from: b */
        public final synchronized C29249f m146032b() {
            C29249f m146031a;
            try {
                if (m146031a() == null) {
                    m146033c(new C29249f());
                }
                m146031a = m146031a();
                AbstractC19074t.m100205c(m146031a);
            } catch (Throwable th2) {
                throw th2;
            }
            return m146031a;
        }

        /* renamed from: c */
        public final void m146033c(C29249f c29249f) {
            C29249f.f135460b = c29249f;
        }
    }

    /* renamed from: c */
    public final synchronized void m146028c() {
        try {
            this.f135461a.clear();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public final synchronized C18622k m146029d(String str) {
        AbstractC19074t.m100208f(str, "domain");
        return (C18622k) this.f135461a.get(str);
    }

    /* renamed from: e */
    public final synchronized void m146030e(String str, C18622k c18622k) {
        try {
            AbstractC19074t.m100208f(str, "domain");
            AbstractC19074t.m100208f(c18622k, "token");
            try {
                if (!TextUtils.isEmpty(str) && c18622k.m98419d()) {
                    C18622k c18622k2 = (C18622k) this.f135461a.get(str);
                    if (c18622k2 != null) {
                        if (c18622k.m98417b() >= c18622k2.m98417b()) {
                            this.f135461a.put(str, c18622k);
                        }
                    } else {
                        this.f135461a.put(str, c18622k);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

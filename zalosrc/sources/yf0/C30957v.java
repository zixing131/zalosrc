package yf0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.C1802w0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: yf0.v */
/* loaded from: classes5.dex */
public final class C30957v extends C1802w0.c {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static C30957v f142872c;

    /* renamed from: yf0.v$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final synchronized C30957v m150573a() {
            C30957v c30957v;
            try {
                if (C30957v.f142872c == null) {
                    C30957v.f142872c = new C30957v();
                }
                c30957v = C30957v.f142872c;
                AbstractC19074t.m100205c(c30957v);
            } catch (Throwable th2) {
                throw th2;
            }
            return c30957v;
        }
    }

    /* renamed from: g */
    private final AbstractC1796t0 m150572g() {
        return new C30933c0();
    }

    @Override // androidx.lifecycle.C1802w0.c, androidx.lifecycle.C1802w0.b
    /* renamed from: b */
    public AbstractC1796t0 mo1196b(Class cls) {
        AbstractC19074t.m100208f(cls, "modelClass");
        if (cls.isAssignableFrom(C30933c0.class)) {
            AbstractC1796t0 m150572g = m150572g();
            AbstractC19074t.m100206d(m150572g, "null cannot be cast to non-null type T of com.zing.zalo.webview.zbrowserimp.ViewModelFactory.create");
            return m150572g;
        }
        throw new IllegalArgumentException("Unknown ViewModel class: " + cls.getName());
    }
}

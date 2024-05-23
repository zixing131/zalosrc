package qk0;

import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.properties.ZOMRect;

/* renamed from: qk0.c */
/* loaded from: classes7.dex */
public interface InterfaceC25307c {

    /* renamed from: qk0.c$a */
    /* loaded from: classes7.dex */
    public interface a {
        public static final C32950a Companion = C32950a.f121361a;

        /* renamed from: qk0.c$a$a */
        /* loaded from: classes7.dex */
        public static final class C32950a {

            /* renamed from: a */
            static final /* synthetic */ C32950a f121361a = new C32950a();

            /* renamed from: b */
            private static final ZOMRect f121362b = new ZOMRect();

            private C32950a() {
            }

            /* renamed from: a */
            public final ZOMRect m130963a() {
                return f121362b;
            }
        }

        /* renamed from: qk0.c$a$b */
        /* loaded from: classes7.dex */
        public static final class b {
            /* renamed from: a */
            public static /* synthetic */ void m130964a(a aVar, ZOMRect zOMRect, int i11, Object obj) {
                if (obj == null) {
                    if ((i11 & 1) != 0) {
                        zOMRect = a.Companion.m130963a();
                    }
                    aVar.mo92118a(zOMRect);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: run");
            }
        }

        /* renamed from: a */
        void mo92118a(ZOMRect zOMRect);
    }

    /* renamed from: b */
    void mo124409b();

    /* renamed from: c */
    void mo124506c(a aVar);

    /* renamed from: f */
    void mo130962f(ZOM zom, int i11);

    /* renamed from: g */
    void mo124710g(ZOM zom, int i11);
}

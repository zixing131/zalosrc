package com.zing.zalo.zdesign.component.header;

import android.view.Window;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.InterfaceC1795t;
import androidx.lifecycle.InterfaceC1801w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gi0.C19451a;
import ho0.AbstractC20110a;

/* loaded from: classes7.dex */
public final class StatusBarAppearanceUtil {

    /* renamed from: a */
    public static final StatusBarAppearanceUtil f86791a = new StatusBarAppearanceUtil();

    /* renamed from: b */
    private static StatusBarObserver f86792b;

    /* renamed from: c */
    private static final C19451a f86793c;

    /* loaded from: classes7.dex */
    public static final class StatusBarObserver implements InterfaceC1795t {
        public static final C16983a Companion = new C16983a(null);

        /* renamed from: p */
        private Window f86794p;

        /* renamed from: q */
        private C19451a f86795q;

        /* renamed from: r */
        private C19451a f86796r;

        /* renamed from: s */
        private InterfaceC1801w f86797s;

        /* renamed from: com.zing.zalo.zdesign.component.header.StatusBarAppearanceUtil$StatusBarObserver$a */
        /* loaded from: classes7.dex */
        public static final class C16983a {
            private C16983a() {
            }

            public /* synthetic */ C16983a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        /* renamed from: com.zing.zalo.zdesign.component.header.StatusBarAppearanceUtil$StatusBarObserver$b */
        /* loaded from: classes7.dex */
        public /* synthetic */ class C16984b {

            /* renamed from: a */
            public static final /* synthetic */ int[] f86798a;

            static {
                int[] iArr = new int[AbstractC1785o.a.values().length];
                try {
                    iArr[AbstractC1785o.a.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC1785o.a.ON_PAUSE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC1785o.a.ON_DESTROY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f86798a = iArr;
            }
        }

        @Override // androidx.lifecycle.InterfaceC1795t
        /* renamed from: X6 */
        public void mo4652X6(InterfaceC1801w interfaceC1801w, AbstractC1785o.a aVar) {
            AbstractC19074t.m100208f(interfaceC1801w, "source");
            AbstractC19074t.m100208f(aVar, "event");
            int i11 = C16984b.f86798a[aVar.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        m90988c();
                        return;
                    }
                    return;
                } else {
                    C19451a c19451a = this.f86796r;
                    if (c19451a != null) {
                        m90987b(c19451a);
                        return;
                    }
                    return;
                }
            }
            C19451a c19451a2 = this.f86795q;
            if (c19451a2 != null) {
                m90987b(c19451a2);
            }
        }

        /* renamed from: b */
        public final void m90987b(C19451a c19451a) {
            AbstractC19074t.m100208f(c19451a, "statusBarAppearance");
            Window window = this.f86794p;
            if (window != null) {
                c19451a.m101750a(window);
            }
        }

        /* renamed from: c */
        public final void m90988c() {
            AbstractC1785o lifecycle;
            try {
                InterfaceC1801w interfaceC1801w = this.f86797s;
                if (interfaceC1801w != null && (lifecycle = interfaceC1801w.getLifecycle()) != null) {
                    lifecycle.mo9338d(this);
                }
                StatusBarAppearanceUtil.f86792b = null;
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    static {
        C19451a c19451a = new C19451a();
        c19451a.m101751b(false);
        c19451a.m101752c(true);
        f86793c = c19451a;
    }

    private StatusBarAppearanceUtil() {
    }
}

package t60;

import com.androidquery.util.C3977j;
import com.zing.zalo.MainApplication;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19075u;
import hu.C20131e;
import java.io.File;
import mm0.AbstractC23350e;
import p056cj.C3538f;
import p354n3.C23528a;
import p379o3.C24002m;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: t60.c */
/* loaded from: classes5.dex */
public final class C26495c {
    public static final c Companion = new c(null);

    /* renamed from: a */
    private static final InterfaceC24854k f125732a;

    /* renamed from: b */
    private static final InterfaceC24854k f125733b;

    /* renamed from: t60.c$a */
    /* loaded from: classes5.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f125734q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3977j mo12V4() {
            return new C3977j(MainApplication.Companion.m35500c());
        }
    }

    /* renamed from: t60.c$b */
    /* loaded from: classes5.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f125735q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C26495c mo12V4() {
            return d.f125736a.m136480a();
        }
    }

    /* renamed from: t60.c$c */
    /* loaded from: classes5.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public final C3977j m136478b() {
            return (C3977j) C26495c.f125732a.getValue();
        }

        /* renamed from: c */
        public final C26495c m136479c() {
            return (C26495c) C26495c.f125733b.getValue();
        }
    }

    /* renamed from: t60.c$d */
    /* loaded from: classes5.dex */
    public static final class d {

        /* renamed from: a */
        public static final d f125736a = new d();

        /* renamed from: b */
        private static final C26495c f125737b = new C26495c(null);

        private d() {
        }

        /* renamed from: a */
        public final C26495c m136480a() {
            return f125737b;
        }
    }

    static {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(a.f125734q);
        f125732a = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f125735q);
        f125733b = m129210a2;
    }

    private C26495c() {
    }

    public /* synthetic */ C26495c(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: c */
    public static final C26495c m136473c() {
        return Companion.m136479c();
    }

    /* renamed from: d */
    public final void m136474d(C3538f c3538f, C23528a c23528a) {
        if (c3538f != null && c23528a != null) {
            try {
                File file = new File(C20131e.f99303a.m104953g() + c3538f.m17982a());
                if (!file.exists() && !C24002m.m125822K1(c3538f.f14927c)) {
                    ((C23528a) c23528a.m123612r(Companion.m136478b())).m123601f(c3538f.f14927c, file, new C24002m(3));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ChatThemePreload", e11);
            }
        }
    }
}

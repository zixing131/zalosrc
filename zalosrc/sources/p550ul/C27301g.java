package p550ul;

import am.AbstractC0924m0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23244v8;
import tg0.C26676b;

/* renamed from: ul.g */
/* loaded from: classes3.dex */
public final class C27301g {
    public static final a Companion = new a(null);

    /* renamed from: ul.g$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C27301g m139821a() {
            return b.f128521a.m139822a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ul.g$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f128521a = new b();

        /* renamed from: b */
        private static final C27301g f128522b = new C27301g();

        private b() {
        }

        /* renamed from: a */
        public final C27301g m139822a() {
            return f128522b;
        }
    }

    /* renamed from: a */
    public static final C27301g m139818a() {
        return Companion.m139821a();
    }

    /* renamed from: b */
    public final String m139819b() {
        String m3297O = AbstractC0924m0.m3297O();
        AbstractC19074t.m100207e(m3297O, "getCloudViewerKey(...)");
        return m3297O;
    }

    /* renamed from: c */
    public final void m139820c(String str) {
        AbstractC19074t.m100208f(str, "viewerKey");
        if (str.length() == 0) {
            return;
        }
        C26676b.m136955e("SMLZCloudViewerKeyManager", "updateKey(): " + AbstractC23244v8.m119735E(str, 20), C26676b.b.f126332q);
        AbstractC0924m0.m4375ye(str);
    }
}

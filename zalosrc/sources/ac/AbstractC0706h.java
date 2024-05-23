package ac;

import android.text.TextUtils;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ac.h */
/* loaded from: classes3.dex */
public abstract class AbstractC0706h {

    /* renamed from: a */
    private static boolean f2321a;

    /* renamed from: b */
    private static boolean f2322b;
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static String f2323c = "";

    /* renamed from: d */
    private static String f2324d = "";

    /* renamed from: ac.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m1068a(boolean z11, String str) {
            AbstractC19074t.m100208f(str, "parentPath");
            AbstractC0706h.f2322b = z11;
            if (z11 && !TextUtils.isEmpty(str)) {
                AbstractC0706h.f2323c = str;
            }
        }

        /* renamed from: b */
        public final void m1069b(boolean z11) {
            AbstractC0706h.f2321a = z11;
        }
    }
}

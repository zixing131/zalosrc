package androidx.window.layout;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import kotlinx.coroutines.flow.Flow;

/* renamed from: androidx.window.layout.a0 */
/* loaded from: classes2.dex */
public interface InterfaceC2092a0 {

    /* renamed from: a */
    public static final a f8955a = a.f8956a;

    /* renamed from: androidx.window.layout.a0$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f8956a = new a();

        /* renamed from: b */
        private static final String f8957b = AbstractC19061k0.m100169b(InterfaceC2092a0.class).mo100163c();

        /* renamed from: c */
        private static InterfaceC2094b0 f8958c = C2115m.f8981a;

        private a() {
        }

        /* renamed from: a */
        public final InterfaceC2092a0 m11325a(Context context) {
            AbstractC19074t.m100208f(context, "context");
            return f8958c.mo11328a(new C2096c0(C2114l0.f8979b, m11326b(context)));
        }

        /* renamed from: b */
        public final InterfaceC2127y m11326b(Context context) {
            AbstractC19074t.m100208f(context, "context");
            C2118p c2118p = null;
            try {
                WindowLayoutComponent m11397m = C2122t.f9003a.m11397m();
                if (m11397m != null) {
                    c2118p = new C2118p(m11397m);
                }
            } catch (Throwable unused) {
            }
            if (c2118p == null) {
                return C2125w.f9017c.m11426a(context);
            }
            return c2118p;
        }
    }

    /* renamed from: a */
    Flow mo11324a(Activity activity);
}

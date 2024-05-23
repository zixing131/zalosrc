package y50;

import android.view.View;
import android.view.ViewGroup;
import fn0.AbstractC19074t;

/* renamed from: y50.c */
/* loaded from: classes5.dex */
public interface InterfaceC30793c {

    /* renamed from: y50.c$a */
    /* loaded from: classes5.dex */
    public interface a {
        /* renamed from: a */
        boolean mo61438a(ViewGroup viewGroup, float f11, float f12);

        /* renamed from: b */
        boolean mo61439b(ViewGroup viewGroup, float f11, float f12);

        /* renamed from: c */
        boolean mo61440c(ViewGroup viewGroup, float f11, float f12);

        /* renamed from: d */
        boolean mo61441d(ViewGroup viewGroup, float f11, float f12);
    }

    /* renamed from: y50.c$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        public View f142121a;

        /* renamed from: b */
        public C30795e f142122b;

        /* renamed from: c */
        private int f142123c;

        /* renamed from: d */
        private int f142124d;

        /* renamed from: e */
        private CharSequence f142125e = "";

        /* renamed from: f */
        private int f142126f = -1;

        /* renamed from: g */
        private int f142127g = -1;

        /* renamed from: h */
        private int f142128h = -1;

        /* renamed from: i */
        private int f142129i = -1;

        /* renamed from: a */
        public final C30795e m149757a() {
            C30795e c30795e = this.f142122b;
            if (c30795e != null) {
                return c30795e;
            }
            AbstractC19074t.m100223u("layout");
            return null;
        }

        /* renamed from: b */
        public final int m149758b() {
            return this.f142123c;
        }

        /* renamed from: c */
        public final int m149759c() {
            return this.f142124d;
        }

        /* renamed from: d */
        public final int m149760d() {
            return this.f142129i;
        }

        /* renamed from: e */
        public final int m149761e() {
            return this.f142128h;
        }

        /* renamed from: f */
        public final CharSequence m149762f() {
            return this.f142125e;
        }

        /* renamed from: g */
        public final View m149763g() {
            View view = this.f142121a;
            if (view != null) {
                return view;
            }
            AbstractC19074t.m100223u("view");
            return null;
        }

        /* renamed from: h */
        public final void m149764h(C30795e c30795e) {
            AbstractC19074t.m100208f(c30795e, "<set-?>");
            this.f142122b = c30795e;
        }

        /* renamed from: i */
        public final void m149765i(int i11) {
            this.f142123c = i11;
        }

        /* renamed from: j */
        public final void m149766j(int i11) {
            this.f142124d = i11;
        }

        /* renamed from: k */
        public final void m149767k(int i11) {
            this.f142129i = i11;
        }

        /* renamed from: l */
        public final void m149768l(int i11) {
            this.f142128h = i11;
        }

        /* renamed from: m */
        public final void m149769m(int i11) {
            this.f142127g = i11;
        }

        /* renamed from: n */
        public final void m149770n(int i11) {
            this.f142126f = i11;
        }

        /* renamed from: o */
        public final void m149771o(CharSequence charSequence) {
            AbstractC19074t.m100208f(charSequence, "<set-?>");
            this.f142125e = charSequence;
        }

        /* renamed from: p */
        public final void m149772p(View view) {
            AbstractC19074t.m100208f(view, "<set-?>");
            this.f142121a = view;
        }
    }

    /* renamed from: G3 */
    boolean mo61421G3();

    /* renamed from: K0 */
    void mo61422K0(b bVar);

    /* renamed from: K2 */
    void mo61423K2(b bVar);

    /* renamed from: i1 */
    void mo61427i1();

    void setMoveTextSelectHandleController(a aVar);

    void setOnFirstReleaseAfterSelectingNewTextListener(Runnable runnable);
}

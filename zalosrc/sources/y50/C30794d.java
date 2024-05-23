package y50;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import pm0.AbstractC24856m;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: y50.d */
/* loaded from: classes5.dex */
public final class C30794d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private C30795e f142130a;

    /* renamed from: b */
    private b f142131b;

    /* renamed from: c */
    private final InterfaceC24854k f142132c;

    /* renamed from: d */
    private final int f142133d;

    /* renamed from: e */
    private final int f142134e;

    /* renamed from: f */
    private final int f142135f;

    /* renamed from: g */
    private final Rect f142136g;

    /* renamed from: h */
    private final Rect f142137h;

    /* renamed from: i */
    private final PointF f142138i;

    /* renamed from: j */
    private final Point f142139j;

    /* renamed from: y50.d$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: y50.d$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: p */
        public static final b f142140p = new b("NULL", 0);

        /* renamed from: q */
        public static final b f142141q = new b("START", 1);

        /* renamed from: r */
        public static final b f142142r = new b("END", 2);

        /* renamed from: s */
        public static final b f142143s = new b("INITIAL", 3);

        /* renamed from: t */
        private static final /* synthetic */ b[] f142144t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f142145u;

        static {
            b[] m149798b = m149798b();
            f142144t = m149798b;
            f142145u = AbstractC30166b.m148796a(m149798b);
        }

        private b(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m149798b() {
            return new b[]{f142140p, f142141q, f142142r, f142143s};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f142144t.clone();
        }
    }

    /* renamed from: y50.d$c */
    /* loaded from: classes5.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f142146a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f142141q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f142142r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f142146a = iArr;
        }
    }

    /* renamed from: y50.d$d */
    /* loaded from: classes5.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C30796f mo12V4() {
            return new C30796f(C30794d.this.f142130a.m149815n());
        }
    }

    public C30794d(C30795e c30795e) {
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(c30795e, "layout");
        this.f142130a = c30795e;
        this.f142131b = b.f142140p;
        m129210a = AbstractC24856m.m129210a(new d());
        this.f142132c = m129210a;
        this.f142133d = AbstractC23136l9.m118742r(5.0f);
        int m118742r = AbstractC23136l9.m118742r(11.0f);
        this.f142134e = m118742r;
        this.f142135f = (int) (m118742r * 1.5f);
        this.f142136g = new Rect();
        this.f142137h = new Rect();
        this.f142138i = new PointF();
        this.f142139j = new Point();
    }

    /* renamed from: b */
    private final boolean m149774b(Rect rect, float f11, float f12) {
        return rect.contains((int) f11, (int) f12);
    }

    /* renamed from: c */
    private final int m149775c(int i11) {
        int m149811j = this.f142130a.m149811j(i11);
        return m149811j + Character.charCount(Character.codePointAt(this.f142130a.m149815n(), m149811j));
    }

    /* renamed from: e */
    private final C24860q m149776e(float f11, float f12) {
        PointF pointF = this.f142138i;
        float f13 = f11 - pointF.x;
        Point point = this.f142139j;
        float f14 = f13 + point.x;
        float f15 = (f12 - pointF.y) + point.y;
        int m149809h = this.f142130a.m149809h(f15);
        if (m149778k(f14, m149809h)) {
            return new C24860q(Integer.valueOf(m149775c(m149809h)), Boolean.TRUE);
        }
        if (m149779l(f14, m149809h)) {
            return new C24860q(Integer.valueOf(this.f142130a.m149807e(m149809h)), Boolean.FALSE);
        }
        if (m149780m(f14, m149809h)) {
            return new C24860q(Integer.valueOf(m149775c(m149809h)), Boolean.TRUE);
        }
        return new C24860q(Integer.valueOf(this.f142130a.m149814m(f14, f15)), Boolean.FALSE);
    }

    /* renamed from: f */
    private final C30796f m149777f() {
        return (C30796f) this.f142132c.getValue();
    }

    /* renamed from: k */
    private final boolean m149778k(float f11, int i11) {
        int m149813l;
        if (this.f142131b != b.f142142r || (m149813l = this.f142130a.m149813l(f11, i11)) != this.f142130a.m149811j(i11) || m149813l <= m149788h()) {
            return false;
        }
        return this.f142130a.m149818s(i11 - 1);
    }

    /* renamed from: l */
    private final boolean m149779l(float f11, int i11) {
        if (f11 <= this.f142130a.m149810i(i11) || this.f142131b != b.f142142r) {
            return false;
        }
        return this.f142130a.m149818s(i11);
    }

    /* renamed from: m */
    private final boolean m149780m(float f11, int i11) {
        int m149813l;
        if (this.f142131b != b.f142141q || (m149813l = this.f142130a.m149813l(f11, i11)) != this.f142130a.m149811j(i11) || m149813l <= m149787g()) {
            return false;
        }
        return this.f142130a.m149818s(i11 - 1);
    }

    /* renamed from: n */
    private final boolean m149781n(float f11, float f12) {
        if (f11 > this.f142130a.m149810i(this.f142130a.m149809h(f12)) + this.f142133d) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private final void m149782v() {
        b bVar;
        m149777f().m149839u();
        int i11 = c.f142146a[this.f142131b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                bVar = this.f142131b;
            } else {
                bVar = b.f142141q;
            }
        } else {
            bVar = b.f142142r;
        }
        this.f142131b = bVar;
    }

    /* renamed from: w */
    private final void m149783w(int i11) {
        this.f142137h.setEmpty();
        int m149816o = this.f142130a.m149816o(i11, true);
        int m149808f = this.f142130a.m149808f(i11, true);
        int i12 = m149816o + this.f142134e;
        int m149806d = this.f142130a.m149806d(m149808f) + this.f142134e;
        Rect rect = this.f142137h;
        int i13 = this.f142135f;
        rect.set(i12 - i13, m149806d - i13, i12 + i13, m149806d + i13);
    }

    /* renamed from: x */
    private final void m149784x(int i11, int i12) {
        m149785y(i11);
        m149783w(i12);
    }

    /* renamed from: y */
    private final void m149785y(int i11) {
        this.f142136g.setEmpty();
        int m149802p = C30795e.m149802p(this.f142130a, i11, false, 2, null);
        int m149801g = C30795e.m149801g(this.f142130a, i11, false, 2, null);
        int i12 = m149802p - this.f142134e;
        int m149806d = this.f142130a.m149806d(m149801g) + this.f142134e;
        Rect rect = this.f142136g;
        int i13 = this.f142135f;
        rect.set(i12 - i13, m149806d - i13, i12 + i13, m149806d + i13);
    }

    /* renamed from: d */
    public final C30795e m149786d() {
        return this.f142130a;
    }

    /* renamed from: g */
    public final int m149787g() {
        return m149777f().m149831i();
    }

    /* renamed from: h */
    public final int m149788h() {
        return m149777f().m149832j();
    }

    /* renamed from: i */
    public final CharSequence m149789i() {
        return m149777f().m149833m();
    }

    /* renamed from: j */
    public final boolean m149790j(float f11, float f12) {
        if (!m149774b(this.f142136g, f11, f12) && !m149774b(this.f142137h, f11, f12)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean m149791o() {
        if (this.f142131b != b.f142140p) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final void m149792p(float f11, float f12) {
        int m149788h = m149788h();
        int m149787g = m149787g();
        C24860q m149776e = m149776e(f11, f12);
        int intValue = ((Number) m149776e.m129213a()).intValue();
        boolean booleanValue = ((Boolean) m149776e.m129214b()).booleanValue();
        if (this.f142131b == b.f142143s) {
            if (intValue > m149787g()) {
                this.f142131b = b.f142142r;
            } else if (intValue < m149788h()) {
                this.f142131b = b.f142141q;
            }
        }
        b bVar = this.f142131b;
        if (bVar == b.f142141q) {
            m149777f().m149835p(intValue, booleanValue);
        } else if (bVar == b.f142142r) {
            m149777f().m149834o(intValue, booleanValue);
        }
        if (m149788h() > m149787g()) {
            m149782v();
        }
        if (m149788h != m149788h() || m149787g != m149787g()) {
            m149784x(m149788h(), m149787g());
        }
    }

    /* renamed from: q */
    public final void m149793q(float f11, float f12, boolean z11) {
        if (z11) {
            this.f142131b = b.f142143s;
            return;
        }
        if (m149774b(this.f142136g, f11, f12)) {
            this.f142131b = b.f142141q;
            this.f142138i.set(f11, f12);
            this.f142139j.set(C30795e.m149802p(this.f142130a, m149788h(), false, 2, null), C30795e.m149803r(this.f142130a, m149788h(), false, 2, null));
        } else if (m149774b(this.f142137h, f11, f12)) {
            this.f142131b = b.f142142r;
            this.f142138i.set(f11, f12);
            this.f142139j.set(this.f142130a.m149816o(m149787g(), true), this.f142130a.m149817q(m149787g(), true));
        }
    }

    /* renamed from: r */
    public final void m149794r(int i11) {
        m149777f().m149836r(i11);
    }

    /* renamed from: s */
    public final void m149795s(C30795e c30795e) {
        AbstractC19074t.m100208f(c30795e, "newLayout");
        this.f142130a = c30795e;
        m149777f().m149838t(this.f142130a.m149815n());
    }

    /* renamed from: t */
    public final void m149796t(float f11, float f12) {
        int m149814m;
        if (!m149781n(f11, f12) && (m149814m = this.f142130a.m149814m(f11, f12)) >= 0 && m149814m <= m149777f().m149830g()) {
            m149777f().m149837s(m149814m);
            if (m149788h() != -1 && m149787g() != -1) {
                m149784x(m149788h(), m149787g());
            }
        }
    }

    /* renamed from: u */
    public final void m149797u() {
        this.f142138i.set(0.0f, 0.0f);
        this.f142139j.set(0, 0);
        this.f142131b = b.f142140p;
    }
}

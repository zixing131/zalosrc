package p687yn;

import com.zing.zalo.feed.formpostfeed.data.Display;
import fn0.AbstractC19074t;

/* renamed from: yn.a */
/* loaded from: classes4.dex */
public final class C31023a {

    /* renamed from: a */
    private final int f143086a;

    /* renamed from: c */
    private int f143088c;

    /* renamed from: d */
    private int f143089d;

    /* renamed from: f */
    private int f143091f;

    /* renamed from: g */
    private boolean f143092g;

    /* renamed from: j */
    private int f143095j;

    /* renamed from: b */
    private String f143087b = "";

    /* renamed from: e */
    private Display f143090e = Display.Companion.m44980a();

    /* renamed from: h */
    private String f143093h = "";

    /* renamed from: i */
    private String f143094i = "";

    public C31023a(int i11) {
        this.f143086a = i11;
    }

    /* renamed from: a */
    public final int m150831a() {
        return this.f143095j;
    }

    /* renamed from: b */
    public final int m150832b() {
        return this.f143089d;
    }

    /* renamed from: c */
    public final int m150833c() {
        return this.f143091f;
    }

    /* renamed from: d */
    public final Display m150834d() {
        return this.f143090e;
    }

    /* renamed from: e */
    public final int m150835e() {
        return this.f143086a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31023a) && this.f143086a == ((C31023a) obj).f143086a;
    }

    /* renamed from: f */
    public final boolean m150836f() {
        return this.f143092g;
    }

    /* renamed from: g */
    public final String m150837g() {
        return this.f143087b;
    }

    /* renamed from: h */
    public final int m150838h() {
        return this.f143088c;
    }

    public int hashCode() {
        return this.f143086a;
    }

    /* renamed from: i */
    public final String m150839i() {
        return this.f143093h;
    }

    /* renamed from: j */
    public final String m150840j() {
        return this.f143094i;
    }

    /* renamed from: k */
    public final void m150841k(int i11) {
        this.f143095j = i11;
    }

    /* renamed from: l */
    public final void m150842l(int i11) {
        this.f143089d = i11;
    }

    /* renamed from: m */
    public final void m150843m(int i11) {
        this.f143091f = i11;
    }

    /* renamed from: n */
    public final void m150844n(Display display) {
        AbstractC19074t.m100208f(display, "<set-?>");
        this.f143090e = display;
    }

    /* renamed from: o */
    public final void m150845o(boolean z11) {
        this.f143092g = z11;
    }

    /* renamed from: p */
    public final void m150846p(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f143087b = str;
    }

    /* renamed from: q */
    public final void m150847q(int i11) {
        this.f143088c = i11;
    }

    /* renamed from: r */
    public final void m150848r(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f143093h = str;
    }

    /* renamed from: s */
    public final void m150849s(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f143094i = str;
    }

    public String toString() {
        return "FpfCtaRenderData(id=" + this.f143086a + ")";
    }
}

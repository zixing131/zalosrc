package qi0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2816j;
import ei0.C18438c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: qi0.f */
/* loaded from: classes7.dex */
public final class C25297f {
    public static final a Companion = new a(null);

    /* renamed from: C */
    private boolean f121307C;

    /* renamed from: D */
    private AbstractC25298g f121308D;

    /* renamed from: E */
    private View f121309E;

    /* renamed from: J */
    private boolean f121314J;

    /* renamed from: L */
    private boolean f121316L;

    /* renamed from: d */
    private Drawable f121320d;

    /* renamed from: e */
    private Drawable f121321e;

    /* renamed from: j */
    private View f121326j;

    /* renamed from: k */
    private int f121327k;

    /* renamed from: l */
    private boolean f121328l;

    /* renamed from: m */
    private Rect f121329m;

    /* renamed from: p */
    private View f121332p;

    /* renamed from: q */
    private C25292a f121333q;

    /* renamed from: r */
    private Object f121334r;

    /* renamed from: s */
    private boolean f121335s;

    /* renamed from: t */
    private boolean f121336t;

    /* renamed from: u */
    private EnumC25294c f121337u;

    /* renamed from: y */
    private int f121341y;

    /* renamed from: z */
    private int f121342z;

    /* renamed from: a */
    private int f121317a = -2013265920;

    /* renamed from: b */
    private EnumC25295d f121318b = EnumC25295d.COMPACT;

    /* renamed from: c */
    private EnumC25294c f121319c = EnumC25294c.TOP;

    /* renamed from: f */
    private String f121322f = "";

    /* renamed from: g */
    private int f121323g = -1;

    /* renamed from: h */
    private CharSequence f121324h = "";

    /* renamed from: i */
    private int f121325i = 3553338;

    /* renamed from: n */
    private boolean f121330n = true;

    /* renamed from: o */
    private EnumC25293b f121331o = EnumC25293b.RECTANGLE;

    /* renamed from: v */
    private String f121338v = "";

    /* renamed from: w */
    private String f121339w = "";

    /* renamed from: x */
    private String f121340x = "";

    /* renamed from: A */
    private String f121305A = "";

    /* renamed from: B */
    private boolean f121306B = true;

    /* renamed from: F */
    private boolean f121310F = true;

    /* renamed from: G */
    private boolean f121311G = true;

    /* renamed from: H */
    private boolean f121312H = true;

    /* renamed from: I */
    private boolean f121313I = true;

    /* renamed from: K */
    private boolean f121315K = true;

    /* renamed from: qi0.f$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C25297f m130959a(Context context) {
            C25297f c25297f = new C25297f();
            c25297f.m130945m0(EnumC25295d.COMPACT);
            c25297f.f121317a = 0;
            AbstractC19074t.m100205c(context);
            c25297f.m130909O(AbstractC1388a.m6964f(context, AbstractC2810d.bg_tooltip_container));
            c25297f.m130908N(AbstractC1388a.m6964f(context, AbstractC2810d.ic_arrow_up_center));
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            c25297f.m130931f0(aVar.m13592a(context, AbstractC2807a.tooltip_text_title));
            c25297f.m130929e0(aVar.m13592a(context, AbstractC2807a.tooltip_text_body_secondary));
            c25297f.m130912R(EnumC25293b.NONE);
            return c25297f;
        }
    }

    /* renamed from: A */
    public final int m130895A() {
        return this.f121323g;
    }

    /* renamed from: B */
    public final String m130896B() {
        return this.f121322f;
    }

    /* renamed from: C */
    public final AbstractC25298g m130897C() {
        return this.f121308D;
    }

    /* renamed from: D */
    public final int m130898D() {
        return this.f121342z;
    }

    /* renamed from: E */
    public final boolean m130899E() {
        return this.f121310F;
    }

    /* renamed from: F */
    public final boolean m130900F() {
        return this.f121313I;
    }

    /* renamed from: G */
    public final boolean m130901G() {
        return this.f121312H;
    }

    /* renamed from: H */
    public final boolean m130902H() {
        return this.f121311G;
    }

    /* renamed from: I */
    public final boolean m130903I() {
        return this.f121314J;
    }

    /* renamed from: J */
    public final boolean m130904J() {
        return this.f121336t;
    }

    /* renamed from: K */
    public final boolean m130905K() {
        return this.f121335s;
    }

    /* renamed from: L */
    public final EnumC25295d m130906L() {
        return this.f121318b;
    }

    /* renamed from: M */
    public final void m130907M(Object obj, Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f121334r = obj;
        if (this.f121308D == null) {
            this.f121308D = C18438c.f92957a.m97716b(context).mo88402a(context);
        }
        AbstractC25298g abstractC25298g = this.f121308D;
        if (abstractC25298g != null) {
            abstractC25298g.mo88434g(this, obj);
        }
    }

    /* renamed from: N */
    public final void m130908N(Drawable drawable) {
        this.f121320d = drawable;
    }

    /* renamed from: O */
    public final void m130909O(Drawable drawable) {
        this.f121321e = drawable;
    }

    /* renamed from: P */
    public final void m130910P(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f121339w = str;
    }

    /* renamed from: Q */
    public final void m130911Q(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f121340x = str;
    }

    /* renamed from: R */
    public final void m130912R(EnumC25293b enumC25293b) {
        AbstractC19074t.m100208f(enumC25293b, "<set-?>");
        this.f121331o = enumC25293b;
    }

    /* renamed from: S */
    public final void m130913S(View view) {
        this.f121309E = view;
    }

    /* renamed from: T */
    public final void m130914T(C25292a c25292a) {
        this.f121333q = c25292a;
    }

    /* renamed from: U */
    public final void m130915U(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f121338v = str;
    }

    /* renamed from: V */
    public final void m130916V(boolean z11) {
        this.f121316L = z11;
    }

    /* renamed from: W */
    public final void m130917W(boolean z11) {
        this.f121315K = z11;
    }

    /* renamed from: X */
    public final void m130918X(EnumC25294c enumC25294c) {
        this.f121337u = enumC25294c;
    }

    /* renamed from: Y */
    public final void m130919Y(boolean z11) {
        this.f121306B = z11;
    }

    /* renamed from: Z */
    public final void m130920Z(boolean z11) {
        this.f121307C = z11;
    }

    /* renamed from: a0 */
    public final void m130921a0(Rect rect) {
        this.f121329m = rect;
    }

    /* renamed from: b */
    public final Drawable m130922b() {
        return this.f121320d;
    }

    /* renamed from: b0 */
    public final void m130923b0(int i11) {
        this.f121327k = i11;
    }

    /* renamed from: c */
    public final Drawable m130924c() {
        return this.f121321e;
    }

    /* renamed from: c0 */
    public final void m130925c0(View view) {
        this.f121326j = view;
    }

    /* renamed from: d */
    public final String m130926d() {
        return this.f121339w;
    }

    /* renamed from: d0 */
    public final void m130927d0(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "<set-?>");
        this.f121324h = charSequence;
    }

    /* renamed from: e */
    public final String m130928e() {
        return this.f121340x;
    }

    /* renamed from: e0 */
    public final void m130929e0(int i11) {
        this.f121325i = i11;
    }

    /* renamed from: f */
    public final EnumC25293b m130930f() {
        return this.f121331o;
    }

    /* renamed from: f0 */
    public final void m130931f0(int i11) {
        this.f121323g = i11;
    }

    /* renamed from: g */
    public final int m130932g() {
        return this.f121341y;
    }

    /* renamed from: g0 */
    public final void m130933g0(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f121322f = str;
    }

    /* renamed from: h */
    public final View m130934h() {
        return this.f121309E;
    }

    /* renamed from: h0 */
    public final void m130935h0(AbstractC25298g abstractC25298g) {
        this.f121308D = abstractC25298g;
    }

    /* renamed from: i */
    public final String m130936i() {
        return this.f121305A;
    }

    /* renamed from: i0 */
    public final void m130937i0(boolean z11) {
        this.f121310F = z11;
    }

    /* renamed from: j */
    public final View m130938j() {
        return this.f121332p;
    }

    /* renamed from: j0 */
    public final void m130939j0(boolean z11) {
        this.f121313I = z11;
    }

    /* renamed from: k */
    public final C25292a m130940k() {
        return this.f121333q;
    }

    /* renamed from: k0 */
    public final void m130941k0(boolean z11) {
        this.f121311G = z11;
    }

    /* renamed from: l */
    public final int m130942l(Context context) {
        int m6961c;
        AbstractC19074t.m100208f(context, "context");
        if (!this.f121307C) {
            m6961c = 0;
        } else {
            m6961c = AbstractC1388a.m6961c(context, AbstractC2808b.blk_a70);
        }
        this.f121317a = m6961c;
        return m6961c;
    }

    /* renamed from: l0 */
    public final void m130943l0(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                this.f121310F = false;
                this.f121311G = false;
                this.f121312H = false;
                this.f121314J = false;
                return;
            }
            if (i11 == 2) {
                this.f121310F = true;
                this.f121311G = false;
                this.f121312H = false;
                this.f121314J = false;
                return;
            }
            if (i11 == 3) {
                this.f121310F = false;
                this.f121311G = false;
                this.f121312H = true;
                this.f121314J = false;
                return;
            }
            if (i11 != 4) {
                return;
            }
            this.f121310F = false;
            this.f121311G = false;
            this.f121312H = true;
            this.f121313I = false;
            this.f121314J = false;
            return;
        }
        this.f121310F = true;
        this.f121311G = true;
        this.f121312H = true;
        this.f121314J = false;
    }

    /* renamed from: m */
    public final boolean m130944m() {
        return this.f121328l;
    }

    /* renamed from: m0 */
    public final void m130945m0(EnumC25295d enumC25295d) {
        AbstractC19074t.m100208f(enumC25295d, "<set-?>");
        this.f121318b = enumC25295d;
    }

    /* renamed from: n */
    public final String m130946n() {
        return this.f121338v;
    }

    /* renamed from: o */
    public final boolean m130947o() {
        return this.f121316L;
    }

    /* renamed from: p */
    public final boolean m130948p() {
        return this.f121315K;
    }

    /* renamed from: q */
    public final EnumC25294c m130949q() {
        return this.f121337u;
    }

    /* renamed from: r */
    public final Object m130950r() {
        return this.f121334r;
    }

    /* renamed from: s */
    public final boolean m130951s() {
        return this.f121306B;
    }

    /* renamed from: t */
    public final boolean m130952t() {
        return this.f121307C;
    }

    /* renamed from: u */
    public final Rect m130953u() {
        return this.f121329m;
    }

    /* renamed from: v */
    public final boolean m130954v() {
        return this.f121330n;
    }

    /* renamed from: w */
    public final int m130955w() {
        return this.f121327k;
    }

    /* renamed from: x */
    public final View m130956x() {
        return this.f121326j;
    }

    /* renamed from: y */
    public final CharSequence m130957y() {
        return this.f121324h;
    }

    /* renamed from: z */
    public final int m130958z() {
        return this.f121325i;
    }
}

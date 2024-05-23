package p691yr;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import androidx.core.graphics.AbstractC1409d;
import bi0.AbstractC2807a;
import bo.C3020p0;
import bs.C3140c;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ItemAlbumMobile;
import com.zing.zalo.feed.data.NumberTheme;
import com.zing.zalo.feed.data.TextLocalization;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l30.AbstractC22047r0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import on0.AbstractC24340u;
import p167fs.C19137b;
import p516t3.C26469c;
import p566v3.C27508p;
import p588vw.C28652r;
import p691yr.C31063m;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import sj0.C26280e;
import vg.AbstractC28236y3;
import vl0.AbstractC28291a;

/* renamed from: yr.j */
/* loaded from: classes4.dex */
public final class C31060j {

    /* renamed from: a */
    public static final C31060j f143193a;

    /* renamed from: b */
    private static final List f143194b;

    /* renamed from: c */
    private static final C31058h f143195c;

    /* renamed from: d */
    private static C31065o f143196d;

    /* renamed from: e */
    private static final List f143197e;

    /* renamed from: yr.j$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f143198a;

        static {
            int[] iArr = new int[C31063m.a.values().length];
            try {
                iArr[C31063m.a.f143210p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C31063m.a.f143213s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C31063m.a.f143211q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C31063m.a.f143212r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C31063m.a.f143214t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f143198a = iArr;
        }
    }

    /* renamed from: yr.j$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC18505l {

        /* renamed from: p */
        final /* synthetic */ C31058h f143199p;

        b(C31058h c31058h) {
            this.f143199p = c31058h;
        }

        /* renamed from: a */
        public void m150951a(C26469c c26469c) {
            Bitmap bitmap;
            Bitmap bitmap2;
            C27508p m136406h;
            C31058h c31058h = this.f143199p;
            if (c26469c == null || (m136406h = c26469c.m136406h()) == null || (bitmap = C3140c.f13243a.m15796l(m136406h)) == null) {
                Drawable m150926t = C31060j.m150926t(C31060j.f143193a, this.f143199p.m150897h(), 0, 2, null);
                if (m150926t != null) {
                    bitmap = AbstractC22047r0.m115053k(m150926t);
                } else {
                    bitmap = null;
                }
            }
            if (bitmap != null) {
                int i11 = AbstractC23222t7.f112594x;
                bitmap2 = Bitmap.createScaledBitmap(bitmap, i11, i11, true);
            } else {
                bitmap2 = null;
            }
            c31058h.m150902m(bitmap2);
            C31058h c31058h2 = this.f143199p;
            if (c26469c != null) {
                int i12 = AbstractC23222t7.f112534M;
                c26469c.setBounds(0, 0, i12, i12);
            } else {
                c26469c = null;
            }
            c31058h2.m150903n(c26469c);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m150951a((C26469c) obj);
            return C24848g0.f119245a;
        }
    }

    static {
        C31060j c31060j = new C31060j();
        f143193a = c31060j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        f143194b = arrayList;
        f143195c = new C31058h(1, new TextLocalization("Thích", "Like"), true, "16691", "/-heart", new NumberTheme(-9253, -11403264), new NumberTheme(-14393, -9764864), new NumberTheme(-9764864, -14393), null, null, 768, null);
        f143197e = c31060j.m150923o();
    }

    private C31060j() {
    }

    /* renamed from: A */
    private final int m150904A(int i11, Context context, C31063m.a aVar) {
        NumberTheme m150892c;
        int value;
        if (m150910P(aVar)) {
            return AbstractC1409d.m7135d(C31063m.f143208a.m150961a(context, aVar).m150957a(), -7829368, 0.15f);
        }
        int m150960d = C31063m.f143208a.m150963c(context, aVar, m150911Q(i11)).m150960d();
        if (!m150935M()) {
            return m150960d;
        }
        C31058h m150907G = m150907G(i11);
        if (m150907G != null && (m150892c = m150907G.m150892c()) != null) {
            if (aVar == C31063m.a.f143210p) {
                value = m150892c.getDarkValue();
            } else {
                value = m150892c.getValue();
            }
            return AbstractC1409d.m7135d(value, -7829368, 0.15f);
        }
        return m150960d;
    }

    /* renamed from: B */
    private final int m150905B(int i11, Context context, C31063m.a aVar) {
        NumberTheme m150893d;
        if (m150910P(aVar)) {
            return 0;
        }
        int m150958b = C31063m.f143208a.m150963c(context, aVar, m150911Q(i11)).m150958b();
        if (!m150935M()) {
            return m150958b;
        }
        C31058h m150907G = m150907G(i11);
        if (m150907G != null && (m150893d = m150907G.m150893d()) != null) {
            if (aVar == C31063m.a.f143210p) {
                return m150893d.getDarkValue();
            }
            return m150893d.getValue();
        }
        return m150958b;
    }

    /* renamed from: E */
    public static /* synthetic */ Drawable m150906E(C31060j c31060j, int i11, Context context, C31063m.a aVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            aVar = C31063m.a.f143215u;
        }
        return c31060j.m150929D(i11, context, aVar);
    }

    /* renamed from: G */
    private final C31058h m150907G(int i11) {
        List m150971f;
        C31065o c31065o = f143196d;
        Object obj = null;
        if (c31065o == null || (m150971f = c31065o.m150971f()) == null) {
            return null;
        }
        Iterator it = m150971f.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C31058h) next).m150899j() == i11) {
                obj = next;
                break;
            }
        }
        return (C31058h) obj;
    }

    /* renamed from: K */
    private final Bitmap m150908K(int i11) {
        Bitmap bitmap;
        Drawable drawable;
        String str;
        C31058h m150907G = m150907G(i11);
        if (m150907G != null) {
            bitmap = m150907G.m150894e();
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            if (m150907G != null) {
                drawable = m150907G.m150895f();
            } else {
                drawable = null;
            }
            Bitmap m150919j = m150919j(drawable);
            if (m150919j != null) {
                return m150919j;
            }
            if (m150907G == null || (str = m150907G.m150897h()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                str = m150922n(i11);
            }
            Drawable m150926t = m150926t(this, str, 0, 2, null);
            if (m150926t == null) {
                return null;
            }
            return AbstractC22047r0.m115053k(m150926t);
        }
        return m150907G.m150894e();
    }

    /* renamed from: N */
    private final boolean m150909N(String str) {
        Long m127109o;
        long j11;
        C31065o c31065o = f143196d;
        boolean z11 = false;
        if (c31065o != null) {
            C31060j c31060j = f143193a;
            if (c31060j.m150935M()) {
                m127109o = AbstractC24340u.m127109o(str);
                if (m127109o != null) {
                    j11 = m127109o.longValue();
                } else {
                    j11 = 0;
                }
                if (j11 >= c31065o.m150970e()) {
                    z11 = true;
                }
            }
            C19137b.f95167a.m100444f("FEED_REACTION_CONFIG_MANAGER", "Check feed support multi reaction: \n enableFeature: " + c31060j.m150935M() + " - Feed id: " + str + " - feedRangedSupported: " + c31065o.m150970e());
        }
        return z11;
    }

    /* renamed from: P */
    private final boolean m150910P(C31063m.a aVar) {
        int i11 = a.f143198a[aVar.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    private final boolean m150911Q(int i11) {
        return i11 > 0;
    }

    /* renamed from: R */
    private final boolean m150912R() {
        boolean z11;
        boolean z12;
        if (m150924p().size() == 6) {
            z11 = true;
        } else {
            z11 = false;
        }
        List m150924p = m150924p();
        ArrayList arrayList = new ArrayList();
        for (Object obj : m150924p) {
            if (((C31058h) obj).m150895f() != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 6) {
            z12 = true;
        } else {
            z12 = false;
        }
        C19137b.f95167a.m100444f("FEED_REACTION_CONFIG_REPO", "Check valid reaction post: \n Valid reaction count: " + z11 + " - Valid reaction drawable: " + z12);
        if (!z11 || !z12) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public static final boolean m150913U() {
        C31065o c31065o = f143196d;
        if (c31065o != null) {
            return c31065o.m150969d();
        }
        return false;
    }

    /* renamed from: b */
    public static final EnumC31051a m150915b(C3020p0 c3020p0) {
        if (c3020p0 != null) {
            String str = c3020p0.f12057p;
            AbstractC19074t.m100207e(str, "fid");
            return m150917d(str);
        }
        return EnumC31051a.f143180t;
    }

    /* renamed from: c */
    public static final EnumC31051a m150916c(ItemAlbumMobile itemAlbumMobile) {
        String str;
        if (itemAlbumMobile != null) {
            String str2 = itemAlbumMobile.f42599t;
            if (str2 == null || str2.length() == 0) {
                C3020p0 c3020p0 = itemAlbumMobile.f42594q0;
                if (c3020p0 != null) {
                    str = c3020p0.f12057p;
                } else {
                    str = null;
                }
                str2 = str;
            }
            if (str2 == null) {
                str2 = "";
            } else {
                AbstractC19074t.m100205c(str2);
            }
            return m150917d(str2);
        }
        return EnumC31051a.f143180t;
    }

    /* renamed from: d */
    public static final EnumC31051a m150917d(String str) {
        List<C31058h> m150971f;
        AbstractC19074t.m100208f(str, "feedId");
        C31060j c31060j = f143193a;
        if (!c31060j.m150935M()) {
            return EnumC31051a.f143177q;
        }
        if (!c31060j.m150909N(str)) {
            return EnumC31051a.f143178r;
        }
        C31065o c31065o = f143196d;
        if (c31065o != null && (m150971f = c31065o.m150971f()) != null) {
            for (C31058h c31058h : m150971f) {
                if (c31058h.m150895f() == null) {
                    c31058h.m150903n(f143193a.m150920k(c31058h.m150896g(), c31058h.m150897h()));
                }
            }
        }
        if (!f143193a.m150912R()) {
            return EnumC31051a.f143179s;
        }
        return EnumC31051a.f143176p;
    }

    /* renamed from: i */
    public static final void m150918i() {
        if (AbstractC0924m0.m3898ic()) {
            AbstractC0924m0.m3437Sn(false);
        }
    }

    /* renamed from: j */
    private final Bitmap m150919j(Drawable drawable) {
        if (drawable instanceof C26469c) {
            C27508p m136406h = ((C26469c) drawable).m136406h();
            if (m136406h == null) {
                return null;
            }
            return C3140c.f13243a.m15796l(m136406h);
        }
        if (drawable == null) {
            return null;
        }
        return AbstractC22047r0.m115053k(drawable);
    }

    /* renamed from: k */
    private final Drawable m150920k(String str, String str2) {
        C3140c c3140c = C3140c.f13243a;
        C26469c m15794g = c3140c.m15794g(str);
        if (m15794g == null) {
            c3140c.m15797q(str);
            return m150926t(this, str2, 0, 2, null);
        }
        return m15794g;
    }

    /* renamed from: m */
    private final int m150921m(int i11, Context context, C31063m.a aVar) {
        if (m150911Q(i11)) {
            if (a.f143198a[aVar.ordinal()] == 1) {
                return f143195c.m150901l().getDarkValue();
            }
            return f143195c.m150901l().getValue();
        }
        int i12 = a.f143198a[aVar.ordinal()];
        if (i12 != 1) {
            if (i12 != 2 && i12 != 3 && i12 != 4) {
                return C23212s8.m119607o(context, AbstractC2807a.text_01);
            }
            return C23212s8.m119607o(context, AbstractC28291a.social_postreaction_text);
        }
        return C23212s8.m119607o(context, AbstractC2807a.text_on_color);
    }

    /* renamed from: n */
    private final String m150922n(int i11) {
        Object obj;
        String m150897h;
        Iterator it = f143197e.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((C31058h) obj).m150899j() == i11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C31058h c31058h = (C31058h) obj;
        if (c31058h == null || (m150897h = c31058h.m150897h()) == null) {
            return "";
        }
        return m150897h;
    }

    /* renamed from: o */
    private final List m150923o() {
        C31058h m150891a;
        m150891a = r0.m150891a((r22 & 1) != 0 ? r0.f143183a : 0, (r22 & 2) != 0 ? r0.f143184b : null, (r22 & 4) != 0 ? r0.f143185c : false, (r22 & 8) != 0 ? r0.f143186d : null, (r22 & 16) != 0 ? r0.f143187e : null, (r22 & 32) != 0 ? r0.f143188f : null, (r22 & 64) != 0 ? r0.f143189g : null, (r22 & 128) != 0 ? r0.f143190h : null, (r22 & 256) != 0 ? r0.f143191i : null, (r22 & 512) != 0 ? f143195c.f143192j : null);
        C31058h c31058h = new C31058h(2, new TextLocalization("Yêu", "Love"), true, "16719", ":b", new NumberTheme(-3385, -11387136), new NumberTheme(-4947, -9743872), new NumberTheme(-2053120, -344064), null, null, 768, null);
        C31058h c31058h2 = new C31058h(3, new TextLocalization("Haha", "Haha"), true, "16710", ":>", new NumberTheme(-3385, -11387136), new NumberTheme(-4947, -9743872), new NumberTheme(-2053120, -344064), null, null, 768, null);
        C31058h c31058h3 = new C31058h(4, new TextLocalization("Wow", "Wow"), true, "16550", ":o", new NumberTheme(-3385, -11387136), new NumberTheme(-4947, -9743872), new NumberTheme(-2053120, -344064), null, null, 768, null);
        C31058h c31058h4 = new C31058h(5, new TextLocalization("Huhu", "Huhu"), true, "16543", ":-((", new NumberTheme(-1577484, -14732211), new NumberTheme(-2497811, -14204062), new NumberTheme(-14732211, -3680795), null, null, 768, null);
        C31058h c31058h5 = new C31058h(6, new TextLocalization("Giận", "Angry"), true, "16544", ":-h", new NumberTheme(-5413, -11394816), new NumberTheme(-8761, -9753856), new NumberTheme(-9753856, -12627), null, null, 768, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m150891a);
        arrayList.add(c31058h);
        arrayList.add(c31058h2);
        arrayList.add(c31058h3);
        arrayList.add(c31058h4);
        arrayList.add(c31058h5);
        return arrayList;
    }

    /* renamed from: p */
    private final List m150924p() {
        List m131502j;
        List m150971f;
        C31065o c31065o = f143196d;
        if (c31065o == null || (m150971f = c31065o.m150971f()) == null) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : m150971f) {
            C31058h c31058h = (C31058h) obj;
            if (c31058h.m150899j() > 0 && c31058h.m150898i()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    private final Drawable m150925s(String str, int i11) {
        return C28652r.m143349v().m143375n(str, i11);
    }

    /* renamed from: t */
    static /* synthetic */ Drawable m150926t(C31060j c31060j, String str, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 40;
        }
        return c31060j.m150925s(str, i11);
    }

    /* renamed from: z */
    public static /* synthetic */ int m150927z(C31060j c31060j, int i11, Context context, C31063m.a aVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            aVar = C31063m.a.f143215u;
        }
        return c31060j.m150950y(i11, context, aVar);
    }

    /* renamed from: C */
    public final Drawable m150928C(int i11, Context context) {
        AbstractC19074t.m100208f(context, "context");
        return m150906E(this, i11, context, null, 4, null);
    }

    /* renamed from: D */
    public final Drawable m150929D(int i11, Context context, C31063m.a aVar) {
        Drawable m142199j;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "viewMode");
        Drawable m150959c = C31063m.f143208a.m150963c(context, aVar, m150911Q(i11)).m150959c();
        if (!m150935M()) {
            return m150959c;
        }
        if (m150911Q(i11) && (m142199j = AbstractC28236y3.m142199j(m150908K(i11))) != null) {
            return m142199j;
        }
        return m150959c;
    }

    /* renamed from: F */
    public final int m150930F(int i11) {
        if (!m150935M() || i11 < 0 || i11 >= m150924p().size()) {
            return 1;
        }
        return ((C31058h) m150924p().get(i11)).m150899j();
    }

    /* renamed from: H */
    public final String m150931H(int i11, Context context) {
        TextLocalization m150900k;
        String m44977b;
        AbstractC19074t.m100208f(context, "context");
        String m118749t0 = AbstractC23136l9.m118749t0(context, AbstractC8020f0.str_feed_reaction_default_emoji_heart_text);
        AbstractC19074t.m100207e(m118749t0, "getString(...)");
        if (!m150935M()) {
            return m118749t0;
        }
        C31058h m150907G = m150907G(i11);
        if (m150907G != null && (m150900k = m150907G.m150900k()) != null && (m44977b = m150900k.m44977b()) != null && m44977b.length() > 0) {
            return m44977b;
        }
        return m118749t0;
    }

    /* renamed from: I */
    public final int m150932I(int i11, Context context, int i12) {
        AbstractC19074t.m100208f(context, "context");
        return m150933J(i11, context, m150937S(i12));
    }

    /* renamed from: J */
    public final int m150933J(int i11, Context context, C31063m.a aVar) {
        NumberTheme m150901l;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "viewMode");
        int m150921m = m150921m(i11, context, aVar);
        if (!m150935M()) {
            return m150921m;
        }
        C31058h m150907G = m150907G(i11);
        if (m150907G != null && (m150901l = m150907G.m150901l()) != null) {
            if (aVar == C31063m.a.f143210p) {
                return m150901l.getDarkValue();
            }
            return m150901l.getValue();
        }
        return m150921m;
    }

    /* renamed from: L */
    public final void m150934L(C31065o c31065o) {
        AbstractC19074t.m100208f(c31065o, "config");
        f143196d = c31065o;
        C19137b.f95167a.m100444f("FEED_REACTION_CONFIG_MANAGER", "Init config");
    }

    /* renamed from: M */
    public final boolean m150935M() {
        C31065o c31065o = f143196d;
        if (c31065o != null) {
            return c31065o.m150968c();
        }
        return false;
    }

    /* renamed from: O */
    public final boolean m150936O(int i11) {
        return m150910P(m150937S(i11));
    }

    /* renamed from: S */
    public final C31063m.a m150937S(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 10) {
                            if (i11 != 12) {
                                return C31063m.a.f143215u;
                            }
                        } else {
                            return C31063m.a.f143210p;
                        }
                    } else {
                        return C31063m.a.f143213s;
                    }
                } else {
                    return C31063m.a.f143214t;
                }
            }
            return C31063m.a.f143212r;
        }
        return C31063m.a.f143211q;
    }

    /* renamed from: T */
    public final void m150938T() {
        C31065o c31065o;
        List<C31058h> m150971f;
        if (m150935M() && (c31065o = f143196d) != null && (m150971f = c31065o.m150971f()) != null) {
            for (C31058h c31058h : m150971f) {
                C3140c.f13243a.m15798r(c31058h.m150896g(), new b(c31058h));
            }
        }
    }

    /* renamed from: e */
    public final void m150939e() {
        f143196d = null;
        C19137b.f95167a.m100444f("FEED_REACTION_CONFIG_MANAGER", "Clear config");
    }

    /* renamed from: f */
    public final Drawable m150940f(int i11, Context context, int i12) {
        AbstractC19074t.m100208f(context, "context");
        return m150941g(i11, context, m150937S(i12));
    }

    /* renamed from: g */
    public final Drawable m150941g(int i11, Context context, C31063m.a aVar) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "viewMode");
        int m150950y = m150950y(i11, context, aVar);
        int m150905B = m150905B(i11, context, aVar);
        int m150904A = m150904A(i11, context, aVar);
        C26280e c26280e = new C26280e();
        c26280e.m135233l(AbstractC23222t7.f112581q0);
        c26280e.m135231j(m150950y);
        c26280e.mo135235o(m150904A);
        c26280e.m135236p(AbstractC23222t7.f112550b, m150905B);
        return c26280e;
    }

    /* renamed from: h */
    public final void m150942h() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: yr.i
            @Override // java.lang.Runnable
            public final void run() {
                C31060j.m150918i();
            }
        });
    }

    /* renamed from: l */
    public final List m150943l() {
        return f143194b;
    }

    /* renamed from: q */
    public final List m150944q() {
        int m131511r;
        List<C31058h> m150971f;
        List m131502j;
        if (!m150935M()) {
            m131502j = AbstractC25368s.m131502j();
            return m131502j;
        }
        C31065o c31065o = f143196d;
        if (c31065o != null && (m150971f = c31065o.m150971f()) != null) {
            for (C31058h c31058h : m150971f) {
                if (c31058h.m150895f() == null) {
                    c31058h.m150903n(f143193a.m150920k(c31058h.m150896g(), c31058h.m150897h()));
                }
            }
        }
        Drawable m118663M = AbstractC23136l9.m118663M(AbstractC16803z.bg_feed);
        if (m118663M == null) {
            m118663M = new ShapeDrawable();
        }
        List m150924p = m150924p();
        m131511r = AbstractC25370t.m131511r(m150924p, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = m150924p.iterator();
        while (it.hasNext()) {
            Drawable m150895f = ((C31058h) it.next()).m150895f();
            if (m150895f == null) {
                m150895f = m118663M;
            }
            arrayList.add(m150895f);
        }
        return arrayList;
    }

    /* renamed from: r */
    public final List m150945r() {
        return f143197e;
    }

    /* renamed from: u */
    public final int m150946u() {
        if (m150935M()) {
            return 2;
        }
        return 1;
    }

    /* renamed from: v */
    public final int m150947v() {
        if (m150935M()) {
            return 3;
        }
        return 1;
    }

    /* renamed from: w */
    public final int m150948w() {
        if (m150935M()) {
            return 3;
        }
        return 2;
    }

    /* renamed from: x */
    public final int m150949x(int i11, Context context) {
        AbstractC19074t.m100208f(context, "context");
        return m150927z(this, i11, context, null, 4, null);
    }

    /* renamed from: y */
    public final int m150950y(int i11, Context context, C31063m.a aVar) {
        NumberTheme m150892c;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, "viewMode");
        if (m150910P(aVar)) {
            return C31063m.f143208a.m150961a(context, aVar).m150957a();
        }
        int m150957a = C31063m.f143208a.m150963c(context, aVar, m150911Q(i11)).m150957a();
        if (!m150935M()) {
            return m150957a;
        }
        C31058h m150907G = m150907G(i11);
        if (m150907G != null && (m150892c = m150907G.m150892c()) != null) {
            if (aVar == C31063m.a.f143210p) {
                return m150892c.getDarkValue();
            }
            return m150892c.getValue();
        }
        return m150957a;
    }
}

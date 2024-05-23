package is;

import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import bo.C3020p0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.AbstractC24344y;
import on0.C24329j;
import qm0.AbstractC25332a0;
import qm0.AbstractC25378x;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: is.y0 */
/* loaded from: classes4.dex */
public final class C20832y0 {

    /* renamed from: a */
    public static final C20832y0 f102396a = new C20832y0();

    /* renamed from: is.y0$b */
    /* loaded from: classes4.dex */
    public static final class b extends Enum {

        /* renamed from: p */
        public static final b f102401p = new b("BY_WORD", 0);

        /* renamed from: q */
        public static final b f102402q = new b("BY_CHARACTER", 1);

        /* renamed from: r */
        private static final /* synthetic */ b[] f102403r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f102404s;

        static {
            b[] m108885b = m108885b();
            f102403r = m108885b;
            f102404s = AbstractC30166b.m148796a(m108885b);
        }

        private b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m108885b() {
            return new b[]{f102401p, f102402q};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f102403r.clone();
        }
    }

    private C20832y0() {
    }

    /* renamed from: a */
    private final String m108873a(String str) {
        String m127213l1;
        String m127204c1;
        m127213l1 = AbstractC24344y.m127213l1(str, 1);
        if (AbstractC19074t.m100204b(m127213l1, "…")) {
            m127204c1 = AbstractC24344y.m127204c1(str, 1);
            return m127204c1;
        }
        return str;
    }

    /* renamed from: b */
    private final String m108874b(String str) {
        if (str.length() > 0) {
            String substring = str.substring(0, str.length() - 1);
            AbstractC19074t.m100207e(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    /* renamed from: c */
    private final String m108875c(String str) {
        List m131187O0;
        String m131214n0;
        if (str.length() != 0) {
            m131187O0 = AbstractC25332a0.m131187O0(new C24329j("\\s+").m127021i(str, 0));
            if (!m131187O0.isEmpty()) {
                AbstractC25378x.m131545G(m131187O0);
                m131214n0 = AbstractC25332a0.m131214n0(m131187O0, " ", null, null, 0, null, null, 62, null);
                return m131214n0;
            }
            return str;
        }
        return str;
    }

    /* renamed from: d */
    private final CharSequence m108876d(CharSequence charSequence, b bVar) {
        CharSequence m127203b1;
        List m131187O0;
        Object m131216p0;
        CharSequence m127203b12;
        if (charSequence.length() == 0) {
            return charSequence;
        }
        if (bVar == b.f102401p) {
            m131187O0 = AbstractC25332a0.m131187O0(new C24329j("\\s+").m127021i(charSequence, 0));
            if (!m131187O0.isEmpty()) {
                m131216p0 = AbstractC25332a0.m131216p0(m131187O0);
                m127203b12 = AbstractC24344y.m127203b1(charSequence, ((String) m131216p0).length() + 1);
                return m127203b12;
            }
            return charSequence;
        }
        m127203b1 = AbstractC24344y.m127203b1(charSequence, 1);
        return m127203b1;
    }

    /* renamed from: e */
    public final String m108877e(a aVar, CharSequence charSequence, int i11, int i12, b bVar) {
        boolean m127128x;
        boolean m127128x2;
        boolean m127149O;
        StaticLayout staticLayout;
        StaticLayout.Builder obtain;
        AbstractC19074t.m100208f(aVar, "wholeTextDisplayConfig");
        AbstractC19074t.m100208f(charSequence, "subText");
        AbstractC19074t.m100208f(bVar, "trimMode");
        String obj = aVar.m108882d().toString();
        m127128x = AbstractC24341v.m127128x(obj);
        if (!m127128x) {
            m127128x2 = AbstractC24341v.m127128x(charSequence);
            if (!m127128x2) {
                m127149O = AbstractC24342w.m127149O(obj, charSequence, false, 2, null);
                if (m127149O) {
                    String obj2 = charSequence.toString();
                    String str = obj2;
                    String str2 = obj;
                    while (obj2.length() > 0 && !AbstractC19074t.m100204b(obj2, "…")) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            obtain = StaticLayout.Builder.obtain(str2, 0, str2.length(), aVar.m108883e(), i11);
                            AbstractC19074t.m100207e(obtain, "obtain(...)");
                            staticLayout = obtain.build();
                        } else {
                            staticLayout = new StaticLayout(str2, aVar.m108883e(), i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                        }
                        AbstractC19074t.m100205c(staticLayout);
                        if (staticLayout.getLineCount() <= i12) {
                            break;
                        }
                        if (bVar == b.f102401p) {
                            obj2 = m108875c(m108873a(str)) + "…";
                        } else {
                            obj2 = m108874b(m108873a(str)) + "…";
                        }
                        if (obj2.length() > 0) {
                            str2 = AbstractC24341v.m127114D(str2, str, obj2, false, 4, null);
                            str = obj2;
                        }
                    }
                    return str2;
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0028 */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence m108878f(C3020p0 c3020p0, a aVar, float f11) {
        boolean m127128x;
        CharSequence m127203b1;
        boolean m127147N;
        CharSequence concat;
        AbstractC19074t.m100208f(c3020p0, "textview");
        AbstractC19074t.m100208f(aVar, "textDisplayConfig");
        CharSequence m14499c = c3020p0.m14499c();
        AbstractC19074t.m100207e(m14499c, "buildSeeMoreTag(...)");
        a m108880c = a.m108880c(aVar, null, 0.0f, null, 7, null);
        while ((!m127128x) && m108880c.m108884f() > f11 && !AbstractC19074t.m100204b(m108880c.m108882d(), m14499c)) {
            m127203b1 = AbstractC24344y.m127203b1(m108880c.m108882d(), m14499c.length());
            m127147N = AbstractC24342w.m127147N(m127203b1, ' ', false, 2, null);
            if (m127147N) {
                concat = TextUtils.concat(m108876d(m127203b1, b.f102401p), m14499c);
                AbstractC19074t.m100205c(concat);
            } else {
                concat = TextUtils.concat(m108876d(m127203b1, b.f102402q), m14499c);
                AbstractC19074t.m100205c(concat);
            }
            m108880c = a.m108880c(m108880c, concat, 0.0f, null, 6, null);
        }
        return m108880c.m108882d();
    }

    /* renamed from: is.y0$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final CharSequence f102397a;

        /* renamed from: b */
        private final float f102398b;

        /* renamed from: c */
        private final Typeface f102399c;

        /* renamed from: d */
        private final TextPaint f102400d;

        public a(CharSequence charSequence, float f11, Typeface typeface) {
            AbstractC19074t.m100208f(charSequence, "textDisplay");
            this.f102397a = charSequence;
            this.f102398b = f11;
            this.f102399c = typeface;
            this.f102400d = new TextPaint(1);
            m108879a();
        }

        /* renamed from: a */
        private final void m108879a() {
            this.f102400d.setTextSize(this.f102398b);
            Typeface typeface = this.f102399c;
            if (typeface != null) {
                this.f102400d.setTypeface(typeface);
            }
        }

        /* renamed from: c */
        public static /* synthetic */ a m108880c(a aVar, CharSequence charSequence, float f11, Typeface typeface, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                charSequence = aVar.f102397a;
            }
            if ((i11 & 2) != 0) {
                f11 = aVar.f102398b;
            }
            if ((i11 & 4) != 0) {
                typeface = aVar.f102399c;
            }
            return aVar.m108881b(charSequence, f11, typeface);
        }

        /* renamed from: b */
        public final a m108881b(CharSequence charSequence, float f11, Typeface typeface) {
            AbstractC19074t.m100208f(charSequence, "textDisplay");
            return new a(charSequence, f11, typeface);
        }

        /* renamed from: d */
        public final CharSequence m108882d() {
            return this.f102397a;
        }

        /* renamed from: e */
        public final TextPaint m108883e() {
            return this.f102400d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f102397a, aVar.f102397a) && Float.compare(this.f102398b, aVar.f102398b) == 0 && AbstractC19074t.m100204b(this.f102399c, aVar.f102399c);
        }

        /* renamed from: f */
        public final float m108884f() {
            return this.f102400d.measureText(this.f102397a.toString());
        }

        public int hashCode() {
            int hashCode = ((this.f102397a.hashCode() * 31) + Float.floatToIntBits(this.f102398b)) * 31;
            Typeface typeface = this.f102399c;
            return hashCode + (typeface == null ? 0 : typeface.hashCode());
        }

        public String toString() {
            CharSequence charSequence = this.f102397a;
            return "TextMeasureConfig(textDisplay=" + ((Object) charSequence) + ", textSize=" + this.f102398b + ", typeface=" + this.f102399c + ")";
        }

        public /* synthetic */ a(CharSequence charSequence, float f11, Typeface typeface, int i11, AbstractC19060k abstractC19060k) {
            this(charSequence, f11, (i11 & 4) != 0 ? null : typeface);
        }
    }
}

package p716zh;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import bo.C3013n3;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC7307b0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p077ui.widget.C13778s1;
import is.AbstractC20826v0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23265y;
import me0.C23212s8;
import org.json.JSONArray;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p262jb.AbstractC21196a;
import tg.C26657h;

/* renamed from: zh.dc */
/* loaded from: classes3.dex */
public class C31890dc {

    /* renamed from: F */
    public static int f146486F;

    /* renamed from: G */
    public static int f146487G;

    /* renamed from: A */
    private int f146491A;

    /* renamed from: B */
    public List f146492B;

    /* renamed from: C */
    private boolean f146493C;

    /* renamed from: D */
    private boolean f146494D;

    /* renamed from: a */
    public int f146495a;

    /* renamed from: b */
    public String f146496b;

    /* renamed from: c */
    public int f146497c;

    /* renamed from: d */
    private int f146498d;

    /* renamed from: e */
    private int f146499e;

    /* renamed from: f */
    private int f146500f;

    /* renamed from: g */
    private int f146501g;

    /* renamed from: h */
    public float f146502h;

    /* renamed from: i */
    public int f146503i;

    /* renamed from: j */
    public String f146504j;

    /* renamed from: k */
    public String f146505k;

    /* renamed from: l */
    boolean f146506l;

    /* renamed from: m */
    public C26657h f146507m;

    /* renamed from: n */
    public String f146508n;

    /* renamed from: o */
    public int f146509o;

    /* renamed from: p */
    public String f146510p;

    /* renamed from: q */
    public int f146511q;

    /* renamed from: r */
    public String f146512r;

    /* renamed from: s */
    public String f146513s;

    /* renamed from: t */
    public float f146514t;

    /* renamed from: u */
    public int f146515u;

    /* renamed from: v */
    public int f146516v;

    /* renamed from: w */
    public int f146517w;

    /* renamed from: x */
    public float f146518x;

    /* renamed from: y */
    public int f146519y;

    /* renamed from: z */
    public int f146520z;

    /* renamed from: E */
    public static final int f146485E = AbstractC23136l9.m118671Q(AbstractC7307b0.status_text_size_default);

    /* renamed from: H */
    public static final int f146488H = AbstractC23136l9.m118641B(MainApplication.getAppContext(), AbstractC16801x.white);

    /* renamed from: I */
    public static final int f146489I = AbstractC23136l9.m118641B(MainApplication.getAppContext(), AbstractC16801x.bg_color_hint);

    /* renamed from: J */
    public static final int f146490J = AbstractC23136l9.m118641B(MainApplication.getAppContext(), AbstractC16801x.bg_grey_holder);

    static {
        m153232q();
    }

    public C31890dc(int i11, JSONObject jSONObject) {
        this(jSONObject);
        this.f146495a = i11;
        m153235A(jSONObject);
    }

    /* renamed from: f */
    private float m153227f(CharSequence charSequence, float f11, int i11) {
        int i12 = (int) (this.f146518x * f11);
        int i13 = (int) (this.f146502h * f11);
        if (!TextUtils.isEmpty(charSequence) && charSequence.length() > i11) {
            return m153231n(i13);
        }
        return m153231n(i12);
    }

    /* renamed from: h */
    private float m153228h(float f11) {
        return m153231n(this.f146502h * f11);
    }

    /* renamed from: j */
    private ArrayList m153229j(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            try {
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    arrayList.add(new C31942h4(jSONArray.optJSONObject(i11)));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    private float m153230l(int i11) {
        return i11 == 8 ? 1.0f : 0.8f;
    }

    /* renamed from: n */
    private float m153231n(float f11) {
        return f11;
    }

    /* renamed from: q */
    public static void m153232q() {
        f146486F = C23212s8.m119606n(AbstractC21196a.TextColor1);
        f146487G = C23212s8.m119606n(AbstractC21196a.TextColor2);
    }

    /* renamed from: v */
    public static boolean m153233v(int i11) {
        return i11 > 0;
    }

    /* renamed from: z */
    private JSONArray m153234z() {
        JSONArray jSONArray = new JSONArray();
        List list = this.f146492B;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((C31942h4) it.next()).m153496a());
            }
        }
        return jSONArray;
    }

    /* renamed from: A */
    public void m153235A(JSONObject jSONObject) {
        ArrayList arrayList;
        if (jSONObject != null) {
            try {
                this.f146497c = jSONObject.optInt("size", 16);
                this.f146498d = jSONObject.optInt("color", f146486F);
                this.f146500f = jSONObject.optInt("color_hint", f146487G);
                this.f146504j = jSONObject.optString("name_font");
                this.f146502h = (float) jSONObject.optDouble("line_height", 18.0d);
                this.f146505k = jSONObject.optString("background");
                this.f146512r = jSONObject.optString("url_bg");
                this.f146513s = jSONObject.optString("url_bg_story");
                this.f146515u = jSONObject.optInt("align", 0);
                this.f146514t = (float) jSONObject.optDouble("ratio_bg", 1.0d);
                this.f146516v = jSONObject.optInt("bg_holder_color", f146490J);
                this.f146517w = jSONObject.optInt("max_size", this.f146497c + 6);
                this.f146518x = (float) jSONObject.optDouble("max_line_height", this.f146502h + 6.0f);
                this.f146519y = jSONObject.optInt("type_bg_render", 0);
                this.f146520z = jSONObject.optInt("gradient_start", this.f146516v);
                this.f146491A = jSONObject.optInt("gradient_end", this.f146516v);
                if (!jSONObject.isNull("elements")) {
                    arrayList = m153229j(jSONObject.optJSONArray("elements"));
                } else {
                    arrayList = null;
                }
                this.f146492B = arrayList;
                this.f146493C = true;
                this.f146494D = true;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public int m153236a(int i11) {
        if (i11 == 8) {
            return C31845ac.f146168A;
        }
        return C31845ac.f146174y;
    }

    /* renamed from: b */
    public int m153237b() {
        if (m153249t()) {
            return this.f146498d;
        }
        if (C23212s8.m119603k()) {
            return this.f146498d;
        }
        if (C23212s8.m119602i()) {
            if (this.f146493C) {
                this.f146499e = AbstractC23265y.m120015b(this.f146498d, 1.2f);
                this.f146493C = false;
            }
            return this.f146499e;
        }
        return this.f146498d;
    }

    /* renamed from: c */
    public int m153238c() {
        if (m153249t()) {
            return this.f146500f;
        }
        if (C23212s8.m119603k()) {
            return this.f146500f;
        }
        if (C23212s8.m119602i()) {
            if (this.f146494D) {
                this.f146501g = AbstractC23265y.m120015b(this.f146500f, 0.8f);
                this.f146494D = false;
            }
            return this.f146501g;
        }
        return this.f146500f;
    }

    /* renamed from: d */
    public float m153239d() {
        return C13778s1.m76962c() * 0.8f;
    }

    /* renamed from: e */
    public GradientDrawable m153240e() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AbstractC23265y.m120022i(this.f146520z, 255), AbstractC23265y.m120022i(this.f146491A, 255)});
        gradientDrawable.setCornerRadius(0.0f);
        return gradientDrawable;
    }

    public boolean equals(Object obj) {
        if (this != obj && (!(obj instanceof C31890dc) || ((C31890dc) obj).f146495a != this.f146495a)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public float m153241g(CharSequence charSequence, int i11) {
        int i12;
        float m153230l = m153230l(i11);
        if (i11 == 8) {
            i12 = C31845ac.f146168A;
        } else {
            i12 = C31845ac.f146174y;
        }
        return m153227f(charSequence, m153230l, i12);
    }

    public int hashCode() {
        return this.f146495a;
    }

    /* renamed from: i */
    public float m153242i(int i11) {
        return m153228h(m153230l(i11));
    }

    /* renamed from: k */
    public String m153243k() {
        return this.f146508n + "/" + this.f146504j;
    }

    /* renamed from: m */
    public int m153244m(CharSequence charSequence, int i11) {
        int i12;
        int i13 = 6;
        if (i11 != 6 || !AbstractC20826v0.m108810g0()) {
            i13 = 0;
        }
        float m153230l = m153230l(i11);
        int i14 = (int) (this.f146517w * m153230l);
        int i15 = this.f146497c;
        int i16 = (int) (i15 * m153230l);
        int i17 = (int) (i15 * m153230l);
        if (i11 == 8) {
            i12 = C31845ac.f146168A;
        } else {
            i12 = C31845ac.f146174y;
        }
        if (m153248s()) {
            return i17;
        }
        if (i11 != 2 && i11 != 3) {
            if (!TextUtils.isEmpty(charSequence) && charSequence.length() > i12) {
                return i16 - i13;
            }
            return i14 - i13;
        }
        return i17;
    }

    /* renamed from: o */
    public int m153245o() {
        C26657h c26657h = this.f146507m;
        if (c26657h != null) {
            return c26657h.f126157b;
        }
        return 10;
    }

    /* renamed from: p */
    public C3013n3 m153246p() {
        return new C3013n3(this.f146514t, this.f146498d, this.f146516v, this.f146515u, this.f146519y);
    }

    /* renamed from: r */
    public boolean m153247r() {
        return this.f146495a == -1;
    }

    /* renamed from: s */
    public boolean m153248s() {
        if (!m153247r() && (m153249t() || m153245o() == 10)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m153249t() {
        return this.f146495a == 0;
    }

    /* renamed from: u */
    public boolean m153250u() {
        if (m153249t() || m153247r()) {
            return true;
        }
        if (C31845ac.f146171v.get(Integer.valueOf(this.f146495a)) != null && !TextUtils.isEmpty(this.f146508n)) {
            return true;
        }
        if (this.f146497c > 0 && !TextUtils.isEmpty(this.f146508n)) {
            return new File(m153243k()).exists();
        }
        return false;
    }

    /* renamed from: w */
    public boolean m153251w() {
        if (this.f146509o >= 0 && !TextUtils.isEmpty(this.f146510p)) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    public void m153252x(String str) {
        this.f146508n = str;
    }

    /* renamed from: y */
    public String m153253y() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f146495a);
            String str = this.f146496b;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            jSONObject.put("preview", str);
            jSONObject.put("version", this.f146503i);
            jSONObject.put("preCache", this.f146506l ? 1 : 0);
            jSONObject.put("cateID", this.f146509o);
            String str3 = this.f146510p;
            if (str3 == null) {
                str3 = "";
            }
            jSONObject.put("cate_title", str3);
            jSONObject.put("cate_order", this.f146511q);
            C26657h c26657h = this.f146507m;
            if (c26657h != null) {
                jSONObject.put("attachment", c26657h.f126156a);
                jSONObject.put("effectType", this.f146507m.f126157b);
                jSONObject.put("checksumZip", this.f146507m.f126158c);
                jSONObject.put("checksumFolder", this.f146507m.f126159d);
            }
            jSONObject.put("size", this.f146497c);
            jSONObject.put("color", this.f146498d);
            jSONObject.put("color_hint", this.f146500f);
            String str4 = this.f146504j;
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("name_font", str4);
            jSONObject.put("line_height", this.f146502h);
            String str5 = this.f146505k;
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("background", str5);
            String str6 = this.f146508n;
            if (str6 == null) {
                str6 = "";
            }
            jSONObject.put("localPath", str6);
            String str7 = this.f146512r;
            if (str7 == null) {
                str7 = "";
            }
            jSONObject.put("url_bg", str7);
            String str8 = this.f146513s;
            if (str8 != null) {
                str2 = str8;
            }
            jSONObject.put("url_bg_story", str2);
            jSONObject.put("ratio_bg", this.f146514t);
            jSONObject.put("align", this.f146515u);
            jSONObject.put("bg_holder_color", this.f146516v);
            jSONObject.put("max_size", this.f146517w);
            jSONObject.put("max_line_height", this.f146518x);
            jSONObject.put("type_bg_render", this.f146519y);
            jSONObject.put("gradient_start", this.f146520z);
            jSONObject.put("gradient_end", this.f146491A);
            jSONObject.put("elements", m153234z());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject.toString();
    }

    public C31890dc(JSONObject jSONObject) {
        this.f146497c = 16;
        int i11 = f146486F;
        this.f146498d = i11;
        this.f146499e = i11;
        int i12 = f146487G;
        this.f146500f = i12;
        this.f146501g = i12;
        boolean z11 = false;
        this.f146506l = false;
        this.f146508n = "";
        this.f146514t = 1.0f;
        this.f146515u = 0;
        this.f146516v = f146490J;
        this.f146517w = 20;
        this.f146518x = 24.0f;
        this.f146519y = 0;
        if (jSONObject != null) {
            try {
                this.f146495a = !jSONObject.isNull("id") ? jSONObject.getInt("id") : 0;
                this.f146496b = AbstractC18069a.m96089h(jSONObject, "preview");
                this.f146503i = AbstractC18069a.m96085d(jSONObject, "version");
                if (!jSONObject.isNull("preCache") && jSONObject.getInt("preCache") == 1) {
                    z11 = true;
                }
                this.f146506l = z11;
                this.f146507m = new C26657h(jSONObject);
                this.f146508n = AbstractC18069a.m96089h(jSONObject, "localPath");
                this.f146509o = jSONObject.optInt("cateID");
                this.f146510p = jSONObject.optString("cate_title");
                this.f146511q = jSONObject.optInt("cate_order");
                m153235A(jSONObject);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C31890dc(int i11, int i12, int i13, int i14, float f11, int i15) {
        this.f146499e = f146486F;
        this.f146501g = f146487G;
        this.f146506l = false;
        this.f146508n = "";
        this.f146514t = 1.0f;
        this.f146516v = f146490J;
        this.f146517w = 20;
        this.f146518x = 24.0f;
        this.f146497c = i12;
        this.f146498d = i13;
        this.f146495a = i11;
        this.f146500f = i14;
        this.f146502h = f11;
        this.f146515u = i15;
        this.f146519y = 0;
        this.f146493C = true;
        this.f146494D = true;
    }

    public C31890dc(int i11, int i12, int i13, int i14, float f11, int i15, int i16, float f12) {
        this.f146499e = f146486F;
        this.f146501g = f146487G;
        this.f146506l = false;
        this.f146508n = "";
        this.f146514t = 1.0f;
        this.f146516v = f146490J;
        this.f146497c = i12;
        this.f146498d = i13;
        this.f146495a = i11;
        this.f146500f = i14;
        this.f146502h = f11;
        this.f146515u = i15;
        this.f146517w = i16;
        this.f146518x = f12;
        this.f146519y = 0;
        this.f146493C = true;
        this.f146494D = true;
    }

    public C31890dc(int i11) {
        this.f146497c = 16;
        int i12 = f146486F;
        this.f146498d = i12;
        this.f146499e = i12;
        int i13 = f146487G;
        this.f146500f = i13;
        this.f146501g = i13;
        this.f146506l = false;
        this.f146508n = "";
        this.f146514t = 1.0f;
        this.f146515u = 0;
        this.f146516v = f146490J;
        this.f146517w = 20;
        this.f146518x = 24.0f;
        this.f146519y = 0;
        this.f146495a = i11;
        this.f146493C = true;
        this.f146494D = true;
    }
}

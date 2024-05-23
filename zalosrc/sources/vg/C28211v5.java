package vg;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p133ek.AbstractC18458a;

/* renamed from: vg.v5 */
/* loaded from: classes.dex */
public final class C28211v5 implements CharSequence {
    public static final a Companion = new a(null);

    /* renamed from: p */
    private final JSONObject f131572p;

    /* renamed from: q */
    private String f131573q;

    /* renamed from: r */
    private String f131574r = "";

    /* renamed from: vg.v5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C28211v5 m142159a(String str) {
            boolean m127137G0;
            if (str != null) {
                m127137G0 = AbstractC24342w.m127137G0(str, '{', false, 2, null);
                if (m127137G0) {
                    try {
                        return new C28211v5(new JSONObject(str));
                    } catch (Exception e11) {
                        AbstractC20110a.f98889a.mo104552e(e11);
                    }
                }
            }
            C28211v5 c28211v5 = new C28211v5(null);
            if (str == null) {
                str = "";
            }
            c28211v5.f131574r = str;
            return c28211v5;
        }

        /* renamed from: b */
        public final C28211v5 m142160b(String str, String str2) {
            AbstractC19074t.m100208f(str, "vi");
            AbstractC19074t.m100208f(str2, "en");
            return new C28211v5(new JSONObject("{\"vi\":\"" + str + "\",\"en\":\"" + str2 + "\"}"));
        }
    }

    public C28211v5(JSONObject jSONObject) {
        this.f131572p = jSONObject;
    }

    /* renamed from: e */
    private final String m142155e() {
        String optString;
        String str = this.f131573q;
        String str2 = AbstractC18458a.f93019a;
        if (str != str2 && this.f131572p != null) {
            this.f131573q = str2;
            if (AbstractC19074t.m100204b(str2, "vi")) {
                optString = this.f131572p.optString("vi", "");
                AbstractC19074t.m100207e(optString, "optString(...)");
            } else if (AbstractC19074t.m100204b(str2, "my")) {
                optString = this.f131572p.optString("my", "");
                AbstractC19074t.m100207e(optString, "optString(...)");
            } else {
                optString = this.f131572p.optString("en", "");
                AbstractC19074t.m100207e(optString, "optString(...)");
            }
            this.f131574r = optString;
        }
        return this.f131574r;
    }

    /* renamed from: b */
    public char m142156b(int i11) {
        return m142155e().charAt(i11);
    }

    /* renamed from: c */
    public int m142157c() {
        return m142155e().length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i11) {
        return m142156b(i11);
    }

    /* renamed from: d */
    public final String m142158d(String str) {
        String str2;
        AbstractC19074t.m100208f(str, "languageCode");
        JSONObject jSONObject = this.f131572p;
        if (jSONObject != null) {
            str2 = jSONObject.optString(str, "");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            return this.f131574r;
        }
        return str2;
    }

    public boolean equals(Object obj) {
        String str;
        C28211v5 c28211v5;
        boolean m100204b;
        if (obj != this) {
            String str2 = null;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (str != null) {
                m100204b = str.equals(m142155e());
            } else {
                String m142155e = m142155e();
                if (obj instanceof C28211v5) {
                    c28211v5 = (C28211v5) obj;
                } else {
                    c28211v5 = null;
                }
                if (c28211v5 != null) {
                    str2 = c28211v5.m142155e();
                }
                m100204b = AbstractC19074t.m100204b(m142155e, str2);
            }
            if (!m100204b) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return m142155e().hashCode();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return m142157c();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i11, int i12) {
        return m142155e().subSequence(i11, i12);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return m142155e();
    }
}

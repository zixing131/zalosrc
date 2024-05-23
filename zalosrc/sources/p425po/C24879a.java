package p425po;

import android.text.SpannableString;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.data.StringTheme;
import com.zing.zalo.feed.data.TextLocalization;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Locale;
import me0.AbstractC23047d8;
import me0.AbstractC23136l9;
import org.json.JSONException;
import org.json.JSONObject;
import p615wn.C29110f;

/* renamed from: po.a */
/* loaded from: classes4.dex */
public final class C24879a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C29110f f119374a;

    /* renamed from: b */
    private final C29110f f119375b;

    /* renamed from: c */
    private final StringTheme f119376c;

    /* renamed from: d */
    private final String f119377d;

    /* renamed from: e */
    private final String f119378e;

    /* renamed from: f */
    private final TextLocalization f119379f;

    /* renamed from: po.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24879a m129377a(JSONObject jSONObject) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10 = "";
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            try {
                SpannableString spannableString = new SpannableString("");
                SpannableString spannableString2 = new SpannableString("");
                SpannableString spannableString3 = new SpannableString("");
                SpannableString spannableString4 = new SpannableString("");
                String str11 = null;
                if (jSONObject.has("title")) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("title");
                    if (optJSONObject != null) {
                        str8 = optJSONObject.optString("en");
                    } else {
                        str8 = null;
                    }
                    if (str8 == null) {
                        str8 = "";
                    }
                    spannableString = AbstractC23047d8.m118261m(str8);
                    AbstractC19074t.m100207e(spannableString, "parseMessage(...)");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("title");
                    if (optJSONObject2 != null) {
                        str9 = optJSONObject2.optString("vi");
                    } else {
                        str9 = null;
                    }
                    if (str9 == null) {
                        str9 = "";
                    }
                    spannableString2 = AbstractC23047d8.m118261m(str9);
                    AbstractC19074t.m100207e(spannableString2, "parseMessage(...)");
                }
                if (jSONObject.has("desc")) {
                    JSONObject optJSONObject3 = jSONObject.optJSONObject("desc");
                    if (optJSONObject3 != null) {
                        str6 = optJSONObject3.optString("en");
                    } else {
                        str6 = null;
                    }
                    if (str6 == null) {
                        str6 = "";
                    }
                    spannableString3 = AbstractC23047d8.m118261m(str6);
                    AbstractC19074t.m100207e(spannableString3, "parseMessage(...)");
                    JSONObject optJSONObject4 = jSONObject.optJSONObject("desc");
                    if (optJSONObject4 != null) {
                        str7 = optJSONObject4.optString("vi");
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str7 = "";
                    }
                    spannableString4 = AbstractC23047d8.m118261m(str7);
                    AbstractC19074t.m100207e(spannableString4, "parseMessage(...)");
                }
                if (spannableString.length() == 0 && spannableString2.length() == 0 && spannableString3.length() == 0 && spannableString4.length() == 0) {
                    spannableString3 = new SpannableString(AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.error_general));
                    spannableString4 = new SpannableString(AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.error_general));
                }
                if (!jSONObject.has("action_type")) {
                    str = "";
                } else {
                    String optString = jSONObject.optString("action_type");
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    str = optString;
                }
                if (!jSONObject.has("action_data")) {
                    str2 = "";
                } else {
                    String optString2 = jSONObject.optString("action_data");
                    AbstractC19074t.m100207e(optString2, "optString(...)");
                    str2 = optString2;
                }
                if (!jSONObject.has("entry_icon")) {
                    str3 = "";
                    str4 = str3;
                } else {
                    JSONObject optJSONObject5 = jSONObject.optJSONObject("entry_icon");
                    if (optJSONObject5 != null) {
                        str3 = optJSONObject5.optString("l");
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = "";
                    }
                    JSONObject optJSONObject6 = jSONObject.optJSONObject("entry_icon");
                    if (optJSONObject6 != null) {
                        str4 = optJSONObject6.optString("d");
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                }
                if (!jSONObject.has("entry_desc")) {
                    str5 = "";
                } else {
                    JSONObject optJSONObject7 = jSONObject.optJSONObject("entry_desc");
                    if (optJSONObject7 != null) {
                        str5 = optJSONObject7.optString("en");
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        str5 = "";
                    }
                    JSONObject optJSONObject8 = jSONObject.optJSONObject("entry_desc");
                    if (optJSONObject8 != null) {
                        str11 = optJSONObject8.optString("vi");
                    }
                    if (str11 != null) {
                        str10 = str11;
                    }
                }
                return new C24879a(new C29110f(spannableString2, spannableString), new C29110f(spannableString4, spannableString3), new StringTheme(str3, str4), str, str2, new TextLocalization(str10, str5));
            } catch (JSONException unused) {
                return new C24879a(null, new C29110f(new SpannableString(AbstractC23136l9.m118675S(new Locale("vi"), AbstractC8020f0.error_general)), new SpannableString(AbstractC23136l9.m118675S(new Locale("en"), AbstractC8020f0.error_general))), null, null, null, null, 61, null);
            }
        }
    }

    public C24879a(C29110f c29110f, C29110f c29110f2, StringTheme stringTheme, String str, String str2, TextLocalization textLocalization) {
        AbstractC19074t.m100208f(c29110f, "title");
        AbstractC19074t.m100208f(c29110f2, "desc");
        AbstractC19074t.m100208f(stringTheme, "illustrationUrl");
        AbstractC19074t.m100208f(str, "actionType");
        AbstractC19074t.m100208f(str2, "actionData");
        AbstractC19074t.m100208f(textLocalization, "actionText");
        this.f119374a = c29110f;
        this.f119375b = c29110f2;
        this.f119376c = stringTheme;
        this.f119377d = str;
        this.f119378e = str2;
        this.f119379f = textLocalization;
    }

    /* renamed from: a */
    public final TextLocalization m129372a() {
        return this.f119379f;
    }

    /* renamed from: b */
    public final String m129373b() {
        return this.f119377d;
    }

    /* renamed from: c */
    public final C29110f m129374c() {
        return this.f119375b;
    }

    /* renamed from: d */
    public final StringTheme m129375d() {
        return this.f119376c;
    }

    /* renamed from: e */
    public final C29110f m129376e() {
        return this.f119374a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24879a)) {
            return false;
        }
        C24879a c24879a = (C24879a) obj;
        return AbstractC19074t.m100204b(this.f119374a, c24879a.f119374a) && AbstractC19074t.m100204b(this.f119375b, c24879a.f119375b) && AbstractC19074t.m100204b(this.f119376c, c24879a.f119376c) && AbstractC19074t.m100204b(this.f119377d, c24879a.f119377d) && AbstractC19074t.m100204b(this.f119378e, c24879a.f119378e) && AbstractC19074t.m100204b(this.f119379f, c24879a.f119379f);
    }

    public int hashCode() {
        return (((((((((this.f119374a.hashCode() * 31) + this.f119375b.hashCode()) * 31) + this.f119376c.hashCode()) * 31) + this.f119377d.hashCode()) * 31) + this.f119378e.hashCode()) * 31) + this.f119379f.hashCode();
    }

    public String toString() {
        return "ApiErrorExtras(title=" + this.f119374a + ", desc=" + this.f119375b + ", illustrationUrl=" + this.f119376c + ", actionType=" + this.f119377d + ", actionData=" + this.f119378e + ", actionText=" + this.f119379f + ")";
    }

    public /* synthetic */ C24879a(C29110f c29110f, C29110f c29110f2, StringTheme stringTheme, String str, String str2, TextLocalization textLocalization, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C29110f(null, null, 3, null) : c29110f, (i11 & 2) != 0 ? new C29110f(null, null, 3, null) : c29110f2, (i11 & 4) != 0 ? new StringTheme((String) null, (String) null, 3, (AbstractC19060k) null) : stringTheme, (i11 & 8) != 0 ? "" : str, (i11 & 16) != 0 ? "" : str2, (i11 & 32) != 0 ? new TextLocalization((String) null, (String) null, 3, (AbstractC19060k) null) : textLocalization);
    }
}

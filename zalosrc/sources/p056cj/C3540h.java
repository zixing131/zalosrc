package p056cj;

import android.text.TextUtils;
import com.zing.zalo.control.C7907e;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import dj.C17997r1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qm0.AbstractC25363p0;

/* renamed from: cj.h */
/* loaded from: classes3.dex */
public final class C3540h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f14939a;

    /* renamed from: b */
    private String f14940b;

    /* renamed from: c */
    private final C7907e f14941c;

    /* renamed from: d */
    private final C17997r1 f14942d;

    /* renamed from: e */
    private final boolean f14943e;

    /* renamed from: f */
    private final C3542j f14944f;

    /* renamed from: g */
    private final Map f14945g;

    /* renamed from: cj.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C3540h m17999a(String str, String str2, String str3) {
            C7907e c7907e;
            C17997r1 c17997r1;
            C3542j c3542j;
            boolean z11;
            Iterator<String> keys;
            AbstractC19074t.m100208f(str, "uid");
            AbstractC19074t.m100208f(str2, "msg");
            AbstractC19074t.m100208f(str3, "draftInfo");
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (str3.length() > 0) {
                    JSONArray jSONArray = new JSONArray(str3);
                    int length = jSONArray.length();
                    C7907e c7907e2 = null;
                    C17997r1 c17997r12 = null;
                    C3542j c3542j2 = null;
                    boolean z12 = false;
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i11);
                        int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                        if (optInt != 1) {
                            if (optInt != 2) {
                                if (optInt != 3) {
                                    if (optInt == 4) {
                                        c3542j2 = C3542j.Companion.m18007a(jSONObject.optString("data", ""));
                                    }
                                } else {
                                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                                    if (optJSONObject != null && (keys = optJSONObject.keys()) != null) {
                                        while (keys.hasNext()) {
                                            String next = keys.next();
                                            AbstractC19074t.m100205c(next);
                                            String optString = optJSONObject.optString(next);
                                            if (optString == null) {
                                                optString = "";
                                            } else {
                                                AbstractC19074t.m100205c(optString);
                                            }
                                            linkedHashMap.put(next, optString);
                                        }
                                    }
                                }
                            } else {
                                JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
                                C17997r1 m95685b = C17997r1.m95685b(optJSONObject2, str);
                                if (optJSONObject2 != null) {
                                    z12 = jSONObject.optBoolean("certifiedSender");
                                }
                                c17997r12 = m95685b;
                            }
                        } else {
                            c7907e2 = new C7907e(jSONObject.optJSONArray("data"));
                        }
                    }
                    c7907e = c7907e2;
                    z11 = z12;
                    c17997r1 = c17997r12;
                    c3542j = c3542j2;
                } else {
                    c7907e = null;
                    c17997r1 = null;
                    c3542j = null;
                    z11 = false;
                }
                return new C3540h(str, str2, c7907e, c17997r1, z11, c3542j, linkedHashMap);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                return null;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3540h(String str, String str2, C7907e c7907e) {
        this(str, str2, c7907e, null, false, null, null, 120, null);
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "msg");
    }

    /* renamed from: a */
    public static final C3540h m17990a(String str, String str2, String str3) {
        return Companion.m17999a(str, str2, str3);
    }

    /* renamed from: b */
    public final String m17991b() {
        JSONArray jSONArray = new JSONArray();
        try {
            C7907e c7907e = this.f14941c;
            if (c7907e != null && c7907e.m40861l() > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1);
                jSONObject.put("data", this.f14941c.m40862m());
                jSONArray.put(jSONObject);
            }
            if (this.f14942d != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 2);
                jSONObject2.put("data", this.f14942d.m95709z());
                jSONObject2.put("certifiedSender", this.f14943e);
                jSONArray.put(jSONObject2);
            }
            if (this.f14944f != null) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 4);
                jSONObject3.put("data", this.f14944f.toString());
                jSONArray.put(jSONObject3);
            }
            if (!this.f14945g.isEmpty()) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 3);
                jSONObject4.put("data", new JSONObject(this.f14945g));
                jSONArray.put(jSONObject4);
            }
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        String jSONArray2 = jSONArray.toString();
        AbstractC19074t.m100207e(jSONArray2, "toString(...)");
        return jSONArray2;
    }

    /* renamed from: c */
    public final C3542j m17992c() {
        return this.f14944f;
    }

    /* renamed from: d */
    public final C7907e m17993d() {
        return this.f14941c;
    }

    /* renamed from: e */
    public final String m17994e() {
        return this.f14940b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3540h)) {
            return false;
        }
        C3540h c3540h = (C3540h) obj;
        if (TextUtils.equals(this.f14939a, c3540h.f14939a) && TextUtils.equals(this.f14940b, c3540h.f14940b) && AbstractC19074t.m100204b(this.f14941c, c3540h.f14941c) && AbstractC19074t.m100204b(this.f14942d, c3540h.f14942d) && AbstractC19074t.m100204b(this.f14944f, c3540h.f14944f) && AbstractC19074t.m100204b(this.f14945g, c3540h.f14945g)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final Map m17995f() {
        return this.f14945g;
    }

    /* renamed from: g */
    public final boolean m17996g() {
        return this.f14943e;
    }

    /* renamed from: h */
    public final C17997r1 m17997h() {
        return this.f14942d;
    }

    public int hashCode() {
        return Objects.hash(this.f14939a, this.f14940b, this.f14941c, this.f14942d, this.f14944f, this.f14945g);
    }

    /* renamed from: i */
    public final void m17998i(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f14940b = str;
    }

    public String toString() {
        return "DraftMsg(uid=" + this.f14939a + ", msg=" + this.f14940b + ", mentions=" + this.f14941c + ", replyChatContent=" + this.f14942d + ", replyCertifiedSender=" + this.f14943e + ", mediaContent=" + this.f14944f + ", params=" + this.f14945g + ")";
    }

    public C3540h(String str, String str2, C7907e c7907e, C17997r1 c17997r1, boolean z11, C3542j c3542j, Map map) {
        AbstractC19074t.m100208f(str, "uid");
        AbstractC19074t.m100208f(str2, "msg");
        AbstractC19074t.m100208f(map, "params");
        this.f14939a = str;
        this.f14940b = str2;
        this.f14941c = c7907e;
        this.f14942d = c17997r1;
        this.f14943e = z11;
        this.f14944f = c3542j;
        this.f14945g = map;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ C3540h(String str, String str2, C7907e c7907e, C17997r1 c17997r1, boolean z11, C3542j c3542j, Map map, int i11, AbstractC19060k abstractC19060k) {
        this(str, str2, r5, r6, r7, r8, r9);
        Map map2;
        Map m131404i;
        C7907e c7907e2 = (i11 & 4) != 0 ? null : c7907e;
        C17997r1 c17997r12 = (i11 & 8) != 0 ? null : c17997r1;
        boolean z12 = (i11 & 16) != 0 ? false : z11;
        C3542j c3542j2 = (i11 & 32) != 0 ? null : c3542j;
        if ((i11 & 64) != 0) {
            m131404i = AbstractC25363p0.m131404i();
            map2 = m131404i;
        } else {
            map2 = map;
        }
    }
}

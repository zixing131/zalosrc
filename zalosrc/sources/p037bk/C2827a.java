package p037bk;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bk.a */
/* loaded from: classes3.dex */
public final class C2827a {
    public static final a Companion = new a(null);

    /* renamed from: g */
    private static final C2827a f11316g = new C2827a(null, 0, 0, false, null, null, 63, null);

    /* renamed from: a */
    private final String f11317a;

    /* renamed from: b */
    private final long f11318b;

    /* renamed from: c */
    private final long f11319c;

    /* renamed from: d */
    private boolean f11320d;

    /* renamed from: e */
    private final Map f11321e;

    /* renamed from: f */
    private final String f11322f;

    /* renamed from: bk.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C2827a m13672a(String str, boolean z11) {
            boolean optBoolean;
            AbstractC19074t.m100208f(str, "jsContent");
            if (str.length() == 0) {
                return C2827a.f11316g;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                long optLong = jSONObject.optLong("startedTime");
                long optLong2 = jSONObject.optLong("endTime");
                String optString = jSONObject.optString("thumb");
                HashMap hashMap = new HashMap();
                if (jSONObject.has("title")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("title");
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        AbstractC19074t.m100205c(next);
                        String string = jSONObject2.getString(next);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        hashMap.put(next, string);
                    }
                }
                if (z11) {
                    optBoolean = true;
                } else {
                    optBoolean = jSONObject.optBoolean("show_reddot");
                }
                AbstractC19074t.m100205c(optString);
                return new C2827a(str, optLong, optLong2, optBoolean, hashMap, optString);
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
                return C2827a.f11316g;
            }
        }
    }

    public C2827a(String str, long j11, long j12, boolean z11, Map map, String str2) {
        AbstractC19074t.m100208f(str, "jsContent");
        AbstractC19074t.m100208f(map, "titleMap");
        AbstractC19074t.m100208f(str2, "thumb");
        this.f11317a = str;
        this.f11318b = j11;
        this.f11319c = j12;
        this.f11320d = z11;
        this.f11321e = map;
        this.f11322f = str2;
    }

    /* renamed from: b */
    public static final C2827a m13665b(String str, boolean z11) {
        return Companion.m13672a(str, z11);
    }

    /* renamed from: c */
    public final String m13666c() {
        return this.f11322f;
    }

    /* renamed from: d */
    public final Map m13667d() {
        return this.f11321e;
    }

    /* renamed from: e */
    public final boolean m13668e() {
        long j11 = this.f11318b;
        if (j11 <= 0) {
            return false;
        }
        long j12 = this.f11319c;
        if (j12 <= 0 || j11 > j12) {
            return false;
        }
        long mo124314i = C23793c.Companion.m124321a().mo124314i();
        long j13 = this.f11318b;
        if (mo124314i > this.f11319c || j13 > mo124314i) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2827a)) {
            return false;
        }
        C2827a c2827a = (C2827a) obj;
        return AbstractC19074t.m100204b(this.f11317a, c2827a.f11317a) && this.f11318b == c2827a.f11318b && this.f11319c == c2827a.f11319c && this.f11320d == c2827a.f11320d && AbstractC19074t.m100204b(this.f11321e, c2827a.f11321e) && AbstractC19074t.m100204b(this.f11322f, c2827a.f11322f);
    }

    /* renamed from: f */
    public final boolean m13669f() {
        if (this.f11317a.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void m13670g(boolean z11) {
        this.f11320d = z11;
    }

    /* renamed from: h */
    public final boolean m13671h() {
        return this.f11320d;
    }

    public int hashCode() {
        return (((((((((this.f11317a.hashCode() * 31) + AbstractC2147g0.m11521a(this.f11318b)) * 31) + AbstractC2147g0.m11521a(this.f11319c)) * 31) + AbstractC2144f.m11520a(this.f11320d)) * 31) + this.f11321e.hashCode()) * 31) + this.f11322f.hashCode();
    }

    public String toString() {
        if (!m13669f()) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject(this.f11317a);
            jSONObject.put("show_reddot", this.f11320d);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return "";
        }
    }

    public /* synthetic */ C2827a(String str, long j11, long j12, boolean z11, Map map, String str2, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0L : j11, (i11 & 4) == 0 ? j12 : 0L, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? new HashMap() : map, (i11 & 32) == 0 ? str2 : "");
    }
}

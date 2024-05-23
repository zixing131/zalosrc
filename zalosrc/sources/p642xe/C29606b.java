package p642xe;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xe.b */
/* loaded from: classes3.dex */
public final class C29606b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f136690a;

    /* renamed from: b */
    private Map f136691b;

    /* renamed from: c */
    private String f136692c;

    /* renamed from: d */
    private int f136693d;

    /* renamed from: e */
    private String f136694e;

    /* renamed from: f */
    private long f136695f;

    /* renamed from: g */
    private int f136696g;

    /* renamed from: h */
    private int f136697h;

    /* renamed from: i */
    private int f136698i;

    /* renamed from: j */
    private long f136699j;

    /* renamed from: k */
    private long f136700k;

    /* renamed from: l */
    private boolean f136701l;

    /* renamed from: m */
    private String f136702m;

    /* renamed from: xe.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C29606b m147170a(String str) {
            AbstractC19074t.m100208f(str, "data");
            return new C29606b(new JSONObject(str), null);
        }

        /* renamed from: b */
        public final C29606b m147171b(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "dataObj");
            C29606b c29606b = new C29606b(jSONObject, null);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            c29606b.m147162m(jSONObject2);
            return c29606b;
        }
    }

    public /* synthetic */ C29606b(JSONObject jSONObject, AbstractC19060k abstractC19060k) {
        this(jSONObject);
    }

    /* renamed from: a */
    public static final C29606b m147150a(String str) {
        return Companion.m147170a(str);
    }

    /* renamed from: b */
    public static final C29606b m147151b(JSONObject jSONObject) {
        return Companion.m147171b(jSONObject);
    }

    /* renamed from: c */
    public final long m147152c() {
        return this.f136690a;
    }

    /* renamed from: d */
    public final String m147153d() {
        return this.f136702m;
    }

    /* renamed from: e */
    public final String m147154e() {
        return this.f136694e;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C29606b) && this.f136690a == ((C29606b) obj).f136690a) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final long m147155f() {
        return this.f136695f;
    }

    /* renamed from: g */
    public final int m147156g() {
        return this.f136696g;
    }

    /* renamed from: h */
    public final long m147157h() {
        return this.f136700k;
    }

    /* renamed from: i */
    public final int m147158i() {
        return this.f136697h;
    }

    /* renamed from: j */
    public final long m147159j() {
        return this.f136699j;
    }

    /* renamed from: k */
    public final boolean m147160k() {
        return this.f136701l;
    }

    /* renamed from: l */
    public final void m147161l(long j11) {
        this.f136690a = j11;
    }

    /* renamed from: m */
    public final void m147162m(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f136702m = str;
    }

    /* renamed from: n */
    public final void m147163n(String str) {
        this.f136694e = str;
    }

    /* renamed from: o */
    public final void m147164o(boolean z11) {
        this.f136701l = z11;
    }

    /* renamed from: p */
    public final void m147165p(long j11) {
        this.f136695f = j11;
    }

    /* renamed from: q */
    public final void m147166q(int i11) {
        this.f136696g = i11;
    }

    /* renamed from: r */
    public final void m147167r(long j11) {
        this.f136700k = j11;
    }

    /* renamed from: s */
    public final void m147168s(int i11) {
        this.f136697h = i11;
    }

    /* renamed from: t */
    public final void m147169t(long j11) {
        this.f136699j = j11;
    }

    private C29606b(JSONObject jSONObject) {
        JSONObject optJSONObject;
        this.f136691b = new HashMap();
        this.f136692c = "";
        this.f136702m = "";
        this.f136690a = jSONObject.getLong("categoryId");
        if (jSONObject.has("categoryTitles") && (optJSONObject = jSONObject.optJSONObject("categoryTitles")) != null) {
            try {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = optJSONObject.getString(next);
                    Map map = this.f136691b;
                    AbstractC19074t.m100205c(next);
                    AbstractC19074t.m100205c(string);
                    map.put(next, string);
                }
            } catch (JSONException e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
        String optString = jSONObject.optString("iconUrl");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f136692c = optString;
        this.f136693d = jSONObject.optInt("version");
        this.f136698i = jSONObject.optInt("showRedDot");
    }
}

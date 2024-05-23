package dj;

import dj.C17991p1;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: dj.o1 */
/* loaded from: classes3.dex */
public final class C17988o1 {
    public static final b Companion = new b(null);

    /* renamed from: a */
    private final LinkedList f91104a;

    /* renamed from: b */
    private String f91105b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: dj.o1$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: q */
        public static final a f91106q = new a("TAP_CLOSE", 0, 0);

        /* renamed from: r */
        public static final a f91107r = new a("TAP_REPLY", 1, 1);

        /* renamed from: s */
        public static final a f91108s = new a("TYPE_REPLY", 2, 2);

        /* renamed from: t */
        private static final /* synthetic */ a[] f91109t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f91110u;

        /* renamed from: p */
        private final int f91111p;

        static {
            a[] m95663b = m95663b();
            f91109t = m95663b;
            f91110u = AbstractC30166b.m148796a(m95663b);
        }

        private a(String str, int i11, int i12) {
            this.f91111p = i12;
        }

        /* renamed from: b */
        private static final /* synthetic */ a[] m95663b() {
            return new a[]{f91106q, f91107r, f91108s};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f91109t.clone();
        }

        /* renamed from: c */
        public final int m95664c() {
            return this.f91111p;
        }
    }

    /* renamed from: dj.o1$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C17988o1() {
        this.f91104a = new LinkedList();
        this.f91105b = "";
    }

    /* renamed from: a */
    public final String m95660a() {
        return this.f91105b;
    }

    /* renamed from: b */
    public final LinkedList m95661b() {
        return this.f91104a;
    }

    /* renamed from: c */
    public final void m95662c(JSONArray jSONArray) {
        AbstractC19074t.m100208f(jSONArray, "data");
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i11);
            LinkedList linkedList = this.f91104a;
            C17991p1.a aVar = C17991p1.Companion;
            AbstractC19074t.m100205c(optJSONObject);
            linkedList.add(aVar.m95676a(optJSONObject));
        }
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("globalId", this.f91105b);
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f91104a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C17991p1) it.next()).m95675d());
        }
        jSONObject.put("quick_reply", jSONArray);
        String jSONObject2 = jSONObject.toString();
        AbstractC19074t.m100207e(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17988o1(JSONArray jSONArray, String str) {
        this();
        AbstractC19074t.m100208f(jSONArray, "dataArray");
        AbstractC19074t.m100208f(str, "globalId");
        this.f91105b = str;
        m95662c(jSONArray);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17988o1(JSONObject jSONObject) {
        this();
        AbstractC19074t.m100208f(jSONObject, "data");
        String optString = jSONObject.optString("globalId");
        AbstractC19074t.m100207e(optString, "optString(...)");
        this.f91105b = optString;
        if (jSONObject.has("quick_reply")) {
            JSONArray jSONArray = jSONObject.getJSONArray("quick_reply");
            AbstractC19074t.m100207e(jSONArray, "getJSONArray(...)");
            m95662c(jSONArray);
        }
    }
}

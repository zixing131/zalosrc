package p424pj;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: pj.a */
/* loaded from: classes3.dex */
public final class C24774a {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private String f118982a;

    /* renamed from: b */
    private int f118983b;

    /* renamed from: c */
    private long f118984c;

    /* renamed from: d */
    private int f118985d;

    /* renamed from: pj.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ ArrayList m128765b(a aVar, JSONObject jSONObject, int i11, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                i11 = 1;
            }
            return aVar.m128766a(jSONObject, i11);
        }

        /* renamed from: a */
        public final ArrayList m128766a(JSONObject jSONObject, int i11) {
            AbstractC19074t.m100208f(jSONObject, "data");
            JSONArray optJSONArray = jSONObject.optJSONArray("convsGroup");
            JSONArray optJSONArray2 = jSONObject.optJSONArray("convsUser");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i12);
                    AbstractC19074t.m100205c(jSONObject2);
                    arrayList.add(new C24774a(jSONObject2, i11, true));
                }
            }
            if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                int length2 = optJSONArray2.length();
                for (int i13 = 0; i13 < length2; i13++) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i13);
                    AbstractC19074t.m100205c(jSONObject3);
                    arrayList.add(new C24774a(jSONObject3, i11, false, 4, null));
                }
            }
            return arrayList;
        }
    }

    public C24774a() {
        this.f118982a = "";
        this.f118983b = 1;
    }

    /* renamed from: a */
    public final int m128760a() {
        return this.f118985d;
    }

    /* renamed from: b */
    public final long m128761b() {
        return this.f118984c;
    }

    /* renamed from: c */
    public final int m128762c() {
        return this.f118983b;
    }

    /* renamed from: d */
    public final String m128763d() {
        return this.f118982a;
    }

    /* renamed from: e */
    public final void m128764e(int i11) {
        this.f118985d = i11;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24774a(JSONObject jSONObject, int i11, boolean z11) {
        this();
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        String optString = jSONObject.optString("id");
        if (z11) {
            optString = "group_" + optString;
        }
        AbstractC19074t.m100205c(optString);
        this.f118982a = optString;
        this.f118983b = i11;
        this.f118984c = jSONObject.optLong("ts");
        this.f118985d = jSONObject.optInt("syncStatus", 2);
    }

    public /* synthetic */ C24774a(JSONObject jSONObject, int i11, boolean z11, int i12, AbstractC19060k abstractC19060k) {
        this(jSONObject, (i12 & 2) != 0 ? 1 : i11, (i12 & 4) != 0 ? false : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24774a(String str, int i11, long j11, int i12) {
        this();
        AbstractC19074t.m100208f(str, "uid");
        this.f118982a = str;
        this.f118983b = i11;
        this.f118984c = j11;
        this.f118985d = i12;
    }

    public /* synthetic */ C24774a(String str, int i11, long j11, int i12, int i13, AbstractC19060k abstractC19060k) {
        this(str, (i13 & 2) != 0 ? 1 : i11, (i13 & 4) != 0 ? C23793c.Companion.m124321a().mo124314i() : j11, (i13 & 8) != 0 ? 0 : i12);
    }
}

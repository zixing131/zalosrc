package p374ny;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import pm0.AbstractC24862s;
import pm0.C24861r;

/* renamed from: ny.d */
/* loaded from: classes4.dex */
public final class C23960d extends AbstractC23958b {
    public static final a Companion = new a(null);

    /* renamed from: g */
    private final JSONObject f115970g;

    /* renamed from: ny.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C23960d m125388a(String str, long j11, String str2, JSONObject jSONObject) {
            AbstractC19074t.m100208f(str, "content");
            AbstractC19074t.m100208f(str2, "title");
            AbstractC19074t.m100208f(jSONObject, "itemData");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("itemData", jSONObject);
            return new C23960d(0L, str, j11, str2, jSONObject2.toString());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23960d(long j11, String str, long j12, String str2, String str3) {
        super(j11, str, 4, j12, str2, str3, null);
        Object m129218b;
        JSONObject jSONObject;
        AbstractC19074t.m100208f(str, "content");
        AbstractC19074t.m100208f(str2, "title");
        if (str3 != null) {
            try {
                C24861r.a aVar = C24861r.f119264q;
                m129218b = C24861r.m129218b(new JSONObject(str3));
            } catch (Throwable th2) {
                C24861r.a aVar2 = C24861r.f119264q;
                m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
            }
            jSONObject = (JSONObject) (C24861r.m129223g(m129218b) ? null : m129218b);
        } else {
            jSONObject = null;
        }
        this.f115970g = jSONObject != null ? jSONObject.optJSONObject("itemData") : null;
    }

    /* renamed from: h */
    public final JSONObject m125387h() {
        return this.f115970g;
    }
}

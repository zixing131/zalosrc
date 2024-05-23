package pk;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: pk.e */
/* loaded from: classes3.dex */
public final class C24801e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f119058a;

    /* renamed from: b */
    private boolean f119059b;

    /* renamed from: c */
    private MessageId f119060c;

    /* renamed from: d */
    private long f119061d;

    /* renamed from: pk.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24801e m128866a(String str) {
            AbstractC19074t.m100208f(str, "jsonString");
            JSONObject jSONObject = new JSONObject();
            if (str.length() > 0) {
                jSONObject = new JSONObject(str);
            }
            C24801e c24801e = new C24801e(0L, false, null, 0L, 15, null);
            c24801e.m128862e(jSONObject.optLong("collectionId", 0L));
            c24801e.m128863f(jSONObject.optBoolean("hasMore", true));
            MessageId m41068i = MessageId.Companion.m41068i(jSONObject.optString("lastItem"));
            if (m41068i != null) {
                c24801e.m128864g(m41068i);
            }
            c24801e.m128865h(jSONObject.optLong("lastModifiedItemTime", 0L));
            return c24801e;
        }

        /* renamed from: b */
        public final String m128867b(C24801e c24801e) {
            String str;
            AbstractC19074t.m100208f(c24801e, "stateLoadInfo");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("collectionId", c24801e.m128858a());
            jSONObject.put("hasMore", c24801e.m128859b());
            MessageId m128860c = c24801e.m128860c();
            if (m128860c != null) {
                str = m128860c.m41043D();
            } else {
                str = null;
            }
            jSONObject.put("lastItem", str);
            jSONObject.put("lastModifiedItemTime", c24801e.m128861d());
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    public C24801e(long j11, boolean z11, MessageId messageId, long j12) {
        this.f119058a = j11;
        this.f119059b = z11;
        this.f119060c = messageId;
        this.f119061d = j12;
    }

    /* renamed from: a */
    public final long m128858a() {
        return this.f119058a;
    }

    /* renamed from: b */
    public final boolean m128859b() {
        return this.f119059b;
    }

    /* renamed from: c */
    public final MessageId m128860c() {
        return this.f119060c;
    }

    /* renamed from: d */
    public final long m128861d() {
        return this.f119061d;
    }

    /* renamed from: e */
    public final void m128862e(long j11) {
        this.f119058a = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24801e)) {
            return false;
        }
        C24801e c24801e = (C24801e) obj;
        return this.f119058a == c24801e.f119058a && this.f119059b == c24801e.f119059b && AbstractC19074t.m100204b(this.f119060c, c24801e.f119060c) && this.f119061d == c24801e.f119061d;
    }

    /* renamed from: f */
    public final void m128863f(boolean z11) {
        this.f119059b = z11;
    }

    /* renamed from: g */
    public final void m128864g(MessageId messageId) {
        this.f119060c = messageId;
    }

    /* renamed from: h */
    public final void m128865h(long j11) {
        this.f119061d = j11;
    }

    public int hashCode() {
        int m11521a = ((AbstractC2147g0.m11521a(this.f119058a) * 31) + AbstractC2144f.m11520a(this.f119059b)) * 31;
        MessageId messageId = this.f119060c;
        return ((m11521a + (messageId == null ? 0 : messageId.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f119061d);
    }

    public String toString() {
        return "StateLoadItemCollectionInfo(collectionId=" + this.f119058a + ", hasMore=" + this.f119059b + ", lastItem=" + this.f119060c + ", lastModifiedItemTime=" + this.f119061d + ")";
    }

    public /* synthetic */ C24801e(long j11, boolean z11, MessageId messageId, long j12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? true : z11, (i11 & 4) != 0 ? null : messageId, (i11 & 8) != 0 ? 0L : j12);
    }
}

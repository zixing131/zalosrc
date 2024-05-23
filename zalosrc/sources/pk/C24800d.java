package pk;

import androidx.work.AbstractC2147g0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: pk.d */
/* loaded from: classes3.dex */
public final class C24800d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private long f119055a;

    /* renamed from: b */
    private MessageId f119056b;

    /* renamed from: c */
    private long f119057c;

    /* renamed from: pk.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24800d m128857a(long j11, JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonObject");
            C24800d c24800d = new C24800d(0L, null, 0L, 7, null);
            try {
                long optLong = jSONObject.optLong("cli", 0L);
                long optLong2 = jSONObject.optLong("glb", 0L);
                long optLong3 = jSONObject.optLong("addTime", 0L);
                c24800d.m128855h(j11);
                c24800d.m128856i(MessageId.C7932a.m41062g(MessageId.Companion, String.valueOf(optLong), String.valueOf(optLong2), "204278670", null, 8, null));
                c24800d.m128854g(optLong3);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
            return c24800d;
        }
    }

    public C24800d(long j11, MessageId messageId, long j12) {
        this.f119055a = j11;
        this.f119056b = messageId;
        this.f119057c = j12;
    }

    /* renamed from: a */
    public final long m128848a() {
        return this.f119055a;
    }

    /* renamed from: b */
    public final MessageId m128849b() {
        return this.f119056b;
    }

    /* renamed from: c */
    public final long m128850c() {
        return this.f119057c;
    }

    /* renamed from: d */
    public final long m128851d() {
        return this.f119057c;
    }

    /* renamed from: e */
    public final long m128852e() {
        return this.f119055a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24800d)) {
            return false;
        }
        C24800d c24800d = (C24800d) obj;
        return this.f119055a == c24800d.f119055a && AbstractC19074t.m100204b(this.f119056b, c24800d.f119056b) && this.f119057c == c24800d.f119057c;
    }

    /* renamed from: f */
    public final MessageId m128853f() {
        return this.f119056b;
    }

    /* renamed from: g */
    public final void m128854g(long j11) {
        this.f119057c = j11;
    }

    /* renamed from: h */
    public final void m128855h(long j11) {
        this.f119055a = j11;
    }

    public int hashCode() {
        int m11521a = AbstractC2147g0.m11521a(this.f119055a) * 31;
        MessageId messageId = this.f119056b;
        return ((m11521a + (messageId == null ? 0 : messageId.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f119057c);
    }

    /* renamed from: i */
    public final void m128856i(MessageId messageId) {
        this.f119056b = messageId;
    }

    public String toString() {
        return "\nMyCloudCollectionItem={collectionId=" + this.f119055a + ", messageId=" + this.f119056b + "}";
    }

    public /* synthetic */ C24800d(long j11, MessageId messageId, long j12, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? 0L : j11, (i11 & 2) != 0 ? null : messageId, (i11 & 4) != 0 ? 0L : j12);
    }
}

package p423pi;

import au.AbstractC2373t;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p461qu.AbstractC25495a;

/* renamed from: pi.e */
/* loaded from: classes3.dex */
public final class C24763e {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private int f118937a;

    /* renamed from: b */
    private int f118938b;

    /* renamed from: c */
    private int f118939c;

    /* renamed from: d */
    private long f118940d;

    /* renamed from: e */
    private long f118941e;

    /* renamed from: f */
    private int f118942f;

    /* renamed from: g */
    private String f118943g;

    /* renamed from: h */
    private long f118944h;

    /* renamed from: pi.e$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24763e m128726a(JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            try {
                int optInt = jSONObject.optInt("fromUid");
                int optInt2 = jSONObject.optInt("threadId");
                int optInt3 = jSONObject.optInt("destType");
                long optLong = jSONObject.optLong("id");
                long optLong2 = jSONObject.optLong("clientmsgId");
                int optInt4 = jSONObject.optInt("platform");
                String optString = jSONObject.optString("deviceId");
                long optLong3 = jSONObject.optLong("createdActionTime");
                AbstractC19074t.m100205c(optString);
                return new C24763e(optInt, optInt2, optInt3, optLong, optLong2, optInt4, optString, optLong3);
            } catch (Exception e11) {
                AbstractC23350e.m122776f("SyncActionMediaItem", e11);
                return new C24763e();
            }
        }
    }

    public C24763e() {
        this.f118943g = "";
    }

    /* renamed from: a */
    private final String m128715a() {
        if (this.f118939c == 1) {
            return "group_" + this.f118938b;
        }
        return String.valueOf(this.f118938b);
    }

    /* renamed from: b */
    public final long m128716b() {
        return this.f118941e;
    }

    /* renamed from: c */
    public final long m128717c() {
        return this.f118944h;
    }

    /* renamed from: d */
    public final int m128718d() {
        return this.f118939c;
    }

    /* renamed from: e */
    public final String m128719e() {
        return this.f118943g;
    }

    /* renamed from: f */
    public final int m128720f() {
        return this.f118937a;
    }

    /* renamed from: g */
    public final long m128721g() {
        return this.f118940d;
    }

    /* renamed from: h */
    public final int m128722h() {
        return this.f118942f;
    }

    /* renamed from: i */
    public final int m128723i() {
        return this.f118938b;
    }

    /* renamed from: j */
    public final C24763e m128724j(C17945a0 c17945a0, long j11) {
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        this.f118937a = c17945a0.m95029V3().m41051o();
        this.f118938b = AbstractC25495a.m132090o(c17945a0.mo95039W2());
        this.f118939c = c17945a0.m94847A6() ? 1 : 0;
        this.f118940d = c17945a0.m95029V3().m41047k();
        this.f118941e = c17945a0.m95029V3().m41045i();
        this.f118942f = 0;
        String m12409g = AbstractC2373t.m12409g();
        AbstractC19074t.m100207e(m12409g, "getZaloIdentifyString(...)");
        this.f118943g = m12409g;
        this.f118944h = j11;
        return this;
    }

    /* renamed from: k */
    public final MessageId m128725k() {
        return MessageId.Companion.m41063a(this.f118941e, 0L, m128715a(), String.valueOf(this.f118937a));
    }

    public String toString() {
        return "SyncActionMediaItem(threadId=" + this.f118938b + ", id=" + this.f118940d + ", clientmsgId=" + this.f118941e + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C24763e(int i11, int i12, int i13, long j11, long j12, int i14, String str, long j13) {
        this();
        AbstractC19074t.m100208f(str, "deviceId");
        this.f118937a = i11;
        this.f118938b = i12;
        this.f118939c = i13;
        this.f118940d = j11;
        this.f118941e = j12;
        this.f118942f = i14;
        this.f118943g = str;
        this.f118944h = j13;
    }
}

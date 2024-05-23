package p132ej;

import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23244v8;
import org.json.JSONObject;
import p588vw.C28652r;
import p716zh.C31924g1;

/* renamed from: ej.h */
/* loaded from: classes3.dex */
public final class C18446h implements Comparable {
    public static final a Companion = new a(null);

    /* renamed from: A */
    private CharSequence f92965A;

    /* renamed from: B */
    private String f92966B;

    /* renamed from: C */
    private C31924g1 f92967C;

    /* renamed from: p */
    private int f92968p;

    /* renamed from: q */
    private final MessageId f92969q;

    /* renamed from: r */
    private final long f92970r;

    /* renamed from: s */
    private final boolean f92971s;

    /* renamed from: t */
    private final boolean f92972t;

    /* renamed from: u */
    private int f92973u;

    /* renamed from: v */
    private int f92974v;

    /* renamed from: w */
    private final long f92975w;

    /* renamed from: x */
    private final String f92976x;

    /* renamed from: y */
    private final boolean f92977y;

    /* renamed from: z */
    private String f92978z;

    /* renamed from: ej.h$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m97762a(boolean z11) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("canShowSenderName", z11 ? 1 : 0);
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        }

        /* renamed from: b */
        public final int m97763b(C18446h c18446h, C18446h c18446h2) {
            if (c18446h == null && c18446h2 == null) {
                return 0;
            }
            if (c18446h == null) {
                return -1;
            }
            if (c18446h2 == null) {
                return 1;
            }
            return c18446h.compareTo(c18446h2);
        }
    }

    public C18446h(int i11, MessageId messageId, long j11, boolean z11, boolean z12, int i12, int i13, long j12, String str) {
        AbstractC19074t.m100208f(str, "zinstantData");
        this.f92968p = i11;
        this.f92969q = messageId;
        this.f92970r = j11;
        this.f92971s = z11;
        this.f92972t = z12;
        this.f92973u = i12;
        this.f92974v = i13;
        this.f92975w = j12;
        this.f92976x = str;
        boolean z13 = false;
        if (str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has("canShowSenderName") ? jSONObject.optInt("isBubbleType", 0) == 1 : jSONObject.optInt("canShowSenderName", 0) == 1) {
                    z13 = true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        this.f92977y = z13;
        this.f92978z = "";
        this.f92966B = "";
    }

    /* renamed from: b */
    public static final String m97739b(boolean z11) {
        return Companion.m97762a(z11);
    }

    /* renamed from: A */
    public final void m97740A(CharSequence charSequence) {
        this.f92965A = charSequence;
    }

    /* renamed from: B */
    public final void m97741B(C31924g1 c31924g1) {
        this.f92967C = c31924g1;
    }

    /* renamed from: C */
    public final void m97742C(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f92966B = str;
    }

    /* renamed from: D */
    public final void m97743D(int i11) {
        this.f92968p = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(C18446h c18446h) {
        AbstractC19074t.m100208f(c18446h, "other");
        return AbstractC19074t.m100210h(this.f92970r, c18446h.f92970r);
    }

    /* renamed from: d */
    public final boolean m97745d() {
        return this.f92977y;
    }

    /* renamed from: e */
    public final int m97746e() {
        return this.f92974v;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18446h)) {
            return false;
        }
        C18446h c18446h = (C18446h) obj;
        return this.f92968p == c18446h.f92968p && AbstractC19074t.m100204b(this.f92969q, c18446h.f92969q) && this.f92970r == c18446h.f92970r && this.f92971s == c18446h.f92971s && this.f92972t == c18446h.f92972t && this.f92973u == c18446h.f92973u && this.f92974v == c18446h.f92974v && this.f92975w == c18446h.f92975w && AbstractC19074t.m100204b(this.f92976x, c18446h.f92976x);
    }

    /* renamed from: g */
    public final MessageId m97747g() {
        return this.f92969q;
    }

    /* renamed from: h */
    public final int m97748h() {
        return this.f92973u;
    }

    public int hashCode() {
        int i11 = this.f92968p * 31;
        MessageId messageId = this.f92969q;
        return ((((((((((((((i11 + (messageId == null ? 0 : messageId.hashCode())) * 31) + AbstractC2147g0.m11521a(this.f92970r)) * 31) + AbstractC2144f.m11520a(this.f92971s)) * 31) + AbstractC2144f.m11520a(this.f92972t)) * 31) + this.f92973u) * 31) + this.f92974v) * 31) + AbstractC2147g0.m11521a(this.f92975w)) * 31) + this.f92976x.hashCode();
    }

    /* renamed from: i */
    public final String m97749i() {
        return this.f92978z;
    }

    /* renamed from: j */
    public final CharSequence m97750j() {
        String str;
        int i11 = this.f92968p;
        if (i11 != 51) {
            if (i11 != 52) {
                if (!C28652r.f132825q) {
                    C28652r.f132826r = true;
                    return this.f92978z;
                }
                if (this.f92965A == null) {
                    if (this.f92978z.length() > 0) {
                        if (this.f92978z.length() > 150) {
                            str = this.f92978z.substring(0, 150);
                            AbstractC19074t.m100207e(str, "substring(...)");
                        } else {
                            str = this.f92978z;
                        }
                        this.f92965A = C28652r.m143349v().m143357H(AbstractC23244v8.m119734D(str));
                    } else {
                        this.f92965A = "";
                    }
                }
                return this.f92965A;
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_unable_e2ee_decrypted_failed);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_waiting_e2ee_decrypted_failed);
    }

    /* renamed from: m */
    public final C31924g1 m97751m() {
        return this.f92967C;
    }

    /* renamed from: q */
    public final String m97752q() {
        return this.f92966B;
    }

    /* renamed from: r */
    public final long m97753r() {
        return this.f92970r;
    }

    /* renamed from: s */
    public final long m97754s() {
        return this.f92975w;
    }

    /* renamed from: t */
    public final int m97755t() {
        return this.f92968p;
    }

    public String toString() {
        return "LastMessageInfo(type=" + this.f92968p + ", messageId=" + this.f92969q + ", timestamp=" + this.f92970r + ", isDraftMsg=" + this.f92971s + ", isMine=" + this.f92972t + ", msgStatus=" + this.f92973u + ", downloadStatus=" + this.f92974v + ", ttl=" + this.f92975w + ", zinstantData=" + this.f92976x + ")";
    }

    /* renamed from: u */
    public final String m97756u() {
        return this.f92976x;
    }

    /* renamed from: v */
    public final boolean m97757v() {
        return this.f92971s;
    }

    /* renamed from: w */
    public final boolean m97758w() {
        return this.f92972t;
    }

    /* renamed from: x */
    public final void m97759x(int i11) {
        this.f92974v = i11;
    }

    /* renamed from: y */
    public final void m97760y(int i11) {
        this.f92973u = i11;
    }

    /* renamed from: z */
    public final void m97761z(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f92978z = str;
    }

    public /* synthetic */ C18446h(int i11, MessageId messageId, long j11, boolean z11, boolean z12, int i12, int i13, long j12, String str, int i14, AbstractC19060k abstractC19060k) {
        this(i11, messageId, j11, z11, z12, i12, i13, (i14 & 128) != 0 ? 0L : j12, (i14 & 256) != 0 ? "" : str);
    }

    public C18446h(long j11) {
        this(0, null, j11, false, false, -1, -1, 0L, null, 256, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18446h(C17945a0 c17945a0) {
        this(c17945a0.m95041W4(), c17945a0.m95029V3(), c17945a0.m94974P4(), c17945a0.m95160i6(), c17945a0.m95032V6(), c17945a0.m95089b4(), c17945a0.m95107d3(), c17945a0.m95030V4(), null, 256, null);
        AbstractC19074t.m100208f(c17945a0, "chatContent");
        String m95019U3 = c17945a0.m95019U3();
        AbstractC19074t.m100207e(m95019U3, "getMessage(...)");
        this.f92978z = m95019U3;
    }
}

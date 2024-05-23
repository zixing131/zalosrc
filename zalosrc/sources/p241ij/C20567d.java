package p241ij;

import android.text.TextUtils;
import androidx.work.AbstractC2144f;
import androidx.work.AbstractC2147g0;
import com.zing.zalo.control.C7908f;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg;
import com.zing.zalo.data.entity.chat.message.LastDeliveredSeenData;
import com.zing.zalo.data.entity.chat.message.MessageId;
import dj.C17945a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23244v8;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p056cj.C3533a;
import p132ej.C18446h;
import p577vj.C28266a;
import p716zh.C31924g1;
import p716zh.C31954i1;

/* renamed from: ij.d */
/* loaded from: classes3.dex */
public final class C20567d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final MessageId f101113a;

    /* renamed from: b */
    private long f101114b;

    /* renamed from: c */
    private final boolean f101115c;

    /* renamed from: d */
    private final boolean f101116d;

    /* renamed from: e */
    private final int f101117e;

    /* renamed from: f */
    private final int f101118f;

    /* renamed from: g */
    private final int f101119g;

    /* renamed from: h */
    private final int f101120h;

    /* renamed from: i */
    private final int f101121i;

    /* renamed from: j */
    private final int f101122j;

    /* renamed from: k */
    private final FirstUnreadMsg f101123k;

    /* renamed from: l */
    private final C28266a f101124l;

    /* renamed from: m */
    private final LastDeliveredSeenData f101125m;

    /* renamed from: n */
    private final String f101126n;

    /* renamed from: o */
    private final String f101127o;

    /* renamed from: p */
    private final String f101128p;

    /* renamed from: q */
    private final C7908f f101129q;

    /* renamed from: r */
    private final C3533a f101130r;

    /* renamed from: s */
    private final C31954i1 f101131s;

    /* renamed from: t */
    private final C31924g1 f101132t;

    /* renamed from: u */
    private final long f101133u;

    /* renamed from: v */
    private final String f101134v;

    /* renamed from: ij.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0041  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C20567d m107015a(C17945a0 c17945a0, int i11, int i12, int i13, FirstUnreadMsg firstUnreadMsg, C28266a c28266a, LastDeliveredSeenData lastDeliveredSeenData, String str, String str2, C7908f c7908f, C3533a c3533a) {
            C31924g1 c31924g1;
            String str3;
            boolean z11;
            AbstractC19074t.m100208f(c17945a0, "msg");
            AbstractC19074t.m100208f(str, "previewText");
            AbstractC19074t.m100208f(str2, "senderNameGroup");
            C31954i1 c31954i1 = new C31954i1(c17945a0);
            try {
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
            if (!TextUtils.isEmpty(c31954i1.m153655e())) {
                c31924g1 = new C31924g1(new JSONObject(c31954i1.m153655e()));
                C31924g1 c31924g12 = c31924g1;
                if (!c17945a0.m94872D8()) {
                    C18446h.a aVar = C18446h.Companion;
                    if (!c17945a0.m95014T6() && !c17945a0.m94865C8()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    str3 = aVar.m97762a(z11);
                } else {
                    str3 = "";
                }
                String str4 = str3;
                MessageId m95029V3 = c17945a0.m95029V3();
                long mo95213o = c17945a0.mo95213o();
                boolean m95032V6 = c17945a0.m95032V6();
                boolean m95160i6 = c17945a0.m95160i6();
                int m95041W4 = c17945a0.m95041W4();
                int m95089b4 = c17945a0.m95089b4();
                int m95107d3 = c17945a0.m95107d3();
                String m94862C4 = c17945a0.m94862C4();
                AbstractC19074t.m100207e(m94862C4, "getSenderUid(...)");
                return new C20567d(m95029V3, mo95213o, m95032V6, m95160i6, m95041W4, m95089b4, m95107d3, i11, i12, i13, firstUnreadMsg, c28266a, lastDeliveredSeenData, str, str2, m94862C4, c7908f, c3533a, c31954i1, c31924g12, c17945a0.m95030V4(), str4);
            }
            c31924g1 = null;
            C31924g1 c31924g122 = c31924g1;
            if (!c17945a0.m94872D8()) {
            }
            String str42 = str3;
            MessageId m95029V32 = c17945a0.m95029V3();
            long mo95213o2 = c17945a0.mo95213o();
            boolean m95032V62 = c17945a0.m95032V6();
            boolean m95160i62 = c17945a0.m95160i6();
            int m95041W42 = c17945a0.m95041W4();
            int m95089b42 = c17945a0.m95089b4();
            int m95107d32 = c17945a0.m95107d3();
            String m94862C42 = c17945a0.m94862C4();
            AbstractC19074t.m100207e(m94862C42, "getSenderUid(...)");
            return new C20567d(m95029V32, mo95213o2, m95032V62, m95160i62, m95041W42, m95089b42, m95107d32, i11, i12, i13, firstUnreadMsg, c28266a, lastDeliveredSeenData, str, str2, m94862C42, c7908f, c3533a, c31954i1, c31924g122, c17945a0.m95030V4(), str42);
        }

        /* renamed from: b */
        public final C20567d m107016b(Conversation conversation, int i11, FirstUnreadMsg firstUnreadMsg, C28266a c28266a, LastDeliveredSeenData lastDeliveredSeenData, C7908f c7908f, C3533a c3533a) {
            boolean z11;
            boolean z12;
            String str;
            C31924g1 c31924g1;
            C31924g1 c31924g12;
            long j11;
            String str2;
            String m97756u;
            String m97752q;
            AbstractC19074t.m100208f(conversation, "conversation");
            C18446h m41003g = conversation.m41003g();
            if (m41003g != null && m41003g.m97757v()) {
                z11 = true;
            } else {
                z11 = false;
            }
            MessageId m41005i = conversation.m41005i();
            long m41008l = conversation.m41008l();
            C18446h m41003g2 = conversation.m41003g();
            if (m41003g2 != null) {
                z12 = m41003g2.m97758w();
            } else {
                z12 = false;
            }
            int m41009m = conversation.m41009m();
            int m41007k = conversation.m41007k();
            int m41004h = conversation.m41004h();
            int i12 = conversation.f42897u;
            String m41006j = conversation.m41006j();
            C18446h m41003g3 = conversation.m41003g();
            if (m41003g3 == null || (m97752q = m41003g3.m97752q()) == null) {
                str = "";
            } else {
                str = m97752q;
            }
            C18446h m41003g4 = conversation.m41003g();
            if (m41003g4 != null) {
                c31924g1 = m41003g4.m97751m();
            } else {
                c31924g1 = null;
            }
            C31954i1 c31954i1 = new C31954i1(c31924g1);
            C18446h m41003g5 = conversation.m41003g();
            if (m41003g5 != null) {
                c31924g12 = m41003g5.m97751m();
            } else {
                c31924g12 = null;
            }
            C18446h m41003g6 = conversation.m41003g();
            if (m41003g6 != null) {
                j11 = m41003g6.m97754s();
            } else {
                j11 = 0;
            }
            long j12 = j11;
            if (m41003g == null || (m97756u = m41003g.m97756u()) == null) {
                str2 = "";
            } else {
                str2 = m97756u;
            }
            return new C20567d(m41005i, m41008l, z12, z11, m41009m, m41007k, m41004h, i12, i11, -1, firstUnreadMsg, c28266a, lastDeliveredSeenData, m41006j, str, "", c7908f, c3533a, c31954i1, c31924g12, j12, str2);
        }
    }

    public C20567d(MessageId messageId, long j11, boolean z11, boolean z12, int i11, int i12, int i13, int i14, int i15, int i16, FirstUnreadMsg firstUnreadMsg, C28266a c28266a, LastDeliveredSeenData lastDeliveredSeenData, String str, String str2, String str3, C7908f c7908f, C3533a c3533a, C31954i1 c31954i1, C31924g1 c31924g1, long j12, String str4) {
        AbstractC19074t.m100208f(str, "previewText");
        AbstractC19074t.m100208f(str2, "senderNameGroup");
        AbstractC19074t.m100208f(str3, "senderUid");
        AbstractC19074t.m100208f(c31954i1, "conversationSerializeData");
        AbstractC19074t.m100208f(str4, "zinstantData");
        this.f101113a = messageId;
        this.f101114b = j11;
        this.f101115c = z11;
        this.f101116d = z12;
        this.f101117e = i11;
        this.f101118f = i12;
        this.f101119g = i13;
        this.f101120h = i14;
        this.f101121i = i15;
        this.f101122j = i16;
        this.f101123k = firstUnreadMsg;
        this.f101124l = c28266a;
        this.f101125m = lastDeliveredSeenData;
        this.f101126n = str;
        this.f101127o = str2;
        this.f101128p = str3;
        this.f101129q = c7908f;
        this.f101130r = c3533a;
        this.f101131s = c31954i1;
        this.f101132t = c31924g1;
        this.f101133u = j12;
        this.f101134v = str4;
    }

    /* renamed from: a */
    public final int m106993a() {
        return this.f101120h;
    }

    /* renamed from: b */
    public final C31954i1 m106994b() {
        return this.f101131s;
    }

    /* renamed from: c */
    public final int m106995c() {
        return this.f101122j;
    }

    /* renamed from: d */
    public final C3533a m106996d() {
        return this.f101130r;
    }

    /* renamed from: e */
    public final int m106997e() {
        return this.f101119g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20567d)) {
            return false;
        }
        C20567d c20567d = (C20567d) obj;
        return AbstractC19074t.m100204b(this.f101113a, c20567d.f101113a) && this.f101114b == c20567d.f101114b && this.f101115c == c20567d.f101115c && this.f101116d == c20567d.f101116d && this.f101117e == c20567d.f101117e && this.f101118f == c20567d.f101118f && this.f101119g == c20567d.f101119g && this.f101120h == c20567d.f101120h && this.f101121i == c20567d.f101121i && this.f101122j == c20567d.f101122j && AbstractC19074t.m100204b(this.f101123k, c20567d.f101123k) && AbstractC19074t.m100204b(this.f101124l, c20567d.f101124l) && AbstractC19074t.m100204b(this.f101125m, c20567d.f101125m) && AbstractC19074t.m100204b(this.f101126n, c20567d.f101126n) && AbstractC19074t.m100204b(this.f101127o, c20567d.f101127o) && AbstractC19074t.m100204b(this.f101128p, c20567d.f101128p) && AbstractC19074t.m100204b(this.f101129q, c20567d.f101129q) && AbstractC19074t.m100204b(this.f101130r, c20567d.f101130r) && AbstractC19074t.m100204b(this.f101131s, c20567d.f101131s) && AbstractC19074t.m100204b(this.f101132t, c20567d.f101132t) && this.f101133u == c20567d.f101133u && AbstractC19074t.m100204b(this.f101134v, c20567d.f101134v);
    }

    /* renamed from: f */
    public final FirstUnreadMsg m106998f() {
        return this.f101123k;
    }

    /* renamed from: g */
    public final LastDeliveredSeenData m106999g() {
        return this.f101125m;
    }

    /* renamed from: h */
    public final MessageId m107000h() {
        return this.f101113a;
    }

    public int hashCode() {
        MessageId messageId = this.f101113a;
        int hashCode = (((((((((((((((((((messageId == null ? 0 : messageId.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f101114b)) * 31) + AbstractC2144f.m11520a(this.f101115c)) * 31) + AbstractC2144f.m11520a(this.f101116d)) * 31) + this.f101117e) * 31) + this.f101118f) * 31) + this.f101119g) * 31) + this.f101120h) * 31) + this.f101121i) * 31) + this.f101122j) * 31;
        FirstUnreadMsg firstUnreadMsg = this.f101123k;
        int hashCode2 = (hashCode + (firstUnreadMsg == null ? 0 : firstUnreadMsg.hashCode())) * 31;
        C28266a c28266a = this.f101124l;
        int hashCode3 = (hashCode2 + (c28266a == null ? 0 : c28266a.hashCode())) * 31;
        LastDeliveredSeenData lastDeliveredSeenData = this.f101125m;
        int hashCode4 = (((((((hashCode3 + (lastDeliveredSeenData == null ? 0 : lastDeliveredSeenData.hashCode())) * 31) + this.f101126n.hashCode()) * 31) + this.f101127o.hashCode()) * 31) + this.f101128p.hashCode()) * 31;
        C7908f c7908f = this.f101129q;
        int hashCode5 = (hashCode4 + (c7908f == null ? 0 : c7908f.hashCode())) * 31;
        C3533a c3533a = this.f101130r;
        int hashCode6 = (((hashCode5 + (c3533a == null ? 0 : c3533a.hashCode())) * 31) + this.f101131s.hashCode()) * 31;
        C31924g1 c31924g1 = this.f101132t;
        return ((((hashCode6 + (c31924g1 != null ? c31924g1.hashCode() : 0)) * 31) + AbstractC2147g0.m11521a(this.f101133u)) * 31) + this.f101134v.hashCode();
    }

    /* renamed from: i */
    public final int m107001i() {
        return this.f101118f;
    }

    /* renamed from: j */
    public final String m107002j() {
        return this.f101126n;
    }

    /* renamed from: k */
    public final C31924g1 m107003k() {
        return this.f101132t;
    }

    /* renamed from: l */
    public final String m107004l() {
        return this.f101127o;
    }

    /* renamed from: m */
    public final String m107005m() {
        return this.f101128p;
    }

    /* renamed from: n */
    public final long m107006n() {
        return this.f101114b;
    }

    /* renamed from: o */
    public final C7908f m107007o() {
        return this.f101129q;
    }

    /* renamed from: p */
    public final long m107008p() {
        return this.f101133u;
    }

    /* renamed from: q */
    public final int m107009q() {
        return this.f101117e;
    }

    /* renamed from: r */
    public final int m107010r() {
        return this.f101121i;
    }

    /* renamed from: s */
    public final String m107011s() {
        return this.f101134v;
    }

    /* renamed from: t */
    public final boolean m107012t() {
        return this.f101116d;
    }

    public String toString() {
        String str;
        LastDeliveredSeenData lastDeliveredSeenData;
        String str2;
        MessageId messageId = this.f101113a;
        long j11 = this.f101114b;
        boolean z11 = this.f101116d;
        if (!z11) {
            str = "";
        } else {
            str = ", isDraftMsg='" + z11 + "'";
        }
        int i11 = this.f101117e;
        int i12 = this.f101118f;
        int i13 = this.f101119g;
        int i14 = this.f101120h;
        String m119737a = AbstractC23244v8.m119737a(this.f101126n, 20);
        int i15 = this.f101121i;
        int i16 = this.f101122j;
        FirstUnreadMsg firstUnreadMsg = this.f101123k;
        LastDeliveredSeenData lastDeliveredSeenData2 = this.f101125m;
        C7908f c7908f = this.f101129q;
        if (c7908f != null) {
            StringBuilder sb2 = new StringBuilder();
            lastDeliveredSeenData = lastDeliveredSeenData2;
            sb2.append(", topOut='");
            sb2.append(c7908f);
            sb2.append("'");
            str2 = sb2.toString();
        } else {
            lastDeliveredSeenData = lastDeliveredSeenData2;
            str2 = "";
        }
        return "LastMsgDataHolder(msgId=" + messageId + ", timestamp=" + j11 + str + ", type=" + i11 + ", msgStatus=" + i12 + ", downloadStatus=" + i13 + ", category=" + i14 + ", previewText='" + m119737a + "', unreadCount=" + i15 + ", countUnreadMode=" + i16 + ", firstUnread=" + firstUnreadMsg + ", lastSeenMsg=" + lastDeliveredSeenData + str2 + "')";
    }

    /* renamed from: u */
    public final boolean m107013u() {
        return this.f101115c;
    }

    /* renamed from: v */
    public final void m107014v(long j11) {
        this.f101114b = j11;
    }
}

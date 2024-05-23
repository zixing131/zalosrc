package ga0;

import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import dg0.AbstractC17930e;
import dg0.InterfaceC17929d;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19669z;
import java.util.HashMap;
import me0.AbstractC23210s6;
import p612wk.AbstractC29069a;

/* renamed from: ga0.e1 */
/* loaded from: classes6.dex */
public final class C19319e1 extends AbstractC19358r1 {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private final HashMap f95929t;

    /* renamed from: u */
    private final int f95930u;

    /* renamed from: v */
    private final AbstractC29069a.f f95931v;

    /* renamed from: w */
    private final boolean f95932w;

    /* renamed from: x */
    private C19366v0 f95933x;

    /* renamed from: ga0.e1$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m101108a(InterfaceC17929d interfaceC17929d, String str, long j11, Runnable runnable) {
            AbstractC19074t.m100208f(interfaceC17929d, "<this>");
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(runnable, "runnable");
            interfaceC17929d.mo94530d(str, runnable, j11);
        }
    }

    public /* synthetic */ C19319e1(InterfaceC18319c interfaceC18319c, String str, HashMap hashMap, int i11, AbstractC29069a.f fVar, boolean z11, int i12, AbstractC19060k abstractC19060k) {
        this(interfaceC18319c, str, (i12 & 4) != 0 ? new HashMap() : hashMap, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? null : fVar, (i12 & 32) != 0 ? true : z11);
    }

    /* renamed from: p */
    private final void m101101p() {
        if (!C19322f1.f95950a.m101158o()) {
            int i11 = this.f95930u;
            if (i11 == 0 || AbstractC23210s6.m119560a(i11, 2)) {
                new C19334j1(this, m101455l(), this.f95929t).m101441i();
            }
            int i12 = this.f95930u;
            if (i12 == 0 || AbstractC23210s6.m119560a(i12, 8)) {
                new C19313c1(this, m101455l(), this.f95929t, null, 8, null).m101441i();
            }
            int i13 = this.f95930u;
            if (i13 == 0 || AbstractC23210s6.m119560a(i13, 4)) {
                new C19328h1(this, m101455l(), this.f95929t, null, 8, null).m101441i();
                return;
            }
            return;
        }
        int i14 = this.f95930u;
        if (i14 == 0 || AbstractC23210s6.m119560a(i14, 2)) {
            C19366v0 c19366v0 = new C19366v0(this, m101455l(), this.f95929t, this.f95931v, null, 16, null);
            this.f95933x = c19366v0;
            c19366v0.m101441i();
        }
    }

    /* renamed from: q */
    private final void m101102q(long j11) {
        if (j11 <= 0) {
            m101101p();
        } else {
            Companion.m101108a(AbstractC17930e.Companion.m94551d(), "DEBOUNCE_SEARCH_MSG_GLOBAL", j11, new Runnable() { // from class: ga0.d1
                @Override // java.lang.Runnable
                public final void run() {
                    C19319e1.m101103r(C19319e1.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m101103r(C19319e1 c19319e1) {
        AbstractC19074t.m100208f(c19319e1, "this$0");
        if (!c19319e1.isCancelled()) {
            c19319e1.m101101p();
        }
    }

    /* renamed from: s */
    private final void m101104s() {
        this.f95929t.clear();
        for (Conversation conversation : C19669z.Companion.m103232a().m103212Y0()) {
            HashMap hashMap = this.f95929t;
            String str = conversation.f42893q;
            hashMap.put(str, str);
        }
    }

    /* renamed from: n */
    public final C19366v0 m101105n() {
        return this.f95933x;
    }

    /* renamed from: o */
    public final HashMap m101106o() {
        return this.f95929t;
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        C19322f1.f95950a.m101144W();
        if (isCancelled()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = this.f95930u;
        if (i11 != 0 && !AbstractC23210s6.m119560a(i11, 1)) {
            m101104s();
        } else {
            new C19372y0(this, m101455l(), this.f95929t).m101441i();
        }
        int i12 = this.f95930u;
        if (i12 == 0 || AbstractC23210s6.m119560a(i12, 32)) {
            new C19337k1(this, m101455l()).m101442j();
        }
        long j11 = 0;
        if (this.f95932w) {
            j11 = Math.max(0L, (ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE + currentTimeMillis) - System.currentTimeMillis());
        }
        m101102q(j11);
    }

    /* renamed from: t */
    public final void m101107t(C19366v0 c19366v0) {
        this.f95933x = c19366v0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19319e1(InterfaceC18319c interfaceC18319c, String str, HashMap hashMap, int i11, AbstractC29069a.f fVar, boolean z11) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(hashMap, "uidExistThreadChatMap");
        this.f95929t = hashMap;
        this.f95930u = i11;
        this.f95931v = fVar;
        this.f95932w = z11;
    }
}

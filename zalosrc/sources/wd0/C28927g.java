package wd0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19636i1;
import gw.C19669z;
import mm0.AbstractC23350e;
import p019aj.C0872f;
import p161fg.C18922m;
import p185gc.AbstractC19383g;
import p363nh.C23744a;
import p405ov.C24559a;
import vg.C28023b6;

/* renamed from: wd0.g */
/* loaded from: classes4.dex */
public final class C28927g extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C19669z f133935a;

    /* renamed from: b */
    private final C0872f f133936b;

    /* renamed from: c */
    private final C19636i1 f133937c;

    /* renamed from: d */
    private final C18922m f133938d;

    /* renamed from: e */
    private final C28023b6 f133939e;

    /* renamed from: wd0.g$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wd0.g$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f133940a;

        /* renamed from: b */
        private final boolean f133941b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            this(str, false, 2, null);
            AbstractC19074t.m100208f(str, "userId");
        }

        /* renamed from: a */
        public final boolean m144537a() {
            return this.f133941b;
        }

        /* renamed from: b */
        public final String m144538b() {
            return this.f133940a;
        }

        public b(String str, boolean z11) {
            AbstractC19074t.m100208f(str, "userId");
            this.f133940a = str;
            this.f133941b = z11;
        }

        public /* synthetic */ b(String str, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(str, (i11 & 2) != 0 ? true : z11);
        }
    }

    public C28927g(C19669z c19669z, C0872f c0872f, C19636i1 c19636i1, C18922m c18922m, C28023b6 c28023b6) {
        AbstractC19074t.m100208f(c19669z, "messageManager");
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(c19636i1, "unreadManager");
        AbstractC19074t.m100208f(c18922m, "miniChatController");
        AbstractC19074t.m100208f(c28023b6, "notiManager");
        this.f133935a = c19669z;
        this.f133936b = c0872f;
        this.f133937c = c19636i1;
        this.f133938d = c18922m;
        this.f133939e = c28023b6;
    }

    /* renamed from: c */
    private final void m144534c(String str) {
        this.f133937c.m102792v0(str);
        this.f133937c.m102774l0(str);
        this.f133937c.m102776m0(str);
        this.f133937c.m102780o0(str);
        this.f133937c.m102785r0(str);
        this.f133936b.m2537g0(str);
        this.f133939e.m141310R(str, false, false, false);
    }

    /* renamed from: d */
    private final void m144535d(String str) {
        this.f133935a.m103198O0();
        if (AbstractC19074t.m100204b(str, "-8")) {
            C23744a.Companion.m124119a().m124116d(13000, new Object[0]);
        }
        C23744a.Companion.m124119a().m124116d(6064, new Object[0]);
    }

    @Override // p185gc.AbstractC19383g
    /* renamed from: e */
    public void mo12006b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        String m144538b = bVar.m144538b();
        C24559a.m127933c("DeleteTabMsgItem", "Start delete tab msg item (" + m144538b + ")");
        try {
            this.f133935a.m103195J(m144538b);
            if (bVar.m144537a()) {
                this.f133938d.m99145O(m144538b);
            }
            if (this.f133935a.m103228r0(m144538b)) {
                C19669z.Companion.m103232a().m103229t0();
            }
            m144534c(m144538b);
            m144535d(m144538b);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeleteTabMsgItem", e11);
        }
    }
}

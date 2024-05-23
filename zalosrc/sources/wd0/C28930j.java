package wd0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19636i1;
import gw.C19669z;
import java.util.Set;
import p019aj.C0872f;
import p161fg.C18922m;
import p185gc.AbstractC19384h;
import p363nh.C23744a;
import p405ov.C24559a;

/* renamed from: wd0.j */
/* loaded from: classes4.dex */
public final class C28930j extends AbstractC19384h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C19636i1 f133948a;

    /* renamed from: b */
    private final C19669z f133949b;

    /* renamed from: c */
    private final C0872f f133950c;

    /* renamed from: d */
    private final C18922m f133951d;

    /* renamed from: wd0.j$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wd0.j$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final Set f133952a;

        /* renamed from: b */
        private final boolean f133953b;

        public b(Set set, boolean z11) {
            AbstractC19074t.m100208f(set, "uidList");
            this.f133952a = set;
            this.f133953b = z11;
        }

        /* renamed from: a */
        public final boolean m144548a() {
            return this.f133953b;
        }

        /* renamed from: b */
        public final Set m144549b() {
            return this.f133952a;
        }

        public /* synthetic */ b(Set set, boolean z11, int i11, AbstractC19060k abstractC19060k) {
            this(set, (i11 & 2) != 0 ? false : z11);
        }
    }

    /* renamed from: wd0.j$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final int f133954a;

        public c(int i11) {
            this.f133954a = i11;
        }
    }

    public C28930j(C19636i1 c19636i1, C19669z c19669z, C0872f c0872f, C18922m c18922m) {
        AbstractC19074t.m100208f(c19636i1, "unreadManager");
        AbstractC19074t.m100208f(c19669z, "messageManager");
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(c18922m, "miniChatController");
        this.f133948a = c19636i1;
        this.f133949b = c19669z;
        this.f133950c = c0872f;
        this.f133951d = c18922m;
    }

    /* renamed from: c */
    private final void m144546c() {
        this.f133949b.m103198O0();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124116d(13000, new Object[0]);
        bVar.m124119a().m124116d(6064, new Object[0]);
    }

    @Override // p185gc.AbstractC19384h
    /* renamed from: d */
    public c mo13388b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        Set<String> m144549b = bVar.m144549b();
        boolean m144548a = bVar.m144548a();
        if (m144549b.isEmpty()) {
            return null;
        }
        C24559a.m127933c("ResetUnreadMsg", "Reset unread count of " + m144549b);
        int i11 = 0;
        boolean z11 = false;
        for (String str : m144549b) {
            if (m144548a || this.f133950c.m2525T()) {
                this.f133948a.m102772j0(str);
                this.f133948a.m102778n0(str);
                this.f133948a.m102780o0(str);
                this.f133948a.m102782p0(str);
            }
            i11 += this.f133948a.m102790u0(str);
            boolean m102787s0 = this.f133948a.m102787s0(str);
            if (!z11 && !m102787s0) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f133951d.m99146P(str);
        }
        m144546c();
        return new c(i11);
    }
}

package xd0;

import ag0.AbstractC0837p0;
import ag0.C0814e0;
import ag0.C0833n0;
import ag0.C0856z;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17996r0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19636i1;
import gw.C19669z;
import i60.C20338d;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import me0.AbstractC23089h6;
import mm0.AbstractC23350e;
import p019aj.C0872f;
import p019aj.C0876j;
import p056cj.C3535c;
import p185gc.AbstractC19378b;
import p185gc.AbstractC19383g;
import p263jc.C21216s;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p392oh.C24261h;
import p405ov.C24559a;
import p461qu.AbstractC25495a;
import p577vj.C28266a;
import p716zh.C32034n6;
import p716zh.C32050o7;
import p716zh.C32090r5;
import pm0.C24848g0;
import qm0.AbstractC25366r;
import qm0.AbstractC25377w0;
import vg.C28081h4;
import wd0.C28927g;
import wd0.C28931k;

/* renamed from: xd0.f */
/* loaded from: classes4.dex */
public final class C29590f extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0876j f136563a;

    /* renamed from: b */
    private final C0872f f136564b;

    /* renamed from: c */
    private final C8967m f136565c;

    /* renamed from: d */
    private final C32034n6 f136566d;

    /* renamed from: e */
    private final C28927g f136567e;

    /* renamed from: f */
    private final C19636i1 f136568f;

    /* renamed from: g */
    private final C24261h f136569g;

    /* renamed from: h */
    private final C32050o7 f136570h;

    /* renamed from: i */
    private final C21216s f136571i;

    /* renamed from: xd0.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: xd0.f$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f136572a;

        /* renamed from: b */
        private final C17945a0 f136573b;

        public b(String str, C17945a0 c17945a0) {
            AbstractC19074t.m100208f(str, "userId");
            AbstractC19074t.m100208f(c17945a0, "message");
            this.f136572a = str;
            this.f136573b = c17945a0;
        }

        /* renamed from: a */
        public final C17945a0 m147040a() {
            return this.f136573b;
        }

        /* renamed from: b */
        public final String m147041b() {
            return this.f136572a;
        }
    }

    public C29590f(C0876j c0876j, C0872f c0872f, C8967m c8967m, C32034n6 c32034n6, C28927g c28927g, C19636i1 c19636i1, C24261h c24261h, C32050o7 c32050o7, C21216s c21216s) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(c8967m, "liveLocationController");
        AbstractC19074t.m100208f(c32034n6, "fileCleaner");
        AbstractC19074t.m100208f(c28927g, "deleteTabMsgItemUseCase");
        AbstractC19074t.m100208f(c19636i1, "unreadManager");
        AbstractC19074t.m100208f(c24261h, "reactionMsgManager");
        AbstractC19074t.m100208f(c32050o7, "newPhotoSuggestController");
        AbstractC19074t.m100208f(c21216s, "autoDownloadController");
        this.f136563a = c0876j;
        this.f136564b = c0872f;
        this.f136565c = c8967m;
        this.f136566d = c32034n6;
        this.f136567e = c28927g;
        this.f136568f = c19636i1;
        this.f136569g = c24261h;
        this.f136570h = c32050o7;
        this.f136571i = c21216s;
    }

    /* renamed from: d */
    private final void m147031d(String str) {
        this.f136564b.m2551o(str);
        if (AbstractC21935u.m114515E(str) && this.f136564b.m2529X(str)) {
            C7959d.Companion.m41850e().m41774b3(str, 2);
        }
    }

    /* renamed from: e */
    private final void m147032e(String str, C17945a0 c17945a0) {
        C0814e0.m2069o(c17945a0);
        c17945a0.m94928K1();
        if (AbstractC25495a.m132079d(str) && c17945a0.m95032V6() && c17945a0.m95029V3().m41052p()) {
            C28081h4.m141541d().m141547h(c17945a0.m95029V3().m41045i(), false);
        }
        c17945a0.m95077Zb();
        if (C32090r5.m154810i().m154824o()) {
            C32090r5.m154810i().m154825p(c17945a0.m95029V3(), c17945a0.mo95039W2());
        }
    }

    /* renamed from: f */
    private final void m147033f(C17945a0 c17945a0) {
        if (!c17945a0.m94877E3()) {
            return;
        }
        C24261h c24261h = this.f136569g;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        ArrayList arrayList = new ArrayList();
        arrayList.add(c17945a0.m95029V3());
        C24848g0 c24848g0 = C24848g0.f119245a;
        c24261h.m126647n(mo95039W2, arrayList, false);
        C19636i1 c19636i1 = this.f136568f;
        String mo95039W22 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
        C28266a m102752J = c19636i1.m102752J(mo95039W22);
        if (m102752J != null && c17945a0.m95135f9(m102752J.m142383b())) {
            C24261h c24261h2 = this.f136569g;
            String mo95039W23 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W23, "getOwnerId(...)");
            c24261h2.m126646l(mo95039W23, m102752J.m142385d());
        }
    }

    /* renamed from: g */
    private final void m147034g(final C17945a0 c17945a0) {
        if (!c17945a0.m94906H5()) {
            return;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: xd0.e
            @Override // java.lang.Runnable
            public final void run() {
                C29590f.m147035h(C29590f.this, c17945a0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m147035h(C29590f c29590f, C17945a0 c17945a0) {
        AbstractC19074t.m100208f(c29590f, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$msgToDelete");
        C32034n6.m154488i(c29590f.f136566d, c17945a0, false, 2, null);
    }

    /* renamed from: i */
    private final void m147036i(C17945a0 c17945a0) {
        C7956b.Companion.m41573b().m41544k(c17945a0);
    }

    /* renamed from: j */
    private final void m147037j(C17945a0 c17945a0) {
        C17996r0 c17996r0;
        if (c17945a0.m94941L6()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17996r0) {
                c17996r0 = (C17996r0) m94929K2;
            } else {
                c17996r0 = null;
            }
            if (c17996r0 != null) {
                this.f136565c.m47922k0(c17996r0.f91147B);
            }
        }
    }

    /* renamed from: l */
    private final boolean m147038l(String str, C17945a0 c17945a0) {
        C17945a0 c17945a02;
        Set m131538d;
        int i11 = 2;
        List m2604C = this.f136563a.m2604C(str, 2);
        boolean z11 = false;
        if (m2604C.isEmpty()) {
            return false;
        }
        C17945a0 c17945a03 = (C17945a0) m2604C.get(0);
        AbstractC19060k abstractC19060k = null;
        if (m2604C.size() == 2) {
            c17945a02 = (C17945a0) m2604C.get(1);
        } else {
            c17945a02 = null;
        }
        if (!AbstractC19074t.m100204b(c17945a0, c17945a03)) {
            return false;
        }
        if (c17945a02 == null) {
            this.f136567e.m101508a(new C28927g.b(str, z11, i11, abstractC19060k));
            if (AbstractC23089h6.m118442j(str)) {
                C0856z m2416b = C0856z.Companion.m2416b();
                m131538d = AbstractC25377w0.m131538d(str);
                m2416b.m2401k(m131538d);
            }
        } else {
            Conversation m103201R = AbstractC23306f.m120572D0().m103201R(str);
            if (m103201R != null) {
                C28931k m120612Q1 = AbstractC23306f.m120612Q1();
                AbstractC19074t.m100207e(m120612Q1, "provideUpdateLastMsgUseCase(...)");
                AbstractC19378b.m101499c(m120612Q1, new C28931k.b(m103201R, c17945a02, C28931k.d.Companion.m144586b()), null, 2, null);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        String str;
        List m131496e;
        AbstractC19074t.m100208f(bVar, "params");
        String m147041b = bVar.m147041b();
        C17945a0 m147040a = bVar.m147040a();
        if (AbstractC25495a.m132079d(m147041b)) {
            str = "2";
        } else {
            str = "1";
        }
        this.f136570h.m154666p(m147040a, false, str);
        try {
            m147040a.m95220oa(true);
            boolean m147038l = m147038l(m147041b, m147040a);
            if (m147040a.m95030V4() > 0) {
                C0833n0.f2934p.m2209i(m147040a);
            }
            m147033f(m147040a);
            m147032e(m147041b, m147040a);
            m147037j(m147040a);
            C3535c m2634q = this.f136563a.m2634q(m147041b);
            if (m2634q != null) {
                m2634q.mo17960Z(m147040a);
            }
            if (!m147040a.m95032V6()) {
                C0814e0.m2073s(m147040a.mo95039W2());
            }
            m147034g(m147040a);
            m147036i(m147040a);
            String mo95039W2 = m147040a.mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            m147031d(mo95039W2);
            if (m147038l) {
                C19669z.Companion.m103232a().m103198O0();
            }
            C23744a.Companion.m124119a().m124116d(9, new C20338d(m147040a.m95041W4(), m147040a, m147040a.m95029V3(), null, 8, null));
            C21216s c21216s = this.f136571i;
            m131496e = AbstractC25366r.m131496e(m147040a);
            c21216s.m109885k1(m131496e);
            C24559a.m127933c("[Message]", "DeleteMsgLocal messageID=" + m147040a.m95029V3());
        } catch (Exception e11) {
            AbstractC23350e.m122776f("DeleteMsgLocal", e11);
        }
    }
}

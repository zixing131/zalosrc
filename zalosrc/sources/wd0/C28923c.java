package wd0;

import ag0.AbstractC0837p0;
import ag0.C0810d;
import am.AbstractC0939u;
import androidx.work.AbstractC2144f;
import ch0.AbstractC3489d;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import d60.C17795d;
import dj.C17945a0;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import gw.C19610a;
import gw.C19637j;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import p019aj.C0872f;
import p019aj.C0876j;
import p185gc.AbstractC19383g;
import p263jc.C21216s;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p392oh.C24261h;
import p405ov.C24559a;
import p461qu.AbstractC25495a;
import p716zh.C32034n6;
import p716zh.C32044o1;
import p716zh.C32090r5;
import pm0.C24848g0;
import wd0.C28921a;
import wd0.C28927g;
import ws.C29210k;

/* renamed from: wd0.c */
/* loaded from: classes4.dex */
public final class C28923c extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0876j f133883a;

    /* renamed from: b */
    private final C0872f f133884b;

    /* renamed from: c */
    private final C19610a f133885c;

    /* renamed from: d */
    private final C24261h f133886d;

    /* renamed from: e */
    private final C8967m f133887e;

    /* renamed from: f */
    private final C32090r5 f133888f;

    /* renamed from: g */
    private final C32034n6 f133889g;

    /* renamed from: h */
    private final C28927g f133890h;

    /* renamed from: i */
    private final C29210k f133891i;

    /* renamed from: j */
    private final C21216s f133892j;

    /* renamed from: wd0.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: wd0.c$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f133893a;

        /* renamed from: b */
        private final String f133894b;

        /* renamed from: c */
        private final boolean f133895c;

        /* renamed from: d */
        private final boolean f133896d;

        /* renamed from: e */
        private final boolean f133897e;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            this(str, str2, false, false, false, 28, null);
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "entryPoint");
        }

        /* renamed from: a */
        public final boolean m144500a() {
            return this.f133897e;
        }

        /* renamed from: b */
        public final boolean m144501b() {
            return this.f133896d;
        }

        /* renamed from: c */
        public final String m144502c() {
            return this.f133893a;
        }

        /* renamed from: d */
        public final boolean m144503d() {
            return this.f133895c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f133893a, bVar.f133893a) && AbstractC19074t.m100204b(this.f133894b, bVar.f133894b) && this.f133895c == bVar.f133895c && this.f133896d == bVar.f133896d && this.f133897e == bVar.f133897e;
        }

        public int hashCode() {
            return (((((((this.f133893a.hashCode() * 31) + this.f133894b.hashCode()) * 31) + AbstractC2144f.m11520a(this.f133895c)) * 31) + AbstractC2144f.m11520a(this.f133896d)) * 31) + AbstractC2144f.m11520a(this.f133897e);
        }

        public String toString() {
            return "Params(ownerId=" + this.f133893a + ", entryPoint=" + this.f133894b + ", syncToPC=" + this.f133895c + ", limitPullGroupCloud=" + this.f133896d + ", deleteMediaOnly=" + this.f133897e + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, boolean z11, boolean z12) {
            this(str, str2, z11, z12, false, 16, null);
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "entryPoint");
        }

        public b(String str, String str2, boolean z11, boolean z12, boolean z13) {
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(str2, "entryPoint");
            this.f133893a = str;
            this.f133894b = str2;
            this.f133895c = z11;
            this.f133896d = z12;
            this.f133897e = z13;
        }

        public /* synthetic */ b(String str, String str2, boolean z11, boolean z12, boolean z13, int i11, AbstractC19060k abstractC19060k) {
            this(str, str2, (i11 & 4) != 0 ? true : z11, (i11 & 8) != 0 ? true : z12, (i11 & 16) != 0 ? false : z13);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wd0.c$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ String f133899r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(1);
            this.f133899r = str;
        }

        /* renamed from: a */
        public final void m144504a(List list) {
            AbstractC19074t.m100208f(list, "cleanedMediaMsg");
            C28923c.this.m144496l(this.f133899r, list);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m144504a((List) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: wd0.c$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f133900a;

        d(String str) {
            this.f133900a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.Companion.m41850e().m41843z0(this.f133900a);
        }
    }

    /* renamed from: wd0.c$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f133901a;

        e(String str) {
            this.f133901a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7960e.m41971c6().m42089D0(this.f133901a);
        }
    }

    public C28923c(C0876j c0876j, C0872f c0872f, C19610a c19610a, C24261h c24261h, C8967m c8967m, C32090r5 c32090r5, C32034n6 c32034n6, C28927g c28927g, C29210k c29210k, C21216s c21216s) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(c19610a, "deleteMessageManager");
        AbstractC19074t.m100208f(c24261h, "reactionMsgManager");
        AbstractC19074t.m100208f(c8967m, "liveLocationController");
        AbstractC19074t.m100208f(c32090r5, "messageDownloader");
        AbstractC19074t.m100208f(c32034n6, "fileCleaner");
        AbstractC19074t.m100208f(c28927g, "deleteTabMsgItemUseCase");
        AbstractC19074t.m100208f(c29210k, "pullMsgManager");
        AbstractC19074t.m100208f(c21216s, "autoDownloadMsgController");
        this.f133883a = c0876j;
        this.f133884b = c0872f;
        this.f133885c = c19610a;
        this.f133886d = c24261h;
        this.f133887e = c8967m;
        this.f133888f = c32090r5;
        this.f133889g = c32034n6;
        this.f133890h = c28927g;
        this.f133891i = c29210k;
        this.f133892j = c21216s;
    }

    /* renamed from: e */
    private final void m144489e(String str) {
        AbstractC23306f.m120569C0().m17793t(str);
    }

    /* renamed from: f */
    private final void m144490f(String str) {
        this.f133886d.m126648p(str);
        this.f133886d.m126649r(str);
        C24261h.m126624m(this.f133886d, str, 0L, 2, null);
    }

    /* renamed from: g */
    private final void m144491g(String str, boolean z11, InterfaceC18505l interfaceC18505l) {
        boolean z12;
        int i11 = 0;
        do {
            final C19059j0 c19059j0 = new C19059j0();
            List m144495k = m144495k(str, i11);
            c19059j0.f94941p = m144495k;
            if (m144495k.size() == 500) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!((List) c19059j0.f94941p).isEmpty()) {
                if (z11) {
                    Iterable iterable = (Iterable) c19059j0.f94941p;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : iterable) {
                        if (!((C17945a0) obj).m94872D8()) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (!((C17945a0) obj2).m94960N7()) {
                            arrayList2.add(obj2);
                        }
                    }
                    c19059j0.f94941p = arrayList2;
                }
                AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: wd0.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28923c.m144493i(C28923c.this, c19059j0);
                    }
                });
                if (interfaceC18505l != null) {
                    interfaceC18505l.mo205i9(c19059j0.f94941p);
                }
                i11 += ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
            } else {
                return;
            }
        } while (z12);
    }

    /* renamed from: h */
    static /* synthetic */ void m144492h(C28923c c28923c, String str, boolean z11, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            interfaceC18505l = null;
        }
        c28923c.m144491g(str, z11, interfaceC18505l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m144493i(C28923c c28923c, C19059j0 c19059j0) {
        AbstractC19074t.m100208f(c28923c, "this$0");
        AbstractC19074t.m100208f(c19059j0, "$mediaMsgToDelete");
        c28923c.f133889g.m154504h((List) c19059j0.f94941p);
        c28923c.f133892j.m109885k1((List) c19059j0.f94941p);
    }

    /* renamed from: j */
    private final void m144494j(String str) {
        C7956b.Companion.m41573b().m41543j(str);
    }

    /* renamed from: k */
    private final List m144495k(String str, int i11) {
        return C7956b.Companion.m41573b().m41561v(str, i11, ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public final void m144496l(String str, List list) {
        int i11;
        if (AbstractC3489d.m17501i()) {
            i11 = 4;
        } else {
            i11 = 8;
        }
        C0876j c0876j = this.f133883a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((C17945a0) obj).m95022U7()) {
                arrayList.add(obj);
            }
        }
        c0876j.m2620X(str, arrayList, i11);
        this.f133883a.m2621Z(str, list, "");
    }

    /* renamed from: m */
    private final void m144497m(String str) {
        if (AbstractC25495a.m132079d(str)) {
            C19637j.f97466a.m102854k(str);
            C23744a.Companion.m124119a().m124116d(59, new Object[0]);
        }
    }

    /* renamed from: o */
    private final void m144498o(String str) {
        C17945a0 m2603B = this.f133883a.m2603B(str);
        if (m2603B != null) {
            this.f133885c.m102640n(m2603B);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        boolean z11;
        C17945a0 m2603B;
        AbstractC19074t.m100208f(bVar, "params");
        String m144502c = bVar.m144502c();
        C24559a.m127933c("DeleteConversation", "Start delete conversation (" + bVar + ")");
        C17795d m120730z = AbstractC23306f.m120730z();
        AbstractC19074t.m100207e(m120730z, "provideChatPerfLogger(...)");
        String str = null;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        byte b14 = 0;
        int i11 = 2;
        C17795d.m93991l(m120730z, "DELETE_CONVERSATION", null, 2, null);
        try {
            try {
                z11 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("DeleteConversation", e11);
            }
            if (bVar.m144500a()) {
                m144491g(m144502c, true, new c(m144502c));
                C23744a.Companion.m124119a().m124116d(4, m144502c);
                return;
            }
            C23744a.Companion.m124119a().m124116d(92, m144502c);
            this.f133890h.m101508a(new C28927g.b(m144502c, z11, i11, b11 == true ? 1 : 0));
            m144490f(m144502c);
            this.f133887e.m47920j0(m144502c);
            if (this.f133888f.m154824o()) {
                this.f133888f.m154812b(m144502c);
            }
            if (bVar.m144503d()) {
                m144498o(m144502c);
            }
            if (bVar.m144501b() && ((AbstractC25495a.m132079d(m144502c) || AbstractC25495a.m132078c(m144502c)) && (m2603B = this.f133883a.m2603B(m144502c)) != null)) {
                this.f133891i.m145860a1(m144502c, m2603B.m95029V3());
            }
            this.f133891i.m145835H0(m144502c);
            this.f133883a.m2629l(m144502c);
            m144492h(this, m144502c, false, null, 4, null);
            m144494j(m144502c);
            this.f133884b.m2548m(m144502c);
            this.f133884b.m2551o(m144502c);
            m144497m(m144502c);
            m144489e(m144502c);
            C32044o1.Companion.m154639a().m154627k(m144502c);
            new C28921a().m101508a(new C28921a.b(m144502c));
            C0810d.m2053b(new d(m144502c));
            if (AbstractC25495a.m132079d(m144502c)) {
                C0810d.m2053b(new e(AbstractC25495a.m132088m(m144502c)));
            }
        } finally {
            C17795d m120730z2 = AbstractC23306f.m120730z();
            AbstractC19074t.m100207e(m120730z2, "provideChatPerfLogger(...)");
            C17795d.m93984d(m120730z2, "DELETE_CONVERSATION", null, 2, null);
        }
    }
}

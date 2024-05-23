package xd0;

import ag0.AbstractC0837p0;
import ag0.C0814e0;
import ag0.C0833n0;
import ag0.C0856z;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.data.entity.chat.conversation.FirstUnreadMsg;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7959d;
import dj.C17945a0;
import dj.C17969i0;
import dj.C17996r0;
import fj.C18961d;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import gw.AbstractC19656s0;
import gw.C19636i1;
import gw.C19669z;
import ho0.AbstractC20110a;
import i60.C20338d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import me0.AbstractC23089h6;
import p019aj.C0872f;
import p019aj.C0876j;
import p056cj.C3535c;
import p185gc.AbstractC19378b;
import p185gc.AbstractC19383g;
import p241ij.C20568e;
import p263jc.C21216s;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p392oh.C24261h;
import p405ov.C24559a;
import p461qu.AbstractC25495a;
import p577vj.C28266a;
import p716zh.C32034n6;
import p716zh.C32050o7;
import p716zh.C32090r5;
import qm0.AbstractC25377w0;
import vg.C28023b6;
import vg.C28081h4;
import wd0.C28927g;
import wd0.C28931k;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: xd0.d */
/* loaded from: classes4.dex */
public final class C29588d extends AbstractC19383g {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final C0876j f136542a;

    /* renamed from: b */
    private final C0872f f136543b;

    /* renamed from: c */
    private final C8967m f136544c;

    /* renamed from: d */
    private final C32034n6 f136545d;

    /* renamed from: e */
    private final C28927g f136546e;

    /* renamed from: f */
    private final C19636i1 f136547f;

    /* renamed from: g */
    private final C24261h f136548g;

    /* renamed from: h */
    private final C32050o7 f136549h;

    /* renamed from: i */
    private final C21216s f136550i;

    /* renamed from: j */
    private final C18961d f136551j;

    /* renamed from: xd0.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: xd0.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends Enum {

        /* renamed from: p */
        public static final b f136552p = new b("ONLY_ME", 0);

        /* renamed from: q */
        public static final b f136553q = new b("UNDO", 1);

        /* renamed from: r */
        public static final b f136554r = new b("DFE", 2);

        /* renamed from: s */
        public static final b f136555s = new b("TTL_EXPIRED", 3);

        /* renamed from: t */
        private static final /* synthetic */ b[] f136556t;

        /* renamed from: u */
        private static final /* synthetic */ InterfaceC30165a f136557u;

        static {
            b[] m147026b = m147026b();
            f136556t = m147026b;
            f136557u = AbstractC30166b.m148796a(m147026b);
        }

        private b(String str, int i11) {
            super(str, i11);
        }

        /* renamed from: b */
        private static final /* synthetic */ b[] m147026b() {
            return new b[]{f136552p, f136553q, f136554r, f136555s};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f136556t.clone();
        }
    }

    /* renamed from: xd0.d$c */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a */
        private final String f136558a;

        /* renamed from: b */
        private final List f136559b;

        /* renamed from: c */
        private final b f136560c;

        public c(String str, List list, b bVar) {
            AbstractC19074t.m100208f(str, "ownerId");
            AbstractC19074t.m100208f(list, "messages");
            AbstractC19074t.m100208f(bVar, "deleteEntry");
            this.f136558a = str;
            this.f136559b = list;
            this.f136560c = bVar;
        }

        /* renamed from: a */
        public final b m147027a() {
            return this.f136560c;
        }

        /* renamed from: b */
        public final List m147028b() {
            return this.f136559b;
        }

        /* renamed from: c */
        public final String m147029c() {
            return this.f136558a;
        }

        public /* synthetic */ c(String str, List list, b bVar, int i11, AbstractC19060k abstractC19060k) {
            this(str, list, (i11 & 4) != 0 ? b.f136552p : bVar);
        }
    }

    public C29588d(C0876j c0876j, C0872f c0872f, C8967m c8967m, C32034n6 c32034n6, C28927g c28927g, C19636i1 c19636i1, C24261h c24261h, C32050o7 c32050o7, C21216s c21216s, C18961d c18961d) {
        AbstractC19074t.m100208f(c0876j, "messageRepo");
        AbstractC19074t.m100208f(c0872f, "chatRepo");
        AbstractC19074t.m100208f(c8967m, "liveLocationController");
        AbstractC19074t.m100208f(c32034n6, "fileCleaner");
        AbstractC19074t.m100208f(c28927g, "deleteTabMsgItemUseCase");
        AbstractC19074t.m100208f(c19636i1, "unreadManager");
        AbstractC19074t.m100208f(c24261h, "reactionMsgManager");
        AbstractC19074t.m100208f(c32050o7, "newPhotoSuggestController");
        AbstractC19074t.m100208f(c21216s, "autoDownloadController");
        AbstractC19074t.m100208f(c18961d, "chatNotificationManager");
        this.f136542a = c0876j;
        this.f136543b = c0872f;
        this.f136544c = c8967m;
        this.f136545d = c32034n6;
        this.f136546e = c28927g;
        this.f136547f = c19636i1;
        this.f136548g = c24261h;
        this.f136549h = c32050o7;
        this.f136550i = c21216s;
        this.f136551j = c18961d;
    }

    /* renamed from: e */
    private final void m147017e(String str) {
        if (AbstractC21935u.m114515E(str)) {
            this.f136543b.m2551o(str);
            if (this.f136543b.m2529X(str)) {
                C7959d.Companion.m41850e().m41774b3(str, 2);
            }
            C23744a.Companion.m124119a().m124116d(6064, new Object[0]);
        }
    }

    /* renamed from: f */
    private final void m147018f(String str, List list) {
        this.f136548g.m126647n(str, list, false);
    }

    /* renamed from: g */
    private final void m147019g(C17945a0 c17945a0) {
        C19636i1 c19636i1 = this.f136547f;
        String mo95039W2 = c17945a0.mo95039W2();
        AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
        C28266a m102752J = c19636i1.m102752J(mo95039W2);
        if (m102752J != null && c17945a0.m95135f9(m102752J.m142383b())) {
            C24261h c24261h = this.f136548g;
            String mo95039W22 = c17945a0.mo95039W2();
            AbstractC19074t.m100207e(mo95039W22, "getOwnerId(...)");
            c24261h.m126646l(mo95039W22, m102752J.m142385d());
        }
    }

    /* renamed from: h */
    private final void m147020h(C17945a0 c17945a0, b bVar) {
        boolean z11;
        if (!c17945a0.m94906H5()) {
            return;
        }
        if ((bVar == b.f136553q || bVar == b.f136554r) && c17945a0.m95276v6() && !c17945a0.m95032V6()) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: xd0.c

            /* renamed from: q */
            public final /* synthetic */ C17945a0 f136540q;

            /* renamed from: r */
            public final /* synthetic */ boolean f136541r;

            public /* synthetic */ RunnableC29587c(C17945a0 c17945a02, boolean z112) {
                r2 = c17945a02;
                r3 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C29588d.m147021i(C29588d.this, r2, r3);
            }
        });
    }

    /* renamed from: i */
    public static final void m147021i(C29588d c29588d, C17945a0 c17945a0, boolean z11) {
        AbstractC19074t.m100208f(c29588d, "this$0");
        AbstractC19074t.m100208f(c17945a0, "$msgToDelete");
        c29588d.f136545d.m154503g(c17945a0, z11);
    }

    /* renamed from: j */
    private final void m147022j(C17945a0 c17945a0) {
        C17996r0 c17996r0;
        if (c17945a0.m94941L6()) {
            C17969i0 m94929K2 = c17945a0.m94929K2();
            if (m94929K2 instanceof C17996r0) {
                c17996r0 = (C17996r0) m94929K2;
            } else {
                c17996r0 = null;
            }
            if (c17996r0 != null) {
                this.f136544c.m47922k0(c17996r0.f91147B);
            }
        }
    }

    /* renamed from: l */
    public static final void m147023l(List list, boolean z11) {
        AbstractC19074t.m100208f(list, "$listMsgToDelete");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageId m95029V3 = ((C17945a0) it.next()).m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            AbstractC19656s0.m103057F(m95029V3, z11);
        }
    }

    /* renamed from: m */
    private final void m147024m(String str, MessageId messageId) {
        MessageId messageId2;
        Set m131538d;
        C17945a0 m2603B = this.f136542a.m2603B(str);
        if (m2603B != null) {
            messageId2 = m2603B.m95029V3();
        } else {
            messageId2 = null;
        }
        if (messageId2 == null) {
            this.f136546e.m101508a(new C28927g.b(str, false, 2, null));
            if (AbstractC23089h6.m118442j(str)) {
                C0856z m2416b = C0856z.Companion.m2416b();
                m131538d = AbstractC25377w0.m131538d(str);
                m2416b.m2401k(m131538d);
            }
        } else if (!AbstractC19074t.m100204b(messageId2, messageId)) {
            Conversation m103201R = AbstractC23306f.m120572D0().m103201R(str);
            if (m103201R != null) {
                C28931k m120612Q1 = AbstractC23306f.m120612Q1();
                AbstractC19074t.m100207e(m120612Q1, "provideUpdateLastMsgUseCase(...)");
                AbstractC19378b.m101499c(m120612Q1, new C28931k.b(m103201R, m2603B, C28931k.d.Companion.m144586b()), null, 2, null);
            }
        } else {
            return;
        }
        C19669z.Companion.m103232a().m103198O0();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:78|(6:79|80|(1:82)(1:150)|83|84|(2:143|144))|(3:123|124|(4:126|(2:130|131)|132|(1:(1:135)(17:136|137|138|88|89|90|(3:111|112|(1:114))|92|93|94|95|96|97|98|99|100|101))))|87|88|89|90|(0)|92|93|94|95|96|97|98|99|100|101|76) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x024f, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0250, code lost:            r4 = r17;     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0252, code lost:            r2 = r18;     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0255, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0258, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0259, code lost:            r19 = r9;        r20 = r10;        r24 = r11;        r21 = r14;     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0294 A[Catch: Exception -> 0x0044, TryCatch #10 {Exception -> 0x0044, blocks: (B:3:0x0009, B:6:0x0021, B:13:0x0030, B:15:0x003c, B:16:0x0047, B:18:0x005b, B:23:0x0063, B:24:0x006a, B:26:0x0070, B:56:0x0101, B:66:0x010f, B:67:0x0117, B:70:0x0123, B:71:0x012a, B:73:0x0130, B:75:0x0141, B:76:0x014e, B:78:0x0154, B:106:0x027b, B:155:0x028a, B:157:0x0294, B:159:0x029b, B:160:0x029e), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x029b A[Catch: Exception -> 0x0044, TryCatch #10 {Exception -> 0x0044, blocks: (B:3:0x0009, B:6:0x0021, B:13:0x0030, B:15:0x003c, B:16:0x0047, B:18:0x005b, B:23:0x0063, B:24:0x006a, B:26:0x0070, B:56:0x0101, B:66:0x010f, B:67:0x0117, B:70:0x0123, B:71:0x012a, B:73:0x0130, B:75:0x0141, B:76:0x014e, B:78:0x0154, B:106:0x027b, B:155:0x028a, B:157:0x0294, B:159:0x029b, B:160:0x029e), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[Catch: Exception -> 0x0044, TryCatch #10 {Exception -> 0x0044, blocks: (B:3:0x0009, B:6:0x0021, B:13:0x0030, B:15:0x003c, B:16:0x0047, B:18:0x005b, B:23:0x0063, B:24:0x006a, B:26:0x0070, B:56:0x0101, B:66:0x010f, B:67:0x0117, B:70:0x0123, B:71:0x012a, B:73:0x0130, B:75:0x0141, B:76:0x014e, B:78:0x0154, B:106:0x027b, B:155:0x028a, B:157:0x0294, B:159:0x029b, B:160:0x029e), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #10 {Exception -> 0x0044, blocks: (B:3:0x0009, B:6:0x0021, B:13:0x0030, B:15:0x003c, B:16:0x0047, B:18:0x005b, B:23:0x0063, B:24:0x006a, B:26:0x0070, B:56:0x0101, B:66:0x010f, B:67:0x0117, B:70:0x0123, B:71:0x012a, B:73:0x0130, B:75:0x0141, B:76:0x014e, B:78:0x0154, B:106:0x027b, B:155:0x028a, B:157:0x0294, B:159:0x029b, B:160:0x029e), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010f A[Catch: Exception -> 0x0044, TryCatch #10 {Exception -> 0x0044, blocks: (B:3:0x0009, B:6:0x0021, B:13:0x0030, B:15:0x003c, B:16:0x0047, B:18:0x005b, B:23:0x0063, B:24:0x006a, B:26:0x0070, B:56:0x0101, B:66:0x010f, B:67:0x0117, B:70:0x0123, B:71:0x012a, B:73:0x0130, B:75:0x0141, B:76:0x014e, B:78:0x0154, B:106:0x027b, B:155:0x028a, B:157:0x0294, B:159:0x029b, B:160:0x029e), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123 A[Catch: Exception -> 0x0044, TRY_ENTER, TryCatch #10 {Exception -> 0x0044, blocks: (B:3:0x0009, B:6:0x0021, B:13:0x0030, B:15:0x003c, B:16:0x0047, B:18:0x005b, B:23:0x0063, B:24:0x006a, B:26:0x0070, B:56:0x0101, B:66:0x010f, B:67:0x0117, B:70:0x0123, B:71:0x012a, B:73:0x0130, B:75:0x0141, B:76:0x014e, B:78:0x0154, B:106:0x027b, B:155:0x028a, B:157:0x0294, B:159:0x029b, B:160:0x029e), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0154 A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #10 {Exception -> 0x0044, blocks: (B:3:0x0009, B:6:0x0021, B:13:0x0030, B:15:0x003c, B:16:0x0047, B:18:0x005b, B:23:0x0063, B:24:0x006a, B:26:0x0070, B:56:0x0101, B:66:0x010f, B:67:0x0117, B:70:0x0123, B:71:0x012a, B:73:0x0130, B:75:0x0141, B:76:0x014e, B:78:0x0154, B:106:0x027b, B:155:0x028a, B:157:0x0294, B:159:0x029b, B:160:0x029e), top: B:2:0x0009 }] */
    @Override // p185gc.AbstractC19383g
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo12006b(c cVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        C19669z.b bVar;
        C17945a0 m2603B;
        MessageId m95029V3;
        boolean z14;
        ArrayList arrayList;
        boolean z15;
        boolean z16;
        ArrayList arrayList2;
        b bVar2;
        boolean z17;
        C17945a0 m102749H;
        String str;
        String str2;
        AbstractC19074t.m100208f(cVar, "params");
        try {
            String m147029c = cVar.m147029c();
            boolean m132079d = AbstractC25495a.m132079d(m147029c);
            List<C17945a0> m147028b = cVar.m147028b();
            b m147027a = cVar.m147027a();
            boolean z18 = true;
            if (m147027a == b.f136553q) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (m147027a == b.f136554r) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z11 && !z12) {
                z13 = false;
                bVar = C19669z.Companion;
                if (bVar.m103232a().m103228r0(m147029c)) {
                    bVar.m103232a().m103229t0();
                }
                FirstUnreadMsg m102791v = this.f136547f.m102791v(m147029c);
                C3535c m2634q = this.f136542a.m2634q(m147029c);
                m2603B = this.f136542a.m2603B(m147029c);
                if (m2603B != null && (m95029V3 = m2603B.m95029V3()) != null) {
                    for (C17945a0 c17945a0 : m147028b) {
                        try {
                            C32050o7 c32050o7 = this.f136549h;
                            if (m132079d) {
                                str2 = "2";
                            } else {
                                str2 = "1";
                            }
                            c32050o7.m154666p(c17945a0, z11, str2);
                            c17945a0.m95220oa(z18);
                            C0814e0.m2069o(c17945a0);
                            c17945a0.m94928K1();
                            c17945a0.m95077Zb();
                            m147022j(c17945a0);
                            if (AbstractC25495a.m132079d(c17945a0.mo95039W2()) && c17945a0.m95032V6() && c17945a0.m95029V3().m41052p()) {
                                str = m147029c;
                                try {
                                    C28081h4.m141541d().m141547h(c17945a0.m95029V3().m41045i(), false);
                                } catch (Exception e11) {
                                    e = e11;
                                    AbstractC20110a.f98889a.mo104552e(e);
                                    m147029c = str;
                                    z18 = true;
                                }
                            } else {
                                str = m147029c;
                            }
                            if (C32090r5.m154810i().m154824o()) {
                                C32090r5.m154810i().m154825p(c17945a0.m95029V3(), c17945a0.mo95039W2());
                            }
                            if (c17945a0.m95030V4() > 0) {
                                C0833n0.f2934p.m2209i(c17945a0);
                            }
                            if (m2634q != null) {
                                m2634q.mo17960Z(c17945a0);
                            }
                            C7956b.Companion.m41573b().m41544k(c17945a0);
                        } catch (Exception e12) {
                            e = e12;
                            str = m147029c;
                        }
                        m147029c = str;
                        z18 = true;
                    }
                    String str3 = m147029c;
                    if (z13) {
                        AbstractC19444a.m101697e(new Runnable() { // from class: xd0.b

                            /* renamed from: p */
                            public final /* synthetic */ List f136537p;

                            /* renamed from: q */
                            public final /* synthetic */ boolean f136538q;

                            public /* synthetic */ RunnableC29586b(List m147028b2, boolean z122) {
                                r1 = m147028b2;
                                r2 = z122;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                C29588d.m147023l(r1, r2);
                            }
                        });
                    }
                    m147024m(str3, m95029V3);
                    m147017e(str3);
                    if (z13) {
                        Iterator it = m147028b2.iterator();
                        while (it.hasNext()) {
                            MessageId m95029V32 = ((C17945a0) it.next()).m95029V3();
                            AbstractC19074t.m100207e(m95029V32, "getMessageId(...)");
                            AbstractC19656s0.m103056E(m95029V32, z122);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    z14 = false;
                    for (C17945a0 c17945a02 : m147028b2) {
                        try {
                            if (!c17945a02.m95032V6()) {
                                z17 = true;
                            } else {
                                z17 = z14;
                            }
                            try {
                                if (c17945a02.m94877E3()) {
                                    try {
                                        m147019g(c17945a02);
                                        MessageId m95029V33 = c17945a02.m95029V3();
                                        AbstractC19074t.m100207e(m95029V33, "getMessageId(...)");
                                        arrayList3.add(m95029V33);
                                    } catch (Exception e13) {
                                        e = e13;
                                        z15 = z122;
                                        z16 = z11;
                                        arrayList2 = arrayList3;
                                        bVar2 = m147027a;
                                        z14 = z17;
                                        AbstractC20110a.f98889a.mo104552e(e);
                                        z122 = z15;
                                        z11 = z16;
                                        m147027a = bVar2;
                                        arrayList3 = arrayList2;
                                    }
                                }
                            } catch (Exception e14) {
                                e = e14;
                                z15 = z122;
                                z16 = z11;
                                arrayList2 = arrayList3;
                                bVar2 = m147027a;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            z15 = z122;
                            z16 = z11;
                            arrayList2 = arrayList3;
                            bVar2 = m147027a;
                        }
                        if (m102791v != null) {
                            try {
                            } catch (Exception e16) {
                                e = e16;
                                z15 = z122;
                                z16 = z11;
                                arrayList2 = arrayList3;
                                bVar2 = m147027a;
                                z14 = z17;
                                AbstractC20110a.f98889a.mo104552e(e);
                                z122 = z15;
                                z11 = z16;
                                m147027a = bVar2;
                                arrayList3 = arrayList2;
                            }
                            if (m102791v.m41023b() <= c17945a02.m94974P4()) {
                                int m102746E = this.f136547f.m102746E(str3);
                                if (m102746E > 0 && (m102746E = this.f136547f.m102788t(str3)) == 0) {
                                    this.f136547f.m102772j0(str3);
                                    m102791v = null;
                                }
                                if (m147027a != b.f136552p) {
                                    if (m102746E > 0) {
                                        this.f136551j.m99493j(c17945a02, c17945a02.m95042W5(), false);
                                    } else {
                                        C28023b6.m141250h0().m141367o(str3, true);
                                        FirstUnreadMsg firstUnreadMsg = m102791v;
                                        m102749H = this.f136547f.m102749H(str3);
                                        if (m102749H != null) {
                                            try {
                                                if (m102749H.m95135f9(c17945a02.m95029V3())) {
                                                    this.f136547f.m102780o0(str3);
                                                }
                                            } catch (Exception e17) {
                                                e = e17;
                                                z15 = z122;
                                                z16 = z11;
                                                arrayList2 = arrayList3;
                                                bVar2 = m147027a;
                                                m102791v = firstUnreadMsg;
                                                z14 = z17;
                                                AbstractC20110a.f98889a.mo104552e(e);
                                                z122 = z15;
                                                z11 = z16;
                                                m147027a = bVar2;
                                                arrayList3 = arrayList2;
                                            }
                                        }
                                        m147020h(c17945a02, m147027a);
                                        MessageId m95029V34 = c17945a02.m95029V3();
                                        AbstractC19074t.m100207e(m95029V34, "getMessageId(...)");
                                        z15 = z122;
                                        z16 = z11;
                                        arrayList2 = arrayList3;
                                        bVar2 = m147027a;
                                        C20568e c20568e = new C20568e(m95029V34, str3, c17945a02.m95041W4(), z11, z122, false, null, 64, null);
                                        AbstractC23304d.f113413n.add(c20568e);
                                        C20338d c20338d = new C20338d(c17945a02.m95041W4(), c17945a02, c17945a02.m95029V3(), c20568e);
                                        C23744a m124119a = C23744a.Companion.m124119a();
                                        Object[] objArr = new Object[1];
                                        objArr[0] = c20338d;
                                        m124119a.m124116d(9, objArr);
                                        m102791v = firstUnreadMsg;
                                        z14 = z17;
                                        z122 = z15;
                                        z11 = z16;
                                        m147027a = bVar2;
                                        arrayList3 = arrayList2;
                                    }
                                }
                            }
                        }
                        FirstUnreadMsg firstUnreadMsg2 = m102791v;
                        m102749H = this.f136547f.m102749H(str3);
                        if (m102749H != null) {
                        }
                        m147020h(c17945a02, m147027a);
                        MessageId m95029V342 = c17945a02.m95029V3();
                        AbstractC19074t.m100207e(m95029V342, "getMessageId(...)");
                        z15 = z122;
                        z16 = z11;
                        arrayList2 = arrayList3;
                        bVar2 = m147027a;
                        C20568e c20568e2 = new C20568e(m95029V342, str3, c17945a02.m95041W4(), z11, z122, false, null, 64, null);
                        AbstractC23304d.f113413n.add(c20568e2);
                        C20338d c20338d2 = new C20338d(c17945a02.m95041W4(), c17945a02, c17945a02.m95029V3(), c20568e2);
                        C23744a m124119a2 = C23744a.Companion.m124119a();
                        Object[] objArr2 = new Object[1];
                        objArr2[0] = c20338d2;
                        m124119a2.m124116d(9, objArr2);
                        m102791v = firstUnreadMsg2;
                        z14 = z17;
                        z122 = z15;
                        z11 = z16;
                        m147027a = bVar2;
                        arrayList3 = arrayList2;
                    }
                    arrayList = arrayList3;
                    if (!arrayList.isEmpty()) {
                        m147018f(str3, arrayList);
                    }
                    if (z14) {
                        C0814e0.m2073s(str3);
                    }
                    this.f136550i.m109885k1(m147028b2);
                    C24559a.m127933c("[Message]", "DeleteLocalMessagesOfSameThread messages size=" + m147028b2.size());
                }
                return;
            }
            z13 = true;
            bVar = C19669z.Companion;
            if (bVar.m103232a().m103228r0(m147029c)) {
            }
            FirstUnreadMsg m102791v2 = this.f136547f.m102791v(m147029c);
            C3535c m2634q2 = this.f136542a.m2634q(m147029c);
            m2603B = this.f136542a.m2603B(m147029c);
            if (m2603B != null) {
                while (r7.hasNext()) {
                }
                String str32 = m147029c;
                if (z13) {
                }
                m147024m(str32, m95029V3);
                m147017e(str32);
                if (z13) {
                }
                ArrayList arrayList32 = new ArrayList();
                z14 = false;
                while (r16.hasNext()) {
                }
                arrayList = arrayList32;
                if (!arrayList.isEmpty()) {
                }
                if (z14) {
                }
                this.f136550i.m109885k1(m147028b2);
                C24559a.m127933c("[Message]", "DeleteLocalMessagesOfSameThread messages size=" + m147028b2.size());
            }
        } catch (Exception e18) {
            AbstractC20110a.f98889a.mo104552e(e18);
        }
    }
}

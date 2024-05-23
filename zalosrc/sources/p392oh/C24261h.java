package p392oh;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0804b;
import ag0.C0824j;
import ag0.C0827k0;
import ag0.InterfaceC0806b1;
import am.AbstractC0939u;
import am.C0927o;
import am.C0943w;
import bg0.C2797c;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.p062db.C7956b;
import com.zing.zalo.p062db.C7958c;
import com.zing.zalo.p062db.C7959d;
import com.zing.zalo.p077ui.chat.C11318b;
import com.zing.zalocore.CoreUtility;
import dj.C17945a0;
import eg0.AbstractC18428c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import fn0.C19067n0;
import gg0.AbstractC19444a;
import gm.C19498i;
import gw.C19636i1;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import i60.C20350p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me0.AbstractC23008a2;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.AbstractC23165o5;
import mg.C23288a;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import org.json.JSONObject;
import p173fz.C19172a;
import p248iy.AbstractC20887g;
import p304ks.C21927m;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p392oh.C24265l;
import p461qu.AbstractC25495a;
import p577vj.C28266a;
import p588vw.C28652r;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p667y2.C30268e;
import p716zh.C31973j5;
import ph.C24751d;
import ph.C24753f;
import ph.C24756i;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import qm0.AbstractC25370t;
import tg.C26664o;
import vg.C28023b6;
import vg.C28203u6;

/* renamed from: oh.h */
/* loaded from: classes3.dex */
public final class C24261h {
    public static final b Companion = new b(null);

    /* renamed from: e */
    private static final InterfaceC29232g f117184e = AbstractC29233h.m145990a(a.f117189q);

    /* renamed from: a */
    private final C2797c f117185a;

    /* renamed from: b */
    private final Map f117186b;

    /* renamed from: c */
    private final Map f117187c;

    /* renamed from: d */
    private final InterfaceC24854k f117188d;

    /* renamed from: oh.h$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f117189q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C24261h mo12V4() {
            return new C24261h(null);
        }
    }

    /* renamed from: oh.h$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ void m126654d(b bVar, int i11, long j11, long j12, int i12, boolean z11, int i13, Object obj) {
            int i14;
            boolean z12;
            if ((i13 & 8) != 0) {
                i14 = 1;
            } else {
                i14 = i12;
            }
            if ((i13 & 16) != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            bVar.m126657c(i11, j11, j12, i14, z12);
        }

        /* renamed from: a */
        public final boolean m126655a() {
            return m126656b().m126629u();
        }

        /* renamed from: b */
        public final C24261h m126656b() {
            return (C24261h) C24261h.f117184e.getValue();
        }

        /* renamed from: c */
        public final void m126657c(int i11, long j11, long j12, int i12, boolean z11) {
            String str;
            if (i12 > 1) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("total", i12);
                str = jSONObject.toString();
                AbstractC19074t.m100207e(str, "toString(...)");
            } else {
                str = "";
            }
            long j13 = j12 - j11;
            AbstractC20887g.m109221H(false, z11, 0, i11, 0, j13, str, j11, j12);
            AbstractC20110a.f98889a.mo104554k("ReactionLogQoS cmd=" + i11 + " iSuccess = " + z11 + " timeExecute=" + j13 + " " + str, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oh.h$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f117190q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Boolean mo12V4() {
            boolean z11 = false;
            if (C19172a.m100600k("features@reaction_config@enable_qos_log", 0) > 0) {
                z11 = true;
            }
            return Boolean.valueOf(z11);
        }
    }

    /* renamed from: oh.h$d */
    /* loaded from: classes3.dex */
    public static final class d implements InterfaceC20094a {
        d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
        }
    }

    /* renamed from: oh.h$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC20094a {
        e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
        }
    }

    /* renamed from: oh.h$f */
    /* loaded from: classes3.dex */
    public static final class f extends C2797c {
        f(InterfaceC0806b1 interfaceC0806b1) {
            super(interfaceC0806b1);
        }

        @Override // bg0.C2797c
        /* renamed from: i */
        public void mo12810i(Exception exc) {
            AbstractC19074t.m100208f(exc, C30268e.f140632a);
            AbstractC23350e.m122776f("ReactionMessageManager", exc);
        }
    }

    /* renamed from: oh.h$g */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ String f117191a;

        g(String str) {
            this.f117191a = str;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            C7959d.Companion.m41850e().m41777c3(this.f117191a);
        }
    }

    public /* synthetic */ C24261h(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: D */
    private final void m126606D(List list, String str, boolean z11, boolean z12) {
        if (list.isEmpty()) {
            return;
        }
        this.f117185a.mo13474a(new Runnable() { // from class: oh.e

            /* renamed from: p */
            public final /* synthetic */ List f117176p;

            /* renamed from: q */
            public final /* synthetic */ String f117177q;

            /* renamed from: r */
            public final /* synthetic */ boolean f117178r;

            /* renamed from: s */
            public final /* synthetic */ C24261h f117179s;

            /* renamed from: t */
            public final /* synthetic */ boolean f117180t;

            public /* synthetic */ RunnableC24258e(List list2, String str2, boolean z122, C24261h this, boolean z112) {
                r1 = list2;
                r2 = str2;
                r3 = z122;
                r4 = this;
                r5 = z112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24261h.m126607E(r1, r2, r3, r4, r5);
            }
        });
    }

    /* renamed from: E */
    public static final void m126607E(List list, String str, boolean z11, C24261h c24261h, boolean z12) {
        int m131511r;
        int i11;
        AbstractC19074t.m100208f(list, "$messageList");
        AbstractC19074t.m100208f(str, "$threadId");
        AbstractC19074t.m100208f(c24261h, "this$0");
        long currentTimeMillis = System.currentTimeMillis();
        List<C17945a0> list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((C17945a0) it.next()).m95029V3());
        }
        List<C24751d> m41586j = C7958c.Companion.m41593b().m41586j(str, arrayList, z11);
        C19498i c19498i = new C19498i();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C17945a0 c17945a0 : list2) {
            MessageId m95029V3 = c17945a0.m95029V3();
            AbstractC19074t.m100207e(m95029V3, "getMessageId(...)");
            hashMap.put(c24261h.m126627s(m95029V3), c17945a0);
        }
        for (C24751d c24751d : m41586j) {
            MessageId m128568l = c24751d.m128568l();
            arrayList2.add(m128568l);
            c24261h.m126644j(c24751d);
            C17945a0 c17945a02 = (C17945a0) hashMap.get(c24261h.m126627s(m128568l));
            if (c17945a02 != null) {
                if (c17945a02.m95189l8()) {
                    c17945a02 = AbstractC23306f.m120584H0().m2636s(m128568l);
                }
                if (c17945a02 != null) {
                    c17945a02.m95111d9();
                }
            }
            if (z12) {
                c19498i.m101942a(AbstractC23008a2.m117946o(m128568l));
            }
        }
        if (c19498i.m101944c() > 0) {
            AbstractC18428c.m97659b(C23288a.f113033a, str, 0, new Runnable() { // from class: oh.f

                /* renamed from: p */
                public final /* synthetic */ String f117181p;

                /* renamed from: q */
                public final /* synthetic */ C19498i f117182q;

                public /* synthetic */ RunnableC24259f(String str2, C19498i c19498i2) {
                    r1 = str2;
                    r2 = c19498i2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C24261h.m126608F(r1, r2);
                }
            }, 2, null);
        }
        C23744a.Companion.m124119a().m124116d(48, new C20350p(str2, arrayList2, null, false, false, 28, null));
        if (C24265l.Companion.m126709b().m126699o().m128550h()) {
            long currentTimeMillis2 = System.currentTimeMillis();
            if (z11) {
                i11 = 230406009;
            } else {
                i11 = 230406008;
            }
            b bVar = Companion;
            b.m126654d(bVar, i11, currentTimeMillis, currentTimeMillis2, arrayList.size(), false, 16, null);
            if (z11 && (!m41586j.isEmpty())) {
                b.m126654d(bVar, 230406010, currentTimeMillis, currentTimeMillis2, arrayList.size(), false, 16, null);
            }
        }
    }

    /* renamed from: F */
    public static final void m126608F(String str, C19498i c19498i) {
        AbstractC19074t.m100208f(str, "$threadId");
        AbstractC19074t.m100208f(c19498i, "$msgIdListNeedUpdateDb");
        C7956b.Companion.m41573b().m41567y0(AbstractC25495a.m132090o(str), AbstractC25495a.m132079d(str), true, c19498i);
    }

    /* renamed from: H */
    private final void m126609H(MessageId messageId) {
        this.f117186b.remove(m126627s(messageId));
    }

    /* renamed from: I */
    private final C28266a m126610I(String str) {
        C28266a m102782p0 = AbstractC23306f.m120606O1().m102782p0(str);
        if (m102782p0 != null) {
            C23744a.Companion.m124119a().m124116d(108, str);
            return m102782p0;
        }
        return null;
    }

    /* renamed from: P */
    public static final void m126611P(List list, C24261h c24261h, String str, int i11, String str2) {
        boolean z11;
        AbstractC19074t.m100208f(list, "$messageIdList");
        AbstractC19074t.m100208f(c24261h, "this$0");
        AbstractC19074t.m100208f(str, "$ownerId");
        AbstractC19074t.m100208f(str2, "$icon");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageId messageId = (MessageId) it.next();
            C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
            C24751d m126650x = c24261h.m126650x(messageId);
            if (m126650x == null) {
                m126650x = c24261h.m126632A(str, messageId);
            }
            if (m126650x != null) {
                m126650x.m128577u(C24753f.Companion.m128619f(i11, str2));
                c24261h.m126644j(m126650x);
                if (m2635r != null && C24265l.Companion.m126709b().m126699o().m128551i()) {
                    if (m2635r.m94877E3() != m126650x.m128575s()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m2635r.m94873Da(m126650x.m128575s());
                } else {
                    z11 = false;
                }
                m126650x.m128578w();
            } else {
                z11 = false;
            }
            if (m2635r != null) {
                m2635r.m95111d9();
                if (z11) {
                    C7956b.Companion.m41573b().m41558s0(str, messageId, m2635r.m94877E3());
                }
            }
            C23744a.Companion.m124119a().m124116d(47, new C20350p(str, list, null, false, false, 28, null));
        }
    }

    /* renamed from: S */
    public static final void m126612S(List list, C24261h c24261h, String str, int i11, C24753f c24753f, boolean z11) {
        AbstractC19074t.m100208f(list, "$messageIdList");
        AbstractC19074t.m100208f(c24261h, "this$0");
        AbstractC19074t.m100208f(str, "$ownerId");
        AbstractC19074t.m100208f(c24753f, "$reactionType");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageId messageId = (MessageId) it.next();
            C24751d m126632A = c24261h.m126632A(str, messageId);
            if (m126632A == null) {
                m126632A = new C24751d(messageId, new ArrayList());
                c24261h.m126644j(m126632A);
            }
            m126632A.m128576t(i11, c24753f);
            C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
            if (m2635r != null) {
                if (m2635r.m94877E3() != m126632A.m128575s() && C24265l.Companion.m126709b().m126699o().m128551i()) {
                    m2635r.m94873Da(m126632A.m128575s());
                    C7956b.Companion.m41573b().m41558s0(str, messageId, m2635r.m94877E3());
                }
                m2635r.m95111d9();
            }
            C24751d m128579x = m126632A.m128579x();
            if (m128579x.m128571o() > 0) {
                arrayList.add(m128579x);
            }
            C24751d m128580y = m126632A.m128580y();
            if (m128580y.m128571o() > 0) {
                arrayList2.add(m128580y);
            }
        }
        if (!arrayList.isEmpty()) {
            c24261h.m126652z(C7958c.Companion.m41593b().m41588n(arrayList), true);
        }
        if (!arrayList2.isEmpty()) {
            c24261h.m126652z(C7958c.Companion.m41593b().m41590q(str, arrayList2), false);
        }
        AbstractC19444a.m101697e(new Runnable() { // from class: oh.g
            public /* synthetic */ RunnableC24260g() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                C24261h.m126613T(C20350p.this);
            }
        });
    }

    /* renamed from: T */
    public static final void m126613T(C20350p c20350p) {
        AbstractC19074t.m100208f(c20350p, "$reactionEvent");
        C23744a.Companion.m124119a().m124116d(47, c20350p);
    }

    /* renamed from: U */
    private final void m126614U(String str, C28266a c28266a, boolean z11) {
        C19636i1.Companion.m102800a().m102770g0(str, c28266a);
        if (z11) {
            C0824j.m2153b(new g(str));
        }
    }

    /* renamed from: m */
    public static /* synthetic */ void m126624m(C24261h c24261h, String str, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        c24261h.m126646l(str, j11);
    }

    /* renamed from: o */
    public static final void m126625o(boolean z11, List list, String str, C24261h c24261h) {
        AbstractC19074t.m100208f(list, "$messageIdList");
        AbstractC19074t.m100208f(str, "$ownerId");
        AbstractC19074t.m100208f(c24261h, "this$0");
        int i11 = 1;
        if (z11) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MessageId messageId = (MessageId) it.next();
                C17945a0 m2635r = AbstractC23306f.m120584H0().m2635r(messageId);
                if (m2635r != null) {
                    boolean m94877E3 = m2635r.m94877E3();
                    m2635r.m94873Da(false);
                    m2635r.m95111d9();
                    if (m94877E3 && C24265l.Companion.m126709b().m126699o().m128551i()) {
                        C7956b.Companion.m41573b().m41558s0(str, messageId, m2635r.m94877E3());
                        C23744a m124119a = C23744a.Companion.m124119a();
                        Object[] objArr = new Object[i11];
                        objArr[0] = new C20350p(str, list, null, false, false, 28, null);
                        m124119a.m124116d(47, objArr);
                    }
                }
                c24261h.m126609H(messageId);
                i11 = 1;
            }
        }
        if (!list.isEmpty()) {
            C7958c.Companion.m41593b().m41582f(str, list);
        }
    }

    /* renamed from: q */
    public static final void m126626q(String str) {
        AbstractC19074t.m100208f(str, "$ownerId");
        C7958c.Companion.m41593b().m41583g(str);
    }

    /* renamed from: s */
    private final String m126627s(MessageId messageId) {
        return messageId.m41048l() + "_" + messageId.m41044h();
    }

    /* renamed from: t */
    private final String m126628t(long j11, String str, int i11, String str2, C17945a0 c17945a0, boolean z11, ContactProfile contactProfile) {
        String str3;
        String m118743r0;
        String str4;
        String format;
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, String.valueOf(j11), null, 2, null);
        if (m141798e != null) {
            str3 = m141798e.m40383Q(true, false);
            AbstractC19074t.m100207e(str3, "getDpnPhoneContact(...)");
        } else {
            str3 = "";
        }
        if (str3.length() == 0) {
            str3 = str;
        }
        if (z11) {
            if (c17945a0.m94871D7()) {
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_reaction_content_photo);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                format = String.format(m118743r02, Arrays.copyOf(new Object[]{str3}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
            } else if (c17945a0.m95306y8()) {
                C19067n0 c19067n02 = C19067n0.f94947a;
                String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_reaction_content_video);
                AbstractC19074t.m100207e(m118743r03, "getString(...)");
                format = String.format(m118743r03, Arrays.copyOf(new Object[]{str3}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
            } else if (c17945a0.m95276v6()) {
                C19067n0 c19067n03 = C19067n0.f94947a;
                String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_reaction_content_file);
                AbstractC19074t.m100207e(m118743r04, "getString(...)");
                format = String.format(m118743r04, Arrays.copyOf(new Object[]{str3}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
            } else if (c17945a0.m95314z6()) {
                C19067n0 c19067n04 = C19067n0.f94947a;
                String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_reaction_content_gif);
                AbstractC19074t.m100207e(m118743r05, "getString(...)");
                format = String.format(m118743r05, Arrays.copyOf(new Object[]{str3}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
            } else if (c17945a0.m94977P7()) {
                C19067n0 c19067n05 = C19067n0.f94947a;
                String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_reaction_content_link);
                AbstractC19074t.m100207e(m118743r06, "getString(...)");
                format = String.format(m118743r06, Arrays.copyOf(new Object[]{str3}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
            } else if (c17945a0.m95120e6()) {
                C19067n0 c19067n06 = C19067n0.f94947a;
                String m118743r07 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_reaction_content_doodle);
                AbstractC19074t.m100207e(m118743r07, "getString(...)");
                format = String.format(m118743r07, Arrays.copyOf(new Object[]{str3}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
            } else {
                C19067n0 c19067n07 = C19067n0.f94947a;
                String m118743r08 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_reaction_content);
                AbstractC19074t.m100207e(m118743r08, "getString(...)");
                format = String.format(m118743r08, Arrays.copyOf(new Object[]{str3}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
            }
            m118743r0 = format;
            if (!contactProfile.m40374K0()) {
                m118743r0 = AbstractC24341v.m127114D(m118743r0, ((Object) str3) + " ", "", false, 4, null);
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_reaction_content_no_preview);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
        }
        if (i11 != 0) {
            if (i11 != 20) {
                if (i11 != 32) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (!C28652r.m143349v().m143379s().contains(str2) && C28652r.m143346i(str2)) {
                                str4 = str2;
                            } else {
                                str4 = "❤";
                            }
                        } else {
                            str4 = "👍";
                        }
                    } else {
                        str4 = "😭";
                    }
                } else {
                    str4 = "😮";
                }
            } else {
                str4 = "😡";
            }
        } else {
            str4 = "😆";
        }
        C19067n0 c19067n08 = C19067n0.f94947a;
        String format2 = String.format("%s - %s", Arrays.copyOf(new Object[]{str4, m118743r0}, 2));
        AbstractC19074t.m100207e(format2, "format(...)");
        return format2;
    }

    /* renamed from: u */
    public final boolean m126629u() {
        return ((Boolean) this.f117188d.getValue()).booleanValue();
    }

    /* renamed from: v */
    public static final C24261h m126630v() {
        return Companion.m126656b();
    }

    /* renamed from: w */
    private final long m126631w(String str) {
        C28266a m102752J = AbstractC23306f.m120606O1().m102752J(str);
        if (m102752J != null) {
            return m102752J.m142385d();
        }
        return 0L;
    }

    /* renamed from: A */
    public final C24751d m126632A(String str, MessageId messageId) {
        boolean z11;
        C24751d m41587l;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(messageId, "messageId");
        Object obj = null;
        try {
            String m126627s = m126627s(messageId);
            if (this.f117186b.containsKey(m126627s)) {
                obj = this.f117186b.get(m126627s);
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && (m41587l = C7958c.Companion.m41593b().m41587l(str, messageId)) != null) {
                m126644j(m41587l);
                obj = m41587l;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ReactionMessageManager", e11);
        }
        return (C24751d) obj;
    }

    /* renamed from: B */
    public final void m126633B(List list, String str) {
        boolean m127149O;
        AbstractC19074t.m100208f(list, "messageList");
        AbstractC19074t.m100208f(str, "groupId");
        if (!list.isEmpty()) {
            try {
                m127149O = AbstractC24342w.m127149O(str, "group_", false, 2, null);
                if (!m127149O) {
                    str = "group_" + str;
                }
                C24265l.b bVar = C24265l.Companion;
                m126606D(list, str, bVar.m126709b().m126699o().m128551i(), bVar.m126709b().m126699o().m128549g());
            } catch (Exception e11) {
                AbstractC23350e.m122776f("ReactionMessageManager", e11);
            }
        }
    }

    /* renamed from: C */
    public final void m126634C(List list, String str) {
        AbstractC19074t.m100208f(list, "messageList");
        AbstractC19074t.m100208f(str, "ownerID");
        m126606D(list, str, false, C24265l.Companion.m126709b().m126699o().m128549g());
    }

    /* renamed from: G */
    public final void m126635G(String str, long j11, String str2, int i11, String str3, C17945a0 c17945a0) {
        boolean z11;
        boolean z12;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(str2, "senderName");
        AbstractC19074t.m100208f(str3, "icon");
        AbstractC19074t.m100208f(c17945a0, "lastMsg");
        try {
            C19059j0 c19059j0 = new C19059j0();
            String str4 = "";
            if (AbstractC25495a.m132079d(str)) {
                C31973j5 m4472f = C0943w.f3447a.m4472f(AbstractC25495a.m132089n(str));
                if (m4472f != null) {
                    ContactProfile contactProfile = new ContactProfile(str);
                    contactProfile.f42446v = m4472f.m153756e();
                    String m153793y = m4472f.m153793y();
                    contactProfile.f42437s = m153793y;
                    AbstractC19074t.m100207e(m153793y, "dpn");
                    c19059j0.f94941p = contactProfile;
                    str4 = m153793y;
                }
            } else {
                ContactProfile contactProfile2 = null;
                ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
                if (m141798e != null) {
                    str4 = m141798e.m40383Q(true, false);
                    AbstractC19074t.m100207e(str4, "getDpnPhoneContact(...)");
                    contactProfile2 = m141798e;
                }
                c19059j0.f94941p = contactProfile2;
            }
            ContactProfile contactProfile3 = (ContactProfile) c19059j0.f94941p;
            if (contactProfile3 != null) {
                String m122303q0 = AbstractC23309i.m122303q0();
                AbstractC19074t.m100207e(m122303q0, "getCodeHiddenChat(...)");
                if (m122303q0.length() > 0 && C21927m.m114302u().m114345m(str)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean m119333b = AbstractC23165o5.m119333b();
                if (AbstractC23059e9.m118329h() && !z11 && !m119333b) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    str4 = "Zalo";
                }
                String str5 = str4;
                String m126628t = m126628t(j11, str2, i11, str3, c17945a0, z12, contactProfile3);
                C28023b6.m141250h0().m141304N1(contactProfile3, str5, m126628t, m126628t, contactProfile3.f42446v, c17945a0.m95029V3(), AbstractC23059e9.m118329h());
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ReactionMessageManager", e11);
        }
    }

    /* renamed from: J */
    public final void m126636J(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "params");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new d());
        c0766k.mo1659i6(arrayList);
    }

    /* renamed from: K */
    public final void m126637K(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "params");
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e());
        c0766k.mo1695n7(arrayList);
    }

    /* renamed from: L */
    public final void m126638L() {
        f117184e.reset();
    }

    /* renamed from: M */
    public final void m126639M(String str, C28266a c28266a) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(c28266a, "unreadReaction");
        if (str.length() == 0) {
            return;
        }
        try {
            long m142385d = c28266a.m142385d();
            if (m142385d != 0) {
                m126624m(this, str, 0L, 2, null);
                C0827k0.Companion.m2168c(str, m142385d, true);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ReactionMessageManager", e11);
        }
    }

    /* renamed from: N */
    public final Long m126640N(String str, C28266a c28266a) {
        Long l11;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(c28266a, "lastUnreadReactionInfo");
        synchronized (this.f117187c) {
            try {
                l11 = (Long) this.f117187c.get(str);
                if (l11 != null) {
                    if (l11.longValue() < c28266a.m142385d()) {
                    }
                }
                m126642Q(str, c28266a, true);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l11;
    }

    /* renamed from: O */
    public final void m126641O(String str, List list, int i11, String str2) {
        AbstractC19074t.m100208f(str, "icon");
        AbstractC19074t.m100208f(list, "messageIdList");
        AbstractC19074t.m100208f(str2, "ownerId");
        if (C24265l.Companion.m126709b().m126681C() && !list.isEmpty() && i11 > 0 && str2.length() != 0) {
            this.f117185a.mo13474a(new Runnable() { // from class: oh.a

                /* renamed from: p */
                public final /* synthetic */ List f117160p;

                /* renamed from: q */
                public final /* synthetic */ C24261h f117161q;

                /* renamed from: r */
                public final /* synthetic */ String f117162r;

                /* renamed from: s */
                public final /* synthetic */ int f117163s;

                /* renamed from: t */
                public final /* synthetic */ String f117164t;

                public /* synthetic */ RunnableC24254a(List list2, C24261h this, String str22, int i112, String str3) {
                    r1 = list2;
                    r2 = this;
                    r3 = str22;
                    r4 = i112;
                    r5 = str3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C24261h.m126611P(r1, r2, r3, r4, r5);
                }
            });
        }
    }

    /* renamed from: Q */
    public final void m126642Q(String str, C28266a c28266a, boolean z11) {
        boolean z12;
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(c28266a, "lastUnreadReactionInfo");
        try {
            if (str.length() != 0 && c28266a.m142385d() > m126631w(str)) {
                if (C11318b.Companion.m60525a().m60515j(str)) {
                    z12 = false;
                } else {
                    z12 = z11;
                }
                m126614U(str, c28266a, z12);
                if (z11) {
                    C23744a.Companion.m124119a().m124116d(108, str);
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ReactionMessageManager", e11);
        }
    }

    /* renamed from: R */
    public final void m126643R(List list, C24753f c24753f, int i11, String str, boolean z11) {
        AbstractC19074t.m100208f(list, "messageIdList");
        AbstractC19074t.m100208f(c24753f, "reactionType");
        AbstractC19074t.m100208f(str, "ownerId");
        if (C24265l.Companion.m126709b().m126681C() && !list.isEmpty() && i11 > 0 && str.length() != 0) {
            this.f117185a.mo13474a(new Runnable() { // from class: oh.b

                /* renamed from: p */
                public final /* synthetic */ List f117165p;

                /* renamed from: q */
                public final /* synthetic */ C24261h f117166q;

                /* renamed from: r */
                public final /* synthetic */ String f117167r;

                /* renamed from: s */
                public final /* synthetic */ int f117168s;

                /* renamed from: t */
                public final /* synthetic */ C24753f f117169t;

                /* renamed from: u */
                public final /* synthetic */ boolean f117170u;

                public /* synthetic */ RunnableC24255b(List list2, C24261h this, String str2, int i112, C24753f c24753f2, boolean z112) {
                    r1 = list2;
                    r2 = this;
                    r3 = str2;
                    r4 = i112;
                    r5 = c24753f2;
                    r6 = z112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C24261h.m126612S(r1, r2, r3, r4, r5, r6);
                }
            });
        }
    }

    /* renamed from: j */
    public final void m126644j(C24751d c24751d) {
        AbstractC19074t.m100208f(c24751d, "reactionMsgInfo");
        String m126627s = m126627s(c24751d.m128568l());
        Map map = this.f117186b;
        AbstractC19074t.m100207e(map, "mapReactionMsgInfo");
        map.put(m126627s, c24751d);
    }

    /* renamed from: k */
    public final boolean m126645k(String str) {
        AbstractC19074t.m100208f(str, "ownerID");
        if (C11318b.Companion.m60525a().m60515j(str)) {
            return false;
        }
        try {
            if (!C26664o.m136836a().m136838c() && !C0804b.m2025g().m2033i(str)) {
                String str2 = CoreUtility.f89233i;
                AbstractC19074t.m100207e(str2, "currentUserUid");
                if (str2.length() != 0) {
                    return true;
                }
            }
            return false;
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ReactionMessageManager", e11);
            return true;
        }
    }

    /* renamed from: l */
    public final void m126646l(String str, long j11) {
        AbstractC19074t.m100208f(str, "ownerId");
        try {
            synchronized (this.f117187c) {
                if (j11 == 0) {
                    m126610I(str);
                    C28023b6.m141233T(str);
                    return;
                }
                Long l11 = (Long) this.f117187c.get(str);
                if (l11 == null || l11.longValue() <= j11) {
                    this.f117187c.put(str, Long.valueOf(j11));
                }
                long m126631w = m126631w(str);
                if (m126631w != 0 && m126631w <= j11) {
                    C28023b6.m141233T(str);
                    m126610I(str);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("ReactionMessageManager", e11);
        }
    }

    /* renamed from: n */
    public final void m126647n(String str, List list, boolean z11) {
        AbstractC19074t.m100208f(str, "ownerId");
        AbstractC19074t.m100208f(list, "messageIdList");
        if (C24265l.Companion.m126709b().m126681C() && !list.isEmpty() && str.length() != 0) {
            this.f117185a.mo13474a(new Runnable() { // from class: oh.c

                /* renamed from: p */
                public final /* synthetic */ boolean f117171p;

                /* renamed from: q */
                public final /* synthetic */ List f117172q;

                /* renamed from: r */
                public final /* synthetic */ String f117173r;

                /* renamed from: s */
                public final /* synthetic */ C24261h f117174s;

                public /* synthetic */ RunnableC24256c(boolean z112, List list2, String str2, C24261h this) {
                    r1 = z112;
                    r2 = list2;
                    r3 = str2;
                    r4 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C24261h.m126625o(r1, r2, r3, r4);
                }
            });
        }
    }

    /* renamed from: p */
    public final void m126648p(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        if (C24265l.Companion.m126709b().m126681C() && str.length() != 0) {
            this.f117185a.mo13474a(new Runnable() { // from class: oh.d

                /* renamed from: p */
                public final /* synthetic */ String f117175p;

                public /* synthetic */ RunnableC24257d(String str2) {
                    r1 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C24261h.m126626q(r1);
                }
            });
        }
    }

    /* renamed from: r */
    public final void m126649r(String str) {
        boolean m127120J;
        AbstractC19074t.m100208f(str, "ownerId");
        synchronized (this) {
            try {
                Map map = this.f117186b;
                AbstractC19074t.m100207e(map, "mapReactionMsgInfo");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    AbstractC19074t.m100205c(str2);
                    m127120J = AbstractC24341v.m127120J(str2, str + "_", false, 2, null);
                    if (!m127120J) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                this.f117186b.clear();
                this.f117186b.putAll(linkedHashMap);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: x */
    public final synchronized C24751d m126650x(MessageId messageId) {
        if (messageId == null) {
            return null;
        }
        return (C24751d) this.f117186b.get(m126627s(messageId));
    }

    /* renamed from: y */
    public final C2797c m126651y() {
        return this.f117185a;
    }

    /* renamed from: z */
    public final void m126652z(List list, boolean z11) {
        List list2;
        Object obj;
        AbstractC19074t.m100208f(list, "responseData");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C24756i c24756i = (C24756i) it.next();
            MessageId m128630a = c24756i.m128630a();
            if (m128630a != null && !c24756i.m128633d()) {
                C24751d c24751d = (C24751d) this.f117186b.get(m126627s(m128630a));
                if (c24751d != null && (list2 = (List) c24751d.m128567j().get(Integer.valueOf(c24756i.m128631b()))) != null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            if (AbstractC19074t.m100204b(((C24753f) obj).m128597j(), c24756i.m128632c())) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    C24753f c24753f = (C24753f) obj;
                    if (c24753f != null) {
                        if (z11) {
                            c24753f.m128607u();
                        } else {
                            c24753f.m128608v();
                        }
                    }
                }
            }
        }
    }

    private C24261h() {
        InterfaceC24854k m129210a;
        this.f117185a = new f(AbstractC0837p0.Companion.m2237f());
        this.f117186b = Collections.synchronizedMap(new LinkedHashMap());
        this.f117187c = new Hashtable();
        m129210a = AbstractC24856m.m129210a(c.f117190q);
        this.f117188d = m129210a;
    }
}

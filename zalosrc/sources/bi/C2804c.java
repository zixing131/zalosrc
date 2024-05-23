package bi;

import ae.C0766k;
import ag0.C0824j;
import am.AbstractC0939u;
import am.C0927o;
import bi.C2804c;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.group.GroupInvitationInfo;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import dg0.AbstractC17930e;
import dg0.InterfaceC17929d;
import en0.InterfaceC18505l;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p162fh.C18932a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import pm0.C24848g0;
import qm0.AbstractC25378x;
import sb.AbstractC26216b;
import vg.AbstractC28025b8;
import vg.C28023b6;
import vg.C28203u6;
import vg.C28212v6;

/* renamed from: bi.c */
/* loaded from: classes3.dex */
public final class C2804c {

    /* renamed from: a */
    public static final C2804c f11236a = new C2804c();

    /* renamed from: b */
    private static final List f11237b = new ArrayList();

    /* renamed from: c */
    private static final HashMap f11238c = new HashMap();

    /* renamed from: d */
    private static final ArrayList f11239d = new ArrayList();

    /* renamed from: e */
    private static final List f11240e = Collections.synchronizedList(new ArrayList());

    /* renamed from: f */
    private static boolean f11241f;

    /* renamed from: g */
    private static boolean f11242g;

    /* renamed from: h */
    private static int f11243h;

    /* renamed from: bi.c$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        /* renamed from: a */
        public abstract void mo13569a(C20096c c20096c);

        /* renamed from: b */
        public abstract void mo13570b(C20096c c20096c);

        /* renamed from: c */
        public void mo13571c(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
        }

        /* renamed from: d */
        public void mo13572d() {
        }
    }

    /* renamed from: bi.c$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ ContactProfile f11244a;

        /* renamed from: bi.c$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f11245a;

            /* renamed from: b */
            final /* synthetic */ boolean f11246b;

            /* renamed from: c */
            final /* synthetic */ ContactProfile f11247c;

            a(ContactProfile contactProfile, boolean z11, ContactProfile contactProfile2) {
                this.f11245a = contactProfile;
                this.f11246b = z11;
                this.f11247c = contactProfile2;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42131G7(this.f11245a, this.f11246b);
                C7960e.m41971c6().m42234Pb(this.f11247c.f42434r);
            }
        }

        b(ContactProfile contactProfile) {
            this.f11244a = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                C2804c.f11236a.m13549p(new C20096c(c20096c.m104491c(), ""));
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int optInt;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("data") && (optInt = new JSONObject(jSONObject.getString("data")).optInt("code", -1000)) != 0) {
                    C2804c.f11236a.m13549p(new C20096c(optInt, ""));
                    return;
                }
                boolean m114558y = AbstractC21935u.m114558y(this.f11244a.f42434r);
                ContactProfile m98552o = C18644n.m98531l().m98552o(this.f11244a.f42434r);
                if (m98552o == null) {
                    m98552o = C28203u6.m141798e(C28203u6.f131407a, this.f11244a.f42434r, null, 2, null);
                }
                if (m98552o == null) {
                    m98552o = this.f11244a;
                }
                C0824j.m2153b(new a(m98552o, m114558y, this.f11244a));
                C28203u6.f131407a.m141824w(m98552o);
                C21927m.m114302u().m114350o0(this.f11244a.f42434r);
                if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(this.f11244a.f42434r)) {
                    ArrayList arrayList = new ArrayList();
                    String str = this.f11244a.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                    C21927m.m114302u().m114338i0(arrayList);
                }
                C19669z.Companion.m103232a().m103198O0();
                if (m114558y) {
                    C18644n.m98524E();
                }
                C2804c.f11236a.m13549p(new C20096c(0, ""));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: bi.c$c */
    /* loaded from: classes3.dex */
    public static final class c implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ GroupInvitationInfo f11248a;

        c(GroupInvitationInfo groupInvitationInfo) {
            this.f11248a = groupInvitationInfo;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C2804c.f11236a.m13550q(new C20096c(c20096c.m104491c(), ""));
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                JSONObject jSONObject = (JSONObject) obj;
                int optInt = jSONObject.optInt("errorCode");
                if (optInt == 0) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    int i11 = -1;
                    if (optJSONObject != null) {
                        i11 = optJSONObject.optInt("statusCode", -1);
                    }
                    if (i11 != 0) {
                        C2804c.f11236a.m13550q(new C20096c(i11, ""));
                        return;
                    }
                    C2804c c2804c = C2804c.f11236a;
                    c2804c.m13559K(this.f11248a);
                    c2804c.m13550q(new C20096c(0, ""));
                    return;
                }
                C2804c.f11236a.m13550q(new C20096c(optInt, jSONObject.optString("error_message_localize")));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: bi.c$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC0939u {

        /* renamed from: a */
        final /* synthetic */ Runnable f11249a;

        d(Runnable runnable) {
            this.f11249a = runnable;
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            this.f11249a.run();
        }
    }

    /* renamed from: bi.c$e */
    /* loaded from: classes3.dex */
    public static final class e implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ boolean f11250a;

        /* renamed from: b */
        final /* synthetic */ C2806e f11251b;

        e(boolean z11, C2806e c2806e) {
            this.f11250a = z11;
            this.f11251b = c2806e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m13574d(C2806e c2806e) {
            AbstractC19074t.m100208f(c2806e, "$invitationBoxInfo");
            C2804c.f11236a.m13531F(c2806e.m13579d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            C2804c c2804c = C2804c.f11236a;
            synchronized (c2804c) {
                C2804c.f11237b.clear();
                C2804c.f11238c.clear();
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
            c2804c.m13551r(new C20096c(c20096c.m104491c(), ""));
            if (C2804c.f11243h < 3) {
                C2804c.f11242g = true;
                C2804c.f11243h++;
                long m134775c = AbstractC26216b.m134775c(C2804c.f11243h, 2000L);
                InterfaceC17929d m94551d = AbstractC17930e.Companion.m94551d();
                final C2806e c2806e = this.f11251b;
                m94551d.mo94531e(new Runnable() { // from class: bi.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C2804c.e.m13574d(C2806e.this);
                    }
                }, m134775c);
                return;
            }
            c2804c.m13534M();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                if (!this.f11250a) {
                    C2804c.f11237b.clear();
                    C2804c.f11238c.clear();
                }
                JSONObject jSONObject = (JSONObject) obj;
                int optInt = jSONObject.optInt("errorCode");
                if (optInt == 0) {
                    JSONObject optJSONObject = jSONObject.optJSONObject("data");
                    if (optJSONObject != null) {
                        this.f11251b.m13583h(optJSONObject);
                        if (!optJSONObject.isNull("invites")) {
                            C2804c.f11236a.m13533I(optJSONObject.getJSONArray("invites"));
                        }
                    }
                    if (this.f11251b.m13579d()) {
                        C2804c.f11236a.m13531F(true);
                    } else {
                        C2804c c2804c = C2804c.f11236a;
                        c2804c.m13551r(new C20096c(0, ""));
                        C7960e.m41971c6().m42470n3();
                        C7960e.m41971c6().m42390f8(c2804c.m13568y());
                        C19669z.Companion.m103232a().m103198O0();
                    }
                } else {
                    C2804c c2804c2 = C2804c.f11236a;
                    synchronized (c2804c2) {
                        C2804c.f11237b.clear();
                        C2804c.f11238c.clear();
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    }
                    c2804c2.m13551r(new C20096c(optInt, jSONObject.optString("error_message_localize")));
                }
                C2804c.f11236a.m13534M();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bi.c$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ GroupInvitationInfo f11252q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(GroupInvitationInfo groupInvitationInfo) {
            super(1);
            this.f11252q = groupInvitationInfo;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo205i9(GroupInvitationInfo groupInvitationInfo) {
            AbstractC19074t.m100208f(groupInvitationInfo, "it");
            return Boolean.valueOf(AbstractC19074t.m100204b(groupInvitationInfo.m40886d(), this.f11252q.m40886d()));
        }
    }

    /* renamed from: bi.c$g */
    /* loaded from: classes3.dex */
    public static final class g implements Runnable {

        /* renamed from: p */
        final /* synthetic */ GroupInvitationInfo f11253p;

        public g(GroupInvitationInfo groupInvitationInfo) {
            this.f11253p = groupInvitationInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C7960e.m41971c6().m42108E8(this.f11253p);
            C23744a.Companion.m124119a().m124116d(5116, new Object[0]);
        }
    }

    private C2804c() {
    }

    /* renamed from: A */
    private final void m13528A(GroupInvitationInfo groupInvitationInfo, int i11, int i12) {
        int i13 = (i12 + i11) / 2;
        if (i13 == i11) {
            List list = f11237b;
            if (((GroupInvitationInfo) list.get(i12)).m40891i() > groupInvitationInfo.m40891i()) {
                list.add(i12 + 1, groupInvitationInfo);
                return;
            } else if (((GroupInvitationInfo) list.get(i11)).m40891i() < groupInvitationInfo.m40891i()) {
                list.add(i11, groupInvitationInfo);
                return;
            } else {
                list.add(i12, groupInvitationInfo);
                return;
            }
        }
        if (((GroupInvitationInfo) f11237b.get(i13)).m40891i() < groupInvitationInfo.m40891i()) {
            m13528A(groupInvitationInfo, i11, i13 - 1);
        } else {
            m13528A(groupInvitationInfo, i13 + 1, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m13529C(GroupInvitationInfo groupInvitationInfo) {
        AbstractC19074t.m100208f(groupInvitationInfo, "$it");
        C7960e.m41971c6().m42173K3(groupInvitationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static final void m13530E() {
        if (!f11241f) {
            f11236a.m13555B();
        }
        C2804c c2804c = f11236a;
        c2804c.m13552s();
        m13532G(c2804c, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public final void m13531F(boolean z11) {
        C2806e c2806e = C2806e.f11255a;
        if (!z11) {
            c2806e.m13589n(-1);
            c2806e.m13587l(false);
        }
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new e(z11, c2806e));
        c0766k.mo1501O7("", c2806e.m13581f() + 1, c2806e.m13580e());
    }

    /* renamed from: G */
    static /* synthetic */ void m13532G(C2804c c2804c, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        c2804c.m13531F(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public final void m13533I(JSONArray jSONArray) {
        if ((jSONArray == null || jSONArray.length() != 0) && jSONArray != null) {
            try {
                C2806e c2806e = C2806e.f11255a;
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                    if (optJSONObject != null) {
                        AbstractC19074t.m100205c(optJSONObject);
                        GroupInvitationInfo groupInvitationInfo = new GroupInvitationInfo(optJSONObject);
                        if (groupInvitationInfo.m40884b() >= C23793c.Companion.m124321a().mo124314i()) {
                            String m40886d = groupInvitationInfo.m40886d();
                            synchronized (this) {
                                try {
                                    HashMap hashMap = f11238c;
                                    if (hashMap.containsKey(m40886d)) {
                                        List list = f11237b;
                                        AbstractC19069o0.m100184a(list).remove(hashMap.get(m40886d));
                                        hashMap.remove(m40886d);
                                    }
                                    hashMap.put(m40886d, groupInvitationInfo);
                                    f11236a.m13554z(groupInvitationInfo);
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                } finally {
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                AbstractC23309i.m121168Lo(c2806e.m13591p().toString());
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public final void m13534M() {
        f11242g = false;
        f11243h = 0;
    }

    /* renamed from: o */
    private final void m13548o(GroupInvitationInfo groupInvitationInfo) {
        synchronized (this) {
            try {
                HashMap hashMap = f11238c;
                if (hashMap.containsKey(groupInvitationInfo.m40886d())) {
                    f11236a.m13559K(groupInvitationInfo);
                }
                f11236a.m13554z(groupInvitationInfo);
                hashMap.put(groupInvitationInfo.m40886d(), groupInvitationInfo);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C2806e c2806e = C2806e.f11255a;
        c2806e.m13590o(c2806e.m13582g() + 1);
        c2806e.m13586k(c2806e.m13577b() + 1);
        AbstractC23309i.m121168Lo(c2806e.m13591p().toString());
        C7960e.m41971c6().m42108E8(groupInvitationInfo);
        if (C18932a.f94442a.m99182f()) {
            C7860a.Companion.m40303b().m40296w("-1000000");
        }
        C19669z.Companion.m103232a().m103198O0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public final void m13549p(C20096c c20096c) {
        Iterator it = f11240e.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo13569a(c20096c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public final void m13550q(C20096c c20096c) {
        Iterator it = f11240e.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo13570b(c20096c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public final void m13551r(C20096c c20096c) {
        Iterator it = f11240e.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo13571c(c20096c);
        }
    }

    /* renamed from: s */
    private final void m13552s() {
        Iterator it = f11240e.iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo13572d();
        }
    }

    /* renamed from: w */
    private final void m13553w(Runnable runnable) {
        C0824j.m2153b(new d(runnable));
    }

    /* renamed from: z */
    private final void m13554z(GroupInvitationInfo groupInvitationInfo) {
        List list = f11237b;
        if (list.size() == 0) {
            list.add(groupInvitationInfo);
        } else {
            m13528A(groupInvitationInfo, 0, list.size() - 1);
        }
    }

    /* renamed from: B */
    public final void m13555B() {
        if (!AbstractC23309i.m120961G2()) {
            return;
        }
        C2806e c2806e = C2806e.f11255a;
        List<GroupInvitationInfo> m42430j5 = C7960e.m41971c6().m42430j5();
        synchronized (this) {
            try {
                f11241f = true;
                f11238c.clear();
                f11237b.clear();
                for (final GroupInvitationInfo groupInvitationInfo : m42430j5) {
                    if (groupInvitationInfo != null) {
                        AbstractC19074t.m100205c(groupInvitationInfo);
                        if (groupInvitationInfo.m40884b() < C23793c.Companion.m124321a().mo124314i()) {
                            f11236a.m13553w(new Runnable() { // from class: bi.b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2804c.m13529C(GroupInvitationInfo.this);
                                }
                            });
                            c2806e.m13590o(c2806e.m13582g() - 1);
                        } else {
                            HashMap hashMap = f11238c;
                            if (hashMap.containsKey(groupInvitationInfo.m40886d())) {
                                AbstractC19069o0.m100184a(f11237b).remove(hashMap.get(groupInvitationInfo.m40886d()));
                                hashMap.remove(groupInvitationInfo.m40886d());
                            }
                            f11236a.m13554z(groupInvitationInfo);
                            hashMap.put(groupInvitationInfo.m40886d(), groupInvitationInfo);
                        }
                    }
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC23309i.m121168Lo(c2806e.m13591p().toString());
    }

    /* renamed from: D */
    public final void m13556D() {
        if (AbstractC23309i.m120961G2() && !f11242g) {
            AbstractC23309i.m120948Fq(C23793c.Companion.m124321a().mo124314i());
            m13553w(new Runnable() { // from class: bi.a
                @Override // java.lang.Runnable
                public final void run() {
                    C2804c.m13530E();
                }
            });
        }
    }

    /* renamed from: H */
    public final void m13557H(long j11, JSONObject jSONObject) {
        ArrayList arrayList;
        if (AbstractC23309i.m120961G2() && jSONObject != null) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    int optInt = jSONObject.optInt("actionType");
                    if (optInt != 0) {
                        if (optInt == 1) {
                            GroupInvitationInfo groupInvitationInfo = new GroupInvitationInfo();
                            String optString = optJSONObject.optString("groupId");
                            AbstractC19074t.m100207e(optString, "optString(...)");
                            groupInvitationInfo.m40902x(optString);
                            String optString2 = optJSONObject.optString("removeInfo");
                            AbstractC19074t.m100207e(optString2, "optString(...)");
                            groupInvitationInfo.m40880B(optString2);
                            f11236a.m13559K(groupInvitationInfo);
                            C19669z.Companion.m103232a().m103198O0();
                            C23744a.Companion.m124119a().m124116d(5115, new Object[0]);
                            return;
                        }
                        return;
                    }
                    C2806e c2806e = C2806e.f11255a;
                    c2806e.m13588m(optJSONObject.optLong("lastInviteTime"));
                    C23793c.b bVar = C23793c.Companion;
                    c2806e.m13585j(bVar.m124321a().mo124314i());
                    AbstractC23309i.m121168Lo(c2806e.m13591p().toString());
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("invite");
                    if (optJSONObject2 != null) {
                        GroupInvitationInfo groupInvitationInfo2 = new GroupInvitationInfo(optJSONObject2);
                        f11236a.m13548o(groupInvitationInfo2);
                        synchronized (this) {
                            arrayList = f11239d;
                            arrayList.add(groupInvitationInfo2);
                        }
                        C28212v6 c28212v6 = new C28212v6("");
                        c28212v6.f131575a = 1;
                        c28212v6.f131587m = bVar.m124321a().mo124310e();
                        c28212v6.f131588n = groupInvitationInfo2.m40884b();
                        c28212v6.f131577c = "tip.grouptab";
                        c28212v6.f131579e = false;
                        c28212v6.f131580f = true;
                        AbstractC28025b8.m141438I("tip.grouptab", c28212v6);
                        C28023b6.m141250h0().m141386u1(String.valueOf(j11), new ArrayList(arrayList));
                        C23744a.Companion.m124119a().m124116d(5114, new Object[0]);
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: J */
    public final void m13558J(a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        List list = f11240e;
        if (!list.contains(aVar)) {
            list.add(aVar);
        }
    }

    /* renamed from: K */
    public final void m13559K(GroupInvitationInfo groupInvitationInfo) {
        AbstractC19074t.m100208f(groupInvitationInfo, "invitation");
        C2806e c2806e = C2806e.f11255a;
        synchronized (this) {
            try {
                List list = f11237b;
                int size = list.size();
                AbstractC25378x.m131542D(list, new f(groupInvitationInfo));
                HashMap hashMap = f11238c;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : hashMap.entrySet()) {
                    if (!AbstractC19074t.m100204b((String) entry.getKey(), groupInvitationInfo.m40886d())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                c2806e.m13590o(c2806e.m13582g() - (size - f11237b.size()));
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        AbstractC23309i.m121168Lo(c2806e.m13591p().toString());
        C7960e.m41971c6().m42173K3(groupInvitationInfo);
        if (c2806e.m13582g() == 0) {
            AbstractC28025b8.m141442M("tip.grouptab");
        }
    }

    /* renamed from: L */
    public final void m13560L(String str) {
        AbstractC19074t.m100208f(str, "groupId");
        GroupInvitationInfo groupInvitationInfo = (GroupInvitationInfo) f11238c.get(str);
        if (groupInvitationInfo != null) {
            f11236a.m13559K(groupInvitationInfo);
        }
    }

    /* renamed from: N */
    public final void m13561N(a aVar) {
        AbstractC19074t.m100208f(aVar, "listener");
        f11240e.remove(aVar);
    }

    /* renamed from: O */
    public final void m13562O(GroupInvitationInfo groupInvitationInfo, String str, String str2) {
        AbstractC19074t.m100208f(groupInvitationInfo, "groupInvitationInfo");
        AbstractC19074t.m100208f(str, "newGroupName");
        AbstractC19074t.m100208f(str2, "groupAvt");
        groupInvitationInfo.m40903y(str);
        groupInvitationInfo.m40901w(str2);
        m13553w(new g(groupInvitationInfo));
    }

    /* renamed from: n */
    public final void m13563n(ContactProfile contactProfile, int i11) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new b(contactProfile));
            c0766k.mo1479L9(contactProfile.f42434r, i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: t */
    public final void m13564t() {
        synchronized (this) {
            f11237b.clear();
            f11238c.clear();
            f11241f = false;
            f11239d.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: u */
    public final void m13565u() {
        synchronized (this) {
            f11239d.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: v */
    public final void m13566v(GroupInvitationInfo groupInvitationInfo, boolean z11) {
        AbstractC19074t.m100208f(groupInvitationInfo, "invitation");
        try {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new c(groupInvitationInfo));
            c0766k.mo1698na("", Integer.parseInt(groupInvitationInfo.m40886d()), z11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: x */
    public final boolean m13567x() {
        boolean z11;
        synchronized (this) {
            z11 = !f11237b.isEmpty();
        }
        return z11;
    }

    /* renamed from: y */
    public final List m13568y() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(f11237b);
        }
        return arrayList;
    }
}

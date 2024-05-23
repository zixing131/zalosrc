package ga0;

import ai.InterfaceC0861a;
import am.C0943w;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.chat.model.tabmessage.Conversation;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import dg0.AbstractC17930e;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gw.AbstractC19646n0;
import gw.C19636i1;
import gw.C19669z;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import m00.C22703b;
import m00.C22709h;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23217t2;
import me0.AbstractC23262x6;
import me0.C23024b7;
import me0.C23282z6;
import mm0.AbstractC23352g;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p019aj.C0872f;
import p055ce.C3432a;
import p055ce.C3441j;
import p055ce.C3442k;
import p142ey.C18635e;
import p142ey.C18644n;
import p173fz.C19172a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.C23302b;
import p361nb.AbstractC23647d;
import p459qs.C25489b;
import p461qu.AbstractC25495a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29072d;
import p612wk.AbstractC29073e;
import p612wk.AbstractC29075g;
import p612wk.AbstractC29076h;
import p612wk.C29074f;
import p716zh.C31853b5;
import p716zh.C31973j5;
import p716zh.C32020m7;
import p716zh.C32058p1;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25356m;
import qm0.AbstractC25370t;
import qm0.AbstractC25376w;
import sm.C26323a;
import th.C26688i;
import tk.C26727f;
import vg.C28203u6;
import vg.C28213v7;

/* renamed from: ga0.y0 */
/* loaded from: classes6.dex */
public final class C19372y0 extends AbstractC19358r1 {
    public static final a Companion = new a(null);

    /* renamed from: t */
    private final Map f96200t;

    /* renamed from: ga0.y0$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: e */
        public static /* synthetic */ AbstractC29069a.o m101483e(a aVar, ContactProfile contactProfile, int i11, CharSequence charSequence, CharSequence charSequence2, AbstractC29069a.p pVar, C32058p1 c32058p1, AbstractC29069a.w wVar, int i12, Object obj) {
            CharSequence charSequence3;
            CharSequence charSequence4;
            AbstractC29069a.p pVar2;
            C32058p1 c32058p12;
            AbstractC29069a.w wVar2;
            if ((i12 & 4) != 0) {
                C23024b7 c23024b7 = C23024b7.f111993a;
                String m40383Q = contactProfile.m40383Q(true, false);
                AbstractC19074t.m100207e(m40383Q, "getDpnPhoneContact(...)");
                ArrayList arrayList = contactProfile.f42399a1;
                AbstractC19074t.m100207e(arrayList, "arrPosToHighlight");
                charSequence3 = c23024b7.m118057S(m40383Q, arrayList, c23024b7.m118064k());
            } else {
                charSequence3 = charSequence;
            }
            if ((i12 & 8) != 0) {
                charSequence4 = contactProfile.f42436r1;
            } else {
                charSequence4 = charSequence2;
            }
            if ((i12 & 16) != 0) {
                pVar2 = AbstractC29069a.p.d.f134718a;
            } else {
                pVar2 = pVar;
            }
            if ((i12 & 32) != 0) {
                c32058p12 = null;
            } else {
                c32058p12 = c32058p1;
            }
            if ((i12 & 64) != 0) {
                wVar2 = aVar.m101484g(i11, contactProfile);
            } else {
                wVar2 = wVar;
            }
            return aVar.m101488d(contactProfile, i11, charSequence3, charSequence4, pVar2, c32058p12, wVar2);
        }

        /* renamed from: g */
        private final AbstractC29069a.w m101484g(int i11, ContactProfile contactProfile) {
            boolean z11;
            String str;
            AbstractC29069a.b bVar = AbstractC29069a.Companion;
            if (!bVar.m145171a(i11, 2) && !bVar.m145171a(i11, 268435456) && !bVar.m145171a(i11, 134217728)) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (C3432a.f14402a.m17234c() && contactProfile.m40357A0() && z11 && C3442k.f14460a.m17301f(contactProfile)) {
                str = contactProfile.m40391V();
            } else {
                str = null;
            }
            if (str != null) {
                return new AbstractC29069a.w.c(str);
            }
            return AbstractC29069a.w.d.f134784a;
        }

        /* renamed from: a */
        public final int m101485a(ContactProfile contactProfile) {
            boolean z11;
            AbstractC19074t.m100208f(contactProfile, "<this>");
            String str = contactProfile.f42437s;
            AbstractC19074t.m100207e(str, "dpn");
            String[] m118488a = C23282z6.m120367c(str, 16400).m118488a();
            C19322f1 c19322f1 = C19322f1.f95950a;
            if (!Arrays.equals(m118488a, (Object[]) c19322f1.m101152i().m129215c()) && !Arrays.equals(m118488a, (Object[]) c19322f1.m101152i().m129216d())) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                return 0;
            }
            return 536870912;
        }

        /* renamed from: b */
        public final boolean m101486b(C19325g1 c19325g1, String str) {
            String str2;
            int m101166w;
            AbstractC19074t.m100208f(str, "query");
            if (c19325g1 != null) {
                str2 = c19325g1.m101177D();
            } else {
                str2 = null;
            }
            if (AbstractC19074t.m100204b(str2, "10")) {
                m101166w = C19322f1.f95950a.m101167x();
            } else {
                m101166w = C19322f1.f95950a.m101166w();
            }
            if (str.length() >= m101166w && !AbstractC19074t.m100204b(str, "") && !AbstractC19074t.m100204b(str, " ") && !AbstractC19074t.m100204b(str, ".")) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final int m101487c(ContactProfile contactProfile, int i11) {
            boolean z11;
            int i12;
            int m101485a;
            AbstractC19074t.m100208f(contactProfile, "cp");
            boolean m98558u = C18644n.m98531l().m98558u(contactProfile.f42434r);
            boolean m40374K0 = contactProfile.m40374K0();
            int i13 = 0;
            if (!contactProfile.m40387S0() && !AbstractC25495a.m132086k(contactProfile.f42434r) && !C21927m.m114302u().m114318P(contactProfile.f42434r) && !AbstractC23304d.f113417o.containsKey(contactProfile.f42434r) && !AbstractC21935u.m114518H(contactProfile.f42434r)) {
                z11 = false;
            } else {
                z11 = true;
            }
            boolean m100204b = AbstractC19074t.m100204b(contactProfile.f42434r, "-2");
            boolean m100204b2 = AbstractC19074t.m100204b(contactProfile.f42434r, "-8");
            boolean m100204b3 = AbstractC19074t.m100204b(contactProfile.f42434r, "204278670");
            boolean m132087l = AbstractC25495a.m132087l(contactProfile.f42434r);
            if (!m100204b2 && !m100204b && !m100204b3 && !m132087l) {
                if (m40374K0) {
                    return i11 | 4;
                }
                if (z11) {
                    return i11 | 16;
                }
                if (m98558u) {
                    i12 = i11 | 2;
                    m101485a = m101485a(contactProfile);
                } else {
                    i12 = i11 | 32;
                    m101485a = m101485a(contactProfile);
                }
                return m101485a | i12;
            }
            int i14 = i11 | 8;
            if (m100204b2) {
                i13 = 128;
            } else if (m100204b) {
                i13 = 64;
            } else if (m100204b3) {
                i13 = 256;
            }
            return i14 | i13;
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:            if (r0.m102765V(r8) != false) goto L91;     */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AbstractC29069a.o m101488d(ContactProfile contactProfile, int i11, CharSequence charSequence, CharSequence charSequence2, AbstractC29069a.p pVar, C32058p1 c32058p1, AbstractC29069a.w wVar) {
            int i12;
            int i13;
            boolean z11;
            String str;
            int i14;
            int i15;
            AbstractC19074t.m100208f(contactProfile, "profile");
            AbstractC19074t.m100208f(charSequence, "name");
            AbstractC19074t.m100208f(pVar, "actionType");
            AbstractC19074t.m100208f(wVar, "taglineType");
            if (!contactProfile.m40359B0() && !AbstractC25495a.m132078c(contactProfile.f42434r) && !AbstractC25495a.m132086k(contactProfile.f42434r)) {
                if (C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r)) {
                    i12 = AbstractC16803z.ic_banned;
                } else {
                    i13 = 0;
                    z11 = true;
                    String str2 = null;
                    if (!AbstractC29069a.Companion.m145171a(i11, 1)) {
                        C19636i1.b bVar = C19636i1.Companion;
                        C19636i1 m102800a = bVar.m102800a();
                        String str3 = contactProfile.f42434r;
                        AbstractC19074t.m100207e(str3, "uid");
                        int m102746E = m102800a.m102746E(str3);
                        if (m102746E > 0) {
                            if (m102746E <= 5) {
                                str2 = String.valueOf(m102746E);
                            } else if (C0872f.Companion.m2569a().m2525T() && C19172a.m100600k("features@jump_csc@unread_limit", 0) == 1) {
                                if (!AbstractC23184q2.m119460r(new Conversation(contactProfile))) {
                                    if (m102746E > 999) {
                                        str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_unread_over);
                                    } else {
                                        str2 = String.valueOf(m102746E);
                                    }
                                }
                                str = str2;
                            } else {
                                str2 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_noti_over_5);
                            }
                            z11 = false;
                            str = str2;
                        } else {
                            C19636i1 m102800a2 = bVar.m102800a();
                            String str4 = contactProfile.f42434r;
                            AbstractC19074t.m100207e(str4, "uid");
                        }
                    } else {
                        str = null;
                        z11 = false;
                    }
                    if (str == null) {
                        if (AbstractC19646n0.m103021r(contactProfile)) {
                            i15 = AbstractC16803z.stencils_bg_number_notif_grey;
                        } else {
                            i15 = AbstractC16803z.stencils_bg_number_notif;
                        }
                        i14 = i15;
                    } else {
                        i14 = 0;
                    }
                    AbstractC29069a.y yVar = AbstractC29069a.y.f134789q;
                    if (z11) {
                        if (AbstractC19646n0.m103021r(contactProfile)) {
                            yVar = AbstractC29069a.y.f134791s;
                        } else {
                            yVar = AbstractC29069a.y.f134790r;
                        }
                    }
                    String str5 = contactProfile.f42446v;
                    AbstractC19074t.m100205c(str5);
                    return new AbstractC29069a.o(i11, contactProfile, charSequence, charSequence2, str5, pVar, c32058p1, str, i14, i13, wVar, yVar);
                }
            } else {
                i12 = AbstractC16803z.ic_oa_verify;
            }
            i13 = i12;
            z11 = true;
            String str22 = null;
            if (!AbstractC29069a.Companion.m145171a(i11, 1)) {
            }
            if (str == null) {
            }
            AbstractC29069a.y yVar2 = AbstractC29069a.y.f134789q;
            if (z11) {
            }
            String str52 = contactProfile.f42446v;
            AbstractC19074t.m100205c(str52);
            return new AbstractC29069a.o(i11, contactProfile, charSequence, charSequence2, str52, pVar, c32058p1, str, i14, i13, wVar, yVar2);
        }

        /* renamed from: f */
        public final List m101489f(C19325g1 c19325g1, String str) {
            AbstractC19074t.m100208f(c19325g1, "<this>");
            AbstractC19074t.m100208f(str, "query");
            return c19325g1.m101245w().m101459b(str);
        }

        /* renamed from: h */
        public final void m101490h(AbstractC19358r1 abstractC19358r1, List list, List... listArr) {
            List list2;
            AbstractC19074t.m100208f(abstractC19358r1, "<this>");
            AbstractC19074t.m100208f(list, "result");
            AbstractC19074t.m100208f(listArr, "topHitLists");
            ArrayList<ContactProfile> arrayList = new ArrayList();
            int i11 = 0;
            for (List list3 : listArr) {
                arrayList.addAll(list3);
            }
            if (arrayList.size() < 6) {
                return;
            }
            int i12 = 0;
            for (List list4 : listArr) {
                if (!list4.isEmpty()) {
                    i12++;
                }
            }
            if (i12 < 2) {
                return;
            }
            HashSet hashSet = new HashSet();
            ArrayList m114365x = C21927m.m114302u().m114365x();
            AbstractC19074t.m100207e(m114365x, "getListHiddenChat(...)");
            Iterator it = m114365x.iterator();
            while (it.hasNext()) {
                hashSet.add(((ContactProfile) it.next()).f42434r);
            }
            Iterator it2 = C21927m.m114302u().m114358t().values().iterator();
            while (it2.hasNext()) {
                hashSet.add(((ContactProfile) it2.next()).f42434r);
            }
            ArrayList<ContactProfile> arrayList2 = new ArrayList();
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            if (arrayList.size() >= 3) {
                Comparator comparator = ContactProfile.f42319Z1;
                AbstractC19074t.m100207e(comparator, "COMPARE_BY_PRIORITY");
                AbstractC25376w.m131534w(arrayList, comparator);
                for (ContactProfile contactProfile : arrayList) {
                    if (arrayList2.size() < 3 && !hashSet.contains(contactProfile.f42434r)) {
                        AbstractC19074t.m100207e(contactProfile.f42399a1, "arrPosToHighlight");
                        if (!r11.isEmpty()) {
                            arrayList2.add(contactProfile);
                        }
                    }
                }
            }
            if (arrayList2.size() != 3 || abstractC19358r1.isCancelled()) {
                return;
            }
            if (!arrayList2.isEmpty()) {
                int length = listArr.length;
                int i13 = 0;
                while (true) {
                    if (i13 < length) {
                        list2 = listArr[i13];
                        if (!list2.isEmpty()) {
                            break;
                        } else {
                            i13++;
                        }
                    } else {
                        list2 = null;
                        break;
                    }
                }
                if (list2 != null) {
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        if (!list2.contains((ContactProfile) it3.next())) {
                            if (i11 == -1) {
                                return;
                            }
                        } else {
                            i11++;
                        }
                    }
                    return;
                }
            }
            if (abstractC19358r1.isCancelled()) {
                return;
            }
            for (ContactProfile contactProfile2 : arrayList2) {
                if (!hashSet2.contains(contactProfile2.f42434r)) {
                    a aVar = C19372y0.Companion;
                    arrayList3.add(m101483e(aVar, contactProfile2, aVar.m101487c(contactProfile2, 32768), null, null, null, null, null, 124, null));
                    hashSet2.add(contactProfile2.f42434r);
                }
            }
            if (arrayList3.size() == 3) {
                list.add(new AbstractC29069a.c(arrayList3));
            }
        }
    }

    /* renamed from: ga0.y0$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18511r {

        /* renamed from: q */
        final /* synthetic */ HashMap f96201q;

        /* renamed from: r */
        final /* synthetic */ List f96202r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC24854k f96203s;

        /* renamed from: t */
        final /* synthetic */ List f96204t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(HashMap hashMap, List list, InterfaceC24854k interfaceC24854k, List list2) {
            super(4);
            this.f96201q = hashMap;
            this.f96202r = list;
            this.f96203s = interfaceC24854k;
            this.f96204t = list2;
        }

        @Override // en0.InterfaceC18511r
        /* renamed from: Uc */
        public /* bridge */ /* synthetic */ Object mo49340Uc(Object obj, Object obj2, Object obj3, Object obj4) {
            m101491a((ContactProfile) obj, (String) obj2, ((Number) obj3).intValue(), ((Number) obj4).intValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m101491a(ContactProfile contactProfile, String str, int i11, int i12) {
            AbstractC29069a.o m101483e;
            AbstractC19074t.m100208f(contactProfile, "it");
            AbstractC19074t.m100208f(str, "name");
            if (this.f96201q.containsKey(contactProfile.f42434r)) {
                return;
            }
            HashMap hashMap = this.f96201q;
            String str2 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str2, "uid");
            String str3 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str3, "uid");
            hashMap.put(str2, str3);
            AbstractC19646n0.m103016p2(contactProfile);
            this.f96202r.add(contactProfile);
            if (i11 == 3) {
                a aVar = C19372y0.Companion;
                int m101487c = aVar.m101487c(contactProfile, 4);
                String str4 = contactProfile.f42437s;
                AbstractC19074t.m100207e(str4, "dpn");
                C23024b7 c23024b7 = C23024b7.f111993a;
                ArrayList arrayList = contactProfile.f42399a1;
                AbstractC19074t.m100207e(arrayList, "arrPosToHighlight");
                m101483e = a.m101483e(aVar, contactProfile, m101487c, str4, TextUtils.concat(C19372y0.m101476s(this.f96203s), c23024b7.m118057S(str, arrayList, c23024b7.m118064k())), null, null, null, 112, null);
            } else {
                a aVar2 = C19372y0.Companion;
                m101483e = a.m101483e(aVar2, contactProfile, aVar2.m101487c(contactProfile, 4), null, null, null, null, null, 124, null);
            }
            this.f96204t.add(m101483e);
        }
    }

    /* renamed from: ga0.y0$c */
    /* loaded from: classes6.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f96205q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.label_search_old_thread_name_prefix);
        }
    }

    /* renamed from: ga0.y0$d */
    /* loaded from: classes6.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f96206q = new d();

        d() {
            super(1);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a */
        public final String mo205i9(C32058p1 c32058p1) {
            AbstractC19074t.m100208f(c32058p1, "it");
            return c32058p1.m154671e().m153793y();
        }
    }

    /* renamed from: ga0.y0$e */
    /* loaded from: classes6.dex */
    static final class e extends AbstractC19075u implements InterfaceC18510q {

        /* renamed from: q */
        final /* synthetic */ HashMap f96207q;

        /* renamed from: r */
        final /* synthetic */ List f96208r;

        /* renamed from: s */
        final /* synthetic */ List f96209s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(HashMap hashMap, List list, List list2) {
            super(3);
            this.f96207q = hashMap;
            this.f96208r = list;
            this.f96209s = list2;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: Hr */
        public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
            m101494a((C32058p1) obj, (String) obj2, ((Number) obj3).floatValue());
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m101494a(C32058p1 c32058p1, String str, float f11) {
            AbstractC19074t.m100208f(c32058p1, "it");
            AbstractC19074t.m100208f(str, "name");
            if (this.f96207q.containsKey(c32058p1.m154674h())) {
                return;
            }
            this.f96207q.put(c32058p1.m154674h(), c32058p1.m154674h());
            ContactProfile m154670d = c32058p1.m154670d();
            if (m154670d == null) {
                m154670d = c32058p1.m154667a();
            }
            ContactProfile contactProfile = m154670d;
            contactProfile.f42387W = f11;
            List list = this.f96208r;
            a aVar = C19372y0.Companion;
            C23024b7 c23024b7 = C23024b7.f111993a;
            list.add(a.m101483e(aVar, contactProfile, 33554436, c23024b7.m118057S(str, this.f96209s, c23024b7.m118064k()), null, null, c32058p1, null, 88, null));
        }
    }

    /* renamed from: ga0.y0$f */
    /* loaded from: classes6.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final f f96210q = new f();

        f() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return AbstractC21935u.m114547n();
        }
    }

    /* renamed from: ga0.y0$g */
    /* loaded from: classes6.dex */
    static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final g f96211q = new g();

        g() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final String mo12V4() {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.title_strangermsg);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19372y0(InterfaceC18319c interfaceC18319c, String str, Map map) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(map, "uidExistThreadChatMap");
        this.f96200t = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m101472o(C19325g1 c19325g1, AbstractC29069a.o oVar) {
        AbstractC29069a.p pVar;
        C31973j5 c31973j5;
        C26727f m137466b;
        Object m131207g0;
        ContactProfile contactProfile = null;
        if (c19325g1.m101193S()) {
            c19325g1.m101173B().clear();
            List m101175C = c19325g1.m101175C();
            ArrayList<ContactProfile> arrayList = new ArrayList();
            for (Object obj : m101175C) {
                if (!C18644n.m98531l().m98558u(((ContactProfile) obj).f42434r)) {
                    arrayList.add(obj);
                }
            }
            for (ContactProfile contactProfile2 : arrayList) {
                Map m101173B = c19325g1.m101173B();
                String str = contactProfile2.f42434r;
                AbstractC19074t.m100207e(str, "uid");
                if (AbstractC23063f2.m118359k(contactProfile2.f42434r)) {
                    m137466b = c19325g1.m101171A().m137467c();
                } else if (AbstractC23063f2.m118360l(contactProfile2.f42434r)) {
                    m137466b = c19325g1.m101171A().m137469e();
                } else {
                    Iterator it = c19325g1.m101229o().iterator();
                    int i11 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (AbstractC19074t.m100204b(contactProfile2.f42434r, ((ContactProfile) it.next()).f42434r)) {
                            if (i11 != -1) {
                                m137466b = c19325g1.m101171A().m137468d();
                            }
                        } else {
                            i11++;
                        }
                    }
                    List list = (List) C28213v7.f131605c.get(contactProfile2.f42434r);
                    if (list != null) {
                        m131207g0 = AbstractC25332a0.m131207g0(list, 0);
                        String str2 = (String) m131207g0;
                        if (str2 != null) {
                            c31973j5 = C0943w.m4462l().m4472f(str2);
                            if (c31973j5 == null) {
                                m137466b = c19325g1.m101171A().m137465a(c31973j5.m153793y());
                            } else {
                                m137466b = c19325g1.m101171A().m137466b();
                            }
                        }
                    }
                    c31973j5 = null;
                    if (c31973j5 == null) {
                    }
                }
                m101173B.put(str, m137466b);
            }
            c19325g1.m101248x0(false);
        }
        C26727f c26727f = (C26727f) c19325g1.m101173B().get(oVar.m145198e().mo2478b());
        if (c26727f == null) {
            c26727f = c19325g1.m101171A().m137466b();
        }
        InterfaceC0861a m145198e = oVar.m145198e();
        if (m145198e instanceof ContactProfile) {
            contactProfile = (ContactProfile) m145198e;
        }
        if (contactProfile != null) {
            contactProfile.f42436r1 = c26727f.m137463a();
        }
        int m137464b = c26727f.m137464b();
        if (m137464b == c19325g1.m101171A().m137467c().m137464b()) {
            pVar = AbstractC29069a.p.d.f134718a;
        } else if (m137464b == c19325g1.m101171A().m137469e().m137464b()) {
            pVar = AbstractC29069a.p.a.f134715c;
        } else {
            pVar = AbstractC29069a.p.b.f134716c;
        }
        oVar.m145207n(pVar);
    }

    /* renamed from: p */
    private final void m101473p(C19325g1 c19325g1) {
        int m131511r;
        String str;
        if (c19325g1.m101186L()) {
            c19325g1.m101234q0(false);
            List<C31973j5> m4475i = C0943w.m4462l().m4475i();
            m131511r = AbstractC25370t.m131511r(m4475i, 10);
            ArrayList arrayList = new ArrayList(m131511r);
            for (C31973j5 c31973j5 : m4475i) {
                ContactProfile contactProfile = new ContactProfile("group_" + c31973j5.m153781r());
                contactProfile.f42437s = c31973j5.m153793y();
                if (c31973j5.m153786t0()) {
                    str = c31973j5.m153756e();
                } else {
                    str = contactProfile.f42446v;
                }
                contactProfile.f42446v = str;
                arrayList.add(contactProfile);
            }
            List m101217i = c19325g1.m101217i();
            synchronized (m101217i) {
                m101217i.clear();
                m101217i.addAll(arrayList);
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* renamed from: q */
    private static final String m101474q(InterfaceC24854k interfaceC24854k) {
        return (String) interfaceC24854k.getValue();
    }

    /* renamed from: r */
    private static final String m101475r(InterfaceC24854k interfaceC24854k) {
        return (String) interfaceC24854k.getValue();
    }

    /* renamed from: s */
    public static final String m101476s(InterfaceC24854k interfaceC24854k) {
        return (String) interfaceC24854k.getValue();
    }

    /* renamed from: t */
    private final void m101477t(String str, List list, List list2) {
        List m131187O0;
        ContactProfile m153138j;
        C31853b5 m114357s = C21927m.m114302u().m114357s();
        AbstractC19074t.m100207e(m114357s, "getFollowList(...)");
        m131187O0 = AbstractC25332a0.m131187O0(m114357s);
        AbstractC23262x6.m119979N(str, m131187O0, list, C19669z.f97573U, list2, C19322f1.f95950a.m101134I() | 34, this);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            try {
                if (!AbstractC25495a.m132086k(contactProfile.f42434r) && C21927m.m114302u().m114357s().m153137g(contactProfile.f42434r) && (m153138j = C21927m.m114302u().m114357s().m153138j(contactProfile.f42434r)) != null) {
                    AbstractC19074t.m100205c(m153138j);
                    contactProfile.f42352K0 = m153138j.f42447v0;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: u */
    private final void m101478u(C19325g1 c19325g1, List list) {
        String m101221k = c19325g1.m101221k();
        if (m101221k.length() > 0 && m101455l().length() == 4 && AbstractC19074t.m100204b(m101221k, AbstractC23352g.m122788d(m101455l()))) {
            ArrayList<ContactProfile> m114365x = C21927m.m114302u().m114365x();
            AbstractC19074t.m100207e(m114365x, "getListHiddenChat(...)");
            if (!m114365x.isEmpty()) {
                for (ContactProfile contactProfile : m114365x) {
                    a aVar = Companion;
                    AbstractC19074t.m100205c(contactProfile);
                    list.add(a.m101483e(aVar, contactProfile, aVar.m101487c(contactProfile, 1), null, null, null, null, null, 124, null));
                }
                AbstractC23647d.m123906p("22001311");
                AbstractC23647d.m123893c();
            }
            if (m114365x.size() < C21927m.m114302u().m114358t().size()) {
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                Iterator it = m114365x.iterator();
                while (it.hasNext()) {
                    hashSet.add(((ContactProfile) it.next()).f42434r);
                }
                for (ContactProfile contactProfile2 : new ArrayList(C21927m.m114302u().m114358t().values())) {
                    String str = contactProfile2.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    if (str.length() > 0 && !contactProfile2.m40374K0() && !hashSet.contains(contactProfile2.f42434r)) {
                        arrayList.add(contactProfile2.f42434r);
                    }
                }
                if (!arrayList.isEmpty()) {
                    AbstractC23184q2.m119463u(arrayList, new Runnable() { // from class: ga0.x0
                        public /* synthetic */ RunnableC19370x0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            C19372y0.m101479w(C19372y0.this);
                        }
                    });
                }
            }
            if (C26688i.f126427a.m137069c()) {
                for (C32058p1 c32058p1 : C25489b.f122105a.m132049k()) {
                    if (c32058p1.m154675i()) {
                        C32020m7 c32020m7 = new C32020m7(43);
                        c32020m7.f147419j = c32058p1;
                        ContactProfile m154670d = c32058p1.m154670d();
                        if (m154670d == null) {
                            m154670d = c32058p1.m154667a();
                        }
                        ContactProfile contactProfile3 = m154670d;
                        c32020m7.f147411b = contactProfile3;
                        a aVar2 = Companion;
                        AbstractC19074t.m100207e(contactProfile3, "profileData");
                        ContactProfile contactProfile4 = c32020m7.f147411b;
                        AbstractC19074t.m100207e(contactProfile4, "profileData");
                        list.add(a.m101483e(aVar2, contactProfile3, aVar2.m101487c(contactProfile4, 33554433), null, null, null, c32020m7.f147419j, null, 92, null));
                    }
                }
            }
        }
    }

    /* renamed from: w */
    public static final void m101479w(C19372y0 c19372y0) {
        AbstractC19074t.m100208f(c19372y0, "this$0");
        if (!c19372y0.isCancelled()) {
            c19372y0.m101436c();
        }
        c19372y0.mo205i9(new C18316b("ACTION_START_SEARCH_TASK", null, null, null, 14, null));
    }

    /* renamed from: x */
    private final void m101480x(List list, C19325g1 c19325g1, String str, HashMap hashMap, List list2, List list3, boolean z11, boolean z12) {
        boolean z13;
        ArrayList<ContactProfile> arrayList = new ArrayList();
        if (z11) {
            C18635e mo98465a = C18644n.m98531l().mo98465a(null, false);
            Map map = C19669z.f97573U;
            int i11 = (c19325g1.m101196V() ? 1 : 0) | 42;
            C19322f1 c19322f1 = C19322f1.f95950a;
            AbstractC23262x6.m119979N(str, mo98465a, arrayList, map, list3, i11 | c19322f1.m101134I(), this);
            AbstractC23262x6.m119979N(str, list2, arrayList, map, list3, (c19325g1.m101196V() ? 1 : 0) | 42 | c19322f1.m101134I(), this);
        }
        if (isCancelled()) {
            return;
        }
        if (z12) {
            AbstractC23262x6.m119981P(str, arrayList, C19669z.f97573U, list3, C19322f1.f95950a.m101134I() | 10, this);
        }
        if (isCancelled()) {
            return;
        }
        for (ContactProfile contactProfile : arrayList) {
            if (!hashMap.containsKey(contactProfile.f42434r)) {
                boolean m40374K0 = contactProfile.m40374K0();
                boolean z14 = true;
                if (!contactProfile.m40387S0() && !AbstractC25495a.m132086k(contactProfile.f42434r) && !C21927m.m114302u().m114318P(contactProfile.f42434r) && !AbstractC23304d.f113417o.containsKey(contactProfile.f42434r) && !AbstractC21935u.m114518H(contactProfile.f42434r)) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (!C18644n.m98531l().m98558u(contactProfile.f42434r) || z13) {
                    z14 = false;
                }
                if (m40374K0) {
                    AbstractC19646n0.m103016p2(contactProfile);
                    list.add(a.m101483e(Companion, contactProfile, 66052, null, null, null, null, null, 124, null));
                    String str2 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str2, "uid");
                    String str3 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str3, "uid");
                    hashMap.put(str2, str3);
                } else if (z14) {
                    AbstractC19646n0.m103016p2(contactProfile);
                    a aVar = Companion;
                    list.add(a.m101483e(aVar, contactProfile, aVar.m101485a(contactProfile) | 66050, null, null, AbstractC29069a.p.l.f134728b, null, null, 108, null));
                    String str4 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str4, "uid");
                    String str5 = contactProfile.f42434r;
                    AbstractC19074t.m100207e(str5, "uid");
                    hashMap.put(str4, str5);
                }
            }
        }
    }

    /* renamed from: y */
    private final void m101481y(List list, C19325g1 c19325g1, String str, List list2, Map map) {
        if (c19325g1.m101187M()) {
            c19325g1.m101236r0(false);
            List m103199P = C19669z.Companion.m103232a().m103199P();
            synchronized (c19325g1.m101175C()) {
                c19325g1.m101175C().clear();
                c19325g1.m101175C().addAll(m103199P);
            }
        }
        ArrayList<ContactProfile> arrayList = new ArrayList();
        arrayList.addAll(c19325g1.m101175C());
        this.f96200t.clear();
        for (ContactProfile contactProfile : arrayList) {
            Map map2 = this.f96200t;
            String str2 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str2, "uid");
            String str3 = contactProfile.f42434r;
            AbstractC19074t.m100207e(str3, "uid");
            map2.put(str2, str3);
        }
        AbstractC23262x6.m119984S(str, arrayList, list, C19669z.f97573U, list2, map, C19322f1.f95950a.m101134I() | ZVideoUtilMetadata.FF_PROFILE_H264_INTRA, this, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:            if (r2.length == 0) goto L51;     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m101482z(List list, C19325g1 c19325g1, String str, List list2, Map map) {
        String m127114D;
        if (c19325g1.m101194T()) {
            c19325g1.m101250y0(false);
            ArrayList arrayList = new ArrayList();
            ContactProfile contactProfile = new ContactProfile("-8");
            contactProfile.f42437s = AbstractC23136l9.m118743r0(AbstractC8020f0.oa_msg_thread_title);
            arrayList.add(contactProfile);
            String[] strArr = AbstractC23304d.f113367c;
            if (strArr != null) {
                AbstractC19074t.m100207e(strArr, "mArrayLanguageAsCode");
            }
            AbstractC23304d.f113367c = AbstractC23136l9.m118755v0(AbstractC16775v.array_language_as_code);
            if (!C3441j.f14459a.m17295a()) {
                String[] strArr2 = AbstractC23304d.f113367c;
                if (strArr2 == null) {
                    strArr2 = new String[0];
                }
                for (String str2 : strArr2) {
                    ContactProfile contactProfile2 = new ContactProfile("-2");
                    contactProfile2.f42437s = AbstractC23136l9.m118675S(new Locale(str2), AbstractC8020f0.title_strangermsg);
                    contactProfile2.f42446v = "https://res-zalo.zadn.vn/upload/media/2018/4/19/ava_stranger_1524105999293.png";
                    contactProfile2.f42359M1 = true;
                    arrayList.add(contactProfile2);
                }
            }
            synchronized (c19325g1.m101175C()) {
                c19325g1.m101179E().clear();
                c19325g1.m101179E().addAll(arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(c19325g1.m101179E());
        Map map2 = C19669z.f97573U;
        C19322f1 c19322f1 = C19322f1.f95950a;
        AbstractC23262x6.m119984S(str, arrayList2, list, map2, list2, map, c19322f1.m101134I() | 34816, this, false);
        AbstractC23262x6.m119977L(MainApplication.Companion.m35500c(), str, list, list2, c19322f1.m101134I() | 32768, this);
        for (C24860q c24860q : C26323a.f124999a.m135469a()) {
            if (AbstractC19074t.m100204b(str, "@devtools") || AbstractC19074t.m100204b(str, c24860q.m129215c())) {
                m127114D = AbstractC24341v.m127114D((String) c24860q.m129215c(), "@", "", false, 4, null);
                ContactProfile contactProfile3 = new ContactProfile("@devtool:52s1kx:" + m127114D);
                contactProfile3.f42437s = (String) c24860q.m129215c();
                contactProfile3.f42446v = C23302b.f113247a.m120521a();
                contactProfile3.f42436r1 = new SpannableStringBuilder((CharSequence) c24860q.m129216d());
                list.add(contactProfile3);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:177|178|179)|(2:180|181)|182|(1:184)|185|186|(1:188)|189|190|(1:192)|193|(4:195|(4:198|(3:200|201|202)(1:204)|203|196)|205|206)|207|(1:209)(9:210|211|212|213|214|215|(1:217)|218|(1:220)(8:221|(4:224|(2:226|227)(2:229|230)|228|222)|231|232|(4:235|(2:237|238)(2:240|241)|239|233)|242|243|(1:245)(6:246|(10:317|318|319|320|321|322|323|324|325|(1:327))(1:248)|249|(1:316)(7:257|258|259|260|261|262|(1:264))|265|(1:267)(18:268|(2:270|(2:272|(1:(1:307)(2:274|(2:277|278)(1:276)))))(1:309)|308|281|(1:283)(1:306)|284|(1:286)(1:305)|287|(1:289)|290|(2:293|291)|294|295|(1:297)(1:304)|298|(1:300)(1:303)|301|302))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:18|(3:19|20|21)|(2:22|23)|24|(1:26)|27|(3:30|(2:70|71)(3:32|(4:34|(1:67)(1:44)|45|(1:(2:52|(2:54|55)(1:57))(1:(2:59|60)(1:61))))(2:68|69)|56)|28)|72|73|(3:74|75|76)|(2:77|78)|79|(1:81)|82|83|84|(1:86)(1:354)|87|(4:90|(2:92|93)(7:95|96|(2:98|(4:100|(2:105|106)|113|106)(1:114))(2:115|(1:128)(5:119|(3:124|125|126)|127|125|126))|107|(1:109)(1:112)|110|111)|94|88)|129|130|131|(1:133)|134|(1:136)(2:137|(1:139)(2:140|(1:142)(8:143|(4:146|(1:161)(3:148|149|(5:155|156|(1:158)|159|160)(3:151|152|153))|154|144)|162|163|(4:166|(3:168|169|170)(1:172)|171|164)|173|174|(1:176)(17:177|178|179|180|181|182|(1:184)|185|186|(1:188)|189|190|(1:192)|193|(4:195|(4:198|(3:200|201|202)(1:204)|203|196)|205|206)|207|(1:209)(9:210|211|212|213|214|215|(1:217)|218|(1:220)(8:221|(4:224|(2:226|227)(2:229|230)|228|222)|231|232|(4:235|(2:237|238)(2:240|241)|239|233)|242|243|(1:245)(6:246|(10:317|318|319|320|321|322|323|324|325|(1:327))(1:248)|249|(1:316)(7:257|258|259|260|261|262|(1:264))|265|(1:267)(18:268|(2:270|(2:272|(1:(1:307)(2:274|(2:277|278)(1:276)))))(1:309)|308|281|(1:283)(1:306)|284|(1:286)(1:305)|287|(1:289)|290|(2:293|291)|294|295|(1:297)(1:304)|298|(1:300)(1:303)|301|302))))))))) */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0792, code lost:            if (r4 == (-1)) goto L680;     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0798, code lost:            r1 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0506, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x050f, code lost:            r1 = pm0.C24861r.f119264q;        r0 = pm0.C24861r.m129218b(pm0.AbstractC24862s.m129227a(r0));     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x029b, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0392, code lost:            r1 = pm0.C24861r.f119264q;        r0 = pm0.C24861r.m129218b(pm0.AbstractC24862s.m129227a(r0));     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04e6 A[Catch: all -> 0x0506, TryCatch #2 {all -> 0x0506, blocks: (B:186:0x04de, B:188:0x04e6, B:189:0x0508), top: B:185:0x04de }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x052c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0580 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0581 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x075f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0250 A[Catch: all -> 0x029b, TryCatch #14 {all -> 0x029b, blocks: (B:84:0x022c, B:87:0x0244, B:88:0x024a, B:90:0x0250, B:95:0x0262, B:98:0x026e, B:100:0x027a, B:102:0x028d, B:105:0x0294, B:106:0x02b6, B:107:0x0367, B:110:0x0381, B:113:0x029e, B:114:0x02cc, B:115:0x02ec, B:117:0x02f6, B:119:0x0302, B:121:0x0315, B:124:0x031c, B:126:0x0336, B:127:0x0321, B:128:0x034b, B:130:0x038b), top: B:83:0x022c }] */
    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void run() {
        List list;
        String str;
        C19325g1 c19325g1;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashMap hashMap;
        Object m129218b;
        Throwable m129221e;
        Iterator it;
        String str2;
        Object m129218b2;
        Throwable m129221e2;
        Throwable m129221e3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object m129218b3;
        Throwable m129221e4;
        Throwable m129221e5;
        C19372y0 c19372y0;
        List list2;
        String str3;
        Object m129218b4;
        Throwable m129221e6;
        ArrayList arrayList5;
        Object m129218b5;
        Throwable m129221e7;
        a aVar;
        List[] listArr;
        ArrayList arrayList6;
        List list3;
        String str4;
        HashMap hashMap2;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i11;
        char c11;
        char c12;
        String str5;
        boolean m127137G0;
        Object m129218b6;
        Throwable m129221e8;
        ArrayList arrayList9;
        List m131320c;
        ArrayList arrayList10;
        List m131320c2;
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k interfaceC24854k;
        AbstractC29069a.o m101483e;
        Spannable m118057S;
        Spannable m118057S2;
        Iterator it2;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        boolean m127120J;
        C18316b c18316b;
        ArrayList arrayList14 = new ArrayList();
        ArrayList<AbstractC29069a> arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        ArrayList arrayList21 = new ArrayList();
        ArrayList arrayList22 = new ArrayList();
        InterfaceC18319c m101438e = m101438e();
        Object m97245a = (m101438e == null || (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) == null) ? null : c18316b.m97245a();
        C19325g1 c19325g12 = m97245a instanceof C19325g1 ? (C19325g1) m97245a : null;
        if (c19325g12 == null) {
            return;
        }
        m101473p(c19325g12);
        m101478u(c19325g12, arrayList14);
        if (isCancelled()) {
            return;
        }
        String m101455l = m101455l();
        String[] m118488a = C23282z6.m120367c(m101455l, 4096).m118488a();
        ArrayList arrayList23 = new ArrayList();
        List m101489f = Companion.m101489f(c19325g12, m101455l());
        if (isCancelled()) {
            return;
        }
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList24 = new ArrayList();
        ArrayList<ContactProfile> arrayList25 = new ArrayList();
        ArrayList<ContactProfile> arrayList26 = new ArrayList();
        ArrayList arrayList27 = new ArrayList();
        ArrayList<ContactProfile> arrayList28 = new ArrayList();
        ArrayList<ContactProfile> arrayList29 = new ArrayList();
        HashMap hashMap4 = new HashMap();
        ArrayList<ContactProfile> arrayList30 = new ArrayList();
        ArrayList<ContactProfile> arrayList31 = new ArrayList();
        try {
            C24861r.a aVar2 = C24861r.f119264q;
            arrayList2 = arrayList20;
            hashMap = hashMap3;
            list = m101489f;
            str = m101455l;
            c19325g1 = c19325g12;
            arrayList = arrayList22;
        } catch (Throwable th2) {
            th = th2;
            list = m101489f;
            str = m101455l;
            c19325g1 = c19325g12;
            arrayList = arrayList22;
            arrayList2 = arrayList20;
            hashMap = hashMap3;
        }
        try {
            m101481y(arrayList24, c19325g12, str, list, hashMap4);
            m129218b = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th3) {
            th = th3;
            C24861r.a aVar3 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th));
            m129221e = C24861r.m129221e(m129218b);
            if (m129221e != null) {
            }
            it = arrayList24.iterator();
            while (it.hasNext()) {
            }
            ArrayList arrayList32 = arrayList21;
            ArrayList arrayList33 = arrayList27;
            ArrayList arrayList34 = arrayList18;
            C24861r.a aVar4 = C24861r.f119264q;
            str2 = "uid";
            m101482z(arrayList28, c19325g1, str, list, hashMap4);
            m129218b2 = C24861r.m129218b(C24848g0.f119245a);
            m129221e2 = C24861r.m129221e(m129218b2);
            if (m129221e2 != null) {
            }
            m129210a2 = AbstractC24856m.m129210a(g.f96211q);
            m129210a3 = AbstractC24856m.m129210a(f.f96210q);
            int i12 = 8 | (C19322f1.f95950a.m101155l() ? 8388608 : 0);
            while (r3.hasNext()) {
            }
            Object m129218b7 = C24861r.m129218b(C24848g0.f119245a);
            m129221e3 = C24861r.m129221e(m129218b7);
            if (m129221e3 != null) {
            }
            if (isCancelled()) {
            }
        }
        m129221e = C24861r.m129221e(m129218b);
        if (m129221e != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e);
        }
        it = arrayList24.iterator();
        while (it.hasNext()) {
            ContactProfile contactProfile = (ContactProfile) it.next();
            if (isCancelled()) {
                return;
            }
            if (hashMap.containsKey(contactProfile.f42434r)) {
                it2 = it;
                arrayList11 = arrayList21;
                arrayList12 = arrayList27;
                arrayList13 = arrayList18;
            } else {
                boolean m98558u = C18644n.m98531l().m98558u(contactProfile.f42434r);
                boolean m40374K0 = contactProfile.m40374K0();
                boolean z11 = contactProfile.m40387S0() || AbstractC25495a.m132086k(contactProfile.f42434r) || C21927m.m114302u().m114318P(contactProfile.f42434r) || AbstractC23304d.f113417o.containsKey(contactProfile.f42434r) || AbstractC21935u.m114518H(contactProfile.f42434r);
                boolean m100204b = AbstractC19074t.m100204b(contactProfile.f42434r, "-2");
                boolean m100204b2 = AbstractC19074t.m100204b(contactProfile.f42434r, "-8");
                boolean m132078c = AbstractC25495a.m132078c(contactProfile.f42434r);
                it2 = it;
                String str6 = contactProfile.f42434r;
                AbstractC19074t.m100207e(str6, "uid");
                arrayList11 = arrayList21;
                arrayList12 = arrayList27;
                arrayList13 = arrayList18;
                m127120J = AbstractC24341v.m127120J(str6, "@devtool:", false, 2, null);
                if (!m100204b2 && !m100204b && !m132078c && !m127120J && !m40374K0) {
                    if (z11) {
                        arrayList31.add(contactProfile);
                        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, contactProfile.f42434r, null, 2, null);
                        if (m141798e != null) {
                            contactProfile.f42352K0 = m141798e.f42352K0;
                            contactProfile.f42447v0 = m141798e.f42447v0;
                            C24848g0 c24848g0 = C24848g0.f119245a;
                        }
                    } else if (!m98558u) {
                        AbstractC19646n0.m103016p2(contactProfile);
                        arrayList25.add(contactProfile);
                    }
                }
            }
            it = it2;
            arrayList21 = arrayList11;
            arrayList27 = arrayList12;
            arrayList18 = arrayList13;
        }
        ArrayList arrayList322 = arrayList21;
        ArrayList arrayList332 = arrayList27;
        ArrayList arrayList342 = arrayList18;
        try {
            C24861r.a aVar42 = C24861r.f119264q;
            str2 = "uid";
        } catch (Throwable th4) {
            th = th4;
            str2 = "uid";
        }
        try {
            m101482z(arrayList28, c19325g1, str, list, hashMap4);
            m129218b2 = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th5) {
            th = th5;
            C24861r.a aVar5 = C24861r.f119264q;
            m129218b2 = C24861r.m129218b(AbstractC24862s.m129227a(th));
            m129221e2 = C24861r.m129221e(m129218b2);
            if (m129221e2 != null) {
            }
            m129210a2 = AbstractC24856m.m129210a(g.f96211q);
            m129210a3 = AbstractC24856m.m129210a(f.f96210q);
            int i122 = 8 | (C19322f1.f95950a.m101155l() ? 8388608 : 0);
            while (r3.hasNext()) {
            }
            Object m129218b72 = C24861r.m129218b(C24848g0.f119245a);
            m129221e3 = C24861r.m129221e(m129218b72);
            if (m129221e3 != null) {
            }
            if (isCancelled()) {
            }
        }
        m129221e2 = C24861r.m129221e(m129218b2);
        if (m129221e2 != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e2);
        }
        m129210a2 = AbstractC24856m.m129210a(g.f96211q);
        m129210a3 = AbstractC24856m.m129210a(f.f96210q);
        int i1222 = 8 | (C19322f1.f95950a.m101155l() ? 8388608 : 0);
        for (ContactProfile contactProfile2 : arrayList28) {
            if (hashMap.containsKey(contactProfile2.f42434r)) {
                interfaceC24854k = m129210a3;
            } else {
                if (AbstractC25495a.m132078c(contactProfile2.f42434r)) {
                    if (!AbstractC19074t.m100204b(contactProfile2.f42437s, m101475r(m129210a3))) {
                        a aVar6 = Companion;
                        int m101487c = aVar6.m101487c(contactProfile2, i1222);
                        String m101475r = m101475r(m129210a3);
                        AbstractC19074t.m100207e(m101475r, "run$lambda$10$lambda$8(...)");
                        SpannableStringBuilder spannableStringBuilder = contactProfile2.f42436r1;
                        if (spannableStringBuilder != null && spannableStringBuilder.length() != 0) {
                            interfaceC24854k = m129210a3;
                            m118057S2 = contactProfile2.f42436r1;
                            m101483e = a.m101483e(aVar6, contactProfile2, m101487c, m101475r, m118057S2, null, null, null, 112, null);
                        }
                        C23024b7 c23024b7 = C23024b7.f111993a;
                        interfaceC24854k = m129210a3;
                        String str7 = contactProfile2.f42437s;
                        AbstractC19074t.m100207e(str7, "dpn");
                        ArrayList arrayList35 = contactProfile2.f42399a1;
                        AbstractC19074t.m100207e(arrayList35, "arrPosToHighlight");
                        m118057S2 = c23024b7.m118057S(str7, arrayList35, c23024b7.m118064k());
                        m101483e = a.m101483e(aVar6, contactProfile2, m101487c, m101475r, m118057S2, null, null, null, 112, null);
                    } else {
                        interfaceC24854k = m129210a3;
                        a aVar7 = Companion;
                        m101483e = a.m101483e(aVar7, contactProfile2, aVar7.m101487c(contactProfile2, i1222), null, null, null, null, null, 124, null);
                    }
                } else {
                    interfaceC24854k = m129210a3;
                    if (AbstractC25495a.m132084i(contactProfile2.f42434r) && !AbstractC19074t.m100204b(contactProfile2.f42437s, m101474q(m129210a2))) {
                        a aVar8 = Companion;
                        int m101487c2 = aVar8.m101487c(contactProfile2, i1222);
                        String m101474q = m101474q(m129210a2);
                        AbstractC19074t.m100207e(m101474q, "run$lambda$10$lambda$7(...)");
                        SpannableStringBuilder spannableStringBuilder2 = contactProfile2.f42436r1;
                        if (spannableStringBuilder2 != null && spannableStringBuilder2.length() != 0) {
                            m118057S = contactProfile2.f42436r1;
                            m101483e = a.m101483e(aVar8, contactProfile2, m101487c2, m101474q, m118057S, null, null, null, 112, null);
                        }
                        C23024b7 c23024b72 = C23024b7.f111993a;
                        String str8 = contactProfile2.f42437s;
                        AbstractC19074t.m100207e(str8, "dpn");
                        ArrayList arrayList36 = contactProfile2.f42399a1;
                        AbstractC19074t.m100207e(arrayList36, "arrPosToHighlight");
                        m118057S = c23024b72.m118057S(str8, arrayList36, c23024b72.m118064k());
                        m101483e = a.m101483e(aVar8, contactProfile2, m101487c2, m101474q, m118057S, null, null, null, 112, null);
                    } else {
                        a aVar9 = Companion;
                        m101483e = a.m101483e(aVar9, contactProfile2, aVar9.m101487c(contactProfile2, i1222), null, null, null, null, null, 124, null);
                    }
                }
                String str9 = contactProfile2.f42434r;
                AbstractC19074t.m100207e(str9, str2);
                String str10 = contactProfile2.f42434r;
                AbstractC19074t.m100207e(str10, str2);
                hashMap.put(str9, str10);
                (C19322f1.f95950a.m101155l() ? arrayList17 : arrayList16).add(m101483e);
            }
            m129210a3 = interfaceC24854k;
        }
        Object m129218b722 = C24861r.m129218b(C24848g0.f119245a);
        m129221e3 = C24861r.m129221e(m129218b722);
        if (m129221e3 != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e3);
        }
        if (isCancelled()) {
            return;
        }
        C18635e mo98465a = C18644n.m98531l().mo98465a(null, true);
        Map map = C19669z.f97573U;
        int i13 = (c19325g1.m101196V() ? 1 : 0) | 32802;
        C19322f1 c19322f1 = C19322f1.f95950a;
        ArrayList arrayList37 = arrayList322;
        AbstractC23262x6.m119979N(str, mo98465a, arrayList26, map, list, i13 | c19322f1.m101134I(), this);
        if (isCancelled()) {
            return;
        }
        AbstractC23262x6.m119979N(str, arrayList23, arrayList26, map, list, (c19325g1.m101196V() ? 1 : 0) | 32802 | c19322f1.m101134I(), this);
        if (isCancelled()) {
            return;
        }
        ArrayList arrayList38 = new ArrayList();
        for (ContactProfile contactProfile3 : arrayList26) {
            if (!hashMap.containsKey(contactProfile3.f42434r)) {
                if (!AbstractC25495a.m132086k(contactProfile3.f42434r)) {
                    AbstractC19646n0.m103016p2(contactProfile3);
                    a aVar10 = Companion;
                    int m101485a = aVar10.m101485a(contactProfile3);
                    arrayList15.add(a.m101483e(aVar10, contactProfile3, m101485a | 2, null, null, null, null, null, 124, null));
                    if (m101485a == 0) {
                        arrayList38.add(contactProfile3);
                    }
                    String str11 = contactProfile3.f42434r;
                    AbstractC19074t.m100207e(str11, str2);
                    String str12 = contactProfile3.f42434r;
                    AbstractC19074t.m100207e(str12, str2);
                    hashMap.put(str11, str12);
                } else {
                    arrayList30.add(contactProfile3);
                }
            }
        }
        for (AbstractC29069a abstractC29069a : arrayList15) {
            if (abstractC29069a instanceof AbstractC29069a.o) {
                ((AbstractC29069a.o) abstractC29069a).m145207n(AbstractC29069a.p.l.f134728b);
            }
        }
        AbstractC23262x6.m119983R(arrayList29, arrayList38, false, true, C19669z.f97573U, list, this);
        if (isCancelled()) {
            return;
        }
        try {
            C24861r.a aVar11 = C24861r.f119264q;
            m129210a = AbstractC24856m.m129210a(c.f96205q);
            arrayList3 = arrayList332;
            arrayList4 = arrayList342;
        } catch (Throwable th6) {
            th = th6;
            arrayList3 = arrayList332;
            arrayList4 = arrayList342;
        }
        try {
            C22709h.m117427b(c19325g1.m101217i(), str, list, C19322f1.f95950a.m101134I() | 32770, C22703b.f111248a, new b(hashMap, arrayList3, m129210a, arrayList4));
            m129218b3 = C24861r.m129218b(C24848g0.f119245a);
        } catch (Throwable th7) {
            th = th7;
            C24861r.a aVar12 = C24861r.f119264q;
            m129218b3 = C24861r.m129218b(AbstractC24862s.m129227a(th));
            m129221e4 = C24861r.m129221e(m129218b3);
            if (m129221e4 != null) {
            }
            if (C26688i.f126427a.m137069c()) {
            }
            Object m129218b8 = C24861r.m129218b(C24848g0.f119245a);
            m129221e5 = C24861r.m129221e(m129218b8);
            if (m129221e5 != null) {
            }
            if (!arrayList29.isEmpty()) {
            }
            if (isCancelled()) {
            }
        }
        m129221e4 = C24861r.m129221e(m129218b3);
        if (m129221e4 != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e4);
        }
        if (C26688i.f126427a.m137069c()) {
            ArrayList arrayList39 = new ArrayList();
            C22709h.m117426a(C25489b.f122105a.m132049k(), str, 0, arrayList39, null, d.f96206q, new e(hashMap, arrayList4, arrayList39));
        }
        Object m129218b82 = C24861r.m129218b(C24848g0.f119245a);
        m129221e5 = C24861r.m129221e(m129218b82);
        if (m129221e5 != null) {
            AbstractC20110a.f98889a.mo104552e(m129221e5);
        }
        if (!arrayList29.isEmpty()) {
            for (ContactProfile contactProfile4 : arrayList29) {
                if (!hashMap.containsKey(contactProfile4.f42434r)) {
                    AbstractC19646n0.m103016p2(contactProfile4);
                    arrayList4.add(a.m101483e(Companion, contactProfile4, 67108868, null, null, null, null, null, 124, null));
                    String str13 = contactProfile4.f42434r;
                    AbstractC19074t.m100207e(str13, str2);
                    String str14 = contactProfile4.f42434r;
                    AbstractC19074t.m100207e(str14, str2);
                    hashMap.put(str13, str14);
                }
            }
            AbstractC25376w.m131534w(arrayList4, C19342m0.Companion.m101360f());
        }
        if (isCancelled()) {
            try {
                C24861r.a aVar13 = C24861r.f119264q;
                c19372y0 = this;
                list2 = list;
                str3 = str;
            } catch (Throwable th8) {
                th = th8;
                c19372y0 = this;
                list2 = list;
                str3 = str;
            }
            try {
                c19372y0.m101477t(str3, arrayList30, list2);
                m129218b4 = C24861r.m129218b(C24848g0.f119245a);
            } catch (Throwable th9) {
                th = th9;
                C24861r.a aVar14 = C24861r.f119264q;
                m129218b4 = C24861r.m129218b(AbstractC24862s.m129227a(th));
                m129221e6 = C24861r.m129221e(m129218b4);
                if (m129221e6 != null) {
                }
                C24861r.m129217a(m129218b4);
                if (isCancelled()) {
                }
            }
            m129221e6 = C24861r.m129221e(m129218b4);
            if (m129221e6 != null) {
                AbstractC20110a.f98889a.mo104552e(m129221e6);
            }
            C24861r.m129217a(m129218b4);
            if (isCancelled()) {
                for (ContactProfile contactProfile5 : arrayList30) {
                    if (hashMap.containsKey(contactProfile5.f42434r)) {
                        arrayList10 = arrayList37;
                    } else {
                        String spannableStringBuilder3 = contactProfile5.f42436r1.toString();
                        m131320c2 = AbstractC25356m.m131320c(m118488a);
                        contactProfile5.f42436r1 = AbstractC23217t2.m119655g(spannableStringBuilder3, m131320c2, 0);
                        arrayList10 = arrayList37;
                        arrayList10.add(a.m101483e(Companion, contactProfile5, 16, null, null, null, null, null, 124, null));
                        String str15 = contactProfile5.f42434r;
                        AbstractC19074t.m100207e(str15, str2);
                        String str16 = contactProfile5.f42434r;
                        AbstractC19074t.m100207e(str16, str2);
                        hashMap.put(str15, str16);
                    }
                    arrayList37 = arrayList10;
                }
                ArrayList arrayList40 = arrayList37;
                C24848g0 c24848g02 = C24848g0.f119245a;
                for (ContactProfile contactProfile6 : arrayList31) {
                    if (hashMap.containsKey(contactProfile6.f42434r)) {
                        arrayList9 = arrayList;
                    } else {
                        String spannableStringBuilder4 = contactProfile6.f42436r1.toString();
                        m131320c = AbstractC25356m.m131320c(m118488a);
                        contactProfile6.f42436r1 = AbstractC23217t2.m119655g(spannableStringBuilder4, m131320c, 0);
                        arrayList9 = arrayList;
                        arrayList9.add(a.m101483e(Companion, contactProfile6, 16, null, null, null, null, null, 124, null));
                        String str17 = contactProfile6.f42434r;
                        AbstractC19074t.m100207e(str17, str2);
                        String str18 = contactProfile6.f42434r;
                        AbstractC19074t.m100207e(str18, str2);
                        hashMap.put(str17, str18);
                    }
                    arrayList = arrayList9;
                }
                ArrayList arrayList41 = arrayList;
                C24848g0 c24848g03 = C24848g0.f119245a;
                if (isCancelled()) {
                    return;
                }
                if (C19322f1.f95950a.m101161r()) {
                    try {
                        C24861r.a aVar15 = C24861r.f119264q;
                        aVar = Companion;
                        listArr = new List[5];
                        listArr[0] = arrayList26;
                        listArr[1] = arrayList3;
                        try {
                            listArr[2] = arrayList30;
                            listArr[3] = arrayList28;
                            listArr[4] = arrayList25;
                            arrayList5 = arrayList2;
                        } catch (Throwable th10) {
                            th = th10;
                            arrayList5 = arrayList2;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        arrayList5 = arrayList2;
                    }
                    try {
                        aVar.m101490h(c19372y0, arrayList5, listArr);
                        m129218b5 = C24861r.m129218b(C24848g0.f119245a);
                    } catch (Throwable th12) {
                        th = th12;
                        C24861r.a aVar16 = C24861r.f119264q;
                        m129218b5 = C24861r.m129218b(AbstractC24862s.m129227a(th));
                        m129221e7 = C24861r.m129221e(m129218b5);
                        if (m129221e7 != null) {
                        }
                        if (C19322f1.f95950a.m101157n()) {
                        }
                        arrayList6 = arrayList40;
                        list3 = list2;
                        str4 = str3;
                        hashMap2 = hashMap;
                        arrayList7 = arrayList41;
                        arrayList8 = arrayList19;
                        i11 = 2;
                        c11 = 3;
                        c12 = 5;
                        if (isCancelled()) {
                        }
                    }
                    m129221e7 = C24861r.m129221e(m129218b5);
                    if (m129221e7 != null) {
                        AbstractC20110a.f98889a.mo104552e(m129221e7);
                    }
                } else {
                    arrayList5 = arrayList2;
                }
                if (C19322f1.f95950a.m101157n() || m101455l().length() < 3 || !(arrayList15.isEmpty() || arrayList4.isEmpty())) {
                    arrayList6 = arrayList40;
                    list3 = list2;
                    str4 = str3;
                    hashMap2 = hashMap;
                    arrayList7 = arrayList41;
                    arrayList8 = arrayList19;
                    i11 = 2;
                    c11 = 3;
                    c12 = 5;
                } else {
                    try {
                        C24861r.a aVar17 = C24861r.f119264q;
                        i11 = 2;
                        c11 = 3;
                        c12 = 5;
                        arrayList6 = arrayList40;
                        list3 = list2;
                        str4 = str3;
                        hashMap2 = hashMap;
                        arrayList7 = arrayList41;
                        arrayList8 = arrayList19;
                    } catch (Throwable th13) {
                        th = th13;
                        arrayList6 = arrayList40;
                        list3 = list2;
                        str4 = str3;
                        hashMap2 = hashMap;
                        arrayList7 = arrayList41;
                        arrayList8 = arrayList19;
                        i11 = 2;
                        c11 = 3;
                        c12 = 5;
                    }
                    try {
                        m101480x(arrayList19, c19325g1, str3, hashMap, arrayList23, list3, arrayList15.isEmpty(), arrayList4.isEmpty());
                        m129218b6 = C24861r.m129218b(C24848g0.f119245a);
                    } catch (Throwable th14) {
                        th = th14;
                        C24861r.a aVar18 = C24861r.f119264q;
                        m129218b6 = C24861r.m129218b(AbstractC24862s.m129227a(th));
                        m129221e8 = C24861r.m129221e(m129218b6);
                        if (m129221e8 != null) {
                        }
                        if (isCancelled()) {
                        }
                    }
                    m129221e8 = C24861r.m129221e(m129218b6);
                    if (m129221e8 != null) {
                        AbstractC20110a.f98889a.mo104552e(m129221e8);
                    }
                }
                if (isCancelled()) {
                    return;
                }
                C19325g1 c19325g13 = c19325g1;
                boolean m101486b = Companion.m101486b(c19325g13, m101455l());
                if (m101486b) {
                    str5 = str4;
                    if (Character.isDigit(str5.charAt(str4.length() - 1))) {
                        int length = str5.length();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                break;
                            } else if (!Character.isLetter(str5.charAt(i14))) {
                                i14++;
                            }
                        }
                    }
                } else {
                    str5 = str4;
                }
                boolean z12 = false;
                m127137G0 = AbstractC24342w.m127137G0(str5, '@', false, i11, null);
                AbstractC29073e[] abstractC29073eArr = new AbstractC29073e[10];
                AbstractC29076h.j jVar = AbstractC29076h.j.f134824b;
                String m101455l2 = m101455l();
                AbstractC29072d abstractC29072d = AbstractC29072d.d.f134806a;
                abstractC29073eArr[0] = AbstractC29075g.m145255b(jVar, m101455l2, arrayList14, abstractC29072d);
                abstractC29073eArr[1] = AbstractC29075g.m145255b(AbstractC29076h.g.f134821b, m101455l(), new ArrayList(), m127137G0 ? AbstractC29072d.c.f134805a : abstractC29072d);
                abstractC29073eArr[i11] = AbstractC29075g.m145255b(AbstractC29076h.f.f134820b, m101455l(), new ArrayList(), z12 ? AbstractC29072d.c.f134805a : abstractC29072d);
                abstractC29073eArr[c11] = AbstractC29075g.m145255b(AbstractC29076h.h.f134822b, m101455l(), arrayList15, abstractC29072d);
                abstractC29073eArr[4] = AbstractC29075g.m145255b(AbstractC29076h.i.f134823b, m101455l(), arrayList4, abstractC29072d);
                abstractC29073eArr[c12] = AbstractC29075g.m145255b(AbstractC29076h.p.f134830b, m101455l(), arrayList8, abstractC29072d);
                abstractC29073eArr[6] = AbstractC29075g.m145255b(AbstractC29076h.y.f134838b, m101455l(), arrayList5, abstractC29072d);
                abstractC29073eArr[7] = AbstractC29075g.m145255b(AbstractC29076h.z.f134839b, m101455l(), arrayList16, abstractC29072d);
                abstractC29073eArr[8] = AbstractC29075g.m145255b(AbstractC29076h.d.f134818b, m101455l(), arrayList17, abstractC29072d);
                AbstractC29076h.r rVar = AbstractC29076h.r.f134832b;
                String m101455l3 = m101455l();
                ArrayList arrayList42 = new ArrayList();
                AbstractC29072d abstractC29072d2 = abstractC29072d;
                if (m101486b) {
                    abstractC29072d2 = AbstractC29072d.c.f134805a;
                }
                abstractC29073eArr[9] = AbstractC29075g.m145255b(rVar, m101455l3, arrayList42, abstractC29072d2);
                C29074f m145258e = AbstractC29075g.m145258e(abstractC29073eArr);
                ArrayList arrayList43 = new ArrayList();
                for (ContactProfile contactProfile7 : arrayList25) {
                    a aVar19 = Companion;
                    AbstractC29069a.o m101483e2 = a.m101483e(aVar19, contactProfile7, aVar19.m101487c(contactProfile7, 16777248 | aVar19.m101485a(contactProfile7)), null, null, null, null, null, 124, null);
                    c19372y0.m101472o(c19325g13, m101483e2);
                    arrayList43.add(m101483e2);
                }
                AbstractC29076h.k kVar = AbstractC29076h.k.f134825b;
                String m101455l4 = m101455l();
                AbstractC29072d.d dVar = AbstractC29072d.d.f134806a;
                ArrayList arrayList44 = arrayList6;
                AbstractC29075g.m145254a(m145258e, AbstractC29075g.m145255b(kVar, m101455l4, arrayList44, dVar));
                AbstractC29075g.m145254a(m145258e, AbstractC29075g.m145255b(AbstractC29076h.l.f134826b, m101455l(), arrayList43, dVar));
                AbstractC29076h.n nVar = AbstractC29076h.n.f134828b;
                String m101455l5 = m101455l();
                ArrayList arrayList45 = new ArrayList();
                AbstractC29072d.c cVar = AbstractC29072d.c.f134805a;
                AbstractC29075g.m145254a(m145258e, AbstractC29075g.m145255b(nVar, m101455l5, arrayList45, cVar));
                AbstractC29075g.m145254a(m145258e, AbstractC29075g.m145255b(AbstractC29076h.o.f134829b, m101455l(), new ArrayList(), cVar));
                c19372y0.mo205i9(new C18316b("ACTION_SEARCH_TASK_RESULT_SET_DATA", m145258e, null, null, 12, null));
                InterfaceC18319c m101438e2 = m101438e();
                AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: ga0.w0
                    public /* synthetic */ RunnableC19368w0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C19307a1.this.m101441i();
                    }
                }, 75L);
                InterfaceC18319c m101438e3 = m101438e();
                new C19346n1(m101438e3 == null ? c19372y0 : m101438e3, m101455l(), arrayList25, hashMap2, list3).m101442j();
            }
        }
    }
}

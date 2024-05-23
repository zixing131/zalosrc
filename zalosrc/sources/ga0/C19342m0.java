package ga0;

import ai.InterfaceC0861a;
import android.text.SpannableString;
import android.text.format.DateUtils;
import android.text.style.ForegroundColorSpan;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import dg0.AbstractC17930e;
import dg0.InterfaceC17929d;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ga0.C19318e0;
import gg0.AbstractC19444a;
import ha0.C19955h;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import me0.C23024b7;
import me0.C23139m1;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p612wk.AbstractC29069a;
import p612wk.AbstractC29072d;
import p612wk.AbstractC29073e;
import p612wk.AbstractC29076h;
import p612wk.AbstractC29080l;
import p612wk.C29074f;
import p612wk.C29077i;
import p612wk.C29078j;
import p612wk.C29079k;
import pm0.AbstractC24866w;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import qm0.AbstractC25376w;
import sm0.AbstractC26327c;
import tk.C26723b;
import tk.InterfaceC26722a;

/* renamed from: ga0.m0 */
/* loaded from: classes6.dex */
public final class C19342m0 extends AbstractC19358r1 {
    public static final a Companion = new a(null);

    /* renamed from: u */
    private static final Comparator f96086u;

    /* renamed from: v */
    private static final Comparator f96087v;

    /* renamed from: t */
    private final C18316b f96088t;

    /* renamed from: ga0.m0$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public final int m101354g(AbstractC29069a abstractC29069a) {
            AbstractC29069a.b bVar = AbstractC29069a.Companion;
            if (bVar.m145171a(m101355h(abstractC29069a), 536870912)) {
                return 2;
            }
            if (bVar.m145171a(m101355h(abstractC29069a), 67108864)) {
                return 1;
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public final int m101355h(AbstractC29069a abstractC29069a) {
            if (abstractC29069a instanceof AbstractC29069a.o) {
                return ((AbstractC29069a.o) abstractC29069a).m145200g();
            }
            if (abstractC29069a instanceof AbstractC29069a.k) {
                return ((AbstractC29069a.k) abstractC29069a).m145190b();
            }
            if (abstractC29069a instanceof AbstractC29069a.v) {
                return ((AbstractC29069a.v) abstractC29069a).m145223c();
            }
            if (abstractC29069a instanceof AbstractC29069a.m) {
                return ((AbstractC29069a.m) abstractC29069a).m145193c();
            }
            if (abstractC29069a instanceof AbstractC29069a.q) {
                return ((AbstractC29069a.q) abstractC29069a).m145215c();
            }
            return 0;
        }

        /* renamed from: i */
        private final int m101356i(AbstractC29069a abstractC29069a) {
            ContactProfile contactProfile;
            if (!(abstractC29069a instanceof AbstractC29069a.o)) {
                return -1;
            }
            InterfaceC0861a m145198e = ((AbstractC29069a.o) abstractC29069a).m145198e();
            if (m145198e instanceof ContactProfile) {
                contactProfile = (ContactProfile) m145198e;
            } else {
                contactProfile = null;
            }
            if (contactProfile == null) {
                return -1;
            }
            return contactProfile.f42353K1;
        }

        /* renamed from: c */
        public final void m101357c(List list) {
            AbstractC19074t.m100208f(list, "<this>");
            try {
                int size = list.size();
                if (size != 0 && size != 1) {
                    for (int i11 = 0; i11 < size; i11++) {
                        int m101356i = m101356i((AbstractC29069a) list.get(i11));
                        if (m101356i >= 0 && m101356i != i11) {
                            int i12 = size - 1;
                            if (m101356i > i12) {
                                m101356i = i12;
                            }
                            list.add(m101356i, list.remove(i11));
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: d */
        public final void m101358d(InterfaceC17929d interfaceC17929d, String str, long j11, Runnable runnable) {
            AbstractC19074t.m100208f(interfaceC17929d, "<this>");
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(runnable, "runnable");
            interfaceC17929d.mo94530d(str, runnable, j11);
        }

        /* renamed from: e */
        public final Integer m101359e(AbstractC29069a.s sVar) {
            AbstractC19074t.m100208f(sVar, "<this>");
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.f.f134738b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_hidden_conversation);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.b.f134734b)) {
                return Integer.valueOf(AbstractC8020f0.str_title_find_friend_phone);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.c.f134735b)) {
                return Integer.valueOf(AbstractC8020f0.str_title_find_friend_username);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.t.f134774b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_highlight);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.d.f134736b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_people);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.u.f134775b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_util);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.e.f134737b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_group);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.n.f134746b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_oa);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.C33040s.f134773b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_stranger);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.l.f134744b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_maybe_you_want_to_search);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.a.f134733b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_util);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.r.f134772b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_setting);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.m.f134745b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_mini_program);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.g.f134739b) || AbstractC19074t.m100204b(sVar, AbstractC29069a.s.h.f134740b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_followed_oa);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.i.f134741b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_contacted_stranger);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.j.f134742b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_discover_oa);
            }
            if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.k.f134743b)) {
                return Integer.valueOf(AbstractC8020f0.str_search_global_section_discover_stranger);
            }
            if (sVar instanceof AbstractC29069a.s.o) {
                return null;
            }
            if (sVar instanceof AbstractC29069a.s.p) {
                return Integer.valueOf(((AbstractC29069a.s.p) sVar).m145218b().m145244g().m145259a());
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: f */
        public final Comparator m101360f() {
            return C19342m0.f96087v;
        }

        /* renamed from: j */
        public final int m101361j(AbstractC29073e.f fVar) {
            AbstractC19074t.m100208f(fVar, "<this>");
            AbstractC29076h m145244g = fVar.m145244g();
            if (m145244g instanceof AbstractC29076h.q) {
                boolean m145237a = fVar.mo145252c().m145237a();
                int size = fVar.m145242e().size();
                if (!m145237a) {
                    return Math.max(size, 100);
                }
                return size;
            }
            if (m145244g instanceof AbstractC29076h.e) {
                boolean m145237a2 = fVar.mo145252c().m145237a();
                int size2 = fVar.m145242e().size();
                if (!m145237a2) {
                    return Math.max(size2, 100);
                }
                return size2;
            }
            if (m145244g instanceof AbstractC29076h.m) {
                boolean m145237a3 = fVar.mo145252c().m145237a();
                int size3 = fVar.m145242e().size();
                if (!m145237a3) {
                    return Math.max(size3, 100);
                }
                return size3;
            }
            return fVar.m145242e().size();
        }
    }

    /* renamed from: ga0.m0$b */
    /* loaded from: classes6.dex */
    public static final class b implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int m135478b;
            a aVar = C19342m0.Companion;
            m135478b = AbstractC26327c.m135478b(Integer.valueOf(aVar.m101354g((AbstractC29069a) obj)), Integer.valueOf(aVar.m101354g((AbstractC29069a) obj2)));
            return m135478b;
        }
    }

    static {
        Comparator m135480d;
        Comparator comparator = new Comparator() { // from class: ga0.l0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m101310A;
                m101310A = C19342m0.m101310A((AbstractC29069a) obj, (AbstractC29069a) obj2);
                return m101310A;
            }
        };
        f96086u = comparator;
        m135480d = AbstractC26327c.m135480d(new b(), comparator);
        f96087v = m135480d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19342m0(InterfaceC18319c interfaceC18319c, C18316b c18316b, String str) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(c18316b, "action");
        AbstractC19074t.m100208f(str, "query");
        this.f96088t = c18316b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public static final int m101310A(AbstractC29069a abstractC29069a, AbstractC29069a abstractC29069a2) {
        Comparator m118798l = C23139m1.f112256a.m118798l();
        C23024b7 c23024b7 = C23024b7.f111993a;
        AbstractC19074t.m100205c(abstractC29069a);
        InterfaceC0861a m118067o = c23024b7.m118067o(abstractC29069a);
        AbstractC19074t.m100205c(abstractC29069a2);
        return m118798l.compare(m118067o, c23024b7.m118067o(abstractC29069a2));
    }

    /* renamed from: B */
    private final void m101311B(List list, List list2, int i11, int i12, int i13, AbstractC29069a.s sVar, C24860q c24860q, boolean z11, int i14) {
        List m131187O0;
        StringBuilder sb2;
        String str;
        SpannableString spannableString;
        AtomicInteger atomicInteger = (AtomicInteger) c24860q.m129215c();
        AtomicInteger atomicInteger2 = (AtomicInteger) c24860q.m129216d();
        m131187O0 = AbstractC25332a0.m131187O0(list2);
        boolean z12 = sVar instanceof AbstractC29069a.s.o;
        if (!m131187O0.isEmpty()) {
            if (!list.isEmpty()) {
                ((AbstractC29069a) list.get(list.size() - 1)).m145138a().m137452i(C26723b.a.c.f126749a, z12);
                list.add(AbstractC29069a.t.f134776b);
            }
            String m118743r0 = AbstractC23136l9.m118743r0(i13);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            if (i14 > 99) {
                sb2 = new StringBuilder();
                sb2.append(m118743r0);
                str = " (99+)";
            } else {
                sb2 = new StringBuilder();
                sb2.append(m118743r0);
                sb2.append(" (");
                sb2.append(i14);
                str = ")";
            }
            sb2.append(str);
            String sb3 = sb2.toString();
            if (z11) {
                spannableString = new SpannableString(sb3);
                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC21196a.TextColor2)), m118743r0.length() + 1, sb3.length(), 33);
            } else {
                spannableString = new SpannableString(m118743r0);
            }
            list.add(new AbstractC29069a.i(i13, i14, spannableString, sVar));
            int i15 = i12 + i11;
            if (i15 > m131187O0.size()) {
                i15 = m131187O0.size();
            }
            for (int i16 = 0; i16 < i15; i16++) {
                Object obj = m131187O0.get(i16);
                AbstractC29069a abstractC29069a = (AbstractC29069a) obj;
                abstractC29069a.m145138a().m137445b(i13, z12);
                abstractC29069a.m145138a().m137452i(C26723b.a.C32983a.f126747a, z12);
                abstractC29069a.m145138a().m137444a(atomicInteger2.getAndIncrement(), z12);
                list.add(obj);
            }
            if (m131187O0.size() - i15 > 0) {
                if (!list.isEmpty()) {
                    ((AbstractC29069a) list.get(list.size() - 1)).m145138a().m137452i(C26723b.a.b.f126748a, z12);
                }
                list.add(sVar);
            }
            atomicInteger.set(atomicInteger.get() + i14);
        }
    }

    /* renamed from: C */
    static /* synthetic */ void m101312C(C19342m0 c19342m0, List list, List list2, int i11, int i12, int i13, AbstractC29069a.s sVar, C24860q c24860q, boolean z11, int i14, int i15, Object obj) {
        boolean z12;
        int i16;
        if ((i15 & 128) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i15 & 256) != 0) {
            i16 = list2.size();
        } else {
            i16 = i14;
        }
        c19342m0.m101311B(list, list2, i11, i12, i13, sVar, c24860q, z12, i16);
    }

    /* renamed from: D */
    private final void m101313D(List list, List list2, String str, boolean z11, C24860q c24860q) {
        AtomicInteger atomicInteger = (AtomicInteger) c24860q.m129215c();
        AtomicInteger atomicInteger2 = (AtomicInteger) c24860q.m129216d();
        if (!list.isEmpty()) {
            ((AbstractC29069a) list.get(list.size() - 1)).m145138a().m137452i(C26723b.a.c.f126749a, z11);
            list.add(AbstractC29069a.t.f134776b);
        }
        String str2 = str + " (" + list2.size() + ")";
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC21196a.TextColor2)), str.length() + 1, str2.length(), 33);
        list.add(new AbstractC29069a.i(0, list2.size(), spannableString, null, 8, null));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC29069a abstractC29069a = (AbstractC29069a) it.next();
            abstractC29069a.m145138a().m137444a(atomicInteger2.getAndIncrement(), z11);
            list.add(abstractC29069a);
        }
        atomicInteger.set(atomicInteger.get() + list2.size());
    }

    /* renamed from: E */
    private final void m101314E(List list, AbstractC29069a abstractC29069a, AtomicInteger atomicInteger) {
        list.add(abstractC29069a);
        atomicInteger.set(atomicInteger.get() + 1);
    }

    /* renamed from: F */
    private final void m101315F(C29077i c29077i, List list) {
        if (!(!c29077i.m145291s().m145242e().isEmpty()) && !(!c29077i.m145279g().m145242e().isEmpty()) && !(!c29077i.m145287o().m145242e().isEmpty())) {
            return;
        }
        if (!list.isEmpty()) {
            list.add(AbstractC29069a.t.f134776b);
        }
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_section_search_in);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        list.add(new AbstractC29069a.i(AbstractC8020f0.str_search_global_section_search_in, 0, m118743r0, null, 8, null));
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_section_search_in_sub_label);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_section_search_in_sub_label_single);
        AbstractC19074t.m100207e(m118743r03, "getString(...)");
        if (!c29077i.m145291s().m145242e().isEmpty()) {
            String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_tab_message);
            AbstractC19074t.m100207e(m118743r04, "getString(...)");
            list.add(new AbstractC29069a.q(393216, m101334Y(m118743r04, c29077i.m145291s().m145242e().size(), m118743r02, m118743r03)));
        }
        if (!c29077i.m145279g().m145242e().isEmpty()) {
            String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_tab_file);
            AbstractC19074t.m100207e(m118743r05, "getString(...)");
            list.add(new AbstractC29069a.q(655360, m101334Y(m118743r05, c29077i.m145279g().m145242e().size(), m118743r02, m118743r03)));
        }
        if (!c29077i.m145287o().m145242e().isEmpty()) {
            String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_global_tab_link);
            AbstractC19074t.m100207e(m118743r06, "getString(...)");
            list.add(new AbstractC29069a.q(1179648, m101334Y(m118743r06, c29077i.m145287o().m145242e().size(), m118743r02, m118743r03)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m101316G(List list, List list2, boolean z11, C24860q c24860q) {
        List m131187O0;
        boolean z12;
        m131187O0 = AbstractC25332a0.m131187O0(list2);
        if (!m131187O0.isEmpty()) {
            String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_today);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            ArrayList arrayList = new ArrayList();
            int size = m131187O0.size();
            boolean z13 = true;
            int i11 = 0;
            for (Object obj : m131187O0) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC25368s.m131509q();
                }
                AbstractC29069a abstractC29069a = (AbstractC29069a) obj;
                long m101336a0 = m101336a0(abstractC29069a);
                if (m101336a0 != 0) {
                    if (z13) {
                        if (DateUtils.isToday(m101336a0)) {
                            arrayList.add(abstractC29069a);
                        } else {
                            if (!arrayList.isEmpty()) {
                                m101313D(list, arrayList, m118743r0, z11, c24860q);
                                arrayList.clear();
                            }
                            z12 = false;
                            if (!z12) {
                                String format = new SimpleDateFormat("LLLL.yyyy", Locale.getDefault()).format(Long.valueOf(m101336a0));
                                if (AbstractC19074t.m100204b(format, m118743r0)) {
                                    arrayList.add(abstractC29069a);
                                } else {
                                    if (!arrayList.isEmpty()) {
                                        String str = m118743r0;
                                        m118743r0 = format;
                                        m101313D(list, arrayList, str, z11, c24860q);
                                        arrayList.clear();
                                    } else {
                                        m118743r0 = format;
                                    }
                                    AbstractC19074t.m100205c(m118743r0);
                                    arrayList.add(abstractC29069a);
                                }
                            }
                            if (i11 == size - 1 && (!arrayList.isEmpty())) {
                                m101313D(list, arrayList, m118743r0, z11, c24860q);
                                arrayList.clear();
                            }
                            z13 = z12;
                        }
                    }
                    z12 = z13;
                    if (!z12) {
                    }
                    if (i11 == size - 1) {
                        m101313D(list, arrayList, m118743r0, z11, c24860q);
                        arrayList.clear();
                    }
                    z13 = z12;
                }
                i11 = i12;
            }
        }
    }

    /* renamed from: H */
    static /* synthetic */ void m101317H(C19342m0 c19342m0, List list, List list2, boolean z11, C24860q c24860q, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        c19342m0.m101316G(list, list2, z11, c24860q);
    }

    /* renamed from: I */
    private final void m101318I(C29077i c29077i) {
        C29077i.m145262c(c29077i, null, 1, null);
        m101326Q(c29077i);
    }

    /* renamed from: J */
    private final void m101319J(C29077i c29077i, final AbstractC29069a.s sVar, AbstractC29080l abstractC29080l) {
        AbstractC29080l m145219c;
        boolean m101136N = C19322f1.f95950a.m101136N();
        int i11 = 5;
        if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.f.f134738b)) {
            AbstractC29073e.b m145284l = c29077i.m145284l();
            int m145249k = m145284l.m145249k();
            if (m101136N) {
                i11 = c29077i.m145284l().m145242e().size();
            }
            m145284l.mo145248a(m145249k + i11);
            m145219c = AbstractC29080l.a.f134882b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.b.f134734b)) {
            AbstractC29073e.b m145280h = c29077i.m145280h();
            int m145249k2 = m145280h.m145249k();
            if (m101136N) {
                i11 = c29077i.m145280h().m145242e().size();
            }
            m145280h.mo145248a(m145249k2 + i11);
            m145219c = AbstractC29080l.a.f134882b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.c.f134735b)) {
            AbstractC29073e.b m145281i = c29077i.m145281i();
            int m145249k3 = m145281i.m145249k();
            if (m101136N) {
                i11 = c29077i.m145281i().m145242e().size();
            }
            m145281i.mo145248a(m145249k3 + i11);
            m145219c = AbstractC29080l.a.f134882b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.d.f134736b)) {
            AbstractC29073e.b m145282j = c29077i.m145282j();
            int m145249k4 = m145282j.m145249k();
            if (m101136N) {
                i11 = c29077i.m145282j().m145242e().size();
            }
            m145282j.mo145248a(m145249k4 + i11);
            m145219c = AbstractC29080l.c.f134883b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.u.f134775b)) {
            AbstractC29073e.b m145268F = c29077i.m145268F();
            int m145249k5 = m145268F.m145249k();
            if (m101136N) {
                i11 = c29077i.m145268F().m145242e().size();
            }
            m145268F.mo145248a(m145249k5 + i11);
            m145219c = AbstractC29080l.c.f134883b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.e.f134737b)) {
            AbstractC29073e.b m145283k = c29077i.m145283k();
            int m145249k6 = m145283k.m145249k();
            if (m101136N) {
                i11 = c29077i.m145283k().m145242e().size();
            }
            m145283k.mo145248a(m145249k6 + i11);
            m145219c = AbstractC29080l.c.f134883b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.n.f134746b)) {
            AbstractC29073e.b m145293u = c29077i.m145293u();
            int m145249k7 = m145293u.m145249k();
            if (m101136N) {
                i11 = c29077i.m145293u().m145242e().size();
            }
            m145293u.mo145248a(m145249k7 + i11);
            m145219c = AbstractC29080l.c.f134883b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.l.f134744b)) {
            AbstractC29073e.b m145290r = c29077i.m145290r();
            int m145249k8 = m145290r.m145249k();
            if (m101136N) {
                i11 = c29077i.m145290r().m145242e().size();
            }
            m145290r.mo145248a(m145249k8 + i11);
            m145219c = AbstractC29080l.c.f134883b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.C33040s.f134773b)) {
            AbstractC29073e.b m145264B = c29077i.m145264B();
            int m145249k9 = m145264B.m145249k();
            if (m101136N) {
                i11 = c29077i.m145264B().m145242e().size();
            }
            m145264B.mo145248a(m145249k9 + i11);
            m145219c = AbstractC29080l.c.f134883b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.t.f134774b)) {
            AbstractC29073e.b m145267E = c29077i.m145267E();
            int m145249k10 = m145267E.m145249k();
            if (m101136N) {
                i11 = c29077i.m145267E().m145242e().size();
            }
            m145267E.mo145248a(m145249k10 + i11);
            m145219c = AbstractC29080l.c.f134883b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.a.f134733b)) {
            AbstractC29073e.b m145278f = c29077i.m145278f();
            int m145249k11 = m145278f.m145249k();
            if (m101136N) {
                i11 = c29077i.m145278f().m145242e().size();
            }
            m145278f.mo145248a(m145249k11 + i11);
            m145219c = AbstractC29080l.d.f134884b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.m.f134745b)) {
            AbstractC29073e.b m145292t = c29077i.m145292t();
            int m145249k12 = m145292t.m145249k();
            if (m101136N) {
                i11 = c29077i.m145292t().m145242e().size();
            }
            m145292t.mo145248a(m145249k12 + i11);
            m145219c = AbstractC29080l.d.f134884b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.r.f134772b)) {
            AbstractC29073e.b m145263A = c29077i.m145263A();
            int m145249k13 = m145263A.m145249k();
            if (m101136N) {
                i11 = c29077i.m145263A().m145242e().size();
            }
            m145263A.mo145248a(m145249k13 + i11);
            m145219c = AbstractC29080l.d.f134884b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.i.f134741b)) {
            AbstractC29073e.b m145286n = c29077i.m145286n();
            int m145249k14 = m145286n.m145249k();
            if (m101136N) {
                i11 = c29077i.m145286n().m145242e().size();
            }
            m145286n.mo145248a(m145249k14 + i11);
            m145219c = AbstractC29080l.c.f134883b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.g.f134739b)) {
            AbstractC29073e.b m145285m = c29077i.m145285m();
            int m145249k15 = m145285m.m145249k();
            if (m101136N) {
                i11 = c29077i.m145285m().m145242e().size();
            }
            m145285m.mo145248a(m145249k15 + i11);
            m145219c = AbstractC29080l.c.f134883b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.k.f134743b)) {
            AbstractC29073e.b m145289q = c29077i.m145289q();
            int m145249k16 = m145289q.m145249k();
            if (m101136N) {
                i11 = c29077i.m145289q().m145242e().size();
            }
            m145289q.mo145248a(m145249k16 + i11);
            m145219c = AbstractC29080l.d.f134884b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.j.f134742b)) {
            AbstractC29073e.b m145288p = c29077i.m145288p();
            int m145249k17 = m145288p.m145249k();
            if (m101136N) {
                i11 = c29077i.m145288p().m145242e().size();
            }
            m145288p.mo145248a(m145249k17 + i11);
            m145219c = AbstractC29080l.d.f134884b;
        } else if (AbstractC19074t.m100204b(sVar, AbstractC29069a.s.h.f134740b)) {
            AbstractC29073e.b m145285m2 = c29077i.m145285m();
            int m145249k18 = m145285m2.m145249k();
            if (m101136N) {
                i11 = c29077i.m145285m().m145242e().size();
            }
            m145285m2.mo145248a(m145249k18 + i11);
            m145219c = AbstractC29080l.d.f134884b;
        } else {
            AbstractC29073e.b bVar = null;
            if (sVar instanceof AbstractC29069a.s.q) {
                AbstractC29069a.s.q qVar = (AbstractC29069a.s.q) sVar;
                AbstractC29069a.s m145216b = qVar.m145216b();
                if (m145216b != null) {
                    m101319J(c29077i, m145216b, qVar.m145217c());
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: ga0.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19342m0.m101321L(C19342m0.this, sVar);
                    }
                });
            } else if (sVar instanceof AbstractC29069a.s.o) {
                AbstractC29069a.s.o oVar = (AbstractC29069a.s.o) sVar;
                AbstractC29069a.s m145216b2 = oVar.m145216b();
                if (m145216b2 != null) {
                    m101319J(c29077i, m145216b2, oVar.m145217c());
                }
                AbstractC19444a.m101695c(new Runnable() { // from class: ga0.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C19342m0.m101322M(C19342m0.this, sVar);
                    }
                });
            } else if (sVar instanceof AbstractC29069a.s.p) {
                AbstractC29069a.s.p pVar = (AbstractC29069a.s.p) sVar;
                AbstractC29073e m145218b = pVar.m145218b();
                if (m145218b instanceof AbstractC29073e.b) {
                    bVar = (AbstractC29073e.b) m145218b;
                }
                if (bVar != null) {
                    int m145249k19 = bVar.m145249k();
                    if (m101136N) {
                        i11 = bVar.m145242e().size();
                    }
                    bVar.mo145248a(m145249k19 + i11);
                }
                m145219c = pVar.m145219c();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            m145219c = null;
        }
        if (abstractC29080l == null) {
            abstractC29080l = m145219c;
        }
        if (abstractC29080l != null) {
            m101327R(c29077i, abstractC29080l);
        }
    }

    /* renamed from: K */
    static /* synthetic */ void m101320K(C19342m0 c19342m0, C29077i c29077i, AbstractC29069a.s sVar, AbstractC29080l abstractC29080l, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            abstractC29080l = null;
        }
        c19342m0.m101319J(c29077i, sVar, abstractC29080l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m101321L(C19342m0 c19342m0, AbstractC29069a.s sVar) {
        AbstractC19074t.m100208f(c19342m0, "this$0");
        AbstractC19074t.m100208f(sVar, "$data");
        InterfaceC18319c m101438e = c19342m0.m101438e();
        if (m101438e != null) {
            AbstractC29069a.s.q qVar = (AbstractC29069a.s.q) sVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m101322M(C19342m0 c19342m0, AbstractC29069a.s sVar) {
        AbstractC19074t.m100208f(c19342m0, "this$0");
        AbstractC19074t.m100208f(sVar, "$data");
        InterfaceC18319c m101438e = c19342m0.m101438e();
        if (m101438e != null) {
            Boolean bool = Boolean.FALSE;
        }
    }

    /* renamed from: N */
    private final boolean m101323N(AbstractC29073e abstractC29073e, C29077i c29077i, AbstractC29080l abstractC29080l) {
        Map map = (Map) c29077i.m145298z().get(abstractC29080l);
        if (map != null) {
            return AbstractC19074t.m100204b(map.get(abstractC29073e.m145244g()), Boolean.TRUE);
        }
        return false;
    }

    /* renamed from: O */
    private final boolean m101324O(AbstractC29073e abstractC29073e, C29077i c29077i, AbstractC29080l abstractC29080l) {
        if ((!abstractC29073e.m145242e().isEmpty()) && m101323N(abstractC29073e, c29077i, abstractC29080l)) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private final void m101325P(List list) {
        m101440g(new C18316b("ACTION_SUBMIT_LIST_RESULT", new C29079k(list), null, null, 12, null));
    }

    /* renamed from: Q */
    private final void m101326Q(C29077i c29077i) {
        List m131187O0;
        m131187O0 = AbstractC25332a0.m131187O0(c29077i.m145265C());
        m101330U(c29077i, m131187O0);
    }

    /* renamed from: R */
    private final void m101327R(C29077i c29077i, AbstractC29080l abstractC29080l) {
        List m131506n;
        m131506n = AbstractC25368s.m131506n(abstractC29080l);
        m101330U(c29077i, m131506n);
    }

    /* renamed from: S */
    private final void m101328S(final C29077i c29077i, List list) {
        Set m131190R0;
        List m131185M0;
        int m131511r;
        synchronized (c29077i) {
            try {
                m131190R0 = AbstractC25332a0.m131190R0(c29077i.m145294v(), list);
                m131185M0 = AbstractC25332a0.m131185M0(m131190R0);
                c29077i.m145294v().clear();
                List list2 = m131185M0;
                m131511r = AbstractC25370t.m131511r(list2, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(m101349x(c29077i, (AbstractC29080l) it.next()));
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                for (Object obj : arrayList) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        AbstractC25368s.m131509q();
                    }
                    AbstractC29072d abstractC29072d = (AbstractC29072d) obj;
                    if (!AbstractC19074t.m100204b(abstractC29072d, AbstractC29072d.a.f134803a) && !AbstractC19074t.m100204b(abstractC29072d, AbstractC29072d.d.f134806a)) {
                        arrayList3.add(m131185M0.get(i11));
                        i11 = i12;
                    }
                    arrayList2.add(m131185M0.get(i11));
                    i11 = i12;
                }
                if (C19322f1.f95950a.m101141S() && (!arrayList2.isEmpty())) {
                    AbstractC29080l.a aVar = AbstractC29080l.a.f134882b;
                    if (!arrayList2.contains(aVar)) {
                        arrayList2.add(0, aVar);
                        arrayList3.remove(aVar);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    m101330U(c29077i, arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    c29077i.m145294v().addAll(arrayList3);
                    Companion.m101358d(AbstractC17930e.Companion.m94551d(), "DEBOUNCE_SEARCH_GLOBAL_PROCESS_RESULT_STATE", 175L, new Runnable() { // from class: ga0.k0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19342m0.m101329T(C29077i.this, this);
                        }
                    });
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m101329T(C29077i c29077i, C19342m0 c19342m0) {
        ArrayList arrayList;
        AbstractC19074t.m100208f(c29077i, "$this_refreshPageData");
        AbstractC19074t.m100208f(c19342m0, "this$0");
        synchronized (c29077i) {
            arrayList = new ArrayList();
            arrayList.addAll(c29077i.m145294v());
            c29077i.m145294v().clear();
        }
        if (!arrayList.isEmpty()) {
            c19342m0.m101330U(c29077i, arrayList);
        }
    }

    /* renamed from: U */
    private final void m101330U(C29077i c29077i, List list) {
        int m131511r;
        List list2 = list;
        m131511r = AbstractC25370t.m131511r(list2, 10);
        ArrayList arrayList = new ArrayList(m131511r);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(m101348w(c29077i, (AbstractC29080l) it.next()));
        }
        m101325P(arrayList);
    }

    /* renamed from: V */
    private final void m101331V(C29077i c29077i) {
        int m131511r;
        boolean z11;
        boolean z12;
        if (c29077i.m145269G()) {
            c29077i.m145298z().clear();
            List m145265C = c29077i.m145265C();
            m131511r = AbstractC25370t.m131511r(m145265C, 10);
            ArrayList<C24860q> arrayList = new ArrayList(m131511r);
            Iterator it = m145265C.iterator();
            while (true) {
                boolean z13 = false;
                if (!it.hasNext()) {
                    break;
                }
                AbstractC29080l abstractC29080l = (AbstractC29080l) it.next();
                HashMap hashMap = new HashMap();
                if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.a.f134882b)) {
                    if (c29077i.m145295w() == 1) {
                        AbstractC29076h.r rVar = AbstractC29076h.r.f134832b;
                        Boolean bool = Boolean.TRUE;
                        hashMap.put(rVar, bool);
                        hashMap.put(AbstractC29076h.s.f134833b, Boolean.FALSE);
                        hashMap.put(AbstractC29076h.k.f134825b, bool);
                        hashMap.put(AbstractC29076h.n.f134828b, bool);
                    } else {
                        AbstractC29076h.j jVar = AbstractC29076h.j.f134824b;
                        Boolean bool2 = Boolean.TRUE;
                        hashMap.put(jVar, bool2);
                        hashMap.put(AbstractC29076h.f.f134820b, bool2);
                        hashMap.put(AbstractC29076h.g.f134821b, bool2);
                        AbstractC29076h.x xVar = AbstractC29076h.x.f134837b;
                        C19322f1 c19322f1 = C19322f1.f95950a;
                        hashMap.put(xVar, Boolean.valueOf(c19322f1.m101142T()));
                        hashMap.put(AbstractC29076h.y.f134838b, Boolean.valueOf(c19322f1.m101139Q()));
                        hashMap.put(AbstractC29076h.h.f134822b, Boolean.valueOf(!c19322f1.m101137O()));
                        hashMap.put(AbstractC29076h.i.f134823b, Boolean.valueOf(!c19322f1.m101137O()));
                        hashMap.put(AbstractC29076h.z.f134839b, Boolean.valueOf(!c19322f1.m101137O()));
                        hashMap.put(AbstractC29076h.p.f134830b, Boolean.valueOf(!c19322f1.m101137O()));
                        AbstractC29076h.s sVar = AbstractC29076h.s.f134833b;
                        c19322f1.m101137O();
                        Boolean bool3 = Boolean.FALSE;
                        hashMap.put(sVar, bool3);
                        AbstractC29076h.w wVar = AbstractC29076h.w.f134836b;
                        c19322f1.m101137O();
                        hashMap.put(wVar, bool3);
                        hashMap.put(AbstractC29076h.l.f134826b, Boolean.valueOf(!c19322f1.m101137O()));
                        hashMap.put(AbstractC29076h.k.f134825b, Boolean.valueOf(!c19322f1.m101137O()));
                        hashMap.put(AbstractC29076h.o.f134829b, Boolean.valueOf(!c19322f1.m101137O()));
                        hashMap.put(AbstractC29076h.n.f134828b, Boolean.valueOf(!c19322f1.m101137O()));
                        hashMap.put(AbstractC29076h.b.f134816b, Boolean.valueOf(c19322f1.m101137O()));
                        AbstractC29076h.c cVar = AbstractC29076h.c.f134817b;
                        if (c19322f1.m101137O() && c19322f1.m101154k()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        hashMap.put(cVar, Boolean.valueOf(z11));
                        AbstractC29076h.r rVar2 = AbstractC29076h.r.f134832b;
                        if (!c19322f1.m101137O() && c19322f1.m101159p()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        hashMap.put(rVar2, Boolean.valueOf(z12));
                        AbstractC29076h.u uVar = AbstractC29076h.u.f134835b;
                        if (!c19322f1.m101137O() && c19322f1.m101160q()) {
                            z13 = true;
                        }
                        hashMap.put(uVar, Boolean.valueOf(z13));
                        hashMap.put(AbstractC29076h.q.f134831b, bool2);
                        hashMap.put(AbstractC29076h.e.f134819b, Boolean.valueOf(!c19322f1.m101158o()));
                        hashMap.put(AbstractC29076h.m.f134827b, Boolean.valueOf(!c19322f1.m101158o()));
                    }
                } else if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.c.f134883b)) {
                    AbstractC29076h.j jVar2 = AbstractC29076h.j.f134824b;
                    Boolean bool4 = Boolean.FALSE;
                    hashMap.put(jVar2, bool4);
                    hashMap.put(AbstractC29076h.f.f134820b, bool4);
                    hashMap.put(AbstractC29076h.g.f134821b, bool4);
                    AbstractC29076h.y yVar = AbstractC29076h.y.f134838b;
                    C19322f1 c19322f12 = C19322f1.f95950a;
                    hashMap.put(yVar, Boolean.valueOf(c19322f12.m101140R()));
                    AbstractC29076h.h hVar = AbstractC29076h.h.f134822b;
                    Boolean bool5 = Boolean.TRUE;
                    hashMap.put(hVar, bool5);
                    hashMap.put(AbstractC29076h.i.f134823b, bool5);
                    hashMap.put(AbstractC29076h.z.f134839b, Boolean.valueOf(true ^ c19322f12.m101155l()));
                    hashMap.put(AbstractC29076h.p.f134830b, bool5);
                    hashMap.put(AbstractC29076h.s.f134833b, bool4);
                    hashMap.put(AbstractC29076h.w.f134836b, bool4);
                    hashMap.put(AbstractC29076h.k.f134825b, bool5);
                    hashMap.put(AbstractC29076h.l.f134826b, bool5);
                } else if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.d.f134884b)) {
                    AbstractC29076h.d dVar = AbstractC29076h.d.f134818b;
                    Boolean bool6 = Boolean.TRUE;
                    hashMap.put(dVar, bool6);
                    hashMap.put(AbstractC29076h.k.f134825b, Boolean.FALSE);
                    hashMap.put(AbstractC29076h.n.f134828b, bool6);
                    hashMap.put(AbstractC29076h.o.f134829b, bool6);
                    AbstractC29076h.r rVar3 = AbstractC29076h.r.f134832b;
                    C19322f1 c19322f13 = C19322f1.f95950a;
                    hashMap.put(rVar3, Boolean.valueOf(c19322f13.m101159p()));
                    hashMap.put(AbstractC29076h.u.f134835b, Boolean.valueOf(c19322f13.m101160q()));
                } else if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.e.f134885b)) {
                    hashMap.put(AbstractC29076h.e.f134819b, Boolean.TRUE);
                } else if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.f.f134886b)) {
                    hashMap.put(AbstractC29076h.m.f134827b, Boolean.TRUE);
                } else if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.g.f134887b)) {
                    hashMap.put(AbstractC29076h.q.f134831b, Boolean.TRUE);
                } else if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.h.f134888b)) {
                    hashMap.put(AbstractC29076h.r.f134832b, Boolean.TRUE);
                } else if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.i.f134889b)) {
                    hashMap.put(AbstractC29076h.s.f134833b, Boolean.FALSE);
                    AbstractC29076h.k kVar = AbstractC29076h.k.f134825b;
                    Boolean bool7 = Boolean.TRUE;
                    hashMap.put(kVar, bool7);
                    hashMap.put(AbstractC29076h.n.f134828b, bool7);
                }
                arrayList.add(AbstractC24866w.m129235a(abstractC29080l, hashMap));
            }
            for (C24860q c24860q : arrayList) {
                c29077i.m145298z().put(c24860q.m129215c(), c24860q.m129216d());
            }
            c29077i.m145271I(false);
        }
    }

    /* renamed from: W */
    private final void m101332W(C29077i c29077i, C19325g1 c19325g1) {
        int i11;
        if (c29077i.m145270H()) {
            ArrayList arrayList = new ArrayList();
            if (AbstractC19074t.m100204b(c19325g1.m101177D(), "10")) {
                i11 = C19322f1.f95950a.m101129C();
            } else {
                i11 = 0;
            }
            c29077i.m145273K(i11);
            if (c29077i.m145295w() == 1) {
                arrayList.add(AbstractC29080l.a.f134882b);
                arrayList.add(AbstractC29080l.h.f134888b);
                arrayList.add(AbstractC29080l.i.f134889b);
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (!C19322f1.f95950a.m101141S()) {
                    linkedHashSet.add(AbstractC29080l.a.f134882b);
                }
                for (AbstractC29080l abstractC29080l : C29077i.Companion.m145299a()) {
                    if (!linkedHashSet.contains(abstractC29080l)) {
                        arrayList.add(abstractC29080l);
                    }
                }
            }
            c29077i.m145274L(arrayList);
            c29077i.m145272J(false);
        }
    }

    /* renamed from: X */
    private final void m101333X(C29077i c29077i, List list) {
        C19322f1 c19322f1 = C19322f1.f95950a;
        if (c19322f1.m101141S()) {
            AbstractC29080l.a aVar = AbstractC29080l.a.f134882b;
            if (!list.contains(aVar)) {
                list.add(aVar);
            }
        } else if (!list.contains(AbstractC29080l.a.f134882b) && (list.contains(AbstractC29080l.g.f134887b) || list.contains(AbstractC29080l.e.f134885b) || list.contains(AbstractC29080l.f.f134886b))) {
            list.add(AbstractC29080l.c.f134883b);
        }
        if (c19322f1.m101141S() && c19322f1.m101137O() && list.contains(AbstractC29080l.c.f134883b)) {
            m101347u(c29077i, AbstractC29076h.b.f134816b);
        }
        if (c19322f1.m101141S() && c19322f1.m101137O() && list.contains(AbstractC29080l.d.f134884b)) {
            m101347u(c29077i, AbstractC29076h.c.f134817b);
        }
        if (c19322f1.m101141S() && c19322f1.m101142T()) {
            m101347u(c29077i, AbstractC29076h.x.f134837b);
        }
    }

    /* renamed from: Y */
    private final CharSequence m101334Y(String str, int i11, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" (");
        if (i11 > 99) {
            sb2.append(99);
            sb2.append('+');
            sb2.append(' ');
            sb2.append(str2);
            sb2.append(')');
        } else if (i11 > 1) {
            sb2.append(i11);
            sb2.append(' ');
            sb2.append(str2);
            sb2.append(')');
        } else {
            sb2.append(i11);
            sb2.append(' ');
            sb2.append(str3);
            sb2.append(')');
        }
        SpannableString spannableString = new SpannableString(sb2);
        spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119606n(AbstractC21196a.TextColor2)), str.length() + 1, sb2.length(), 33);
        return spannableString;
    }

    /* renamed from: Z */
    private final CharSequence m101335Z(int i11) {
        int i12;
        if (i11 > 1) {
            i12 = AbstractC8020f0.str_search_global_section_search_in_sub_label;
        } else {
            i12 = AbstractC8020f0.str_search_global_section_search_in_sub_label_single;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i12);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append(' ');
        sb2.append(m118743r0);
        SpannableString spannableString = new SpannableString(sb2);
        AbstractC23217t2.m119664p(spannableString, 0, (sb2.length() - 1) - m118743r0.length(), C23212s8.m119606n(AbstractC21196a.TextColor1), 7, 33);
        return spannableString;
    }

    /* renamed from: a0 */
    private final long m101336a0(AbstractC29069a abstractC29069a) {
        if (abstractC29069a instanceof AbstractC29069a.k) {
            return ((AbstractC29069a.k) abstractC29069a).m145188d().f147411b.f42330D;
        }
        if (abstractC29069a instanceof AbstractC29069a.e) {
            return ((AbstractC29069a.e) abstractC29069a).m145174b().m40599m().m95313z4();
        }
        if (abstractC29069a instanceof AbstractC29069a.j) {
            return ((AbstractC29069a.j) abstractC29069a).m145186b().m40599m().m95313z4();
        }
        if (abstractC29069a instanceof AbstractC29069a.a) {
            return ((AbstractC29069a.a) abstractC29069a).m145152p();
        }
        return 0L;
    }

    /* renamed from: b0 */
    private final void m101337b0(C29077i c29077i, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC29080l m101346t = m101346t(c29077i, (AbstractC29073e) it.next(), true);
            if (m101346t != null && (!arrayList.contains(m101346t))) {
                arrayList.add(m101346t);
            }
        }
        m101333X(c29077i, arrayList);
        m101328S(c29077i, arrayList);
    }

    /* renamed from: c0 */
    private final void m101338c0(C29077i c29077i, AbstractC29073e abstractC29073e) {
        if (isCancelled()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC29080l m101346t = m101346t(c29077i, abstractC29073e, true);
        if (m101346t != null) {
            arrayList.add(m101346t);
        }
        m101333X(c29077i, arrayList);
        m101328S(c29077i, arrayList);
    }

    /* renamed from: r */
    private final void m101344r(C29077i c29077i, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC29080l m101346t = m101346t(c29077i, (AbstractC29073e) it.next(), false);
            if (m101346t != null && (!arrayList.contains(m101346t))) {
                arrayList.add(m101346t);
            }
        }
        m101333X(c29077i, arrayList);
        m101328S(c29077i, arrayList);
    }

    /* renamed from: s */
    private final void m101345s(C29077i c29077i, AbstractC29073e abstractC29073e) {
        ArrayList arrayList = new ArrayList();
        AbstractC29080l m101346t = m101346t(c29077i, abstractC29073e, false);
        if (m101346t != null) {
            arrayList.add(m101346t);
        }
        m101333X(c29077i, arrayList);
        m101328S(c29077i, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:323:0x0542 A[Catch: all -> 0x050a, TryCatch #9 {all -> 0x050a, blocks: (B:313:0x04ef, B:315:0x04f5, B:318:0x04fb, B:321:0x051a, B:323:0x0542, B:324:0x050c, B:325:0x054b), top: B:312:0x04ef }] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AbstractC29080l m101346t(C29077i c29077i, AbstractC29073e abstractC29073e, boolean z11) {
        if (isCancelled()) {
            return null;
        }
        AbstractC29076h m145244g = abstractC29073e.m145244g();
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.j.f134824b)) {
            synchronized (c29077i.m145284l()) {
                try {
                    if (!isCancelled()) {
                        AbstractC29073e.b m145284l = c29077i.m145284l();
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145284l.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145284l.m145242e().addAll(abstractC29073e.m145242e());
                            m145284l.m145247j(abstractC29073e.m145245h());
                        }
                        m145284l.m145242e().clear();
                        m145284l.mo145248a(0);
                        m145284l.m145246i(abstractC29073e.m145243f());
                        m145284l.m145242e().addAll(abstractC29073e.m145242e());
                        m145284l.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
            return AbstractC29080l.a.f134882b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.f.f134820b)) {
            AbstractC29073e.b m145280h = c29077i.m145280h();
            synchronized (m145280h) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145280h.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145280h.m145242e().addAll(abstractC29073e.m145242e());
                            m145280h.m145247j(abstractC29073e.m145245h());
                        }
                        m145280h.m145242e().clear();
                        m145280h.mo145248a(0);
                        m145280h.m145246i(abstractC29073e.m145243f());
                        m145280h.m145242e().addAll(abstractC29073e.m145242e());
                        m145280h.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return AbstractC29080l.a.f134882b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.g.f134821b)) {
            AbstractC29073e.b m145281i = c29077i.m145281i();
            synchronized (m145281i) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145281i.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145281i.m145242e().addAll(abstractC29073e.m145242e());
                            m145281i.m145247j(abstractC29073e.m145245h());
                        }
                        m145281i.m145242e().clear();
                        m145281i.mo145248a(0);
                        m145281i.m145246i(abstractC29073e.m145243f());
                        m145281i.m145242e().addAll(abstractC29073e.m145242e());
                        m145281i.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g03 = C24848g0.f119245a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return AbstractC29080l.a.f134882b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.y.f134838b)) {
            AbstractC29073e.b m145267E = c29077i.m145267E();
            synchronized (m145267E) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145267E.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145267E.m145242e().addAll(abstractC29073e.m145242e());
                            m145267E.m145247j(abstractC29073e.m145245h());
                        }
                        m145267E.m145242e().clear();
                        m145267E.mo145248a(0);
                        m145267E.m145246i(abstractC29073e.m145243f());
                        m145267E.m145242e().addAll(abstractC29073e.m145242e());
                        m145267E.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g04 = C24848g0.f119245a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return AbstractC29080l.c.f134883b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.h.f134822b)) {
            AbstractC29073e.b m145282j = c29077i.m145282j();
            synchronized (m145282j) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145282j.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145282j.m145242e().addAll(abstractC29073e.m145242e());
                            AbstractC25376w.m131534w(m145282j.m145242e(), f96087v);
                            m145282j.m145247j(abstractC29073e.m145245h());
                        }
                        m145282j.m145242e().clear();
                        m145282j.mo145248a(0);
                        m145282j.m145246i(abstractC29073e.m145243f());
                        m145282j.m145242e().addAll(abstractC29073e.m145242e());
                        AbstractC25376w.m131534w(m145282j.m145242e(), f96087v);
                        m145282j.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g05 = C24848g0.f119245a;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            return AbstractC29080l.c.f134883b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.z.f134839b)) {
            AbstractC29073e.b m145268F = c29077i.m145268F();
            synchronized (m145268F) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145268F.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145268F.m145242e().addAll(abstractC29073e.m145242e());
                            m145268F.m145247j(abstractC29073e.m145245h());
                        }
                        m145268F.m145242e().clear();
                        m145268F.mo145248a(0);
                        m145268F.m145246i(abstractC29073e.m145243f());
                        m145268F.m145242e().addAll(abstractC29073e.m145242e());
                        m145268F.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g06 = C24848g0.f119245a;
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            return AbstractC29080l.c.f134883b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.p.f134830b)) {
            AbstractC29073e.b m145290r = c29077i.m145290r();
            synchronized (m145290r) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145290r.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145290r.m145242e().addAll(abstractC29073e.m145242e());
                            AbstractC25376w.m131534w(m145290r.m145242e(), f96087v);
                            m145290r.m145247j(abstractC29073e.m145245h());
                        }
                        m145290r.m145242e().clear();
                        m145290r.mo145248a(0);
                        m145290r.m145246i(abstractC29073e.m145243f());
                        m145290r.m145242e().addAll(abstractC29073e.m145242e());
                        AbstractC25376w.m131534w(m145290r.m145242e(), f96087v);
                        m145290r.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g07 = C24848g0.f119245a;
                } catch (Throwable th7) {
                    throw th7;
                }
            }
            return AbstractC29080l.c.f134883b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.i.f134823b)) {
            AbstractC29073e.b m145283k = c29077i.m145283k();
            synchronized (m145283k) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145283k.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145283k.m145242e().addAll(abstractC29073e.m145242e());
                            m145283k.m145247j(abstractC29073e.m145245h());
                        }
                        m145283k.m145242e().clear();
                        m145283k.mo145248a(0);
                        m145283k.m145246i(abstractC29073e.m145243f());
                        m145283k.m145242e().addAll(abstractC29073e.m145242e());
                        m145283k.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g08 = C24848g0.f119245a;
                } finally {
                }
            }
            return AbstractC29080l.c.f134883b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.s.f134833b)) {
            AbstractC29073e.b m145293u = c29077i.m145293u();
            synchronized (m145293u) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145293u.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145293u.m145242e().addAll(abstractC29073e.m145242e());
                            Companion.m101357c(m145293u.m145242e());
                            m145293u.m145247j(abstractC29073e.m145245h());
                        }
                        m145293u.m145242e().clear();
                        m145293u.mo145248a(0);
                        m145293u.m145246i(abstractC29073e.m145243f());
                        m145293u.m145242e().addAll(abstractC29073e.m145242e());
                        Companion.m101357c(m145293u.m145242e());
                        m145293u.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g09 = C24848g0.f119245a;
                } catch (Throwable th8) {
                    throw th8;
                }
            }
            return c29077i.m145295w() != 1 ? AbstractC29080l.c.f134883b : AbstractC29080l.i.f134889b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.w.f134836b)) {
            AbstractC29073e.b m145264B = c29077i.m145264B();
            synchronized (m145264B) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145264B.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145264B.m145242e().addAll(abstractC29073e.m145242e());
                            AbstractC25376w.m131534w(m145264B.m145242e(), f96087v);
                            m145264B.m145247j(abstractC29073e.m145245h());
                        }
                        m145264B.m145242e().clear();
                        m145264B.mo145248a(0);
                        m145264B.m145246i(abstractC29073e.m145243f());
                        m145264B.m145242e().addAll(abstractC29073e.m145242e());
                        AbstractC25376w.m131534w(m145264B.m145242e(), f96087v);
                        m145264B.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g010 = C24848g0.f119245a;
                } catch (Throwable th9) {
                    throw th9;
                }
            }
            return AbstractC29080l.c.f134883b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.t.f134834b)) {
            AbstractC29073e.b m145296x = c29077i.m145296x();
            synchronized (m145296x) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145296x.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145296x.m145242e().addAll(abstractC29073e.m145242e());
                            m145296x.m145247j(abstractC29073e.m145245h());
                        }
                        m145296x.m145242e().clear();
                        m145296x.mo145248a(0);
                        m145296x.m145246i(abstractC29073e.m145243f());
                        m145296x.m145242e().addAll(abstractC29073e.m145242e());
                        m145296x.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g011 = C24848g0.f119245a;
                } catch (Throwable th10) {
                    throw th10;
                }
            }
            return AbstractC29080l.c.f134883b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.d.f134818b)) {
            AbstractC29073e.b m145278f = c29077i.m145278f();
            synchronized (m145278f) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145278f.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145278f.m145242e().addAll(abstractC29073e.m145242e());
                            m145278f.m145247j(abstractC29073e.m145245h());
                        }
                        m145278f.m145242e().clear();
                        m145278f.mo145248a(0);
                        m145278f.m145246i(abstractC29073e.m145243f());
                        m145278f.m145242e().addAll(abstractC29073e.m145242e());
                        m145278f.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g012 = C24848g0.f119245a;
                } catch (Throwable th11) {
                    throw th11;
                }
            }
            return AbstractC29080l.d.f134884b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.u.f134835b)) {
            AbstractC29073e.b m145263A = c29077i.m145263A();
            synchronized (m145263A) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145263A.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145263A.m145242e().addAll(abstractC29073e.m145242e());
                            m145263A.m145247j(abstractC29073e.m145245h());
                        }
                        m145263A.m145242e().clear();
                        m145263A.mo145248a(0);
                        m145263A.m145246i(abstractC29073e.m145243f());
                        m145263A.m145242e().addAll(abstractC29073e.m145242e());
                        m145263A.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g013 = C24848g0.f119245a;
                } catch (Throwable th12) {
                    throw th12;
                }
            }
            return AbstractC29080l.d.f134884b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.r.f134832b)) {
            AbstractC29073e.b m145292t = c29077i.m145292t();
            synchronized (m145292t) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145292t.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145292t.m145242e().addAll(abstractC29073e.m145242e());
                            m145292t.m145247j(abstractC29073e.m145245h());
                        }
                        m145292t.m145242e().clear();
                        m145292t.mo145248a(0);
                        m145292t.m145246i(abstractC29073e.m145243f());
                        m145292t.m145242e().addAll(abstractC29073e.m145242e());
                        m145292t.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g014 = C24848g0.f119245a;
                } catch (Throwable th13) {
                    throw th13;
                }
            }
            return c29077i.m145295w() != 1 ? AbstractC29080l.d.f134884b : AbstractC29080l.h.f134888b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.q.f134831b)) {
            AbstractC29073e.e m145291s = c29077i.m145291s();
            synchronized (m145291s) {
                try {
                    if (!isCancelled() && (abstractC29073e instanceof AbstractC29073e.f)) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145291s.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145291s.m145242e().addAll(abstractC29073e.m145242e());
                            m145291s.m145247j(abstractC29073e.m145245h());
                            C19318e0.Companion.m101095b(m145291s.mo145252c(), ((AbstractC29073e.f) abstractC29073e).mo145252c());
                            if (abstractC29073e instanceof AbstractC29073e.e) {
                                m145291s.mo145250b(((AbstractC29073e.e) abstractC29073e).mo145251y0());
                            }
                        }
                        m145291s.m145242e().clear();
                        m145291s.m145246i(abstractC29073e.m145243f());
                        m145291s.m145242e().addAll(abstractC29073e.m145242e());
                        m145291s.m145247j(abstractC29073e.m145245h());
                        C19318e0.Companion.m101095b(m145291s.mo145252c(), ((AbstractC29073e.f) abstractC29073e).mo145252c());
                        if (abstractC29073e instanceof AbstractC29073e.e) {
                        }
                    }
                    C24848g0 c24848g015 = C24848g0.f119245a;
                } catch (Throwable th14) {
                    throw th14;
                }
            }
            return AbstractC29080l.g.f134887b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.e.f134819b)) {
            AbstractC29073e.f m145279g = c29077i.m145279g();
            synchronized (m145279g) {
                try {
                    if (!isCancelled() && (abstractC29073e instanceof AbstractC29073e.f)) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145279g.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145279g.m145242e().addAll(abstractC29073e.m145242e());
                            m145279g.m145247j(abstractC29073e.m145245h());
                            C19318e0.Companion.m101095b(m145279g.mo145252c(), ((AbstractC29073e.f) abstractC29073e).mo145252c());
                        }
                        m145279g.m145242e().clear();
                        m145279g.m145246i(abstractC29073e.m145243f());
                        m145279g.m145242e().addAll(abstractC29073e.m145242e());
                        m145279g.m145247j(abstractC29073e.m145245h());
                        C19318e0.Companion.m101095b(m145279g.mo145252c(), ((AbstractC29073e.f) abstractC29073e).mo145252c());
                    }
                    C24848g0 c24848g016 = C24848g0.f119245a;
                } catch (Throwable th15) {
                    throw th15;
                }
            }
            return AbstractC29080l.e.f134885b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.m.f134827b)) {
            AbstractC29073e.f m145287o = c29077i.m145287o();
            synchronized (m145287o) {
                try {
                    if (!isCancelled() && (abstractC29073e instanceof AbstractC29073e.f)) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145287o.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145287o.m145242e().addAll(abstractC29073e.m145242e());
                            m145287o.m145247j(abstractC29073e.m145245h());
                            C19318e0.Companion.m101095b(m145287o.mo145252c(), ((AbstractC29073e.f) abstractC29073e).mo145252c());
                        }
                        m145287o.m145242e().clear();
                        m145287o.m145246i(abstractC29073e.m145243f());
                        m145287o.m145242e().addAll(abstractC29073e.m145242e());
                        m145287o.m145247j(abstractC29073e.m145245h());
                        C19318e0.Companion.m101095b(m145287o.mo145252c(), ((AbstractC29073e.f) abstractC29073e).mo145252c());
                    }
                    C24848g0 c24848g017 = C24848g0.f119245a;
                } catch (Throwable th16) {
                    throw th16;
                }
            }
            return AbstractC29080l.f.f134886b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.k.f134825b)) {
            AbstractC29073e.b m145285m = c29077i.m145285m();
            synchronized (m145285m) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145285m.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145285m.m145242e().addAll(abstractC29073e.m145242e());
                            m145285m.m145247j(abstractC29073e.m145245h());
                        }
                        m145285m.m145242e().clear();
                        m145285m.mo145248a(0);
                        m145285m.m145246i(abstractC29073e.m145243f());
                        m145285m.m145242e().addAll(abstractC29073e.m145242e());
                        m145285m.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g018 = C24848g0.f119245a;
                } catch (Throwable th17) {
                    throw th17;
                }
            }
            return c29077i.m145295w() != 1 ? AbstractC29080l.c.f134883b : AbstractC29080l.i.f134889b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.l.f134826b)) {
            AbstractC29073e.b m145286n = c29077i.m145286n();
            synchronized (m145286n) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145286n.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145286n.m145242e().addAll(abstractC29073e.m145242e());
                            AbstractC25376w.m131534w(m145286n.m145242e(), f96087v);
                            m145286n.m145247j(abstractC29073e.m145245h());
                        }
                        m145286n.m145242e().clear();
                        m145286n.mo145248a(0);
                        m145286n.m145246i(abstractC29073e.m145243f());
                        m145286n.m145242e().addAll(abstractC29073e.m145242e());
                        AbstractC25376w.m131534w(m145286n.m145242e(), f96087v);
                        m145286n.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g019 = C24848g0.f119245a;
                } catch (Throwable th18) {
                    throw th18;
                }
            }
            return AbstractC29080l.c.f134883b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.n.f134828b)) {
            AbstractC29073e.b m145288p = c29077i.m145288p();
            synchronized (m145288p) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145288p.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145288p.m145242e().addAll(abstractC29073e.m145242e());
                            Companion.m101357c(m145288p.m145242e());
                            m145288p.m145247j(abstractC29073e.m145245h());
                        }
                        m145288p.m145242e().clear();
                        m145288p.mo145248a(0);
                        m145288p.m145246i(abstractC29073e.m145243f());
                        m145288p.m145242e().addAll(abstractC29073e.m145242e());
                        Companion.m101357c(m145288p.m145242e());
                        m145288p.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g020 = C24848g0.f119245a;
                } finally {
                }
            }
            return c29077i.m145295w() != 1 ? AbstractC29080l.d.f134884b : AbstractC29080l.i.f134889b;
        }
        if (AbstractC19074t.m100204b(m145244g, AbstractC29076h.o.f134829b)) {
            AbstractC29073e.b m145289q = c29077i.m145289q();
            synchronized (m145289q) {
                try {
                    if (!isCancelled()) {
                        if (!z11) {
                            if (!AbstractC19074t.m100204b(m145289q.m145243f(), abstractC29073e.m145243f())) {
                            }
                            m145289q.m145242e().addAll(abstractC29073e.m145242e());
                            AbstractC25376w.m131534w(m145289q.m145242e(), f96087v);
                            m145289q.m145247j(abstractC29073e.m145245h());
                        }
                        m145289q.m145242e().clear();
                        m145289q.mo145248a(0);
                        m145289q.m145246i(abstractC29073e.m145243f());
                        m145289q.m145242e().addAll(abstractC29073e.m145242e());
                        AbstractC25376w.m131534w(m145289q.m145242e(), f96087v);
                        m145289q.m145247j(abstractC29073e.m145245h());
                    }
                    C24848g0 c24848g021 = C24848g0.f119245a;
                } catch (Throwable th19) {
                    throw th19;
                }
            }
            return AbstractC29080l.d.f134884b;
        }
        if (m145244g instanceof AbstractC29076h.v) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x03a8 A[Catch: all -> 0x02f5, TryCatch #0 {all -> 0x02f5, blocks: (B:82:0x029d, B:84:0x02a3, B:86:0x02e5, B:89:0x02f9, B:91:0x0301, B:93:0x030f, B:97:0x0324, B:99:0x032a, B:101:0x0338, B:110:0x0355, B:112:0x0375, B:114:0x0385, B:115:0x0398, B:117:0x03a8, B:118:0x03ab, B:119:0x03b4, B:121:0x03ba, B:123:0x03c8, B:126:0x03d8, B:129:0x03dc, B:131:0x03e6, B:135:0x03f1, B:144:0x044f, B:149:0x0456), top: B:81:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03ba A[Catch: all -> 0x02f5, TryCatch #0 {all -> 0x02f5, blocks: (B:82:0x029d, B:84:0x02a3, B:86:0x02e5, B:89:0x02f9, B:91:0x0301, B:93:0x030f, B:97:0x0324, B:99:0x032a, B:101:0x0338, B:110:0x0355, B:112:0x0375, B:114:0x0385, B:115:0x0398, B:117:0x03a8, B:118:0x03ab, B:119:0x03b4, B:121:0x03ba, B:123:0x03c8, B:126:0x03d8, B:129:0x03dc, B:131:0x03e6, B:135:0x03f1, B:144:0x044f, B:149:0x0456), top: B:81:0x029d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d5 A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:22:0x00f3, B:24:0x00f9, B:26:0x0124, B:27:0x0139, B:29:0x0147, B:31:0x0158, B:33:0x0160, B:34:0x0172, B:36:0x018c, B:39:0x0193, B:41:0x01a6, B:43:0x01ac, B:45:0x01b7, B:47:0x01c7, B:49:0x01d5, B:50:0x01e6, B:52:0x01f4, B:53:0x0205, B:55:0x022a, B:56:0x0231, B:58:0x023b, B:59:0x0246, B:61:0x0262, B:62:0x026d, B:64:0x0275, B:65:0x0280, B:66:0x027e, B:67:0x026b, B:68:0x0244, B:70:0x0289), top: B:21:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f4 A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:22:0x00f3, B:24:0x00f9, B:26:0x0124, B:27:0x0139, B:29:0x0147, B:31:0x0158, B:33:0x0160, B:34:0x0172, B:36:0x018c, B:39:0x0193, B:41:0x01a6, B:43:0x01ac, B:45:0x01b7, B:47:0x01c7, B:49:0x01d5, B:50:0x01e6, B:52:0x01f4, B:53:0x0205, B:55:0x022a, B:56:0x0231, B:58:0x023b, B:59:0x0246, B:61:0x0262, B:62:0x026d, B:64:0x0275, B:65:0x0280, B:66:0x027e, B:67:0x026b, B:68:0x0244, B:70:0x0289), top: B:21:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022a A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:22:0x00f3, B:24:0x00f9, B:26:0x0124, B:27:0x0139, B:29:0x0147, B:31:0x0158, B:33:0x0160, B:34:0x0172, B:36:0x018c, B:39:0x0193, B:41:0x01a6, B:43:0x01ac, B:45:0x01b7, B:47:0x01c7, B:49:0x01d5, B:50:0x01e6, B:52:0x01f4, B:53:0x0205, B:55:0x022a, B:56:0x0231, B:58:0x023b, B:59:0x0246, B:61:0x0262, B:62:0x026d, B:64:0x0275, B:65:0x0280, B:66:0x027e, B:67:0x026b, B:68:0x0244, B:70:0x0289), top: B:21:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x023b A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:22:0x00f3, B:24:0x00f9, B:26:0x0124, B:27:0x0139, B:29:0x0147, B:31:0x0158, B:33:0x0160, B:34:0x0172, B:36:0x018c, B:39:0x0193, B:41:0x01a6, B:43:0x01ac, B:45:0x01b7, B:47:0x01c7, B:49:0x01d5, B:50:0x01e6, B:52:0x01f4, B:53:0x0205, B:55:0x022a, B:56:0x0231, B:58:0x023b, B:59:0x0246, B:61:0x0262, B:62:0x026d, B:64:0x0275, B:65:0x0280, B:66:0x027e, B:67:0x026b, B:68:0x0244, B:70:0x0289), top: B:21:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0262 A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:22:0x00f3, B:24:0x00f9, B:26:0x0124, B:27:0x0139, B:29:0x0147, B:31:0x0158, B:33:0x0160, B:34:0x0172, B:36:0x018c, B:39:0x0193, B:41:0x01a6, B:43:0x01ac, B:45:0x01b7, B:47:0x01c7, B:49:0x01d5, B:50:0x01e6, B:52:0x01f4, B:53:0x0205, B:55:0x022a, B:56:0x0231, B:58:0x023b, B:59:0x0246, B:61:0x0262, B:62:0x026d, B:64:0x0275, B:65:0x0280, B:66:0x027e, B:67:0x026b, B:68:0x0244, B:70:0x0289), top: B:21:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0275 A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:22:0x00f3, B:24:0x00f9, B:26:0x0124, B:27:0x0139, B:29:0x0147, B:31:0x0158, B:33:0x0160, B:34:0x0172, B:36:0x018c, B:39:0x0193, B:41:0x01a6, B:43:0x01ac, B:45:0x01b7, B:47:0x01c7, B:49:0x01d5, B:50:0x01e6, B:52:0x01f4, B:53:0x0205, B:55:0x022a, B:56:0x0231, B:58:0x023b, B:59:0x0246, B:61:0x0262, B:62:0x026d, B:64:0x0275, B:65:0x0280, B:66:0x027e, B:67:0x026b, B:68:0x0244, B:70:0x0289), top: B:21:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x027e A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:22:0x00f3, B:24:0x00f9, B:26:0x0124, B:27:0x0139, B:29:0x0147, B:31:0x0158, B:33:0x0160, B:34:0x0172, B:36:0x018c, B:39:0x0193, B:41:0x01a6, B:43:0x01ac, B:45:0x01b7, B:47:0x01c7, B:49:0x01d5, B:50:0x01e6, B:52:0x01f4, B:53:0x0205, B:55:0x022a, B:56:0x0231, B:58:0x023b, B:59:0x0246, B:61:0x0262, B:62:0x026d, B:64:0x0275, B:65:0x0280, B:66:0x027e, B:67:0x026b, B:68:0x0244, B:70:0x0289), top: B:21:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026b A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:22:0x00f3, B:24:0x00f9, B:26:0x0124, B:27:0x0139, B:29:0x0147, B:31:0x0158, B:33:0x0160, B:34:0x0172, B:36:0x018c, B:39:0x0193, B:41:0x01a6, B:43:0x01ac, B:45:0x01b7, B:47:0x01c7, B:49:0x01d5, B:50:0x01e6, B:52:0x01f4, B:53:0x0205, B:55:0x022a, B:56:0x0231, B:58:0x023b, B:59:0x0246, B:61:0x0262, B:62:0x026d, B:64:0x0275, B:65:0x0280, B:66:0x027e, B:67:0x026b, B:68:0x0244, B:70:0x0289), top: B:21:0x00f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0244 A[Catch: all -> 0x0136, TryCatch #1 {all -> 0x0136, blocks: (B:22:0x00f3, B:24:0x00f9, B:26:0x0124, B:27:0x0139, B:29:0x0147, B:31:0x0158, B:33:0x0160, B:34:0x0172, B:36:0x018c, B:39:0x0193, B:41:0x01a6, B:43:0x01ac, B:45:0x01b7, B:47:0x01c7, B:49:0x01d5, B:50:0x01e6, B:52:0x01f4, B:53:0x0205, B:55:0x022a, B:56:0x0231, B:58:0x023b, B:59:0x0246, B:61:0x0262, B:62:0x026d, B:64:0x0275, B:65:0x0280, B:66:0x027e, B:67:0x026b, B:68:0x0244, B:70:0x0289), top: B:21:0x00f3 }] */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m101347u(C29077i c29077i, AbstractC29076h.v vVar) {
        boolean z11;
        boolean z12;
        ArrayList<AbstractC29069a> arrayList;
        Object m131206f0;
        AbstractC29069a abstractC29069a;
        float f11;
        List m131179G0;
        ArrayList arrayList2;
        C19322f1 c19322f1;
        AbstractC29072d abstractC29072d;
        AbstractC29072d abstractC29072d2;
        AbstractC29072d abstractC29072d3;
        boolean z13 = false;
        if (AbstractC19074t.m100204b(vVar, AbstractC29076h.b.f134816b)) {
            AbstractC29073e.b m145276d = c29077i.m145276d();
            synchronized (m145276d) {
                try {
                    if (!isCancelled()) {
                        m145276d.m145242e().clear();
                        m145276d.mo145248a(0);
                        m145276d.m145242e().addAll(c29077i.m145282j().m145242e());
                        m145276d.m145242e().addAll(c29077i.m145283k().m145242e());
                        m145276d.m145242e().addAll(c29077i.m145268F().m145242e());
                        m145276d.m145242e().addAll(c29077i.m145290r().m145242e());
                        m145276d.m145242e().addAll(c29077i.m145286n().m145242e());
                        m145276d.m145242e().addAll(c29077i.m145285m().m145242e());
                        AbstractC25376w.m131534w(m145276d.m145242e(), f96087v);
                        m145276d.m145247j(m101351z(c29077i.m145282j().m145245h(), c29077i.m145283k().m145245h(), c29077i.m145268F().m145245h(), c29077i.m145290r().m145245h(), c29077i.m145285m().m145245h(), c29077i.m145286n().m145245h()));
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (AbstractC19074t.m100204b(vVar, AbstractC29076h.c.f134817b)) {
            AbstractC29073e.b m145277e = c29077i.m145277e();
            synchronized (m145277e) {
                try {
                    if (!isCancelled()) {
                        m145277e.m145242e().clear();
                        m145277e.mo145248a(0);
                        m145277e.m145246i(c29077i.m145278f().m145243f());
                        String m145243f = c29077i.m145284l().m145243f();
                        if (AbstractC19074t.m100204b(c29077i.m145278f().m145243f(), m145243f)) {
                            m145277e.m145242e().addAll(c29077i.m145278f().m145242e());
                        }
                        if (AbstractC19074t.m100204b(c29077i.m145292t().m145243f(), m145243f) && (!c29077i.m145292t().m145242e().isEmpty())) {
                            int m101169z = C19322f1.f95950a.m101169z();
                            if (m101169z <= 0) {
                                m145277e.m145242e().addAll(c29077i.m145292t().m145242e());
                            } else {
                                ArrayList arrayList3 = new ArrayList(c29077i.m145292t().m145242e());
                                AbstractC25376w.m131534w(arrayList3, f96087v);
                                if (m101169z > arrayList3.size()) {
                                    m101169z = arrayList3.size();
                                }
                                for (int i11 = 0; i11 < m101169z; i11++) {
                                    List m145242e = m145277e.m145242e();
                                    Object obj = arrayList3.get(i11);
                                    AbstractC19074t.m100207e(obj, "get(...)");
                                    m145242e.add(obj);
                                }
                                if (arrayList3.size() > m101169z) {
                                    arrayList2 = new ArrayList();
                                    int size = arrayList3.size();
                                    while (m101169z < size) {
                                        Object obj2 = arrayList3.get(m101169z);
                                        AbstractC19074t.m100207e(obj2, "get(...)");
                                        arrayList2.add(obj2);
                                        m101169z++;
                                    }
                                    if (AbstractC19074t.m100204b(c29077i.m145289q().m145243f(), m145243f)) {
                                        m145277e.m145242e().addAll(c29077i.m145289q().m145242e());
                                    }
                                    if (AbstractC19074t.m100204b(c29077i.m145288p().m145243f(), m145243f)) {
                                        m145277e.m145242e().addAll(c29077i.m145288p().m145242e());
                                    }
                                    m145277e.m145242e().addAll(c29077i.m145263A().m145242e());
                                    AbstractC25376w.m131534w(m145277e.m145242e(), f96087v);
                                    Companion.m101357c(m145277e.m145242e());
                                    if (arrayList2 != null) {
                                        m145277e.m145242e().addAll(arrayList2);
                                    }
                                    AbstractC29072d[] abstractC29072dArr = new AbstractC29072d[5];
                                    c19322f1 = C19322f1.f95950a;
                                    if (!c19322f1.m101155l()) {
                                        abstractC29072d = c29077i.m145278f().m145245h();
                                    } else {
                                        abstractC29072d = AbstractC29072d.d.f134806a;
                                    }
                                    abstractC29072dArr[0] = abstractC29072d;
                                    abstractC29072dArr[1] = c29077i.m145289q().m145245h();
                                    abstractC29072dArr[2] = c29077i.m145288p().m145245h();
                                    if (!c19322f1.m101159p()) {
                                        abstractC29072d2 = c29077i.m145292t().m145245h();
                                    } else {
                                        abstractC29072d2 = AbstractC29072d.d.f134806a;
                                    }
                                    abstractC29072dArr[3] = abstractC29072d2;
                                    if (!c19322f1.m101160q()) {
                                        abstractC29072d3 = c29077i.m145263A().m145245h();
                                    } else {
                                        abstractC29072d3 = AbstractC29072d.d.f134806a;
                                    }
                                    abstractC29072dArr[4] = abstractC29072d3;
                                    m145277e.m145247j(m101351z(abstractC29072dArr));
                                }
                            }
                        }
                        arrayList2 = null;
                        if (AbstractC19074t.m100204b(c29077i.m145289q().m145243f(), m145243f)) {
                        }
                        if (AbstractC19074t.m100204b(c29077i.m145288p().m145243f(), m145243f)) {
                        }
                        m145277e.m145242e().addAll(c29077i.m145263A().m145242e());
                        AbstractC25376w.m131534w(m145277e.m145242e(), f96087v);
                        Companion.m101357c(m145277e.m145242e());
                        if (arrayList2 != null) {
                        }
                        AbstractC29072d[] abstractC29072dArr2 = new AbstractC29072d[5];
                        c19322f1 = C19322f1.f95950a;
                        if (!c19322f1.m101155l()) {
                        }
                        abstractC29072dArr2[0] = abstractC29072d;
                        abstractC29072dArr2[1] = c29077i.m145289q().m145245h();
                        abstractC29072dArr2[2] = c29077i.m145288p().m145245h();
                        if (!c19322f1.m101159p()) {
                        }
                        abstractC29072dArr2[3] = abstractC29072d2;
                        if (!c19322f1.m101160q()) {
                        }
                        abstractC29072dArr2[4] = abstractC29072d3;
                        m145277e.m145247j(m101351z(abstractC29072dArr2));
                    }
                    C24848g0 c24848g02 = C24848g0.f119245a;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return;
        }
        if (AbstractC19074t.m100204b(vVar, AbstractC29076h.x.f134837b)) {
            AbstractC29073e.b m145266D = c29077i.m145266D();
            synchronized (m145266D) {
                try {
                    if (!isCancelled()) {
                        m145266D.m145242e().clear();
                        m145266D.mo145248a(0);
                        m145266D.m145246i(c29077i.m145278f().m145243f());
                        m145266D.m145247j(c29077i.m145277e().m145245h());
                        String m145243f2 = c29077i.m145284l().m145243f();
                        boolean isEmpty = c29077i.m145276d().m145242e().isEmpty();
                        if (AbstractC19074t.m100204b(c29077i.m145291s().m145243f(), m145243f2) && c29077i.m145291s().m145242e().isEmpty()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        C19322f1 c19322f12 = C19322f1.f95950a;
                        if (!c19322f12.m101158o() && (!AbstractC19074t.m100204b(c29077i.m145279g().m145243f(), m145243f2) || !(!c29077i.m145279g().m145242e().isEmpty()))) {
                            z12 = false;
                            if (!c19322f12.m101158o() || (AbstractC19074t.m100204b(c29077i.m145287o().m145243f(), m145243f2) && (!c29077i.m145287o().m145242e().isEmpty()))) {
                                z13 = true;
                            }
                            if (isEmpty || !z11 || !z12 || !z13) {
                                arrayList = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                if (AbstractC19074t.m100204b(c29077i.m145278f().m145243f(), c29077i.m145284l().m145243f()) && AbstractC19074t.m100204b(c29077i.m145278f().m145245h(), AbstractC29072d.d.f134806a)) {
                                    m131179G0 = AbstractC25332a0.m131179G0(c29077i.m145278f().m145242e(), 2);
                                    arrayList.addAll(m131179G0);
                                }
                                m131206f0 = AbstractC25332a0.m131206f0(c29077i.m145276d().m145242e());
                                abstractC29069a = (AbstractC29069a) m131206f0;
                                if (abstractC29069a != null) {
                                    arrayList.add(abstractC29069a);
                                }
                                AbstractC25376w.m131534w(arrayList, f96087v);
                                for (AbstractC29069a abstractC29069a2 : arrayList) {
                                    if (AbstractC19074t.m100204b(abstractC29069a2, abstractC29069a)) {
                                        break;
                                    }
                                    if (AbstractC29069a.Companion.m145171a(Companion.m101355h(abstractC29069a2), 8) && (abstractC29069a2 instanceof AbstractC29069a.o)) {
                                        InterfaceC0861a m118067o = C23024b7.f111993a.m118067o(abstractC29069a2);
                                        if (m118067o != null) {
                                            f11 = m118067o.mo2479d();
                                        } else {
                                            f11 = 1.0f;
                                        }
                                        if (f11 > 1.0f) {
                                            arrayList4.add(new AbstractC29069a.o(((AbstractC29069a.o) abstractC29069a2).m145200g(), ((AbstractC29069a.o) abstractC29069a2).m145198e(), ((AbstractC29069a.o) abstractC29069a2).m145201h(), ((AbstractC29069a.o) abstractC29069a2).m145202i(), ((AbstractC29069a.o) abstractC29069a2).m145196c(), ((AbstractC29069a.o) abstractC29069a2).m145195b(), ((AbstractC29069a.o) abstractC29069a2).m145199f(), ((AbstractC29069a.o) abstractC29069a2).m145205l(), ((AbstractC29069a.o) abstractC29069a2).m145204k(), ((AbstractC29069a.o) abstractC29069a2).m145197d(), ((AbstractC29069a.o) abstractC29069a2).m145203j(), ((AbstractC29069a.o) abstractC29069a2).m145206m()));
                                        }
                                    }
                                }
                                m145266D.m145242e().addAll(arrayList4);
                            } else {
                                return;
                            }
                        }
                        z12 = true;
                        if (!c19322f12.m101158o()) {
                        }
                        z13 = true;
                        if (isEmpty) {
                        }
                        arrayList = new ArrayList();
                        ArrayList arrayList42 = new ArrayList();
                        if (AbstractC19074t.m100204b(c29077i.m145278f().m145243f(), c29077i.m145284l().m145243f())) {
                            m131179G0 = AbstractC25332a0.m131179G0(c29077i.m145278f().m145242e(), 2);
                            arrayList.addAll(m131179G0);
                        }
                        m131206f0 = AbstractC25332a0.m131206f0(c29077i.m145276d().m145242e());
                        abstractC29069a = (AbstractC29069a) m131206f0;
                        if (abstractC29069a != null) {
                        }
                        AbstractC25376w.m131534w(arrayList, f96087v);
                        while (r0.hasNext()) {
                        }
                        m145266D.m145242e().addAll(arrayList42);
                    }
                    C24848g0 c24848g03 = C24848g0.f119245a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x069d, code lost:            if ((r36.m145280h().m145242e().get(0) instanceof p612wk.AbstractC29069a.d.a) == false) goto L141;     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0489  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C29078j m101348w(C29077i c29077i, AbstractC29080l abstractC29080l) {
        AbstractC29080l abstractC29080l2;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        Object m131217q0;
        int size;
        ArrayList arrayList3;
        AbstractC29080l.a aVar;
        AbstractC29080l.c cVar;
        AbstractC29080l.d dVar;
        ArrayList arrayList4;
        AbstractC29080l.a aVar2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        AbstractC29080l.a aVar3;
        ArrayList arrayList8;
        ArrayList arrayList9;
        Object m131217q02;
        int size2;
        int i12;
        ArrayList arrayList10;
        boolean z11;
        ArrayList arrayList11 = new ArrayList();
        C24860q m129235a = AbstractC24866w.m129235a(new AtomicInteger(0), new AtomicInteger(0));
        AbstractC29080l.c cVar2 = AbstractC29080l.c.f134883b;
        if (AbstractC19074t.m100204b(abstractC29080l, cVar2)) {
            if ((!c29077i.m145267E().m145242e().isEmpty()) && C19322f1.f95950a.m101140R()) {
                m101312C(this, arrayList11, c29077i.m145267E().m145242e(), c29077i.m145267E().m145249k(), 5, AbstractC8020f0.str_search_global_section_highlight, AbstractC29069a.s.t.f134774b, m129235a, false, 0, 256, null);
            }
            if (!c29077i.m145282j().m145242e().isEmpty()) {
                z11 = true;
                m101312C(this, arrayList11, c29077i.m145282j().m145242e(), c29077i.m145282j().m145249k(), 5, AbstractC8020f0.str_search_global_section_people, AbstractC29069a.s.d.f134736b, m129235a, false, 0, 384, null);
            } else {
                z11 = true;
            }
            if (c29077i.m145283k().m145242e().isEmpty() ^ z11) {
                m101312C(this, arrayList11, c29077i.m145283k().m145242e(), c29077i.m145283k().m145249k(), 5, AbstractC8020f0.str_search_global_section_group, AbstractC29069a.s.e.f134737b, m129235a, false, 0, 384, null);
            }
            if (c29077i.m145268F().m145242e().isEmpty() ^ z11) {
                m101312C(this, arrayList11, c29077i.m145268F().m145242e(), c29077i.m145268F().m145249k(), 5, AbstractC8020f0.str_search_global_section_util, AbstractC29069a.s.u.f134775b, m129235a, false, 0, 384, null);
            }
            if (c29077i.m145290r().m145242e().isEmpty() ^ z11) {
                m101312C(this, arrayList11, c29077i.m145290r().m145242e(), c29077i.m145290r().m145249k(), 5, AbstractC8020f0.str_search_global_section_maybe_you_want_to_search, AbstractC29069a.s.l.f134744b, m129235a, false, 0, 384, null);
            }
            if (c29077i.m145286n().m145242e().isEmpty() ^ z11) {
                m101312C(this, arrayList11, c29077i.m145286n().m145242e(), c29077i.m145286n().m145249k(), 5, AbstractC8020f0.str_search_global_section_contacted_stranger, AbstractC29069a.s.i.f134741b, m129235a, false, 0, 384, null);
            }
            if (c29077i.m145285m().m145242e().isEmpty() ^ z11) {
                m101312C(this, arrayList11, c29077i.m145285m().m145242e(), c29077i.m145285m().m145249k(), 5, AbstractC8020f0.str_search_global_section_followed_oa, AbstractC29069a.s.g.f134739b, m129235a, false, 0, 384, null);
            }
            if (C19322f1.f95950a.m101138P()) {
                m101315F(c29077i, arrayList11);
            }
            abstractC29080l2 = abstractC29080l;
            arrayList2 = arrayList11;
            i11 = 1;
        } else {
            AbstractC29080l.d dVar2 = AbstractC29080l.d.f134884b;
            abstractC29080l2 = abstractC29080l;
            if (AbstractC19074t.m100204b(abstractC29080l2, dVar2)) {
                AbstractC29073e.b m145278f = c29077i.m145278f();
                if ((!m145278f.m145242e().isEmpty()) && m101323N(m145278f, c29077i, abstractC29080l2)) {
                    m101312C(this, arrayList11, c29077i.m145278f().m145242e(), c29077i.m145278f().m145249k(), 5, AbstractC8020f0.str_search_global_section_util, AbstractC29069a.s.a.f134733b, m129235a, false, 0, 384, null);
                }
                AbstractC29073e.b m145292t = c29077i.m145292t();
                if ((!m145292t.m145242e().isEmpty()) && m101323N(m145292t, c29077i, abstractC29080l2)) {
                    arrayList2 = arrayList11;
                    i11 = 1;
                    m101312C(this, arrayList11, c29077i.m145292t().m145242e(), c29077i.m145292t().m145249k(), 5, AbstractC8020f0.str_search_global_section_mini_program, AbstractC29069a.s.m.f134745b, m129235a, false, 0, 384, null);
                } else {
                    arrayList2 = arrayList11;
                    i11 = 1;
                }
                AbstractC29073e.b m145289q = c29077i.m145289q();
                if (((m145289q.m145242e().isEmpty() ? 1 : 0) ^ i11) != 0 && m101323N(m145289q, c29077i, abstractC29080l2)) {
                    m101312C(this, arrayList2, c29077i.m145289q().m145242e(), c29077i.m145289q().m145249k(), 5, AbstractC8020f0.str_search_global_section_discover_stranger, AbstractC29069a.s.k.f134743b, m129235a, false, 0, 384, null);
                }
                AbstractC29073e.b m145285m = c29077i.m145285m();
                if (((m145285m.m145242e().isEmpty() ? 1 : 0) ^ i11) != 0 && m101323N(m145285m, c29077i, abstractC29080l2)) {
                    m101312C(this, arrayList2, c29077i.m145285m().m145242e(), c29077i.m145285m().m145249k(), 5, AbstractC8020f0.str_search_global_section_followed_oa, AbstractC29069a.s.h.f134740b, m129235a, false, 0, 384, null);
                }
                AbstractC29073e.b m145288p = c29077i.m145288p();
                if (((m145288p.m145242e().isEmpty() ? 1 : 0) ^ i11) != 0 && m101323N(m145288p, c29077i, abstractC29080l2)) {
                    m101312C(this, arrayList2, c29077i.m145288p().m145242e(), c29077i.m145288p().m145249k(), 5, AbstractC8020f0.str_search_global_section_discover_oa, AbstractC29069a.s.j.f134742b, m129235a, false, 0, 384, null);
                }
                AbstractC29073e.b m145263A = c29077i.m145263A();
                if (((m145263A.m145242e().isEmpty() ? 1 : 0) ^ i11) != 0 && m101323N(m145263A, c29077i, abstractC29080l2)) {
                    m101312C(this, arrayList2, c29077i.m145263A().m145242e(), c29077i.m145263A().m145249k(), 5, AbstractC8020f0.str_search_global_section_setting, AbstractC29069a.s.r.f134772b, m129235a, false, 0, 384, null);
                }
            } else {
                i11 = 1;
                AbstractC29080l.a aVar4 = AbstractC29080l.a.f134882b;
                if (AbstractC19074t.m100204b(abstractC29080l2, aVar4)) {
                    if (c29077i.m145295w() == 1) {
                        if (m101324O(c29077i.m145292t(), c29077i, abstractC29080l2)) {
                            ArrayList arrayList12 = new ArrayList();
                            m131217q02 = AbstractC25332a0.m131217q0(c29077i.m145292t().m145242e());
                            AbstractC29069a abstractC29069a = (AbstractC29069a) m131217q02;
                            if (abstractC29069a instanceof AbstractC29069a.z) {
                                AbstractC29069a.z zVar = (AbstractC29069a.z) abstractC29069a;
                                int size3 = (c29077i.m145292t().m145242e().size() - 1) + zVar.m145234d().m145165c().size();
                                if (c29077i.m145292t().m145242e().size() > 1) {
                                    i12 = 0;
                                    arrayList12.addAll(c29077i.m145292t().m145242e().subList(0, c29077i.m145292t().m145242e().size() - 1));
                                } else {
                                    i12 = 0;
                                }
                                arrayList12.add(C23024b7.f111993a.m118068p(zVar, Math.max(i12, 6 - c29077i.m145292t().m145242e().size())));
                                size2 = size3;
                            } else {
                                arrayList12.addAll(c29077i.m145292t().m145242e());
                                size2 = c29077i.m145292t().m145242e().size();
                            }
                            aVar2 = aVar4;
                            m101311B(arrayList11, arrayList12, 0, 5, AbstractC8020f0.str_search_global_section_mini_program, new AbstractC29069a.s.q(AbstractC29080l.h.f134888b, AbstractC29069a.s.m.f134745b, true, false, 8, null), m129235a, true, size2);
                        } else {
                            aVar2 = aVar4;
                            if (AbstractC19074t.m100204b(c29077i.m145292t().m145245h(), AbstractC29072d.c.f134805a) || AbstractC19074t.m100204b(c29077i.m145292t().m145245h(), AbstractC29072d.b.f134804a) || !AbstractC19074t.m100204b(c29077i.m145292t().m145243f(), c29077i.m145284l().m145243f())) {
                                arrayList5 = arrayList11;
                                arrayList5.add(AbstractC29069a.r.f134732b);
                                if (m101324O(c29077i.m145293u(), c29077i, abstractC29080l2)) {
                                    arrayList6 = arrayList5;
                                } else {
                                    arrayList6 = arrayList5;
                                    m101312C(this, arrayList5, c29077i.m145293u().m145242e(), c29077i.m145293u().m145249k(), 10, AbstractC8020f0.str_search_global_section_oa, new AbstractC29069a.s.q(AbstractC29080l.i.f134889b, AbstractC29069a.s.m.f134745b, true, false, 8, null), m129235a, false, 0, 384, null);
                                }
                                if (!m101324O(c29077i.m145285m(), c29077i, abstractC29080l2)) {
                                    m101312C(this, arrayList6, c29077i.m145285m().m145242e(), c29077i.m145285m().m145249k(), 5, AbstractC8020f0.str_search_global_section_followed_oa, new AbstractC29069a.s.q(AbstractC29080l.i.f134889b, AbstractC29069a.s.g.f134739b, true, false, 8, null), m129235a, true, 0, 256, null);
                                } else if (AbstractC19074t.m100204b(c29077i.m145285m().m145245h(), AbstractC29072d.c.f134805a) || AbstractC19074t.m100204b(c29077i.m145285m().m145245h(), AbstractC29072d.b.f134804a) || !AbstractC19074t.m100204b(c29077i.m145285m().m145243f(), c29077i.m145284l().m145243f())) {
                                    if (!arrayList6.isEmpty()) {
                                        arrayList7 = arrayList6;
                                        aVar3 = aVar2;
                                        ((AbstractC29069a) arrayList7.get(arrayList6.size() - 1)).m145138a().m137452i(C26723b.a.c.f126749a, AbstractC19074t.m100204b(abstractC29080l2, aVar3));
                                        arrayList7.add(AbstractC29069a.t.f134776b);
                                    } else {
                                        arrayList7 = arrayList6;
                                        aVar3 = aVar2;
                                    }
                                    arrayList7.add(AbstractC29069a.r.f134732b);
                                    if (m101324O(c29077i.m145288p(), c29077i, abstractC29080l2)) {
                                        arrayList8 = arrayList7;
                                        m101312C(this, arrayList7, c29077i.m145288p().m145242e(), c29077i.m145288p().m145249k(), 10, AbstractC8020f0.str_search_global_section_discover_oa, new AbstractC29069a.s.q(AbstractC29080l.i.f134889b, AbstractC29069a.s.j.f134742b, true, false, 8, null), m129235a, true, 0, 256, null);
                                    } else {
                                        arrayList8 = arrayList7;
                                        if (AbstractC19074t.m100204b(c29077i.m145288p().m145245h(), AbstractC29072d.c.f134805a) || AbstractC19074t.m100204b(c29077i.m145288p().m145245h(), AbstractC29072d.b.f134804a) || !AbstractC19074t.m100204b(c29077i.m145288p().m145243f(), c29077i.m145284l().m145243f())) {
                                            if (!arrayList8.isEmpty()) {
                                                arrayList9 = arrayList8;
                                                ((AbstractC29069a) arrayList9.get(arrayList8.size() - 1)).m145138a().m137452i(C26723b.a.c.f126749a, AbstractC19074t.m100204b(abstractC29080l2, aVar3));
                                                arrayList9.add(AbstractC29069a.t.f134776b);
                                            } else {
                                                arrayList9 = arrayList8;
                                            }
                                            arrayList9.add(AbstractC29069a.r.f134732b);
                                            arrayList2 = arrayList9;
                                        }
                                    }
                                    arrayList9 = arrayList8;
                                    arrayList2 = arrayList9;
                                }
                                arrayList7 = arrayList6;
                                aVar3 = aVar2;
                                if (m101324O(c29077i.m145288p(), c29077i, abstractC29080l2)) {
                                }
                                arrayList9 = arrayList8;
                                arrayList2 = arrayList9;
                            }
                        }
                        arrayList5 = arrayList11;
                        if (m101324O(c29077i.m145293u(), c29077i, abstractC29080l2)) {
                        }
                        if (!m101324O(c29077i.m145285m(), c29077i, abstractC29080l2)) {
                        }
                        arrayList7 = arrayList6;
                        aVar3 = aVar2;
                        if (m101324O(c29077i.m145288p(), c29077i, abstractC29080l2)) {
                        }
                        arrayList9 = arrayList8;
                        arrayList2 = arrayList9;
                    } else {
                        if (c29077i.m145280h().m145242e().size() == 1 && (c29077i.m145280h().m145242e().get(0) instanceof AbstractC29069a.d.a)) {
                            m101314E(arrayList11, (AbstractC29069a) c29077i.m145280h().m145242e().get(0), (AtomicInteger) m129235a.m129215c());
                        }
                        if (!c29077i.m145284l().m145242e().isEmpty()) {
                            arrayList3 = arrayList11;
                            aVar = aVar4;
                            cVar = cVar2;
                            dVar = dVar2;
                            m101312C(this, arrayList11, c29077i.m145284l().m145242e(), c29077i.m145284l().m145249k(), 3, AbstractC8020f0.str_search_global_section_hidden_conversation, AbstractC29069a.s.f.f134738b, m129235a, true, 0, 256, null);
                        } else {
                            arrayList3 = arrayList11;
                            aVar = aVar4;
                            cVar = cVar2;
                            dVar = dVar2;
                        }
                        if (!c29077i.m145280h().m145242e().isEmpty()) {
                            if (c29077i.m145280h().m145242e().size() == 1) {
                            }
                            m101312C(this, arrayList3, c29077i.m145280h().m145242e(), c29077i.m145280h().m145249k(), 3, AbstractC8020f0.str_title_find_friend_phone, AbstractC29069a.s.b.f134734b, m129235a, true, 0, 256, null);
                        }
                        if (!c29077i.m145281i().m145242e().isEmpty()) {
                            m101312C(this, arrayList3, c29077i.m145281i().m145242e(), c29077i.m145281i().m145249k(), 3, AbstractC8020f0.str_title_find_friend_username, AbstractC29069a.s.c.f134735b, m129235a, true, 0, 256, null);
                        }
                        C19322f1 c19322f1 = C19322f1.f95950a;
                        if (c19322f1.m101142T() && (!c29077i.m145266D().m145242e().isEmpty())) {
                            m101312C(this, arrayList3, c29077i.m145266D().m145242e(), 0, 10, AbstractC29076h.x.f134837b.m145259a(), AbstractC29069a.s.o.b.f134750d, m129235a, false, 0, 256, null);
                        }
                        if (c19322f1.m101139Q() && (!c29077i.m145267E().m145242e().isEmpty())) {
                            m101312C(this, arrayList3, c29077i.m145267E().m145242e(), 0, 3, AbstractC29076h.y.f134838b.m145259a(), AbstractC29069a.s.o.p.f134764d, m129235a, false, 0, 256, null);
                        }
                        if (c19322f1.m101137O() && (!c29077i.m145276d().m145242e().isEmpty())) {
                            m101312C(this, arrayList3, c29077i.m145276d().m145242e(), 0, 10, cVar.m145312a(), AbstractC29069a.s.o.a.f134749d, m129235a, true, 0, 256, null);
                        }
                        if (!c19322f1.m101137O() && (!c29077i.m145282j().m145242e().isEmpty())) {
                            m101312C(this, arrayList3, c29077i.m145282j().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_people, AbstractC29069a.s.o.e.f134753d, m129235a, true, 0, 256, null);
                        }
                        if (!c19322f1.m101137O() && (!c29077i.m145283k().m145242e().isEmpty())) {
                            m101312C(this, arrayList3, c29077i.m145283k().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_group, AbstractC29069a.s.o.f.f134754d, m129235a, true, 0, 256, null);
                        }
                        if (!c19322f1.m101137O() && (!c29077i.m145268F().m145242e().isEmpty())) {
                            m101312C(this, arrayList3, c29077i.m145268F().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_util, AbstractC29069a.s.o.q.f134765d, m129235a, true, 0, 256, null);
                        }
                        if (!c19322f1.m101137O() && (!c29077i.m145290r().m145242e().isEmpty())) {
                            m101312C(this, arrayList3, c29077i.m145290r().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_maybe_you_want_to_search, AbstractC29069a.s.o.l.f134760d, m129235a, true, 0, 256, null);
                        }
                        if (!c19322f1.m101137O() && (!c29077i.m145286n().m145242e().isEmpty())) {
                            m101312C(this, arrayList3, c29077i.m145286n().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_contacted_stranger, AbstractC29069a.s.o.h.f134756d, m129235a, true, 0, 256, null);
                        }
                        if (!c19322f1.m101137O() && (!c29077i.m145285m().m145242e().isEmpty())) {
                            m101312C(this, arrayList3, c29077i.m145285m().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_followed_oa, AbstractC29069a.s.o.g.f134755d, m129235a, true, 0, 256, null);
                        }
                        if ((!c29077i.m145291s().m145242e().isEmpty()) && AbstractC19074t.m100204b(c29077i.m145291s().m145243f(), c29077i.m145284l().m145243f())) {
                            m101311B(arrayList3, c29077i.m145291s().m145242e(), 0, 3, AbstractC8020f0.str_search_global_tab_message, AbstractC29069a.s.o.m.f134761d, m129235a, true, Companion.m101361j(c29077i.m145291s()));
                        } else if (AbstractC19074t.m100204b(c29077i.m145291s().m145245h(), AbstractC29072d.c.f134805a) || AbstractC19074t.m100204b(c29077i.m145291s().m145245h(), AbstractC29072d.b.f134804a) || !AbstractC19074t.m100204b(c29077i.m145291s().m145243f(), c29077i.m145284l().m145243f())) {
                            if (!arrayList3.isEmpty()) {
                                arrayList4 = arrayList3;
                                ((AbstractC29069a) arrayList4.get(arrayList3.size() - 1)).m145138a().m137452i(C26723b.a.c.f126749a, AbstractC19074t.m100204b(abstractC29080l2, aVar));
                                arrayList4.add(AbstractC29069a.t.f134776b);
                            } else {
                                arrayList4 = arrayList3;
                            }
                            arrayList4.add(AbstractC29069a.r.f134732b);
                            if (!c19322f1.m101158o() && (!c29077i.m145279g().m145242e().isEmpty()) && AbstractC19074t.m100204b(c29077i.m145291s().m145243f(), c29077i.m145284l().m145243f())) {
                                m101311B(arrayList4, c29077i.m145279g().m145242e(), 0, 3, AbstractC8020f0.str_search_global_tab_file, AbstractC29069a.s.o.d.f134752d, m129235a, true, Companion.m101361j(c29077i.m145279g()));
                            }
                            if (!c19322f1.m101158o() && (!c29077i.m145287o().m145242e().isEmpty()) && AbstractC19074t.m100204b(c29077i.m145291s().m145243f(), c29077i.m145284l().m145243f())) {
                                m101311B(arrayList4, c29077i.m145287o().m145242e(), 0, 3, AbstractC8020f0.str_search_global_tab_link, AbstractC29069a.s.o.i.f134757d, m129235a, true, Companion.m101361j(c29077i.m145287o()));
                            }
                            if (c19322f1.m101137O() || !(!c29077i.m145277e().m145242e().isEmpty())) {
                                arrayList2 = arrayList4;
                            } else {
                                arrayList2 = arrayList4;
                                m101312C(this, arrayList4, c29077i.m145277e().m145242e(), 0, 10, dVar.m145312a(), AbstractC29069a.s.o.b.f134750d, m129235a, true, 0, 256, null);
                            }
                            if (!c19322f1.m101137O() && (!c29077i.m145278f().m145242e().isEmpty())) {
                                m101312C(this, arrayList2, c29077i.m145278f().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_util, AbstractC29069a.s.o.c.f134751d, m129235a, true, 0, 256, null);
                            }
                            if (!c19322f1.m101137O() && (!c29077i.m145292t().m145242e().isEmpty())) {
                                m101312C(this, arrayList2, c29077i.m145292t().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_mini_program, AbstractC29069a.s.o.n.f134762d, m129235a, true, 0, 256, null);
                            }
                            if (!c19322f1.m101137O() && (!c29077i.m145289q().m145242e().isEmpty())) {
                                m101312C(this, arrayList2, c29077i.m145289q().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_discover_stranger, AbstractC29069a.s.o.k.f134759d, m129235a, true, 0, 256, null);
                            }
                            if (!c19322f1.m101137O() && (!c29077i.m145288p().m145242e().isEmpty())) {
                                m101312C(this, arrayList2, c29077i.m145288p().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_discover_oa, AbstractC29069a.s.o.j.f134758d, m129235a, true, 0, 256, null);
                            }
                            if (!c19322f1.m101137O() && (!c29077i.m145263A().m145242e().isEmpty())) {
                                m101312C(this, arrayList2, c29077i.m145263A().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_setting, AbstractC29069a.s.o.C33039o.f134763d, m129235a, true, 0, 256, null);
                            }
                        }
                        arrayList4 = arrayList3;
                        if (!c19322f1.m101158o()) {
                            m101311B(arrayList4, c29077i.m145279g().m145242e(), 0, 3, AbstractC8020f0.str_search_global_tab_file, AbstractC29069a.s.o.d.f134752d, m129235a, true, Companion.m101361j(c29077i.m145279g()));
                        }
                        if (!c19322f1.m101158o()) {
                            m101311B(arrayList4, c29077i.m145287o().m145242e(), 0, 3, AbstractC8020f0.str_search_global_tab_link, AbstractC29069a.s.o.i.f134757d, m129235a, true, Companion.m101361j(c29077i.m145287o()));
                        }
                        if (c19322f1.m101137O()) {
                        }
                        arrayList2 = arrayList4;
                        if (!c19322f1.m101137O()) {
                            m101312C(this, arrayList2, c29077i.m145278f().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_util, AbstractC29069a.s.o.c.f134751d, m129235a, true, 0, 256, null);
                        }
                        if (!c19322f1.m101137O()) {
                            m101312C(this, arrayList2, c29077i.m145292t().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_mini_program, AbstractC29069a.s.o.n.f134762d, m129235a, true, 0, 256, null);
                        }
                        if (!c19322f1.m101137O()) {
                            m101312C(this, arrayList2, c29077i.m145289q().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_discover_stranger, AbstractC29069a.s.o.k.f134759d, m129235a, true, 0, 256, null);
                        }
                        if (!c19322f1.m101137O()) {
                            m101312C(this, arrayList2, c29077i.m145288p().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_discover_oa, AbstractC29069a.s.o.j.f134758d, m129235a, true, 0, 256, null);
                        }
                        if (!c19322f1.m101137O()) {
                            m101312C(this, arrayList2, c29077i.m145263A().m145242e(), 0, 3, AbstractC8020f0.str_search_global_section_setting, AbstractC29069a.s.o.C33039o.f134763d, m129235a, true, 0, 256, null);
                        }
                    }
                } else {
                    if (AbstractC19074t.m100204b(abstractC29080l2, AbstractC29080l.g.f134887b)) {
                        if (c29077i.m145291s().mo145251y0().m145179e() != null) {
                            m101317H(this, arrayList11, c29077i.m145291s().m145242e(), false, m129235a, 4, null);
                            arrayList = arrayList11;
                        } else {
                            Iterator it = c29077i.m145291s().m145242e().iterator();
                            while (it.hasNext()) {
                                ((AbstractC29069a) it.next()).m145138a().m137444a(((AtomicInteger) m129235a.m129216d()).getAndIncrement(), false);
                            }
                            arrayList = arrayList11;
                            arrayList.addAll(c29077i.m145291s().m145242e());
                        }
                        ((AtomicInteger) m129235a.m129215c()).set(Companion.m101361j(c29077i.m145291s()));
                    } else {
                        arrayList = arrayList11;
                        if (AbstractC19074t.m100204b(abstractC29080l2, AbstractC29080l.e.f134885b)) {
                            m101317H(this, arrayList, c29077i.m145279g().m145242e(), false, m129235a, 4, null);
                            ((AtomicInteger) m129235a.m129215c()).set(Companion.m101361j(c29077i.m145279g()));
                        } else if (AbstractC19074t.m100204b(abstractC29080l2, AbstractC29080l.f.f134886b)) {
                            m101317H(this, arrayList, c29077i.m145287o().m145242e(), false, m129235a, 4, null);
                            ((AtomicInteger) m129235a.m129215c()).set(Companion.m101361j(c29077i.m145287o()));
                        } else if (AbstractC19074t.m100204b(abstractC29080l2, AbstractC29080l.h.f134888b)) {
                            AbstractC29073e.b m145292t2 = c29077i.m145292t();
                            if ((!m145292t2.m145242e().isEmpty()) && m101323N(m145292t2, c29077i, abstractC29080l2)) {
                                ArrayList arrayList13 = new ArrayList();
                                m131217q0 = AbstractC25332a0.m131217q0(c29077i.m145292t().m145242e());
                                AbstractC29069a abstractC29069a2 = (AbstractC29069a) m131217q0;
                                if (abstractC29069a2 instanceof AbstractC29069a.z) {
                                    AbstractC29069a.z zVar2 = (AbstractC29069a.z) abstractC29069a2;
                                    int size4 = (c29077i.m145292t().m145242e().size() - 1) + zVar2.m145234d().m145165c().size();
                                    if (c29077i.m145292t().m145242e().size() > 1) {
                                        arrayList13.addAll(c29077i.m145292t().m145242e().subList(0, c29077i.m145292t().m145242e().size() - 1));
                                    }
                                    arrayList13.add(C23024b7.m118051q(C23024b7.f111993a, zVar2, 0, 1, null));
                                    size = size4;
                                } else {
                                    arrayList13.addAll(c29077i.m145292t().m145242e());
                                    size = c29077i.m145292t().m145242e().size();
                                }
                                arrayList2 = arrayList;
                                m101312C(this, arrayList, arrayList13, c29077i.m145292t().m145249k(), 9999, AbstractC8020f0.str_search_global_section_mini_program, new AbstractC29069a.s.p(abstractC29080l, c29077i.m145292t(), false, false, 12, null), m129235a, false, size, 128, null);
                            }
                        } else {
                            arrayList2 = arrayList;
                            if (AbstractC19074t.m100204b(abstractC29080l2, AbstractC29080l.i.f134889b)) {
                                if (!c29077i.m145285m().m145242e().isEmpty()) {
                                    m101312C(this, arrayList2, c29077i.m145285m().m145242e(), c29077i.m145285m().m145249k(), 5, AbstractC8020f0.str_search_global_section_followed_oa, new AbstractC29069a.s.p(abstractC29080l, c29077i.m145285m(), false, false, 12, null), m129235a, true, 0, 256, null);
                                }
                                if (!c29077i.m145288p().m145242e().isEmpty()) {
                                    m101312C(this, arrayList2, c29077i.m145288p().m145242e(), c29077i.m145288p().m145249k(), 9999, AbstractC8020f0.str_search_global_section_discover_oa, new AbstractC29069a.s.p(abstractC29080l, c29077i.m145288p(), false, false, 12, null), m129235a, true, 0, 256, null);
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    arrayList2 = arrayList;
                }
            }
        }
        C24848g0 c24848g0 = C24848g0.f119245a;
        AbstractC29072d m101349x = m101349x(c29077i, abstractC29080l);
        int i13 = ((AtomicInteger) m129235a.m129215c()).get();
        if (!AbstractC19074t.m100204b(m101349x, AbstractC29072d.d.f134806a)) {
            arrayList10 = arrayList2;
            if (AbstractC19074t.m100204b(m101349x, AbstractC29072d.a.f134803a)) {
                if (i13 == 0) {
                    arrayList10.add(0, AbstractC29069a.d.c.f134677b);
                    if (arrayList10.size() > i11) {
                        arrayList10.add(i11, AbstractC29069a.t.f134776b);
                        arrayList10.add(AbstractC29069a.u.f134777b);
                    }
                } else if (C19318e0.Companion.m101097f(abstractC29080l2)) {
                    arrayList10.add(AbstractC29069a.t.f134776b);
                    arrayList10.add(AbstractC29069a.g.a.f134683b);
                    arrayList10.add(AbstractC29069a.u.f134777b);
                } else {
                    arrayList10.add(AbstractC29069a.u.f134777b);
                }
            } else if (AbstractC19074t.m100204b(m101349x, AbstractC29072d.c.f134805a)) {
                if (i13 == 0) {
                    arrayList10.clear();
                    AbstractC29069a.r rVar = AbstractC29069a.r.f134732b;
                    arrayList10.add(rVar);
                    arrayList10.add(AbstractC29069a.t.f134776b);
                    arrayList10.add(rVar);
                    arrayList10.add(AbstractC29069a.u.f134777b);
                } else if (C19318e0.Companion.m101097f(abstractC29080l2)) {
                    arrayList10.add(AbstractC29069a.g.b.f134684b);
                }
            } else if (AbstractC19074t.m100204b(m101349x, AbstractC29072d.b.f134804a) && i13 == 0) {
                arrayList10.add(AbstractC29069a.d.b.f134676b);
            }
        } else if (i13 == 0) {
            arrayList10 = arrayList2;
            arrayList10.add(0, AbstractC29069a.d.c.f134677b);
            if (arrayList10.size() > i11) {
                arrayList10.add(i11, AbstractC29069a.t.f134776b);
            }
            arrayList10.add(AbstractC29069a.u.f134777b);
        } else {
            arrayList10 = arrayList2;
            C19318e0.a aVar5 = C19318e0.Companion;
            if (aVar5.m101097f(abstractC29080l2)) {
                if (aVar5.m101096e(c29077i, abstractC29080l2) && i13 > 99) {
                    if ((arrayList10.isEmpty() ^ i11) != 0) {
                        ((AbstractC29069a) arrayList10.get(arrayList10.size() - i11)).m145138a().m137452i(C26723b.a.c.f126749a, AbstractC19074t.m100204b(abstractC29080l2, AbstractC29080l.a.f134882b));
                    }
                    arrayList10.add(AbstractC29069a.t.f134776b);
                    arrayList10.add(new AbstractC29069a.g.d(m101335Z(i13)));
                } else if (!aVar5.m101096e(c29077i, abstractC29080l2)) {
                    arrayList10.add(AbstractC29069a.g.c.f134685b);
                } else {
                    if ((arrayList10.isEmpty() ^ i11) != 0) {
                        ((AbstractC29069a) arrayList10.get(arrayList10.size() - i11)).m145138a().m137452i(C26723b.a.c.f126749a, AbstractC19074t.m100204b(abstractC29080l2, AbstractC29080l.a.f134882b));
                    }
                    arrayList10.add(AbstractC29069a.u.f134777b);
                }
            } else {
                if ((arrayList10.isEmpty() ^ i11) != 0) {
                    ((AbstractC29069a) arrayList10.get(arrayList10.size() - i11)).m145138a().m137452i(C26723b.a.c.f126749a, AbstractC19074t.m100204b(abstractC29080l2, AbstractC29080l.a.f134882b));
                }
                arrayList10.add(AbstractC29069a.u.f134777b);
            }
        }
        return new C29078j(abstractC29080l, arrayList10, i13, m101349x, 0, false, 0, 112, null);
    }

    /* renamed from: x */
    private final AbstractC29072d m101349x(C29077i c29077i, AbstractC29080l abstractC29080l) {
        int m131511r;
        AbstractC29072d m145245h;
        AbstractC29073e[] m145297y = c29077i.m145297y();
        ArrayList<AbstractC29073e> arrayList = new ArrayList();
        for (AbstractC29073e abstractC29073e : m145297y) {
            if (m101323N(abstractC29073e, c29077i, abstractC29080l)) {
                arrayList.add(abstractC29073e);
            }
        }
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m131511r);
        for (AbstractC29073e abstractC29073e2 : arrayList) {
            if (AbstractC19074t.m100204b(abstractC29080l, AbstractC29080l.a.f134882b) && ((AbstractC19074t.m100204b(abstractC29073e2.m145244g(), AbstractC29076h.q.f134831b) || AbstractC19074t.m100204b(abstractC29073e2.m145244g(), AbstractC29076h.e.f134819b) || AbstractC19074t.m100204b(abstractC29073e2.m145244g(), AbstractC29076h.m.f134827b)) && !AbstractC19074t.m100204b(c29077i.m145284l().m145243f(), abstractC29073e2.m145243f()))) {
                m145245h = AbstractC29072d.c.f134805a;
            } else {
                m145245h = abstractC29073e2.m145245h();
            }
            arrayList2.add(m145245h);
        }
        return m101350y(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e A[EDGE_INSN: B:44:0x007e->B:42:0x007e BREAK  A[LOOP:2: B:30:0x005a->B:37:0x007b], SYNTHETIC] */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AbstractC29072d m101350y(Collection collection) {
        Iterator it;
        Collection collection2 = collection;
        Iterator it2 = collection2.iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (i12 < 0) {
                AbstractC25368s.m131509q();
            }
            if (!AbstractC19074t.m100204b((AbstractC29072d) next, AbstractC29072d.b.f134804a)) {
                if (i12 != -1) {
                    int i13 = 0;
                    for (Object obj : collection2) {
                        if (i13 < 0) {
                            AbstractC25368s.m131509q();
                        }
                        AbstractC29072d abstractC29072d = (AbstractC29072d) obj;
                        if (!AbstractC19074t.m100204b(abstractC29072d, AbstractC29072d.b.f134804a) && !AbstractC19074t.m100204b(abstractC29072d, AbstractC29072d.c.f134805a)) {
                            i13++;
                        } else {
                            if (i13 != -1) {
                                return AbstractC29072d.c.f134805a;
                            }
                            it = collection2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    break;
                                }
                                Object next2 = it.next();
                                if (i11 < 0) {
                                    AbstractC25368s.m131509q();
                                }
                                if (!AbstractC19074t.m100204b((AbstractC29072d) next2, AbstractC29072d.a.f134803a)) {
                                    if (i11 != -1) {
                                        return AbstractC29072d.d.f134806a;
                                    }
                                } else {
                                    i11++;
                                }
                            }
                            return AbstractC29072d.a.f134803a;
                        }
                    }
                    it = collection2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                        i11++;
                    }
                    return AbstractC29072d.a.f134803a;
                }
            } else {
                i12++;
            }
        }
        return AbstractC29072d.b.f134804a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c A[EDGE_INSN: B:32:0x004c->B:30:0x004c BREAK  A[LOOP:2: B:22:0x0035->B:25:0x0049], SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final AbstractC29072d m101351z(AbstractC29072d... abstractC29072dArr) {
        int length;
        int length2 = abstractC29072dArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= length2) {
                break;
            }
            if (!AbstractC19074t.m100204b(abstractC29072dArr[i12], AbstractC29072d.b.f134804a)) {
                if (i12 != -1) {
                    int length3 = abstractC29072dArr.length;
                    for (int i13 = 0; i13 < length3; i13++) {
                        AbstractC29072d abstractC29072d = abstractC29072dArr[i13];
                        if (AbstractC19074t.m100204b(abstractC29072d, AbstractC29072d.b.f134804a) || AbstractC19074t.m100204b(abstractC29072d, AbstractC29072d.c.f134805a)) {
                            if (i13 != -1) {
                                return AbstractC29072d.c.f134805a;
                            }
                            length = abstractC29072dArr.length;
                            while (true) {
                                if (i11 >= length) {
                                    break;
                                }
                                if (!AbstractC19074t.m100204b(abstractC29072dArr[i11], AbstractC29072d.a.f134803a)) {
                                    if (i11 != -1) {
                                        return AbstractC29072d.d.f134806a;
                                    }
                                } else {
                                    i11++;
                                }
                            }
                            return AbstractC29072d.a.f134803a;
                        }
                    }
                    length = abstractC29072dArr.length;
                    while (true) {
                        if (i11 >= length) {
                        }
                        i11++;
                    }
                    return AbstractC29072d.a.f134803a;
                }
            } else {
                i12++;
            }
        }
        return AbstractC29072d.b.f134804a;
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C18316b c18316b;
        if (isCancelled()) {
            return;
        }
        C19322f1.f95950a.m101144W();
        InterfaceC18319c m101438e = m101438e();
        C19325g1 c19325g1 = null;
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C19325g1) {
            c19325g1 = (C19325g1) obj;
        }
        if (c19325g1 == null) {
            return;
        }
        C29077i m101247x = c19325g1.m101247x();
        m101332W(m101247x, c19325g1);
        m101331V(m101247x);
        String m97246b = this.f96088t.m97246b();
        switch (m97246b.hashCode()) {
            case -1374017666:
                if (m97246b.equals("ACTION_SEARCH_TASK_RESULT_ADD_DATA")) {
                    if (this.f96088t.m97245a() instanceof C29074f) {
                        m101344r(m101247x, ((C29074f) this.f96088t.m97245a()).m145253a());
                        return;
                    } else {
                        if (this.f96088t.m97245a() instanceof AbstractC29073e) {
                            m101345s(m101247x, (AbstractC29073e) this.f96088t.m97245a());
                            return;
                        }
                        return;
                    }
                }
                return;
            case -434738901:
                if (m97246b.equals("ACTION_CLEAR_SEARCH_RESULT_STATE")) {
                    m101318I(m101247x);
                    return;
                }
                return;
            case 1277367389:
                if (m97246b.equals("ACTION_SEARCH_TASK_RESULT_SET_DATA")) {
                    if (this.f96088t.m97245a() instanceof C29074f) {
                        m101337b0(m101247x, ((C29074f) this.f96088t.m97245a()).m145253a());
                        return;
                    } else {
                        if (this.f96088t.m97245a() instanceof AbstractC29073e) {
                            m101338c0(m101247x, (AbstractC29073e) this.f96088t.m97245a());
                            return;
                        }
                        return;
                    }
                }
                return;
            case 1883681944:
                if (m97246b.equals("Search.Result.ClickItemSeeMore") && (this.f96088t.m97245a() instanceof AbstractC29069a.s)) {
                    m101320K(this, m101247x, (AbstractC29069a.s) this.f96088t.m97245a(), null, 2, null);
                    C19955h.f98250a.m103730s(c19325g1, (InterfaceC26722a) this.f96088t.m97245a(), 0, 1);
                    return;
                }
                return;
            default:
                return;
        }
    }
}

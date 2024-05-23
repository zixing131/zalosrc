package p606wd;

import ag0.AbstractC0837p0;
import am.AbstractC0924m0;
import android.util.SparseArray;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import bg0.C2797c;
import com.zing.zalo.birthdayhub.view.C7386a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p205hc.AbstractC19963b;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23304d;
import p444qd.C25227e;
import p480rd.AbstractC25731b;
import p480rd.AbstractC25732c;
import p480rd.C25730a;
import p480rd.C25733d;
import p480rd.C25734e;
import p534u1.AbstractC26941a;
import p606wd.C28918e;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import sd.C26231b;

/* renamed from: wd.e */
/* loaded from: classes3.dex */
public final class C28918e extends AbstractC19963b {
    public static final b Companion = new b(null);

    /* renamed from: E */
    private static final InterfaceC24854k f133857E;

    /* renamed from: D */
    private volatile boolean f133861D;

    /* renamed from: t */
    private final C2797c f133862t = new C2797c(AbstractC0837p0.Companion.m2236a());

    /* renamed from: u */
    private final C1761c0 f133863u = new C1761c0();

    /* renamed from: v */
    private final C1761c0 f133864v = new C1761c0();

    /* renamed from: w */
    private final C1761c0 f133865w = new C1761c0();

    /* renamed from: x */
    private final C1761c0 f133866x = new C1761c0();

    /* renamed from: y */
    private final HashMap f133867y = new HashMap();

    /* renamed from: z */
    private final CopyOnWriteArrayList f133868z = new CopyOnWriteArrayList(m144453m0());

    /* renamed from: A */
    private final InterfaceC29232g f133858A = AbstractC29233h.m145990a(d.f133870q);

    /* renamed from: B */
    private final Set f133859B = Collections.synchronizedSet(new HashSet());

    /* renamed from: C */
    private final LinkedList f133860C = new LinkedList();

    /* renamed from: wd.e$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f133869q = new a();

        a() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final int m144474c(AbstractC25731b abstractC25731b, AbstractC25731b abstractC25731b2) {
            AbstractC19074t.m100208f(abstractC25731b, "event1");
            AbstractC19074t.m100208f(abstractC25731b2, "event2");
            try {
                long mo132825c = abstractC25731b.mo132825c();
                long mo132825c2 = abstractC25731b2.mo132825c();
                if (mo132825c > mo132825c2) {
                    return 1;
                }
                if (mo132825c < mo132825c2) {
                    return -1;
                }
                if ((abstractC25731b instanceof AbstractC25731b.a) && (abstractC25731b2 instanceof AbstractC25731b.a)) {
                    if (AbstractC19074t.m100204b(((AbstractC25731b.a) abstractC25731b).m132829g().f42434r, CoreUtility.f89233i)) {
                        return -1;
                    }
                    if (AbstractC19074t.m100204b(((AbstractC25731b.a) abstractC25731b2).m132829g().f42434r, CoreUtility.f89233i)) {
                        return 1;
                    }
                    String str = ((AbstractC25731b.a) abstractC25731b).m132829g().f42440t;
                    String str2 = ((AbstractC25731b.a) abstractC25731b2).m132829g().f42440t;
                    AbstractC19074t.m100207e(str2, "dpnNoSign");
                    int compareTo = str.compareTo(str2);
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    int m100210h = AbstractC19074t.m100210h(Long.parseLong(abstractC25731b.m132824b()), Long.parseLong(abstractC25731b2.m132824b()));
                    if (m100210h != 0) {
                        return m100210h;
                    }
                }
                return 0;
            } catch (Exception e11) {
                AbstractC23350e.m122776f("[BirthdayHub]", e11);
                return 0;
            }
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Comparator mo12V4() {
            return new Comparator() { // from class: wd.d
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int m144474c;
                    m144474c = C28918e.a.m144474c((AbstractC25731b) obj, (AbstractC25731b) obj2);
                    return m144474c;
                }
            };
        }
    }

    /* renamed from: wd.e$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final Comparator m144477b() {
            return (Comparator) C28918e.f133857E.getValue();
        }
    }

    /* renamed from: wd.e$c */
    /* loaded from: classes3.dex */
    public static final class c implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C28918e();
        }
    }

    /* renamed from: wd.e$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f133870q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SparseArray mo12V4() {
            return C25227e.Companion.m130506a().m130503j();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wd.e$e */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ C25734e f133872r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C25734e c25734e) {
            super(1);
            this.f133872r = c25734e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m144480c(C28918e c28918e, JSONObject jSONObject, C25734e c25734e) {
            AbstractC19074t.m100208f(c28918e, "this$0");
            AbstractC19074t.m100208f(jSONObject, "$jsonResult");
            AbstractC19074t.m100208f(c25734e, "$it");
            c28918e.m144426A0(jSONObject, c25734e);
        }

        /* renamed from: b */
        public final void m144481b(final JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "jsonResult");
            C2797c c2797c = C28918e.this.f133862t;
            final C28918e c28918e = C28918e.this;
            final C25734e c25734e = this.f133872r;
            c2797c.mo13474a(new Runnable() { // from class: wd.f
                @Override // java.lang.Runnable
                public final void run() {
                    C28918e.e.m144480c(C28918e.this, jSONObject, c25734e);
                }
            });
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m144481b((JSONObject) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wd.e$f */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: r */
        final /* synthetic */ C25734e f133874r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(C25734e c25734e) {
            super(2);
            this.f133874r = c25734e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static final void m144483c(C28918e c28918e, C25734e c25734e) {
            AbstractC19074t.m100208f(c28918e, "this$0");
            AbstractC19074t.m100208f(c25734e, "$it");
            c28918e.m144461y0(c25734e);
        }

        /* renamed from: b */
        public final void m144484b(int i11, String str) {
            AbstractC19074t.m100208f(str, "<anonymous parameter 1>");
            C2797c c2797c = C28918e.this.f133862t;
            final C28918e c28918e = C28918e.this;
            final C25734e c25734e = this.f133874r;
            c2797c.mo13474a(new Runnable() { // from class: wd.g
                @Override // java.lang.Runnable
                public final void run() {
                    C28918e.f.m144483c(C28918e.this, c25734e);
                }
            });
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m144484b(((Number) obj).intValue(), (String) obj2);
            return C24848g0.f119245a;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f133869q);
        f133857E = m129210a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public final void m144426A0(JSONObject jSONObject, C25734e c25734e) {
        try {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("data");
                if (optJSONObject != null) {
                    m144427B0(c25734e, optJSONObject.optJSONArray("birthday_on"));
                } else {
                    List<C25733d> m132843a = c25734e.m132843a();
                    if (m132843a != null) {
                        for (C25733d c25733d : m132843a) {
                            C25733d m144447c0 = m144447c0(c25733d.m132839d(), c25733d.m132838c());
                            if (m144447c0 != null) {
                                m144447c0.m132841f(false);
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("[BirthdayHub]", e11);
            }
            m144430G0(c25734e);
            this.f133861D = false;
            this.f133865w.mo9221n(Boolean.FALSE);
            m144432J0();
        } catch (Throwable th2) {
            m144430G0(c25734e);
            this.f133861D = false;
            this.f133865w.mo9221n(Boolean.FALSE);
            m144432J0();
            throw th2;
        }
    }

    /* renamed from: B0 */
    private final void m144427B0(C25734e c25734e, JSONArray jSONArray) {
        int optInt;
        ContactProfile m134874l;
        Map m132844b;
        Long l11;
        if (jSONArray != null) {
            Calendar m134869f = C26231b.f124604a.m134869f();
            HashMap hashMap = new HashMap();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                if (optJSONObject != null && (optInt = optJSONObject.optInt("uid")) > 0 && (m134874l = C26231b.f124604a.m134874l(String.valueOf(optInt))) != null && (m132844b = c25734e.m132844b()) != null && (l11 = (Long) m132844b.get(String.valueOf(optInt))) != null) {
                    long longValue = l11.longValue();
                    ArrayList arrayList = (ArrayList) hashMap.get(Long.valueOf(longValue));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Long.valueOf(longValue), arrayList);
                    }
                    ArrayList arrayList2 = arrayList;
                    AbstractC19074t.m100205c(arrayList2);
                    m144443X(longValue, m134874l, m134869f, arrayList2);
                }
            }
            List<C25733d> m132843a = c25734e.m132843a();
            if (m132843a != null) {
                for (C25733d c25733d : m132843a) {
                    ArrayList arrayList3 = (ArrayList) hashMap.get(Long.valueOf(c25733d.m132839d()));
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    m144444Y(c25733d.m132839d(), arrayList3);
                    C25733d m144459t0 = m144459t0(c25733d.m132839d(), c25733d.m132838c());
                    m144433K0(arrayList3, m144459t0);
                    m144459t0.m132841f(true);
                }
            }
            m144429F0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E0 */
    public static final void m144428E0(C28918e c28918e) {
        AbstractC19074t.m100208f(c28918e, "this$0");
        c28918e.m144429F0();
    }

    /* renamed from: F0 */
    private final void m144429F0() {
        this.f133864v.mo9221n(m144442W(m144456p0()));
    }

    /* renamed from: G0 */
    private final void m144430G0(C25734e c25734e) {
        try {
            List<C25733d> m132843a = c25734e.m132843a();
            if (m132843a != null) {
                for (C25733d c25733d : m132843a) {
                    this.f133859B.remove(m144455o0(c25733d.m132839d(), c25733d.m132838c()));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("[BirthdayHub]", e11);
        }
    }

    /* renamed from: I0 */
    private final void m144431I0(List list) {
        synchronized (this.f133860C) {
            this.f133860C.addAll(list);
        }
        m144432J0();
    }

    /* renamed from: J0 */
    private final void m144432J0() {
        C24848g0 c24848g0;
        if (!this.f133860C.isEmpty() && !this.f133861D) {
            this.f133861D = true;
            C25734e m144451k0 = m144451k0(m144452l0());
            if (m144451k0 != null) {
                C25227e.Companion.m130506a().m130501h(m144451k0, new e(m144451k0), new f(m144451k0));
                c24848g0 = C24848g0.f119245a;
            } else {
                c24848g0 = null;
            }
            if (c24848g0 == null) {
                m144446b0();
            }
        }
    }

    /* renamed from: K0 */
    private final void m144433K0(ArrayList arrayList, C25733d c25733d) {
        c25733d.m132842g(arrayList);
    }

    /* renamed from: V */
    private final List m144441V() {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        AbstractC23160o0.m119289s1(calendar);
        calendar.add(1, -1);
        for (int i11 = 0; i11 < 36; i11++) {
            Object clone = calendar.clone();
            AbstractC19074t.m100206d(clone, "null cannot be cast to non-null type java.util.Calendar");
            arrayList.add(new C25730a((Calendar) clone));
            calendar.add(2, 1);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ee, code lost:            if (me0.AbstractC23160o0.m119235a1(r13, r4) != false) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f7, code lost:            if ((!r1.isEmpty()) == false) goto L44;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f9, code lost:            r7 = r1.get(r1.size() - 1);     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:            if ((r7 instanceof p480rd.AbstractC25732c.d) == false) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:            r7 = (p480rd.AbstractC25732c.d) r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010a, code lost:            if (r7 != null) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010d, code lost:            r7.m132835e(true);     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0109, code lost:            r7 = null;     */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final List m144442W(ArrayList arrayList) {
        boolean z11;
        long j11;
        boolean z12;
        int i11;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        Calendar calendar3 = Calendar.getInstance();
        AbstractC23160o0.m119289s1(calendar2);
        calendar2.add(1, -1);
        AbstractC23160o0.m119298v1(calendar3);
        calendar3.add(1, 1);
        long timeInMillis = calendar2.getTimeInMillis();
        long timeInMillis2 = calendar3.getTimeInMillis();
        int i12 = 0;
        int i13 = 0;
        while (i12 < 36) {
            boolean m119238b1 = AbstractC23160o0.m119238b1(calendar2, calendar);
            arrayList3.add(new AbstractC25732c.g(calendar2.getTimeInMillis()));
            ArrayList<AbstractC25731b> arrayList4 = new ArrayList();
            int i14 = i13;
            while (true) {
                if (i13 < arrayList.size()) {
                    z11 = m119238b1;
                    long mo132825c = ((AbstractC25731b) arrayList2.get(i13)).mo132825c();
                    gregorianCalendar.setTimeInMillis(mo132825c);
                    if (mo132825c >= timeInMillis && mo132825c <= timeInMillis2) {
                        if (!AbstractC23160o0.m119238b1(calendar2, gregorianCalendar)) {
                            break;
                        }
                        Object obj = arrayList2.get(i13);
                        AbstractC19074t.m100207e(obj, "get(...)");
                        arrayList4.add(obj);
                        i13++;
                        i14++;
                    } else {
                        arrayList2.remove(i13);
                    }
                    m119238b1 = z11;
                } else {
                    z11 = m119238b1;
                    break;
                }
            }
            if (arrayList4.isEmpty()) {
                arrayList3.add(new AbstractC25732c.c(calendar2.getTimeInMillis()));
                j11 = timeInMillis;
                z12 = z11;
            } else {
                HashMap hashMap = new HashMap();
                Calendar calendar4 = null;
                for (AbstractC25731b abstractC25731b : arrayList4) {
                    long j12 = timeInMillis;
                    gregorianCalendar.setTimeInMillis(abstractC25731b.mo132825c());
                    if (z11 && AbstractC23160o0.m119233a(calendar, gregorianCalendar) == -1) {
                        arrayList3.add(new AbstractC25732c.b(AbstractC23160o0.m119297v0(calendar.getTimeInMillis()), false, 2, null));
                        z11 = false;
                    }
                    if (z11 && AbstractC23160o0.m119235a1(gregorianCalendar, calendar)) {
                        z11 = false;
                    }
                    arrayList3.add(new AbstractC25732c.h(AbstractC23160o0.m119297v0(abstractC25731b.mo132825c())));
                    Object clone = gregorianCalendar.clone();
                    AbstractC19074t.m100206d(clone, "null cannot be cast to non-null type java.util.Calendar");
                    calendar4 = (Calendar) clone;
                    Calendar calendar5 = calendar4;
                    arrayList3.add(new AbstractC25732c.d(abstractC25731b, false, 2, null));
                    long m119297v0 = AbstractC23160o0.m119297v0(abstractC25731b.mo132825c());
                    Long valueOf = Long.valueOf(m119297v0);
                    Integer num = (Integer) hashMap.get(Long.valueOf(m119297v0));
                    if (num != null) {
                        i11 = num.intValue() + 1;
                    } else {
                        i11 = 1;
                    }
                    hashMap.put(valueOf, Integer.valueOf(i11));
                    calendar4 = calendar5;
                    timeInMillis = j12;
                }
                j11 = timeInMillis;
                this.f133867y.put(Long.valueOf(calendar2.getTimeInMillis()), hashMap);
                z12 = z11;
            }
            if (z12) {
                arrayList3.add(new AbstractC25732c.b(AbstractC23160o0.m119297v0(calendar.getTimeInMillis()), false, 2, null));
            }
            calendar2.add(2, 1);
            i12++;
            arrayList2 = arrayList;
            i13 = i14;
            timeInMillis = j11;
        }
        arrayList3.add(new AbstractC25732c.e(calendar2.getTimeInMillis()));
        return arrayList3;
    }

    /* renamed from: X */
    private final void m144443X(long j11, ContactProfile contactProfile, Calendar calendar, ArrayList arrayList) {
        calendar.setTimeInMillis(j11);
        int i11 = calendar.get(1);
        C26231b c26231b = C26231b.f124604a;
        int m134871h = c26231b.m134871h(contactProfile, calendar);
        int m134873k = c26231b.m134873k(contactProfile, calendar);
        AbstractC23160o0.m119283q1(calendar);
        calendar.set(1, i11);
        calendar.set(2, m134873k);
        calendar.set(5, m134871h);
        int i12 = calendar.get(5);
        int i13 = calendar.get(2);
        if (m134871h == i12 && m134873k == i13) {
            String mo2478b = contactProfile.mo2478b();
            AbstractC19074t.m100207e(mo2478b, "getUid(...)");
            AbstractC25731b.a aVar = new AbstractC25731b.a(mo2478b, calendar.getTimeInMillis(), contactProfile);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC25731b abstractC25731b = (AbstractC25731b) it.next();
                if (AbstractC19074t.m100204b(aVar.m132824b() + aVar.m132826d(), abstractC25731b.m132824b() + abstractC25731b.m132826d())) {
                    return;
                }
            }
            arrayList.add(aVar);
        }
    }

    /* renamed from: Y */
    private final void m144444Y(long j11, ArrayList arrayList) {
        ContactProfile contactProfile = AbstractC23304d.f113368c0;
        if (contactProfile != null) {
            C26231b c26231b = C26231b.f124604a;
            Calendar m134869f = c26231b.m134869f();
            int m134873k = c26231b.m134873k(contactProfile, m134869f);
            m134869f.setTimeInMillis(j11);
            if (m134873k == m134869f.get(2)) {
                m144443X(j11, contactProfile, m134869f, arrayList);
            }
        }
    }

    /* renamed from: a0 */
    private final ArrayList m144445a0(List list, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        Calendar m134869f = C26231b.f124604a.m134869f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC25731b mo132823a = ((AbstractC25731b) it.next()).mo132823a();
            m134869f.setTimeInMillis(mo132823a.m132826d());
            m134869f.set(1, i11);
            mo132823a.m132827e(m134869f.getTimeInMillis());
            arrayList.add(mo132823a);
        }
        return arrayList;
    }

    /* renamed from: b0 */
    private final void m144446b0() {
        this.f133861D = false;
        this.f133865w.mo9221n(Boolean.FALSE);
        m144432J0();
    }

    /* renamed from: c0 */
    private final C25733d m144447c0(long j11, long j12) {
        Iterator it = this.f133868z.iterator();
        while (it.hasNext()) {
            C25733d c25733d = (C25733d) it.next();
            if (c25733d.m132839d() == j11 && c25733d.m132838c() == j12) {
                return c25733d;
            }
        }
        return null;
    }

    /* renamed from: f0 */
    private final boolean m144448f0(ArrayList arrayList, C25733d c25733d, int i11, int i12) {
        String m144455o0 = m144455o0(c25733d.m132839d(), c25733d.m132838c());
        C25733d m144454n0 = m144454n0(i11);
        if (m144454n0 != null) {
            c25733d.m132842g(m144445a0(m144454n0.m132836a(), i12));
            c25733d.m132841f(true);
            return true;
        }
        if (!this.f133859B.contains(m144455o0)) {
            this.f133859B.add(m144455o0);
            arrayList.add(c25733d);
            ArrayList arrayList2 = new ArrayList(1);
            m144444Y(c25733d.m132839d(), arrayList2);
            if (!arrayList2.isEmpty()) {
                m144433K0(arrayList2, c25733d);
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m144449i0(C28918e c28918e, Calendar calendar, int i11) {
        AbstractC19074t.m100208f(c28918e, "this$0");
        AbstractC19074t.m100208f(calendar, "$fromMonth");
        c28918e.m144450j0(calendar, i11);
    }

    /* renamed from: j0 */
    private final void m144450j0(Calendar calendar, int i11) {
        if (i11 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Object clone = calendar.clone();
        AbstractC19074t.m100206d(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) clone;
        calendar2.set(5, 15);
        calendar2.setTimeZone(C26231b.f124604a.m134872i());
        boolean z11 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            AbstractC23160o0.m119286r1(calendar2);
            long timeInMillis = calendar2.getTimeInMillis();
            int i13 = calendar2.get(2);
            int i14 = calendar2.get(1);
            AbstractC23160o0.m119295u1(calendar2);
            C25733d m144459t0 = m144459t0(timeInMillis, calendar2.getTimeInMillis());
            if (!m144459t0.m132840e()) {
                boolean m144448f0 = m144448f0(arrayList, m144459t0, i13, i14);
                if (!z11 && !m144448f0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
            }
            calendar2.add(2, 1);
        }
        if (z11) {
            m144429F0();
        }
        m144431I0(arrayList);
    }

    /* renamed from: k0 */
    private final C25734e m144451k0(LinkedList linkedList) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedList.iterator();
        long j11 = Long.MIN_VALUE;
        long j12 = Long.MAX_VALUE;
        while (true) {
            List list = null;
            if (!it.hasNext()) {
                break;
            }
            C25733d c25733d = (C25733d) it.next();
            if (!c25733d.m132840e()) {
                j12 = Math.min(j12, c25733d.m132839d());
                j11 = Math.max(j11, c25733d.m132838c());
                List m144457q0 = m144457q0(c25733d.m132839d());
                if (m144457q0 != null) {
                    if (!m144457q0.isEmpty()) {
                        list = m144457q0;
                    }
                    if (list != null) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            hashMap.put((String) it2.next(), Long.valueOf(c25733d.m132839d()));
                        }
                        arrayList.add(c25733d);
                    }
                }
                this.f133859B.remove(m144455o0(c25733d.m132839d(), c25733d.m132838c()));
                arrayList.add(c25733d);
            } else {
                this.f133859B.remove(m144455o0(c25733d.m132839d(), c25733d.m132838c()));
            }
        }
        if (!(!hashMap.isEmpty())) {
            return null;
        }
        C25734e c25734e = new C25734e(j12, j11, hashMap, 0, 8, null);
        c25734e.m132848f(arrayList);
        return c25734e;
    }

    /* renamed from: l0 */
    private final LinkedList m144452l0() {
        LinkedList linkedList = new LinkedList();
        synchronized (this.f133860C) {
            int i11 = 3;
            while (!this.f133860C.isEmpty()) {
                try {
                    linkedList.add(this.f133860C.removeFirst());
                    i11--;
                    if (i11 == 0) {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        return linkedList;
    }

    /* renamed from: m0 */
    private final ArrayList m144453m0() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(5, 15);
        calendar.setTimeZone(C26231b.f124604a.m134872i());
        calendar.add(2, -1);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 1; i11 < 4; i11++) {
            AbstractC23160o0.m119286r1(calendar);
            long timeInMillis = calendar.getTimeInMillis();
            AbstractC23160o0.m119295u1(calendar);
            arrayList.add(new C25733d(timeInMillis, calendar.getTimeInMillis(), null, 4, null));
            calendar.add(2, 1);
        }
        return arrayList;
    }

    /* renamed from: n0 */
    private final C25733d m144454n0(int i11) {
        Calendar m134869f = C26231b.f124604a.m134869f();
        Iterator it = this.f133868z.iterator();
        while (it.hasNext()) {
            C25733d c25733d = (C25733d) it.next();
            m134869f.setTimeInMillis(c25733d.m132839d());
            if (m134869f.get(2) == i11 && c25733d.m132840e()) {
                return c25733d;
            }
        }
        return null;
    }

    /* renamed from: o0 */
    private final String m144455o0(long j11, long j12) {
        return j11 + "-" + j12;
    }

    /* renamed from: p0 */
    private final ArrayList m144456p0() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f133868z.iterator();
        while (it.hasNext()) {
            arrayList.addAll(((C25733d) it.next()).m132837b());
        }
        Collections.sort(arrayList, Companion.m144477b());
        return arrayList;
    }

    /* renamed from: q0 */
    private final List m144457q0(long j11) {
        Calendar m134869f = C26231b.f124604a.m134869f();
        m134869f.setTimeInMillis(j11);
        return (List) m144458s0().get(m134869f.get(2));
    }

    /* renamed from: s0 */
    private final SparseArray m144458s0() {
        return (SparseArray) this.f133858A.getValue();
    }

    /* renamed from: t0 */
    private final C25733d m144459t0(long j11, long j12) {
        C25733d m144447c0 = m144447c0(j11, j12);
        if (m144447c0 == null) {
            C25733d c25733d = new C25733d(j11, j12, null, 4, null);
            this.f133868z.add(c25733d);
            return c25733d;
        }
        return m144447c0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public static final void m144460x0(C28918e c28918e) {
        AbstractC19074t.m100208f(c28918e, "this$0");
        c28918e.f133863u.mo9221n(new C24860q(c28918e.m144441V(), c28918e.m144442W(c28918e.m144456p0())));
        Calendar calendar = Calendar.getInstance();
        AbstractC19074t.m100207e(calendar, "getInstance(...)");
        calendar.add(2, -1);
        c28918e.m144450j0(calendar, 3);
        if (AbstractC0924m0.m3192Ka()) {
            AbstractC0924m0.m3518Vh(false);
            AbstractC21935u.m114544k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y0 */
    public final void m144461y0(C25734e c25734e) {
        try {
            try {
                List<C25733d> m132843a = c25734e.m132843a();
                if (m132843a != null) {
                    for (C25733d c25733d : m132843a) {
                        C25733d m144447c0 = m144447c0(c25733d.m132839d(), c25733d.m132838c());
                        if (m144447c0 != null) {
                            m144447c0.m132841f(false);
                        }
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122776f("[BirthdayHub]", e11);
            }
        } finally {
            m144430G0(c25734e);
            this.f133861D = false;
            this.f133865w.mo9221n(Boolean.FALSE);
            m144432J0();
        }
    }

    /* renamed from: C0 */
    public final void m144462C0() {
        this.f133858A.reset();
        this.f133866x.mo9221n(Boolean.TRUE);
    }

    /* renamed from: D0 */
    public final void m144463D0() {
        this.f133862t.mo13474a(new Runnable() { // from class: wd.a
            @Override // java.lang.Runnable
            public final void run() {
                C28918e.m144428E0(C28918e.this);
            }
        });
    }

    /* renamed from: Z */
    public final void m144464Z() {
        C26231b.m134864c(false, 1, null);
    }

    /* renamed from: e0 */
    public final LiveData m144465e0() {
        return this.f133863u;
    }

    /* renamed from: g0 */
    public final LiveData m144466g0() {
        return this.f133864v;
    }

    /* renamed from: h0 */
    public final void m144467h0(final Calendar calendar, final int i11) {
        AbstractC19074t.m100208f(calendar, "fromMonth");
        this.f133862t.mo13474a(new Runnable() { // from class: wd.c
            @Override // java.lang.Runnable
            public final void run() {
                C28918e.m144449i0(C28918e.this, calendar, i11);
            }
        });
    }

    /* renamed from: r0 */
    public final HashMap m144468r0() {
        return this.f133867y;
    }

    /* renamed from: u0 */
    public final LiveData m144469u0() {
        return this.f133866x;
    }

    /* renamed from: v0 */
    public final LiveData m144470v0() {
        return this.f133865w;
    }

    /* renamed from: w0 */
    public final void m144471w0() {
        this.f133862t.mo13474a(new Runnable() { // from class: wd.b
            @Override // java.lang.Runnable
            public final void run() {
                C28918e.m144460x0(C28918e.this);
            }
        });
    }

    /* renamed from: z0 */
    public void m144472z0(C7386a c7386a) {
        super.m103748N(c7386a);
    }
}

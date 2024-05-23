package py;

import ac.C0708i;
import ac.C0732w;
import ag0.AbstractC0837p0;
import android.text.SpannableStringBuilder;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p062db.C7960e;
import dg0.AbstractC17930e;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import me0.AbstractC23136l9;
import me0.AbstractC23217t2;
import me0.C23212s8;
import p205hc.AbstractC19962a;
import p205hc.InterfaceC19968g;
import p205hc.InterfaceC19969h;
import p374ny.AbstractC23957a;
import p374ny.AbstractC23958b;
import p374ny.C23959c;
import p374ny.C23960d;
import p374ny.C23961e;
import p374ny.C23962f;
import p374ny.C23963g;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import qm0.AbstractC25370t;
import sy.AbstractC26412d;
import th.C26691l;

/* renamed from: py.n */
/* loaded from: classes4.dex */
public final class C24942n extends AbstractC19962a implements InterfaceC24933f {

    /* renamed from: A */
    private boolean f119587A;

    /* renamed from: B */
    private boolean f119588B;

    /* renamed from: C */
    private int f119589C;

    /* renamed from: D */
    private final InterfaceC24854k f119590D;

    /* renamed from: E */
    private final InterfaceC24854k f119591E;

    /* renamed from: F */
    private final InterfaceC24854k f119592F;

    /* renamed from: G */
    private final List f119593G;

    /* renamed from: H */
    private final List f119594H;

    /* renamed from: I */
    private final List f119595I;

    /* renamed from: J */
    private final AtomicBoolean f119596J;

    /* renamed from: K */
    private final boolean f119597K;

    /* renamed from: L */
    private final boolean f119598L;

    /* renamed from: t */
    private final InterfaceC24935g f119599t;

    /* renamed from: u */
    private boolean f119600u;

    /* renamed from: v */
    private final int[] f119601v;

    /* renamed from: w */
    private boolean f119602w;

    /* renamed from: x */
    private boolean f119603x;

    /* renamed from: y */
    private boolean f119604y;

    /* renamed from: z */
    private boolean f119605z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: py.n$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {
        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List mo12V4() {
            List m131185M0;
            List m131502j;
            List list = C24942n.this.f119594H;
            C24942n c24942n = C24942n.this;
            synchronized (list) {
                try {
                    if (!c24942n.f119596J.get() && !list.isEmpty()) {
                        m131185M0 = AbstractC25332a0.m131185M0(list);
                        list.clear();
                        c24942n.m129652cq(m131185M0);
                        AbstractC26412d.a aVar = AbstractC26412d.Companion;
                        m131502j = AbstractC25368s.m131502j();
                        aVar.m136231C(m131502j);
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return list;
        }
    }

    /* renamed from: py.n$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f119607q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_scan_qr_code_phone_number);
        }
    }

    /* renamed from: py.n$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f119608q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_scan_qr_code_text);
        }
    }

    /* renamed from: py.n$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final d f119609q = new d();

        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_wifi_formal);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24942n(InterfaceC24935g interfaceC24935g) {
        super(interfaceC24935g);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        AbstractC19074t.m100208f(interfaceC24935g, "view");
        this.f119599t = interfaceC24935g;
        this.f119601v = new int[]{0, 0, 0, 0, 0};
        m129210a = AbstractC24856m.m129210a(c.f119608q);
        this.f119590D = m129210a;
        m129210a2 = AbstractC24856m.m129210a(b.f119607q);
        this.f119591E = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(d.f119609q);
        this.f119592F = m129210a3;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f119593G = synchronizedList;
        List synchronizedList2 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList2, "synchronizedList(...)");
        this.f119594H = synchronizedList2;
        List synchronizedList3 = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList3, "synchronizedList(...)");
        this.f119595I = synchronizedList3;
        this.f119596J = new AtomicBoolean(true);
        this.f119598L = !this.f119597K;
    }

    /* renamed from: Sp */
    private final void m129644Sp() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: py.j
            @Override // java.lang.Runnable
            public final void run() {
                C24942n.m129645Tp(C24942n.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Tp */
    public static final void m129645Tp(final C24942n c24942n) {
        int m131511r;
        AbstractC19074t.m100208f(c24942n, "this$0");
        List list = c24942n.f119593G;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            AbstractC23957a abstractC23957a = (AbstractC23957a) obj;
            if ((abstractC23957a instanceof AbstractC23957a.b) && ((AbstractC23957a.b) abstractC23957a).m125371i()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        C24860q c24860q = new C24860q(arrayList, arrayList2);
        List list2 = c24942n.f119594H;
        synchronized (list2) {
            try {
                c24942n.m129652cq(list2);
                list2.clear();
                Iterable iterable = (Iterable) c24860q.m129215c();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : iterable) {
                    if (obj2 instanceof AbstractC23957a.b) {
                        arrayList3.add(obj2);
                    }
                }
                m131511r = AbstractC25370t.m131511r(arrayList3, 10);
                ArrayList arrayList4 = new ArrayList(m131511r);
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(Long.valueOf(((AbstractC23957a.b) it.next()).m125365c()));
                }
                list2.addAll(arrayList4);
                AbstractC26412d.Companion.m136231C(list2);
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int size = c24942n.f119594H.size();
        List<AbstractC23957a> list3 = c24942n.f119593G;
        synchronized (list3) {
            try {
                c24942n.f119588B = false;
                for (AbstractC23957a abstractC23957a2 : list3) {
                    if (abstractC23957a2 instanceof AbstractC23957a.b) {
                        ((AbstractC23957a.b) abstractC23957a2).m125373k(false);
                        ((AbstractC23957a.b) abstractC23957a2).m125374l(false);
                        ((AbstractC23957a.b) abstractC23957a2).m125372j("OnSelectStateChanged");
                    }
                }
                c24942n.f119595I.clear();
                c24942n.f119595I.addAll(list3);
                list3.clear();
                list3.addAll((Collection) c24860q.m129216d());
                C24848g0 c24848g02 = C24848g0.f119245a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        final a aVar = new a();
        c24942n.f119596J.set(false);
        c24942n.f119599t.mo49152Wd(size, c24942n.f119597K);
        c24942n.f119599t.mo49155Zm(false);
        AbstractC17930e.Companion.m94551d().mo94531e(new Runnable() { // from class: py.l
            @Override // java.lang.Runnable
            public final void run() {
                C24942n.m129646Wp(C24942n.this, aVar);
            }
        }, 3000L);
        if (!c24942n.f119597K) {
            aVar.mo12V4();
        }
        c24942n.m129660kq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Wp */
    public static final void m129646Wp(C24942n c24942n, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(c24942n, "this$0");
        AbstractC19074t.m100208f(interfaceC18494a, "$performDeleteAction");
        c24942n.f119599t.mo49150PB();
        if (c24942n.f119597K) {
            interfaceC18494a.mo12V4();
        }
    }

    /* renamed from: Xp */
    private final String m129647Xp() {
        return (String) this.f119591E.getValue();
    }

    /* renamed from: Yp */
    private final String m129648Yp() {
        return (String) this.f119590D.getValue();
    }

    /* renamed from: Zp */
    private final String m129649Zp() {
        return (String) this.f119592F.getValue();
    }

    /* renamed from: aq */
    private final void m129650aq(int i11, int i12) {
        boolean z11 = false;
        if (i11 == 0) {
            this.f119599t.mo49158ed(true);
        } else if (i12 == 0) {
            this.f119599t.mo49158ed(false);
        }
        InterfaceC24935g interfaceC24935g = this.f119599t;
        if (i12 != this.f119593G.size()) {
            z11 = true;
        }
        interfaceC24935g.mo49151Ta(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bq */
    public static final void m129651bq(C24942n c24942n) {
        List m131502j;
        AbstractC19074t.m100208f(c24942n, "this$0");
        c24942n.f119594H.clear();
        AbstractC26412d.a aVar = AbstractC26412d.Companion;
        m131502j = AbstractC25368s.m131502j();
        aVar.m136231C(m131502j);
        List list = c24942n.f119593G;
        synchronized (list) {
            list.clear();
            list.addAll(c24942n.f119595I);
            c24942n.f119595I.clear();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        c24942n.m129660kq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cq */
    public final void m129652cq(List list) {
        try {
            C7960e.m41971c6().m42397g4(list);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: dq */
    private final void m129653dq() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: py.i
            @Override // java.lang.Runnable
            public final void run() {
                C24942n.m129654eq(C24942n.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.text.Spannable] */
    /* renamed from: eq */
    public static final void m129654eq(final C24942n c24942n) {
        HashSet m131183K0;
        int m131511r;
        AbstractC23957a.b bVar;
        CharSequence charSequence;
        AbstractC19074t.m100208f(c24942n, "this$0");
        ArrayList<AbstractC23958b> m42496p6 = C7960e.m41971c6().m42496p6();
        m131183K0 = AbstractC25332a0.m131183K0(AbstractC26412d.Companion.m136242m());
        ArrayList<AbstractC23958b> arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        AbstractC19074t.m100205c(m42496p6);
        for (AbstractC23958b abstractC23958b : m42496p6) {
            if (m131183K0.contains(Long.valueOf(abstractC23958b.m125381c()))) {
                arrayList2.add(Long.valueOf(abstractC23958b.m125381c()));
            } else if (arrayList.size() >= C26691l.m137132f()) {
                arrayList2.add(Long.valueOf(abstractC23958b.m125381c()));
            } else {
                AbstractC19074t.m100205c(abstractC23958b);
                arrayList.add(abstractC23958b);
            }
        }
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: py.k
            @Override // java.lang.Runnable
            public final void run() {
                C24942n.m129655fq(C24942n.this, arrayList2);
            }
        });
        m131511r = AbstractC25370t.m131511r(arrayList, 10);
        ArrayList arrayList3 = new ArrayList(m131511r);
        for (AbstractC23958b abstractC23958b2 : arrayList) {
            if ((abstractC23958b2 instanceof C23963g) || (abstractC23958b2 instanceof C23959c)) {
                long m125381c = abstractC23958b2.m125381c();
                String m129648Yp = c24942n.m129648Yp();
                AbstractC19074t.m100207e(m129648Yp, "<get-strText>(...)");
                bVar = new AbstractC23957a.b(abstractC23958b2, m125381c, m129648Yp, abstractC23958b2.m125385g(), null, AbstractC23957a.c.d.f115963e, false, false, 192, null);
            } else if (abstractC23958b2 instanceof C23962f) {
                long m125381c2 = abstractC23958b2.m125381c();
                String m129647Xp = c24942n.m129647Xp();
                AbstractC19074t.m100207e(m129647Xp, "<get-strPhoneNumber>(...)");
                bVar = new AbstractC23957a.b(abstractC23958b2, m125381c2, m129647Xp, abstractC23958b2.m125385g(), null, AbstractC23957a.c.C32911c.f115962e, false, false, 192, null);
            } else if (abstractC23958b2 instanceof C23961e) {
                C23961e c23961e = (C23961e) abstractC23958b2;
                String m125389h = c23961e.m125389h();
                if (m125389h != null && m125389h.length() != 0) {
                    charSequence = new SpannableStringBuilder(c23961e.m125389h());
                } else {
                    charSequence = null;
                }
                if (charSequence != null && c23961e.m125389h() != null) {
                    AbstractC23217t2.m119664p(charSequence, 0, c23961e.m125389h().length(), C23212s8.m119606n(AbstractC2807a.link_01), 0, 33);
                }
                long m125381c3 = abstractC23958b2.m125381c();
                if (charSequence == null) {
                    charSequence = "";
                }
                bVar = new AbstractC23957a.b(abstractC23958b2, m125381c3, charSequence, abstractC23958b2.m125385g(), ((C23961e) abstractC23958b2).m125390i(), AbstractC23957a.c.b.f115961e, false, false, 192, null);
            } else if (abstractC23958b2 instanceof C23960d) {
                long m125381c4 = abstractC23958b2.m125381c();
                String m129649Zp = c24942n.m129649Zp();
                AbstractC19074t.m100207e(m129649Zp, "<get-strWifi>(...)");
                bVar = new AbstractC23957a.b(abstractC23958b2, m125381c4, m129649Zp, abstractC23958b2.m125385g(), null, AbstractC23957a.c.a.f115960e, false, false, 192, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList3.add(bVar);
        }
        List list = c24942n.f119593G;
        synchronized (list) {
            list.clear();
            list.addAll(arrayList3);
            c24942n.m129660kq();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fq */
    public static final void m129655fq(C24942n c24942n, List list) {
        AbstractC19074t.m100208f(c24942n, "this$0");
        AbstractC19074t.m100208f(list, "$toBeDeletedList");
        c24942n.m129652cq(list);
    }

    /* renamed from: gq */
    private final void m129656gq() {
        if (this.f119605z && this.f119587A) {
            this.f119605z = false;
            this.f119587A = false;
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: py.h
                @Override // java.lang.Runnable
                public final void run() {
                    C24942n.m129657hq(C24942n.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hq */
    public static final void m129657hq(C24942n c24942n) {
        AbstractC19074t.m100208f(c24942n, "this$0");
        c24942n.f119599t.mo49156a1();
    }

    /* renamed from: iq */
    private final void m129658iq(int i11) {
        int i12 = this.f119589C;
        if (i12 != i11) {
            this.f119589C = i11;
            m129650aq(i12, i11);
        }
    }

    /* renamed from: jq */
    private final void m129659jq(int i11, int i12) {
        int[] iArr = this.f119601v;
        if (iArr[i11] != i12) {
            iArr[i11] = i12;
            for (int i13 : iArr) {
                if (i13 != 1) {
                    return;
                }
            }
            m129661Ii();
        }
    }

    /* renamed from: kq */
    private final void m129660kq() {
        List m131496e;
        List m131185M0;
        if (this.f119602w && !this.f119603x) {
            this.f119604y = true;
        } else if (!this.f119593G.isEmpty()) {
            InterfaceC24935g interfaceC24935g = this.f119599t;
            m131185M0 = AbstractC25332a0.m131185M0(this.f119593G);
            interfaceC24935g.mo49157bu(m131185M0);
        } else {
            InterfaceC24935g interfaceC24935g2 = this.f119599t;
            m131496e = AbstractC25366r.m131496e(AbstractC23957a.a.f115946a);
            interfaceC24935g2.mo49157bu(m131496e);
        }
        this.f119599t.mo49146Dw(this.f119593G.isEmpty());
    }

    @Override // py.InterfaceC24933f
    /* renamed from: C3 */
    public void mo129617C3() {
        this.f119605z = true;
        m129656gq();
    }

    @Override // py.InterfaceC24933f
    /* renamed from: D6 */
    public void mo129618D6() {
        boolean z11;
        if (this.f119598L) {
            InterfaceC24935g interfaceC24935g = this.f119599t;
            int i11 = this.f119589C;
            if (i11 == this.f119593G.size()) {
                z11 = true;
            } else {
                z11 = false;
            }
            interfaceC24935g.mo49149Gb(i11, z11);
            return;
        }
        m129644Sp();
    }

    /* renamed from: Ii */
    public void m129661Ii() {
        this.f119603x = true;
        if (this.f119604y) {
            m129660kq();
        }
    }

    @Override // py.InterfaceC24933f
    /* renamed from: L */
    public void mo129619L() {
        m129653dq();
        m129659jq(1, 1);
    }

    @Override // py.InterfaceC24933f
    /* renamed from: M2 */
    public void mo129620M2() {
        this.f119600u = false;
    }

    @Override // py.InterfaceC24933f
    /* renamed from: N0 */
    public void mo129621N0() {
        this.f119600u = true;
    }

    @Override // p205hc.AbstractC19962a, p205hc.InterfaceC19966e
    /* renamed from: Nd */
    public void mo995Nd(InterfaceC19969h interfaceC19969h, InterfaceC19968g interfaceC19968g) {
        super.mo995Nd(interfaceC19969h, interfaceC19968g);
        m129659jq(0, 1);
    }

    @Override // py.InterfaceC24933f
    /* renamed from: O7 */
    public void mo129622O7() {
    }

    @Override // py.InterfaceC24933f
    /* renamed from: U0 */
    public void mo129623U0() {
        this.f119587A = true;
        m129656gq();
    }

    @Override // py.InterfaceC24933f
    /* renamed from: Z2 */
    public void mo129624Z2() {
        m129659jq(4, 1);
    }

    @Override // py.InterfaceC24933f
    /* renamed from: aj */
    public void mo129625aj() {
        for (AbstractC23957a abstractC23957a : this.f119593G) {
            if (abstractC23957a instanceof AbstractC23957a.b) {
                AbstractC23957a.b bVar = (AbstractC23957a.b) abstractC23957a;
                bVar.m125373k(true);
                bVar.m125374l(true);
            }
        }
        m129658iq(this.f119593G.size());
        this.f119599t.mo49145Ca(null);
    }

    @Override // py.InterfaceC24933f
    /* renamed from: cm */
    public void mo129626cm() {
        if (!this.f119588B) {
            this.f119588B = true;
            for (AbstractC23957a abstractC23957a : this.f119593G) {
                if (abstractC23957a instanceof AbstractC23957a.b) {
                    AbstractC23957a.b bVar = (AbstractC23957a.b) abstractC23957a;
                    bVar.m125373k(true);
                    bVar.m125374l(false);
                }
            }
            m129658iq(0);
            this.f119599t.mo49155Zm(true);
            this.f119599t.mo49145Ca(null);
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1072c("edit_action", 1);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "scan_qr_recent_edit", "", c0708i, null, 8, null);
            return;
        }
        this.f119588B = false;
        for (AbstractC23957a abstractC23957a2 : this.f119593G) {
            if (abstractC23957a2 instanceof AbstractC23957a.b) {
                ((AbstractC23957a.b) abstractC23957a2).m125373k(false);
            }
        }
        this.f119599t.mo49155Zm(false);
        this.f119599t.mo49145Ca(null);
    }

    @Override // py.InterfaceC24933f
    /* renamed from: d9 */
    public void mo129627d9(AbstractC23957a.b bVar) {
        AbstractC19074t.m100208f(bVar, "item");
        if (!this.f119588B) {
            this.f119588B = true;
            for (AbstractC23957a abstractC23957a : this.f119593G) {
                if (abstractC23957a instanceof AbstractC23957a.b) {
                    AbstractC23957a.b bVar2 = (AbstractC23957a.b) abstractC23957a;
                    bVar2.m125373k(true);
                    bVar2.m125374l(false);
                }
            }
            bVar.m125374l(true);
            m129658iq(1);
            this.f119599t.mo49155Zm(true);
            this.f119599t.mo49145Ca(null);
            C0732w m1189a = C0732w.Companion.m1189a();
            C0708i c0708i = new C0708i();
            c0708i.m1072c("edit_action", 2);
            C24848g0 c24848g0 = C24848g0.f119245a;
            C0732w.m1177r(m1189a, "scan_qr_recent_edit", "", c0708i, null, 8, null);
        }
    }

    @Override // py.InterfaceC24933f
    /* renamed from: g1 */
    public void mo129628g1() {
        m129659jq(2, 1);
    }

    @Override // py.InterfaceC24933f
    /* renamed from: j2 */
    public void mo129629j2(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f119602w = true;
    }

    @Override // py.InterfaceC24933f
    /* renamed from: n2 */
    public void mo129630n2(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f119602w = false;
        if (z11) {
            m129659jq(3, 1);
        }
    }

    @Override // py.InterfaceC24933f
    /* renamed from: o7 */
    public void mo129631o7() {
        m129644Sp();
    }

    @Override // py.InterfaceC24933f
    /* renamed from: r9 */
    public void mo129632r9(AbstractC23957a.b bVar) {
        AbstractC19074t.m100208f(bVar, "item");
        if (!this.f119588B) {
            this.f119599t.mo49159pH(bVar);
            return;
        }
        bVar.m125374l(!bVar.m125371i());
        if (bVar.m125371i()) {
            m129658iq(this.f119589C + 1);
        } else {
            int i11 = this.f119589C;
            if (i11 != 0) {
                m129658iq(i11 - 1);
            }
        }
        this.f119599t.mo49145Ca(Long.valueOf(bVar.m125365c()));
    }

    @Override // py.InterfaceC24933f
    /* renamed from: rg */
    public void mo129633rg() {
        this.f119599t.mo49150PB();
        this.f119596J.set(true);
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: py.m
            @Override // java.lang.Runnable
            public final void run() {
                C24942n.m129651bq(C24942n.this);
            }
        });
    }

    @Override // py.InterfaceC24933f
    /* renamed from: t2 */
    public void mo129634t2() {
    }
}

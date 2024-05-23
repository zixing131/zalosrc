package nk0;

import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMSlider;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import nk0.C23869z0;
import pm0.C24848g0;
import qk0.AbstractC25308d;
import qk0.AbstractC25310f;
import qk0.InterfaceC25309e;
import yj0.InterfaceC31002e;

/* renamed from: nk0.z0 */
/* loaded from: classes7.dex */
public final class C23869z0 extends AbstractC23838k1 implements InterfaceC25309e {

    /* renamed from: k */
    private WeakReference f115222k;

    /* renamed from: l */
    private final LinkedHashMap f115223l;

    /* renamed from: m */
    private final a f115224m;

    /* renamed from: n */
    private final c f115225n;

    /* renamed from: o */
    private boolean f115226o;

    /* renamed from: p */
    private boolean f115227p;

    /* renamed from: q */
    private boolean f115228q;

    /* renamed from: r */
    private boolean f115229r;

    /* renamed from: nk0.z0$a */
    /* loaded from: classes7.dex */
    public static final class a extends LinkedList {
        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof C23855s0)) {
                return false;
            }
            return m124702e((C23855s0) obj);
        }

        /* renamed from: e */
        public /* bridge */ boolean m124702e(C23855s0 c23855s0) {
            return super.contains(c23855s0);
        }

        /* renamed from: g */
        public /* bridge */ int m124703g() {
            return super.size();
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof C23855s0)) {
                return -1;
            }
            return m124704j((C23855s0) obj);
        }

        /* renamed from: j */
        public /* bridge */ int m124704j(C23855s0 c23855s0) {
            return super.indexOf(c23855s0);
        }

        /* renamed from: k */
        public /* bridge */ int m124705k(C23855s0 c23855s0) {
            return super.lastIndexOf(c23855s0);
        }

        /* renamed from: l */
        public /* bridge */ boolean m124706l(C23855s0 c23855s0) {
            return super.remove(c23855s0);
        }

        @Override // java.util.LinkedList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof C23855s0)) {
                return -1;
            }
            return m124705k((C23855s0) obj);
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ boolean remove(Object obj) {
            if (!(obj instanceof C23855s0)) {
                return false;
            }
            return m124706l((C23855s0) obj);
        }

        @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
        public final /* bridge */ int size() {
            return m124703g();
        }
    }

    /* renamed from: nk0.z0$b */
    /* loaded from: classes7.dex */
    public static final class b {

        /* renamed from: a */
        private boolean f115230a;

        /* renamed from: b */
        private final C23855s0 f115231b;

        public b(boolean z11, C23855s0 c23855s0) {
            AbstractC19074t.m100208f(c23855s0, "root");
            this.f115230a = z11;
            this.f115231b = c23855s0;
        }

        /* renamed from: a */
        public final C23855s0 m124707a() {
            return this.f115231b;
        }

        /* renamed from: b */
        public final boolean m124708b() {
            return this.f115230a;
        }

        /* renamed from: c */
        public final void m124709c(boolean z11) {
            this.f115230a = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f115230a == bVar.f115230a && AbstractC19074t.m100204b(this.f115231b, bVar.f115231b);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z11 = this.f115230a;
            ?? r02 = z11;
            if (z11) {
                r02 = 1;
            }
            return (r02 * 31) + this.f115231b.hashCode();
        }

        public String toString() {
            return "ZinstantRootShowing(isShow=" + this.f115230a + ", root=" + this.f115231b + ')';
        }
    }

    /* renamed from: nk0.z0$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC25308d {
        c() {
        }

        @Override // qk0.AbstractC25308d, qk0.InterfaceC25307c
        /* renamed from: g */
        public void mo124710g(ZOM zom, int i11) {
            b bVar;
            boolean z11;
            boolean z12;
            AbstractC19074t.m100208f(zom, "zom");
            super.mo124710g(zom, i11);
            if ((i11 & 8) != 0 && (bVar = (b) C23869z0.this.f115223l.get(zom)) != null) {
                C23869z0 c23869z0 = C23869z0.this;
                boolean z13 = false;
                if (bVar.m124708b() && zom.mVisibility == 8) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!bVar.m124708b() && zom.mVisibility != 8) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 || z12) {
                    if (zom.mVisibility != 8) {
                        z13 = true;
                    }
                    bVar.m124709c(z13);
                    c23869z0.m124690u1();
                }
            }
        }
    }

    /* renamed from: nk0.z0$d */
    /* loaded from: classes7.dex */
    static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: r */
        final /* synthetic */ ZOMSlider.ItemsIndexVisibleRunnable f115234r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ZOMSlider.ItemsIndexVisibleRunnable itemsIndexVisibleRunnable) {
            super(1);
            this.f115234r = itemsIndexVisibleRunnable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m124713d(C23869z0 c23869z0, final ZOMSlider.ItemsIndexVisibleRunnable itemsIndexVisibleRunnable, final int[] iArr) {
            AbstractC19074t.m100208f(c23869z0, "this$0");
            AbstractC19074t.m100208f(itemsIndexVisibleRunnable, "$runnable");
            c23869z0.m131004G0(new Runnable() { // from class: nk0.b1
                @Override // java.lang.Runnable
                public final void run() {
                    C23869z0.d.m124714e(ZOMSlider.ItemsIndexVisibleRunnable.this, iArr);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m124714e(ZOMSlider.ItemsIndexVisibleRunnable itemsIndexVisibleRunnable, int[] iArr) {
            AbstractC19074t.m100208f(itemsIndexVisibleRunnable, "$runnable");
            itemsIndexVisibleRunnable.run(iArr);
        }

        /* renamed from: c */
        public final void m124715c(InterfaceC31002e interfaceC31002e) {
            AbstractC19074t.m100208f(interfaceC31002e, "it");
            final C23869z0 c23869z0 = C23869z0.this;
            final ZOMSlider.ItemsIndexVisibleRunnable itemsIndexVisibleRunnable = this.f115234r;
            interfaceC31002e.mo91611e(new ZOMSlider.ItemsIndexVisibleRunnable() { // from class: nk0.a1
                @Override // com.zing.zalo.zinstant.zom.node.ZOMSlider.ItemsIndexVisibleRunnable
                public final void run(int[] iArr) {
                    C23869z0.d.m124713d(C23869z0.this, itemsIndexVisibleRunnable, iArr);
                }
            });
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124715c((InterfaceC31002e) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: nk0.z0$e */
    /* loaded from: classes7.dex */
    static final class e extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ int f115235q;

        /* renamed from: r */
        final /* synthetic */ int f115236r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11, int i12) {
            super(1);
            this.f115235q = i11;
            this.f115236r = i12;
        }

        /* renamed from: a */
        public final void m124716a(InterfaceC31002e interfaceC31002e) {
            AbstractC19074t.m100208f(interfaceC31002e, "it");
            interfaceC31002e.mo91610a(this.f115235q, this.f115236r);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m124716a((InterfaceC31002e) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23869z0(C23855s0 c23855s0, ZOMSlider zOMSlider) {
        super(c23855s0, zOMSlider);
        AbstractC19074t.m100208f(c23855s0, "mRoot");
        AbstractC19074t.m100208f(zOMSlider, "zomSlider");
        this.f115222k = new WeakReference(null);
        this.f115223l = new LinkedHashMap();
        a aVar = new a();
        this.f115224m = aVar;
        this.f115225n = new c();
        m124688r1();
        aVar.addAll(m124687o1());
        m124691w1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m124677A1(C23869z0 c23869z0, int i11) {
        AbstractC19074t.m100208f(c23869z0, "this$0");
        ((ZOMSlider) c23869z0.m131007J()).willEndDisplayItem(i11);
    }

    /* renamed from: l1 */
    private final b m124685l1(ZOM zom) {
        boolean z11;
        if (zom.mVisibility != 8) {
            z11 = true;
        } else {
            z11 = false;
        }
        C23855s0 c23855s0 = new C23855s0(zom);
        AbstractC25310f abstractC25310f = c23855s0.f115179c;
        if (abstractC25310f != null) {
            abstractC25310f.m131009L0(m130996B());
        }
        c23855s0.m124640e0(m131000E());
        C24848g0 c24848g0 = C24848g0.f119245a;
        return new b(z11, c23855s0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m124686n1(C23869z0 c23869z0) {
        AbstractC19074t.m100208f(c23869z0, "this$0");
        ((ZOMSlider) c23869z0.m131007J()).endScroll();
    }

    /* renamed from: o1 */
    private final a m124687o1() {
        LinkedHashMap linkedHashMap = this.f115223l;
        a aVar = new a();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((b) entry.getValue()).m124708b()) {
                aVar.add(((b) entry.getValue()).m124707a());
            }
        }
        return aVar;
    }

    /* renamed from: r1 */
    private final void m124688r1() {
        ZOM[] zomArr = ((ZOMSlider) m131007J()).mChildren;
        if (zomArr != null && zomArr.length != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (ZOM zom : zomArr) {
                if (zom != null) {
                    zom.addPlatformNode(this.f115225n);
                    b bVar = (b) this.f115223l.get(zom);
                    if (bVar == null) {
                        bVar = m124685l1(zom);
                    }
                    linkedHashMap.put(zom, bVar);
                }
            }
            this.f115223l.clear();
            this.f115223l.putAll(linkedHashMap);
            return;
        }
        this.f115223l.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m124689t1(C23869z0 c23869z0) {
        AbstractC19074t.m100208f(c23869z0, "this$0");
        ((ZOMSlider) c23869z0.m131007J()).onScroll();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m124690u1() {
        a m124687o1 = m124687o1();
        this.f115224m.clear();
        this.f115224m.addAll(m124687o1);
        InterfaceC31002e mo124407X0 = mo124407X0();
        if (mo124407X0 != null) {
            mo124407X0.mo91544l(16);
        }
    }

    /* renamed from: w1 */
    private final void m124691w1() {
        this.f115226o = ((ZOMSlider) m131007J()).mHasWillDisplayItemListener;
        this.f115227p = ((ZOMSlider) m131007J()).mHasWillEndDisplayItemListener;
        this.f115228q = ((ZOMSlider) m131007J()).mHasOnScrollListener;
        this.f115229r = ((ZOMSlider) m131007J()).mHasEndScrollListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m124692y1(C23869z0 c23869z0, int i11) {
        AbstractC19074t.m100208f(c23869z0, "this$0");
        ((ZOMSlider) c23869z0.m131007J()).willDisplayItem(i11);
    }

    @Override // nk0.AbstractC23838k1
    /* renamed from: Y0 */
    public void mo124591Y0(int i11) {
        super.mo124591Y0(i11);
        if ((i11 & 16) != 0) {
            m124688r1();
        }
    }

    @Override // nk0.AbstractC23838k1
    /* renamed from: Z0 */
    public void mo124592Z0(ZOM zom, int i11) {
        AbstractC19074t.m100208f(zom, "zom");
        super.mo124592Z0(zom, i11);
        if ((i11 & 16) != 0) {
            this.f115224m.clear();
            this.f115224m.addAll(m124687o1());
        }
    }

    @Override // qk0.InterfaceC25309e
    /* renamed from: a */
    public void mo124693a(int i11, int i12) {
        m124594c1(new e(i11, i12));
    }

    @Override // nk0.AbstractC23838k1
    /* renamed from: a1 */
    public void mo124408a1() {
        super.mo124408a1();
        m124691w1();
    }

    @Override // qk0.InterfaceC25309e
    /* renamed from: e */
    public void mo124694e(ZOMSlider.ItemsIndexVisibleRunnable itemsIndexVisibleRunnable) {
        AbstractC19074t.m100208f(itemsIndexVisibleRunnable, "runnable");
        m124594c1(new d(itemsIndexVisibleRunnable));
    }

    /* renamed from: m1 */
    public void m124695m1() {
        if (this.f115229r) {
            m131004G0(new Runnable() { // from class: nk0.x0
                @Override // java.lang.Runnable
                public final void run() {
                    C23869z0.m124686n1(C23869z0.this);
                }
            });
        }
    }

    @Override // nk0.AbstractC23838k1, qk0.AbstractC25310f
    /* renamed from: n0 */
    public void mo124436n0() {
        super.mo124436n0();
        Iterator<E> it = this.f115224m.iterator();
        while (it.hasNext()) {
            AbstractC25310f abstractC25310f = ((C23855s0) it.next()).f115179c;
            if (abstractC25310f != null) {
                abstractC25310f.m131009L0(m130996B());
                abstractC25310f.m131013W();
            }
        }
    }

    /* renamed from: p1 */
    public final List m124696p1() {
        return this.f115224m;
    }

    @Override // nk0.AbstractC23838k1
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public InterfaceC31002e mo124407X0() {
        return (InterfaceC31002e) this.f115222k.get();
    }

    /* renamed from: s1 */
    public void m124698s1() {
        if (this.f115228q) {
            m131004G0(new Runnable() { // from class: nk0.y0
                @Override // java.lang.Runnable
                public final void run() {
                    C23869z0.m124689t1(C23869z0.this);
                }
            });
        }
    }

    /* renamed from: v1 */
    public final void m124699v1(InterfaceC31002e interfaceC31002e) {
        AbstractC19074t.m100208f(interfaceC31002e, "sliderSignal");
        this.f115222k = new WeakReference(interfaceC31002e);
    }

    /* renamed from: x1 */
    public void m124700x1(final int i11) {
        if (this.f115226o) {
            m131004G0(new Runnable() { // from class: nk0.w0
                @Override // java.lang.Runnable
                public final void run() {
                    C23869z0.m124692y1(C23869z0.this, i11);
                }
            });
        }
    }

    /* renamed from: z1 */
    public void m124701z1(final int i11) {
        if (this.f115227p) {
            m131004G0(new Runnable() { // from class: nk0.v0
                @Override // java.lang.Runnable
                public final void run() {
                    C23869z0.m124677A1(C23869z0.this, i11);
                }
            });
        }
    }
}

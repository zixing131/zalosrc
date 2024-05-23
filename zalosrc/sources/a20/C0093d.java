package a20;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.AbstractC1915h;
import androidx.recyclerview.widget.RecyclerView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19071q;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25368s;

/* renamed from: a20.d */
/* loaded from: classes5.dex */
public final class C0093d {

    /* renamed from: a */
    private final RecyclerView.AbstractC1880g f444a;

    /* renamed from: b */
    private final AbstractC0094e f445b;

    /* renamed from: c */
    private final Executor f446c;

    /* renamed from: d */
    private final Handler f447d;

    /* renamed from: e */
    private InterfaceC18494a f448e;

    /* renamed from: f */
    private int f449f;

    /* renamed from: g */
    private List f450g;

    /* renamed from: h */
    private List f451h;

    /* renamed from: a20.d$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC1915h.b {

        /* renamed from: a */
        final /* synthetic */ List f452a;

        /* renamed from: b */
        final /* synthetic */ List f453b;

        /* renamed from: c */
        final /* synthetic */ List f454c;

        /* renamed from: d */
        final /* synthetic */ List f455d;

        /* renamed from: e */
        final /* synthetic */ C0093d f456e;

        a(List list, List list2, List list3, List list4, C0093d c0093d) {
            this.f452a = list;
            this.f453b = list2;
            this.f454c = list3;
            this.f455d = list4;
            this.f456e = c0093d;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: a */
        public boolean mo421a(int i11, int i12) {
            int intValue = ((Number) this.f454c.get(i11)).intValue();
            int intValue2 = ((Number) this.f455d.get(i12)).intValue();
            Object obj = this.f452a.get(i11);
            Object obj2 = this.f453b.get(i12);
            if (obj != null && obj2 != null) {
                return this.f456e.f445b.mo428a(intValue, obj, intValue2, obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            throw new AssertionError();
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: b */
        public boolean mo422b(int i11, int i12) {
            int intValue = ((Number) this.f454c.get(i11)).intValue();
            int intValue2 = ((Number) this.f455d.get(i12)).intValue();
            Object obj = this.f452a.get(i11);
            Object obj2 = this.f453b.get(i12);
            if (obj != null && obj2 != null) {
                return this.f456e.f445b.mo429b(intValue, obj, intValue2, obj2);
            }
            if (obj == null && obj2 == null) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: c */
        public Object mo423c(int i11, int i12) {
            int intValue = ((Number) this.f454c.get(i11)).intValue();
            int intValue2 = ((Number) this.f455d.get(i12)).intValue();
            Object obj = this.f452a.get(i11);
            Object obj2 = this.f453b.get(i12);
            if (obj != null && obj2 != null) {
                return this.f456e.f445b.m430c(intValue, obj, intValue2, obj2);
            }
            throw new AssertionError();
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: d */
        public int mo424d() {
            return this.f453b.size();
        }

        @Override // androidx.recyclerview.widget.AbstractC1915h.b
        /* renamed from: e */
        public int mo425e() {
            return this.f452a.size();
        }
    }

    /* renamed from: a20.d$b */
    /* loaded from: classes5.dex */
    /* synthetic */ class b extends C19071q implements InterfaceC18494a {
        b(Object obj) {
            super(0, obj, RecyclerView.class, "invalidateItemDecorations", "invalidateItemDecorations()V", 0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m426h();
            return C24848g0.f119245a;
        }

        /* renamed from: h */
        public final void m426h() {
            ((RecyclerView) this.f94922q).m9853S0();
        }
    }

    /* renamed from: a20.d$c */
    /* loaded from: classes5.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f457q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m427a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m427a() {
        }
    }

    public C0093d(RecyclerView.AbstractC1880g abstractC1880g, AbstractC0094e abstractC0094e) {
        List m131502j;
        List m131502j2;
        AbstractC19074t.m100208f(abstractC1880g, "adapter");
        AbstractC19074t.m100208f(abstractC0094e, "comparator");
        this.f444a = abstractC1880g;
        this.f445b = abstractC0094e;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        AbstractC19074t.m100207e(newFixedThreadPool, "newFixedThreadPool(...)");
        this.f446c = newFixedThreadPool;
        this.f447d = new Handler(Looper.getMainLooper());
        this.f448e = c.f457q;
        m131502j = AbstractC25368s.m131502j();
        this.f450g = m131502j;
        m131502j2 = AbstractC25368s.m131502j();
        this.f451h = m131502j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m413f(final C0093d c0093d, List list, final List list2, List list3, final List list4, final int i11, final InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(c0093d, "this$0");
        AbstractC19074t.m100208f(list, "$oldListData");
        AbstractC19074t.m100208f(list2, "$newListData");
        AbstractC19074t.m100208f(list3, "$oldListType");
        AbstractC19074t.m100208f(list4, "$newListType");
        AbstractC19074t.m100208f(interfaceC18494a, "$commitCallback");
        final AbstractC1915h.c m10492a = AbstractC1915h.m10492a(new a(list, list2, list3, list4, c0093d));
        AbstractC19074t.m100207e(m10492a, "calculateDiff(...)");
        c0093d.f447d.post(new Runnable() { // from class: a20.b
            @Override // java.lang.Runnable
            public final void run() {
                C0093d.m414g(C0093d.this, i11, list4, list2, m10492a, interfaceC18494a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m414g(C0093d c0093d, int i11, List list, List list2, AbstractC1915h.c cVar, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(c0093d, "this$0");
        AbstractC19074t.m100208f(list, "$newListType");
        AbstractC19074t.m100208f(list2, "$newListData");
        AbstractC19074t.m100208f(cVar, "$diffResult");
        AbstractC19074t.m100208f(interfaceC18494a, "$commitCallback");
        if (c0093d.f449f == i11) {
            c0093d.f450g = list;
            c0093d.f451h = list2;
            cVar.m10505e(c0093d.f444a);
            Handler handler = c0093d.f447d;
            final InterfaceC18494a interfaceC18494a2 = c0093d.f448e;
            handler.post(new Runnable() { // from class: a20.c
                @Override // java.lang.Runnable
                public final void run() {
                    C0093d.m415h(InterfaceC18494a.this);
                }
            });
            interfaceC18494a.mo12V4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m415h(InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(interfaceC18494a, "$tmp0");
        interfaceC18494a.mo12V4();
    }

    /* renamed from: e */
    public final void m416e(final List list, final List list2, final InterfaceC18494a interfaceC18494a) {
        final List m131185M0;
        final List m131185M02;
        List m131502j;
        List m131502j2;
        AbstractC19074t.m100208f(list, "newListType");
        AbstractC19074t.m100208f(list2, "newListData");
        AbstractC19074t.m100208f(interfaceC18494a, "commitCallback");
        if (list.size() == list2.size()) {
            final int i11 = this.f449f + 1;
            this.f449f = i11;
            if (this.f450g == list && this.f451h == list2) {
                interfaceC18494a.mo12V4();
                return;
            }
            if (this.f451h.isEmpty()) {
                this.f450g = list;
                this.f451h = list2;
                this.f444a.m10015w(0, m418j());
                interfaceC18494a.mo12V4();
                return;
            }
            if (!list2.isEmpty()) {
                m131185M0 = AbstractC25332a0.m131185M0(this.f450g);
                m131185M02 = AbstractC25332a0.m131185M0(this.f451h);
                this.f446c.execute(new Runnable() { // from class: a20.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0093d.m413f(C0093d.this, m131185M02, list2, m131185M0, list, i11, interfaceC18494a);
                    }
                });
                return;
            }
            int m418j = m418j();
            m131502j = AbstractC25368s.m131502j();
            this.f450g = m131502j;
            m131502j2 = AbstractC25368s.m131502j();
            this.f451h = m131502j2;
            this.f444a.m10016x(0, m418j);
            interfaceC18494a.mo12V4();
            return;
        }
        throw new IllegalArgumentException("The size of [newListType] and [newListData] MUST be equal".toString());
    }

    /* renamed from: i */
    public final void m417i(RecyclerView recyclerView) {
        AbstractC19074t.m100208f(recyclerView, "recyclerView");
        this.f448e = new b(recyclerView);
    }

    /* renamed from: j */
    public final int m418j() {
        return this.f451h.size();
    }

    /* renamed from: k */
    public final Object m419k(int i11) {
        return this.f451h.get(i11);
    }

    /* renamed from: l */
    public final int m420l(int i11) {
        return ((Number) this.f450g.get(i11)).intValue();
    }
}

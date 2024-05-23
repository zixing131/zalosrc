package p398oo;

import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p398oo.AbstractC24349b0;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: oo.l0 */
/* loaded from: classes4.dex */
public final class C24369l0 {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static volatile C24369l0 f117671c;

    /* renamed from: a */
    private final InterfaceC24370m f117672a;

    /* renamed from: b */
    private final InterfaceC24372n f117673b;

    /* renamed from: oo.l0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C24369l0 m127457a() {
            C24369l0 c24369l0 = C24369l0.f117671c;
            if (c24369l0 == null) {
                synchronized (this) {
                    c24369l0 = new C24369l0(new C24363i0(), new C24367k0());
                    C24369l0.f117671c = c24369l0;
                }
            }
            return c24369l0;
        }

        /* renamed from: b */
        public final void m127458b() {
            synchronized (this) {
                C24369l0.f117671c = null;
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.l0$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f117674s;

        /* renamed from: t */
        /* synthetic */ Object f117675t;

        /* renamed from: v */
        int f117677v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117675t = obj;
            this.f117677v |= Integer.MIN_VALUE;
            return C24369l0.this.m127452c(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.l0$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117678t;

        /* renamed from: u */
        private /* synthetic */ Object f117679u;

        /* renamed from: v */
        final /* synthetic */ boolean f117680v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f117680v = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f117680v, continuation);
            cVar.f117679u = obj;
            return cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117678t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f117679u;
                Boolean m145339a = AbstractC29094b.m145339a(this.f117680v);
                this.f117678t = 1;
                if (flowCollector.mo12109b(m145339a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((c) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.l0$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f117681s;

        /* renamed from: t */
        Object f117682t;

        /* renamed from: u */
        int f117683u;

        /* renamed from: v */
        /* synthetic */ Object f117684v;

        /* renamed from: x */
        int f117686x;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117684v = obj;
            this.f117686x |= Integer.MIN_VALUE;
            return C24369l0.this.m127454e(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.l0$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117687t;

        /* renamed from: u */
        private /* synthetic */ Object f117688u;

        /* renamed from: v */
        final /* synthetic */ List f117689v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, Continuation continuation) {
            super(2, continuation);
            this.f117689v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            e eVar = new e(this.f117689v, continuation);
            eVar.f117688u = obj;
            return eVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117687t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f117688u;
                List list = this.f117689v;
                this.f117687t = 1;
                if (flowCollector.mo12109b(list, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((e) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.l0$f */
    /* loaded from: classes4.dex */
    public static final class f extends AbstractC29096d {

        /* renamed from: s */
        Object f117690s;

        /* renamed from: t */
        Object f117691t;

        /* renamed from: u */
        int f117692u;

        /* renamed from: v */
        int f117693v;

        /* renamed from: w */
        /* synthetic */ Object f117694w;

        /* renamed from: y */
        int f117696y;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117694w = obj;
            this.f117696y |= Integer.MIN_VALUE;
            return C24369l0.this.m127455f(0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.l0$g */
    /* loaded from: classes4.dex */
    public static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117697t;

        /* renamed from: u */
        private /* synthetic */ Object f117698u;

        /* renamed from: v */
        final /* synthetic */ List f117699v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(List list, Continuation continuation) {
            super(2, continuation);
            this.f117699v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            g gVar = new g(this.f117699v, continuation);
            gVar.f117698u = obj;
            return gVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117697t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f117698u;
                List list = this.f117699v;
                this.f117697t = 1;
                if (flowCollector.mo12109b(list, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((g) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.l0$h */
    /* loaded from: classes4.dex */
    public static final class h extends AbstractC29096d {

        /* renamed from: s */
        Object f117700s;

        /* renamed from: t */
        /* synthetic */ Object f117701t;

        /* renamed from: v */
        int f117703v;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f117701t = obj;
            this.f117703v |= Integer.MIN_VALUE;
            return C24369l0.this.m127456g(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: oo.l0$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f117704t;

        /* renamed from: u */
        private /* synthetic */ Object f117705u;

        /* renamed from: v */
        final /* synthetic */ boolean f117706v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f117706v = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            i iVar = new i(this.f117706v, continuation);
            iVar.f117705u = obj;
            return iVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f117704t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f117705u;
                Boolean m145339a = AbstractC29094b.m145339a(this.f117706v);
                this.f117704t = 1;
                if (flowCollector.mo12109b(m145339a, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
            return ((i) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C24369l0(InterfaceC24370m interfaceC24370m, InterfaceC24372n interfaceC24372n) {
        AbstractC19074t.m100208f(interfaceC24370m, "tabUserAPI");
        AbstractC19074t.m100208f(interfaceC24372n, "tabUserLocalDataSource");
        this.f117672a = interfaceC24370m;
        this.f117673b = interfaceC24372n;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127452c(List list, int i11, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i12;
        C24369l0 c24369l0;
        boolean booleanValue;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i13 = bVar.f117677v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f117677v = i13 - Integer.MIN_VALUE;
                Object obj = bVar.f117675t;
                m142578e = AbstractC28298d.m142578e();
                i12 = bVar.f117677v;
                if (i12 == 0) {
                    if (i12 == 1) {
                        c24369l0 = (C24369l0) bVar.f117674s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow mo127425c = this.f117672a.mo127425c(list, i11);
                    bVar.f117674s = this;
                    bVar.f117677v = 1;
                    obj = FlowKt.m113304v(mo127425c, bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c24369l0 = this;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    c24369l0.f117673b.mo127441b(c24369l0.f117673b.mo127440a() + 1);
                }
                return FlowKt.m113265A(new c(booleanValue, null));
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f117675t;
        m142578e = AbstractC28298d.m142578e();
        i12 = bVar.f117677v;
        if (i12 == 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        return FlowKt.m113265A(new c(booleanValue, null));
    }

    /* renamed from: d */
    public final int m127453d() {
        return this.f117673b.mo127440a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127454e(int i11, Continuation continuation) {
        d dVar;
        Object obj;
        Object m142578e;
        int i12;
        C24369l0 c24369l0;
        List list;
        List list2;
        C24369l0 c24369l02;
        AbstractC24349b0 abstractC24349b0;
        List list3;
        List m127539b;
        int m127538a;
        InterfaceC24372n interfaceC24372n;
        List list4;
        List list5;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i13 = dVar.f117686x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f117686x = i13 - Integer.MIN_VALUE;
                obj = dVar.f117684v;
                m142578e = AbstractC28298d.m142578e();
                i12 = dVar.f117686x;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 == 4) {
                                    list5 = (List) dVar.f117682t;
                                    list4 = (List) dVar.f117681s;
                                    AbstractC24862s.m129228b(obj);
                                    list4.addAll(list5);
                                    list2 = list4;
                                    return FlowKt.m113265A(new e(list2, null));
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            list3 = (List) dVar.f117682t;
                            c24369l02 = (C24369l0) dVar.f117681s;
                            AbstractC24862s.m129228b(obj);
                            C24385z c24385z = (C24385z) obj;
                            m127539b = c24385z.m127539b();
                            m127538a = c24385z.m127538a();
                            interfaceC24372n = c24369l02.f117673b;
                            dVar.f117681s = list3;
                            dVar.f117682t = m127539b;
                            dVar.f117686x = 4;
                            if (interfaceC24372n.mo127442c(m127539b, m127538a, dVar) != m142578e) {
                                return m142578e;
                            }
                            list4 = list3;
                            list5 = m127539b;
                            list4.addAll(list5);
                            list2 = list4;
                            return FlowKt.m113265A(new e(list2, null));
                        }
                        i11 = dVar.f117683u;
                        List list6 = (List) dVar.f117682t;
                        C24369l0 c24369l03 = (C24369l0) dVar.f117681s;
                        AbstractC24862s.m129228b(obj);
                        list2 = list6;
                        c24369l02 = c24369l03;
                        abstractC24349b0 = (AbstractC24349b0) obj;
                        if (!(abstractC24349b0 instanceof AbstractC24349b0.b)) {
                            list2.addAll(((AbstractC24349b0.b) abstractC24349b0).m127236a());
                            return FlowKt.m113265A(new e(list2, null));
                        }
                        Flow mo127423a = c24369l02.f117672a.mo127423a(i11);
                        dVar.f117681s = c24369l02;
                        dVar.f117682t = list2;
                        dVar.f117686x = 3;
                        obj = FlowKt.m113304v(mo127423a, dVar);
                        if (obj == m142578e) {
                            return m142578e;
                        }
                        list3 = list2;
                        C24385z c24385z2 = (C24385z) obj;
                        m127539b = c24385z2.m127539b();
                        m127538a = c24385z2.m127538a();
                        interfaceC24372n = c24369l02.f117673b;
                        dVar.f117681s = list3;
                        dVar.f117682t = m127539b;
                        dVar.f117686x = 4;
                        if (interfaceC24372n.mo127442c(m127539b, m127538a, dVar) != m142578e) {
                        }
                    } else {
                        i11 = dVar.f117683u;
                        list = (List) dVar.f117682t;
                        c24369l0 = (C24369l0) dVar.f117681s;
                        AbstractC24862s.m129228b(obj);
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    ArrayList arrayList = new ArrayList();
                    InterfaceC24372n interfaceC24372n2 = this.f117673b;
                    dVar.f117681s = this;
                    dVar.f117682t = arrayList;
                    dVar.f117683u = i11;
                    dVar.f117686x = 1;
                    Object mo127443d = interfaceC24372n2.mo127443d(dVar);
                    if (mo127443d == m142578e) {
                        return m142578e;
                    }
                    c24369l0 = this;
                    list = arrayList;
                    obj = mo127443d;
                }
                dVar.f117681s = c24369l0;
                dVar.f117682t = list;
                dVar.f117683u = i11;
                dVar.f117686x = 2;
                obj = FlowKt.m113304v((Flow) obj, dVar);
                if (obj != m142578e) {
                    return m142578e;
                }
                list2 = list;
                c24369l02 = c24369l0;
                abstractC24349b0 = (AbstractC24349b0) obj;
                if (!(abstractC24349b0 instanceof AbstractC24349b0.b)) {
                }
            }
        }
        dVar = new d(continuation);
        obj = dVar.f117684v;
        m142578e = AbstractC28298d.m142578e();
        i12 = dVar.f117686x;
        if (i12 == 0) {
        }
        dVar.f117681s = c24369l0;
        dVar.f117682t = list;
        dVar.f117683u = i11;
        dVar.f117686x = 2;
        obj = FlowKt.m113304v((Flow) obj, dVar);
        if (obj != m142578e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:10:0x006c). Please report as a decompilation issue!!! */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127455f(int i11, Continuation continuation) {
        f fVar;
        Object m142578e;
        int i12;
        C24369l0 c24369l0;
        String str;
        boolean z11;
        List arrayList;
        int i13;
        int i14;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i15 = fVar.f117696y;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f117696y = i15 - Integer.MIN_VALUE;
                Object obj = fVar.f117694w;
                m142578e = AbstractC28298d.m142578e();
                i12 = fVar.f117696y;
                if (i12 == 0) {
                    if (i12 == 1) {
                        i14 = fVar.f117693v;
                        int i16 = fVar.f117692u;
                        arrayList = (List) fVar.f117691t;
                        c24369l0 = (C24369l0) fVar.f117690s;
                        AbstractC24862s.m129228b(obj);
                        C24375p c24375p = (C24375p) obj;
                        z11 = c24375p.m127490c();
                        String m127488a = c24375p.m127488a();
                        arrayList.addAll(c24375p.m127489b());
                        i13 = i16;
                        str = m127488a;
                        if (z11) {
                            Flow mo127426d = c24369l0.f117672a.mo127426d(str, i14, i13);
                            fVar.f117690s = c24369l0;
                            fVar.f117691t = arrayList;
                            fVar.f117692u = i13;
                            fVar.f117693v = i14;
                            fVar.f117696y = 1;
                            Object m113304v = FlowKt.m113304v(mo127426d, fVar);
                            if (m113304v == m142578e) {
                                return m142578e;
                            }
                            i16 = i13;
                            obj = m113304v;
                            C24375p c24375p2 = (C24375p) obj;
                            z11 = c24375p2.m127490c();
                            String m127488a2 = c24375p2.m127488a();
                            arrayList.addAll(c24375p2.m127489b());
                            i13 = i16;
                            str = m127488a2;
                            if (z11) {
                                c24369l0.f117673b.mo127441b(arrayList.size());
                                return FlowKt.m113265A(new g(arrayList, null));
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    c24369l0 = this;
                    str = "0";
                    z11 = true;
                    arrayList = new ArrayList();
                    i13 = i11;
                    i14 = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
                    if (z11) {
                    }
                }
            }
        }
        fVar = new f(continuation);
        Object obj2 = fVar.f117694w;
        m142578e = AbstractC28298d.m142578e();
        i12 = fVar.f117696y;
        if (i12 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m127456g(List list, int i11, Continuation continuation) {
        h hVar;
        Object m142578e;
        int i12;
        C24369l0 c24369l0;
        boolean booleanValue;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i13 = hVar.f117703v;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                hVar.f117703v = i13 - Integer.MIN_VALUE;
                Object obj = hVar.f117701t;
                m142578e = AbstractC28298d.m142578e();
                i12 = hVar.f117703v;
                if (i12 == 0) {
                    if (i12 == 1) {
                        c24369l0 = (C24369l0) hVar.f117700s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow mo127424b = this.f117672a.mo127424b(list, i11);
                    hVar.f117700s = this;
                    hVar.f117703v = 1;
                    obj = FlowKt.m113304v(mo127424b, hVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c24369l0 = this;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    c24369l0.f117673b.mo127441b(c24369l0.f117673b.mo127440a() - 1);
                }
                return FlowKt.m113265A(new i(booleanValue, null));
            }
        }
        hVar = new h(continuation);
        Object obj2 = hVar.f117701t;
        m142578e = AbstractC28298d.m142578e();
        i12 = hVar.f117703v;
        if (i12 == 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        return FlowKt.m113265A(new i(booleanValue, null));
    }
}

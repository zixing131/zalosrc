package p455qo;

import a30.C0104c;
import bo.C2998k3;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3047v0;
import com.zing.zalo.MainApplication;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import me0.C23278z2;
import p185gc.AbstractC19377a;
import p354n3.C23528a;
import p379o3.C24003n;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import tr.C26883g;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: qo.x */
/* loaded from: classes4.dex */
public final class C25440x extends AbstractC19377a {

    /* renamed from: a */
    private final C23528a f121793a;

    /* renamed from: qo.x$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final int f121794a;

        public a(int i11) {
            this.f121794a = i11;
        }

        /* renamed from: a */
        public final int m131772a() {
            return this.f121794a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f121794a == ((a) obj).f121794a;
        }

        public int hashCode() {
            return this.f121794a;
        }

        public String toString() {
            return "Param(tab=" + this.f121794a + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.x$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f121795s;

        /* renamed from: t */
        Object f121796t;

        /* renamed from: u */
        Object f121797u;

        /* renamed from: v */
        Object f121798v;

        /* renamed from: w */
        Object f121799w;

        /* renamed from: x */
        /* synthetic */ Object f121800x;

        /* renamed from: z */
        int f121802z;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f121800x = obj;
            this.f121802z |= Integer.MIN_VALUE;
            return C25440x.this.mo451b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qo.x$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121803t;

        /* renamed from: u */
        private /* synthetic */ Object f121804u;

        /* renamed from: w */
        final /* synthetic */ C3020p0 f121806w;

        /* renamed from: x */
        final /* synthetic */ List f121807x;

        /* renamed from: y */
        final /* synthetic */ C3025q0.d f121808y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qo.x$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f121809t;

            /* renamed from: u */
            final /* synthetic */ C25440x f121810u;

            /* renamed from: v */
            final /* synthetic */ C3020p0 f121811v;

            /* renamed from: w */
            final /* synthetic */ List f121812w;

            /* renamed from: x */
            final /* synthetic */ C3025q0.d f121813x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C25440x c25440x, C3020p0 c3020p0, List list, C3025q0.d dVar, Continuation continuation) {
                super(2, continuation);
                this.f121810u = c25440x;
                this.f121811v = c3020p0;
                this.f121812w = list;
                this.f121813x = dVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f121810u, this.f121811v, this.f121812w, this.f121813x, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                C24003n m120106Y;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f121809t;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C0104c c0104c = new C0104c(this.f121810u.f121793a);
                    String str = this.f121811v.f12022B.f12283e;
                    AbstractC19074t.m100207e(str, "avatar");
                    C0104c.a aVar = new C0104c.a(str, 10000L, 500064, 0, 8, null);
                    this.f121809t = 1;
                    if (c0104c.m101498a(aVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                if (this.f121812w.size() == 1) {
                    m120106Y = C23278z2.m120088P();
                } else {
                    m120106Y = C23278z2.m120106Y();
                }
                int i12 = m120106Y.f116260a;
                C0104c c0104c2 = new C0104c(this.f121810u.f121793a);
                String str2 = this.f121813x.f12176g;
                AbstractC19074t.m100207e(str2, "mSuggestUrl");
                C0104c.a aVar2 = new C0104c.a(str2, 10000L, 500065, i12);
                this.f121809t = 2;
                obj = c0104c2.m101498a(aVar2, this);
                if (obj == m142578e) {
                    return m142578e;
                }
                return obj;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C3020p0 c3020p0, List list, C3025q0.d dVar, Continuation continuation) {
            super(2, continuation);
            this.f121806w = c3020p0;
            this.f121807x = list;
            this.f121808y = dVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            c cVar = new c(this.f121806w, this.f121807x, this.f121808y, continuation);
            cVar.f121804u = obj;
            return cVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Deferred m112538b;
            AbstractC28298d.m142578e();
            if (this.f121803t == 0) {
                AbstractC24862s.m129228b(obj);
                m112538b = BuildersKt__Builders_commonKt.m112538b((CoroutineScope) this.f121804u, null, null, new a(C25440x.this, this.f121806w, this.f121807x, this.f121808y, null), 3, null);
                return m112538b;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C25440x(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "aQuery");
        this.f121793a = c23528a;
    }

    /* renamed from: d */
    private final boolean m131769d(C3020p0 c3020p0) {
        C3047v0 c3047v0;
        if (c3020p0 != null) {
            c3047v0 = c3020p0.f12022B;
        } else {
            c3047v0 = null;
        }
        if (c3047v0 != null && c3020p0.f12022B.f12283e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m131770e(C3020p0 c3020p0) {
        C3025q0 c3025q0;
        C3025q0.c cVar;
        if (c3020p0 != null) {
            c3025q0 = c3020p0.f12023C;
        } else {
            c3025q0 = null;
        }
        if (c3025q0 != null && c3020p0.f12058q == 108 && (cVar = c3020p0.f12023C.f12135z) != null && cVar.f12156g != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:13:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00fd -> B:10:0x0114). Please report as a decompilation issue!!! */
    @Override // p185gc.AbstractC19377a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(a aVar, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        int m131511r;
        List m131513t;
        int m131511r2;
        Iterator it;
        C25440x c25440x;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f121802z;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f121802z = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f121800x;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f121802z;
                if (i11 == 0) {
                    if (i11 == 1) {
                        Iterator it2 = (Iterator) bVar.f121799w;
                        List list = (List) bVar.f121798v;
                        C3020p0 c3020p0 = (C3020p0) bVar.f121797u;
                        Iterator it3 = (Iterator) bVar.f121796t;
                        C25440x c25440x2 = (C25440x) bVar.f121795s;
                        AbstractC24862s.m129228b(obj);
                        List list2 = list;
                        C3020p0 c3020p02 = c3020p0;
                        Iterator it4 = it3;
                        Object obj2 = m142578e;
                        b bVar2 = bVar;
                        C25440x c25440x3 = c25440x2;
                        while (it2.hasNext()) {
                            C3025q0.d dVar = (C3025q0.d) it2.next();
                            if (dVar != null && c25440x3.m131769d(c3020p02)) {
                                c cVar = new c(c3020p02, list2, dVar, null);
                                bVar2.f121795s = c25440x3;
                                bVar2.f121796t = it4;
                                bVar2.f121797u = c3020p02;
                                bVar2.f121798v = list2;
                                bVar2.f121799w = it2;
                                bVar2.f121802z = 1;
                                if (CoroutineScopeKt.m112640d(cVar, bVar2) == obj2) {
                                    return obj2;
                                }
                            }
                        }
                        it = it4;
                        c25440x = c25440x3;
                        bVar = bVar2;
                        m142578e = obj2;
                        if (it.hasNext()) {
                            C3020p0 c3020p03 = (C3020p0) it.next();
                            List list3 = c3020p03.f12023C.f12135z.f12156g;
                            c3020p02 = c3020p03;
                            list2 = list3;
                            obj2 = m142578e;
                            bVar2 = bVar;
                            c25440x3 = c25440x;
                            it4 = it;
                            it2 = list3.iterator();
                            while (it2.hasNext()) {
                            }
                            it = it4;
                            c25440x = c25440x3;
                            bVar = bVar2;
                            m142578e = obj2;
                            if (it.hasNext()) {
                                return C24848g0.f119245a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    List m138527g = C26883g.Companion.m138535a(aVar.m131772a()).m138527g(3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : m138527g) {
                        if (((C2998k3) obj3).f11845a != null) {
                            arrayList.add(obj3);
                        }
                    }
                    m131511r = AbstractC25370t.m131511r(arrayList, 10);
                    ArrayList arrayList2 = new ArrayList(m131511r);
                    Iterator it5 = arrayList.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(((C2998k3) it5.next()).f11845a);
                    }
                    m131513t = AbstractC25370t.m131513t(arrayList2);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj4 : m131513t) {
                        C3000l0 c3000l0 = (C3000l0) obj4;
                        if (c3000l0 != null && c3000l0.m14322a0() != null && m131770e(c3000l0.m14322a0())) {
                            arrayList3.add(obj4);
                        }
                    }
                    m131511r2 = AbstractC25370t.m131511r(arrayList3, 10);
                    ArrayList arrayList4 = new ArrayList(m131511r2);
                    Iterator it6 = arrayList3.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(((C3000l0) it6.next()).m14322a0());
                    }
                    it = arrayList4.iterator();
                    c25440x = this;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        bVar = new b(continuation);
        Object obj5 = bVar.f121800x;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f121802z;
        if (i11 == 0) {
        }
    }

    public /* synthetic */ C25440x(C23528a c23528a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C23528a(MainApplication.Companion.m35500c()) : c23528a);
    }
}

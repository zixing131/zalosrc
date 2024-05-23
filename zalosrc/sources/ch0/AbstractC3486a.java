package ch0;

import en0.InterfaceC18509p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: ch0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC3486a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch0.a$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: A */
        int f14585A;

        /* renamed from: s */
        Object f14586s;

        /* renamed from: t */
        Object f14587t;

        /* renamed from: u */
        Object f14588u;

        /* renamed from: v */
        Object f14589v;

        /* renamed from: w */
        Object f14590w;

        /* renamed from: x */
        Object f14591x;

        /* renamed from: y */
        Object f14592y;

        /* renamed from: z */
        /* synthetic */ Object f14593z;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f14593z = obj;
            this.f14585A |= Integer.MIN_VALUE;
            return AbstractC3486a.m17459a(null, null, 0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch0.a$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f14594t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18509p f14595u;

        /* renamed from: v */
        final /* synthetic */ Object f14596v;

        /* renamed from: w */
        final /* synthetic */ Semaphore f14597w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC18509p interfaceC18509p, Object obj, Semaphore semaphore, Continuation continuation) {
            super(2, continuation);
            this.f14595u = interfaceC18509p;
            this.f14596v = obj;
            this.f14597w = semaphore;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f14595u, this.f14596v, this.f14597w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f14594t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18509p interfaceC18509p = this.f14595u;
                    Object obj2 = this.f14596v;
                    this.f14594t = 1;
                    if (interfaceC18509p.mo240pC(obj2, this) == m142578e) {
                        return m142578e;
                    }
                }
                this.f14597w.release();
                return C24848g0.f119245a;
            } catch (Throwable th2) {
                this.f14597w.release();
                throw th2;
            }
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a9 -> B:17:0x00ae). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m17459a(Iterable iterable, CoroutineScope coroutineScope, int i11, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i12;
        int m131511r;
        Semaphore semaphore;
        Iterator it;
        CoroutineScope coroutineScope2;
        ArrayList arrayList;
        Object obj;
        a aVar2;
        InterfaceC18509p interfaceC18509p2;
        Deferred m112538b;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i13 = aVar.f14585A;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f14585A = i13 - Integer.MIN_VALUE;
                Object obj2 = aVar.f14593z;
                m142578e = AbstractC28298d.m142578e();
                i12 = aVar.f14585A;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            AbstractC24862s.m129228b(obj2);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Collection collection = (Collection) aVar.f14592y;
                    Object obj3 = aVar.f14591x;
                    Iterator it2 = (Iterator) aVar.f14590w;
                    ?? r92 = (Collection) aVar.f14589v;
                    Semaphore semaphore2 = (Semaphore) aVar.f14588u;
                    InterfaceC18509p interfaceC18509p3 = (InterfaceC18509p) aVar.f14587t;
                    CoroutineScope coroutineScope3 = (CoroutineScope) aVar.f14586s;
                    AbstractC24862s.m129228b(obj2);
                    coroutineScope2 = coroutineScope3;
                    aVar2 = aVar;
                    interfaceC18509p2 = interfaceC18509p3;
                    Semaphore semaphore3 = semaphore2;
                    Iterator it3 = it2;
                    ArrayList arrayList2 = r92;
                    Object next = obj3;
                    Object obj4 = m142578e;
                    m112538b = BuildersKt__Builders_commonKt.m112538b(coroutineScope2, null, null, new b(interfaceC18509p2, next, semaphore3, null), 3, null);
                    collection.add(m112538b);
                    obj = obj4;
                    arrayList = arrayList2;
                    it = it3;
                    semaphore = semaphore3;
                    if (it.hasNext()) {
                        next = it.next();
                        CoroutineScopeKt.m112641e(coroutineScope2);
                        aVar2.f14586s = coroutineScope2;
                        aVar2.f14587t = interfaceC18509p2;
                        aVar2.f14588u = semaphore;
                        aVar2.f14589v = arrayList;
                        aVar2.f14590w = it;
                        aVar2.f14591x = next;
                        aVar2.f14592y = arrayList;
                        aVar2.f14585A = 1;
                        if (semaphore.mo113914a(aVar2) == obj) {
                            return obj;
                        }
                        semaphore3 = semaphore;
                        it3 = it;
                        arrayList2 = arrayList;
                        obj4 = obj;
                        collection = arrayList2;
                        m112538b = BuildersKt__Builders_commonKt.m112538b(coroutineScope2, null, null, new b(interfaceC18509p2, next, semaphore3, null), 3, null);
                        collection.add(m112538b);
                        obj = obj4;
                        arrayList = arrayList2;
                        it = it3;
                        semaphore = semaphore3;
                        if (it.hasNext()) {
                            aVar2.f14586s = null;
                            aVar2.f14587t = null;
                            aVar2.f14588u = null;
                            aVar2.f14589v = null;
                            aVar2.f14590w = null;
                            aVar2.f14591x = null;
                            aVar2.f14592y = null;
                            aVar2.f14585A = 2;
                            if (AwaitKt.m112521a(arrayList, aVar2) == obj) {
                                return obj;
                            }
                            return C24848g0.f119245a;
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    Semaphore m113931b = SemaphoreKt.m113931b(i11, 0, 2, null);
                    m131511r = AbstractC25370t.m131511r(iterable, 10);
                    ArrayList arrayList3 = new ArrayList(m131511r);
                    semaphore = m113931b;
                    it = iterable.iterator();
                    coroutineScope2 = coroutineScope;
                    arrayList = arrayList3;
                    obj = m142578e;
                    aVar2 = aVar;
                    interfaceC18509p2 = interfaceC18509p;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        aVar = new a(continuation);
        Object obj22 = aVar.f14593z;
        m142578e = AbstractC28298d.m142578e();
        i12 = aVar.f14585A;
        if (i12 == 0) {
        }
    }

    /* renamed from: b */
    public static final Object m17460b(Iterable iterable, CoroutineScope coroutineScope, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Object m142578e;
        Object m17459a = m17459a(iterable, coroutineScope, 8, interfaceC18509p, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m17459a == m142578e) {
            return m17459a;
        }
        return C24848g0.f119245a;
    }
}

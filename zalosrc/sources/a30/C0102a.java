package a30;

import a30.C0103b;
import androidx.work.AbstractC2147g0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import p185gc.AbstractC19377a;
import p542ub.InterfaceC27218a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25370t;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: a30.a */
/* loaded from: classes5.dex */
public final class C0102a extends AbstractC19377a {

    /* renamed from: a30.a$a */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        private final InterfaceC27218a f576a;

        /* renamed from: b */
        private final List f577b;

        /* renamed from: c */
        private final long f578c;

        public a(InterfaceC27218a interfaceC27218a, List list, long j11) {
            AbstractC19074t.m100208f(list, "arrUrls");
            this.f576a = interfaceC27218a;
            this.f577b = list;
            this.f578c = j11;
        }

        /* renamed from: a */
        public final InterfaceC27218a m453a() {
            return this.f576a;
        }

        /* renamed from: b */
        public final List m454b() {
            return this.f577b;
        }

        /* renamed from: c */
        public final long m455c() {
            return this.f578c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f576a, aVar.f576a) && AbstractC19074t.m100204b(this.f577b, aVar.f577b) && this.f578c == aVar.f578c;
        }

        public int hashCode() {
            InterfaceC27218a interfaceC27218a = this.f576a;
            return ((((interfaceC27218a == null ? 0 : interfaceC27218a.hashCode()) * 31) + this.f577b.hashCode()) * 31) + AbstractC2147g0.m11521a(this.f578c);
        }

        public String toString() {
            return "MultiPhotoDownloadTaskParam(activity=" + this.f576a + ", arrUrls=" + this.f577b + ", timeout=" + this.f578c + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a30.a$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f579t;

        /* renamed from: u */
        private /* synthetic */ Object f580u;

        /* renamed from: v */
        final /* synthetic */ a f581v;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a30.a$b$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f582t;

            /* renamed from: u */
            final /* synthetic */ a f583u;

            /* renamed from: v */
            final /* synthetic */ String f584v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a aVar, String str, Continuation continuation) {
                super(2, continuation);
                this.f583u = aVar;
                this.f584v = str;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new a(this.f583u, this.f584v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f582t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C0103b c0103b = new C0103b();
                    C0103b.a aVar = new C0103b.a(this.f583u.m453a(), this.f584v, this.f583u.m455c());
                    this.f582t = 1;
                    obj = c0103b.m101498a(aVar, this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
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
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f581v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            b bVar = new b(this.f581v, continuation);
            bVar.f580u = obj;
            return bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            int m131511r;
            Deferred m112538b;
            int m131511r2;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f579t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f580u;
                List m454b = this.f581v.m454b();
                a aVar = this.f581v;
                m131511r = AbstractC25370t.m131511r(m454b, 10);
                ArrayList arrayList = new ArrayList(m131511r);
                Iterator it = m454b.iterator();
                while (it.hasNext()) {
                    m112538b = BuildersKt__Builders_commonKt.m112538b(coroutineScope, null, null, new a(aVar, (String) it.next(), null), 3, null);
                    arrayList.add(m112538b);
                }
                this.f579t = 1;
                obj = AwaitKt.m112521a(arrayList, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            Iterable<String> iterable = (Iterable) obj;
            m131511r2 = AbstractC25370t.m131511r(iterable, 10);
            ArrayList arrayList2 = new ArrayList(m131511r2);
            for (String str : iterable) {
                if (str == null) {
                    str = "";
                }
                arrayList2.add(str);
            }
            return arrayList2;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return CoroutineScopeKt.m112640d(new b(aVar, null), continuation);
    }
}

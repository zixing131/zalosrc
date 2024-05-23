package es;

import am.AbstractC0924m0;
import bo.C3000l0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p185gc.AbstractC19377a;
import p398oo.C24371m0;
import p398oo.InterfaceC24374o;
import p691yr.C31060j;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: es.a */
/* loaded from: classes4.dex */
public final class C18590a extends AbstractC19377a {

    /* renamed from: a */
    private final InterfaceC24374o f93399a;

    /* renamed from: b */
    private final CoroutineDispatcher f93400b;

    /* renamed from: es.a$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a */
        private final String f93401a;

        /* renamed from: b */
        private final int f93402b;

        public a(String str, int i11) {
            AbstractC19074t.m100208f(str, "feedId");
            this.f93401a = str;
            this.f93402b = i11;
        }

        /* renamed from: a */
        public final String m98133a() {
            return this.f93401a;
        }

        /* renamed from: b */
        public final int m98134b() {
            return this.f93402b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC19074t.m100204b(this.f93401a, aVar.f93401a) && this.f93402b == aVar.f93402b;
        }

        public int hashCode() {
            return (this.f93401a.hashCode() * 31) + this.f93402b;
        }

        public String toString() {
            return "Params(feedId=" + this.f93401a + ", tab=" + this.f93402b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: es.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f93403t;

        /* renamed from: v */
        final /* synthetic */ a f93405v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(a aVar, Continuation continuation) {
            super(2, continuation);
            this.f93405v = aVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(this.f93405v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f93403t == 0) {
                AbstractC24862s.m129228b(obj);
                C3000l0 m127404k = C18590a.this.f93399a.mo127472d(this.f93405v.m98134b()).m127404k(this.f93405v.m98133a());
                boolean z11 = false;
                if (m127404k != null && !m127404k.m14285C0() && !m127404k.m14371w0() && !m127404k.m14281A0()) {
                    if (C31060j.f143193a.m150935M() && AbstractC0924m0.m3898ic()) {
                        z11 = true;
                    }
                    return AbstractC29094b.m145339a(z11);
                }
                return AbstractC29094b.m145339a(false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public /* synthetic */ C18590a(InterfaceC24374o interfaceC24374o, CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24371m0.Companion.m127483a() : interfaceC24374o, (i11 & 2) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19377a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object mo451b(a aVar, Continuation continuation) {
        return BuildersKt.m112534g(this.f93400b, new b(aVar, null), continuation);
    }

    public C18590a(InterfaceC24374o interfaceC24374o, CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(interfaceC24374o, "timelineFeed");
        AbstractC19074t.m100208f(coroutineDispatcher, "dispatcher");
        this.f93399a = interfaceC24374o;
        this.f93400b = coroutineDispatcher;
    }
}

package p553uo;

import am.AbstractC0924m0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p185gc.AbstractC19377a;
import p688yo.EnumC31036b;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: uo.a */
/* loaded from: classes4.dex */
public final class C27346a extends AbstractC19377a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uo.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f128633s;

        /* renamed from: u */
        int f128635u;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f128633s = obj;
            this.f128635u |= Integer.MIN_VALUE;
            return C27346a.this.mo451b(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uo.a$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f128636t;

        b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f128636t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC0924m0.m4211sp(-1);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // p185gc.AbstractC19377a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo451b(EnumC31036b enumC31036b, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f128635u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f128635u = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f128633s;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f128635u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (AbstractC19074t.m100204b(new C27348c().m101509a(enumC31036b), AbstractC29094b.m145339a(true))) {
                        CoroutineDispatcher m112680b = Dispatchers.m112680b();
                        b bVar = new b(null);
                        aVar.f128635u = 1;
                        if (BuildersKt.m112534g(m112680b, bVar, aVar) == m142578e) {
                            return m142578e;
                        }
                    } else {
                        return C24848g0.f119245a;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f128633s;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f128635u;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}

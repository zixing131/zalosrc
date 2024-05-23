package lg0;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vi.C28255a;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: lg0.g */
/* loaded from: classes7.dex */
public abstract class AbstractC22483g {

    /* renamed from: lg0.g$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109948t;

        /* renamed from: u */
        final /* synthetic */ C22482f f109949u;

        /* renamed from: v */
        final /* synthetic */ String f109950v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C22482f c22482f, String str, Continuation continuation) {
            super(2, continuation);
            this.f109949u = c22482f;
            this.f109950v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f109949u, this.f109950v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109948t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C22482f c22482f = this.f109949u;
                String str = this.f109950v;
                this.f109948t = 1;
                obj = c22482f.m116237b(str, this);
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

    /* renamed from: a */
    public static final C28255a m116238a(C22482f c22482f, String str) {
        Object m112536b;
        AbstractC19074t.m100208f(c22482f, "<this>");
        AbstractC19074t.m100208f(str, "md5Url");
        m112536b = BuildersKt__BuildersKt.m112536b(null, new a(c22482f, str, null), 1, null);
        return (C28255a) m112536b;
    }
}

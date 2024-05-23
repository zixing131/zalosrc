package lg0;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vi.C28260f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: lg0.e */
/* loaded from: classes7.dex */
public abstract class AbstractC22481e {

    /* renamed from: lg0.e$a */
    /* loaded from: classes7.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109939t;

        /* renamed from: u */
        final /* synthetic */ C22480d f109940u;

        /* renamed from: v */
        final /* synthetic */ String f109941v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C22480d c22480d, String str, Continuation continuation) {
            super(2, continuation);
            this.f109940u = c22480d;
            this.f109941v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f109940u, this.f109941v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109939t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C22480d c22480d = this.f109940u;
                String str = this.f109941v;
                this.f109939t = 1;
                obj = c22480d.m116233a(str, this);
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
    public static final C28260f m116234a(C22480d c22480d, String str) {
        Object m112536b;
        AbstractC19074t.m100208f(c22480d, "<this>");
        AbstractC19074t.m100208f(str, "zipId");
        m112536b = BuildersKt__BuildersKt.m112536b(null, new a(c22480d, str, null), 1, null);
        return (C28260f) m112536b;
    }
}

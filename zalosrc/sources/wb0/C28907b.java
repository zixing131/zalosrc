package wb0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.Map;
import ke0.C21699a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import og0.EnumC24251b;
import p205hc.C19964c;
import p487rl.C25826g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pm0.C24860q;
import qm0.AbstractC25361o0;
import vm0.AbstractC28298d;
import wb0.AbstractC28906a;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: wb0.b */
/* loaded from: classes6.dex */
public final class C28907b extends AbstractC1796t0 {

    /* renamed from: s */
    private final C21699a f133828s;

    /* renamed from: t */
    private final C1761c0 f133829t;

    /* renamed from: wb0.b$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f133830t;

        /* renamed from: v */
        final /* synthetic */ EnumC24251b f133832v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC24251b enumC24251b, Continuation continuation) {
            super(2, continuation);
            this.f133832v = enumC24251b;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f133832v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            Map m131401f;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f133830t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C21699a c21699a = C28907b.this.f133828s;
                m131401f = AbstractC25361o0.m131401f(new C24860q(this.f133832v, new C25826g(true)));
                this.f133830t = 1;
                obj = c21699a.m101498a(m131401f, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            if (AbstractC19074t.m100204b((Boolean) obj, AbstractC29094b.m145339a(true))) {
                C28907b.this.f133829t.mo9221n(new C19964c(AbstractC28906a.a.f133826a));
            } else {
                C28907b.this.f133829t.mo9221n(new C19964c(new AbstractC28906a.b(AbstractC8020f0.str_zcloud_setup_error)));
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C28907b(C21699a c21699a) {
        AbstractC19074t.m100208f(c21699a, "zCloudOptInUseCase");
        this.f133828s = c21699a;
        this.f133829t = new C1761c0();
    }

    /* renamed from: O */
    public final void m144408O(EnumC24251b enumC24251b) {
        AbstractC19074t.m100208f(enumC24251b, "currentFeature");
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new a(enumC24251b, null), 3, null);
    }

    /* renamed from: P */
    public final LiveData m144409P() {
        return this.f133829t;
    }
}

package kc0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nl.C23870a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vg.C28203u6;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: kc0.e */
/* loaded from: classes6.dex */
public final class C21666e extends AbstractC1796t0 {

    /* renamed from: s */
    private final C23870a f105124s;

    /* renamed from: t */
    private final C1761c0 f105125t;

    /* renamed from: u */
    private final C1761c0 f105126u;

    /* renamed from: kc0.e$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kc0.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C32871a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f105128t;

            /* renamed from: u */
            final /* synthetic */ C21666e f105129u;

            /* renamed from: v */
            final /* synthetic */ ZCloudQuotaUsage f105130v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32871a(C21666e c21666e, ZCloudQuotaUsage zCloudQuotaUsage, Continuation continuation) {
                super(2, continuation);
                this.f105129u = c21666e;
                this.f105130v = zCloudQuotaUsage;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                return new C32871a(this.f105129u, this.f105130v, continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                AbstractC28298d.m142578e();
                if (this.f105128t == 0) {
                    AbstractC24862s.m129228b(obj);
                    this.f105129u.f105126u.mo9221n(this.f105129u.f105124s.m124833u(this.f105130v));
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C32871a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m111678a(ZCloudQuotaUsage zCloudQuotaUsage) {
            AbstractC19074t.m100208f(zCloudQuotaUsage, "it");
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(C21666e.this), null, null, new C32871a(C21666e.this, zCloudQuotaUsage, null), 3, null);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m111678a((ZCloudQuotaUsage) obj);
            return C24848g0.f119245a;
        }
    }

    public C21666e(C23870a c23870a) {
        AbstractC19074t.m100208f(c23870a, "zaloCloudRepo");
        this.f105124s = c23870a;
        this.f105125t = new C1761c0();
        this.f105126u = new C1761c0();
    }

    /* renamed from: O */
    public final void m111674O() {
        this.f105124s.m124802b0();
    }

    /* renamed from: P */
    public final LiveData m111675P() {
        return this.f105125t;
    }

    /* renamed from: Q */
    public final LiveData m111676Q() {
        return this.f105126u;
    }

    /* renamed from: d0 */
    public final void m111677d0() {
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, "204278670", null, 2, null);
        if (m141798e != null) {
            this.f105125t.mo9221n(m141798e);
        }
        C23870a.m124718I0(this.f105124s, false, AbstractC1798u0.m9374a(this), new a(), 1, null);
    }
}

package com.zing.zalo.p077ui.zalocloud.resetcloud;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.p077ui.zalocloud.resetcloud.AbstractC13943a;
import com.zing.zalo.zalocloud.info.C16806a;
import ec0.C18385f;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nl.C23870a;
import p205hc.C19964c;
import p348mi.AbstractC23306f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import si.C26263i;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.b */
/* loaded from: classes6.dex */
public final class C13944b extends AbstractC1796t0 {

    /* renamed from: s */
    private final C16806a f71886s;

    /* renamed from: t */
    private final C23870a f71887t;

    /* renamed from: u */
    private final C1761c0 f71888u;

    /* renamed from: v */
    private final C1761c0 f71889v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.b$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m77673a(ZCloudQuotaUsage zCloudQuotaUsage) {
            AbstractC19074t.m100208f(zCloudQuotaUsage, "it");
            C13944b.this.f71888u.mo9221n(C18385f.m97381b(C13944b.this.m77667S(), false, zCloudQuotaUsage, 1, null));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77673a((ZCloudQuotaUsage) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.b$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f71891t;

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
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f71891t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C16806a c16806a = C13944b.this.f71886s;
                this.f71891t = 1;
                obj = c16806a.m89843n(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                C13944b.this.f71888u.mo9221n(C18385f.m97381b(C13944b.this.m77667S(), false, null, 2, null));
                C13944b.this.f71889v.mo9221n(new C19964c(AbstractC13943a.b.f71884a));
                return C24848g0.f119245a;
            }
            C13944b.this.f71888u.mo9221n(C18385f.m97381b(C13944b.this.m77667S(), false, null, 2, null));
            C13944b.this.f71889v.mo9221n(new C19964c(AbstractC13943a.c.f71885a));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C13944b(C16806a c16806a, C23870a c23870a) {
        AbstractC19074t.m100208f(c16806a, "cloudInfoManager");
        AbstractC19074t.m100208f(c23870a, "cloudRepo");
        this.f71886s = c16806a;
        this.f71887t = c23870a;
        this.f71888u = new C1761c0(new C18385f(false, null, 3, null));
        this.f71889v = new C1761c0(new C19964c(AbstractC13943a.a.f71883a));
    }

    /* renamed from: Q */
    private final void m77666Q() {
        this.f71888u.mo9221n(C18385f.m97381b(m77667S(), true, null, 2, null));
        C26263i.m135055u().m135082n();
    }

    /* renamed from: S */
    public final C18385f m77667S() {
        C18385f c18385f = (C18385f) m77670U().mo9215f();
        if (c18385f == null) {
            return new C18385f(false, null, 3, null);
        }
        return c18385f;
    }

    /* renamed from: R */
    public final void m77668R() {
        C23870a.m124718I0(this.f71887t, false, AbstractC1798u0.m9374a(this), new a(), 1, null);
    }

    /* renamed from: T */
    public final LiveData m77669T() {
        return this.f71889v;
    }

    /* renamed from: U */
    public final LiveData m77670U() {
        return this.f71888u;
    }

    /* renamed from: V */
    public final void m77671V() {
        AbstractC23306f.m120636Y1().m128539z(false);
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new b(null), 3, null);
    }

    /* renamed from: W */
    public final void m77672W() {
        this.f71887t.m124846z();
        m77666Q();
    }
}

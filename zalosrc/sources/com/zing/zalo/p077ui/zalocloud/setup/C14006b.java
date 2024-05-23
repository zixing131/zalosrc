package com.zing.zalo.p077ui.zalocloud.setup;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.p077ui.zalocloud.setup.AbstractC14005a;
import com.zing.zalo.zalocloud.info.C16806a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import hc0.C19979i;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nl.C23870a;
import p205hc.C19964c;
import p348mi.AbstractC23306f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: com.zing.zalo.ui.zalocloud.setup.b */
/* loaded from: classes6.dex */
public final class C14006b extends AbstractC1796t0 {

    /* renamed from: s */
    private final C16806a f72014s;

    /* renamed from: t */
    private final C23870a f72015t;

    /* renamed from: u */
    private final C1761c0 f72016u;

    /* renamed from: v */
    private final C1761c0 f72017v;

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.b$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f72018t;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f72018t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C16806a c16806a = C14006b.this.f72014s;
                this.f72018t = 1;
                obj = c16806a.m89843n(this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                AbstractC23306f.m120636Y1().m128517I(false);
                C14006b.this.f72016u.mo9221n(C14006b.this.m77908Q().m103751a(false));
                C14006b.this.f72017v.mo9221n(new C19964c(AbstractC14005a.b.f72012a));
                return C24848g0.f119245a;
            }
            C14006b.this.f72017v.mo9221n(new C19964c(AbstractC14005a.c.f72013a));
            C14006b.this.f72016u.mo9221n(C14006b.this.m77908Q().m103751a(false));
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C14006b(C16806a c16806a, C23870a c23870a) {
        AbstractC19074t.m100208f(c16806a, "cloudInfoManager");
        AbstractC19074t.m100208f(c23870a, "cloudRepo");
        this.f72014s = c16806a;
        this.f72015t = c23870a;
        this.f72016u = new C1761c0();
        this.f72017v = new C1761c0(new C19964c(AbstractC14005a.a.f72011a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public final C19979i m77908Q() {
        C19979i c19979i = (C19979i) m77910S().mo9215f();
        if (c19979i == null) {
            return new C19979i(false, 1, null);
        }
        return c19979i;
    }

    /* renamed from: R */
    public final LiveData m77909R() {
        return this.f72017v;
    }

    /* renamed from: S */
    public final LiveData m77910S() {
        return this.f72016u;
    }

    /* renamed from: T */
    public final void m77911T() {
        if (AbstractC23306f.m120636Y1().m128537w()) {
            this.f72016u.mo9221n(m77908Q().m103751a(true));
            BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new a(null), 3, null);
        } else {
            this.f72017v.mo9221n(new C19964c(AbstractC14005a.b.f72012a));
        }
    }
}

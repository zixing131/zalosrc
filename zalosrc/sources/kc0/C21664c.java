package kc0;

import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1798u0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kc0.AbstractC21662a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p205hc.C19964c;
import p348mi.AbstractC23306f;
import p484ri.C25804a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import sc.C26220b;
import si.C26263i;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: kc0.c */
/* loaded from: classes6.dex */
public final class C21664c extends AbstractC1796t0 {

    /* renamed from: s */
    private final C25804a f105116s;

    /* renamed from: t */
    private final C1761c0 f105117t;

    /* renamed from: u */
    private final C1761c0 f105118u;

    /* renamed from: v */
    private final C1761c0 f105119v;

    /* renamed from: kc0.c$a */
    /* loaded from: classes6.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f105120t;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kc0.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C32870a extends AbstractC19075u implements InterfaceC18505l {

            /* renamed from: q */
            final /* synthetic */ C21664c f105122q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C32870a(C21664c c21664c) {
                super(1);
                this.f105122q = c21664c;
            }

            /* renamed from: a */
            public final void m111670a(C24848g0 c24848g0) {
                AbstractC19074t.m100208f(c24848g0, "it");
                this.f105122q.m111664T();
            }

            @Override // en0.InterfaceC18505l
            /* renamed from: i9 */
            public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
                m111670a((C24848g0) obj);
                return C24848g0.f119245a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: kc0.c$a$b */
        /* loaded from: classes6.dex */
        public static final class b extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            public static final b f105123q = new b();

            b() {
                super(2);
            }

            /* renamed from: a */
            public final void m111671a(int i11, String str) {
                AbstractC19074t.m100208f(str, "msg");
                C26220b.m134820c(str);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: pC */
            public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
                m111671a(((Number) obj).intValue(), (String) obj2);
                return C24848g0.f119245a;
            }
        }

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
            AbstractC28298d.m142578e();
            if (this.f105120t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC23306f.m120692n().m133045d(0, new C32870a(C21664c.this), b.f105123q);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C21664c(C25804a c25804a) {
        AbstractC19074t.m100208f(c25804a, "backupRestoreMediaRepository");
        this.f105116s = c25804a;
        this.f105117t = new C1761c0(new C21663b(false, 1, null));
        this.f105118u = new C1761c0(new C19964c(AbstractC21662a.a.f105110a));
        this.f105119v = new C1761c0();
    }

    /* renamed from: Q */
    private final C21663b m111657Q() {
        C21663b c21663b = (C21663b) m111663S().mo9215f();
        if (c21663b == null) {
            return new C21663b(false, 1, null);
        }
        return c21663b;
    }

    /* renamed from: M */
    public final void m111658M() {
        m111666V();
    }

    /* renamed from: N */
    public final void m111659N() {
        this.f105117t.mo9221n(m111657Q().m111655a(true));
        C26263i.m135055u().m135082n();
    }

    /* renamed from: O */
    public final LiveData m111660O() {
        return this.f105119v;
    }

    /* renamed from: P */
    public final void m111661P() {
        C7924a m135087t = C26263i.m135055u().m135087t();
        if (m135087t == null) {
            return;
        }
        this.f105119v.mo9221n(m135087t);
    }

    /* renamed from: R */
    public final LiveData m111662R() {
        return this.f105118u;
    }

    /* renamed from: S */
    public final LiveData m111663S() {
        return this.f105117t;
    }

    /* renamed from: T */
    public final void m111664T() {
        C26263i.m135055u().m135085r0(16);
    }

    /* renamed from: U */
    public final void m111665U() {
        BuildersKt__Builders_commonKt.m112540d(AbstractC1798u0.m9374a(this), null, null, new a(null), 3, null);
    }

    /* renamed from: V */
    public final void m111666V() {
        TargetBackupInfo m135059x = C26263i.m135059x(C26263i.m135055u().m135087t());
        if (m135059x == null) {
            return;
        }
        if (C26263i.m135047n0(18, m135059x)) {
            this.f105118u.mo9221n(new C19964c(AbstractC21662a.d.f105113a));
        } else {
            this.f105118u.mo9221n(new C19964c(AbstractC21662a.c.f105112a));
        }
    }

    /* renamed from: W */
    public final void m111667W(int i11) {
        if (i11 == AbstractC6918a0.btnKeepData) {
            m111666V();
        } else if (i11 == AbstractC6918a0.btnDeleteData) {
            this.f105118u.mo9221n(new C19964c(AbstractC21662a.e.f105114a));
        }
    }

    /* renamed from: X */
    public final void m111668X() {
        this.f105117t.mo9221n(m111657Q().m111655a(false));
        AbstractC23306f.m120668h().m132679U();
        this.f105118u.mo9221n(new C19964c(AbstractC21662a.b.f105111a));
    }
}

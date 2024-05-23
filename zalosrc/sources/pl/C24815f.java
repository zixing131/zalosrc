package pl;

import am.AbstractC0924m0;
import com.zing.zalo.data.entity.chat.message.MessageId;
import com.zing.zalo.data.zalocloud.model.CloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.ZCloudQuotaUsage;
import com.zing.zalo.data.zalocloud.model.api.CloudSettings;
import com.zing.zalo.data.zalocloud.model.api.CloudSubscriptionInfo;
import com.zing.zalo.data.zalocloud.model.api.CloudUrlPattern;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p348mi.AbstractC23306f;
import p613wl.C29085a;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import un0.AbstractC27323a;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: pl.f */
/* loaded from: classes3.dex */
public final class C24815f implements InterfaceC24812c {

    /* renamed from: a */
    private final CoroutineDispatcher f119089a;

    /* renamed from: pl.f$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119090t;

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
            if (this.f119090t == 0) {
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145341c(C24815f.this.m129018q0().m128928f());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119092t;

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
            if (this.f119092t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128933t();
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

    /* renamed from: pl.f$c */
    /* loaded from: classes3.dex */
    static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119094t;

        c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119094t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128934v();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119096t;

        /* renamed from: v */
        final /* synthetic */ List f119098v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List list, Continuation continuation) {
            super(2, continuation);
            this.f119098v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f119098v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119096t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128905E(this.f119098v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$e */
    /* loaded from: classes3.dex */
    static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119099t;

        /* renamed from: v */
        final /* synthetic */ List f119101v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(List list, Continuation continuation) {
            super(2, continuation);
            this.f119101v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new e(this.f119101v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119099t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128907F(this.f119101v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$f */
    /* loaded from: classes3.dex */
    static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119102t;

        /* renamed from: v */
        final /* synthetic */ List f119104v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, Continuation continuation) {
            super(2, continuation);
            this.f119104v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new f(this.f119104v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119102t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128909G(this.f119104v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$g */
    /* loaded from: classes3.dex */
    static final class g extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119105t;

        /* renamed from: v */
        final /* synthetic */ String f119107v;

        /* renamed from: w */
        final /* synthetic */ long f119108w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j11, Continuation continuation) {
            super(2, continuation);
            this.f119107v = str;
            this.f119108w = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new g(this.f119107v, this.f119108w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119105t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128914K(this.f119107v, this.f119108w);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$h */
    /* loaded from: classes3.dex */
    static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119109t;

        h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119109t == 0) {
                AbstractC24862s.m129228b(obj);
                return AbstractC29094b.m145341c(C24815f.this.m129018q0().m128916M());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$i */
    /* loaded from: classes3.dex */
    static final class i extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119111t;

        /* renamed from: v */
        final /* synthetic */ MessageId f119113v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(MessageId messageId, Continuation continuation) {
            super(2, continuation);
            this.f119113v = messageId;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new i(this.f119113v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119111t == 0) {
                AbstractC24862s.m129228b(obj);
                return C24815f.this.m129018q0().m128917N(this.f119113v);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((i) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$j */
    /* loaded from: classes3.dex */
    static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119114t;

        /* renamed from: v */
        final /* synthetic */ String f119116v;

        /* renamed from: w */
        final /* synthetic */ List f119117w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, List list, Continuation continuation) {
            super(2, continuation);
            this.f119116v = str;
            this.f119117w = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f119116v, this.f119117w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119114t == 0) {
                AbstractC24862s.m129228b(obj);
                return C24815f.this.m129018q0().m128918O(this.f119116v, this.f119117w);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$k */
    /* loaded from: classes3.dex */
    static final class k extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119118t;

        /* renamed from: v */
        final /* synthetic */ List f119120v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(List list, Continuation continuation) {
            super(2, continuation);
            this.f119120v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new k(this.f119120v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119118t == 0) {
                AbstractC24862s.m129228b(obj);
                return C24815f.this.m129018q0().m128919P(this.f119120v);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((k) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$l */
    /* loaded from: classes3.dex */
    static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119121t;

        /* renamed from: v */
        final /* synthetic */ long f119123v;

        /* renamed from: w */
        final /* synthetic */ int f119124w;

        /* renamed from: x */
        final /* synthetic */ int f119125x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(long j11, int i11, int i12, Continuation continuation) {
            super(2, continuation);
            this.f119123v = j11;
            this.f119124w = i11;
            this.f119125x = i12;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f119123v, this.f119124w, this.f119125x, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119121t == 0) {
                AbstractC24862s.m129228b(obj);
                return C24815f.this.m129018q0().m128931r0(this.f119123v, this.f119124w, this.f119125x);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((l) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$m */
    /* loaded from: classes3.dex */
    static final class m extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119126t;

        /* renamed from: v */
        final /* synthetic */ int f119128v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i11, Continuation continuation) {
            super(2, continuation);
            this.f119128v = i11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new m(this.f119128v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119126t == 0) {
                AbstractC24862s.m129228b(obj);
                return C24815f.this.m129018q0().m128932s0(this.f119128v);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((m) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$n */
    /* loaded from: classes3.dex */
    static final class n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119129t;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new n(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119129t == 0) {
                AbstractC24862s.m129228b(obj);
                return C24815f.this.m129018q0().m128935w0();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((n) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$o */
    /* loaded from: classes3.dex */
    static final class o extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119131t;

        /* renamed from: v */
        final /* synthetic */ List f119133v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(List list, Continuation continuation) {
            super(2, continuation);
            this.f119133v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new o(this.f119133v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119131t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128937y0(this.f119133v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((o) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$p */
    /* loaded from: classes3.dex */
    static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119134t;

        /* renamed from: v */
        final /* synthetic */ List f119136v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(List list, Continuation continuation) {
            super(2, continuation);
            this.f119136v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p(this.f119136v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119134t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128904D0(this.f119136v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((p) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$q */
    /* loaded from: classes3.dex */
    static final class q extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119137t;

        /* renamed from: v */
        final /* synthetic */ List f119139v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(List list, Continuation continuation) {
            super(2, continuation);
            this.f119139v = list;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new q(this.f119139v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119137t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128908F0(this.f119139v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((q) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$r */
    /* loaded from: classes3.dex */
    static final class r extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119140t;

        r(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new r(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119140t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128921Q0();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((r) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: pl.f$s */
    /* loaded from: classes3.dex */
    static final class s extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f119142t;

        /* renamed from: v */
        final /* synthetic */ List f119144v;

        /* renamed from: w */
        final /* synthetic */ long f119145w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(List list, long j11, Continuation continuation) {
            super(2, continuation);
            this.f119144v = list;
            this.f119145w = j11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new s(this.f119144v, this.f119145w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f119142t == 0) {
                AbstractC24862s.m129228b(obj);
                C24815f.this.m129018q0().m128922S0(this.f119144v, this.f119145w);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((s) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    public C24815f(CoroutineDispatcher coroutineDispatcher) {
        AbstractC19074t.m100208f(coroutineDispatcher, "ioDispatcher");
        this.f119089a = coroutineDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q0 */
    public final C24811b m129018q0() {
        C24811b m120639Z1 = AbstractC23306f.m120639Z1();
        AbstractC19074t.m100207e(m120639Z1, "provideZaloCloudDB(...)");
        return m120639Z1;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: A */
    public String mo128946A() {
        String m3532W2 = AbstractC0924m0.m3532W2();
        AbstractC19074t.m100207e(m3532W2, "getLastVerifiedNoiseId(...)");
        return m3532W2;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: B */
    public void mo128947B(int i11) {
        AbstractC0924m0.m3702bq(i11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: C */
    public Object mo128948C(List list, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new f(list, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: D */
    public void mo128949D(long j11) {
        AbstractC0924m0.m3966kk(j11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: E */
    public int mo128950E() {
        return AbstractC0924m0.m4253u8();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: F */
    public Object mo128951F(Continuation continuation) {
        return BuildersKt.m112534g(this.f119089a, new h(null), continuation);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: G */
    public Object mo128952G(Continuation continuation) {
        return BuildersKt.m112534g(this.f119089a, new n(null), continuation);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: H */
    public Object mo128953H(Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new b(null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: I */
    public Object mo128954I(List list, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new d(list, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: J */
    public String mo128955J() {
        String m2920B = AbstractC0924m0.m2920B();
        AbstractC19074t.m100207e(m2920B, "getCachedCloudSettings(...)");
        return m2920B;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: K */
    public int mo128956K() {
        return AbstractC0924m0.m3923j7();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: L */
    public int mo128957L() {
        return AbstractC0924m0.m3893i7();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: M */
    public Object mo128958M(String str, List list, Continuation continuation) {
        return BuildersKt.m112534g(this.f119089a, new j(str, list, null), continuation);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: N */
    public Object mo128959N(long j11, int i11, int i12, Continuation continuation) {
        return BuildersKt.m112534g(this.f119089a, new l(j11, i11, i12, null), continuation);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: O */
    public void mo128960O(ZCloudQuotaUsage zCloudQuotaUsage) {
        AbstractC19074t.m100208f(zCloudQuotaUsage, "quotaData");
        AbstractC27323a m145315b = C29085a.f134890a.m145315b();
        m145315b.mo131586a();
        AbstractC0924m0.m3936jk(m145315b.mo131597b(ZCloudQuotaUsage.Companion.serializer(), zCloudQuotaUsage));
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: P */
    public Object mo128961P(String str, long j11, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new g(str, j11, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: Q */
    public void mo128962Q(String str) {
        AbstractC19074t.m100208f(str, "noiseId");
        AbstractC0924m0.m3491Uj(str);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: R */
    public void mo128963R(int i11) {
        AbstractC0924m0.m3732cq(i11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: S */
    public Object mo128964S(Continuation continuation) {
        return m129018q0().m128913J0();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: T */
    public Object mo128965T(int i11, long j11, int i12, String str, Continuation continuation) {
        return m129018q0().m128920Q(i11, j11, i12, str);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: U */
    public CloudQuotaUsage mo128966U() {
        return m129018q0().m128924c("204278670");
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: V */
    public boolean mo128967V() {
        return AbstractC0924m0.m3364Q8();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: W */
    public void mo128968W(boolean z11) {
        AbstractC0924m0.m4346xe(z11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: X */
    public List mo128969X() {
        return m129018q0().m128925c0();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: Y */
    public void mo128970Y(int i11) {
        AbstractC0924m0.m3209Kr(i11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: Z */
    public Object mo128971Z(int i11, Continuation continuation) {
        return BuildersKt.m112534g(this.f119089a, new m(i11, null), continuation);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: a */
    public void mo128972a(long j11) {
        AbstractC0924m0.m3635Zi(j11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: a0 */
    public Object mo128973a0(Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new c(null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: b */
    public CloudQuotaUsage mo128974b() {
        String m3533W3 = AbstractC0924m0.m3533W3();
        AbstractC19074t.m100205c(m3533W3);
        if (m3533W3.length() == 0) {
            return CloudQuotaUsage.Companion.m41240b();
        }
        AbstractC27323a m145315b = C29085a.f134890a.m145315b();
        m145315b.mo131586a();
        return (CloudQuotaUsage) m145315b.m139867d(CloudQuotaUsage.Companion.serializer(), m3533W3);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: b0 */
    public void mo128975b0(String str, long j11) {
        AbstractC19074t.m100208f(str, "ownerId");
        m129018q0().m128912J(str, j11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: c */
    public long mo128976c() {
        return AbstractC0924m0.m4224t8();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: c0 */
    public void mo128977c0(CloudSettings cloudSettings) {
        String str;
        if (cloudSettings == null || (str = cloudSettings.m41314i()) == null) {
            str = "";
        }
        AbstractC0924m0.m3930je(str);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: d */
    public Object mo128978d(List list, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new o(list, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: d0 */
    public void mo128979d0(CloudQuotaUsage cloudQuotaUsage) {
        AbstractC19074t.m100208f(cloudQuotaUsage, "quotaData");
        AbstractC27323a m145315b = C29085a.f134890a.m145315b();
        m145315b.mo131586a();
        AbstractC0924m0.m3877hl(m145315b.mo131597b(CloudQuotaUsage.Companion.serializer(), cloudQuotaUsage));
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: e */
    public Object mo128980e(Continuation continuation) {
        return BuildersKt.m112534g(this.f119089a, new a(null), continuation);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: e0 */
    public void mo128981e0(long j11) {
        AbstractC0924m0.m3644Zr(j11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: f */
    public Object mo128982f(List list, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new e(list, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: f0 */
    public void mo128983f0() {
        m129018q0().m128915L();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: g */
    public Object mo128984g(List list, long j11, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new s(list, j11, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: g0 */
    public void mo128985g0(CloudUrlPattern cloudUrlPattern) {
        String str;
        if (cloudUrlPattern == null || (str = cloudUrlPattern.m41329e()) == null) {
            str = "";
        }
        AbstractC0924m0.m3960ke(str);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: h */
    public void mo128986h(MessageId messageId) {
        AbstractC19074t.m100208f(messageId, "msgId");
        m129018q0().m128936y(messageId);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: h0 */
    public void mo128987h0() {
        m129018q0().m128930h();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: i */
    public Object mo128988i(MessageId messageId, Continuation continuation) {
        return BuildersKt.m112534g(this.f119089a, new i(messageId, null), continuation);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: i0 */
    public ZCloudQuotaUsage mo128989i0() {
        return m129018q0().m128926d();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: j */
    public Object mo128990j(List list, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new q(list, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: j0 */
    public Object mo128991j0(Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new r(null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: k */
    public void mo128992k(long j11) {
        AbstractC0924m0.m3180Jr(j11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: k0 */
    public long mo128993k0() {
        return AbstractC0924m0.m3648a2();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: l */
    public Object mo128994l(List list, Continuation continuation) {
        return BuildersKt.m112534g(this.f119089a, new k(list, null), continuation);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: l0 */
    public List mo128995l0() {
        return m129018q0().m128923Z();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: m */
    public void mo128996m(CloudSubscriptionInfo cloudSubscriptionInfo) {
        String str;
        if (cloudSubscriptionInfo == null || (str = cloudSubscriptionInfo.m41322f()) == null) {
            str = "";
        }
        AbstractC0924m0.m3412Rr(str);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: m0 */
    public ZCloudQuotaUsage mo128997m0() {
        String m3949k3 = AbstractC0924m0.m3949k3();
        AbstractC19074t.m100205c(m3949k3);
        if (m3949k3.length() == 0) {
            return ZCloudQuotaUsage.Companion.m41262b();
        }
        AbstractC27323a m145315b = C29085a.f134890a.m145315b();
        m145315b.mo131586a();
        return (ZCloudQuotaUsage) m145315b.m139867d(ZCloudQuotaUsage.Companion.serializer(), m3949k3);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: n */
    public void mo128998n(List list) {
        AbstractC19074t.m100208f(list, "msgIdList");
        m129018q0().m128903A(list);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: n0 */
    public Object mo128999n0(List list, Continuation continuation) {
        Object m142578e;
        Object m112534g = BuildersKt.m112534g(this.f119089a, new p(list, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112534g == m142578e) {
            return m112534g;
        }
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: o */
    public long mo129000o() {
        return AbstractC0924m0.m3979l3();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: o0 */
    public long mo129001o0() {
        return AbstractC0924m0.m2987D8();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: p */
    public Object mo129002p(String str, Continuation continuation) {
        m129018q0().m128910G0(str);
        return C24848g0.f119245a;
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: q */
    public List mo129003q() {
        return m129018q0().m128911I0();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: r */
    public Object mo129004r(String str, Continuation continuation) {
        return m129018q0().m128927d0(str);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: s */
    public long mo129005s() {
        return AbstractC0924m0.m3561X2();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: t */
    public boolean mo129006t() {
        return AbstractC0924m0.m3451T8();
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: u */
    public List mo129007u(String str) {
        AbstractC19074t.m100208f(str, "ownerId");
        return m129018q0().m128929f0(str);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: v */
    public void mo129008v(long j11) {
        AbstractC0924m0.m3520Vj(j11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: w */
    public CloudUrlPattern mo129009w() {
        CloudUrlPattern.Companion companion = CloudUrlPattern.Companion;
        String m2949C = AbstractC0924m0.m2949C();
        AbstractC19074t.m100207e(m2949C, "getCachedCloudUrlPattern(...)");
        return companion.m41330a(m2949C);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: x */
    public void mo129010x(boolean z11) {
        AbstractC0924m0.m3283Ne(z11);
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: y */
    public List mo129011y() {
        return m129018q0().m128929f0("");
    }

    @Override // pl.InterfaceC24812c
    /* renamed from: z */
    public String mo129012z() {
        String m4369y8 = AbstractC0924m0.m4369y8();
        AbstractC19074t.m100207e(m4369y8, "getZcloudPackageCloudSubscriptionInfo(...)");
        return m4369y8;
    }

    public /* synthetic */ C24815f(CoroutineDispatcher coroutineDispatcher, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? Dispatchers.m112680b() : coroutineDispatcher);
    }
}

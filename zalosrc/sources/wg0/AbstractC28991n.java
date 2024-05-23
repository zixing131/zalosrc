package wg0;

import am.AbstractC0924m0;
import com.zing.zalo.zalocloud.migration.AbstractC16864d;
import com.zing.zalo.zalocloud.migration.C16862b;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import og0.C24252c;
import og0.EnumC24251b;
import on0.AbstractC24341v;
import p227i3.C20215s;
import p297kd.C21688c;
import p620wt.AbstractC29233h;
import p620wt.AbstractC29235j;
import p620wt.C29234i;
import p620wt.InterfaceC29232g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25358n;
import tg0.C26676b;
import ug0.C27257l;
import vm0.AbstractC28298d;
import wg0.AbstractC28981d;
import wg0.AbstractC28997t;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.AbstractC29104l;

/* renamed from: wg0.n */
/* loaded from: classes7.dex */
public abstract class AbstractC28991n {

    /* renamed from: a */
    private static final Integer[] f134172a = {1, 2, 4, 8, 16, 32, 64};

    /* renamed from: b */
    private static final C29234i f134173b;

    /* renamed from: c */
    private static volatile String f134174c;

    /* renamed from: d */
    private static final InterfaceC29232g f134175d;

    /* renamed from: e */
    private static final InterfaceC29232g f134176e;

    /* renamed from: f */
    private static final InterfaceC29232g f134177f;

    /* renamed from: g */
    private static final InterfaceC29232g f134178g;

    /* renamed from: wg0.n$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f134179a;

        static {
            int[] iArr = new int[EnumC24251b.values().length];
            try {
                iArr[EnumC24251b.f117146q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC24251b.f117147r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC24251b.f117148s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f134179a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$a0 */
    /* loaded from: classes7.dex */
    public static final class a0 extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        final /* synthetic */ List f134180q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a0(List list) {
            super(1);
            this.f134180q = list;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence mo205i9(InterfaceC28990m interfaceC28990m) {
            String str;
            AbstractC19074t.m100208f(interfaceC28990m, C20215s.f99966b);
            if (!this.f134180q.contains(interfaceC28990m)) {
                str = "[EXCLUDED]";
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            return str + AbstractC28991n.m144824j(interfaceC28990m) + "=" + AbstractC28991n.m144814Z(interfaceC28990m);
        }
    }

    /* renamed from: wg0.n$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f134181q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableStateFlow mo12V4() {
            Object aVar;
            if (AbstractC28991n.m144840z()) {
                aVar = new AbstractC28997t.e(19);
            } else {
                aVar = new AbstractC28997t.a(19);
            }
            return StateFlowKt.m113503a(aVar);
        }
    }

    /* renamed from: wg0.n$b0 */
    /* loaded from: classes7.dex */
    static final class b0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b0 f134182q = new b0();

        b0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow mo12V4() {
            C21688c m111854a = C21688c.Companion.m111854a();
            if (!m111854a.m111847h(C28980c.class)) {
                m111854a.m111849u(new C28980c(), "SYNC_MES");
            }
            return FlowKt.m113284b(AbstractC28991n.m144817c());
        }
    }

    /* renamed from: wg0.n$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final c f134183q = new c();

        c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MutableStateFlow mo12V4() {
            Object aVar;
            if (AbstractC28991n.m144795G()) {
                aVar = new AbstractC28997t.e(18);
            } else {
                aVar = new AbstractC28997t.a(18);
            }
            return StateFlowKt.m113503a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final d f134184q = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m144845a(int i11) {
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 4) {
                            if (i11 != 8) {
                                if (i11 != 16) {
                                    if (i11 != 32) {
                                        if (i11 != 64) {
                                            if (i11 != 65536) {
                                                return String.valueOf(i11);
                                            }
                                            return "FLAG_READY_TO_START";
                                        }
                                        return "FLAG_MY_CLOUD_MIGRATED";
                                    }
                                    return "FLAG_MY_CLOUD_MIGRATION_STARTED";
                                }
                                return "FLAG_MEDIA_MIGRATED";
                            }
                            return "FLAG_MEDIA_MIGRATION_STARTED";
                        }
                        return "FLAG_BACKED_UP";
                    }
                    return "FLAG_BACK_UP_STARTED";
                }
                return "FLAG_RESTORED";
            }
            return "FLAG_DEFAULT";
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m144845a(((Number) obj).intValue());
        }
    }

    /* renamed from: wg0.n$e */
    /* loaded from: classes7.dex */
    public static final class e implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f134185p;

        /* renamed from: wg0.n$e$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f134186p;

            /* renamed from: wg0.n$e$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33025a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f134187s;

                /* renamed from: t */
                int f134188t;

                public C33025a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f134187s = obj;
                    this.f134188t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f134186p = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33025a c33025a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33025a) {
                    c33025a = (C33025a) continuation;
                    int i12 = c33025a.f134188t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33025a.f134188t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33025a.f134187s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33025a.f134188t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f134186p;
                            if (((AbstractC28997t) obj) instanceof AbstractC28997t.c) {
                                c33025a.f134188t = 1;
                                if (flowCollector.mo12109b(obj, c33025a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33025a = new C33025a(continuation);
                Object obj22 = c33025a.f134187s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33025a.f134188t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public e(Flow flow) {
            this.f134185p = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f134185p.mo97893a(new a(flowCollector), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$f */
    /* loaded from: classes7.dex */
    public static final class f extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134190t;

        /* renamed from: u */
        /* synthetic */ Object f134191u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18509p f134192v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f134192v = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            f fVar = new f(this.f134192v, continuation);
            fVar.f134191u = obj;
            return fVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f134190t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC28997t abstractC28997t = (AbstractC28997t) this.f134191u;
                AbstractC19074t.m100206d(abstractC28997t, "null cannot be cast to non-null type com.zing.zalo.zalocloud.onboarding.ZaloCloudOnboardingSyncMessageState.RuntimeError");
                AbstractC28997t.c cVar = (AbstractC28997t.c) abstractC28997t;
                this.f134192v.mo240pC(AbstractC29094b.m145339a(cVar.m144869j()), cVar.m144868i());
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC28997t abstractC28997t, Continuation continuation) {
            return ((f) mo238a(abstractC28997t, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wg0.n$g */
    /* loaded from: classes7.dex */
    public static final class g implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f134193p;

        /* renamed from: wg0.n$g$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f134194p;

            /* renamed from: wg0.n$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33026a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f134195s;

                /* renamed from: t */
                int f134196t;

                public C33026a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f134195s = obj;
                    this.f134196t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f134194p = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33026a c33026a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33026a) {
                    c33026a = (C33026a) continuation;
                    int i12 = c33026a.f134196t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33026a.f134196t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33026a.f134195s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33026a.f134196t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f134194p;
                            if (((AbstractC28997t) obj) instanceof AbstractC28997t.d) {
                                c33026a.f134196t = 1;
                                if (flowCollector.mo12109b(obj, c33026a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33026a = new C33026a(continuation);
                Object obj22 = c33026a.f134195s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33026a.f134196t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public g(Flow flow) {
            this.f134193p = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f134193p.mo97893a(new a(flowCollector), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$h */
    /* loaded from: classes7.dex */
    public static final class h extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134198t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f134199u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f134199u = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new h(this.f134199u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f134198t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f134199u.mo12V4();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC28997t abstractC28997t, Continuation continuation) {
            return ((h) mo238a(abstractC28997t, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wg0.n$i */
    /* loaded from: classes7.dex */
    public static final class i implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f134200p;

        /* renamed from: wg0.n$i$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f134201p;

            /* renamed from: wg0.n$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33027a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f134202s;

                /* renamed from: t */
                int f134203t;

                public C33027a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f134202s = obj;
                    this.f134203t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f134201p = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33027a c33027a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33027a) {
                    c33027a = (C33027a) continuation;
                    int i12 = c33027a.f134203t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33027a.f134203t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33027a.f134202s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33027a.f134203t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f134201p;
                            if (((AbstractC28997t) obj) instanceof AbstractC28997t.e) {
                                c33027a.f134203t = 1;
                                if (flowCollector.mo12109b(obj, c33027a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33027a = new C33027a(continuation);
                Object obj22 = c33027a.f134202s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33027a.f134203t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public i(Flow flow) {
            this.f134200p = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f134200p.mo97893a(new a(flowCollector), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$j */
    /* loaded from: classes7.dex */
    public static final class j extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134205t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f134206u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f134206u = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new j(this.f134206u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f134205t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f134206u.mo12V4();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC28997t abstractC28997t, Continuation continuation) {
            return ((j) mo238a(abstractC28997t, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wg0.n$k */
    /* loaded from: classes7.dex */
    public static final class k implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f134207p;

        /* renamed from: wg0.n$k$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f134208p;

            /* renamed from: wg0.n$k$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33028a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f134209s;

                /* renamed from: t */
                int f134210t;

                public C33028a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f134209s = obj;
                    this.f134210t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f134208p = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33028a c33028a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33028a) {
                    c33028a = (C33028a) continuation;
                    int i12 = c33028a.f134210t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33028a.f134210t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33028a.f134209s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33028a.f134210t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f134208p;
                            if (((AbstractC16864d) obj) instanceof AbstractC16864d.h) {
                                c33028a.f134210t = 1;
                                if (flowCollector.mo12109b(obj, c33028a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33028a = new C33028a(continuation);
                Object obj22 = c33028a.f134209s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33028a.f134210t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public k(Flow flow) {
            this.f134207p = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f134207p.mo97893a(new a(flowCollector), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$l */
    /* loaded from: classes7.dex */
    public static final class l extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134212t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f134213u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f134213u = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new l(this.f134213u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f134212t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f134213u.mo12V4();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC16864d abstractC16864d, Continuation continuation) {
            return ((l) mo238a(abstractC16864d, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wg0.n$m */
    /* loaded from: classes7.dex */
    public static final class m implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f134214p;

        /* renamed from: wg0.n$m$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f134215p;

            /* renamed from: wg0.n$m$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33029a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f134216s;

                /* renamed from: t */
                int f134217t;

                public C33029a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f134216s = obj;
                    this.f134217t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f134215p = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33029a c33029a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33029a) {
                    c33029a = (C33029a) continuation;
                    int i12 = c33029a.f134217t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33029a.f134217t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33029a.f134216s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33029a.f134217t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f134215p;
                            if (((AbstractC16864d) obj) instanceof AbstractC16864d.j) {
                                c33029a.f134217t = 1;
                                if (flowCollector.mo12109b(obj, c33029a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33029a = new C33029a(continuation);
                Object obj22 = c33029a.f134216s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33029a.f134217t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public m(Flow flow) {
            this.f134214p = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f134214p.mo97893a(new a(flowCollector), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$n */
    /* loaded from: classes7.dex */
    public static final class n extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134219t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18505l f134220u;

        /* renamed from: v */
        final /* synthetic */ String f134221v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(InterfaceC18505l interfaceC18505l, String str, Continuation continuation) {
            super(2, continuation);
            this.f134220u = interfaceC18505l;
            this.f134221v = str;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new n(this.f134220u, this.f134221v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f134219t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f134220u.mo205i9(AbstractC29094b.m145339a(C27257l.f128129a.m139472b(this.f134221v).m90051L()));
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC16864d abstractC16864d, Continuation continuation) {
            return ((n) mo238a(abstractC16864d, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wg0.n$o */
    /* loaded from: classes7.dex */
    public static final class o implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f134222p;

        /* renamed from: wg0.n$o$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f134223p;

            /* renamed from: wg0.n$o$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33030a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f134224s;

                /* renamed from: t */
                int f134225t;

                public C33030a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f134224s = obj;
                    this.f134225t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f134223p = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33030a c33030a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33030a) {
                    c33030a = (C33030a) continuation;
                    int i12 = c33030a.f134225t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33030a.f134225t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33030a.f134224s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33030a.f134225t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f134223p;
                            if (((AbstractC16864d) obj) instanceof AbstractC16864d.h) {
                                c33030a.f134225t = 1;
                                if (flowCollector.mo12109b(obj, c33030a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33030a = new C33030a(continuation);
                Object obj22 = c33030a.f134224s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33030a.f134225t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public o(Flow flow) {
            this.f134222p = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f134222p.mo97893a(new a(flowCollector), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$p */
    /* loaded from: classes7.dex */
    public static final class p extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134227t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f134228u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f134228u = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new p(this.f134228u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f134227t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f134228u.mo12V4();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC16864d abstractC16864d, Continuation continuation) {
            return ((p) mo238a(abstractC16864d, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wg0.n$q */
    /* loaded from: classes7.dex */
    public static final class q implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f134229p;

        /* renamed from: wg0.n$q$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f134230p;

            /* renamed from: wg0.n$q$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33031a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f134231s;

                /* renamed from: t */
                int f134232t;

                public C33031a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f134231s = obj;
                    this.f134232t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f134230p = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33031a c33031a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33031a) {
                    c33031a = (C33031a) continuation;
                    int i12 = c33031a.f134232t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33031a.f134232t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33031a.f134231s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33031a.f134232t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f134230p;
                            if (((AbstractC16864d) obj) instanceof AbstractC16864d.j) {
                                c33031a.f134232t = 1;
                                if (flowCollector.mo12109b(obj, c33031a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33031a = new C33031a(continuation);
                Object obj22 = c33031a.f134231s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33031a.f134232t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public q(Flow flow) {
            this.f134229p = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f134229p.mo97893a(new a(flowCollector), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$r */
    /* loaded from: classes7.dex */
    public static final class r extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134234t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f134235u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f134235u = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new r(this.f134235u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f134234t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f134235u.mo12V4();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC16864d abstractC16864d, Continuation continuation) {
            return ((r) mo238a(abstractC16864d, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wg0.n$s */
    /* loaded from: classes7.dex */
    public static final class s implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f134236p;

        /* renamed from: wg0.n$s$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f134237p;

            /* renamed from: wg0.n$s$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33032a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f134238s;

                /* renamed from: t */
                int f134239t;

                public C33032a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f134238s = obj;
                    this.f134239t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f134237p = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33032a c33032a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33032a) {
                    c33032a = (C33032a) continuation;
                    int i12 = c33032a.f134239t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33032a.f134239t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33032a.f134238s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33032a.f134239t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f134237p;
                            AbstractC28997t abstractC28997t = (AbstractC28997t) obj;
                            if ((abstractC28997t instanceof AbstractC28997t.c) && abstractC28997t.mo90084e() == EnumC28993p.f134270t) {
                                c33032a.f134239t = 1;
                                if (flowCollector.mo12109b(obj, c33032a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33032a = new C33032a(continuation);
                Object obj22 = c33032a.f134238s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33032a.f134239t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public s(Flow flow) {
            this.f134236p = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f134236p.mo97893a(new a(flowCollector), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$t */
    /* loaded from: classes7.dex */
    public static final class t extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134241t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f134242u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f134242u = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new t(this.f134242u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f134241t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f134242u.mo12V4();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC28997t abstractC28997t, Continuation continuation) {
            return ((t) mo238a(abstractC28997t, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wg0.n$u */
    /* loaded from: classes7.dex */
    public static final class u implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f134243p;

        /* renamed from: wg0.n$u$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f134244p;

            /* renamed from: wg0.n$u$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33033a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f134245s;

                /* renamed from: t */
                int f134246t;

                public C33033a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f134245s = obj;
                    this.f134246t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f134244p = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33033a c33033a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33033a) {
                    c33033a = (C33033a) continuation;
                    int i12 = c33033a.f134246t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33033a.f134246t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33033a.f134245s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33033a.f134246t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f134244p;
                            if (((AbstractC28997t) obj) instanceof AbstractC28997t.c) {
                                c33033a.f134246t = 1;
                                if (flowCollector.mo12109b(obj, c33033a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33033a = new C33033a(continuation);
                Object obj22 = c33033a.f134245s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33033a.f134246t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public u(Flow flow) {
            this.f134243p = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f134243p.mo97893a(new a(flowCollector), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$v */
    /* loaded from: classes7.dex */
    public static final class v extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134248t;

        /* renamed from: u */
        /* synthetic */ Object f134249u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18509p f134250v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(InterfaceC18509p interfaceC18509p, Continuation continuation) {
            super(2, continuation);
            this.f134250v = interfaceC18509p;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            v vVar = new v(this.f134250v, continuation);
            vVar.f134249u = obj;
            return vVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f134248t == 0) {
                AbstractC24862s.m129228b(obj);
                AbstractC28997t abstractC28997t = (AbstractC28997t) this.f134249u;
                AbstractC19074t.m100206d(abstractC28997t, "null cannot be cast to non-null type com.zing.zalo.zalocloud.onboarding.ZaloCloudOnboardingSyncMessageState.RuntimeError");
                AbstractC28997t.c cVar = (AbstractC28997t.c) abstractC28997t;
                this.f134250v.mo240pC(AbstractC29094b.m145339a(cVar.m144869j()), cVar.m144868i());
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC28997t abstractC28997t, Continuation continuation) {
            return ((v) mo238a(abstractC28997t, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wg0.n$w */
    /* loaded from: classes7.dex */
    public static final class w implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow f134251p;

        /* renamed from: wg0.n$w$a */
        /* loaded from: classes7.dex */
        public static final class a implements FlowCollector {

            /* renamed from: p */
            final /* synthetic */ FlowCollector f134252p;

            /* renamed from: wg0.n$w$a$a, reason: collision with other inner class name */
            /* loaded from: classes7.dex */
            public static final class C33034a extends AbstractC29096d {

                /* renamed from: s */
                /* synthetic */ Object f134253s;

                /* renamed from: t */
                int f134254t;

                public C33034a(Continuation continuation) {
                    super(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    this.f134253s = obj;
                    this.f134254t |= Integer.MIN_VALUE;
                    return a.this.mo12109b(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f134252p = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object mo12109b(Object obj, Continuation continuation) {
                C33034a c33034a;
                Object m142578e;
                int i11;
                if (continuation instanceof C33034a) {
                    c33034a = (C33034a) continuation;
                    int i12 = c33034a.f134254t;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c33034a.f134254t = i12 - Integer.MIN_VALUE;
                        Object obj2 = c33034a.f134253s;
                        m142578e = AbstractC28298d.m142578e();
                        i11 = c33034a.f134254t;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC24862s.m129228b(obj2);
                            FlowCollector flowCollector = this.f134252p;
                            if (((AbstractC28997t) obj) instanceof AbstractC28997t.e) {
                                c33034a.f134254t = 1;
                                if (flowCollector.mo12109b(obj, c33034a) == m142578e) {
                                    return m142578e;
                                }
                            }
                        }
                        return C24848g0.f119245a;
                    }
                }
                c33034a = new C33034a(continuation);
                Object obj22 = c33034a.f134253s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c33034a.f134254t;
                if (i11 == 0) {
                }
                return C24848g0.f119245a;
            }
        }

        public w(Flow flow) {
            this.f134251p = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Object mo97893a = this.f134251p.mo97893a(new a(flowCollector), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (mo97893a == m142578e) {
                return mo97893a;
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: wg0.n$x */
    /* loaded from: classes7.dex */
    public static final class x extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f134256t;

        /* renamed from: u */
        final /* synthetic */ InterfaceC18494a f134257u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(InterfaceC18494a interfaceC18494a, Continuation continuation) {
            super(2, continuation);
            this.f134257u = interfaceC18494a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new x(this.f134257u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f134256t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f134257u.mo12V4();
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(AbstractC28997t abstractC28997t, Continuation continuation) {
            return ((x) mo238a(abstractC28997t, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: wg0.n$y */
    /* loaded from: classes7.dex */
    static final class y extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final y f134258q = new y();

        y() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final StateFlow mo12V4() {
            C21688c m111854a = C21688c.Companion.m111854a();
            if (!m111854a.m111847h(C28978a.class)) {
                m111854a.m111849u(new C28978a(), "SYNC_MES");
            }
            return FlowKt.m113284b(AbstractC28991n.m144816b());
        }
    }

    /* renamed from: wg0.n$z */
    /* loaded from: classes7.dex */
    public static final class z implements Flow {

        /* renamed from: p */
        final /* synthetic */ Flow[] f134259p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC28979b f134260q;

        /* renamed from: wg0.n$z$a */
        /* loaded from: classes7.dex */
        static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ Flow[] f134261q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Flow[] flowArr) {
                super(0);
                this.f134261q = flowArr;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object[] mo12V4() {
                return new InterfaceC28990m[this.f134261q.length];
            }
        }

        /* renamed from: wg0.n$z$b */
        /* loaded from: classes7.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18510q {

            /* renamed from: t */
            int f134262t;

            /* renamed from: u */
            private /* synthetic */ Object f134263u;

            /* renamed from: v */
            /* synthetic */ Object f134264v;

            /* renamed from: w */
            final /* synthetic */ InterfaceC28979b f134265w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Continuation continuation, InterfaceC28979b interfaceC28979b) {
                super(3, continuation);
                this.f134265w = interfaceC28979b;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                String m131375W;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f134262t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f134263u;
                    InterfaceC28990m[] interfaceC28990mArr = (InterfaceC28990m[]) ((Object[]) this.f134264v);
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC28990m interfaceC28990m : interfaceC28990mArr) {
                        if (this.f134265w.mo144692a(interfaceC28990m)) {
                            arrayList.add(interfaceC28990m);
                        }
                    }
                    int mo144693b = this.f134265w.mo144693b();
                    InterfaceC28990m[] interfaceC28990mArr2 = (InterfaceC28990m[]) arrayList.toArray(new InterfaceC28990m[0]);
                    AbstractC28981d m144818d = AbstractC28991n.m144818d(mo144693b, (InterfaceC28990m[]) Arrays.copyOf(interfaceC28990mArr2, interfaceC28990mArr2.length));
                    int mo144693b2 = this.f134265w.mo144693b();
                    m131375W = AbstractC25358n.m131375W(interfaceC28990mArr, null, null, null, 0, null, new a0(arrayList), 31, null);
                    String str = "onboardingJobCompositeStateChanged(): sessionJobId=" + mo144693b2 + ", state=" + m144818d + ", states=" + m131375W;
                    if (!AbstractC19074t.m100204b(AbstractC28991n.m144825k(), str)) {
                        AbstractC28991n.m144811W(str);
                        C26676b.m136957g("SMLZCloudOnboardingJobStateExt", str, null, 4, null);
                    }
                    this.f134262t = 1;
                    if (flowCollector.mo12109b(m144818d, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18510q
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo45599Hr(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
                b bVar = new b(continuation, this.f134265w);
                bVar.f134263u = flowCollector;
                bVar.f134264v = objArr;
                return bVar.mo239o(C24848g0.f119245a);
            }
        }

        public z(Flow[] flowArr, InterfaceC28979b interfaceC28979b) {
            this.f134259p = flowArr;
            this.f134260q = interfaceC28979b;
        }

        @Override // kotlinx.coroutines.flow.Flow
        /* renamed from: a */
        public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
            Object m142578e;
            Flow[] flowArr = this.f134259p;
            Object m113542a = CombineKt.m113542a(flowCollector, flowArr, new a(flowArr), new b(null, this.f134260q), continuation);
            m142578e = AbstractC28298d.m142578e();
            if (m113542a == m142578e) {
                return m113542a;
            }
            return C24848g0.f119245a;
        }
    }

    static {
        C29234i m145994a = AbstractC29235j.m145994a();
        f134173b = m145994a;
        f134174c = "";
        f134175d = AbstractC29233h.m145991b(m145994a, b.f134181q);
        f134176e = AbstractC29233h.m145991b(m145994a, c.f134183q);
        f134177f = AbstractC29233h.m145991b(m145994a, y.f134258q);
        f134178g = AbstractC29233h.m145991b(m145994a, b0.f134182q);
    }

    /* renamed from: A */
    public static final boolean m144789A() {
        return m144796H(2);
    }

    /* renamed from: B */
    public static final boolean m144790B() {
        return m144796H(16);
    }

    /* renamed from: C */
    public static final boolean m144791C() {
        return m144796H(8);
    }

    /* renamed from: D */
    public static final boolean m144792D() {
        return m144796H(64);
    }

    /* renamed from: E */
    public static final boolean m144793E() {
        return m144796H(32);
    }

    /* renamed from: F */
    public static final boolean m144794F() {
        return m144796H(65536);
    }

    /* renamed from: G */
    public static final boolean m144795G() {
        return m144796H(1);
    }

    /* renamed from: H */
    public static final boolean m144796H(int i11) {
        if ((m144827m() & i11) == i11) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public static final void m144797I(CoroutineScope coroutineScope, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(interfaceC18509p, "onFailed");
        FlowKt.m113270F(FlowKt.m113272H(new e(m144826l()), new f(interfaceC18509p, null)), coroutineScope);
    }

    /* renamed from: J */
    public static final void m144798J(CoroutineScope coroutineScope, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(interfaceC18494a, "onStarted");
        FlowKt.m113270F(FlowKt.m113272H(new g(m144826l()), new h(interfaceC18494a, null)), coroutineScope);
    }

    /* renamed from: K */
    public static final void m144799K(CoroutineScope coroutineScope, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(interfaceC18494a, "onSuccess");
        FlowKt.m113270F(FlowKt.m113272H(new i(m144826l()), new j(interfaceC18494a, null)), coroutineScope);
    }

    /* renamed from: L */
    public static final void m144800L(String str, int i11, int i12) {
        boolean m127128x;
        AbstractC19074t.m100208f(str, "userUid");
        C26676b.m136957g("SMLZCloudOnboardingJobStateExt", "onOnboardingJobFlagsChanged(): userUid=" + str + ", oldFlags=" + i11 + ", newFlags=" + i12, null, 4, null);
        m127128x = AbstractC24341v.m127128x(str);
        if (m127128x) {
            C26676b.m136962l("SMLZCloudOnboardingJobStateExt", "onOnboardingJobFlagsChanged(): userUid is blank, do nothing");
            return;
        }
        int i13 = 0;
        int i14 = 0;
        for (Integer num : f134172a) {
            int intValue = num.intValue();
            if (m144837w(i11, i12, intValue)) {
                i13 |= intValue;
            }
            if (m144838x(i11, i12, intValue)) {
                i14 |= intValue;
            }
        }
        if (i13 != 0) {
            C26676b.m136957g("SMLZCloudOnboardingJobStateExt", "Added flag(s): " + m144823i(i13), null, 4, null);
        }
        if (i14 != 0) {
            C26676b.m136957g("SMLZCloudOnboardingJobStateExt", "Removed flag(s): " + m144823i(i14), null, 4, null);
        }
        if (m144837w(i11, i12, 1) && !(m144832r().getValue() instanceof AbstractC28997t.e)) {
            m144832r().mo113433d(new AbstractC28997t.e(18));
        }
        if (m144838x(i11, i12, 1) && !(m144832r().getValue() instanceof AbstractC28997t.a)) {
            m144832r().mo113433d(new AbstractC28997t.a(18));
        }
        if (m144837w(i11, i12, 4) && !(m144831q().getValue() instanceof AbstractC28997t.e)) {
            m144831q().mo113433d(new AbstractC28997t.e(19));
        }
        if (m144838x(i11, i12, 2) || m144838x(i11, i12, 4)) {
            if (m144789A()) {
                if (!(m144831q().getValue() instanceof AbstractC28997t.d)) {
                    m144831q().mo113433d(new AbstractC28997t.d(19));
                }
            } else if (!(m144831q().getValue() instanceof AbstractC28997t.a)) {
                m144831q().mo113433d(new AbstractC28997t.a(19));
            }
        }
        C27257l c27257l = C27257l.f128129a;
        C16862b m139474e = c27257l.m139474e(str);
        if (m144837w(i11, i12, 64)) {
            m139474e.m90060s();
        }
        if ((m144838x(i11, i12, 32) || m144838x(i11, i12, 64)) && !m144793E() && !m144792D()) {
            m139474e.m90059p();
        }
        C16862b m139472b = c27257l.m139472b(str);
        if (m144837w(i11, i12, 16)) {
            m139472b.m90060s();
        }
        if ((m144838x(i11, i12, 8) || m144838x(i11, i12, 16)) && !m144791C() && !m144790B()) {
            m139472b.m90059p();
        }
    }

    /* renamed from: M */
    public static final void m144801M(CoroutineScope coroutineScope, String str, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(str, "userUid");
        AbstractC19074t.m100208f(interfaceC18494a, "onStarted");
        FlowKt.m113270F(FlowKt.m113272H(new k(m144809U(str)), new l(interfaceC18494a, null)), coroutineScope);
    }

    /* renamed from: N */
    public static final void m144802N(CoroutineScope coroutineScope, String str, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(str, "userUid");
        AbstractC19074t.m100208f(interfaceC18505l, "onSuccess");
        FlowKt.m113270F(FlowKt.m113272H(new m(m144809U(str)), new n(interfaceC18505l, str, null)), coroutineScope);
    }

    /* renamed from: O */
    public static final void m144803O(CoroutineScope coroutineScope, String str, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(str, "userUid");
        AbstractC19074t.m100208f(interfaceC18494a, "onStarted");
        FlowKt.m113270F(FlowKt.m113272H(new o(m144810V(str)), new p(interfaceC18494a, null)), coroutineScope);
    }

    /* renamed from: P */
    public static final void m144804P(CoroutineScope coroutineScope, String str, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(str, "userUid");
        AbstractC19074t.m100208f(interfaceC18494a, "onSuccess");
        FlowKt.m113270F(FlowKt.m113272H(new q(m144810V(str)), new r(interfaceC18494a, null)), coroutineScope);
    }

    /* renamed from: Q */
    public static final void m144805Q(CoroutineScope coroutineScope, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(interfaceC18494a, "onCorrupted");
        FlowKt.m113270F(FlowKt.m113272H(new s(m144828n()), new t(interfaceC18494a, null)), coroutineScope);
    }

    /* renamed from: R */
    public static final void m144806R(CoroutineScope coroutineScope, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(interfaceC18509p, "onFailed");
        FlowKt.m113270F(FlowKt.m113272H(new u(m144828n()), new v(interfaceC18509p, null)), coroutineScope);
    }

    /* renamed from: S */
    public static final void m144807S(CoroutineScope coroutineScope, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(coroutineScope, "coroutineScope");
        AbstractC19074t.m100208f(interfaceC18494a, "onSuccess");
        FlowKt.m113270F(FlowKt.m113272H(new w(m144828n()), new x(interfaceC18494a, null)), coroutineScope);
    }

    /* renamed from: T */
    public static final Flow m144808T(String str, InterfaceC28979b interfaceC28979b) {
        AbstractC19074t.m100208f(str, "userUid");
        AbstractC19074t.m100208f(interfaceC28979b, "componentPredication");
        return new z(new Flow[]{m144828n(), m144826l(), m144810V(str), m144809U(str)}, interfaceC28979b);
    }

    /* renamed from: U */
    public static final StateFlow m144809U(String str) {
        AbstractC19074t.m100208f(str, "userUid");
        return C27257l.f128129a.m139472b(str).m90048H();
    }

    /* renamed from: V */
    public static final StateFlow m144810V(String str) {
        AbstractC19074t.m100208f(str, "userUid");
        return C27257l.f128129a.m139474e(str).m90048H();
    }

    /* renamed from: W */
    public static final void m144811W(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f134174c = str;
    }

    /* renamed from: X */
    public static final void m144812X(int i11) {
        AbstractC0924m0.m3411Rq(i11);
    }

    /* renamed from: Y */
    public static final void m144813Y(int i11) {
        AbstractC0924m0.m3382Qq(i11);
    }

    /* renamed from: Z */
    public static final String m144814Z(InterfaceC28990m interfaceC28990m) {
        AbstractC19074t.m100208f(interfaceC28990m, "<this>");
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(interfaceC28990m.mo90080a())}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        if (interfaceC28990m.mo90086g()) {
            return "Uninitialized";
        }
        if (interfaceC28990m.mo90082c()) {
            return "Start";
        }
        if (interfaceC28990m.isRunning()) {
            return "Progressing(" + format + ")";
        }
        if (interfaceC28990m.mo90083d()) {
            return "Paused(reason=" + interfaceC28990m.mo90084e() + ")";
        }
        if (interfaceC28990m.mo90081b()) {
            return "RuntimeError";
        }
        if (interfaceC28990m.mo90087h()) {
            return "Success";
        }
        return "Unknown(jobId=" + interfaceC28990m.mo90085f() + ", currentProgress=" + format + ")";
    }

    /* renamed from: b */
    public static final /* synthetic */ MutableStateFlow m144816b() {
        return m144831q();
    }

    /* renamed from: c */
    public static final /* synthetic */ MutableStateFlow m144817c() {
        return m144832r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final AbstractC28981d m144818d(int i11, InterfaceC28990m... interfaceC28990mArr) {
        AbstractC28981d cVar;
        if (m144836v(interfaceC28990mArr)) {
            return AbstractC28981d.f.f134110d;
        }
        if (m144834t(interfaceC28990mArr)) {
            cVar = new AbstractC28981d.d(i11, interfaceC28990mArr);
        } else if (m144833s(interfaceC28990mArr)) {
            cVar = new AbstractC28981d.b(i11, interfaceC28990mArr);
        } else if (m144835u(interfaceC28990mArr)) {
            cVar = new AbstractC28981d.e(i11, interfaceC28990mArr);
        } else {
            EnumC28993p m144819e = m144819e(interfaceC28990mArr);
            if (m144819e != null) {
                return new AbstractC28981d.a(i11, m144819e, interfaceC28990mArr);
            }
            cVar = new AbstractC28981d.c(i11, interfaceC28990mArr);
        }
        return cVar;
    }

    /* renamed from: e */
    public static final EnumC28993p m144819e(InterfaceC28990m[] interfaceC28990mArr) {
        InterfaceC28990m interfaceC28990m;
        AbstractC19074t.m100208f(interfaceC28990mArr, "states");
        int length = interfaceC28990mArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                interfaceC28990m = interfaceC28990mArr[i11];
                if (interfaceC28990m.mo90084e() != null) {
                    break;
                }
                i11++;
            } else {
                interfaceC28990m = null;
                break;
            }
        }
        if (interfaceC28990m == null) {
            return null;
        }
        return interfaceC28990m.mo90084e();
    }

    /* renamed from: f */
    public static final int m144820f(List list) {
        int i11;
        AbstractC19074t.m100208f(list, "features");
        Iterator it = list.iterator();
        int i12 = 65536;
        while (it.hasNext()) {
            int i13 = a.f134179a[((EnumC24251b) it.next()).ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        i11 = 7;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i11 = 96;
                }
            } else {
                i11 = 24;
            }
            i12 |= i11;
        }
        return i12;
    }

    /* renamed from: g */
    public static final int m144821g() {
        int i11;
        Iterator it = C24252c.f117152a.m126597c().iterator();
        int i12 = 65536;
        while (it.hasNext()) {
            int i13 = a.f134179a[((EnumC24251b) it.next()).ordinal()];
            if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 == 3) {
                        i11 = 5;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    i11 = 64;
                }
            } else {
                i11 = 16;
            }
            i12 |= i11;
        }
        return i12;
    }

    /* renamed from: h */
    public static final int m144822h() {
        return m144820f(C24252c.f117152a.m126597c());
    }

    /* renamed from: i */
    public static final String m144823i(int i11) {
        String m131214n0;
        Integer[] numArr = f134172a;
        ArrayList arrayList = new ArrayList();
        for (Integer num : numArr) {
            if ((num.intValue() & i11) != 0) {
                arrayList.add(num);
            }
        }
        m131214n0 = AbstractC25332a0.m131214n0(arrayList, null, null, null, 0, null, d.f134184q, 31, null);
        return m131214n0;
    }

    /* renamed from: j */
    public static final String m144824j(InterfaceC28990m interfaceC28990m) {
        AbstractC19074t.m100208f(interfaceC28990m, "<this>");
        int mo90085f = interfaceC28990m.mo90085f();
        if (mo90085f != 0) {
            if (mo90085f != 1) {
                if (mo90085f != 2) {
                    if (mo90085f != 3) {
                        return "-";
                    }
                    return "CLOUD_MEDIA";
                }
                return "MY_CLOUD";
            }
            return "BACKUP";
        }
        return "RESTORE";
    }

    /* renamed from: k */
    public static final String m144825k() {
        return f134174c;
    }

    /* renamed from: l */
    public static final StateFlow m144826l() {
        return (StateFlow) f134177f.getValue();
    }

    /* renamed from: m */
    public static final int m144827m() {
        return AbstractC0924m0.m3247M7();
    }

    /* renamed from: n */
    public static final StateFlow m144828n() {
        return (StateFlow) f134178g.getValue();
    }

    /* renamed from: o */
    public static final int m144829o() {
        return AbstractC0924m0.m3218L7();
    }

    /* renamed from: p */
    public static final C29234i m144830p() {
        return f134173b;
    }

    /* renamed from: q */
    private static final MutableStateFlow m144831q() {
        return (MutableStateFlow) f134175d.getValue();
    }

    /* renamed from: r */
    private static final MutableStateFlow m144832r() {
        return (MutableStateFlow) f134176e.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:            return true;     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m144833s(InterfaceC28990m[] interfaceC28990mArr) {
        AbstractC19074t.m100208f(interfaceC28990mArr, "states");
        if (m144836v(interfaceC28990mArr) || m144834t(interfaceC28990mArr) || m144835u(interfaceC28990mArr)) {
            return false;
        }
        int length = interfaceC28990mArr.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                if (interfaceC28990mArr[i11].isRunning()) {
                    break;
                }
                i11++;
            } else {
                for (InterfaceC28990m interfaceC28990m : interfaceC28990mArr) {
                    if (interfaceC28990m.mo90083d() || interfaceC28990m.mo90081b()) {
                        return false;
                    }
                }
            }
        }
    }

    /* renamed from: t */
    public static final boolean m144834t(InterfaceC28990m[] interfaceC28990mArr) {
        AbstractC19074t.m100208f(interfaceC28990mArr, "states");
        for (InterfaceC28990m interfaceC28990m : interfaceC28990mArr) {
            if (!interfaceC28990m.mo90082c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: u */
    public static final boolean m144835u(InterfaceC28990m[] interfaceC28990mArr) {
        AbstractC19074t.m100208f(interfaceC28990mArr, "states");
        for (InterfaceC28990m interfaceC28990m : interfaceC28990mArr) {
            if (!interfaceC28990m.mo90087h()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public static final boolean m144836v(InterfaceC28990m[] interfaceC28990mArr) {
        AbstractC19074t.m100208f(interfaceC28990mArr, "states");
        for (InterfaceC28990m interfaceC28990m : interfaceC28990mArr) {
            if (!interfaceC28990m.mo90086g()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    private static final boolean m144837w(int i11, int i12, int i13) {
        return (i11 & i13) == 0 && (i12 & i13) != 0;
    }

    /* renamed from: x */
    private static final boolean m144838x(int i11, int i12, int i13) {
        return (i11 & i13) != 0 && (i12 & i13) == 0;
    }

    /* renamed from: y */
    public static final boolean m144839y() {
        return m144796H(m144821g());
    }

    /* renamed from: z */
    public static final boolean m144840z() {
        return m144796H(4);
    }
}

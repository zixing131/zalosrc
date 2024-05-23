package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharingStarted;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", m145345f = "Share.kt", m145346l = {214, 218, 219, 225}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__ShareKt$launchSharing$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106856t;

    /* renamed from: u */
    final /* synthetic */ SharingStarted f106857u;

    /* renamed from: v */
    final /* synthetic */ Flow f106858v;

    /* renamed from: w */
    final /* synthetic */ MutableSharedFlow f106859w;

    /* renamed from: x */
    final /* synthetic */ Object f106860x;

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", m145345f = "Share.kt", m145346l = {}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218281 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f106861t;

        /* renamed from: u */
        /* synthetic */ int f106862u;

        C218281(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C218281 c218281 = new C218281(continuation);
            c218281.f106862u = ((Number) obj).intValue();
            return c218281;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            boolean z11;
            AbstractC28298d.m142578e();
            if (this.f106861t == 0) {
                AbstractC24862s.m129228b(obj);
                if (this.f106862u > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return AbstractC29094b.m145339a(z11);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            return m113397r(((Number) obj).intValue(), (Continuation) obj2);
        }

        /* renamed from: r */
        public final Object m113397r(int i11, Continuation continuation) {
            return ((C218281) mo238a(Integer.valueOf(i11), continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", m145345f = "Share.kt", m145346l = {227}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 */
    /* loaded from: classes7.dex */
    public static final class C218292 extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f106863t;

        /* renamed from: u */
        /* synthetic */ Object f106864u;

        /* renamed from: v */
        final /* synthetic */ Flow f106865v;

        /* renamed from: w */
        final /* synthetic */ MutableSharedFlow f106866w;

        /* renamed from: x */
        final /* synthetic */ Object f106867x;

        /* renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        /* loaded from: classes7.dex */
        public /* synthetic */ class WhenMappings {

            /* renamed from: a */
            public static final /* synthetic */ int[] f106868a;

            static {
                int[] iArr = new int[SharingCommand.values().length];
                try {
                    iArr[SharingCommand.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SharingCommand.STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SharingCommand.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f106868a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C218292(Flow flow, MutableSharedFlow mutableSharedFlow, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f106865v = flow;
            this.f106866w = mutableSharedFlow;
            this.f106867x = obj;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            C218292 c218292 = new C218292(this.f106865v, this.f106866w, this.f106867x, continuation);
            c218292.f106864u = obj;
            return c218292;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f106863t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                int i12 = WhenMappings.f106868a[((SharingCommand) this.f106864u).ordinal()];
                if (i12 != 1) {
                    if (i12 == 3) {
                        Object obj2 = this.f106867x;
                        if (obj2 == SharedFlowKt.f107129a) {
                            this.f106866w.mo113435l();
                        } else {
                            this.f106866w.mo113433d(obj2);
                        }
                    }
                } else {
                    Flow flow = this.f106865v;
                    MutableSharedFlow mutableSharedFlow = this.f106866w;
                    this.f106863t = 1;
                    if (flow.mo97893a(mutableSharedFlow, this) == m142578e) {
                        return m142578e;
                    }
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(SharingCommand sharingCommand, Continuation continuation) {
            return ((C218292) mo238a(sharingCommand, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharing$1(SharingStarted sharingStarted, Flow flow, MutableSharedFlow mutableSharedFlow, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f106857u = sharingStarted;
        this.f106858v = flow;
        this.f106859w = mutableSharedFlow;
        this.f106860x = obj;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        return new FlowKt__ShareKt$launchSharing$1(this.f106857u, this.f106858v, this.f106859w, this.f106860x, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068 A[RETURN] */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        Flow flow;
        MutableSharedFlow mutableSharedFlow;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106856t;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3 && i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    flow = this.f106858v;
                    mutableSharedFlow = this.f106859w;
                    this.f106856t = 3;
                    if (flow.mo97893a(mutableSharedFlow, this) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
            }
            AbstractC24862s.m129228b(obj);
            return C24848g0.f119245a;
        }
        AbstractC24862s.m129228b(obj);
        SharingStarted sharingStarted = this.f106857u;
        SharingStarted.Companion companion = SharingStarted.f107140a;
        if (sharingStarted == companion.m113492c()) {
            Flow flow2 = this.f106858v;
            MutableSharedFlow mutableSharedFlow2 = this.f106859w;
            this.f106856t = 1;
            if (flow2.mo97893a(mutableSharedFlow2, this) == m142578e) {
                return m142578e;
            }
        } else if (this.f106857u == companion.m113493d()) {
            StateFlow m113434h = this.f106859w.m113434h();
            C218281 c218281 = new C218281(null);
            this.f106856t = 2;
            if (FlowKt.m113303u(m113434h, c218281, this) == m142578e) {
                return m142578e;
            }
            flow = this.f106858v;
            mutableSharedFlow = this.f106859w;
            this.f106856t = 3;
            if (flow.mo97893a(mutableSharedFlow, this) == m142578e) {
            }
        } else {
            Flow m113298p = FlowKt.m113298p(this.f106857u.mo113489a(this.f106859w.m113434h()));
            C218292 c218292 = new C218292(this.f106858v, this.f106859w, this.f106860x, null);
            this.f106856t = 4;
            if (FlowKt.m113292j(m113298p, c218292, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FlowKt__ShareKt$launchSharing$1) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}

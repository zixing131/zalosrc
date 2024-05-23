package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DelayKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", m145345f = "SharingStarted.kt", m145346l = {178, 180, 182, 183, 185}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class StartedWhileSubscribed$command$1 extends AbstractC29104l implements InterfaceC18510q {

    /* renamed from: t */
    int f107154t;

    /* renamed from: u */
    private /* synthetic */ Object f107155u;

    /* renamed from: v */
    /* synthetic */ int f107156v;

    /* renamed from: w */
    final /* synthetic */ StartedWhileSubscribed f107157w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartedWhileSubscribed$command$1(StartedWhileSubscribed startedWhileSubscribed, Continuation continuation) {
        super(3, continuation);
        this.f107157w = startedWhileSubscribed;
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: Hr */
    public /* bridge */ /* synthetic */ Object mo45599Hr(Object obj, Object obj2, Object obj3) {
        return m113498r((FlowCollector) obj, ((Number) obj2).intValue(), (Continuation) obj3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        FlowCollector flowCollector;
        long j11;
        long j12;
        long j13;
        SharingCommand sharingCommand;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107154t;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            flowCollector = (FlowCollector) this.f107155u;
                            AbstractC24862s.m129228b(obj);
                            sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                            this.f107155u = null;
                            this.f107154t = 5;
                            if (flowCollector.mo12109b(sharingCommand, this) == m142578e) {
                                return m142578e;
                            }
                            return C24848g0.f119245a;
                        }
                    } else {
                        flowCollector = (FlowCollector) this.f107155u;
                        AbstractC24862s.m129228b(obj);
                        j13 = this.f107157w.f107153c;
                        this.f107155u = flowCollector;
                        this.f107154t = 4;
                        if (DelayKt.m112666b(j13, this) == m142578e) {
                            return m142578e;
                        }
                        sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                        this.f107155u = null;
                        this.f107154t = 5;
                        if (flowCollector.mo12109b(sharingCommand, this) == m142578e) {
                        }
                        return C24848g0.f119245a;
                    }
                } else {
                    flowCollector = (FlowCollector) this.f107155u;
                    AbstractC24862s.m129228b(obj);
                    j12 = this.f107157w.f107153c;
                    if (j12 > 0) {
                        SharingCommand sharingCommand2 = SharingCommand.STOP;
                        this.f107155u = flowCollector;
                        this.f107154t = 3;
                        if (flowCollector.mo12109b(sharingCommand2, this) == m142578e) {
                            return m142578e;
                        }
                        j13 = this.f107157w.f107153c;
                        this.f107155u = flowCollector;
                        this.f107154t = 4;
                        if (DelayKt.m112666b(j13, this) == m142578e) {
                        }
                    }
                    sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
                    this.f107155u = null;
                    this.f107154t = 5;
                    if (flowCollector.mo12109b(sharingCommand, this) == m142578e) {
                    }
                    return C24848g0.f119245a;
                }
            }
            AbstractC24862s.m129228b(obj);
            return C24848g0.f119245a;
        }
        AbstractC24862s.m129228b(obj);
        flowCollector = (FlowCollector) this.f107155u;
        if (this.f107156v <= 0) {
            j11 = this.f107157w.f107152b;
            this.f107155u = flowCollector;
            this.f107154t = 2;
            if (DelayKt.m112666b(j11, this) == m142578e) {
                return m142578e;
            }
            j12 = this.f107157w.f107153c;
            if (j12 > 0) {
            }
            sharingCommand = SharingCommand.STOP_AND_RESET_REPLAY_CACHE;
            this.f107155u = null;
            this.f107154t = 5;
            if (flowCollector.mo12109b(sharingCommand, this) == m142578e) {
            }
            return C24848g0.f119245a;
        }
        SharingCommand sharingCommand3 = SharingCommand.START;
        this.f107154t = 1;
        if (flowCollector.mo12109b(sharingCommand3, this) == m142578e) {
            return m142578e;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: r */
    public final Object m113498r(FlowCollector flowCollector, int i11, Continuation continuation) {
        StartedWhileSubscribed$command$1 startedWhileSubscribed$command$1 = new StartedWhileSubscribed$command$1(this.f107157w, continuation);
        startedWhileSubscribed$command$1.f107155u = flowCollector;
        startedWhileSubscribed$command$1.f107156v = i11;
        return startedWhileSubscribed$command$1.mo239o(C24848g0.f119245a);
    }
}

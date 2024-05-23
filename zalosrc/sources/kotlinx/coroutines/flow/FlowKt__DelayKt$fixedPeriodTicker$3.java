package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProducerScope;
import pm0.C24848g0;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3", m145345f = "Delay.kt", m145346l = {313, 315, 316}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FlowKt__DelayKt$fixedPeriodTicker$3 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106558t;

    /* renamed from: u */
    private /* synthetic */ Object f106559u;

    /* renamed from: v */
    final /* synthetic */ long f106560v;

    /* renamed from: w */
    final /* synthetic */ long f106561w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$fixedPeriodTicker$3(long j11, long j12, Continuation continuation) {
        super(2, continuation);
        this.f106560v = j11;
        this.f106561w = j12;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__DelayKt$fixedPeriodTicker$3 flowKt__DelayKt$fixedPeriodTicker$3 = new FlowKt__DelayKt$fixedPeriodTicker$3(this.f106560v, this.f106561w, continuation);
        flowKt__DelayKt$fixedPeriodTicker$3.f106559u = obj;
        return flowKt__DelayKt$fixedPeriodTicker$3;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005b -> B:12:0x0040). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo239o(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = vm0.AbstractC28296b.m142573e()
            int r1 = r7.f106558t
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L11
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
        L11:
            java.lang.Object r1 = r7.f106559u
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            pm0.AbstractC24862s.m129228b(r8)
            goto L3f
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L21:
            java.lang.Object r1 = r7.f106559u
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            pm0.AbstractC24862s.m129228b(r8)
            r8 = r7
            goto L51
        L2a:
            pm0.AbstractC24862s.m129228b(r8)
            java.lang.Object r8 = r7.f106559u
            r1 = r8
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            long r5 = r7.f106560v
            r7.f106559u = r1
            r7.f106558t = r4
            java.lang.Object r8 = kotlinx.coroutines.DelayKt.m112666b(r5, r7)
            if (r8 != r0) goto L3f
            return r0
        L3f:
            r8 = r7
        L40:
            kotlinx.coroutines.channels.SendChannel r4 = r1.mo112918q()
            pm0.g0 r5 = pm0.C24848g0.f119245a
            r8.f106559u = r1
            r8.f106558t = r3
            java.lang.Object r4 = r4.mo112908S(r5, r8)
            if (r4 != r0) goto L51
            return r0
        L51:
            long r4 = r8.f106561w
            r8.f106559u = r1
            r8.f106558t = r2
            java.lang.Object r4 = kotlinx.coroutines.DelayKt.m112666b(r4, r8)
            if (r4 != r0) goto L40
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3.mo239o(java.lang.Object):java.lang.Object");
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((FlowKt__DelayKt$fixedPeriodTicker$3) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}

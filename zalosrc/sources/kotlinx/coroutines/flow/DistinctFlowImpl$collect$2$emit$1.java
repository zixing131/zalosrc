package kotlinx.coroutines.flow;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m145345f = "Distinct.kt", m145346l = {ZVideoUtilMetadata.FF_PROFILE_H264_MAIN}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class DistinctFlowImpl$collect$2$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    /* synthetic */ Object f106426s;

    /* renamed from: t */
    final /* synthetic */ DistinctFlowImpl$collect$2 f106427t;

    /* renamed from: u */
    int f106428u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistinctFlowImpl$collect$2$emit$1(DistinctFlowImpl$collect$2 distinctFlowImpl$collect$2, Continuation continuation) {
        super(continuation);
        this.f106427t = distinctFlowImpl$collect$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106426s = obj;
        this.f106428u |= Integer.MIN_VALUE;
        return this.f106427t.mo12109b(null, this);
    }
}

package kotlinx.coroutines.flow;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", m145345f = "Transform.kt", m145346l = {109, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_10}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$runningFold$1$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106966s;

    /* renamed from: t */
    Object f106967t;

    /* renamed from: u */
    /* synthetic */ Object f106968u;

    /* renamed from: v */
    final /* synthetic */ FlowKt__TransformKt$runningFold$1$1 f106969v;

    /* renamed from: w */
    int f106970w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__TransformKt$runningFold$1$1$emit$1(FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$1, Continuation continuation) {
        super(continuation);
        this.f106969v = flowKt__TransformKt$runningFold$1$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106968u = obj;
        this.f106970w |= Integer.MIN_VALUE;
        return this.f106969v.mo12109b(null, this);
    }
}

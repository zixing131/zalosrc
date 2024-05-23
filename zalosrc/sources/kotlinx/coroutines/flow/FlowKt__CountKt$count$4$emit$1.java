package kotlinx.coroutines.flow;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__CountKt$count$4", m145345f = "Count.kt", m145346l = {ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class FlowKt__CountKt$count$4$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f106530s;

    /* renamed from: t */
    /* synthetic */ Object f106531t;

    /* renamed from: u */
    final /* synthetic */ FlowKt__CountKt$count$4 f106532u;

    /* renamed from: v */
    int f106533v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CountKt$count$4$emit$1(FlowKt__CountKt$count$4 flowKt__CountKt$count$4, Continuation continuation) {
        super(continuation);
        this.f106532u = flowKt__CountKt$count$4;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f106531t = obj;
        this.f106533v |= Integer.MIN_VALUE;
        return this.f106532u.mo12109b(null, this);
    }
}

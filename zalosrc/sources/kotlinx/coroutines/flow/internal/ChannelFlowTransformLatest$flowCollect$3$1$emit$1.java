package kotlinx.coroutines.flow.internal;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m145345f = "Merge.kt", m145346l = {ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f107234s;

    /* renamed from: t */
    Object f107235t;

    /* renamed from: u */
    Object f107236u;

    /* renamed from: v */
    /* synthetic */ Object f107237v;

    /* renamed from: w */
    final /* synthetic */ ChannelFlowTransformLatest$flowCollect$3.C218631 f107238w;

    /* renamed from: x */
    int f107239x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(ChannelFlowTransformLatest$flowCollect$3.C218631 c218631, Continuation continuation) {
        super(continuation);
        this.f107238w = c218631;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107237v = obj;
        this.f107239x |= Integer.MIN_VALUE;
        return this.f107238w.mo12109b(null, this);
    }
}

package kotlinx.coroutines.flow.internal;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import kotlin.coroutines.Continuation;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", m145345f = "Merge.kt", m145346l = {ZVideoUtilMetadata.FF_PROFILE_H264_BASELINE}, m145347m = "emit")
/* loaded from: classes7.dex */
public final class ChannelFlowMerge$collectTo$2$emit$1 extends AbstractC29096d {

    /* renamed from: s */
    Object f107212s;

    /* renamed from: t */
    Object f107213t;

    /* renamed from: u */
    /* synthetic */ Object f107214u;

    /* renamed from: v */
    final /* synthetic */ ChannelFlowMerge$collectTo$2 f107215v;

    /* renamed from: w */
    int f107216w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelFlowMerge$collectTo$2$emit$1(ChannelFlowMerge$collectTo$2 channelFlowMerge$collectTo$2, Continuation continuation) {
        super(continuation);
        this.f107215v = channelFlowMerge$collectTo$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        this.f107214u = obj;
        this.f107216w |= Integer.MIN_VALUE;
        return this.f107215v.mo12109b(null, this);
    }
}

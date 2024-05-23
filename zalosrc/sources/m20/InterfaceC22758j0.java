package m20;

import com.zing.zalo.shortvideo.data.model.C9440a;
import com.zing.zalo.shortvideo.data.model.Channel;
import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.model.Section;
import com.zing.zalo.shortvideo.data.remote.ws.call.LiveChanelStats;
import com.zing.zalo.shortvideo.data.remote.ws.response.GetCommentLiveRes;
import com.zing.zalo.shortvideo.data.remote.ws.response.InteractEventResponse;
import java.util.List;
import p10.EnumC24601e;

/* renamed from: m20.j0 */
/* loaded from: classes5.dex */
public interface InterfaceC22758j0 extends InterfaceC22717a {
    /* renamed from: Eg */
    void mo54461Eg(boolean z11, Channel channel, Object obj);

    /* renamed from: Le */
    void mo54462Le(String str, String str2);

    /* renamed from: Mk */
    void mo54463Mk(String str);

    /* renamed from: Pg */
    void mo54464Pg(String str, InteractEventResponse.InteractItem interactItem);

    /* renamed from: Sz */
    void mo54465Sz(String str, String str2);

    /* renamed from: W0 */
    void mo54466W0(boolean z11);

    /* renamed from: Xo */
    void mo54467Xo(String str, Long l11);

    /* renamed from: YB */
    void mo54468YB(String str, Boolean bool, Boolean bool2);

    /* renamed from: ZD */
    void mo54469ZD(List list);

    /* renamed from: a8 */
    void mo54470a8(String str, String str2, int i11);

    /* renamed from: aB */
    void mo54471aB(String str, InteractEventResponse.InteractItem interactItem);

    /* renamed from: b */
    void mo54472b(boolean z11);

    /* renamed from: cp */
    void mo54473cp(LivestreamData livestreamData);

    /* renamed from: d */
    void mo54474d(Throwable th2);

    /* renamed from: dy */
    void mo54475dy(String str, long j11, long j12);

    /* renamed from: e5 */
    void mo54476e5(Section section);

    /* renamed from: ec */
    void mo54477ec(String str, List list);

    /* renamed from: gs */
    void mo54478gs(String str);

    /* renamed from: ho */
    void mo54479ho(String str, List list);

    /* renamed from: sg */
    void mo54481sg(LiveChanelStats liveChanelStats);

    /* renamed from: xD */
    C9440a mo54482xD(GetCommentLiveRes.CommentData commentData);

    /* renamed from: y7 */
    void mo54484y7(String str, EnumC24601e enumC24601e, Long l11, Long l12);
}

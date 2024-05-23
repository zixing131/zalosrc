package nf;

import com.zing.zalo.media.pojo.VideoBlendingParam;
import fn0.AbstractC19074t;
import me0.AbstractC23041d2;
import p493rt.C25977a;
import p559uv.C27373c;
import p679yf.C30923c;

/* renamed from: nf.g */
/* loaded from: classes3.dex */
public abstract class AbstractC23738g {
    /* renamed from: a */
    public static final C30923c m124100a(C25977a c25977a, C27373c c27373c, VideoBlendingParam videoBlendingParam) {
        AbstractC19074t.m100208f(c25977a, "outputConfig");
        AbstractC19074t.m100208f(c27373c, "inputVideoInfo");
        AbstractC19074t.m100208f(videoBlendingParam, "videoBlendingParam");
        return new C30923c(c25977a.f123940a, c25977a.f123941b, c27373c.m140265s(), videoBlendingParam.f48252D, 1, true);
    }

    /* renamed from: b */
    public static final boolean m124101b(int i11) {
        return i11 == 0;
    }

    /* renamed from: c */
    public static final boolean m124102c(VideoBlendingParam videoBlendingParam) {
        String str;
        AbstractC19074t.m100208f(videoBlendingParam, "videoBlendingParam");
        if (videoBlendingParam.f48257I && (str = videoBlendingParam.f48256H) != null && str.length() != 0 && !AbstractC23041d2.m118194A(videoBlendingParam.f48256H)) {
            return true;
        }
        return false;
    }
}

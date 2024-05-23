package b10;

import com.zing.zalo.shortvideo.data.model.LivestreamData;
import com.zing.zalo.shortvideo.data.utils.AbstractC9464a;
import fn0.AbstractC19074t;
import p10.EnumC24601e;

/* renamed from: b10.g */
/* loaded from: classes5.dex */
public abstract class AbstractC2488g {
    /* renamed from: a */
    public static final boolean m12571a(LivestreamData livestreamData) {
        if (livestreamData == null) {
            return false;
        }
        if (livestreamData.m51029q() != EnumC24601e.f118377v.m128090c() && livestreamData.m51029q() != EnumC24601e.f118373r.m128090c()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m12572b(LivestreamData livestreamData) {
        if (livestreamData == null) {
            return false;
        }
        return AbstractC9464a.m51719b(livestreamData.m51008a(), 4L);
    }

    /* renamed from: c */
    public static final boolean m12573c(LivestreamData livestreamData) {
        if (livestreamData == null) {
            return false;
        }
        return AbstractC19074t.m100204b(livestreamData.m50987B(), Boolean.TRUE);
    }
}

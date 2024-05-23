package p10;

import com.zing.zalo.shortvideo.data.remote.ws.response.WsRawResponse;

/* renamed from: p10.k */
/* loaded from: classes5.dex */
public abstract class AbstractC24607k {
    /* renamed from: a */
    public static final boolean m128098a(WsRawResponse wsRawResponse) {
        Integer m51707b;
        if (wsRawResponse != null && (m51707b = wsRawResponse.m51707b()) != null && m51707b.intValue() == 0) {
            return true;
        }
        return false;
    }
}

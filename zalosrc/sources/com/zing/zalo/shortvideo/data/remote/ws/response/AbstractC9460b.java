package com.zing.zalo.shortvideo.data.remote.ws.response;

import java.util.List;

/* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.b */
/* loaded from: classes5.dex */
public abstract class AbstractC9460b {
    /* renamed from: a */
    public static final boolean m51710a(GetCommentLiveRes getCommentLiveRes) {
        List m51638b;
        if (getCommentLiveRes == null || getCommentLiveRes.m51641e() == null || (m51638b = getCommentLiveRes.m51638b()) == null || m51638b.isEmpty()) {
            return false;
        }
        return true;
    }
}

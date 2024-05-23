package com.zing.zalo.shortvideo.data.remote.ws.response;

import java.util.List;

/* renamed from: com.zing.zalo.shortvideo.data.remote.ws.response.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9459a {
    /* renamed from: a */
    public static final boolean m51709a(EntryEventResponse entryEventResponse) {
        List m51633b;
        if (entryEventResponse == null || entryEventResponse.m51634c() == null || (m51633b = entryEventResponse.m51633b()) == null || m51633b.isEmpty()) {
            return false;
        }
        return true;
    }
}

package com.zing.zalo.shortvideo.data.utils;

/* renamed from: com.zing.zalo.shortvideo.data.utils.a */
/* loaded from: classes5.dex */
public abstract class AbstractC9464a {
    /* renamed from: a */
    public static final boolean m51718a(int i11, int i12) {
        return (i11 & i12) != 0;
    }

    /* renamed from: b */
    public static final boolean m51719b(Long l11, long j11) {
        if (l11 != null && (l11.longValue() & j11) != 0) {
            return true;
        }
        return false;
    }
}

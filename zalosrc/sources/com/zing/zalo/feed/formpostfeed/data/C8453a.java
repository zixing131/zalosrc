package com.zing.zalo.feed.formpostfeed.data;

import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.feed.formpostfeed.data.a */
/* loaded from: classes4.dex */
public final class C8453a {

    /* renamed from: a */
    private TimelineFpfEntrySetting f45913a = TimelineFpfEntrySetting.Companion.m44990a();

    /* renamed from: b */
    private long f45914b;

    /* renamed from: a */
    public final long m44993a() {
        return this.f45914b;
    }

    /* renamed from: b */
    public final TimelineFpfEntrySetting m44994b() {
        return this.f45913a;
    }

    /* renamed from: c */
    public final boolean m44995c() {
        if (this.f45914b < System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m44996d(long j11) {
        this.f45914b = j11;
    }

    /* renamed from: e */
    public final void m44997e(TimelineFpfEntrySetting timelineFpfEntrySetting) {
        AbstractC19074t.m100208f(timelineFpfEntrySetting, "<set-?>");
        this.f45913a = timelineFpfEntrySetting;
    }
}

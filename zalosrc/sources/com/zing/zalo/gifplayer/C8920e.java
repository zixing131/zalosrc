package com.zing.zalo.gifplayer;

import fg0.ThreadFactoryC18928a;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.zing.zalo.gifplayer.e */
/* loaded from: classes4.dex */
final class C8920e extends ScheduledThreadPoolExecutor {

    /* renamed from: p */
    private static volatile C8920e f47727p;

    private C8920e() {
        super(1, new ThreadFactoryC18928a("GifRendering"), new ThreadPoolExecutor.DiscardPolicy());
    }

    /* renamed from: a */
    public static C8920e m47621a() {
        if (f47727p == null) {
            synchronized (C8920e.class) {
                try {
                    if (f47727p == null) {
                        f47727p = new C8920e();
                    }
                } finally {
                }
            }
        }
        return f47727p;
    }
}

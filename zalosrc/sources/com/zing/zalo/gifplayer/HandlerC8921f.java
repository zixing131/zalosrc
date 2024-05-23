package com.zing.zalo.gifplayer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.zing.zalo.gifplayer.f */
/* loaded from: classes4.dex */
public class HandlerC8921f extends Handler {

    /* renamed from: a */
    private final WeakReference f47728a;

    public HandlerC8921f(C8917b c8917b) {
        super(Looper.getMainLooper());
        this.f47728a = new WeakReference(c8917b);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        C8917b c8917b = (C8917b) this.f47728a.get();
        if (c8917b != null && message.what == 1 && c8917b.f47681L != null && c8917b.f47681L.get() != null) {
            ((InterfaceC8919d) c8917b.f47681L.get()).invalidate();
        }
    }
}

package com.zing.zalo.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public final class StartIntentFromBubbleService extends Service {

    /* renamed from: p */
    private final BinderC9355a f49555p = new BinderC9355a();

    /* renamed from: com.zing.zalo.service.StartIntentFromBubbleService$a */
    /* loaded from: classes4.dex */
    public final class BinderC9355a extends Binder {
        public BinderC9355a() {
        }

        /* renamed from: a */
        public final StartIntentFromBubbleService m50449a() {
            return StartIntentFromBubbleService.this;
        }
    }

    /* renamed from: a */
    public final void m50448a(Intent intent) {
        AbstractC19074t.m100208f(intent, "intent");
        getApplicationContext().startActivity(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f49555p;
    }
}

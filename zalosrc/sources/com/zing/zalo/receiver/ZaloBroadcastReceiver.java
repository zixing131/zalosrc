package com.zing.zalo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.zing.zalo.receiver.ZaloBroadcastReceiver;
import fg0.C18929b;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public abstract class ZaloBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static ThreadPoolExecutor f49206a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m49669b(Intent intent, Context context) {
        try {
            mo49670c(context, intent);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public abstract void mo49670c(Context context, Intent intent);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        synchronized (ZaloBroadcastReceiver.class) {
            try {
                if (f49206a == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C18929b("broadcast-receiver"));
                    f49206a = threadPoolExecutor;
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        f49206a.execute(new Runnable() { // from class: az.b
            @Override // java.lang.Runnable
            public final void run() {
                ZaloBroadcastReceiver.this.m49669b(intent, context);
            }
        });
    }
}

package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p256j5.ThreadFactoryC20918b;
import p342m6.AbstractC22888j;
import p342m6.AbstractC22894m;
import p518t5.AbstractC26487e;

/* loaded from: classes2.dex */
public abstract class CloudMessagingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private final ExecutorService f16109a;

    public CloudMessagingReceiver() {
        AbstractC26487e.m136451a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC20918b("firebase-iid-executor"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f16109a = Executors.unconfigurableExecutorService(threadPoolExecutor);
    }

    /* renamed from: e */
    private final int m19156e(Context context, Intent intent) {
        AbstractC22888j m19179c;
        if (intent.getExtras() == null) {
            return ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            m19179c = AbstractC22894m.m117604f(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            m19179c = C4069m.m19175b(context).m19179c(2, bundle);
        }
        int mo19159b = mo19159b(context, new CloudMessage(intent));
        try {
            AbstractC22894m.m117600b(m19179c, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            String valueOf = String.valueOf(e11);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 20);
            sb2.append("Message ack failed: ");
            sb2.append(valueOf);
        }
        return mo19159b;
    }

    /* renamed from: f */
    private final int m19157f(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            mo19160c(context, extras);
            return -1;
        }
        return ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
    }

    /* renamed from: a */
    protected Executor m19158a() {
        return this.f16109a;
    }

    /* renamed from: b */
    protected abstract int mo19159b(Context context, CloudMessage cloudMessage);

    /* renamed from: c */
    protected void mo19160c(Context context, Bundle bundle) {
    }

    /* renamed from: d */
    public final /* synthetic */ void m19161d(Intent intent, Context context, boolean z11, BroadcastReceiver.PendingResult pendingResult) {
        Intent intent2;
        int m19156e;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                intent2 = (Intent) parcelableExtra;
            } else {
                intent2 = null;
            }
            if (intent2 != null) {
                m19156e = m19157f(context, intent2);
            } else {
                m19156e = m19156e(context, intent);
            }
            if (z11) {
                pendingResult.setResultCode(m19156e);
            }
            pendingResult.finish();
        } catch (Throwable th2) {
            pendingResult.finish();
            throw th2;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        m19158a().execute(new Runnable() { // from class: w4.e
            @Override // java.lang.Runnable
            public final void run() {
                CloudMessagingReceiver.this.m19161d(intent, context, isOrderedBroadcast, goAsync);
            }
        });
    }
}

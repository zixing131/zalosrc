package com.zing.zalo.zmedia.view;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.telephony.TelephonyManager;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.Locale;

/* renamed from: com.zing.zalo.zmedia.view.y */
/* loaded from: classes7.dex */
public class HandlerThreadC17390y extends HandlerThread {

    /* renamed from: s */
    static final Object f88612s = new Object();

    /* renamed from: t */
    static HandlerThreadC17390y f88613t;

    /* renamed from: p */
    Context f88614p;

    /* renamed from: q */
    Handler f88615q;

    /* renamed from: r */
    int f88616r;

    /* renamed from: com.zing.zalo.zmedia.view.y$a */
    /* loaded from: classes7.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                HandlerThreadC17390y handlerThreadC17390y = HandlerThreadC17390y.this;
                Context context = handlerThreadC17390y.f88614p;
                if (context != null) {
                    try {
                        int m92535a = handlerThreadC17390y.m92535a(context);
                        HandlerThreadC17390y handlerThreadC17390y2 = HandlerThreadC17390y.this;
                        if (handlerThreadC17390y2.f88616r != m92535a) {
                            handlerThreadC17390y2.f88616r = m92535a;
                            String.format(Locale.US, "Network change type : %d\n", Integer.valueOf(m92535a));
                            ZMediaPlayer.onNetworkChange(HandlerThreadC17390y.this.f88616r);
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                } else {
                    return;
                }
            }
            if (hasMessages(1)) {
                removeMessages(1);
            }
            sendEmptyMessageDelayed(1, 1000L);
        }
    }

    private HandlerThreadC17390y() {
        super("Z:ZNetworkCheckHandlerThread");
        this.f88616r = -1;
        start();
    }

    /* renamed from: b */
    public static HandlerThreadC17390y m92532b() {
        synchronized (f88612s) {
            try {
                if (f88613t == null) {
                    f88613t = new HandlerThreadC17390y();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f88613t;
    }

    /* renamed from: c */
    public static void m92533c(Context context) {
        if (m92532b().f88615q != null && m92532b().f88614p == null) {
            m92532b().f88614p = context;
            m92532b().f88615q.sendEmptyMessage(1);
        }
    }

    /* renamed from: d */
    public static void m92534d() {
        if (m92532b().f88615q != null && m92532b().f88614p != null) {
            m92532b().f88615q.removeMessages(1);
            m92532b().f88614p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m92535a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        TelephonyManager telephonyManager;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if ((Build.VERSION.SDK_INT >= 23 && AbstractC1388a.m6959a(context, "android.permission.READ_PHONE_STATE") != 0) || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null) {
                return 0;
            }
            int networkType = telephonyManager.getNetworkType();
            if (networkType != 1) {
                if (networkType != 2) {
                    if (networkType != 4) {
                        if (networkType == 13 || networkType == 15) {
                            return 5;
                        }
                        switch (networkType) {
                            case 7:
                                return 3;
                            case 8:
                            case 9:
                            case 10:
                                return 2;
                        }
                    }
                } else {
                    return 3;
                }
            }
            return 4;
        }
        return 0;
    }

    @Override // android.os.HandlerThread
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        if (getLooper() != null) {
            this.f88615q = new a(getLooper());
        }
    }
}

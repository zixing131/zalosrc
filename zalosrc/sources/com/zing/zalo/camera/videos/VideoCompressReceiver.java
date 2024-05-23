package com.zing.zalo.camera.videos;

import android.content.Context;
import android.content.Intent;
import com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import p248iy.AbstractC20887g;

/* loaded from: classes3.dex */
public final class VideoCompressReceiver extends ZamReceiver {
    /* renamed from: c */
    private final void m39548c(Intent intent) {
        int intExtra = intent.getIntExtra("command", -1);
        String stringExtra = intent.getStringExtra("param");
        long longExtra = intent.getLongExtra("startTime", 0L);
        long longExtra2 = intent.getLongExtra("endTime", 0L);
        long longExtra3 = intent.getLongExtra("executeTime", 0L);
        if (intExtra == -1) {
            AbstractC20110a.f98889a.mo104551d("missing command", new Object[0]);
        } else {
            AbstractC20887g.m109216C(intExtra, stringExtra, longExtra, longExtra2, longExtra3);
        }
    }

    /* renamed from: d */
    private final void m39549d(Intent intent) {
        int intExtra = intent.getIntExtra("cmdCodeQOS", -1);
        String stringExtra = intent.getStringExtra("msg");
        int intExtra2 = intent.getIntExtra("retCode", 0);
        long longExtra = intent.getLongExtra("executeTime", 0L);
        if (intExtra == -1) {
            AbstractC20110a.f98889a.mo104551d("missing cmdCodeQOS", new Object[0]);
        } else {
            AbstractC20887g.m109236n(intExtra, stringExtra, null, intExtra2, longExtra, 0, 36, null);
        }
    }

    /* renamed from: e */
    private final void m39550e(Intent intent) {
        try {
            long longExtra = intent.getLongExtra("current_progress", -1L);
            long longExtra2 = intent.getLongExtra("extra_update_id", -1L);
            int intExtra = intent.getIntExtra("progress_compress", 0);
            if (longExtra != -1 && longExtra2 != -1) {
                C7760a c7760a = C7760a.f41634a;
                c7760a.m39568q(longExtra2, longExtra);
                c7760a.m39569r(longExtra2, intExtra);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: f */
    private final void m39551f(Intent intent) {
        String stringExtra = intent.getStringExtra("extra_log_info");
        if (stringExtra != null && stringExtra.length() != 0) {
            AbstractC20110a.f98889a.m104564x("[VideoCompress]").mo104556o(8, String.valueOf(stringExtra), new Object[0]);
        }
    }

    @Override // com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver, com.zing.zalo.startup.NonBlockingBroadcastReceiver
    /* renamed from: b */
    public void mo39547b(Context context, Intent intent) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(intent, "intent");
        try {
            super.mo39547b(context, intent);
            String action = intent.getAction();
            if (action != null) {
                switch (action.hashCode()) {
                    case -1023719576:
                        if (!action.equals("com.zing.zalo.action.ACTION_WRITE_LOG")) {
                            break;
                        } else {
                            m39551f(intent);
                            break;
                        }
                    case -970690815:
                        if (!action.equals("com.zing.zalo.action.ACTION_LOG_QOS_DETAILS")) {
                            break;
                        } else {
                            m39549d(intent);
                            break;
                        }
                    case -899629071:
                        if (!action.equals("com.zing.zalo.action.ACTION_UPDATE_VIDEO_PROCESSING")) {
                            break;
                        } else {
                            m39550e(intent);
                            break;
                        }
                    case 1795726624:
                        if (!action.equals("com.zing.zalo.action.ACTION_LOG_QOS_FILTER_ACTION_SUCCESS")) {
                            break;
                        } else {
                            m39548c(intent);
                            break;
                        }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}

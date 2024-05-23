package com.zing.zalo.service;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import androidx.core.app.ZaloIntentService;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import ho0.AbstractC20110a;
import p248iy.AbstractC20887g;

/* loaded from: classes.dex */
public class ZaloKeepAliveService extends ZaloIntentService {

    /* renamed from: D */
    private static boolean f49574D = true;

    public ZaloKeepAliveService() {
        super("ZaloKeepAliveService");
    }

    /* renamed from: n */
    public static void m50473n(Context context) {
        try {
            if (!f49574D) {
                return;
            }
            Intent intent = new Intent(context, (Class<?>) ZaloKeepAliveService.class);
            intent.setAction("com.zing.zalo.intent.action.SELF_START_SERVICE");
            JobIntentService.m6610d(context, ZaloKeepAliveService.class, 1000, intent);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    @Override // androidx.core.app.ZaloIntentService
    /* renamed from: l */
    public void mo6631l(int i11) {
        stopSelf(i11);
    }

    @Override // androidx.core.app.ZaloIntentService
    /* renamed from: m */
    protected void mo6632m(Intent intent) {
        if (intent != null) {
            try {
                try {
                    if ("com.zing.zalo.intent.action.KEEP_ALIVE_SERVICE_STARTER".equals(intent.getAction()) && f49574D) {
                        String stringExtra = intent.getStringExtra("extra_wakeup_source_package");
                        String stringExtra2 = intent.getStringExtra("extra_wakeup_source_param");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("saved by: ");
                        sb2.append(stringExtra);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("saved param: ");
                        sb3.append(stringExtra2);
                        AbstractC20887g.m109245w(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM);
                        AbstractC20887g.m109230h(ZMediaPlayer.FFP_PROP_INT64_SELECTED_VIDEO_STREAM, "" + stringExtra + " - " + stringExtra2);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                }
            } finally {
                f49574D = false;
            }
        }
    }
}

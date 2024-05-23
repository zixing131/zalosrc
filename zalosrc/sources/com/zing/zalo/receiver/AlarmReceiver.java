package com.zing.zalo.receiver;

import ag0.C0843s0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.zing.zalo.MainApplication;
import com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver;
import com.zing.zalo.service.ZaloBackgroundService;
import com.zing.zalocore.CoreUtility;
import ee.C18408p;
import gu.AbstractC19601a;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import vg.AbstractC28105j8;

/* loaded from: classes.dex */
public class AlarmReceiver extends ZamReceiver {

    /* renamed from: com.zing.zalo.receiver.AlarmReceiver$a */
    /* loaded from: classes4.dex */
    private static class C9275a extends Thread {

        /* renamed from: p */
        private final Context f49202p;

        public C9275a(Context context) {
            super("Z:AlarmReceiver-StartService");
            this.f49202p = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (!ZaloBackgroundService.m50458i(this.f49202p)) {
                    AbstractC28105j8.m141584f(this.f49202p);
                } else {
                    C0843s0.m2286r();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public AlarmReceiver() {
        MainApplication.Companion.m35498a(null);
    }

    /* renamed from: e */
    public static void m49667e(Context context) {
        try {
            Intent intent = new Intent(context, (Class<?>) AlarmReceiver.class);
            intent.setAction("com.zing.zalo.intent.action.START_ZALO_BACKGROUND_SERVICE");
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, AbstractC19601a.m102571a(134217728));
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            Calendar calendar = Calendar.getInstance();
            calendar.add(14, (int) AbstractC23309i.m121444T4());
            alarmManager.setRepeating(0, calendar.getTimeInMillis(), AbstractC23309i.m121444T4(), broadcast);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.perf.presentation.batterymonitor.appwakeup.ZamReceiver, com.zing.zalo.startup.NonBlockingBroadcastReceiver
    /* renamed from: b */
    public void mo39547b(Context context, Intent intent) {
        super.mo39547b(context, intent);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onNonBlockingReceive:");
        sb2.append(intent.getAction());
        if ("com.zing.zalo.intent.action.START_ZALO_BACKGROUND_SERVICE".equals(intent.getAction())) {
            new C9275a(context).start();
            return;
        }
        if ((!"com.zing.zalo.intent.action.CHECK_KILL_APP".equals(intent.getAction()) || AbstractC23304d.f113333U == -1) && "com.zing.zalo.calendar.PUSH_EVENT_LOCAL_NOTIFICATION".equals(intent.getAction()) && TextUtils.equals(intent.getStringExtra("STR_EXTRA_CURRENT_UID"), CoreUtility.f89233i)) {
            String stringExtra = intent.getStringExtra("CALENDAR_EVENT_DATA_KEY");
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    final JSONObject jSONObject = new JSONObject(stringExtra);
                    C18408p.m97475R(new C18408p.a.InterfaceC32814a() { // from class: az.a
                        @Override // ee.C18408p.a.InterfaceC32814a
                        /* renamed from: a */
                        public final void mo2271a(C18408p c18408p) {
                            c18408p.m97521Z(jSONObject);
                        }
                    });
                } catch (JSONException e11) {
                    e11.printStackTrace();
                }
            }
        }
    }
}

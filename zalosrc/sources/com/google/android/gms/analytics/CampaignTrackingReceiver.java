package com.google.android.gms.analytics;

import ag0.AbstractC0837p0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.zing.zalo.MainApplication;
import com.zing.zalo.p062db.C7962g;
import fh0.AbstractC18942g;
import gu.AbstractC19601a;
import hm0.C20096c;
import ho0.AbstractC20110a;
import im0.AbstractC20626a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import jm0.EnumC21297g;
import jm0.InterfaceC21299i;
import me0.AbstractC23059e9;
import me0.C23055e5;
import mm0.AbstractC23349d;
import org.json.JSONObject;
import p135em.C18489c;
import p609wh.C29037t0;
import p620wt.AbstractC29238m;
import th.AbstractC26684e;

/* loaded from: classes.dex */
public class CampaignTrackingReceiver extends BroadcastReceiver {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.gms.analytics.CampaignTrackingReceiver$a */
    /* loaded from: classes2.dex */
    public class C4018a implements InterfaceC21299i {

        /* renamed from: a */
        final /* synthetic */ Context f15891a;

        C4018a(Context context) {
            this.f15891a = context;
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: c */
        public void mo1342c(C20096c c20096c) {
            AbstractC20110a.m104538g("submitTrackingData: " + c20096c, new Object[0]);
            CampaignTrackingReceiver.m19021g(this.f15891a, 300000L);
        }

        @Override // jm0.InterfaceC21299i
        /* renamed from: f */
        public void mo1343f(JSONObject jSONObject) {
            try {
                AbstractC20110a.m104535d("submitTrackingData: " + jSONObject, new Object[0]);
                File m19018d = CampaignTrackingReceiver.m19018d(this.f15891a);
                if (!m19018d.delete()) {
                    m19018d.deleteOnExit();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static void m19017c(Context context) {
        try {
            File m19018d = m19018d(context);
            if (m19018d.exists() && m19018d.length() > 0) {
                Intent intent = new Intent(context, (Class<?>) CampaignTrackingReceiver.class);
                intent.setAction("com.zing.zalo.service.CHECK_SUBMIT_INSTALL_REFERRER");
                context.sendBroadcast(intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    static File m19018d(Context context) {
        return new File(context.getNoBackupFilesDir(), "zaInstallData");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m19019e(Intent intent, Context context) {
        try {
            String stringExtra = intent.getStringExtra("referrer");
            if (!TextUtils.isEmpty(stringExtra)) {
                FileOutputStream fileOutputStream = new FileOutputStream(m19018d(context));
                fileOutputStream.write(stringExtra.getBytes("utf8"));
                fileOutputStream.close();
                m19017c(context);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m19020f(Context context) {
        try {
            File m19018d = m19018d(context);
            if (m19018d.exists() && m19018d.length() > 0 && m19018d.canWrite()) {
                FileInputStream fileInputStream = new FileInputStream(m19018d);
                String m146001e = AbstractC29238m.m146001e(fileInputStream);
                fileInputStream.close();
                if (m146001e != null) {
                    m19022h(context, m146001e);
                }
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    static void m19021g(Context context, long j11) {
        try {
            Intent intent = new Intent(context, (Class<?>) CampaignTrackingReceiver.class);
            intent.setAction("com.zing.zalo.service.CHECK_SUBMIT_INSTALL_REFERRER");
            PendingIntent broadcast = PendingIntent.getBroadcast(MainApplication.getAppContext(), 0, intent, AbstractC19601a.m102572b(268435456));
            AlarmManager alarmManager = (AlarmManager) MainApplication.getAppContext().getSystemService("alarm");
            if (alarmManager == null) {
                return;
            }
            alarmManager.set(1, System.currentTimeMillis() + j11, broadcast);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void m19022h(Context context, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i11;
        C29037t0 c29037t0 = new C29037t0(new C4018a(context));
        try {
            str2 = String.valueOf(AbstractC23349d.m122766d());
            try {
                str3 = AbstractC23349d.m122767e();
                try {
                    str4 = String.valueOf(AbstractC20626a.m107387c());
                    try {
                        str5 = AbstractC23349d.m122764b();
                    } catch (Exception e11) {
                        e = e11;
                        str5 = "";
                    }
                } catch (Exception e12) {
                    e = e12;
                    str4 = "";
                    str5 = str4;
                    e.printStackTrace();
                    str6 = str5;
                    str7 = "";
                    String str8 = str4;
                    String str9 = str3;
                    c29037t0.m110314j(C18489c.m97849k(C7962g.c.a.QOS_TRK_INSTALL_ZALO_APP_S) + "/trk", "", new String[]{"data", "mnc", "model", "network", "imei", "deviceId", "distributor"}, new String[]{str, str2, str9, str8, str6, str7, ""});
                    if (AbstractC26684e.f126414g) {
                    }
                    if (!C23055e5.m118271f()) {
                    }
                }
            } catch (Exception e13) {
                e = e13;
                str3 = "";
                str4 = str3;
                str5 = str4;
                e.printStackTrace();
                str6 = str5;
                str7 = "";
                String str82 = str4;
                String str92 = str3;
                c29037t0.m110314j(C18489c.m97849k(C7962g.c.a.QOS_TRK_INSTALL_ZALO_APP_S) + "/trk", "", new String[]{"data", "mnc", "model", "network", "imei", "deviceId", "distributor"}, new String[]{str, str2, str92, str82, str6, str7, ""});
                if (AbstractC26684e.f126414g) {
                }
                if (!C23055e5.m118271f()) {
                }
            }
        } catch (Exception e14) {
            e = e14;
            str2 = "";
            str3 = str2;
        }
        try {
            str7 = AbstractC18942g.m99249e();
            str6 = str5;
        } catch (Exception e15) {
            e = e15;
            e.printStackTrace();
            str6 = str5;
            str7 = "";
            String str822 = str4;
            String str922 = str3;
            c29037t0.m110314j(C18489c.m97849k(C7962g.c.a.QOS_TRK_INSTALL_ZALO_APP_S) + "/trk", "", new String[]{"data", "mnc", "model", "network", "imei", "deviceId", "distributor"}, new String[]{str, str2, str922, str822, str6, str7, ""});
            if (AbstractC26684e.f126414g) {
            }
            if (!C23055e5.m118271f()) {
            }
        }
        String str8222 = str4;
        String str9222 = str3;
        c29037t0.m110314j(C18489c.m97849k(C7962g.c.a.QOS_TRK_INSTALL_ZALO_APP_S) + "/trk", "", new String[]{"data", "mnc", "model", "network", "imei", "deviceId", "distributor"}, new String[]{str, str2, str9222, str8222, str6, str7, ""});
        if (AbstractC26684e.f126414g) {
            if (AbstractC23059e9.m118343v()) {
                i11 = 11;
            } else {
                i11 = 1;
            }
            c29037t0.f103775r = i11;
            c29037t0.m110311h0(EnumC21297g.ENCRYPT_PARAMETER);
        }
        if (!C23055e5.m118271f()) {
            c29037t0.mo110303Z();
        } else {
            m19021g(context, 300000L);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        if ("com.android.vending.INSTALL_REFERRER".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("referrer");
            AbstractC20110a.m104535d("campaign: " + stringExtra, new Object[0]);
            if (stringExtra != null) {
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: m4.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        CampaignTrackingReceiver.m19019e(intent, context);
                    }
                });
                return;
            }
            return;
        }
        if ("com.zing.zalo.service.CHECK_SUBMIT_INSTALL_REFERRER".equals(intent.getAction())) {
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: m4.b
                @Override // java.lang.Runnable
                public final void run() {
                    CampaignTrackingReceiver.m19020f(context);
                }
            });
        }
    }
}

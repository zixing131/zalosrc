package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.core.app.AbstractC1364q;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.C4008R;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes2.dex */
public final class v22 extends fd0 {

    /* renamed from: p */
    private final Context f29133p;

    /* renamed from: q */
    private final dt1 f29134q;

    /* renamed from: r */
    private final cl0 f29135r;

    /* renamed from: s */
    private final n22 f29136s;

    /* renamed from: t */
    private final rv2 f29137t;

    public v22(Context context, n22 n22Var, cl0 cl0Var, dt1 dt1Var, rv2 rv2Var) {
        this.f29133p = context;
        this.f29134q = dt1Var;
        this.f29135r = cl0Var;
        this.f29136s = n22Var;
        this.f29137t = rv2Var;
    }

    /* renamed from: I3 */
    public static void m27129I3(Context context, dt1 dt1Var, rv2 rv2Var, n22 n22Var, String str, String str2, Map map) {
        String m21011f;
        String str3 = "online";
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21374s7)).booleanValue()) {
            qv2 m25905b = qv2.m25905b(str2);
            m25905b.m25907a("gqi", str);
            if (true != zzt.zzo().m22947v(context)) {
                str3 = "offline";
            }
            m25905b.m25907a("device_connectivity", str3);
            m25905b.m25907a("event_timestamp", String.valueOf(zzt.zzB().mo105913a()));
            for (Map.Entry entry : map.entrySet()) {
                m25905b.m25907a((String) entry.getKey(), (String) entry.getValue());
            }
            m21011f = rv2Var.mo22195b(m25905b);
        } else {
            ct1 m21542a = dt1Var.m21542a();
            m21542a.m21007b("gqi", str);
            m21542a.m21007b("action", str2);
            if (true != zzt.zzo().m22947v(context)) {
                str3 = "offline";
            }
            m21542a.m21007b("device_connectivity", str3);
            m21542a.m21007b("event_timestamp", String.valueOf(zzt.zzB().mo105913a()));
            for (Map.Entry entry2 : map.entrySet()) {
                m21542a.m21007b((String) entry2.getKey(), (String) entry2.getValue());
            }
            m21011f = m21542a.m21011f();
        }
        n22Var.m24800d(new p22(zzt.zzB().mo105913a(), str, m21011f, 2));
    }

    /* renamed from: Q */
    public static void m27130Q(Context context, dt1 dt1Var, rv2 rv2Var, n22 n22Var, String str, String str2) {
        m27129I3(context, dt1Var, rv2Var, n22Var, str, str2, new HashMap());
    }

    /* renamed from: W4 */
    public static void m27131W4(Activity activity, zzl zzlVar, zzbr zzbrVar, n22 n22Var, dt1 dt1Var, rv2 rv2Var, String str, String str2) {
        String string;
        String string2;
        String string3;
        String string4;
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(activity);
        Resources m22933d = zzt.zzo().m22933d();
        if (m22933d == null) {
            string = "Open ad when you're back online.";
        } else {
            string = m22933d.getString(C4008R.string.offline_opt_in_title);
        }
        AlertDialog.Builder title = zzG.setTitle(string);
        if (m22933d == null) {
            string2 = "We'll send you a notification with a link to the advertiser site.";
        } else {
            string2 = m22933d.getString(C4008R.string.offline_opt_in_message);
        }
        AlertDialog.Builder message = title.setMessage(string2);
        if (m22933d == null) {
            string3 = "OK";
        } else {
            string3 = m22933d.getString(C4008R.string.offline_opt_in_confirm);
        }
        AlertDialog.Builder positiveButton = message.setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.r22

            /* renamed from: q */
            public final /* synthetic */ Activity f27050q;

            /* renamed from: r */
            public final /* synthetic */ rv2 f27051r;

            /* renamed from: s */
            public final /* synthetic */ n22 f27052s;

            /* renamed from: t */
            public final /* synthetic */ String f27053t;

            /* renamed from: u */
            public final /* synthetic */ zzbr f27054u;

            /* renamed from: v */
            public final /* synthetic */ String f27055v;

            /* renamed from: w */
            public final /* synthetic */ Resources f27056w;

            /* renamed from: x */
            public final /* synthetic */ zzl f27057x;

            public /* synthetic */ r22(Activity activity2, rv2 rv2Var2, n22 n22Var2, String str3, zzbr zzbrVar2, String str22, Resources m22933d2, zzl zzlVar2) {
                r2 = activity2;
                r3 = rv2Var2;
                r4 = n22Var2;
                r5 = str3;
                r6 = zzbrVar2;
                r7 = str22;
                r8 = m22933d2;
                r9 = zzlVar2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:            if (r0.zzf(com.google.android.gms.dynamic.BinderC4273d.m19913I3(r10), r14, r13) == false) goto L33;     */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(DialogInterface dialogInterface, int i11) {
                zzl zzlVar2;
                String string5;
                dt1 dt1Var2 = dt1.this;
                Activity activity2 = r2;
                rv2 rv2Var2 = r3;
                n22 n22Var2 = r4;
                String str3 = r5;
                zzbr zzbrVar2 = r6;
                String str4 = r7;
                Resources resources = r8;
                zzl zzlVar3 = r9;
                if (dt1Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "confirm");
                    zzlVar2 = zzlVar3;
                    v22.m27129I3(activity2, dt1Var2, rv2Var2, n22Var2, str3, "dialog_click", hashMap);
                } else {
                    zzlVar2 = zzlVar3;
                }
                try {
                } catch (RemoteException e11) {
                    yk0.zzh("Failed to schedule offline notification poster.", e11);
                }
                n22Var2.m24799c(str3);
                if (dt1Var2 != null) {
                    v22.m27130Q(activity2, dt1Var2, rv2Var2, n22Var2, str3, "offline_notification_worker_not_scheduled");
                }
                zzt.zzp();
                AlertDialog.Builder zzG2 = zzs.zzG(activity2);
                if (resources == null) {
                    string5 = "You'll get a notification with the link when you're back online";
                } else {
                    string5 = resources.getString(C4008R.string.offline_opt_in_confirmation);
                }
                zzG2.setMessage(string5).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.q22
                    public /* synthetic */ q22() {
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        zzl zzlVar4 = zzl.this;
                        if (zzlVar4 != null) {
                            zzlVar4.zzb();
                        }
                    }
                });
                AlertDialog create = zzG2.create();
                create.show();
                Timer timer = new Timer();
                timer.schedule(new u22(create, timer, zzlVar2), 3000L);
            }
        });
        if (m22933d2 == null) {
            string4 = "No thanks";
        } else {
            string4 = m22933d2.getString(C4008R.string.offline_opt_in_decline);
        }
        positiveButton.setNegativeButton(string4, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.s22

            /* renamed from: q */
            public final /* synthetic */ String f27505q;

            /* renamed from: r */
            public final /* synthetic */ dt1 f27506r;

            /* renamed from: s */
            public final /* synthetic */ Activity f27507s;

            /* renamed from: t */
            public final /* synthetic */ rv2 f27508t;

            /* renamed from: u */
            public final /* synthetic */ zzl f27509u;

            public /* synthetic */ s22(String str3, dt1 dt1Var2, Activity activity2, rv2 rv2Var2, zzl zzlVar2) {
                r2 = str3;
                r3 = dt1Var2;
                r4 = activity2;
                r5 = rv2Var2;
                r6 = zzlVar2;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                n22 n22Var2 = n22.this;
                String str3 = r2;
                dt1 dt1Var2 = r3;
                Activity activity2 = r4;
                rv2 rv2Var2 = r5;
                zzl zzlVar2 = r6;
                n22Var2.m24799c(str3);
                if (dt1Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    v22.m27129I3(activity2, dt1Var2, rv2Var2, n22Var2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.t22

            /* renamed from: q */
            public final /* synthetic */ String f28180q;

            /* renamed from: r */
            public final /* synthetic */ dt1 f28181r;

            /* renamed from: s */
            public final /* synthetic */ Activity f28182s;

            /* renamed from: t */
            public final /* synthetic */ rv2 f28183t;

            /* renamed from: u */
            public final /* synthetic */ zzl f28184u;

            public /* synthetic */ t22(String str3, dt1 dt1Var2, Activity activity2, rv2 rv2Var2, zzl zzlVar2) {
                r2 = str3;
                r3 = dt1Var2;
                r4 = activity2;
                r5 = rv2Var2;
                r6 = zzlVar2;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                n22 n22Var2 = n22.this;
                String str3 = r2;
                dt1 dt1Var2 = r3;
                Activity activity2 = r4;
                rv2 rv2Var2 = r5;
                zzl zzlVar2 = r6;
                n22Var2.m24799c(str3);
                if (dt1Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    v22.m27129I3(activity2, dt1Var2, rv2Var2, n22Var2, str3, "dialog_click", hashMap);
                }
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        zzG.create().show();
    }

    /* renamed from: X4 */
    private final void m27132X4(String str, String str2, Map map) {
        m27129I3(this.f29133p, this.f29134q, this.f29137t, this.f29136s, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.gd0
    /* renamed from: Q2 */
    public final void mo21693Q2(InterfaceC4271b interfaceC4271b, String str, String str2) {
        String string;
        String string2;
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        zzt.zzq().zzg(context);
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i11 = q23.f26609a;
        PendingIntent m25632a = q23.m25632a(context, 0, intent, i11 | 1073741824, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent m25632a2 = q23.m25632a(context, 0, intent2, i11 | 1073741824, 0);
        Resources m22933d = zzt.zzo().m22933d();
        AbstractC1364q.f fVar = new AbstractC1364q.f(context, "offline_notification_channel");
        if (m22933d == null) {
            string = "View the ad you saved when you were offline";
        } else {
            string = m22933d.getString(C4008R.string.offline_notification_title);
        }
        AbstractC1364q.f mo6895w = fVar.mo6895w(string);
        if (m22933d == null) {
            string2 = "Tap to open ad";
        } else {
            string2 = m22933d.getString(C4008R.string.offline_notification_text);
        }
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, mo6895w.mo6894v(string2).m6886n(true).m6850B(m25632a2).m6893u(m25632a).m6866S(context.getApplicationInfo().icon).mo6879e());
        m27132X4(str2, "offline_notification_impression", new HashMap());
    }

    @Override // com.google.android.gms.internal.ads.gd0
    /* renamed from: S */
    public final void mo21694S(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (!stringExtra.equals("offline_notification_clicked") && !stringExtra.equals("offline_notification_dismissed")) {
            return;
        }
        String stringExtra2 = intent.getStringExtra("gws_query_id");
        String stringExtra3 = intent.getStringExtra("uri");
        boolean m22947v = zzt.zzo().m22947v(this.f29133p);
        HashMap hashMap = new HashMap();
        char c11 = 2;
        if (stringExtra.equals("offline_notification_clicked")) {
            hashMap.put("offline_notification_action", "offline_notification_clicked");
            if (true == m22947v) {
                c11 = 1;
            }
            hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
            try {
                Context context = this.f29133p;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setData(Uri.parse(stringExtra3));
                }
                launchIntentForPackage.addFlags(268435456);
                context.startActivity(launchIntentForPackage);
                hashMap.put("olaa", "olas");
            } catch (ActivityNotFoundException unused) {
                hashMap.put("olaa", "olaf");
            }
        } else {
            hashMap.put("offline_notification_action", "offline_notification_dismissed");
        }
        m27132X4(stringExtra2, "offline_notification_action", hashMap);
        try {
            SQLiteDatabase writableDatabase = this.f29136s.getWritableDatabase();
            if (c11 == 1) {
                this.f29136s.m24802i(writableDatabase, this.f29135r, stringExtra2);
            } else {
                n22.m24796q(writableDatabase, stringExtra2);
            }
        } catch (SQLiteException e11) {
            yk0.zzg("Failed to get writable offline buffering database: ".concat(e11.toString()));
        }
    }

    @Override // com.google.android.gms.internal.ads.gd0
    public final void zzf() {
        this.f29136s.m24801f(new ju2() { // from class: com.google.android.gms.internal.ads.j22
            public /* synthetic */ j22() {
            }

            @Override // com.google.android.gms.internal.ads.ju2
            public final Object zza(Object obj) {
                n22.m24794b(cl0.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }
}

package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.AbstractC2253u;
import androidx.work.impl.WorkDatabase;
import p535u2.AbstractC26966m;
import p535u2.C26962i;
import p535u2.C26967n;
import p535u2.InterfaceC26964k;
import p565v2.C27457k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes2.dex */
public abstract class AbstractC2159a {

    /* renamed from: a */
    private static final String f9169a = AbstractC2253u.m11897i("Alarms");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemalarm.a$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static void m11597a(AlarmManager alarmManager, int i11, long j11, PendingIntent pendingIntent) {
            alarmManager.setExact(i11, j11, pendingIntent);
        }
    }

    /* renamed from: a */
    public static void m11593a(Context context, WorkDatabase workDatabase, C26967n c26967n) {
        InterfaceC26964k mo11562I = workDatabase.mo11562I();
        C26962i mo138942a = mo11562I.mo138942a(c26967n);
        if (mo138942a != null) {
            m11594b(context, c26967n, mo138942a.f127470c);
            AbstractC2253u.m11895e().mo11898a(f9169a, "Removing SystemIdInfo for workSpecId (" + c26967n + ")");
            mo11562I.mo138943b(c26967n);
        }
    }

    /* renamed from: b */
    private static void m11594b(Context context, C26967n c26967n, int i11) {
        int i12;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent m11599b = C2160b.m11599b(context, c26967n);
        if (Build.VERSION.SDK_INT >= 23) {
            i12 = 603979776;
        } else {
            i12 = 536870912;
        }
        PendingIntent service = PendingIntent.getService(context, i11, m11599b, i12);
        if (service != null && alarmManager != null) {
            AbstractC2253u.m11895e().mo11898a(f9169a, "Cancelling existing alarm with (workSpecId, systemId) (" + c26967n + ", " + i11 + ")");
            alarmManager.cancel(service);
        }
    }

    /* renamed from: c */
    public static void m11595c(Context context, WorkDatabase workDatabase, C26967n c26967n, long j11) {
        InterfaceC26964k mo11562I = workDatabase.mo11562I();
        C26962i mo138942a = mo11562I.mo138942a(c26967n);
        if (mo138942a != null) {
            m11594b(context, c26967n, mo138942a.f127470c);
            m11596d(context, c26967n, mo138942a.f127470c, j11);
        } else {
            int m140498c = new C27457k(workDatabase).m140498c();
            mo11562I.mo138946e(AbstractC26966m.m138953a(c26967n, m140498c));
            m11596d(context, c26967n, m140498c, j11);
        }
    }

    /* renamed from: d */
    private static void m11596d(Context context, C26967n c26967n, int i11, long j11) {
        int i12;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 23) {
            i12 = 201326592;
        } else {
            i12 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i11, C2160b.m11599b(context, c26967n), i12);
        if (alarmManager != null) {
            a.m11597a(alarmManager, 0, j11, service);
        }
    }
}

package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.os.AbstractC1453s;
import androidx.core.util.InterfaceC1479a;
import androidx.work.AbstractC2253u;
import androidx.work.C2138c;
import androidx.work.C2149h0;
import androidx.work.impl.AbstractC2239z;
import androidx.work.impl.C2190f0;
import androidx.work.impl.C2221r0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.C2182m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p535u2.C26976w;
import p535u2.InterfaceC26972s;
import p535u2.InterfaceC26977x;
import p565v2.AbstractC27450f;
import p565v2.AbstractC27467u;
import p565v2.C27466t;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: t */
    private static final String f9339t = AbstractC2253u.m11897i("ForceStopRunnable");

    /* renamed from: u */
    private static final long f9340u = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: p */
    private final Context f9341p;

    /* renamed from: q */
    private final C2221r0 f9342q;

    /* renamed from: r */
    private final C27466t f9343r;

    /* renamed from: s */
    private int f9344s = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        private static final String f9345a = AbstractC2253u.m11897i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                AbstractC2253u.m11895e().mo11904j(f9345a, "Rescheduling alarm that keeps track of force-stops.");
                ForceStopRunnable.m11776g(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C2221r0 c2221r0) {
        this.f9341p = context.getApplicationContext();
        this.f9342q = c2221r0;
        this.f9343r = c2221r0.m11736s();
    }

    /* renamed from: c */
    static Intent m11774c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    /* renamed from: d */
    private static PendingIntent m11775d(Context context, int i11) {
        return PendingIntent.getBroadcast(context, -1, m11774c(context), i11);
    }

    /* renamed from: g */
    static void m11776g(Context context) {
        int i11;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i11 = 167772160;
        } else {
            i11 = 134217728;
        }
        PendingIntent m11775d = m11775d(context, i11);
        long currentTimeMillis = System.currentTimeMillis() + f9340u;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, m11775d);
        }
    }

    /* renamed from: a */
    public boolean m11777a() {
        boolean z11;
        boolean z12;
        if (Build.VERSION.SDK_INT >= 23) {
            z11 = C2182m.m11669i(this.f9341p, this.f9342q.m11740w());
        } else {
            z11 = false;
        }
        WorkDatabase m11740w = this.f9342q.m11740w();
        InterfaceC26977x mo11565L = m11740w.mo11565L();
        InterfaceC26972s mo11564K = m11740w.mo11564K();
        m11740w.m342e();
        try {
            List<C26976w> mo139022x = mo11565L.mo139022x();
            if (mo139022x != null && !mo139022x.isEmpty()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                for (C26976w c26976w : mo139022x) {
                    mo11565L.mo139018t(C2149h0.c.ENQUEUED, c26976w.f127497a);
                    mo11565L.mo139002d(c26976w.f127497a, -512);
                    mo11565L.mo139015q(c26976w.f127497a, -1L);
                }
            }
            mo11564K.mo138964a();
            m11740w.m339E();
            m11740w.m347j();
            if (!z12 && !z11) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            m11740w.m347j();
            throw th2;
        }
    }

    /* renamed from: b */
    public void m11778b() {
        boolean m11777a = m11777a();
        if (m11781h()) {
            AbstractC2253u.m11895e().mo11898a(f9339t, "Rescheduling Workers.");
            this.f9342q.m11743z();
            this.f9342q.m11736s().m140520e(false);
        } else if (m11779e()) {
            AbstractC2253u.m11895e().mo11898a(f9339t, "Application was force-stopped, rescheduling.");
            this.f9342q.m11743z();
            this.f9343r.m140519d(this.f9342q.m11735p().m11470a().mo11468a());
        } else if (m11777a) {
            AbstractC2253u.m11895e().mo11898a(f9339t, "Found unfinished work, scheduling it.");
            AbstractC2239z.m11855h(this.f9342q.m11735p(), this.f9342q.m11740w(), this.f9342q.m11738u());
        }
    }

    /* renamed from: e */
    public boolean m11779e() {
        int i11;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        try {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 31) {
                i11 = 570425344;
            } else {
                i11 = 536870912;
            }
            PendingIntent m11775d = m11775d(this.f9341p, i11);
            if (i12 >= 30) {
                if (m11775d != null) {
                    m11775d.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) this.f9341p.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long m140517a = this.f9343r.m140517a();
                    for (int i13 = 0; i13 < historicalProcessExitReasons.size(); i13++) {
                        ApplicationExitInfo m140489a = AbstractC27450f.m140489a(historicalProcessExitReasons.get(i13));
                        reason = m140489a.getReason();
                        if (reason == 10) {
                            timestamp = m140489a.getTimestamp();
                            if (timestamp >= m140517a) {
                                return true;
                            }
                        }
                    }
                }
            } else if (m11775d == null) {
                m11776g(this.f9341p);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e11) {
            e = e11;
            AbstractC2253u.m11895e().mo11906l(f9339t, "Ignoring exception", e);
            return true;
        } catch (SecurityException e12) {
            e = e12;
            AbstractC2253u.m11895e().mo11906l(f9339t, "Ignoring exception", e);
            return true;
        }
    }

    /* renamed from: f */
    public boolean m11780f() {
        C2138c m11735p = this.f9342q.m11735p();
        if (TextUtils.isEmpty(m11735p.m11472c())) {
            AbstractC2253u.m11895e().mo11898a(f9339t, "The default process name was not specified.");
            return true;
        }
        boolean m140522b = AbstractC27467u.m140522b(this.f9341p, m11735p);
        AbstractC2253u.m11895e().mo11898a(f9339t, "Is default app process = " + m140522b);
        return m140522b;
    }

    /* renamed from: h */
    public boolean m11781h() {
        return this.f9342q.m11736s().m140518b();
    }

    /* renamed from: i */
    public void m11782i(long j11) {
        try {
            Thread.sleep(j11);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i11;
        String str;
        try {
            if (!m11780f()) {
                return;
            }
            while (true) {
                try {
                    C2190f0.m11690d(this.f9341p);
                    AbstractC2253u.m11895e().mo11898a(f9339t, "Performing cleanup operations.");
                    try {
                        m11778b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e11) {
                        i11 = this.f9344s + 1;
                        this.f9344s = i11;
                        if (i11 >= 3) {
                            if (AbstractC1453s.m7370a(this.f9341p)) {
                                str = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
                            } else {
                                str = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            }
                            AbstractC2253u m11895e = AbstractC2253u.m11895e();
                            String str2 = f9339t;
                            m11895e.mo11901d(str2, str, e11);
                            IllegalStateException illegalStateException = new IllegalStateException(str, e11);
                            InterfaceC1479a m11474e = this.f9342q.m11735p().m11474e();
                            if (m11474e != null) {
                                AbstractC2253u.m11895e().mo11899b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                m11474e.accept(illegalStateException);
                            } else {
                                throw illegalStateException;
                            }
                        } else {
                            AbstractC2253u.m11895e().mo11899b(f9339t, "Retrying after " + (i11 * 300), e11);
                            m11782i(((long) this.f9344s) * 300);
                        }
                    }
                    AbstractC2253u.m11895e().mo11899b(f9339t, "Retrying after " + (i11 * 300), e11);
                    m11782i(((long) this.f9344s) * 300);
                } catch (SQLiteException e12) {
                    AbstractC2253u.m11895e().mo11900c(f9339t, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e12);
                    InterfaceC1479a m11474e2 = this.f9342q.m11735p().m11474e();
                    if (m11474e2 != null) {
                        m11474e2.accept(illegalStateException2);
                    } else {
                        throw illegalStateException2;
                    }
                }
            }
        } finally {
            this.f9342q.m11742y();
        }
    }
}

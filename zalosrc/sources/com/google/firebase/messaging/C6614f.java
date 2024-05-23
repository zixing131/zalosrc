package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import androidx.core.app.AbstractC1364q;
import com.google.firebase.messaging.AbstractC6608d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p229i5.AbstractC20295p;
import p342m6.AbstractC22894m;

/* renamed from: com.google.firebase.messaging.f */
/* loaded from: classes3.dex */
class C6614f {

    /* renamed from: a */
    private final ExecutorService f36640a;

    /* renamed from: b */
    private final Context f36641b;

    /* renamed from: c */
    private final C6618g0 f36642c;

    public C6614f(Context context, C6618g0 c6618g0, ExecutorService executorService) {
        this.f36640a = executorService;
        this.f36641b = context;
        this.f36642c = c6618g0;
    }

    /* renamed from: b */
    private boolean m33843b() {
        if (((KeyguardManager) this.f36641b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!AbstractC20295p.m105952f()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f36641b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                if (runningAppProcessInfo.importance != 100) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private void m33844c(AbstractC6608d.a aVar) {
        ((NotificationManager) this.f36641b.getSystemService("notification")).notify(aVar.f36635b, aVar.f36636c, aVar.f36634a.mo6879e());
    }

    /* renamed from: d */
    private C6606c0 m33845d() {
        C6606c0 m33789d = C6606c0.m33789d(this.f36642c.m33877p("gcm.n.image"));
        if (m33789d != null) {
            m33789d.m33793i(this.f36640a);
        }
        return m33789d;
    }

    /* renamed from: e */
    private void m33846e(AbstractC1364q.f fVar, C6606c0 c6606c0) {
        if (c6606c0 == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) AbstractC22894m.m117600b(c6606c0.m33792f(), 5L, TimeUnit.SECONDS);
            fVar.mo6855H(bitmap);
            fVar.m6869V(new AbstractC1364q.c().m6818i(bitmap).m6817h(null));
        } catch (InterruptedException unused) {
            c6606c0.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to download image: ");
            sb2.append(e11.getCause());
        } catch (TimeoutException unused2) {
            c6606c0.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m33847a() {
        if (this.f36642c.m33863a("gcm.n.noui")) {
            return true;
        }
        if (m33843b()) {
            return false;
        }
        C6606c0 m33845d = m33845d();
        AbstractC6608d.a m33798e = AbstractC6608d.m33798e(this.f36641b, this.f36642c);
        m33846e(m33798e.f36634a, m33845d);
        m33844c(m33798e);
        return true;
    }
}

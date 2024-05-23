package au;

import ag0.AbstractC0837p0;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.zing.zalo.C8937j0;
import com.zing.zalo.SensitiveData;
import ho0.AbstractC20110a;
import java.util.concurrent.atomic.AtomicBoolean;
import mm0.AbstractC23350e;

/* renamed from: au.c */
/* loaded from: classes.dex */
public abstract class AbstractC2339c {

    /* renamed from: a */
    private static String f9837a;

    /* renamed from: b */
    public static String m12298b(final Context context, final SensitiveData sensitiveData) {
        try {
            final long currentTimeMillis = System.currentTimeMillis();
            String str = f9837a;
            if (str != null) {
                return str;
            }
            AbstractC20110a.m104542k(3, "getAdvertisingId", new Object[0]);
            if (Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
                m12301e(context, sensitiveData);
                AbstractC20110a.m104542k(3, "queryAdvertisingId sync: %s in %d(ms)", f9837a, Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            } else {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: au.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC2339c.m12300d(context, sensitiveData, currentTimeMillis, atomicBoolean);
                    }
                });
                synchronized (atomicBoolean) {
                    if (!atomicBoolean.get() && Looper.getMainLooper().getThread().getId() != Thread.currentThread().getId()) {
                        try {
                            atomicBoolean.wait(3000L);
                        } catch (InterruptedException e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                    }
                }
            }
            AbstractC20110a.m104542k(3, "getAdvertisingId: %s", f9837a);
            String str2 = f9837a;
            if (str2 != null) {
                return str2;
            }
            return "unknown";
        } catch (Exception e12) {
            AbstractC20110a.m104539h(e12);
            return "unknown";
        }
    }

    /* renamed from: c */
    public static AdvertisingIdClient.Info m12299c(Context context, SensitiveData sensitiveData) {
        try {
            C8937j0.m47654b().m35540b(sensitiveData);
            return AdvertisingIdClient.getAdvertisingIdInfo(context);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m12300d(Context context, SensitiveData sensitiveData, long j11, AtomicBoolean atomicBoolean) {
        m12301e(context, sensitiveData);
        AbstractC20110a.m104542k(3, "queryAdvertisingId async: %s in %d(ms)", f9837a, Long.valueOf(System.currentTimeMillis() - j11));
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
            atomicBoolean.notifyAll();
        }
    }

    /* renamed from: e */
    public static synchronized void m12301e(Context context, SensitiveData sensitiveData) {
        synchronized (AbstractC2339c.class) {
            try {
                C8937j0.m47654b().m35540b(sensitiveData);
                String id2 = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
                f9837a = id2;
                if (id2 == null) {
                    f9837a = "unknown";
                }
            } finally {
            }
        }
    }
}

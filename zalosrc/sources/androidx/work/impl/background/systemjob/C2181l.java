package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.AbstractC2253u;
import androidx.work.C2142e;
import androidx.work.EnumC2134a;
import androidx.work.EnumC2254v;
import androidx.work.InterfaceC2136b;
import java.util.Iterator;
import p535u2.C26976w;

/* renamed from: androidx.work.impl.background.systemjob.l */
/* loaded from: classes.dex */
class C2181l {

    /* renamed from: c */
    private static final String f9223c = AbstractC2253u.m11897i("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f9224a;

    /* renamed from: b */
    private final InterfaceC2136b f9225b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.work.impl.background.systemjob.l$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9226a;

        static {
            int[] iArr = new int[EnumC2254v.values().length];
            f9226a = iArr;
            try {
                iArr[EnumC2254v.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9226a[EnumC2254v.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9226a[EnumC2254v.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9226a[EnumC2254v.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9226a[EnumC2254v.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2181l(Context context, InterfaceC2136b interfaceC2136b) {
        this.f9225b = interfaceC2136b;
        this.f9224a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* renamed from: b */
    private static JobInfo.TriggerContentUri m11660b(C2142e.c cVar) {
        boolean m11519b = cVar.m11519b();
        AbstractC2180k.m11659a();
        return AbstractC2179j.m11658a(cVar.m11518a(), m11519b ? 1 : 0);
    }

    /* renamed from: c */
    static int m11661c(EnumC2254v enumC2254v) {
        int i11 = a.f9226a[enumC2254v.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return 1;
            }
            if (i11 == 3) {
                return 2;
            }
            if (i11 != 4) {
                if (i11 == 5 && Build.VERSION.SDK_INT >= 26) {
                    return 4;
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                return 3;
            }
            AbstractC2253u.m11895e().mo11898a(f9223c, "API version too low. Cannot convert network type value " + enumC2254v);
            return 1;
        }
        return 0;
    }

    /* renamed from: d */
    static void m11662d(JobInfo.Builder builder, EnumC2254v enumC2254v) {
        if (Build.VERSION.SDK_INT >= 30 && enumC2254v == EnumC2254v.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(m11661c(enumC2254v));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public JobInfo m11663a(C26976w c26976w, int i11) {
        boolean z11;
        int i12;
        C2142e c2142e = c26976w.f127506j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c26976w.f127497a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c26976w.m138975f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", c26976w.m138982m());
        JobInfo.Builder extras = new JobInfo.Builder(i11, this.f9224a).setRequiresCharging(c2142e.m11510g()).setRequiresDeviceIdle(c2142e.m11511h()).setExtras(persistableBundle);
        m11662d(extras, c2142e.m11507d());
        boolean z12 = false;
        if (!c2142e.m11511h()) {
            if (c26976w.f127508l == EnumC2134a.LINEAR) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            extras.setBackoffCriteria(c26976w.f127509m, i12);
        }
        long max = Math.max(c26976w.m138973c() - this.f9225b.mo11468a(), 0L);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!c26976w.f127513q) {
            extras.setImportantWhileForeground(true);
        }
        if (i13 >= 24 && c2142e.m11508e()) {
            Iterator it = c2142e.m11506c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(m11660b((C2142e.c) it.next()));
            }
            extras.setTriggerContentUpdateDelay(c2142e.m11505b());
            extras.setTriggerContentMaxDelay(c2142e.m11504a());
        }
        extras.setPersisted(false);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26) {
            extras.setRequiresBatteryNotLow(c2142e.m11509f());
            extras.setRequiresStorageNotLow(c2142e.m11512i());
        }
        if (c26976w.f127507k > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (max > 0) {
            z12 = true;
        }
        if (i14 >= 31 && c26976w.f127513q && !z11 && !z12) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}

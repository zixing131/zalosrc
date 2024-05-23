package p565v2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import p119e2.InterfaceC18182g;
import p535u2.C26955d;

/* renamed from: v2.t */
/* loaded from: classes.dex */
public class C27466t {

    /* renamed from: a */
    private final WorkDatabase f129199a;

    public C27466t(WorkDatabase workDatabase) {
        this.f129199a = workDatabase;
    }

    /* renamed from: c */
    public static void m140516c(Context context, InterfaceC18182g interfaceC18182g) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j11 = 0;
            long j12 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                j11 = 1;
            }
            interfaceC18182g.mo194e();
            try {
                interfaceC18182g.mo189C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j12)});
                interfaceC18182g.mo189C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j11)});
                sharedPreferences.edit().clear().apply();
                interfaceC18182g.mo196k();
            } finally {
                interfaceC18182g.mo197l();
            }
        }
    }

    /* renamed from: a */
    public long m140517a() {
        Long mo138922a = this.f129199a.mo11561H().mo138922a("last_force_stop_ms");
        if (mo138922a != null) {
            return mo138922a.longValue();
        }
        return 0L;
    }

    /* renamed from: b */
    public boolean m140518b() {
        Long mo138922a = this.f129199a.mo11561H().mo138922a("reschedule_needed");
        if (mo138922a != null && mo138922a.longValue() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void m140519d(long j11) {
        this.f129199a.mo11561H().mo138923b(new C26955d("last_force_stop_ms", Long.valueOf(j11)));
    }

    /* renamed from: e */
    public void m140520e(boolean z11) {
        this.f129199a.mo11561H().mo138923b(new C26955d("reschedule_needed", z11));
    }
}

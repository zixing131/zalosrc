package p565v2;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import fn0.AbstractC19074t;
import p119e2.InterfaceC18182g;
import p535u2.C26955d;

/* renamed from: v2.l */
/* loaded from: classes2.dex */
public abstract class AbstractC27458l {
    /* renamed from: c */
    public static final void m140502c(Context context, InterfaceC18182g interfaceC18182g) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(interfaceC18182g, "sqLiteDatabase");
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i11 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i12 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            interfaceC18182g.mo194e();
            try {
                interfaceC18182g.mo189C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i11)});
                interfaceC18182g.mo189C("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i12)});
                sharedPreferences.edit().clear().apply();
                interfaceC18182g.mo196k();
            } finally {
                interfaceC18182g.mo197l();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final int m140503d(WorkDatabase workDatabase, String str) {
        int i11;
        Long mo138922a = workDatabase.mo11561H().mo138922a(str);
        int i12 = 0;
        if (mo138922a != null) {
            i11 = (int) mo138922a.longValue();
        } else {
            i11 = 0;
        }
        if (i11 != Integer.MAX_VALUE) {
            i12 = i11 + 1;
        }
        m140504e(workDatabase, str, i12);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m140504e(WorkDatabase workDatabase, String str, int i11) {
        workDatabase.mo11561H().mo138923b(new C26955d(str, Long.valueOf(i11)));
    }
}

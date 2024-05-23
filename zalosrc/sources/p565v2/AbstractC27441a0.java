package p565v2;

import android.content.Context;
import android.os.PowerManager;
import androidx.work.AbstractC2253u;
import fn0.AbstractC19074t;
import java.util.LinkedHashMap;
import java.util.Map;
import pm0.C24848g0;

/* renamed from: v2.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractC27441a0 {

    /* renamed from: a */
    private static final String f129138a;

    static {
        String m11897i = AbstractC2253u.m11897i("WakeLocks");
        AbstractC19074t.m100207e(m11897i, "tagWithPrefix(\"WakeLocks\")");
        f129138a = m11897i;
    }

    /* renamed from: a */
    public static final void m140464a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C27443b0 c27443b0 = C27443b0.f129147a;
        synchronized (c27443b0) {
            linkedHashMap.putAll(c27443b0.m140474a());
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC2253u.m11895e().mo11905k(f129138a, "WakeLock held for " + str);
            }
        }
    }

    /* renamed from: b */
    public static final PowerManager.WakeLock m140465b(Context context, String str) {
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        C27443b0 c27443b0 = C27443b0.f129147a;
        synchronized (c27443b0) {
        }
        AbstractC19074t.m100207e(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}

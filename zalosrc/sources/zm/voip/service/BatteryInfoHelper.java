package zm.voip.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.provider.Settings;
import androidx.work.AbstractC2144f;
import au.AbstractC2351i;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23171p0;
import org.json.JSONArray;
import zm.voip.service.BatteryInfoHelper;

/* loaded from: classes7.dex */
public final class BatteryInfoHelper {

    /* renamed from: b */
    private static C32243a f148743b;

    /* renamed from: c */
    private static boolean f148744c;

    /* renamed from: a */
    public static final BatteryInfoHelper f148742a = new BatteryInfoHelper();

    /* renamed from: d */
    private static final BroadcastReceiver f148745d = new BroadcastReceiver() { // from class: zm.voip.service.BatteryInfoHelper$mBatteryInfoReceiver$1
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:            r5 = zm.voip.service.BatteryInfoHelper.f148743b;     */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0045, code lost:            r5 = zm.voip.service.BatteryInfoHelper.f148743b;     */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0076, code lost:            r1 = zm.voip.service.BatteryInfoHelper.f148743b;     */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x008b, code lost:            r5 = zm.voip.service.BatteryInfoHelper.f148743b;     */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onReceive(Context context, Intent intent) {
            BatteryInfoHelper.C32243a c32243a;
            BatteryInfoHelper.C32243a c32243a2;
            BatteryInfoHelper.C32243a c32243a3;
            BatteryInfoHelper.C32243a c32243a4;
            AbstractC19074t.m100208f(context, "ctxt");
            AbstractC19074t.m100208f(intent, "intent");
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1538406691) {
                    if (hashCode != 305385558) {
                        if (hashCode == 1779291251 && action.equals("android.os.action.POWER_SAVE_MODE_CHANGED") && c32243a4 != null) {
                            c32243a4.m155533h(true);
                            return;
                        }
                        return;
                    }
                    if (action.equals("huawei.intent.action.POWER_MODE_CHANGED_ACTION") && c32243a3 != null && intent.getIntExtra("state", -1) == 1 && !c32243a3.m155529d()) {
                        c32243a3.m155533h(true);
                        return;
                    }
                    return;
                }
                if (action.equals("android.intent.action.BATTERY_CHANGED")) {
                    int intExtra = intent.getIntExtra("level", -1);
                    int intExtra2 = intent.getIntExtra("scale", -1);
                    if (intExtra > 0 && intExtra2 > 0 && c32243a2 != null) {
                        c32243a2.m155531f((intExtra * 100) / intExtra2);
                    }
                    if (intent.getIntExtra("plugged", -1) != 0 && c32243a != null) {
                        c32243a.m155532g(true);
                    }
                }
            }
        }
    };

    /* renamed from: zm.voip.service.BatteryInfoHelper$a */
    /* loaded from: classes7.dex */
    public static final class C32243a {

        /* renamed from: a */
        private int f148746a;

        /* renamed from: b */
        private int f148747b;

        /* renamed from: c */
        private boolean f148748c;

        /* renamed from: d */
        private boolean f148749d;

        public C32243a(int i11, int i12, boolean z11, boolean z12) {
            this.f148746a = i11;
            this.f148747b = i12;
            this.f148748c = z11;
            this.f148749d = z12;
        }

        /* renamed from: a */
        public final int m155526a() {
            return this.f148746a;
        }

        /* renamed from: b */
        public final int m155527b() {
            return this.f148747b;
        }

        /* renamed from: c */
        public final boolean m155528c() {
            return this.f148748c;
        }

        /* renamed from: d */
        public final boolean m155529d() {
            return this.f148749d;
        }

        /* renamed from: e */
        public final void m155530e(int i11) {
            this.f148746a = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32243a)) {
                return false;
            }
            C32243a c32243a = (C32243a) obj;
            return this.f148746a == c32243a.f148746a && this.f148747b == c32243a.f148747b && this.f148748c == c32243a.f148748c && this.f148749d == c32243a.f148749d;
        }

        /* renamed from: f */
        public final void m155531f(int i11) {
            this.f148747b = i11;
        }

        /* renamed from: g */
        public final void m155532g(boolean z11) {
            this.f148748c = z11;
        }

        /* renamed from: h */
        public final void m155533h(boolean z11) {
            this.f148749d = z11;
        }

        public int hashCode() {
            return (((((this.f148746a * 31) + this.f148747b) * 31) + AbstractC2144f.m11520a(this.f148748c)) * 31) + AbstractC2144f.m11520a(this.f148749d);
        }

        public String toString() {
            return "BatteryInfo(batteryWhenStartCall=" + this.f148746a + ", currentBattery=" + this.f148747b + ", wasCharged=" + this.f148748c + ", wasEnteredBatterySavingMode=" + this.f148749d + ")";
        }

        public /* synthetic */ C32243a(int i11, int i12, boolean z11, boolean z12, int i13, AbstractC19060k abstractC19060k) {
            this((i13 & 1) != 0 ? -1 : i11, (i13 & 2) != 0 ? -1 : i12, (i13 & 4) != 0 ? false : z11, (i13 & 8) != 0 ? false : z12);
        }
    }

    private BatteryInfoHelper() {
    }

    /* renamed from: b */
    private final boolean m155519b(Context context) {
        Object systemService = context.getSystemService("power");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode();
    }

    /* renamed from: e */
    private final boolean m155520e(Context context) {
        try {
            if (Settings.System.getInt(context.getContentResolver(), "SmartModeStatus") == 4) {
                return true;
            }
            return false;
        } catch (Settings.SettingNotFoundException unused) {
            return m155519b(context);
        }
    }

    /* renamed from: f */
    private final boolean m155521f(Context context) {
        if (AbstractC23171p0.m119370b()) {
            return m155520e(context);
        }
        return m155519b(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r3v0, types: [org.json.JSONArray] */
    /* renamed from: c */
    public final JSONArray m155522c() {
        ?? r02;
        ?? r22;
        int i11;
        C32243a c32243a = f148743b;
        int i12 = -1;
        if (c32243a != null) {
            boolean m155528c = c32243a.m155528c();
            r02 = c32243a.m155529d();
            r22 = m155528c;
        } else {
            r02 = -1;
            r22 = -1;
        }
        ?? jSONArray = new JSONArray();
        C32243a c32243a2 = f148743b;
        if (c32243a2 != null) {
            i11 = c32243a2.m155526a();
        } else {
            i11 = -1;
        }
        jSONArray.put(i11);
        C32243a c32243a3 = f148743b;
        if (c32243a3 != null) {
            i12 = c32243a3.m155527b();
        }
        jSONArray.put(i12);
        jSONArray.put(r22);
        jSONArray.put(r02);
        return jSONArray;
    }

    /* renamed from: d */
    public final int m155523d() {
        C32243a c32243a = f148743b;
        if (c32243a != null) {
            return c32243a.m155527b();
        }
        return -1;
    }

    /* renamed from: g */
    public final void m155524g(Context context) {
        AbstractC19074t.m100208f(context, "context");
        try {
            f148743b = new C32243a(0, 0, false, false, 15, null);
            IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            intentFilter.addAction("huawei.intent.action.POWER_MODE_CHANGED_ACTION");
            boolean z11 = true;
            f148744c = true;
            Intent m12327a = AbstractC2351i.m12327a(context, f148745d, intentFilter, true);
            if (m12327a != null) {
                int intExtra = m12327a.getIntExtra("level", -1);
                int intExtra2 = m12327a.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    C32243a c32243a = f148743b;
                    if (c32243a != null) {
                        c32243a.m155530e((intExtra * 100) / intExtra2);
                    }
                    C32243a c32243a2 = f148743b;
                    if (c32243a2 != null) {
                        c32243a2.m155531f((intExtra * 100) / intExtra2);
                    }
                }
                C32243a c32243a3 = f148743b;
                if (c32243a3 != null) {
                    if (m12327a.getIntExtra("plugged", -1) == 0) {
                        z11 = false;
                    }
                    c32243a3.m155532g(z11);
                }
            }
            C32243a c32243a4 = f148743b;
            if (c32243a4 != null) {
                c32243a4.m155533h(m155521f(context));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: h */
    public final void m155525h(Context context) {
        AbstractC19074t.m100208f(context, "context");
        try {
            if (f148744c) {
                f148744c = false;
                context.unregisterReceiver(f148745d);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}

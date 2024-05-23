package mk;

import ag0.C0815e1;
import am.AbstractC0924m0;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.provider.Settings;
import com.zing.zalo.p077ui.maintab.msg.BottomSheetBatteryOptimizationWarning;
import fn0.AbstractC19074t;
import kotlin.NoWhenBranchMatchedException;
import me0.C23055e5;
import on0.AbstractC24341v;
import p173fz.C19172a;
import p361nb.C23648e;
import p542ub.InterfaceC27218a;

/* renamed from: mk.i */
/* loaded from: classes3.dex */
public final class C23331i {

    /* renamed from: a */
    public static final C23331i f113531a = new C23331i();

    /* renamed from: mk.i$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f113532a;

        static {
            int[] iArr = new int[EnumC23326d.values().length];
            try {
                iArr[EnumC23326d.f113522q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23326d.f113521p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC23326d.f113523r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC23326d.f113524s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f113532a = iArr;
        }
    }

    private C23331i() {
    }

    /* renamed from: a */
    private final void m122725a(String str, int i11, C23327e c23327e, boolean z11) {
        C0815e1.m2075D().m2100V(new C23648e(1, "", i11, str, String.valueOf(m122728i(c23327e))), z11);
    }

    /* renamed from: b */
    static /* synthetic */ void m122726b(C23331i c23331i, String str, int i11, C23327e c23327e, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        c23331i.m122725a(str, i11, c23327e, z11);
    }

    /* renamed from: h */
    private final int m122727h(long j11) {
        int i11 = 1;
        long j12 = 2;
        int i12 = 1;
        while (j12 < j11) {
            int i13 = i12 + i11;
            j12++;
            i12 = i11;
            i11 = i13;
        }
        return i11;
    }

    /* renamed from: i */
    private final int m122728i(C23327e c23327e) {
        int i11 = a.f113532a[c23327e.m122720g().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return 4;
                }
                if (i11 == 4) {
                    return 5;
                }
                throw new NoWhenBranchMatchedException();
            }
            return 3;
        }
        int i12 = Build.VERSION.SDK_INT;
        if (28 > i12 || i12 > 30) {
            return 2;
        }
        return 1;
    }

    /* renamed from: c */
    public final void m122729c(C23327e c23327e) {
        AbstractC19074t.m100208f(c23327e, "item");
        m122726b(this, "noti_restriction_click_banner", 0, c23327e, false, 8, null);
    }

    /* renamed from: d */
    public final void m122730d(C23327e c23327e) {
        AbstractC19074t.m100208f(c23327e, "item");
        m122726b(this, "noti_restriction_close_banner", 0, c23327e, false, 8, null);
    }

    /* renamed from: e */
    public final void m122731e(C23327e c23327e) {
        String str;
        AbstractC19074t.m100208f(c23327e, "item");
        int i11 = a.f113532a[c23327e.m122720g().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        str = "noti_restriction_show_banner_multi";
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    str = "noti_restriction_show_banner_data";
                }
            } else {
                str = "noti_restriction_show_banner_battery";
            }
        } else {
            str = "noti_restriction_show_banner";
        }
        m122725a(str, 1, c23327e, true);
    }

    /* renamed from: f */
    public final void m122732f(int i11) {
        if (i11 == 0) {
            C0815e1.m2075D().m2100V(new C23648e(1, "", 0, "noti_restriction_update", new String[0]), false);
        }
    }

    /* renamed from: g */
    public final boolean m122733g() {
        if (AbstractC0924m0.m3770e4() == 0) {
            return true;
        }
        if (System.currentTimeMillis() - AbstractC0924m0.m3800f4() >= m122727h(r0) * 43200000) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m122734j(int i11, Context context) {
        Object obj;
        int restrictBackgroundStatus;
        if ((i11 & 4) == 0 || Build.VERSION.SDK_INT < 24 || C23055e5.m118270e()) {
            return false;
        }
        if (context != null) {
            obj = context.getSystemService("connectivity");
        } else {
            obj = null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) obj;
        if (connectivityManager != null) {
            restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
            if (restrictBackgroundStatus != 3) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m122735k(int i11, Context context) {
        int i12;
        Object obj;
        boolean isIgnoringBatteryOptimizations;
        boolean isBackgroundRestricted;
        if ((i11 & 2) == 0 || (i12 = Build.VERSION.SDK_INT) < 23) {
            return false;
        }
        int m100600k = C19172a.m100600k("tab_msg_fixed_banner@notification_restrict@battery_optimized_check_mode", 0);
        String str = null;
        Object obj2 = null;
        if ((m100600k != 0 && m100600k != 1) || m100600k == 0) {
            if (i12 < 28) {
                return false;
            }
            if (context != null) {
                obj2 = context.getSystemService("activity");
            }
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type android.app.ActivityManager");
            isBackgroundRestricted = ((ActivityManager) obj2).isBackgroundRestricted();
            return isBackgroundRestricted;
        }
        if (context != null) {
            obj = context.getSystemService("power");
        } else {
            obj = null;
        }
        PowerManager powerManager = (PowerManager) obj;
        if (powerManager == null) {
            return false;
        }
        if (context != null) {
            str = context.getPackageName();
        }
        isIgnoringBatteryOptimizations = powerManager.isIgnoringBatteryOptimizations(str);
        if (isIgnoringBatteryOptimizations) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final boolean m122736l(int i11, Context context) {
        String str;
        boolean m127126v;
        boolean m127126v2;
        ContentResolver contentResolver;
        ContentResolver contentResolver2;
        if ((i11 & 1) == 0) {
            return false;
        }
        Object obj = null;
        try {
            str = Build.MANUFACTURER;
            m127126v = AbstractC24341v.m127126v(str, "Xiaomi", true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!m127126v) {
            m127126v2 = AbstractC24341v.m127126v(str, "Huawei", true);
            if (m127126v2) {
                if (context != null) {
                    contentResolver = context.getContentResolver();
                } else {
                    contentResolver = null;
                }
                if (Settings.System.getInt(contentResolver, "SmartModeStatus") == 4) {
                    return true;
                }
                return false;
            }
            if (context != null) {
                obj = context.getSystemService("power");
            }
            PowerManager powerManager = (PowerManager) obj;
            if (powerManager != null && powerManager.isPowerSaveMode()) {
                return true;
            }
            return false;
        }
        if (context != null) {
            contentResolver2 = context.getContentResolver();
        } else {
            contentResolver2 = null;
        }
        if (Settings.System.getInt(contentResolver2, "POWER_SAVE_MODE_OPEN") == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void m122737m(Context context) {
        String str;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        if (context != null) {
            str = context.getPackageName();
        } else {
            str = null;
        }
        intent.setData(Uri.parse("package:" + str));
        if (context != null) {
            context.startActivity(intent);
        }
    }

    /* renamed from: n */
    public final void m122738n(Context context) {
        if (Build.VERSION.SDK_INT >= 22) {
            Intent intent = new Intent("android.settings.BATTERY_SAVER_SETTINGS");
            if (context != null) {
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: o */
    public final void m122739o(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 24) {
            Intent intent = new Intent("android.settings.IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS");
            if (context != null) {
                str = context.getPackageName();
            } else {
                str = null;
            }
            intent.setData(Uri.parse("package:" + str));
            if (context != null) {
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: p */
    public final void m122740p(InterfaceC27218a interfaceC27218a) {
        Bundle bundle = new Bundle();
        if (interfaceC27218a != null) {
            interfaceC27218a.mo35573l4(BottomSheetBatteryOptimizationWarning.class, bundle, 2, true);
        }
    }
}

package me0;

import android.os.Build;
import android.provider.Settings;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.ZaloLauncherActivity;
import vg.C28023b6;

/* renamed from: me0.r */
/* loaded from: classes4.dex */
public abstract class AbstractC23192r {
    /* renamed from: a */
    public static boolean m119490a() {
        if (Build.VERSION.SDK_INT >= 30 && Settings.Global.getInt(MainApplication.getAppContext().getContentResolver(), "notification_bubbles", 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m119491b(ContactProfile contactProfile) {
        if (AbstractC23034c6.m118125K()) {
            C28023b6.m141250h0().m141361m1(contactProfile);
            ZaloLauncherActivity.m57101u5();
            return true;
        }
        return false;
    }
}

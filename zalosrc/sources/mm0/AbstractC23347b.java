package mm0;

import android.content.Intent;
import android.text.TextUtils;
import com.zing.zalocore.CoreUtility;

/* renamed from: mm0.b */
/* loaded from: classes7.dex */
public abstract class AbstractC23347b {

    /* renamed from: a */
    public static boolean f113564a = false;

    /* renamed from: a */
    public static boolean m122759a(String str, String str2) {
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if ("text/html".equals(str) && !TextUtils.isEmpty(str2)) {
            Intent intent = new Intent();
            intent.setClassName(CoreUtility.getAppContext().getPackageName(), "com.zing.zalo.service.SmsReceiverService");
            intent.setAction("com.zing.zalo.action.CHECK_CAPTIVE_PORTAL");
            CoreUtility.getAppContext().startService(intent);
            f113564a = true;
            return true;
        }
        if (f113564a) {
            f113564a = false;
            Intent intent2 = new Intent();
            intent2.setClassName(CoreUtility.getAppContext().getPackageName(), "com.zing.zalo.service.SmsReceiverService");
            intent2.setAction("com.zing.zalo.action.CHECK_CAPTIVE_PORTAL");
            intent2.putExtra("skip_interval", true);
            CoreUtility.getAppContext().startService(intent2);
        }
        return false;
    }

    /* renamed from: b */
    public static void m122760b() {
        try {
            Intent intent = new Intent();
            intent.setClassName(CoreUtility.getAppContext().getPackageName(), "com.zing.zalo.service.SmsReceiverService");
            intent.setAction("com.zing.zalo.action.CHECK_CAPTIVE_PORTAL");
            CoreUtility.getAppContext().startService(intent);
            f113564a = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

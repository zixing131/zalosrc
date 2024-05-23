package bp0;

import android.content.Context;
import android.telephony.TelephonyManager;
import me0.AbstractC23057e7;
import me0.C23055e5;
import p097db.EnumC17857p;

/* renamed from: bp0.r */
/* loaded from: classes7.dex */
public abstract class AbstractC3106r {
    /* renamed from: a */
    public static int m15708a(Context context) {
        if (AbstractC23057e7.m118298e()) {
            return ((TelephonyManager) context.getSystemService("phone")).getCallState();
        }
        return 0;
    }

    /* renamed from: b */
    public static int m15709b(Context context) {
        int m118267a = C23055e5.m118267a(context);
        if (m118267a == 1) {
            return EnumC17857p.WIFI.ordinal();
        }
        if (m118267a == 0) {
            return EnumC17857p.UNKNOWN.ordinal();
        }
        if (m118267a != 3 && m118267a != 4) {
            return EnumC17857p.MOBILE_3G.ordinal();
        }
        return EnumC17857p.MOBILE_2G.ordinal();
    }

    /* renamed from: c */
    public static boolean m15710c(Context context) {
        if (AbstractC23057e7.m118298e()) {
            int callState = ((TelephonyManager) context.getSystemService("phone")).getCallState();
            AbstractC3082b0.m15421c("NetworkVoipUtils", "isInNativeCall: callState = " + callState);
            if (callState == 1 || callState == 2) {
                return true;
            }
            return false;
        }
        return AbstractC23057e7.m118303j(context);
    }
}

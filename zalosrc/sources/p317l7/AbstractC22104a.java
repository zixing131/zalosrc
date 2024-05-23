package p317l7;

import java.util.HashMap;
import java.util.Map;

/* renamed from: l7.a */
/* loaded from: classes3.dex */
public abstract class AbstractC22104a {

    /* renamed from: a */
    private static final Map f108852a;

    /* renamed from: b */
    private static final Map f108853b;

    /* renamed from: c */
    private static final Map f108854c;

    static {
        HashMap hashMap = new HashMap();
        f108852a = hashMap;
        HashMap hashMap2 = new HashMap();
        f108853b = hashMap2;
        hashMap.put(-1, "Too many sessions are running for current app, existing sessions must be resolved first.");
        hashMap.put(-2, "A requested module is not available (to this user/device, for the installed apk).");
        hashMap.put(-3, "Request is otherwise invalid.");
        hashMap.put(-4, "Requested session is not found.");
        hashMap.put(-5, "Split Install API is not available.");
        hashMap.put(-6, "Network error: unable to obtain split details.");
        hashMap.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        hashMap.put(-8, "Requested session contains modules from an existing active session and also new modules.");
        hashMap.put(-9, "Service handling split install has died.");
        hashMap.put(-10, "Install failed due to insufficient storage.");
        hashMap.put(-11, "Signature verification error when invoking SplitCompat.");
        hashMap.put(-12, "Error in SplitCompat emulation.");
        hashMap.put(-13, "Error in copying files for SplitCompat.");
        hashMap.put(-14, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        hashMap.put(-16, "The download is too large to start over the current connection.");
        hashMap.put(-100, "Unknown error processing split install.");
        hashMap2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        hashMap2.put(-2, "MODULE_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(-4, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(-6, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(-8, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        hashMap2.put(-9, "SERVICE_DIED");
        hashMap2.put(-10, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        hashMap2.put(-12, "SPLITCOMPAT_EMULATION_ERROR");
        hashMap2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        hashMap2.put(-14, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-15, "APP_NOT_OWNED");
        hashMap2.put(-16, "DOWNLOAD_TOO_LARGE");
        hashMap2.put(-100, "INTERNAL_ERROR");
        f108854c = new HashMap();
        for (Map.Entry entry : hashMap2.entrySet()) {
            f108854c.put((String) entry.getValue(), (Integer) entry.getKey());
        }
    }

    /* renamed from: a */
    public static int m115323a(String str) {
        Integer num = (Integer) f108854c.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(String.valueOf(str).concat(" is unknown error."));
    }

    /* renamed from: b */
    public static String m115324b(int i11) {
        Map map = f108852a;
        Integer valueOf = Integer.valueOf(i11);
        if (map.containsKey(valueOf)) {
            Map map2 = f108853b;
            if (map2.containsKey(valueOf)) {
                return ((String) map.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#" + ((String) map2.get(valueOf)) + ")";
            }
            return "";
        }
        return "";
    }
}

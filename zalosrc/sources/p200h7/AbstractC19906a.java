package p200h7;

import java.util.HashMap;
import java.util.Map;

/* renamed from: h7.a */
/* loaded from: classes3.dex */
public abstract class AbstractC19906a {

    /* renamed from: a */
    private static final Map f98102a;

    /* renamed from: b */
    private static final Map f98103b;

    static {
        HashMap hashMap = new HashMap();
        f98102a = hashMap;
        HashMap hashMap2 = new HashMap();
        f98103b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }

    /* renamed from: a */
    public static String m103593a(int i11) {
        Map map = f98102a;
        Integer valueOf = Integer.valueOf(i11);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        return ((String) map.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f98103b.get(valueOf)) + ")";
    }
}

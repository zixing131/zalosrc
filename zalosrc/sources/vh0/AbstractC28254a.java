package vh0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.zing.zalo.zbrowser.cache.C16898b;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: vh0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC28254a {
    /* renamed from: a */
    public static String m142262a(String str, String str2, int i11) {
        String str3;
        try {
            Matcher matcher = Pattern.compile("broadcastId=[A-Za-z0-9]+").matcher(str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("zarsrc=");
            if (i11 < 0) {
                i11 = 1303;
            }
            sb2.append(i11);
            String sb3 = sb2.toString();
            if (str.contains("utm_source=") && str.contains("utm_medium=") && str.contains("utm_campaign=")) {
                if (str.contains("zarsrc")) {
                    return str.replaceAll("zarsrc=\\d+", sb3);
                }
                return str + "&" + sb3;
            }
            if (str.contains("?")) {
                str3 = str + "&utm_source=zalo&utm_medium=zalo&utm_campaign=zalo";
            } else {
                str3 = str + "?utm_source=zalo&utm_medium=zalo&utm_campaign=zalo";
            }
            if (!str3.contains("broadcastId") && matcher.find()) {
                str3 = str3 + "&" + matcher.group(0);
            }
            if (str3.contains("zarsrc")) {
                return str3.replaceAll("zarsrc=\\d+", sb3);
            }
            return str3 + "&" + sb3;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: b */
    public static NetworkInfo m142263b(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    /* renamed from: c */
    public static boolean m142264c(Context context) {
        try {
            NetworkInfo m142263b = m142263b(context);
            if (m142263b == null || !m142263b.isConnected()) {
                return false;
            }
            if (m142263b.getType() != 1) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static String m142265d(String str, C16898b c16898b) {
        if (c16898b != null && c16898b.m90367a(str)) {
            int indexOf = str.indexOf(63);
            if (indexOf > 0) {
                return str.substring(0, indexOf);
            }
            return str;
        }
        return str.replaceAll("&?utm_source=[^&]+", "").replaceAll("&?utm_medium=[^&]+", "").replaceAll("&?utm_campaign=[^&]+", "").replaceAll("&?zarsrc=\\d+", "").replaceAll("&?broadcastId=[^&]+", "").replaceAll("&?zl3rd=[^&]+", "").replaceAll("\\?&", "?").replaceAll("\\?$", "");
    }
}

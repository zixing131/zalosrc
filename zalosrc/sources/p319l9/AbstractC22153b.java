package p319l9;

/* renamed from: l9.b */
/* loaded from: classes3.dex */
public abstract class AbstractC22153b {
    /* renamed from: a */
    public static String m115535a(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/DURATION_TRACE/%s?utm_source=%s&utm_medium=%s", m115538d(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    /* renamed from: b */
    public static String m115536b(String str, String str2) {
        return String.format("%s/trends?utm_source=%s&utm_medium=%s", m115538d(str, str2), "perf-android-sdk", "android-ide");
    }

    /* renamed from: c */
    public static String m115537c(String str, String str2, String str3) {
        return String.format("%s/troubleshooting/trace/SCREEN_TRACE/%s?utm_source=%s&utm_medium=%s", m115538d(str, str2), str3, "perf-android-sdk", "android-ide");
    }

    /* renamed from: d */
    private static String m115538d(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", "https://console.firebase.google.com", str, str2);
    }
}

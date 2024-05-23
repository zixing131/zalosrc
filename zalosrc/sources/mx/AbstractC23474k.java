package mx;

/* renamed from: mx.k */
/* loaded from: classes4.dex */
public abstract class AbstractC23474k {
    /* renamed from: a */
    public static String m123237a(Object obj, int i11) {
        if (obj == null) {
            return "-";
        }
        if (obj instanceof Exception) {
            StackTraceElement[] stackTrace = ((Exception) obj).getStackTrace();
            if (stackTrace == null) {
                return "-";
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i12 = 0; i12 < i11 && i12 < stackTrace.length; i12++) {
                sb2.append("at ");
                sb2.append(stackTrace[i12]);
                sb2.append("|");
            }
            return sb2.substring(0, sb2.length() - 1);
        }
        return obj.toString();
    }

    /* renamed from: b */
    public static String m123238b(Object obj, boolean z11) {
        if (obj == null) {
            return "-";
        }
        if (obj instanceof Exception) {
            StackTraceElement[] stackTrace = ((Exception) obj).getStackTrace();
            if (z11) {
                if (stackTrace != null && stackTrace.length > 2) {
                    return "at " + stackTrace[0] + "|at " + stackTrace[1] + "|at " + stackTrace[2];
                }
            } else if (stackTrace != null && stackTrace.length > 1) {
                return "at " + stackTrace[1].toString();
            }
            return "-";
        }
        return obj.toString();
    }
}

package p051c7;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: c7.t */
/* loaded from: classes.dex */
public final class C3325t {

    /* renamed from: a */
    private final String f14142a;

    public C3325t(String str) {
        this.f14142a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* renamed from: f */
    private static String m16796f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return str + " : " + str2;
    }

    /* renamed from: a */
    public final int m16797a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m16796f(this.f14142a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m16798b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m16796f(this.f14142a, str, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int m16799c(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m16796f(this.f14142a, str, objArr), th2);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m16800d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m16796f(this.f14142a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int m16801e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m16796f(this.f14142a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}

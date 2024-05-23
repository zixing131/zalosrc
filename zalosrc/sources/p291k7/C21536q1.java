package p291k7;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: k7.q1 */
/* loaded from: classes.dex */
public final class C21536q1 {

    /* renamed from: a */
    private final String f104574a;

    public C21536q1(String str) {
        this.f104574a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* renamed from: f */
    private static String m111193f(String str, String str2, Object... objArr) {
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
    public final int m111194a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m111193f(this.f104574a, str, objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m111195b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m111193f(this.f104574a, str, objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int m111196c(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m111193f(this.f104574a, str, objArr), th2);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m111197d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m111193f(this.f104574a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int m111198e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m111193f(this.f104574a, str, objArr));
        }
        return 0;
    }
}

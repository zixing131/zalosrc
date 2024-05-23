package p182g7;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: g7.i */
/* loaded from: classes3.dex */
public final class C19267i {

    /* renamed from: a */
    private final String f95761a;

    public C19267i(String str) {
        this.f95761a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    /* renamed from: f */
    private static String m100977f(String str, String str2, Object... objArr) {
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
    public final int m100978a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m100977f(this.f95761a, "Already connected to the service.", objArr));
        }
        return 0;
    }

    /* renamed from: b */
    public final int m100979b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m100977f(this.f95761a, "Play Store app is either not installed or not the official version", objArr));
        }
        return 0;
    }

    /* renamed from: c */
    public final int m100980c(Throwable th2, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m100977f(this.f95761a, str, objArr), th2);
        }
        return 0;
    }

    /* renamed from: d */
    public final int m100981d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m100977f(this.f95761a, str, objArr));
        }
        return 0;
    }

    /* renamed from: e */
    public final int m100982e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m100977f(this.f95761a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}

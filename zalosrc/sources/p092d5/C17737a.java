package p092d5;

import android.util.Log;
import com.google.android.gms.common.internal.C4184h;
import java.util.Locale;

/* renamed from: d5.a */
/* loaded from: classes2.dex */
public class C17737a {

    /* renamed from: a */
    private final String f89910a;

    /* renamed from: b */
    private final String f89911b;

    /* renamed from: c */
    private final C4184h f89912c;

    /* renamed from: d */
    private final int f89913d;

    public C17737a(String str, String... strArr) {
        String sb2;
        if (strArr.length == 0) {
            sb2 = "";
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append('[');
            for (String str2 : strArr) {
                if (sb3.length() > 1) {
                    sb3.append(",");
                }
                sb3.append(str2);
            }
            sb3.append("] ");
            sb2 = sb3.toString();
        }
        this.f89911b = sb2;
        this.f89910a = str;
        this.f89912c = new C4184h(str);
        int i11 = 2;
        while (i11 <= 7 && !Log.isLoggable(this.f89910a, i11)) {
            i11++;
        }
        this.f89913d = i11;
    }

    /* renamed from: a */
    public void m93898a(String str, Object... objArr) {
        if (m93902e(3)) {
            m93900c(str, objArr);
        }
    }

    /* renamed from: b */
    public void m93899b(String str, Object... objArr) {
        m93900c(str, objArr);
    }

    /* renamed from: c */
    protected String m93900c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f89911b.concat(str);
    }

    /* renamed from: d */
    public void m93901d(String str, Object... objArr) {
        m93900c(str, objArr);
    }

    /* renamed from: e */
    public boolean m93902e(int i11) {
        return this.f89913d <= i11;
    }

    /* renamed from: f */
    public void m93903f(String str, Object... objArr) {
        m93900c(str, objArr);
    }
}

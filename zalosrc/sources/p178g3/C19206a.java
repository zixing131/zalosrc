package p178g3;

import android.content.Context;
import com.adtima.Adtima;

/* renamed from: g3.a */
/* loaded from: classes2.dex */
public class C19206a {

    /* renamed from: a */
    private static C19206a f95648a;

    private C19206a() {
    }

    /* renamed from: b */
    public static C19206a m100793b() {
        if (f95648a == null) {
            f95648a = new C19206a();
        }
        return f95648a;
    }

    /* renamed from: a */
    public String m100794a() {
        try {
            Context context = Adtima.SharedContext;
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }
}

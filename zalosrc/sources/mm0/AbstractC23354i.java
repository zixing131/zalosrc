package mm0;

import com.zing.zalo.BuildConfig;

/* renamed from: mm0.i */
/* loaded from: classes.dex */
public abstract class AbstractC23354i {

    /* renamed from: a */
    public static String f113574a = null;

    /* renamed from: b */
    public static boolean f113575b = true;

    /* renamed from: a */
    public static boolean m122791a() {
        return f113575b;
    }

    /* renamed from: b */
    public static void m122792b(String str) {
        f113574a = str;
        f113575b = BuildConfig.APPLICATION_ID.equals(str);
    }
}

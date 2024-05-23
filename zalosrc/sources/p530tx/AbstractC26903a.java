package p530tx;

import android.content.res.Resources;

/* renamed from: tx.a */
/* loaded from: classes4.dex */
public abstract class AbstractC26903a {
    /* renamed from: a */
    public static int m138660a(int i11) {
        return i11 * (Resources.getSystem().getDisplayMetrics().densityDpi / 160);
    }

    /* renamed from: b */
    public static int m138661b() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    /* renamed from: c */
    public static int m138662c() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }
}

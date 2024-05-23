package p00;

import android.os.Build;
import au.AbstractC2345f;
import com.zing.zalo.MainApplication;
import me0.AbstractC23165o5;

/* renamed from: p00.a */
/* loaded from: classes4.dex */
public final class C24594a {

    /* renamed from: a */
    public static final C24594a f118364a = new C24594a();

    private C24594a() {
    }

    /* renamed from: a */
    public static final int m128080a() {
        if (AbstractC2345f.m12313b(MainApplication.Companion.m35500c())) {
            return 1;
        }
        if (AbstractC23165o5.m119333b()) {
            return 2;
        }
        return 0;
    }

    /* renamed from: b */
    public static final int m128081b() {
        return m128083d(false, 1, null);
    }

    /* renamed from: c */
    public static final int m128082c(boolean z11) {
        if (z11 && Build.VERSION.SDK_INT >= 23 && AbstractC2345f.m12313b(MainApplication.Companion.m35500c())) {
            return 1;
        }
        if (AbstractC23165o5.m119333b()) {
            return 2;
        }
        return 0;
    }

    /* renamed from: d */
    public static /* synthetic */ int m128083d(boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return m128082c(z11);
    }
}

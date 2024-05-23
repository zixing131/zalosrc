package p291k7;

import android.os.Build;

/* renamed from: k7.q */
/* loaded from: classes.dex */
public abstract class AbstractC21534q {
    /* renamed from: a */
    public static InterfaceC21528o m111190a() {
        int i11;
        switch (Build.VERSION.SDK_INT) {
            case 21:
                return new C21549v();
            case 22:
                return new C21552w();
            case 23:
                return new C21487a0();
            case 24:
                return new C21490b0();
            case 25:
                return new C21496d0();
            case 26:
                return new C21505g0();
            case 27:
                i11 = Build.VERSION.PREVIEW_SDK_INT;
                if (i11 == 0) {
                    return new C21508h0();
                }
                break;
        }
        return new C21514j0();
    }
}

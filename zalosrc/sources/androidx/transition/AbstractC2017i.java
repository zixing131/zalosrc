package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.transition.i */
/* loaded from: classes2.dex */
abstract class AbstractC2017i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC2009e m11014a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (Build.VERSION.SDK_INT == 28) {
            return C2013g.m11001b(view, viewGroup, matrix);
        }
        return C2015h.m11006b(view, viewGroup, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m11015b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C2013g.m11005f(view);
        } else {
            C2015h.m11010f(view);
        }
    }
}

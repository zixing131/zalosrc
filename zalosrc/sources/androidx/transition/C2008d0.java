package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.transition.d0 */
/* loaded from: classes2.dex */
public class C2008d0 extends AbstractC2006c0 {

    /* renamed from: f */
    private static boolean f8562f = true;

    /* renamed from: g */
    private static boolean f8563g = true;

    /* renamed from: h */
    private static boolean f8564h = true;

    @Override // androidx.transition.AbstractC2016h0
    /* renamed from: e */
    public void mo10988e(View view, Matrix matrix) {
        if (f8562f) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                f8562f = false;
            }
        }
    }

    @Override // androidx.transition.AbstractC2016h0
    /* renamed from: i */
    public void mo10989i(View view, Matrix matrix) {
        if (f8563g) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f8563g = false;
            }
        }
    }

    @Override // androidx.transition.AbstractC2016h0
    /* renamed from: j */
    public void mo10990j(View view, Matrix matrix) {
        if (f8564h) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f8564h = false;
            }
        }
    }
}

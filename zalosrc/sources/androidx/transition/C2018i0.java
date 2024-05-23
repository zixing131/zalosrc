package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: androidx.transition.i0 */
/* loaded from: classes2.dex */
class C2018i0 implements InterfaceC2020j0 {

    /* renamed from: a */
    private final WindowId f8587a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2018i0(View view) {
        this.f8587a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C2018i0) && ((C2018i0) obj).f8587a.equals(this.f8587a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f8587a.hashCode();
    }
}

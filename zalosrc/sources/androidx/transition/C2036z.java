package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: androidx.transition.z */
/* loaded from: classes2.dex */
class C2036z implements InterfaceC2002a0 {

    /* renamed from: a */
    private final ViewOverlay f8635a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2036z(View view) {
        this.f8635a = view.getOverlay();
    }

    @Override // androidx.transition.InterfaceC2002a0
    /* renamed from: a */
    public void mo10964a(Drawable drawable) {
        this.f8635a.add(drawable);
    }

    @Override // androidx.transition.InterfaceC2002a0
    /* renamed from: b */
    public void mo10965b(Drawable drawable) {
        this.f8635a.remove(drawable);
    }
}

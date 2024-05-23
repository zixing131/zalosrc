package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: androidx.transition.w */
/* loaded from: classes2.dex */
class C2033w implements InterfaceC2034x {

    /* renamed from: a */
    private final ViewGroupOverlay f8631a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2033w(ViewGroup viewGroup) {
        this.f8631a = viewGroup.getOverlay();
    }

    @Override // androidx.transition.InterfaceC2002a0
    /* renamed from: a */
    public void mo10964a(Drawable drawable) {
        this.f8631a.add(drawable);
    }

    @Override // androidx.transition.InterfaceC2002a0
    /* renamed from: b */
    public void mo10965b(Drawable drawable) {
        this.f8631a.remove(drawable);
    }

    @Override // androidx.transition.InterfaceC2034x
    /* renamed from: c */
    public void mo11034c(View view) {
        this.f8631a.add(view);
    }

    @Override // androidx.transition.InterfaceC2034x
    /* renamed from: d */
    public void mo11035d(View view) {
        this.f8631a.remove(view);
    }
}

package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: com.google.android.material.internal.x */
/* loaded from: classes3.dex */
class C6357x implements InterfaceC6358y {

    /* renamed from: a */
    private final ViewOverlay f35602a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6357x(View view) {
        this.f35602a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.InterfaceC6358y
    /* renamed from: a */
    public void mo32644a(Drawable drawable) {
        this.f35602a.add(drawable);
    }

    @Override // com.google.android.material.internal.InterfaceC6358y
    /* renamed from: b */
    public void mo32645b(Drawable drawable) {
        this.f35602a.remove(drawable);
    }
}

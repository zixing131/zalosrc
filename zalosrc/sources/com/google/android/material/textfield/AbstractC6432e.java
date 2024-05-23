package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.e */
/* loaded from: classes3.dex */
public abstract class AbstractC6432e {

    /* renamed from: a */
    TextInputLayout f36125a;

    /* renamed from: b */
    Context f36126b;

    /* renamed from: c */
    CheckableImageButton f36127c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC6432e(TextInputLayout textInputLayout) {
        this.f36125a = textInputLayout;
        this.f36126b = textInputLayout.getContext();
        this.f36127c = textInputLayout.getEndIconView();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo33148a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo33189b(int i11) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo33149c(boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo33190d() {
        return false;
    }
}

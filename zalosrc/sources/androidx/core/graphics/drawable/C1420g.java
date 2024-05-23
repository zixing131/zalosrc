package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.drawable.g */
/* loaded from: classes2.dex */
public final class C1420g extends Drawable.ConstantState {

    /* renamed from: a */
    int f6225a;

    /* renamed from: b */
    Drawable.ConstantState f6226b;

    /* renamed from: c */
    ColorStateList f6227c;

    /* renamed from: d */
    PorterDuff.Mode f6228d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1420g(C1420g c1420g) {
        this.f6227c = null;
        this.f6228d = AbstractC1418e.f6217v;
        if (c1420g != null) {
            this.f6225a = c1420g.f6225a;
            this.f6226b = c1420g.f6226b;
            this.f6227c = c1420g.f6227c;
            this.f6228d = c1420g.f6228d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m7228a() {
        return this.f6226b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i11;
        int i12 = this.f6225a;
        Drawable.ConstantState constantState = this.f6226b;
        if (constantState != null) {
            i11 = constantState.getChangingConfigurations();
        } else {
            i11 = 0;
        }
        return i12 | i11;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new C1419f(this, resources);
    }
}

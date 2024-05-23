package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import p175g0.AbstractC19187j;
import p310l0.AbstractC21981b;

/* loaded from: classes2.dex */
public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC1024a {
    }

    /* renamed from: f */
    public boolean m4694f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo4695g();

    /* renamed from: h */
    public abstract void mo4696h(boolean z11);

    /* renamed from: i */
    public abstract int mo4697i();

    /* renamed from: j */
    public abstract Context mo4698j();

    /* renamed from: k */
    public boolean m4699k() {
        return false;
    }

    /* renamed from: l */
    public abstract void mo4700l(Configuration configuration);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m4701m() {
    }

    /* renamed from: n */
    public abstract boolean mo4702n(int i11, KeyEvent keyEvent);

    /* renamed from: o */
    public boolean m4703o(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: p */
    public boolean m4704p() {
        return false;
    }

    /* renamed from: q */
    public abstract void mo4705q(boolean z11);

    /* renamed from: r */
    public abstract void mo4706r(boolean z11);

    /* renamed from: s */
    public abstract void mo4707s(CharSequence charSequence);

    /* renamed from: t */
    public abstract AbstractC21981b mo4708t(AbstractC21981b.a aVar);

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f3623a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3623a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC19187j.ActionBarLayout);
            this.f3623a = obtainStyledAttributes.getInt(AbstractC19187j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f3623a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f3623a = 0;
            this.f3623a = layoutParams.f3623a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3623a = 0;
        }
    }
}

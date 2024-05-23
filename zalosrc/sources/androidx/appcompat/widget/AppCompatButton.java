package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.AbstractC1640l;
import androidx.core.widget.InterfaceC1630b;
import androidx.core.widget.InterfaceC1642n;
import p175g0.AbstractC19178a;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements InterfaceC1630b, InterfaceC1642n {

    /* renamed from: p */
    private final C1161d f4255p;

    /* renamed from: q */
    private final C1154b0 f4256q;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1161d c1161d = this.f4255p;
        if (c1161d != null) {
            c1161d.m5506b();
        }
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            c1154b0.m5467b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC1630b.f6665a) {
            return super.getAutoSizeMaxTextSize();
        }
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            return c1154b0.m5469e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (InterfaceC1630b.f6665a) {
            return super.getAutoSizeMinTextSize();
        }
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            return c1154b0.m5470f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (InterfaceC1630b.f6665a) {
            return super.getAutoSizeStepGranularity();
        }
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            return c1154b0.m5471g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (InterfaceC1630b.f6665a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            return c1154b0.m5472h();
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (InterfaceC1630b.f6665a) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 == null) {
            return 0;
        }
        return c1154b0.m5473i();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1161d c1161d = this.f4255p;
        if (c1161d != null) {
            return c1161d.m5507c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1161d c1161d = this.f4255p;
        if (c1161d != null) {
            return c1161d.m5508d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4256q.m5474j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4256q.m5475k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            c1154b0.m5479o(z11, i11, i12, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null && !InterfaceC1630b.f6665a && c1154b0.m5476l()) {
            this.f4256q.m5468c();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) {
        if (InterfaceC1630b.f6665a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            c1154b0.m5483s(i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i11) {
        if (InterfaceC1630b.f6665a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i11);
            return;
        }
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            c1154b0.m5484t(iArr, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i11) {
        if (InterfaceC1630b.f6665a) {
            super.setAutoSizeTextTypeWithDefaults(i11);
            return;
        }
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            c1154b0.m5485u(i11);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1161d c1161d = this.f4255p;
        if (c1161d != null) {
            c1161d.m5510f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C1161d c1161d = this.f4255p;
        if (c1161d != null) {
            c1161d.m5511g(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1640l.m8426q(this, callback));
    }

    public void setSupportAllCaps(boolean z11) {
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            c1154b0.m5482r(z11);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1161d c1161d = this.f4255p;
        if (c1161d != null) {
            c1161d.m5513i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1161d c1161d = this.f4255p;
        if (c1161d != null) {
            c1161d.m5514j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1642n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f4256q.m5486v(colorStateList);
        this.f4256q.m5467b();
    }

    @Override // androidx.core.widget.InterfaceC1642n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f4256q.m5487w(mode);
        this.f4256q.m5467b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            c1154b0.m5481q(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        if (InterfaceC1630b.f6665a) {
            super.setTextSize(i11, f11);
            return;
        }
        C1154b0 c1154b0 = this.f4256q;
        if (c1154b0 != null) {
            c1154b0.m5488z(i11, f11);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.buttonStyle);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i11) {
        super(C1202q1.m5687b(context), attributeSet, i11);
        AbstractC1199p1.m5678a(this, getContext());
        C1161d c1161d = new C1161d(this);
        this.f4255p = c1161d;
        c1161d.m5509e(attributeSet, i11);
        C1154b0 c1154b0 = new C1154b0(this);
        this.f4256q = c1154b0;
        c1154b0.m5477m(attributeSet, i11);
        c1154b0.m5467b();
    }
}

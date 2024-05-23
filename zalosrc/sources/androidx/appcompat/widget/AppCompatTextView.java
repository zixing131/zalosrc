package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.graphics.AbstractC1425i;
import androidx.core.text.AbstractC1475n;
import androidx.core.widget.AbstractC1640l;
import androidx.core.widget.InterfaceC1630b;
import androidx.core.widget.InterfaceC1642n;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p193h0.AbstractC19694b;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements InterfaceC1642n, InterfaceC1630b {

    /* renamed from: p */
    private final C1161d f4306p;

    /* renamed from: q */
    private final C1154b0 f4307q;

    /* renamed from: r */
    private final C1209t f4308r;

    /* renamed from: s */
    private Future f4309s;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m5267a() {
        Future future = this.f4309s;
        if (future != null) {
            try {
                this.f4309s = null;
                AbstractC1158c0.m5500a(future.get());
                AbstractC1640l.m8423n(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1161d c1161d = this.f4306p;
        if (c1161d != null) {
            c1161d.m5506b();
        }
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5467b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (InterfaceC1630b.f6665a) {
            return super.getAutoSizeMaxTextSize();
        }
        C1154b0 c1154b0 = this.f4307q;
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
        C1154b0 c1154b0 = this.f4307q;
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
        C1154b0 c1154b0 = this.f4307q;
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
        C1154b0 c1154b0 = this.f4307q;
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
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 == null) {
            return 0;
        }
        return c1154b0.m5473i();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return AbstractC1640l.m8411b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return AbstractC1640l.m8412c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1161d c1161d = this.f4306p;
        if (c1161d != null) {
            return c1161d.m5507c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1161d c1161d = this.f4306p;
        if (c1161d != null) {
            return c1161d.m5508d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f4307q.m5474j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f4307q.m5475k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m5267a();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1209t c1209t;
        if (Build.VERSION.SDK_INT < 28 && (c1209t = this.f4308r) != null) {
            return c1209t.m5711a();
        }
        return super.getTextClassifier();
    }

    public AbstractC1475n.a getTextMetricsParamsCompat() {
        return AbstractC1640l.m8416g(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1170g.m5549a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5479o(z11, i11, i12, i13, i14);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        m5267a();
        super.onMeasure(i11, i12);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null && !InterfaceC1630b.f6665a && c1154b0.m5476l()) {
            this.f4307q.m5468c();
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i11, int i12, int i13, int i14) {
        if (InterfaceC1630b.f6665a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i11, i12, i13, i14);
            return;
        }
        C1154b0 c1154b0 = this.f4307q;
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
        C1154b0 c1154b0 = this.f4307q;
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
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5485u(i11);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1161d c1161d = this.f4306p;
        if (c1161d != null) {
            c1161d.m5510f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C1161d c1161d = this.f4306p;
        if (c1161d != null) {
            c1161d.m5511g(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5480p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5480p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5480p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5480p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1640l.m8426q(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i11);
        } else {
            AbstractC1640l.m8420k(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i11) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i11);
        } else {
            AbstractC1640l.m8421l(this, i11);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i11) {
        AbstractC1640l.m8422m(this, i11);
    }

    public void setPrecomputedText(AbstractC1475n abstractC1475n) {
        AbstractC1640l.m8423n(this, abstractC1475n);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1161d c1161d = this.f4306p;
        if (c1161d != null) {
            c1161d.m5513i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1161d c1161d = this.f4306p;
        if (c1161d != null) {
            c1161d.m5514j(mode);
        }
    }

    @Override // androidx.core.widget.InterfaceC1642n
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f4307q.m5486v(colorStateList);
        this.f4307q.m5467b();
    }

    @Override // androidx.core.widget.InterfaceC1642n
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f4307q.m5487w(mode);
        this.f4307q.m5467b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5481q(context, i11);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1209t c1209t;
        if (Build.VERSION.SDK_INT < 28 && (c1209t = this.f4308r) != null) {
            c1209t.m5712b(textClassifier);
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<AbstractC1475n> future) {
        this.f4309s = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(AbstractC1475n.a aVar) {
        AbstractC1640l.m8425p(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        if (InterfaceC1630b.f6665a) {
            super.setTextSize(i11, f11);
            return;
        }
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5488z(i11, f11);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i11) {
        Typeface typeface2;
        if (typeface != null && i11 > 0) {
            typeface2 = AbstractC1425i.m7255a(getContext(), typeface, i11);
        } else {
            typeface2 = null;
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i11);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i11) {
        super(C1202q1.m5687b(context), attributeSet, i11);
        AbstractC1199p1.m5678a(this, getContext());
        C1161d c1161d = new C1161d(this);
        this.f4306p = c1161d;
        c1161d.m5509e(attributeSet, i11);
        C1154b0 c1154b0 = new C1154b0(this);
        this.f4307q = c1154b0;
        c1154b0.m5477m(attributeSet, i11);
        c1154b0.m5467b();
        this.f4308r = new C1209t(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i11 != 0 ? AbstractC19694b.m103336d(context, i11) : null, i12 != 0 ? AbstractC19694b.m103336d(context, i12) : null, i13 != 0 ? AbstractC19694b.m103336d(context, i13) : null, i14 != 0 ? AbstractC19694b.m103336d(context, i14) : null);
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5480p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i11 != 0 ? AbstractC19694b.m103336d(context, i11) : null, i12 != 0 ? AbstractC19694b.m103336d(context, i12) : null, i13 != 0 ? AbstractC19694b.m103336d(context, i13) : null, i14 != 0 ? AbstractC19694b.m103336d(context, i14) : null);
        C1154b0 c1154b0 = this.f4307q;
        if (c1154b0 != null) {
            c1154b0.m5480p();
        }
    }
}

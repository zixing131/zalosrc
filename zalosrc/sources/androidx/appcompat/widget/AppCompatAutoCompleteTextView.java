package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.AbstractC1640l;
import p175g0.AbstractC19178a;
import p193h0.AbstractC19694b;

/* loaded from: classes2.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView {

    /* renamed from: r */
    private static final int[] f4252r = {R.attr.popupBackground};

    /* renamed from: p */
    private final C1161d f4253p;

    /* renamed from: q */
    private final C1154b0 f4254q;

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC19178a.autoCompleteTextViewStyle);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1161d c1161d = this.f4253p;
        if (c1161d != null) {
            c1161d.m5506b();
        }
        C1154b0 c1154b0 = this.f4254q;
        if (c1154b0 != null) {
            c1154b0.m5467b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1161d c1161d = this.f4253p;
        if (c1161d != null) {
            return c1161d.m5507c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1161d c1161d = this.f4253p;
        if (c1161d != null) {
            return c1161d.m5508d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1170g.m5549a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1161d c1161d = this.f4253p;
        if (c1161d != null) {
            c1161d.m5510f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        C1161d c1161d = this.f4253p;
        if (c1161d != null) {
            c1161d.m5511g(i11);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1640l.m8426q(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i11) {
        setDropDownBackgroundDrawable(AbstractC19694b.m103336d(getContext(), i11));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1161d c1161d = this.f4253p;
        if (c1161d != null) {
            c1161d.m5513i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1161d c1161d = this.f4253p;
        if (c1161d != null) {
            c1161d.m5514j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        C1154b0 c1154b0 = this.f4254q;
        if (c1154b0 != null) {
            c1154b0.m5481q(context, i11);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i11) {
        super(C1202q1.m5687b(context), attributeSet, i11);
        AbstractC1199p1.m5678a(this, getContext());
        C1211t1 m5716v = C1211t1.m5716v(getContext(), attributeSet, f4252r, i11, 0);
        if (m5716v.m5735s(0)) {
            setDropDownBackgroundDrawable(m5716v.m5723g(0));
        }
        m5716v.m5736w();
        C1161d c1161d = new C1161d(this);
        this.f4253p = c1161d;
        c1161d.m5509e(attributeSet, i11);
        C1154b0 c1154b0 = new C1154b0(this);
        this.f4254q = c1154b0;
        c1154b0.m5477m(attributeSet, i11);
        c1154b0.m5467b();
    }
}

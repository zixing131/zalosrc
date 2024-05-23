package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.AbstractC1640l;
import p193h0.AbstractC19694b;

/* loaded from: classes2.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: q */
    private static final int[] f4260q = {R.attr.checkMark};

    /* renamed from: p */
    private final C1154b0 f4261p;

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C1154b0 c1154b0 = this.f4261p;
        if (c1154b0 != null) {
            c1154b0.m5467b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1170g.m5549a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i11) {
        setCheckMarkDrawable(AbstractC19694b.m103336d(getContext(), i11));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1640l.m8426q(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        C1154b0 c1154b0 = this.f4261p;
        if (c1154b0 != null) {
            c1154b0.m5481q(context, i11);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i11) {
        super(C1202q1.m5687b(context), attributeSet, i11);
        AbstractC1199p1.m5678a(this, getContext());
        C1154b0 c1154b0 = new C1154b0(this);
        this.f4261p = c1154b0;
        c1154b0.m5477m(attributeSet, i11);
        c1154b0.m5467b();
        C1211t1 m5716v = C1211t1.m5716v(getContext(), attributeSet, f4260q, i11, 0);
        setCheckMarkDrawable(m5716v.m5723g(0));
        m5716v.m5736w();
    }
}

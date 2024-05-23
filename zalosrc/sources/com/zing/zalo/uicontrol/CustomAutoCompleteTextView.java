package com.zing.zalo.uicontrol;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.C13778s1;
import ed0.AbstractC18391a;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes4.dex */
public class CustomAutoCompleteTextView extends AutoCompleteTextView {

    /* renamed from: p */
    private Drawable f83160p;

    /* renamed from: q */
    private Rect f83161q;

    /* renamed from: r */
    private int f83162r;

    /* renamed from: s */
    private Drawable f83163s;

    /* renamed from: t */
    private Drawable f83164t;

    /* renamed from: u */
    private Drawable f83165u;

    /* renamed from: v */
    boolean f83166v;

    /* renamed from: w */
    boolean f83167w;

    /* renamed from: x */
    boolean f83168x;

    /* renamed from: y */
    private final String f83169y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.CustomAutoCompleteTextView$a */
    /* loaded from: classes4.dex */
    public class C16457a extends AbstractC18391a {
        C16457a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            CustomAutoCompleteTextView customAutoCompleteTextView = CustomAutoCompleteTextView.this;
            if (!customAutoCompleteTextView.f83168x && editable.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            customAutoCompleteTextView.m87728d(z11);
        }
    }

    public CustomAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83162r = 100;
        this.f83166v = false;
        this.f83167w = true;
        this.f83168x = false;
        this.f83169y = "";
        m87727b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m87726c(View view, boolean z11) {
        boolean z12;
        this.f83166v = z11;
        if (!this.f83168x && getText().length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        m87728d(z12);
    }

    /* renamed from: b */
    public void m87727b() {
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.uicontrol.p
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CustomAutoCompleteTextView.this.m87726c(view, z11);
            }
        });
        addTextChangedListener(new C16457a());
        setTextSize(1, getTextSize() / getResources().getDisplayMetrics().density);
    }

    /* renamed from: d */
    void m87728d(boolean z11) {
        if (z11 && this.f83163s == null) {
            this.f83163s = getResources().getDrawable(AbstractC16803z.ic_ipt_clear);
        }
        if (z11 && this.f83166v) {
            setCompoundDrawablesWithIntrinsicBounds(this.f83165u, (Drawable) null, this.f83163s, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(this.f83165u, (Drawable) null, this.f83164t, (Drawable) null);
        }
        postInvalidate();
    }

    protected void finalize() {
        this.f83163s = null;
        this.f83160p = null;
        this.f83161q = null;
        if (this.f83164t != null) {
            this.f83164t = null;
        }
        if (this.f83165u != null) {
            this.f83165u = null;
        }
        super.finalize();
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0 && (drawable = this.f83160p) != null) {
            this.f83161q = drawable.getBounds();
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            this.f83162r = this.f83161q.width() * 2;
            if (!this.f83168x && this.f83167w && x11 >= (getWidth() - this.f83161q.width()) - this.f83162r && x11 <= (getWidth() - getPaddingRight()) + this.f83162r && y11 >= getPaddingTop() - this.f83162r && y11 <= (getHeight() - getPaddingBottom()) + this.f83162r) {
                setText("");
                motionEvent.setAction(3);
                setSelection(0);
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.f83160p = drawable3;
        if (this.f83164t == null && this.f83163s == null) {
            this.f83164t = drawable3;
        }
        if (drawable != null && this.f83165u == null) {
            this.f83165u = drawable;
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    public void setFocus(boolean z11) {
        boolean z12;
        this.f83166v = z11;
        if (!this.f83168x && getText().length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        m87728d(z12);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i11, float f11) {
        if (C13778s1.m76966g()) {
            super.setTextSize(i11, f11 * C13778s1.m76962c());
        } else {
            super.setTextSize(i11, f11);
        }
    }

    public CustomAutoCompleteTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f83162r = 100;
        this.f83166v = false;
        this.f83167w = true;
        this.f83168x = false;
        this.f83169y = "";
        m87727b();
    }
}

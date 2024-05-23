package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import ed0.AbstractC18391a;
import me0.AbstractC23136l9;

/* loaded from: classes4.dex */
public class CustomEditText extends EditTextWithContextMenu {

    /* renamed from: E */
    private Drawable f83171E;

    /* renamed from: F */
    private Rect f83172F;

    /* renamed from: G */
    private int f83173G;

    /* renamed from: H */
    private Drawable f83174H;

    /* renamed from: I */
    private Drawable f83175I;

    /* renamed from: J */
    private Drawable f83176J;

    /* renamed from: K */
    public boolean f83177K;

    /* renamed from: L */
    boolean f83178L;

    /* renamed from: M */
    boolean f83179M;

    /* renamed from: N */
    private String f83180N;

    /* renamed from: O */
    View.OnFocusChangeListener f83181O;

    /* renamed from: P */
    View.OnClickListener f83182P;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicontrol.CustomEditText$a */
    /* loaded from: classes4.dex */
    public class C16458a extends AbstractC18391a {
        C16458a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z11;
            CustomEditText customEditText = CustomEditText.this;
            if (!customEditText.f83179M && editable.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            customEditText.m87734J(z11);
        }
    }

    public CustomEditText(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f83173G = 100;
        this.f83177K = false;
        this.f83178L = true;
        this.f83179M = false;
        this.f83180N = "";
        m87731F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ void m87730H(View view, boolean z11) {
        boolean z12;
        View.OnFocusChangeListener onFocusChangeListener = this.f83181O;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z11);
        }
        this.f83177K = z11;
        if (!this.f83179M && getText().length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        m87734J(z12);
    }

    /* renamed from: F */
    public void m87731F() {
        setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.uicontrol.q
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                CustomEditText.this.m87730H(view, z11);
            }
        });
        addTextChangedListener(new C16458a());
    }

    /* renamed from: G */
    public boolean m87732G() {
        return !this.f83180N.equals(getText().toString());
    }

    /* renamed from: I */
    public void m87733I() {
        boolean z11;
        if (!this.f83179M && length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        m87734J(z11);
    }

    /* renamed from: J */
    public void m87734J(boolean z11) {
        if (z11 && this.f83174H == null) {
            this.f83174H = AbstractC23136l9.m118665N(getContext(), AbstractC16803z.ic_ipt_clear);
        }
        if (z11 && this.f83177K) {
            setCompoundDrawablesWithIntrinsicBounds(this.f83176J, (Drawable) null, this.f83174H, (Drawable) null);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(this.f83176J, (Drawable) null, this.f83175I, (Drawable) null);
        }
        postInvalidate();
    }

    protected void finalize() {
        this.f83174H = null;
        this.f83171E = null;
        this.f83172F = null;
        if (this.f83175I != null) {
            this.f83175I = null;
        }
        if (this.f83176J != null) {
            this.f83176J = null;
        }
        super.finalize();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i11) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i11);
        if (i11 == 16908322 && getTextContextChangeListener() != null) {
            getTextContextChangeListener().mo36093a();
        }
        return onTextContextMenuItem;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable drawable;
        if (motionEvent.getAction() == 0 && (drawable = this.f83171E) != null) {
            this.f83172F = drawable.getBounds();
            int x11 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            this.f83173G = this.f83172F.width() * 2;
            if (!this.f83179M && this.f83178L && x11 >= (getWidth() - this.f83172F.width()) - this.f83173G && x11 <= (getWidth() - getPaddingRight()) + this.f83173G && y11 >= getPaddingTop() - this.f83173G && y11 <= (getHeight() - getPaddingBottom()) + this.f83173G) {
                setText("");
                motionEvent.setAction(3);
                setSelection(0);
                View.OnClickListener onClickListener = this.f83182P;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
            }
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public void setClearDrawable(Drawable drawable) {
        this.f83174H = drawable;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        this.f83171E = drawable3;
        if (this.f83175I == null && this.f83174H == null) {
            this.f83175I = drawable3;
        }
        if (drawable != null && this.f83176J == null) {
            this.f83176J = drawable;
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    public void setDeleteClickListener(View.OnClickListener onClickListener) {
        this.f83182P = onClickListener;
    }

    public void setEnableClearText(boolean z11) {
        this.f83178L = z11;
    }

    public void setFocus(boolean z11) {
        boolean z12;
        this.f83177K = z11;
        if (!this.f83179M && getText().length() > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        m87734J(z12);
    }

    public void setFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f83181O = onFocusChangeListener;
    }

    public void setForceHideClearBtn(boolean z11) {
        this.f83179M = z11;
    }

    public void setOrgText(String str) {
        this.f83180N = str;
        setText(str);
    }

    public void setRightDrawable(Drawable drawable) {
        this.f83175I = drawable;
        setCompoundDrawables(null, null, drawable, null);
    }

    public CustomEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83173G = 100;
        this.f83177K = false;
        this.f83178L = true;
        this.f83179M = false;
        this.f83180N = "";
        m87731F();
    }

    public CustomEditText(Context context) {
        super(context);
        this.f83173G = 100;
        this.f83177K = false;
        this.f83178L = true;
        this.f83179M = false;
        this.f83180N = "";
        m87731F();
    }
}

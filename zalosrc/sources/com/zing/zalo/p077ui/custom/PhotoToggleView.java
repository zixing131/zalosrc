package com.zing.zalo.p077ui.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.widget.Checkable;
import com.zing.zalo.AbstractC8923h0;
import i40.AbstractC20271a;

/* loaded from: classes5.dex */
public class PhotoToggleView extends PhotoView implements Checkable {

    /* renamed from: q */
    private int f61692q;

    /* renamed from: r */
    private int f61693r;

    /* renamed from: s */
    private boolean f61694s;

    /* renamed from: t */
    private ViewPropertyAnimator f61695t;

    /* renamed from: u */
    private AnimatorListenerAdapter f61696u;

    /* renamed from: v */
    private ObjectAnimator f61697v;

    /* renamed from: w */
    private boolean f61698w;

    /* renamed from: x */
    private boolean f61699x;

    /* renamed from: y */
    private boolean f61700y;

    /* renamed from: z */
    private C11875w f61701z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.custom.PhotoToggleView$a */
    /* loaded from: classes5.dex */
    public class C11848a extends AnimatorListenerAdapter {
        C11848a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PhotoToggleView.this.m65853m();
        }
    }

    /* renamed from: com.zing.zalo.ui.custom.PhotoToggleView$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC11849b {
    }

    public PhotoToggleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61692q = -1;
        this.f61693r = -1;
        this.f61694s = false;
        m65852l(attributeSet);
    }

    /* renamed from: j */
    private ViewPropertyAnimator m65850j() {
        ViewPropertyAnimator animate = animate();
        this.f61696u = new C11848a();
        return animate;
    }

    /* renamed from: k */
    private void m65851k() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:            if (r1 == null) goto L11;     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m65852l(AttributeSet attributeSet) {
        TypedArray typedArray = null;
        try {
            try {
                typedArray = getContext().obtainStyledAttributes(attributeSet, AbstractC8923h0.PhotoToggleButton);
                this.f61692q = typedArray.getResourceId(AbstractC8923h0.PhotoToggleButton_checkedImage, -1);
                this.f61693r = typedArray.getResourceId(AbstractC8923h0.PhotoToggleButton_uncheckedImage, -1);
                this.f61694s = typedArray.getBoolean(AbstractC8923h0.PhotoToggleButton_shouldBounce, false);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            typedArray.recycle();
            this.f61701z = new C11875w(this);
            setChecked(false);
            ViewPropertyAnimator m65850j = m65850j();
            this.f61695t = m65850j;
            this.f61697v = AbstractC20271a.m105843a(m65850j);
        } catch (Throwable th2) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m65853m() {
        if (this.f61701z.m65988a() == 0.75f) {
            if (!this.f61698w) {
                m65854n();
            }
        } else if (this.f61701z.m65988a() == 1.0f && this.f61694s && this.f61700y) {
            this.f61697v.start();
            this.f61700y = false;
        }
    }

    /* renamed from: n */
    private void m65854n() {
        this.f61695t.setListener(this.f61696u);
        this.f61695t.setDuration(100L);
        this.f61695t.scaleX(1.0f);
        this.f61695t.scaleY(1.0f);
    }

    /* renamed from: p */
    private void m65855p() {
        this.f61695t.setListener(this.f61696u);
        this.f61695t.setDuration(120L);
        this.f61695t.scaleX(0.75f);
        this.f61695t.scaleY(0.75f);
    }

    @Override // com.zing.zalo.p077ui.custom.PhotoView
    /* renamed from: f */
    public void mo65856f() {
        toggle();
        m65851k();
    }

    @Override // com.zing.zalo.p077ui.custom.PhotoView
    /* renamed from: g */
    public void mo65857g() {
        if (this.f61701z.m65988a() == 0.75f) {
            m65854n();
        }
        this.f61698w = false;
    }

    @Override // com.zing.zalo.p077ui.custom.PhotoView
    /* renamed from: h */
    public void mo65858h() {
        m65855p();
        this.f61698w = true;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f61699x;
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f61695t.start();
        this.f61697v.start();
        this.f61701z.m65989b(1.0f);
        this.f61701z.m65990c(1.0f);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (z11) {
            setImageResource(this.f61692q);
        } else {
            setImageResource(this.f61693r);
        }
        this.f61699x = z11;
        this.f61700y = z11;
    }

    public void setCheckedImageResId(int i11) {
        this.f61692q = i11;
    }

    public void setOnCheckedChangeListener(InterfaceC11849b interfaceC11849b) {
    }

    public void setUncheckedImageResId(int i11) {
        this.f61693r = i11;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f61699x);
    }
}

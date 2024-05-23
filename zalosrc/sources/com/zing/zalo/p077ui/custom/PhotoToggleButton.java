package com.zing.zalo.p077ui.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Checkable;
import com.zing.zalo.AbstractC8923h0;
import i40.AbstractC20271a;
import java.util.ArrayList;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public class PhotoToggleButton extends PhotoButton implements Checkable {

    /* renamed from: A */
    private boolean f61678A;

    /* renamed from: B */
    private boolean f61679B;

    /* renamed from: C */
    private C11875w f61680C;

    /* renamed from: D */
    private AnimatorSet f61681D;

    /* renamed from: E */
    private AnimatorSet f61682E;

    /* renamed from: t */
    private int f61683t;

    /* renamed from: u */
    private int f61684u;

    /* renamed from: v */
    private boolean f61685v;

    /* renamed from: w */
    private boolean f61686w;

    /* renamed from: x */
    private InterfaceC11847c f61687x;

    /* renamed from: y */
    private ObjectAnimator f61688y;

    /* renamed from: z */
    private boolean f61689z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.custom.PhotoToggleButton$a */
    /* loaded from: classes5.dex */
    public class C11845a extends AnimatorListenerAdapter {
        C11845a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PhotoToggleButton.this.m65846g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.custom.PhotoToggleButton$b */
    /* loaded from: classes5.dex */
    public class C11846b extends AnimatorListenerAdapter {
        C11846b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PhotoToggleButton.this.m65846g();
        }
    }

    /* renamed from: com.zing.zalo.ui.custom.PhotoToggleButton$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC11847c {
        /* renamed from: a */
        void mo37055a(PhotoToggleButton photoToggleButton, boolean z11);
    }

    public PhotoToggleButton(Context context) {
        this(context, null);
    }

    /* renamed from: e */
    private void m65844e() {
        InterfaceC11847c interfaceC11847c = this.f61687x;
        if (interfaceC11847c != null) {
            interfaceC11847c.mo37055a(this, this.f61678A);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:            if (r1 == null) goto L11;     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m65845f(AttributeSet attributeSet) {
        TypedArray typedArray = null;
        try {
            try {
                typedArray = getContext().obtainStyledAttributes(attributeSet, AbstractC8923h0.PhotoToggleButton);
                this.f61683t = typedArray.getResourceId(AbstractC8923h0.PhotoToggleButton_checkedImage, -1);
                this.f61684u = typedArray.getResourceId(AbstractC8923h0.PhotoToggleButton_uncheckedImage, -1);
                this.f61685v = typedArray.getBoolean(AbstractC8923h0.PhotoToggleButton_shouldBounce, false);
                this.f61686w = typedArray.getBoolean(AbstractC8923h0.PhotoToggleButton_isAnim, true);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            typedArray.recycle();
            this.f61680C = new C11875w(this);
            setChecked(false);
            this.f61688y = AbstractC20271a.m105843a(this);
            AnimatorSet animatorSet = new AnimatorSet();
            this.f61681D = animatorSet;
            animatorSet.addListener(new C11845a());
            ArrayList arrayList = new ArrayList();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 0.75f);
            ofFloat.setDuration(120L);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 0.75f);
            ofFloat2.setDuration(120L);
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
            this.f61681D.playTogether(arrayList);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f61682E = animatorSet2;
            animatorSet2.addListener(new C11846b());
            ArrayList arrayList2 = new ArrayList();
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this, "scaleX", 0.75f, 1.0f);
            ofFloat3.setDuration(120L);
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this, "scaleY", 0.75f, 1.0f);
            ofFloat4.setDuration(120L);
            arrayList2.add(ofFloat3);
            arrayList2.add(ofFloat4);
            this.f61682E.playTogether(arrayList2);
        } catch (Throwable th2) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m65846g() {
        if (this.f61680C.m65988a() == 0.75f) {
            if (!this.f61689z) {
                m65847h();
            }
        } else if (this.f61680C.m65988a() == 1.0f && this.f61685v && this.f61679B) {
            this.f61688y.start();
            this.f61679B = false;
        }
    }

    /* renamed from: h */
    private void m65847h() {
        this.f61682E.start();
    }

    /* renamed from: i */
    private void m65848i() {
        this.f61681D.start();
    }

    @Override // com.zing.zalo.p077ui.custom.PhotoButton
    /* renamed from: a */
    protected void mo65840a() {
        toggle();
        m65844e();
    }

    @Override // com.zing.zalo.p077ui.custom.PhotoButton
    /* renamed from: b */
    protected void mo65841b() {
        if (this.f61686w && this.f61680C.m65988a() == 0.75f) {
            m65847h();
        }
        this.f61689z = false;
    }

    @Override // com.zing.zalo.p077ui.custom.PhotoButton
    /* renamed from: c */
    protected void mo65842c() {
        if (this.f61686w) {
            m65848i();
        }
        this.f61689z = true;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f61678A;
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f61680C.m65989b(1.0f);
        this.f61680C.m65990c(1.0f);
    }

    public void setAnim(boolean z11) {
        this.f61686w = z11;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (z11) {
            if (this.f61683t > 0) {
                setImageDrawable(AbstractC23136l9.m118665N(getContext(), this.f61683t));
            }
        } else if (this.f61684u > 0) {
            setImageDrawable(AbstractC23136l9.m118665N(getContext(), this.f61684u));
        }
        this.f61678A = z11;
        if (this.f61686w) {
            this.f61679B = z11;
        }
        super.setSelected(z11);
    }

    public void setCheckedImageResId(int i11) {
        this.f61683t = i11;
    }

    public void setOnCheckedChangeListener(InterfaceC11847c interfaceC11847c) {
        this.f61687x = interfaceC11847c;
    }

    public void setUncheckedImageResId(int i11) {
        this.f61684u = i11;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f61678A);
    }

    public PhotoToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61683t = -1;
        this.f61684u = -1;
        this.f61685v = false;
        this.f61686w = true;
        m65845f(attributeSet);
    }
}

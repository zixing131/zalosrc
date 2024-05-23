package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.AbstractC1640l;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import com.zing.zalo.p077ui.widget.RobotoCheckBox;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25808b;
import ti0.C26702a;

/* loaded from: classes7.dex */
public final class CheckCircle extends RobotoCheckBox implements InterfaceC16976f1 {

    /* renamed from: A */
    private Drawable f86245A;

    /* renamed from: B */
    private boolean f86246B;

    /* renamed from: C */
    private EnumC17065u f86247C;

    /* renamed from: D */
    private EnumC17069w f86248D;

    /* renamed from: E */
    private int f86249E;

    /* renamed from: F */
    private Paint f86250F;

    /* renamed from: G */
    private C26702a f86251G;

    /* renamed from: H */
    private float f86252H;

    /* renamed from: I */
    private CharSequence f86253I;

    /* renamed from: w */
    private C25808b f86254w;

    /* renamed from: x */
    private Drawable f86255x;

    /* renamed from: y */
    private Drawable f86256y;

    /* renamed from: z */
    private Drawable f86257z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckCircle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2807a.checkCircleDefaultStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: c */
    private final void m90552c() {
        if (this.f86247C == EnumC17065u.TICK) {
            m90554e();
        } else {
            m90553d();
        }
    }

    /* renamed from: d */
    private final void m90553d() {
        setButtonDrawable(this.f86256y);
    }

    /* renamed from: e */
    private final void m90554e() {
        if (this.f86246B) {
            if (isEnabled()) {
                if (isChecked()) {
                    setButtonDrawable(this.f86257z);
                    Drawable drawable = this.f86257z;
                    if (drawable instanceof AnimatedVectorDrawable) {
                        AbstractC19074t.m100206d(drawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
                        ((AnimatedVectorDrawable) drawable).start();
                    }
                } else {
                    setButtonDrawable(this.f86245A);
                    Drawable drawable2 = this.f86245A;
                    if (drawable2 instanceof AnimatedVectorDrawable) {
                        AbstractC19074t.m100206d(drawable2, "null cannot be cast to non-null type android.graphics.drawable.AnimatedVectorDrawable");
                        ((AnimatedVectorDrawable) drawable2).start();
                    }
                }
            } else {
                setButtonDrawable(this.f86255x);
            }
        } else {
            setButtonDrawable(this.f86255x);
        }
        this.f86246B = true;
    }

    /* renamed from: f */
    private final void m90555f(Canvas canvas) {
        ViewParent parent = getParent();
        AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).setClipToPadding(false);
        ViewParent parent2 = getParent();
        AbstractC19074t.m100206d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent2).setClipChildren(false);
        float f11 = 2;
        float width = getWidth() / f11;
        float width2 = getWidth() / f11;
        float width3 = getWidth() / f11;
        Paint paint = this.f86250F;
        if (paint == null) {
            AbstractC19074t.m100223u("paint");
            paint = null;
        }
        canvas.drawCircle(width, width2, width3, paint);
    }

    private final float getCheckCircleTextSize() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        if (this.f86249E == EnumC17071x.SMALL.m91357c()) {
            AbstractC1640l.m8424o(robotoTextView, AbstractC2814h.checkcircle_text_small);
            return robotoTextView.getTextSize();
        }
        AbstractC1640l.m8424o(robotoTextView, AbstractC2814h.checkcircle_text_normal);
        return robotoTextView.getTextSize();
    }

    private final void getCurrentTextColorState() {
        int i11;
        if (!isEnabled()) {
            if (this.f86248D == EnumC17069w.IMAGE) {
                i11 = AbstractC2807a.checkcircle_checkmark_disabled_image;
            } else {
                i11 = AbstractC2807a.checkcircle_checkmark_disabled;
            }
        } else if (this.f86248D == EnumC17069w.IMAGE) {
            i11 = AbstractC2807a.checkcircle_checkmark_image;
        } else {
            i11 = AbstractC2807a.checkcircle_checkmark;
        }
        C26702a c26702a = this.f86251G;
        if (c26702a == null) {
            AbstractC19074t.m100223u("textPaint");
            c26702a = null;
        }
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        c26702a.setColor(aVar.m13592a(context, i11));
    }

    /* renamed from: h */
    private final void m90556h(Canvas canvas) {
        getCurrentTextColorState();
        int width = canvas.getWidth() / 2;
        float height = canvas.getHeight() / 2;
        C26702a c26702a = this.f86251G;
        C26702a c26702a2 = null;
        if (c26702a == null) {
            AbstractC19074t.m100223u("textPaint");
            c26702a = null;
        }
        float descent = c26702a.descent();
        C26702a c26702a3 = this.f86251G;
        if (c26702a3 == null) {
            AbstractC19074t.m100223u("textPaint");
            c26702a3 = null;
        }
        int ascent = (int) (height - ((descent + c26702a3.ascent()) / 2));
        CharSequence charSequence = this.f86253I;
        if (charSequence == null) {
            AbstractC19074t.m100223u("textCount");
            charSequence = null;
        }
        String obj = charSequence.toString();
        float f11 = width;
        float f12 = ascent;
        C26702a c26702a4 = this.f86251G;
        if (c26702a4 == null) {
            AbstractC19074t.m100223u("textPaint");
        } else {
            c26702a2 = c26702a4;
        }
        canvas.drawText(obj, f11, f12, c26702a2);
    }

    /* renamed from: i */
    private final void m90557i() {
        Paint paint = new Paint(1);
        this.f86250F = paint;
        AbstractC2816j.a aVar = AbstractC2816j.Companion;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        paint.setColor(aVar.m13592a(context, AbstractC2807a.checkcircle_border_image));
        Paint paint2 = this.f86250F;
        C26702a c26702a = null;
        if (paint2 == null) {
            AbstractC19074t.m100223u("paint");
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = this.f86250F;
        if (paint3 == null) {
            AbstractC19074t.m100223u("paint");
            paint3 = null;
        }
        paint3.setStrokeWidth(this.f86252H);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        C26702a c26702a2 = new C26702a(context2, 1);
        this.f86251G = c26702a2;
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        c26702a2.setColor(aVar.m13592a(context3, AbstractC2807a.checkcircle_checkmark));
        C26702a c26702a3 = this.f86251G;
        if (c26702a3 == null) {
            AbstractC19074t.m100223u("textPaint");
            c26702a3 = null;
        }
        c26702a3.m137272b();
        C26702a c26702a4 = this.f86251G;
        if (c26702a4 == null) {
            AbstractC19074t.m100223u("textPaint");
            c26702a4 = null;
        }
        c26702a4.m137273c(getCheckCircleTextSize(), false);
        C26702a c26702a5 = this.f86251G;
        if (c26702a5 == null) {
            AbstractC19074t.m100223u("textPaint");
        } else {
            c26702a = c26702a5;
        }
        c26702a.setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: j */
    private final void m90558j(AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.CheckCircle, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…defStyleRes\n            )");
        this.f86255x = obtainStyledAttributes.getDrawable(AbstractC2815i.CheckCircle_ccNormalDrawable);
        this.f86256y = obtainStyledAttributes.getDrawable(AbstractC2815i.CheckCircle_ccNormalDrawableNumber);
        this.f86257z = obtainStyledAttributes.getDrawable(AbstractC2815i.CheckCircle_ccCheckedAnimDrawable);
        this.f86245A = obtainStyledAttributes.getDrawable(AbstractC2815i.CheckCircle_ccUnCheckedAnimDrawable);
        this.f86246B = false;
        this.f86252H = obtainStyledAttributes.getDimension(AbstractC2815i.CheckCircle_outsideBorderWidth, 0.0f);
        this.f86249E = obtainStyledAttributes.getInt(AbstractC2815i.CheckCircle_checkCircleSize, EnumC17071x.MEDIUM.m91357c());
        int i13 = AbstractC2815i.CheckCircle_placement;
        EnumC17069w enumC17069w = EnumC17069w.CONTAINER;
        if (obtainStyledAttributes.getInt(i13, enumC17069w.m91355c()) != enumC17069w.m91355c()) {
            enumC17069w = EnumC17069w.IMAGE;
        }
        this.f86248D = enumC17069w;
        int i14 = AbstractC2815i.CheckCircle_checkedType;
        EnumC17065u enumC17065u = EnumC17065u.TICK;
        int i15 = obtainStyledAttributes.getInt(i14, enumC17065u.m91346c());
        EnumC17065u enumC17065u2 = EnumC17065u.NUMBER;
        if (i15 == enumC17065u2.m91346c()) {
            enumC17065u = enumC17065u2;
        }
        this.f86247C = enumC17065u;
        String string = obtainStyledAttributes.getString(AbstractC2815i.CheckCircle_trackingId);
        if (string != null && string.length() != 0) {
            setIdTracking(string);
        }
        obtainStyledAttributes.recycle();
        m90552c();
        m90557i();
    }

    /* renamed from: k */
    static /* synthetic */ void m90559k(CheckCircle checkCircle, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        checkCircle.m90558j(attributeSet, i11, i12);
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        CharSequence charSequence = this.f86253I;
        if (charSequence == null) {
            AbstractC19074t.m100223u("textCount");
            return null;
        }
        return charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f86248D == EnumC17069w.IMAGE) {
            m90555f(canvas);
        }
        if (this.f86247C == EnumC17065u.NUMBER && isChecked()) {
            m90556h(canvas);
        }
    }

    public final void setCheckType(EnumC17065u enumC17065u) {
        AbstractC19074t.m100208f(enumC17065u, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f86247C = enumC17065u;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        if (isChecked() == z11) {
            return;
        }
        super.setChecked(z11);
        m90552c();
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86254w;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        C25808b c25808b = this.f86254w;
        if (c25808b == null || !c25808b.m133076e(onClickListener)) {
            super.setOnClickListener(onClickListener);
        }
    }

    public final void setPlacement(EnumC17069w enumC17069w) {
        AbstractC19074t.m100208f(enumC17069w, "placement");
        this.f86248D = enumC17069w;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.f86253I = String.valueOf(charSequence);
        super.setText("", bufferType);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86254w;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckCircle(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86246B = true;
        this.f86247C = EnumC17065u.TICK;
        this.f86248D = EnumC17069w.CONTAINER;
        this.f86249E = EnumC17071x.MEDIUM.m91357c();
        this.f86254w = new C25808b(new WeakReference(this));
        m90559k(this, attributeSet, i11, 0, 4, null);
    }
}

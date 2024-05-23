package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2815i;
import bi0.AbstractC2816j;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import ri0.C25808b;
import ui0.C27276c;

/* loaded from: classes7.dex */
public class Divider extends LinearLayout implements InterfaceC16976f1 {
    public static final C16914a Companion = new C16914a(null);

    /* renamed from: p */
    private C25808b f86259p;

    /* renamed from: q */
    private int f86260q;

    /* renamed from: com.zing.zalo.zdesign.component.Divider$a */
    /* loaded from: classes7.dex */
    public static final class C16914a {
        private C16914a() {
        }

        public /* synthetic */ C16914a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Divider(Context context) {
        this(context, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    private final void m90561a(AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.Divider, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…defStyleRes\n            )");
        this.f86260q = obtainStyledAttributes.getInt(AbstractC2815i.Divider_dividerType, 0);
        if (getBackground() == null) {
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            setBackground(aVar.m13594c(context, AbstractC2807a.divider_01));
        }
        String string = obtainStyledAttributes.getString(AbstractC2815i.Divider_trackingId);
        if (string != null && string.length() != 0) {
            setIdTracking(string);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    static /* synthetic */ void m90562b(Divider divider, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 4) != 0) {
                i12 = 0;
            }
            divider.m90561a(attributeSet, i11, i12);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: parseAttributes");
    }

    /* renamed from: c */
    public void m90563c(int i11, int i12, int i13, int i14) {
        if (getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i14;
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            AbstractC19074t.m100206d(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i12;
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            AbstractC19074t.m100206d(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = i11;
            ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
            AbstractC19074t.m100206d(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin = i13;
        }
    }

    public final int getDividerType() {
        return this.f86260q;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f86260q == 1) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            setMeasuredDimension(C27276c.m139648a(context, 0.5f), i12);
        } else {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            setMeasuredDimension(i11, C27276c.m139648a(context2, 0.5f));
        }
    }

    public final void setDividerType(int i11) {
        this.f86260q = i11;
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25808b c25808b = this.f86259p;
        if (c25808b != null) {
            c25808b.m133075d(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25808b c25808b = this.f86259p;
        if (c25808b != null) {
            c25808b.m133077f(c0708i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Divider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2807a.dividerDefaultStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Divider(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86259p = new C25808b(new WeakReference(this));
        m90562b(this, attributeSet, i11, 0, 4, null);
    }
}

package com.zing.zalo.zdesign.component.slider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2811e;
import bi0.AbstractC2812f;
import bi0.AbstractC2815i;
import com.google.android.material.slider.InterfaceC6398a;
import com.google.android.material.slider.InterfaceC6399b;
import com.google.android.material.slider.RangeSlider;
import com.google.android.material.slider.Slider;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.slider.ZdsSlider;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import ni0.C23797b;
import ui0.C27276c;

/* loaded from: classes7.dex */
public final class ZdsSlider extends FrameLayout {

    /* renamed from: A */
    private CustomSlider f87222A;

    /* renamed from: B */
    private CustomRangeSlider f87223B;

    /* renamed from: C */
    private ViewGroup f87224C;

    /* renamed from: D */
    private ViewGroup f87225D;

    /* renamed from: E */
    private ViewGroup f87226E;

    /* renamed from: F */
    private InterfaceC17047c f87227F;

    /* renamed from: p */
    private int f87228p;

    /* renamed from: q */
    private int f87229q;

    /* renamed from: r */
    private int f87230r;

    /* renamed from: s */
    private int f87231s;

    /* renamed from: t */
    private int f87232t;

    /* renamed from: u */
    private TrackingImageView f87233u;

    /* renamed from: v */
    private RobotoTextView f87234v;

    /* renamed from: w */
    private TrackingImageView f87235w;

    /* renamed from: x */
    private RobotoTextView f87236x;

    /* renamed from: y */
    private RobotoTextView f87237y;

    /* renamed from: z */
    private RobotoTextView f87238z;

    /* renamed from: com.zing.zalo.zdesign.component.slider.ZdsSlider$a */
    /* loaded from: classes7.dex */
    public static final class C17045a implements InterfaceC6399b {
        C17045a() {
        }

        @Override // com.google.android.material.slider.InterfaceC6399b
        /* renamed from: c */
        public void mo32927a(Slider slider) {
            AbstractC19074t.m100208f(slider, "slider");
            InterfaceC17047c interfaceC17047c = ZdsSlider.this.f87227F;
            if (interfaceC17047c != null) {
                interfaceC17047c.mo45799c();
            }
        }

        @Override // com.google.android.material.slider.InterfaceC6399b
        /* renamed from: d */
        public void mo32928b(Slider slider) {
            AbstractC19074t.m100208f(slider, "slider");
            InterfaceC17047c interfaceC17047c = ZdsSlider.this.f87227F;
            if (interfaceC17047c != null) {
                interfaceC17047c.mo45797a();
            }
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.slider.ZdsSlider$b */
    /* loaded from: classes7.dex */
    public static final class C17046b implements InterfaceC6399b {
        C17046b() {
        }

        @Override // com.google.android.material.slider.InterfaceC6399b
        /* renamed from: c */
        public void mo32927a(RangeSlider rangeSlider) {
            AbstractC19074t.m100208f(rangeSlider, "slider");
            InterfaceC17047c interfaceC17047c = ZdsSlider.this.f87227F;
            if (interfaceC17047c != null) {
                interfaceC17047c.mo45799c();
            }
        }

        @Override // com.google.android.material.slider.InterfaceC6399b
        /* renamed from: d */
        public void mo32928b(RangeSlider rangeSlider) {
            AbstractC19074t.m100208f(rangeSlider, "slider");
            InterfaceC17047c interfaceC17047c = ZdsSlider.this.f87227F;
            if (interfaceC17047c != null) {
                interfaceC17047c.mo45797a();
            }
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.slider.ZdsSlider$c */
    /* loaded from: classes7.dex */
    public interface InterfaceC17047c {
        /* renamed from: a */
        void mo45797a();

        /* renamed from: b */
        void mo45798b(float f11);

        /* renamed from: c */
        void mo45799c();
    }

    /* renamed from: com.zing.zalo.zdesign.component.slider.ZdsSlider$d */
    /* loaded from: classes7.dex */
    public enum EnumC17048d {
        NONE(0),
        PADDING(1);


        /* renamed from: p */
        private final int f87244p;

        EnumC17048d(int i11) {
            this.f87244p = i11;
        }

        /* renamed from: c */
        public final int m91253c() {
            return this.f87244p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.slider.ZdsSlider$e */
    /* loaded from: classes7.dex */
    public enum EnumC17049e {
        NONE(-1),
        ICON(0),
        TEXT(1),
        CUSTOM(2);


        /* renamed from: p */
        private final int f87250p;

        EnumC17049e(int i11) {
            this.f87250p = i11;
        }

        /* renamed from: c */
        public final int m91255c() {
            return this.f87250p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.slider.ZdsSlider$f */
    /* loaded from: classes7.dex */
    public enum EnumC17050f {
        TICK_MARK(0),
        NONE_TICK_MARK(1);


        /* renamed from: p */
        private final int f87254p;

        EnumC17050f(int i11) {
            this.f87254p = i11;
        }

        /* renamed from: c */
        public final int m91257c() {
            return this.f87254p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.slider.ZdsSlider$g */
    /* loaded from: classes7.dex */
    public enum EnumC17051g {
        NONE(-1),
        ICON(0),
        TEXT(1),
        CUSTOM(2);


        /* renamed from: p */
        private final int f87260p;

        EnumC17051g(int i11) {
            this.f87260p = i11;
        }

        /* renamed from: c */
        public final int m91259c() {
            return this.f87260p;
        }
    }

    /* renamed from: com.zing.zalo.zdesign.component.slider.ZdsSlider$h */
    /* loaded from: classes7.dex */
    public enum EnumC17052h {
        SINGLE_THUMB_SLIDER(0),
        DOUBLE_THUMB_SLIDER(1);


        /* renamed from: p */
        private final int f87264p;

        EnumC17052h(int i11) {
            this.f87264p = i11;
        }

        /* renamed from: c */
        public final int m91261c() {
            return this.f87264p;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ZdsSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2807a.sliderDefaultStyle);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: c */
    public static final void m91236c(ZdsSlider zdsSlider, Slider slider, float f11, boolean z11) {
        AbstractC19074t.m100208f(zdsSlider, "this$0");
        AbstractC19074t.m100208f(slider, "<anonymous parameter 0>");
        InterfaceC17047c interfaceC17047c = zdsSlider.f87227F;
        if (interfaceC17047c != null) {
            interfaceC17047c.mo45798b(f11);
        }
    }

    /* renamed from: d */
    public static final void m91237d(ZdsSlider zdsSlider, RangeSlider rangeSlider, float f11, boolean z11) {
        AbstractC19074t.m100208f(zdsSlider, "this$0");
        AbstractC19074t.m100208f(rangeSlider, "<anonymous parameter 0>");
        InterfaceC17047c interfaceC17047c = zdsSlider.f87227F;
        if (interfaceC17047c != null) {
            interfaceC17047c.mo45798b(f11);
        }
    }

    /* renamed from: f */
    private final List m91239f(TypedArray typedArray) {
        ArrayList arrayList = new ArrayList();
        int length = typedArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            arrayList.add(Float.valueOf(typedArray.getFloat(i11, -1.0f)));
        }
        return arrayList;
    }

    /* renamed from: g */
    private final void m91240g(boolean z11) {
        CustomRangeSlider customRangeSlider;
        int i11 = this.f87228p;
        if (i11 == EnumC17052h.SINGLE_THUMB_SLIDER.m91261c()) {
            CustomSlider customSlider = this.f87222A;
            if (customSlider != null) {
                customSlider.setEnableTrackSidePadding(z11);
                customSlider.m91233w0();
                return;
            }
            return;
        }
        if (i11 == EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c() && (customRangeSlider = this.f87223B) != null) {
            customRangeSlider.setEnableTrackSidePadding(z11);
            customRangeSlider.m91231z0();
        }
    }

    /* renamed from: i */
    private final void m91241i(TypedArray typedArray) {
        CustomRangeSlider customRangeSlider;
        String string;
        RobotoTextView robotoTextView;
        String string2;
        RobotoTextView robotoTextView2;
        String string3;
        RobotoTextView robotoTextView3;
        String string4;
        RobotoTextView robotoTextView4;
        Drawable drawable;
        TrackingImageView trackingImageView;
        Drawable drawable2;
        TrackingImageView trackingImageView2;
        int i11 = AbstractC2815i.ZdsSlider_sliderType;
        EnumC17052h enumC17052h = EnumC17052h.SINGLE_THUMB_SLIDER;
        this.f87228p = typedArray.getInt(i11, enumC17052h.m91261c());
        this.f87229q = typedArray.getInt(AbstractC2815i.ZdsSlider_sliderSubType, EnumC17050f.NONE_TICK_MARK.m91257c());
        setPaddingType(typedArray.getInt(AbstractC2815i.ZdsSlider_sliderPaddingType, EnumC17048d.NONE.m91253c()));
        ColorStateList colorStateList = typedArray.getColorStateList(AbstractC2815i.ZdsSlider_sliderThumbColor);
        ColorStateList colorStateList2 = typedArray.getColorStateList(AbstractC2815i.ZdsSlider_sliderTrackActiveColor);
        ColorStateList colorStateList3 = typedArray.getColorStateList(AbstractC2815i.ZdsSlider_sliderTrackInActiveColor);
        int color = typedArray.getColor(AbstractC2815i.ZdsSlider_sliderTickActiveColor, 0);
        int color2 = typedArray.getColor(AbstractC2815i.ZdsSlider_sliderTickInActiveColor, 0);
        int color3 = typedArray.getColor(AbstractC2815i.ZdsSlider_sliderPrefixSuffixColor, 0);
        int color4 = typedArray.getColor(AbstractC2815i.ZdsSlider_sliderLabelColor, 0);
        int color5 = typedArray.getColor(AbstractC2815i.ZdsSlider_sliderValueColor, 0);
        CustomSlider customSlider = this.f87222A;
        if (customSlider != null) {
            if (colorStateList != null) {
                customSlider.setThumbTintList(colorStateList);
            }
            if (colorStateList2 != null) {
                customSlider.setTrackActiveTintList(colorStateList2);
            }
            if (colorStateList3 != null) {
                customSlider.setTrackInactiveTintList(colorStateList3);
            }
            customSlider.setCustomTickActiveColor(color);
            customSlider.setCustomTickInactiveColor(color2);
        }
        CustomRangeSlider customRangeSlider2 = this.f87223B;
        if (customRangeSlider2 != null) {
            if (colorStateList != null) {
                customRangeSlider2.setThumbTintList(colorStateList);
            }
            if (colorStateList2 != null) {
                customRangeSlider2.setTrackActiveTintList(colorStateList2);
            }
            if (colorStateList3 != null) {
                customRangeSlider2.setTrackInactiveTintList(colorStateList3);
            }
            customRangeSlider2.setCustomTickActiveColor(color);
            customRangeSlider2.setCustomTickInactiveColor(color2);
        }
        CustomSlider customSlider2 = this.f87222A;
        if (customSlider2 != null) {
            customSlider2.setVisibility(8);
        }
        CustomRangeSlider customRangeSlider3 = this.f87223B;
        if (customRangeSlider3 != null) {
            customRangeSlider3.setVisibility(8);
        }
        int i12 = this.f87228p;
        if (i12 == enumC17052h.m91261c()) {
            CustomSlider customSlider3 = this.f87222A;
            if (customSlider3 != null) {
                customSlider3.setVisibility(0);
                customSlider3.setValueFrom(typedArray.getFloat(AbstractC2815i.ZdsSlider_valueFrom, 0.0f));
                customSlider3.setValueTo(typedArray.getFloat(AbstractC2815i.ZdsSlider_valueTo, 1.0f));
                customSlider3.setValue(typedArray.getFloat(AbstractC2815i.ZdsSlider_value, 0.0f));
                if (this.f87229q == EnumC17050f.TICK_MARK.m91257c()) {
                    customSlider3.setStepSize(typedArray.getFloat(AbstractC2815i.ZdsSlider_stepSize, 0.0f));
                    customSlider3.m91232v0(customSlider3.getStepSize(), customSlider3.getValueFrom(), customSlider3.getValueTo());
                }
            }
        } else if (i12 == EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c() && (customRangeSlider = this.f87223B) != null) {
            customRangeSlider.setVisibility(0);
            customRangeSlider.setValueFrom(typedArray.getFloat(AbstractC2815i.ZdsSlider_valueFrom, 0.0f));
            customRangeSlider.setValueTo(typedArray.getFloat(AbstractC2815i.ZdsSlider_valueTo, 1.0f));
            if (typedArray.hasValue(AbstractC2815i.ZdsSlider_valueRange)) {
                TypedArray obtainTypedArray = typedArray.getResources().obtainTypedArray(typedArray.getResourceId(AbstractC2815i.ZdsSlider_valueRange, 0));
                AbstractC19074t.m100207e(obtainTypedArray, "typedArray.resources.obtainTypedArray(valuesId)");
                customRangeSlider.setValues(m91239f(obtainTypedArray));
                obtainTypedArray.recycle();
            }
            if (typedArray.hasValue(AbstractC2815i.ZdsSlider_doubleThumbMinSeparation)) {
                customRangeSlider.setMinSeparation(typedArray.getFloat(AbstractC2815i.ZdsSlider_doubleThumbMinSeparation, 0.0f));
            }
            if (this.f87229q == EnumC17050f.TICK_MARK.m91257c()) {
                customRangeSlider.setStepSize(typedArray.getFloat(AbstractC2815i.ZdsSlider_stepSize, 0.0f));
                customRangeSlider.m91230y0(customRangeSlider.getStepSize(), customRangeSlider.getValueFrom(), customRangeSlider.getValueTo());
            }
        }
        ViewGroup viewGroup = this.f87224C;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        ViewGroup viewGroup2 = this.f87225D;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        TrackingImageView trackingImageView3 = this.f87233u;
        if (trackingImageView3 != null) {
            trackingImageView3.setColorFilter(color3);
            trackingImageView3.setVisibility(8);
        }
        TrackingImageView trackingImageView4 = this.f87235w;
        if (trackingImageView4 != null) {
            trackingImageView4.setColorFilter(color3);
            trackingImageView4.setVisibility(8);
        }
        RobotoTextView robotoTextView5 = this.f87236x;
        if (robotoTextView5 != null) {
            robotoTextView5.setTextColor(color3);
            robotoTextView5.setVisibility(8);
        }
        RobotoTextView robotoTextView6 = this.f87234v;
        if (robotoTextView6 != null) {
            robotoTextView6.setTextColor(color3);
            robotoTextView6.setVisibility(8);
        }
        int i13 = AbstractC2815i.ZdsSlider_prefixType;
        EnumC17049e enumC17049e = EnumC17049e.NONE;
        int i14 = typedArray.getInt(i13, enumC17049e.m91255c());
        this.f87231s = i14;
        if (i14 == EnumC17049e.ICON.m91255c()) {
            if (typedArray.hasValue(AbstractC2815i.ZdsSlider_prefixIcon) && (drawable2 = typedArray.getDrawable(AbstractC2815i.ZdsSlider_prefixIcon)) != null && (trackingImageView2 = this.f87235w) != null) {
                trackingImageView2.setVisibility(0);
                trackingImageView2.setImageDrawable(drawable2);
            }
            if (typedArray.hasValue(AbstractC2815i.ZdsSlider_suffixIcon) && (drawable = typedArray.getDrawable(AbstractC2815i.ZdsSlider_suffixIcon)) != null && (trackingImageView = this.f87233u) != null) {
                trackingImageView.setVisibility(0);
                trackingImageView.setImageDrawable(drawable);
            }
        } else if (i14 == EnumC17049e.TEXT.m91255c()) {
            if (typedArray.hasValue(AbstractC2815i.ZdsSlider_prefixText) && (string2 = typedArray.getString(AbstractC2815i.ZdsSlider_prefixText)) != null && (robotoTextView2 = this.f87236x) != null) {
                robotoTextView2.setVisibility(0);
                robotoTextView2.setText(string2);
            }
            if (typedArray.hasValue(AbstractC2815i.ZdsSlider_suffixText) && (string = typedArray.getString(AbstractC2815i.ZdsSlider_suffixText)) != null && (robotoTextView = this.f87234v) != null) {
                robotoTextView.setVisibility(0);
                robotoTextView.setText(string);
            }
        } else if (i14 != EnumC17049e.CUSTOM.m91255c() && i14 == enumC17049e.m91255c()) {
            ViewGroup viewGroup3 = this.f87224C;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
            ViewGroup viewGroup4 = this.f87225D;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(8);
            }
        }
        RobotoTextView robotoTextView7 = this.f87238z;
        if (robotoTextView7 != null) {
            robotoTextView7.setTextColor(color4);
            robotoTextView7.setVisibility(8);
        }
        RobotoTextView robotoTextView8 = this.f87237y;
        if (robotoTextView8 != null) {
            robotoTextView8.setTextColor(color5);
            robotoTextView8.setVisibility(8);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsSlider_labelText) && (string4 = typedArray.getString(AbstractC2815i.ZdsSlider_labelText)) != null && (robotoTextView4 = this.f87238z) != null) {
            robotoTextView4.setVisibility(0);
            robotoTextView4.setText(string4);
        }
        if (typedArray.hasValue(AbstractC2815i.ZdsSlider_valueText) && (string3 = typedArray.getString(AbstractC2815i.ZdsSlider_valueText)) != null && (robotoTextView3 = this.f87237y) != null) {
            robotoTextView3.setVisibility(0);
            robotoTextView3.setText(string3);
        }
        typedArray.recycle();
    }

    /* renamed from: j */
    private final void m91242j(AttributeSet attributeSet, int i11, int i12) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2815i.ZdsSlider, i11, i12);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…r, defStyle, defStyleRes)");
        m91241i(obtainStyledAttributes);
    }

    /* renamed from: k */
    static /* synthetic */ void m91243k(ZdsSlider zdsSlider, AttributeSet attributeSet, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        zdsSlider.m91242j(attributeSet, i11, i12);
    }

    private final void setPaddingType(int i11) {
        int i12;
        int i13;
        CustomSlider customSlider;
        this.f87230r = i11;
        EnumC17048d enumC17048d = EnumC17048d.PADDING;
        if (i11 == enumC17048d.m91253c()) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            i12 = C27276c.m139649b(context, 16);
        } else {
            i12 = 0;
        }
        if (this.f87230r == enumC17048d.m91253c()) {
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            i13 = C27276c.m139649b(context2, 16);
        } else {
            i13 = 0;
        }
        setPadding(i12, 0, i13, 0);
        int i14 = this.f87228p;
        if (i14 == EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c()) {
            CustomRangeSlider customRangeSlider = this.f87223B;
            if (customRangeSlider != null) {
                customRangeSlider.m91231z0();
                return;
            }
            return;
        }
        if (i14 == EnumC17052h.SINGLE_THUMB_SLIDER.m91261c() && (customSlider = this.f87222A) != null) {
            customSlider.m91233w0();
        }
    }

    public final float getFromValue() {
        CustomRangeSlider customRangeSlider;
        int i11 = this.f87228p;
        if (i11 == EnumC17052h.SINGLE_THUMB_SLIDER.m91261c()) {
            CustomSlider customSlider = this.f87222A;
            if (customSlider == null) {
                return 0.0f;
            }
            AbstractC19074t.m100205c(customSlider);
            return customSlider.getValueFrom();
        }
        if (i11 != EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c() || (customRangeSlider = this.f87223B) == null) {
            return 0.0f;
        }
        AbstractC19074t.m100205c(customRangeSlider);
        return customRangeSlider.getValueFrom();
    }

    public final String getLabelText() {
        CharSequence charSequence;
        RobotoTextView robotoTextView = this.f87238z;
        if (robotoTextView != null) {
            charSequence = robotoTextView.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return (String) charSequence;
    }

    public final float getMinSeparation() {
        CustomRangeSlider customRangeSlider;
        if (this.f87228p != EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c() || (customRangeSlider = this.f87223B) == null) {
            return 0.0f;
        }
        return customRangeSlider.getMinSeparation();
    }

    public final int getPrefixType() {
        return this.f87231s;
    }

    public final ArrayList<Float> getRangeSliderValue() {
        CustomRangeSlider customRangeSlider;
        if (this.f87228p == EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c() && (customRangeSlider = this.f87223B) != null) {
            AbstractC19074t.m100205c(customRangeSlider);
            customRangeSlider.getValues();
        }
        return new ArrayList<>();
    }

    public final int getSliderType() {
        return this.f87228p;
    }

    public final float getSliderValue() {
        CustomSlider customSlider;
        if (this.f87228p == EnumC17052h.SINGLE_THUMB_SLIDER.m91261c() && (customSlider = this.f87222A) != null) {
            AbstractC19074t.m100205c(customSlider);
            return customSlider.getValue();
        }
        return 0.0f;
    }

    public final float getStepSize() {
        CustomRangeSlider customRangeSlider;
        int i11 = this.f87228p;
        if (i11 == EnumC17052h.SINGLE_THUMB_SLIDER.m91261c()) {
            CustomSlider customSlider = this.f87222A;
            if (customSlider == null) {
                return 0.0f;
            }
            AbstractC19074t.m100205c(customSlider);
            return customSlider.getStepSize();
        }
        if (i11 != EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c() || (customRangeSlider = this.f87223B) == null) {
            return 0.0f;
        }
        AbstractC19074t.m100205c(customRangeSlider);
        return customRangeSlider.getStepSize();
    }

    public final int getSubType() {
        return this.f87229q;
    }

    public final int getSuffixType() {
        return this.f87232t;
    }

    public final float getToValue() {
        CustomRangeSlider customRangeSlider;
        int i11 = this.f87228p;
        if (i11 == EnumC17052h.SINGLE_THUMB_SLIDER.m91261c()) {
            CustomSlider customSlider = this.f87222A;
            if (customSlider == null) {
                return 0.0f;
            }
            AbstractC19074t.m100205c(customSlider);
            return customSlider.getValueTo();
        }
        if (i11 != EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c() || (customRangeSlider = this.f87223B) == null) {
            return 0.0f;
        }
        AbstractC19074t.m100205c(customRangeSlider);
        return customRangeSlider.getValueTo();
    }

    public final String getValueText() {
        CharSequence charSequence;
        RobotoTextView robotoTextView = this.f87237y;
        if (robotoTextView != null) {
            charSequence = robotoTextView.getText();
        } else {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return (String) charSequence;
    }

    /* renamed from: h */
    public final void m91244h(boolean z11) {
        int i11;
        RobotoTextView robotoTextView = this.f87237y;
        if (robotoTextView != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            robotoTextView.setVisibility(i11);
        }
    }

    /* renamed from: l */
    public final void m91245l(float f11, float f12) {
        if (this.f87228p == EnumC17052h.SINGLE_THUMB_SLIDER.m91261c()) {
            CustomSlider customSlider = this.f87222A;
            if (customSlider != null) {
                customSlider.setValueFrom(f11);
                customSlider.setValueTo(f12);
                C23797b helper = customSlider.getHelper();
                if (helper != null) {
                    helper.m124365u(f11);
                    helper.m124366v(f12);
                    return;
                }
                return;
            }
            return;
        }
        CustomRangeSlider customRangeSlider = this.f87223B;
        if (customRangeSlider != null) {
            customRangeSlider.setValueFrom(f11);
            customRangeSlider.setValueTo(f12);
            customRangeSlider.m91229A0();
        }
    }

    /* renamed from: m */
    public final void m91246m(EnumC17049e enumC17049e, Object obj) {
        boolean z11;
        AbstractC19074t.m100208f(enumC17049e, "prefixType");
        this.f87231s = enumC17049e.m91255c();
        ViewGroup viewGroup = this.f87224C;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        TrackingImageView trackingImageView = this.f87235w;
        if (trackingImageView != null) {
            trackingImageView.setVisibility(8);
        }
        RobotoTextView robotoTextView = this.f87236x;
        if (robotoTextView != null) {
            robotoTextView.setVisibility(8);
        }
        if (this.f87232t != EnumC17051g.NONE.m91259c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m91240g(z11);
        int i11 = this.f87231s;
        if (i11 == EnumC17049e.ICON.m91255c()) {
            TrackingImageView trackingImageView2 = this.f87235w;
            if (trackingImageView2 != null) {
                trackingImageView2.setVisibility(0);
                if (obj instanceof Drawable) {
                    trackingImageView2.setImageDrawable((Drawable) obj);
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == EnumC17049e.TEXT.m91255c()) {
            RobotoTextView robotoTextView2 = this.f87236x;
            if (robotoTextView2 != null && obj != null) {
                robotoTextView2.setVisibility(0);
                robotoTextView2.setText(obj.toString());
                return;
            }
            return;
        }
        if (i11 == EnumC17049e.CUSTOM.m91255c()) {
            ViewGroup viewGroup2 = this.f87224C;
            if (viewGroup2 != null && (obj instanceof View)) {
                viewGroup2.addView((View) obj);
                return;
            }
            return;
        }
        if (i11 == EnumC17049e.NONE.m91255c()) {
            m91240g(false);
            ViewGroup viewGroup3 = this.f87224C;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        }
    }

    /* renamed from: n */
    public final void m91247n(EnumC17051g enumC17051g, Object obj) {
        boolean z11;
        AbstractC19074t.m100208f(enumC17051g, "suffixType");
        this.f87232t = enumC17051g.m91259c();
        ViewGroup viewGroup = this.f87225D;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        TrackingImageView trackingImageView = this.f87233u;
        if (trackingImageView != null) {
            trackingImageView.setVisibility(8);
        }
        RobotoTextView robotoTextView = this.f87234v;
        if (robotoTextView != null) {
            robotoTextView.setVisibility(8);
        }
        if (this.f87231s != EnumC17049e.NONE.m91255c()) {
            z11 = true;
        } else {
            z11 = false;
        }
        m91240g(z11);
        int i11 = this.f87232t;
        if (i11 == EnumC17051g.ICON.m91259c()) {
            TrackingImageView trackingImageView2 = this.f87233u;
            if (trackingImageView2 != null) {
                trackingImageView2.setVisibility(0);
                if (obj instanceof Drawable) {
                    trackingImageView2.setImageDrawable((Drawable) obj);
                    return;
                }
                return;
            }
            return;
        }
        if (i11 == EnumC17051g.TEXT.m91259c()) {
            RobotoTextView robotoTextView2 = this.f87234v;
            if (robotoTextView2 != null && obj != null) {
                robotoTextView2.setVisibility(0);
                robotoTextView2.setText(obj.toString());
                return;
            }
            return;
        }
        if (i11 == EnumC17051g.CUSTOM.m91259c()) {
            ViewGroup viewGroup2 = this.f87225D;
            if (viewGroup2 != null && (obj instanceof View)) {
                viewGroup2.addView((View) obj);
                return;
            }
            return;
        }
        if (i11 == EnumC17051g.NONE.m91259c()) {
            m91240g(false);
            ViewGroup viewGroup3 = this.f87225D;
            if (viewGroup3 != null) {
                viewGroup3.setVisibility(8);
            }
        }
    }

    public final void setLabelText(String str) {
        AbstractC19074t.m100208f(str, "label");
        RobotoTextView robotoTextView = this.f87238z;
        if (robotoTextView != null) {
            robotoTextView.setText(str);
        }
    }

    public final void setListener(InterfaceC17047c interfaceC17047c) {
        AbstractC19074t.m100208f(interfaceC17047c, "listener");
        this.f87227F = interfaceC17047c;
    }

    public final void setMinSeparation(float f11) {
        CustomRangeSlider customRangeSlider;
        if (this.f87228p == EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c() && (customRangeSlider = this.f87223B) != null) {
            customRangeSlider.setMinSeparation(f11);
        }
    }

    public final void setRangeSliderValue(ArrayList<Float> arrayList) {
        CustomRangeSlider customRangeSlider;
        AbstractC19074t.m100208f(arrayList, "values");
        if (this.f87228p == EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c() && (customRangeSlider = this.f87223B) != null) {
            customRangeSlider.setValues(arrayList);
            customRangeSlider.m91229A0();
        }
    }

    public final void setSliderType(EnumC17052h enumC17052h) {
        AbstractC19074t.m100208f(enumC17052h, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        this.f87228p = enumC17052h.m91261c();
        CustomSlider customSlider = this.f87222A;
        if (customSlider != null) {
            customSlider.setVisibility(8);
        }
        CustomRangeSlider customRangeSlider = this.f87223B;
        if (customRangeSlider != null) {
            customRangeSlider.setVisibility(8);
        }
        int i11 = this.f87228p;
        boolean z11 = false;
        if (i11 == EnumC17052h.SINGLE_THUMB_SLIDER.m91261c()) {
            CustomSlider customSlider2 = this.f87222A;
            if (customSlider2 != null) {
                customSlider2.setVisibility(0);
            }
            setMinSeparation(0.0f);
        } else if (i11 == EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c()) {
            CustomRangeSlider customRangeSlider2 = this.f87223B;
            if (customRangeSlider2 != null) {
                customRangeSlider2.setVisibility(0);
            }
            AbstractC19074t.m100207e(getContext(), "context");
            setMinSeparation((-C27276c.m139648a(r3, 0.5f)) + 0.05f);
        }
        if (this.f87231s != EnumC17049e.NONE.m91255c() && this.f87232t != EnumC17051g.NONE.m91259c()) {
            z11 = true;
        }
        m91240g(z11);
    }

    public final void setSliderValue(float f11) {
        CustomSlider customSlider;
        if (this.f87228p == EnumC17052h.SINGLE_THUMB_SLIDER.m91261c() && (customSlider = this.f87222A) != null) {
            customSlider.setValue(f11);
            C23797b helper = customSlider.getHelper();
            if (helper != null) {
                helper.m124357j().clear();
                helper.m124357j().add(Float.valueOf(f11));
            }
        }
    }

    public final void setStepSize(float f11) {
        CustomRangeSlider customRangeSlider;
        int i11 = this.f87228p;
        if (i11 == EnumC17052h.SINGLE_THUMB_SLIDER.m91261c()) {
            CustomSlider customSlider = this.f87222A;
            if (customSlider != null) {
                if (this.f87229q != EnumC17050f.TICK_MARK.m91257c()) {
                    f11 = 0.0f;
                }
                customSlider.setStepSize(f11);
                customSlider.m91232v0(customSlider.getStepSize(), customSlider.getValueFrom(), customSlider.getValueTo());
                return;
            }
            return;
        }
        if (i11 == EnumC17052h.DOUBLE_THUMB_SLIDER.m91261c() && (customRangeSlider = this.f87223B) != null) {
            if (this.f87229q != EnumC17050f.TICK_MARK.m91257c()) {
                f11 = 0.0f;
            }
            customRangeSlider.setStepSize(f11);
            customRangeSlider.m91230y0(customRangeSlider.getStepSize(), customRangeSlider.getValueFrom(), customRangeSlider.getValueTo());
        }
    }

    public final void setSubType(EnumC17050f enumC17050f) {
        AbstractC19074t.m100208f(enumC17050f, "subType");
        this.f87229q = enumC17050f.m91257c();
    }

    public final void setValueText(String str) {
        AbstractC19074t.m100208f(str, "value");
        RobotoTextView robotoTextView = this.f87237y;
        if (robotoTextView != null) {
            robotoTextView.setText(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsSlider(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f87228p = EnumC17052h.SINGLE_THUMB_SLIDER.m91261c();
        this.f87229q = EnumC17050f.NONE_TICK_MARK.m91257c();
        this.f87230r = EnumC17048d.NONE.m91253c();
        this.f87231s = EnumC17049e.NONE.m91255c();
        this.f87232t = EnumC17051g.NONE.m91259c();
        LayoutInflater.from(context).inflate(AbstractC2812f.zds_slider_layout, this);
        this.f87233u = (TrackingImageView) findViewById(AbstractC2811e.suffix_icon);
        this.f87235w = (TrackingImageView) findViewById(AbstractC2811e.prefix_icon);
        this.f87236x = (RobotoTextView) findViewById(AbstractC2811e.prefix_text);
        this.f87234v = (RobotoTextView) findViewById(AbstractC2811e.suffix_text);
        this.f87237y = (RobotoTextView) findViewById(AbstractC2811e.txtValue);
        this.f87238z = (RobotoTextView) findViewById(AbstractC2811e.txtLabel);
        CustomSlider customSlider = (CustomSlider) findViewById(AbstractC2811e.slider);
        this.f87222A = customSlider;
        if (customSlider != null) {
            customSlider.mo32911h(new InterfaceC6398a() { // from class: ni0.c
                public /* synthetic */ C23798c() {
                }

                @Override // com.google.android.material.slider.InterfaceC6398a
                /* renamed from: a */
                public final void mo32926a(Object obj, float f11, boolean z11) {
                    ZdsSlider.m91236c(ZdsSlider.this, (Slider) obj, f11, z11);
                }
            });
        }
        CustomSlider customSlider2 = this.f87222A;
        if (customSlider2 != null) {
            customSlider2.mo32912i(new C17045a());
        }
        CustomRangeSlider customRangeSlider = (CustomRangeSlider) findViewById(AbstractC2811e.range_slider);
        this.f87223B = customRangeSlider;
        if (customRangeSlider != null) {
            customRangeSlider.mo32911h(new InterfaceC6398a() { // from class: ni0.d
                public /* synthetic */ C23799d() {
                }

                @Override // com.google.android.material.slider.InterfaceC6398a
                /* renamed from: a */
                public final void mo32926a(Object obj, float f11, boolean z11) {
                    ZdsSlider.m91237d(ZdsSlider.this, (RangeSlider) obj, f11, z11);
                }
            });
        }
        CustomRangeSlider customRangeSlider2 = this.f87223B;
        if (customRangeSlider2 != null) {
            customRangeSlider2.mo32912i(new C17046b());
        }
        this.f87224C = (ViewGroup) findViewById(AbstractC2811e.prefix_container);
        this.f87225D = (ViewGroup) findViewById(AbstractC2811e.suffix_container);
        this.f87226E = (ViewGroup) findViewById(AbstractC2811e.label_container);
        m91243k(this, attributeSet, i11, 0, 4, null);
    }
}

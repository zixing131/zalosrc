package com.zing.zalo.zdesign.component.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import bi0.AbstractC2809c;
import bi0.AbstractC2811e;
import bi0.AbstractC2814h;
import bi0.AbstractC2815i;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.TrackingImageView;
import com.zing.zalo.zdesign.component.chip.ZdsChip;
import fn0.AbstractC19074t;
import ti0.C26705d;
import ti0.C26708g;

/* loaded from: classes7.dex */
public final class ZdsTabChip extends ZdsChip {

    /* renamed from: b0 */
    private RobotoTextView f86679b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsTabChip(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: a */
    public void mo90830a() {
        super.mo90830a();
        RobotoTextView robotoTextView = this.f86679b0;
        if (robotoTextView != null) {
            Context context = robotoTextView.getContext();
            AbstractC19074t.m100207e(context, "context");
            new C26708g(robotoTextView).m137319a(C26705d.m137293a(context, getChipTrailingTextStyle()));
            robotoTextView.setTextColor(getChipTextEnabledColor());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: c */
    public void mo90832c() {
        super.mo90832c();
        this.f86679b0 = (RobotoTextView) findViewById(AbstractC2811e.trailing_text);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: f */
    public void mo90835f(TypedArray typedArray) {
        AbstractC19074t.m100208f(typedArray, "typedArray");
        super.mo90835f(typedArray);
        if (typedArray.hasValue(AbstractC2815i.ZdsChip_chipTrailingText)) {
            String string = typedArray.getString(AbstractC2815i.ZdsChip_chipTrailingText);
            if (string == null) {
                string = "";
            }
            setTrailingText(string);
        }
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: i */
    protected void mo90826i() {
        m90836j(AbstractC2814h.ZdsChip_TabChip);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: m */
    public void mo90838m() {
        int i11;
        super.mo90838m();
        RobotoTextView robotoTextView = this.f86679b0;
        if (robotoTextView != null) {
            if (getTrailingType() == ZdsChip.EnumC16964c.TEXT.m90846c()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            robotoTextView.setVisibility(i11);
        }
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: n */
    protected boolean mo90839n(int i11) {
        if (i11 != ZdsChip.EnumC16963b.AVATAR.m90844c()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: p */
    protected boolean mo90840p(int i11) {
        if (i11 != ZdsChip.EnumC16964c.BUTTON.m90846c()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    public void setEnable(boolean z11) {
        int chipTextDisabledColor;
        int chipTextEnabledColor;
        super.setEnable(z11);
        if (z11 && m90834e()) {
            RobotoTextView robotoTextView = this.f86679b0;
            if (robotoTextView != null) {
                if (m90834e()) {
                    chipTextEnabledColor = getChipTextSelectedColor();
                } else {
                    chipTextEnabledColor = getChipTextEnabledColor();
                }
                robotoTextView.setTextColor(chipTextEnabledColor);
                return;
            }
            return;
        }
        RobotoTextView robotoTextView2 = this.f86679b0;
        if (robotoTextView2 != null) {
            if (z11) {
                chipTextDisabledColor = getChipTextEnabledColor();
            } else {
                chipTextDisabledColor = getChipTextDisabledColor();
            }
            robotoTextView2.setTextColor(chipTextDisabledColor);
        }
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    public void setMaxItemWidth(int i11) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int i12;
        int i13;
        int itemMaxWidth = getItemMaxWidth();
        super.setMaxItemWidth(i11);
        if (itemMaxWidth != i11) {
            RobotoTextView middleText = getMiddleText();
            ViewGroup.LayoutParams layoutParams3 = null;
            if (middleText != null) {
                layoutParams = middleText.getLayoutParams();
            } else {
                layoutParams = null;
            }
            TrackingImageView leadingIcon = getLeadingIcon();
            if (leadingIcon != null) {
                layoutParams2 = leadingIcon.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && (layoutParams2 instanceof ConstraintLayout.LayoutParams)) {
                RobotoTextView robotoTextView = this.f86679b0;
                if (robotoTextView != null) {
                    layoutParams3 = robotoTextView.getLayoutParams();
                }
                if (layoutParams3 instanceof ConstraintLayout.LayoutParams) {
                    RobotoTextView robotoTextView2 = this.f86679b0;
                    if (robotoTextView2 != null && robotoTextView2.getVisibility() == 0) {
                        i12 = ((ConstraintLayout.LayoutParams) layoutParams3).f5506T + robotoTextView2.getResources().getDimensionPixelSize(AbstractC2809c.chip_trailing_container_marginLeft);
                    } else {
                        i12 = 0;
                    }
                    ViewGroup leadingContainer = getLeadingContainer();
                    if (leadingContainer != null && leadingContainer.getVisibility() == 0) {
                        i13 = ((ConstraintLayout.LayoutParams) layoutParams2).f5506T + leadingContainer.getResources().getDimensionPixelSize(AbstractC2809c.chip_leading_container_marginRight);
                    } else {
                        i13 = 0;
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams;
                    int itemMaxWidth2 = (((getItemMaxWidth() - i12) - i13) - getResources().getDimensionPixelSize(AbstractC2809c.chip_container_paddingLeft)) - getResources().getDimensionPixelSize(AbstractC2809c.chip_container_paddingRight);
                    layoutParams4.f5506T = itemMaxWidth2;
                    if (itemMaxWidth2 < 0) {
                        layoutParams4.f5506T = 0;
                    }
                    RobotoTextView middleText2 = getMiddleText();
                    if (middleText2 != null) {
                        middleText2.setLayoutParams(layoutParams);
                    }
                }
            }
        }
    }

    public final void setTrailingText(String str) {
        AbstractC19074t.m100208f(str, "trailingTxt");
        if (getTrailingType() == ZdsChip.EnumC16964c.TEXT.m90846c()) {
            if (str.length() > 0) {
                RobotoTextView robotoTextView = this.f86679b0;
                if (robotoTextView != null) {
                    robotoTextView.setText(str);
                    robotoTextView.setVisibility(0);
                    return;
                }
                return;
            }
            RobotoTextView robotoTextView2 = this.f86679b0;
            if (robotoTextView2 != null) {
                robotoTextView2.setVisibility(8);
            }
        }
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    public void setZdsChipSelected(boolean z11) {
        int chipTextEnabledColor;
        super.setZdsChipSelected(z11);
        RobotoTextView robotoTextView = this.f86679b0;
        if (robotoTextView != null) {
            if (z11) {
                chipTextEnabledColor = getChipTextSelectedColor();
            } else {
                chipTextEnabledColor = getChipTextEnabledColor();
            }
            robotoTextView.setTextColor(chipTextEnabledColor);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsTabChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsTabChip(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}

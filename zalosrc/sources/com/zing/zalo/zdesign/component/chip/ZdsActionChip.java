package com.zing.zalo.zdesign.component.chip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bi0.AbstractC2814h;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.TrackingImageView;
import fn0.AbstractC19074t;
import ti0.C26705d;
import ti0.C26708g;

/* loaded from: classes7.dex */
public final class ZdsActionChip extends ZdsChip {

    /* renamed from: b0 */
    private boolean f86605b0;

    /* renamed from: com.zing.zalo.zdesign.component.chip.ZdsActionChip$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC16961a {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsActionChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m90825r(ZdsActionChip zdsActionChip, View view, MotionEvent motionEvent) {
        TrackingImageView leadingIcon;
        int chipLeadingIconEnabledColor;
        int chipTextEnabledStyle;
        int chipTextEnabledColor;
        AbstractC19074t.m100208f(zdsActionChip, "this$0");
        AbstractC19074t.m100208f(motionEvent, "event");
        if (!zdsActionChip.m90833d()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && zdsActionChip.f86605b0) {
                zdsActionChip.f86605b0 = false;
                zdsActionChip.performClick();
            }
        } else if (!zdsActionChip.f86605b0) {
            zdsActionChip.f86605b0 = true;
            RobotoTextView middleText = zdsActionChip.getMiddleText();
            if (middleText != null) {
                Context context = middleText.getContext();
                AbstractC19074t.m100207e(context, "context");
                if (zdsActionChip.f86605b0) {
                    chipTextEnabledStyle = zdsActionChip.getChipTextPressedStyle();
                } else {
                    chipTextEnabledStyle = zdsActionChip.getChipTextEnabledStyle();
                }
                new C26708g(middleText).m137319a(C26705d.m137293a(context, chipTextEnabledStyle));
                if (zdsActionChip.f86605b0) {
                    chipTextEnabledColor = zdsActionChip.getChipTextPressedColor();
                } else {
                    chipTextEnabledColor = zdsActionChip.getChipTextEnabledColor();
                }
                middleText.setTextColor(chipTextEnabledColor);
            }
            if (zdsActionChip.getLeadingIcon() != null && (leadingIcon = zdsActionChip.getLeadingIcon()) != null) {
                if (zdsActionChip.f86605b0) {
                    chipLeadingIconEnabledColor = zdsActionChip.getChipLeadingIconPressedColor();
                } else {
                    chipLeadingIconEnabledColor = zdsActionChip.getChipLeadingIconEnabledColor();
                }
                leadingIcon.setColorFilter(chipLeadingIconEnabledColor);
            }
            ConstraintLayout mainContainer = zdsActionChip.getMainContainer();
            if (mainContainer != null) {
                mainContainer.setSelected(zdsActionChip.f86605b0);
            }
        }
        return true;
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: i */
    protected void mo90826i() {
        m90836j(AbstractC2814h.ZdsChip_ActionChip);
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: k */
    protected void mo90827k() {
        setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.zdesign.component.chip.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m90825r;
                m90825r = ZdsActionChip.m90825r(ZdsActionChip.this, view, motionEvent);
                return m90825r;
            }
        });
    }

    public final void setListener(InterfaceC16961a interfaceC16961a) {
        AbstractC19074t.m100208f(interfaceC16961a, "zdsActionChipListener");
    }

    @Override // android.view.View
    public void setSelected(boolean z11) {
        if (!m90833d()) {
            return;
        }
        setZdsChipSelected(z11);
        super.setSelected(z11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsActionChip(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}

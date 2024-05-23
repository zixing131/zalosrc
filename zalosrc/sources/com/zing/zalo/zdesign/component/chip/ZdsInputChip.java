package com.zing.zalo.zdesign.component.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.ViewGroup;
import bi0.AbstractC2814h;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zdesign.component.chip.ZdsChip;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class ZdsInputChip extends ZdsChip {

    /* renamed from: b0 */
    private Avatar f86677b0;

    /* renamed from: c0 */
    private Button f86678c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsInputChip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: c */
    public void mo90832c() {
        super.mo90832c();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        Avatar avatar = new Avatar(context);
        Context context2 = avatar.getContext();
        AbstractC19074t.m100207e(context2, "context");
        avatar.m90481x(context2, EnumC16949e.SIZE_24);
        this.f86677b0 = avatar;
        ViewGroup leadingContainer = getLeadingContainer();
        if (leadingContainer != null) {
            leadingContainer.addView(this.f86677b0);
        }
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: i */
    protected void mo90826i() {
        m90836j(AbstractC2814h.ZdsChip_InputChip);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: l */
    public void mo90837l() {
        int i11;
        super.mo90837l();
        Avatar avatar = this.f86677b0;
        if (avatar != null) {
            if (getLeadingType() == ZdsChip.EnumC16963b.AVATAR.m90844c()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            avatar.setVisibility(i11);
        }
        getLeadingType();
        ZdsChip.EnumC16963b.AVATAR.m90844c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: m */
    public void mo90838m() {
        super.mo90838m();
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    /* renamed from: p */
    protected boolean mo90840p(int i11) {
        if (i11 != ZdsChip.EnumC16964c.TEXT.m90846c()) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zdesign.component.chip.ZdsChip
    public void setEnable(boolean z11) {
        int chipTrailingIconDisabledColor;
        super.setEnable(z11);
        Button button = this.f86678c0;
        if (button != null) {
            if (z11) {
                chipTrailingIconDisabledColor = getChipTrailingIconEnabledColor();
            } else {
                chipTrailingIconDisabledColor = getChipTrailingIconDisabledColor();
            }
            button.setSupportiveIconTintColor(ColorStateList.valueOf(chipTrailingIconDisabledColor));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZdsInputChip(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}

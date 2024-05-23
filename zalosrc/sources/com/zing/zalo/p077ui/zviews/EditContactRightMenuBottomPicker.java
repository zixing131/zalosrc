package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;

/* loaded from: classes6.dex */
public class EditContactRightMenuBottomPicker extends BottomPickerView implements View.OnClickListener {

    /* renamed from: U0 */
    View f73171U0;

    /* renamed from: V0 */
    View f73172V0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    public View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo62728eL = super.mo62728eL(layoutInflater, viewGroup, bundle);
        this.f83659I0 = mo62728eL;
        View findViewById = mo62728eL.findViewById(AbstractC6918a0.edit_group_avt);
        this.f73171U0 = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = this.f83659I0.findViewById(AbstractC6918a0.edit_group_name);
        this.f73172V0 = findViewById2;
        findViewById2.setOnClickListener(this);
        return this.f83659I0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.edit_contact_right_menu_bottom_picker_layout;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != AbstractC6918a0.edit_group_avt) {
            if (id2 != AbstractC6918a0.edit_group_name) {
                return;
            }
            dismiss();
            throw null;
        }
        dismiss();
        throw null;
    }
}

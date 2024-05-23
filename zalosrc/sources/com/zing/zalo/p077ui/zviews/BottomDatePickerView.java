package com.zing.zalo.p077ui.zviews;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import java.util.Calendar;

/* loaded from: classes6.dex */
public class BottomDatePickerView extends BottomPickerView {

    /* renamed from: U0 */
    DatePicker f72439U0;

    /* renamed from: V0 */
    TextView f72440V0;

    /* renamed from: W0 */
    View f72441W0;

    /* renamed from: X0 */
    TextView f72442X0;

    /* renamed from: Y0 */
    View f72443Y0;

    /* renamed from: Z0 */
    String f72444Z0;

    /* renamed from: a1 */
    Calendar f72445a1;

    /* renamed from: b1 */
    ObjectAnimator f72446b1 = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oL */
    public /* synthetic */ void m78531oL(DatePicker datePicker, int i11, int i12, int i13) {
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: ZK */
    protected int mo78532ZK(boolean z11) {
        return 150;
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: aL */
    protected int mo78533aL() {
        return AbstractC8915g0.BottomDatePicker;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.bottom_date_picker_view;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.date_picker_btn_done_container) {
            return;
        }
        if (id2 == AbstractC6918a0.date_picker_imv_close) {
            dismiss();
        }
        super.onClick(view);
    }

    /* renamed from: pL */
    void m78534pL(Calendar calendar) {
        DatePicker datePicker;
        if (calendar != null && (datePicker = this.f72439U0) != null) {
            datePicker.updateDate(calendar.get(1), calendar.get(2), calendar.get(5));
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        String str;
        int i11;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("title");
        } else {
            str = null;
        }
        this.f72444Z0 = str;
        Calendar calendar = Calendar.getInstance();
        DatePicker datePicker = (DatePicker) this.f83659I0.findViewById(AbstractC6918a0.date_picker);
        this.f72439U0 = datePicker;
        datePicker.init(calendar.get(1), calendar.get(2), calendar.get(5), new DatePicker.OnDateChangedListener() { // from class: com.zing.zalo.ui.zviews.y2
            @Override // android.widget.DatePicker.OnDateChangedListener
            public final void onDateChanged(DatePicker datePicker2, int i12, int i13, int i14) {
                BottomDatePickerView.this.m78531oL(datePicker2, i12, i13, i14);
            }
        });
        Calendar calendar2 = this.f72445a1;
        if (calendar2 != null) {
            m78534pL(calendar2);
        }
        TextView textView = (TextView) this.f83659I0.findViewById(AbstractC6918a0.date_picker_tv_title);
        this.f72440V0 = textView;
        textView.setText(this.f72444Z0);
        TextView textView2 = this.f72440V0;
        if (TextUtils.isEmpty(this.f72444Z0)) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        textView2.setVisibility(i11);
        View findViewById = this.f83659I0.findViewById(AbstractC6918a0.date_picker_btn_done_container);
        this.f72441W0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f72442X0 = (TextView) this.f83659I0.findViewById(AbstractC6918a0.date_picker_tv_done);
        View findViewById2 = this.f83659I0.findViewById(AbstractC6918a0.date_picker_imv_close);
        this.f72443Y0 = findViewById2;
        findViewById2.setOnClickListener(this);
    }
}

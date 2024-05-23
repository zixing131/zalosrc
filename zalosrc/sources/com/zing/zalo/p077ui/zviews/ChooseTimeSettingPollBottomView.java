package com.zing.zalo.p077ui.zviews;

import android.R;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.dialog.datetimepicker.DateTimePickerLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import me0.AbstractC23160o0;

/* loaded from: classes6.dex */
public class ChooseTimeSettingPollBottomView extends BottomPickerView {

    /* renamed from: U0 */
    ImageView f72755U0;

    /* renamed from: V0 */
    ImageView f72756V0;

    /* renamed from: W0 */
    RobotoTextView f72757W0;

    /* renamed from: X0 */
    View f72758X0;

    /* renamed from: Y0 */
    View f72759Y0;

    /* renamed from: Z0 */
    ImageView f72760Z0;

    /* renamed from: a1 */
    View f72761a1;

    /* renamed from: b1 */
    ImageView f72762b1;

    /* renamed from: c1 */
    View f72763c1;

    /* renamed from: d1 */
    RobotoTextView f72764d1;

    /* renamed from: e1 */
    DateTimePickerLayout f72765e1;

    /* renamed from: f1 */
    RobotoTextView f72766f1;

    /* renamed from: g1 */
    long f72767g1;

    /* renamed from: h1 */
    int f72768h1 = 0;

    /* renamed from: i1 */
    InterfaceC14161a f72769i1;

    /* renamed from: com.zing.zalo.ui.zviews.ChooseTimeSettingPollBottomView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC14161a extends BottomPickerView.InterfaceC14112a {
        /* renamed from: e */
        void mo78835e(long j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qL */
    public /* synthetic */ void m78827qL(long j11) {
        this.f72767g1 = j11;
        m78830wL();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rL */
    public static /* synthetic */ boolean m78828rL(InterfaceC17463d interfaceC17463d, int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            keyEvent.getAction();
            return false;
        }
        return false;
    }

    /* renamed from: sL */
    public static ChooseTimeSettingPollBottomView m78829sL(long j11, InterfaceC14161a interfaceC14161a) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        ChooseTimeSettingPollBottomView chooseTimeSettingPollBottomView = new ChooseTimeSettingPollBottomView();
        m78535kL.putLong("LONG_EXTRA_END_TIME_POLL", j11);
        chooseTimeSettingPollBottomView.m78833uL(interfaceC14161a);
        chooseTimeSettingPollBottomView.mo60305zK(m78535kL);
        return chooseTimeSettingPollBottomView;
    }

    /* renamed from: wL */
    private void m78830wL() {
        RobotoTextView robotoTextView = this.f72764d1;
        if (robotoTextView != null) {
            robotoTextView.setText(AbstractC23160o0.m119206M0(getContext(), this.f72767g1));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    public View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View mo62728eL = super.mo62728eL(layoutInflater.cloneInContext(new ContextThemeWrapper(m92648SI(), R.style.Theme.Holo.Light)), viewGroup, bundle);
        this.f83659I0 = mo62728eL;
        ImageView imageView = (ImageView) mo62728eL.findViewById(AbstractC6918a0.picker_back_btn);
        this.f72755U0 = imageView;
        imageView.setOnClickListener(this);
        ImageView imageView2 = (ImageView) this.f83659I0.findViewById(AbstractC6918a0.picker_close_btn);
        this.f72756V0 = imageView2;
        imageView2.setOnClickListener(this);
        this.f72757W0 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.picker_title);
        this.f72758X0 = this.f83659I0.findViewById(AbstractC6918a0.page_general);
        View findViewById = this.f83659I0.findViewById(AbstractC6918a0.end_time_poll_no_limit_container);
        this.f72759Y0 = findViewById;
        findViewById.setOnClickListener(this);
        this.f72760Z0 = (ImageView) this.f83659I0.findViewById(AbstractC6918a0.end_time_poll_no_limit_cb);
        View findViewById2 = this.f83659I0.findViewById(AbstractC6918a0.end_time_poll_choose_time_container);
        this.f72761a1 = findViewById2;
        findViewById2.setOnClickListener(this);
        this.f72762b1 = (ImageView) this.f83659I0.findViewById(AbstractC6918a0.end_time_poll_choose_time_cb);
        this.f72763c1 = this.f83659I0.findViewById(AbstractC6918a0.page_pick_time);
        this.f72764d1 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.time_pick_tv);
        RobotoTextView robotoTextView = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.btn_done);
        this.f72766f1 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        m92598PK(new InterfaceC17463d.f() { // from class: com.zing.zalo.ui.zviews.n6
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.f
            /* renamed from: Tx */
            public final boolean mo87296Tx(InterfaceC17463d interfaceC17463d, int i11, KeyEvent keyEvent) {
                boolean m78828rL;
                m78828rL = ChooseTimeSettingPollBottomView.m78828rL(interfaceC17463d, i11, keyEvent);
                return m78828rL;
            }
        });
        return this.f83659I0;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: lL */
    protected View mo78264lL() {
        DateTimePickerLayout dateTimePickerLayout = this.f72765e1;
        if (dateTimePickerLayout != null && dateTimePickerLayout.getVisibility() == 0) {
            return this.f72765e1;
        }
        return null;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.choose_end_time_poll_bottom_picker_layout;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.picker_back_btn) {
            if (this.f72768h1 == 1) {
                m78834vL(0);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.picker_close_btn) {
            dismiss();
            return;
        }
        if (id2 == AbstractC6918a0.btn_done) {
            InterfaceC14161a interfaceC14161a = this.f72769i1;
            if (interfaceC14161a != null) {
                interfaceC14161a.mo78835e(this.f72767g1);
            }
            dismiss();
            return;
        }
        if (id2 == AbstractC6918a0.end_time_poll_no_limit_container) {
            this.f72767g1 = 0L;
            m78832tL();
        } else if (id2 == AbstractC6918a0.end_time_poll_choose_time_container) {
            this.f72767g1 = Math.max(this.f72767g1, System.currentTimeMillis());
            m78830wL();
            m78832tL();
            m78834vL(1);
        }
    }

    /* renamed from: pL */
    void m78831pL() {
        if (this.f72765e1 == null) {
            DateTimePickerLayout dateTimePickerLayout = (DateTimePickerLayout) this.f83659I0.findViewById(AbstractC6918a0.date_time_picker_layout);
            this.f72765e1 = dateTimePickerLayout;
            dateTimePickerLayout.setListener(new DateTimePickerLayout.InterfaceC8002a() { // from class: com.zing.zalo.ui.zviews.o6
                @Override // com.zing.zalo.dialog.datetimepicker.DateTimePickerLayout.InterfaceC8002a
                /* renamed from: a */
                public final void mo43126a(long j11) {
                    ChooseTimeSettingPollBottomView.this.m78827qL(j11);
                }
            });
        }
        this.f72765e1.m43124c();
        this.f72765e1.setTime(this.f72767g1);
    }

    /* renamed from: tL */
    void m78832tL() {
        if (this.f72767g1 > 0) {
            this.f72762b1.setImageResource(AbstractC16803z.ic_icn_form_checkbox_round_checked);
            this.f72760Z0.setImageResource(AbstractC16803z.icn_form_checkbox_round_unchecked);
        } else {
            this.f72760Z0.setImageResource(AbstractC16803z.ic_icn_form_checkbox_round_checked);
            this.f72762b1.setImageResource(AbstractC16803z.icn_form_checkbox_round_unchecked);
        }
    }

    /* renamed from: uL */
    public void m78833uL(InterfaceC14161a interfaceC14161a) {
        this.f72769i1 = interfaceC14161a;
        this.f72452T0 = interfaceC14161a;
    }

    /* renamed from: vL */
    void m78834vL(int i11) {
        this.f72768h1 = i11;
        if (i11 != 0) {
            if (i11 == 1) {
                this.f72758X0.setVisibility(8);
                this.f72763c1.setVisibility(0);
                this.f72755U0.setVisibility(0);
                m78831pL();
                return;
            }
            return;
        }
        this.f72758X0.setVisibility(0);
        this.f72763c1.setVisibility(8);
        this.f72755U0.setVisibility(8);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m92594JK().m92867k().m92901h().flags |= 65536;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f72767g1 = m92642L3.getLong("LONG_EXTRA_END_TIME_POLL", 0L);
        }
        m78832tL();
    }
}

package com.zing.zalo.uicontrol;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import bo.C3000l0;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import me0.AbstractC23136l9;
import tn.C26767v;

/* loaded from: classes4.dex */
public class FeedAsyncFailedPopupView extends ContentPickerPopupView implements View.OnClickListener {

    /* renamed from: O0 */
    InterfaceC16459a f83184O0;

    /* renamed from: P0 */
    private View f83185P0;

    /* renamed from: Q0 */
    private View f83186Q0;

    /* renamed from: R0 */
    private RobotoTextView f83187R0;

    /* renamed from: S0 */
    private View f83188S0;

    /* renamed from: T0 */
    private RobotoTextView f83189T0;

    /* renamed from: U0 */
    private RobotoTextView f83190U0;

    /* renamed from: V0 */
    private RobotoTextView f83191V0;

    /* renamed from: W0 */
    private String f83192W0;

    /* renamed from: X0 */
    private int f83193X0;

    /* renamed from: com.zing.zalo.uicontrol.FeedAsyncFailedPopupView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC16459a {
        /* renamed from: a */
        void mo82051a(String str);

        /* renamed from: b */
        void mo82052b(String str);
    }

    /* renamed from: kL */
    public static FeedAsyncFailedPopupView m87736kL(String str, int i11, InterfaceC16459a interfaceC16459a) {
        Bundle bundle = new Bundle();
        bundle.putInt("gravity", 80);
        bundle.putInt("window_animation_type", 1);
        bundle.putString("feed_async_id", str);
        bundle.putInt("error_code_upload", i11);
        FeedAsyncFailedPopupView feedAsyncFailedPopupView = new FeedAsyncFailedPopupView();
        feedAsyncFailedPopupView.mo60305zK(bundle);
        feedAsyncFailedPopupView.m92601SK(2, 0);
        feedAsyncFailedPopupView.m87738lL(interfaceC16459a);
        return feedAsyncFailedPopupView;
    }

    /* renamed from: mL */
    private void m87737mL() {
        boolean z11;
        int i11;
        int i12;
        C3000l0.w m108845y = AbstractC20826v0.m108845y(this.f83193X0, this.f83192W0);
        C3000l0 m137785c = C26767v.m137782d().m137785c(this.f83192W0);
        int i13 = 0;
        if (m137785c != null && m137785c.m14322a0() != null && m137785c.m14322a0().m14488S()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            i11 = AbstractC8020f0.str_retry_edit_feed_async;
        } else {
            i11 = AbstractC8020f0.str_retry_feed_async;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        if (z11) {
            i12 = AbstractC8020f0.str_delete_edit_feed_async;
        } else {
            i12 = AbstractC8020f0.str_delete_feed_async;
        }
        String m118743r02 = AbstractC23136l9.m118743r0(i12);
        RobotoTextView robotoTextView = this.f83190U0;
        if (robotoTextView != null) {
            robotoTextView.setText(m108845y.f11951b);
        }
        RobotoTextView robotoTextView2 = this.f83191V0;
        if (robotoTextView2 != null) {
            robotoTextView2.setText(m108845y.f11952c);
        }
        RobotoTextView robotoTextView3 = this.f83187R0;
        if (robotoTextView3 != null) {
            robotoTextView3.setText(m118743r0);
        }
        RobotoTextView robotoTextView4 = this.f83189T0;
        if (robotoTextView4 != null) {
            robotoTextView4.setText(m118743r02);
        }
        View view = this.f83186Q0;
        if (view != null) {
            if (!m108845y.f11953d) {
                i13 = 8;
            }
            view.setVisibility(i13);
        }
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                this.f83192W0 = m92642L3.getString("feed_async_id", "");
                this.f83193X0 = m92642L3.getInt("error_code_upload", -1000);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    protected View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.feed_async_failed_popup_view, viewGroup, true);
        try {
            this.f83185P0 = inflate.findViewById(AbstractC6918a0.btnClose);
            this.f83186Q0 = inflate.findViewById(AbstractC6918a0.viewRetry);
            this.f83187R0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tvRetry);
            this.f83188S0 = inflate.findViewById(AbstractC6918a0.viewDelete);
            this.f83189T0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tvDelete);
            this.f83190U0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tvStatusPost);
            this.f83191V0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tvDescription);
            this.f83185P0.setOnClickListener(this);
            this.f83186Q0.setOnClickListener(this);
            this.f83188S0.setOnClickListener(this);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return inflate;
    }

    /* renamed from: lL */
    public void m87738lL(InterfaceC16459a interfaceC16459a) {
        this.f83184O0 = interfaceC16459a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC16459a interfaceC16459a;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btnClose) {
            if (m92594JK() != null) {
                m92594JK().dismiss();
            }
        } else {
            if (id2 == AbstractC6918a0.viewRetry) {
                InterfaceC16459a interfaceC16459a2 = this.f83184O0;
                if (interfaceC16459a2 != null) {
                    interfaceC16459a2.mo82052b(this.f83192W0);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.viewDelete && (interfaceC16459a = this.f83184O0) != null) {
                interfaceC16459a.mo82051a(this.f83192W0);
            }
        }
    }

    @Override // com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m87737mL();
    }
}

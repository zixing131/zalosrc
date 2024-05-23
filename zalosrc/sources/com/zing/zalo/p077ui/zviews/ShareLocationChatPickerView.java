package com.zing.zalo.p077ui.zviews;

import ag0.C0815e1;
import android.os.Bundle;
import android.view.View;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.location.C8967m;
import com.zing.zalo.p077ui.picker.location.LocationPickerView;
import p361nb.C23648e;

/* loaded from: classes6.dex */
public class ShareLocationChatPickerView extends BottomPickerView {

    /* renamed from: U0 */
    View f77688U0;

    /* renamed from: V0 */
    private LocationPickerView.InterfaceC12771b f77689V0;

    /* renamed from: W0 */
    public int f77690W0;

    /* renamed from: X0 */
    LocationPickerView f77691X0;

    /* renamed from: Y0 */
    View f77692Y0;

    /* renamed from: Z0 */
    String f77693Z0;

    /* renamed from: a1 */
    ShareLocationChatPickerView f77694a1 = this;

    /* renamed from: b1 */
    String f77695b1 = "";

    /* renamed from: c1 */
    String f77696c1 = "0";

    /* renamed from: d1 */
    private SensitiveData f77697d1;

    /* renamed from: oL */
    public static ShareLocationChatPickerView m84327oL(String str, int i11, LocationPickerView.InterfaceC12771b interfaceC12771b, SensitiveData sensitiveData) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        m78535kL.putString("extra_conversation_id", str);
        ShareLocationChatPickerView shareLocationChatPickerView = new ShareLocationChatPickerView();
        shareLocationChatPickerView.m84329pL(interfaceC12771b);
        shareLocationChatPickerView.f77690W0 = i11;
        shareLocationChatPickerView.f77697d1 = sensitiveData;
        shareLocationChatPickerView.mo60305zK(m78535kL);
        return shareLocationChatPickerView;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        try {
            super.mo37125ZJ(view, bundle);
            this.f77692Y0 = view.findViewById(AbstractC6918a0.layout_location_wrapper);
            View findViewById = view.findViewById(AbstractC6918a0.btn_close_location);
            this.f77688U0 = findViewById;
            findViewById.setOnClickListener(this);
            if (m92642L3() == null) {
                str = "";
            } else {
                str = m92642L3().getString("extra_conversation_id");
            }
            this.f77693Z0 = str;
            m84328nL();
            Bundle m92642L3 = m92642L3();
            if (m92642L3 != null) {
                this.f77695b1 = m92642L3.getString("STR_SOURCE_START_VIEW", "");
                this.f77696c1 = m92642L3.getString("STR_LOG_CHAT_TYPE", "0");
            }
            C0815e1.m2075D().m2100V(new C23648e(11, this.f77695b1, 1, "chat_send_location", this.f77696c1), false);
        } catch (Exception unused) {
            this.f77694a1.dismiss();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.layout_share_location_chat_picker_view;
    }

    /* renamed from: nL */
    void m84328nL() {
        try {
            LocationPickerView locationPickerView = this.f77691X0;
            if (locationPickerView == null) {
                this.f77691X0 = new LocationPickerView();
                if (this.f77690W0 > 0) {
                    this.f77692Y0.getLayoutParams().height = this.f77690W0;
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("extra_from_update_status", false);
                bundle.putString("EXTRA_STR_CHAT_CONVERSATION_ID", this.f77693Z0);
                bundle.putBoolean("EXTRA_BOOL_HAS_NEARBY_PLACES_TITLE", true);
                bundle.putParcelable("EXTRA_SENSITIVE_DATA", this.f77697d1);
                if (C8967m.m47871T(this.f77693Z0)) {
                    bundle.putBoolean("EXTRA_BOOL_HAS_LIVE_LOCATION_HEADER", true);
                }
                this.f77691X0.mo60305zK(bundle);
                if (m92676n2() != null && !m92676n2().isFinishing() && !mo60294yp()) {
                    m92649TI().m93058d2(AbstractC6918a0.layout_container_location_picker_view, this.f77691X0, 0, "LocationPickerView", 0, false);
                    this.f77691X0.m72044zN(this.f77689V0);
                    return;
                }
                return;
            }
            locationPickerView.m72040TM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_close_location) {
            this.f77694a1.dismiss();
        } else {
            super.onClick(view);
        }
    }

    /* renamed from: pL */
    public void m84329pL(LocationPickerView.InterfaceC12771b interfaceC12771b) {
        this.f77689V0 = interfaceC12771b;
        LocationPickerView locationPickerView = this.f77691X0;
        if (locationPickerView != null) {
            locationPickerView.m72044zN(interfaceC12771b);
        }
    }
}

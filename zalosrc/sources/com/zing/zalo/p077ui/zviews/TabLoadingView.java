package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zview.ZaloView;
import me0.C23212s8;
import o70.C24099q0;

/* loaded from: classes6.dex */
public class TabLoadingView extends ZaloView {

    /* renamed from: w0 */
    private boolean f78224w0 = false;

    /* renamed from: x0 */
    private boolean f78225x0 = false;

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("SHOW_FAKE_SUBTAB_VIEW")) {
                this.f78224w0 = m92642L3.getBoolean("SHOW_FAKE_SUBTAB_VIEW", false);
            }
            if (m92642L3.containsKey("bol_background_white")) {
                this.f78225x0 = m92642L3.getBoolean("bol_background_white", false);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11;
        View findViewById;
        if (this.f78224w0) {
            i11 = AbstractC7409c0.loading_fragment_phonebook;
        } else {
            i11 = AbstractC7409c0.loading_fragment;
        }
        View inflate = layoutInflater.inflate(i11, viewGroup, false);
        if (inflate != null) {
            if (C24099q0.m125958k().m125962c() && (findViewById = inflate.findViewById(AbstractC6918a0.fake_group_tab_view)) != null) {
                findViewById.setVisibility(8);
            }
            if (this.f78225x0) {
                inflate.setBackgroundResource(AbstractC16803z.rectangle_white);
            } else {
                inflate.setBackgroundColor(C23212s8.m119607o(inflate.getContext(), AbstractC16781w.SecondaryBackgroundColor));
            }
        }
        return inflate;
    }
}

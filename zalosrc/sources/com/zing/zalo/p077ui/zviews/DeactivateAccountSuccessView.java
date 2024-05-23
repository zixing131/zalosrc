package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.maintab.MainTabView;
import me0.AbstractC23136l9;
import o70.C24099q0;
import p348mi.AbstractC23304d;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class DeactivateAccountSuccessView extends BaseZaloView implements InterfaceC0733x {

    /* renamed from: M0 */
    View f73109M0;

    /* renamed from: N0 */
    TextView f73110N0;

    /* renamed from: eM */
    public /* synthetic */ void m79234eM(View view) {
        if (MainTabView.m67645lM() != null) {
            MainTabView.m67645lM().m67674JN(C24099q0.m125958k().m125971o());
        }
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        if (m92676n2() != null) {
            m92676n2().mo35579p().m93066i2(MainTabView.class, bundle, 0, 2, true);
        }
        AbstractC23647d.m123897g("37176");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC7409c0.deactivate_account_request_successful_view, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        super.mo37125ZJ(view, bundle);
        this.f73109M0 = view.findViewById(AbstractC6918a0.btn_next);
        TextView textView = (TextView) view.findViewById(AbstractC6918a0.txt_sub_title);
        this.f73110N0 = textView;
        if (textView != null) {
            ContactProfile contactProfile = AbstractC23304d.f113368c0;
            if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
                str = AbstractC23304d.f113368c0.f42455y;
            } else if (!TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
                str = AbstractC23304d.f113394i0;
            } else {
                this.f73110N0.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_deactivate_account_request_successful_v1), ""));
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                int indexOf = AbstractC23136l9.m118743r0(AbstractC8020f0.str_deactivate_account_request_successful_v1).indexOf("%s");
                if (indexOf >= 0) {
                    SpannableString spannableString = new SpannableString(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_deactivate_account_request_successful_v1), str));
                    spannableString.setSpan(new StyleSpan(1), indexOf, str.length() + indexOf, 33);
                    this.f73110N0.setText(spannableString);
                }
            } else {
                this.f73110N0.setText(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_deactivate_account_request_successful_v1), ""));
            }
        }
        this.f73109M0.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.eb
            public /* synthetic */ ViewOnClickListenerC15582eb() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                DeactivateAccountSuccessView.this.m79234eM(view2);
            }
        });
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DeactivateAccountSuccessView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            if (MainTabView.m67645lM() != null) {
                MainTabView.m67645lM().m67674JN(C24099q0.m125958k().m125971o());
            }
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 16777216);
            if (m92676n2() != null) {
                m92676n2().mo35579p().m93066i2(MainTabView.class, bundle, 0, 2, true);
            }
            AbstractC23647d.m123897g("37176");
            return true;
        }
        return false;
    }
}

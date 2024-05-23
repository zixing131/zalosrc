package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.CircleImage;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class SwitchAccountSuccessView extends BaseZaloView implements InterfaceC0733x {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eM */
    public /* synthetic */ void m84982eM(View view) {
        AbstractC23647d.m123897g("36012");
        finish();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.switch_account_success_view, viewGroup, false);
        try {
            CircleImage circleImage = (CircleImage) inflate.findViewById(AbstractC6918a0.imvAvatar);
            RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tvName);
            circleImage.m87724k(-328966, 255, AbstractC23136l9.m118742r(1.0f));
            if (AbstractC23304d.f113368c0 != null) {
                ((C23528a) new C23528a(getContext()).m123612r(circleImage)).m123618x(AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
                robotoTextView.setText(AbstractC23304d.f113368c0.mo2475c());
            }
            inflate.findViewById(AbstractC6918a0.btn_chat_gallery_done).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.lq0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SwitchAccountSuccessView.this.m84982eM(view);
                }
            });
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SwitchAccountSuccessView";
    }
}

package com.zing.zalo.p077ui.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import nb0.C23673d;
import on0.AbstractC24342w;
import p649xl.C30144z0;

/* loaded from: classes5.dex */
public final class ReportAttachMsgTypeDetailBS extends BottomSheet {

    /* renamed from: b1 */
    private C30144z0 f56230b1;

    /* renamed from: IL */
    private final void m58548IL() {
        int i11;
        List m127132B0;
        Context context = getContext();
        if (context == null) {
            return;
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getBoolean("extra_is_from_e2ee_conversation", false)) {
            i11 = AbstractC8020f0.str_report_attach_msg_types_detail_e2ee_desc;
        } else {
            i11 = AbstractC8020f0.str_report_attach_msg_types_detail_desc;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100205c(m118743r0);
        C30144z0 c30144z0 = this.f56230b1;
        if (c30144z0 == null) {
            AbstractC19074t.m100223u("binding");
            c30144z0 = null;
        }
        c30144z0.f140072q.removeAllViews();
        m127132B0 = AbstractC24342w.m127132B0(m118743r0, new String[]{"|"}, false, 0, 6, null);
        if (!m127132B0.isEmpty()) {
            int size = m127132B0.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (i12 == 0) {
                    C30144z0 c30144z02 = this.f56230b1;
                    if (c30144z02 == null) {
                        AbstractC19074t.m100223u("binding");
                        c30144z02 = null;
                    }
                    c30144z02.f140073r.setText((CharSequence) m127132B0.get(i12));
                } else {
                    RobotoTextView robotoTextView = new RobotoTextView(context);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = AbstractC23136l9.m118742r(8.0f);
                    robotoTextView.setLayoutParams(layoutParams);
                    robotoTextView.setMaxScaledTextSize(AbstractC23222t7.f112594x);
                    robotoTextView.setTextSize(0, AbstractC23222t7.f112584s);
                    robotoTextView.setLineHeight(AbstractC23222t7.f112594x);
                    robotoTextView.setTextColor(C23212s8.m119607o(context, AbstractC2807a.text_01));
                    C23673d c23673d = new C23673d(AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(10.0f), AbstractC23136l9.m118742r(1.5f));
                    SpannableString spannableString = new SpannableString((CharSequence) m127132B0.get(i12));
                    spannableString.setSpan(c23673d, 0, spannableString.length(), 33);
                    robotoTextView.setText(spannableString);
                    C30144z0 c30144z03 = this.f56230b1;
                    if (c30144z03 == null) {
                        AbstractC19074t.m100223u("binding");
                        c30144z03 = null;
                    }
                    c30144z03.f140072q.addView(robotoTextView);
                }
            }
        }
    }

    /* renamed from: JL */
    private final void m58549JL() {
        m90525tL(true);
        m90527vL(0);
        m90533zL(EnumC17017m.HUG_CONTENT);
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30144z0 m148760c = C30144z0.m148760c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148760c, "inflate(...)");
        this.f56230b1 = m148760c;
        m58549JL();
        m58548IL();
    }
}

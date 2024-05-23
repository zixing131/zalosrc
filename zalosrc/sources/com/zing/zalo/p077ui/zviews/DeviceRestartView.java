package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalocore.CoreUtility;
import me0.AbstractC23059e9;
import me0.AbstractC23152n3;

/* loaded from: classes6.dex */
public class DeviceRestartView extends BaseZaloView implements InterfaceC0733x {

    /* renamed from: M0 */
    RobotoTextView f73138M0;

    /* renamed from: N0 */
    RobotoTextView f73139N0;

    /* renamed from: com.zing.zalo.ui.zviews.DeviceRestartView$a */
    /* loaded from: classes6.dex */
    class C14221a extends ClickableSpan {

        /* renamed from: p */
        final /* synthetic */ String f73140p;

        C14221a(String str) {
            this.f73140p = str;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            DeviceRestartView.this.m79277gM(this.f73140p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: eM */
    public /* synthetic */ void m79275eM(View view) {
        AbstractC23059e9.m118334m(this.f72421L0.m92676n2());
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m92637BK(false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.device_restart, viewGroup, false);
        this.f73138M0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_title);
        this.f73139N0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_detail);
        inflate.findViewById(AbstractC6918a0.tv_close).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.nb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceRestartView.this.m79275eM(view);
            }
        });
        String m92652XI = this.f72421L0.m92652XI(AbstractC8020f0.str_device_restart_supported_email);
        RobotoTextView robotoTextView = this.f73138M0;
        robotoTextView.setText(Html.fromHtml(robotoTextView.getText().toString()));
        RobotoTextView robotoTextView2 = this.f73139N0;
        robotoTextView2.setText(String.format(robotoTextView2.getText().toString(), m92652XI));
        this.f73139N0.setLinkTextColor(Color.parseColor("#4a90e2"));
        m79276fM(this.f73139N0, new String[]{m92652XI}, new ClickableSpan[]{new C14221a(m92652XI)});
        return inflate;
    }

    /* renamed from: fM */
    void m79276fM(RobotoTextView robotoTextView, String[] strArr, ClickableSpan[] clickableSpanArr) {
        try {
            SpannableString spannableString = new SpannableString(robotoTextView.getText());
            for (int i11 = 0; i11 < strArr.length; i11++) {
                ClickableSpan clickableSpan = clickableSpanArr[i11];
                String str = strArr[i11];
                int indexOf = robotoTextView.getText().toString().indexOf(str);
                spannableString.setSpan(clickableSpan, indexOf, str.length() + indexOf, 33);
            }
            robotoTextView.setHighlightColor(0);
            robotoTextView.setMovementMethod(LinkMovementMethod.getInstance());
            robotoTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gM */
    void m79277gM(String str) {
        try {
            String format = String.format(this.f72421L0.m92652XI(AbstractC8020f0.str_device_restart_subject_support), CoreUtility.f89234j);
            Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", format);
            intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
            intent.addFlags(268435456);
            intent.addFlags(1);
            BaseZaloView baseZaloView = this.f72421L0;
            baseZaloView.m92641HK(AbstractC23152n3.m119053l(baseZaloView.getContext(), intent, this.f72421L0.m92652XI(AbstractC8020f0.str_device_restart_title_email_app)));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DeviceRestartView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23059e9.m118334m(this.f72421L0.m92676n2());
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}

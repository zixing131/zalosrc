package zm.voip.dialog;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.zview.ZaloView;
import zm.voip.p721ui.incall.GroupCallActivity;
import zm.voip.p721ui.incall.ZmInCallActivity;

/* loaded from: classes7.dex */
public class PermissionsSettingView extends ZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: A0 */
    LinearLayout f148731A0;

    /* renamed from: w0 */
    View f148732w0;

    /* renamed from: x0 */
    TextView f148733x0;

    /* renamed from: y0 */
    Button f148734y0;

    /* renamed from: z0 */
    Button f148735z0;

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.call_confirm_layout, (ViewGroup) null);
        this.f148732w0 = inflate;
        inflate.setBackgroundColor(Color.parseColor("#DD000000"));
        m92676n2().mo35554O(18);
        m155511KK();
        return this.f148732w0;
    }

    /* renamed from: JK */
    ZaloActivity m155510JK() {
        return (ZaloActivity) m92648SI();
    }

    /* renamed from: KK */
    void m155511KK() {
        TextView textView = (TextView) this.f148732w0.findViewById(AbstractC6918a0.confirm_title);
        this.f148733x0 = textView;
        textView.setText(m92652XI(AbstractC8020f0.permission_reminder_title));
        ((TextView) this.f148732w0.findViewById(AbstractC6918a0.confirm_message)).setText(m92652XI(AbstractC8020f0.str_quick_open_permissons_setting_hint));
        LinearLayout linearLayout = (LinearLayout) this.f148732w0.findViewById(AbstractC6918a0.layoutBtnDialog);
        this.f148731A0 = linearLayout;
        linearLayout.setVisibility(0);
        this.f148734y0 = (Button) this.f148732w0.findViewById(AbstractC6918a0.confirm_btn_no);
        Button button = (Button) this.f148732w0.findViewById(AbstractC6918a0.confirm_btn_yes);
        this.f148735z0 = button;
        button.setText(m92652XI(AbstractC8020f0.str_cap_open_setting));
        this.f148735z0.setOnClickListener(this);
        this.f148734y0.setOnClickListener(this);
        this.f148734y0.setText(m92652XI(AbstractC8020f0.str_close));
        this.f148735z0.setText(m92652XI(AbstractC8020f0.str_cap_open_setting));
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PermissionsSettingView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.confirm_btn_yes) {
                if (m155510JK() != null) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + m92648SI().getPackageName()));
                    if (m155510JK() instanceof GroupCallActivity) {
                        ((GroupCallActivity) m155510JK()).m156619L8();
                    } else if (m155510JK() instanceof ZmInCallActivity) {
                        ((ZmInCallActivity) m155510JK()).m157112Ug();
                    }
                    if (m155510JK() instanceof ZaloBubbleActivity) {
                        intent.addFlags(268435456);
                        ZaloBubbleActivity.m57031a5();
                    }
                    m155510JK().startActivity(intent);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.confirm_btn_no) {
                getContext().sendBroadcast(new Intent("m.voip.api.action.ACTION_NOTI_END_CALL"));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

package zm.voip.dialog;

import android.content.Intent;
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
import com.zing.zalo.zview.ZaloView;
import zm.voip.p721ui.incall.ZmInCallActivity;

/* loaded from: classes7.dex */
public class NotRecordAlertView extends ZaloView implements View.OnClickListener {

    /* renamed from: A0 */
    LinearLayout f148726A0;

    /* renamed from: w0 */
    View f148727w0;

    /* renamed from: x0 */
    TextView f148728x0;

    /* renamed from: y0 */
    Button f148729y0;

    /* renamed from: z0 */
    Button f148730z0;

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f148727w0 = layoutInflater.inflate(AbstractC7409c0.call_confirm_layout, (ViewGroup) null);
        m92676n2().mo35554O(18);
        m155509KK();
        return this.f148727w0;
    }

    /* renamed from: JK */
    ZmInCallActivity m155508JK() {
        return (ZmInCallActivity) m92648SI();
    }

    /* renamed from: KK */
    void m155509KK() {
        TextView textView = (TextView) this.f148727w0.findViewById(AbstractC6918a0.confirm_title);
        this.f148728x0 = textView;
        textView.setText(m92652XI(AbstractC8020f0.str_error));
        ((TextView) this.f148727w0.findViewById(AbstractC6918a0.confirm_message)).setText(m92652XI(AbstractC8020f0.str_not_record_alert_hint));
        LinearLayout linearLayout = (LinearLayout) this.f148727w0.findViewById(AbstractC6918a0.layoutBtnDialog);
        this.f148726A0 = linearLayout;
        linearLayout.setVisibility(0);
        Button button = (Button) this.f148727w0.findViewById(AbstractC6918a0.confirm_btn_yes);
        this.f148730z0 = button;
        button.setText(m92652XI(AbstractC8020f0.str_cap_open_setting));
        this.f148730z0.setOnClickListener(this);
        Button button2 = (Button) this.f148727w0.findViewById(AbstractC6918a0.confirm_btn_no);
        this.f148729y0 = button2;
        button2.setText(m92652XI(AbstractC8020f0.cancel));
        this.f148729y0.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.confirm_btn_yes) {
            if (m155508JK() != null) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + m92648SI().getPackageName()));
                m155508JK().m157112Ug();
                m155508JK().startActivity(intent);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.confirm_btn_no) {
            m155508JK().m157084Af();
            finish();
        }
    }
}

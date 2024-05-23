package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.utils.systemui.SystemUI;
import com.zing.zalo.zview.ZaloView;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23034c6;
import me0.AbstractC23057e7;
import me0.AbstractC23136l9;
import p161fg.C18922m;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class OpenPermisionsSettingView extends BaseZaloView implements ZaloView.InterfaceC17421f, View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    private View f75741M0;

    /* renamed from: N0 */
    private TextView f75742N0;

    /* renamed from: O0 */
    private TextView f75743O0;

    /* renamed from: P0 */
    private Button f75744P0;

    /* renamed from: Q0 */
    private Button f75745Q0;

    /* renamed from: R0 */
    private LinearLayout f75746R0;

    /* renamed from: S0 */
    private ArrayList f75747S0;

    /* renamed from: T0 */
    private int f75748T0 = -1;

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f75741M0 = layoutInflater.inflate(AbstractC7409c0.quick_open_setting_permissions_layout, (ViewGroup) null);
        this.f72421L0.m92676n2().mo35554O(18);
        this.f75742N0 = (TextView) this.f75741M0.findViewById(AbstractC6918a0.confirm_title);
        this.f75743O0 = (TextView) this.f75741M0.findViewById(AbstractC6918a0.confirm_message);
        LinearLayout linearLayout = (LinearLayout) this.f75741M0.findViewById(AbstractC6918a0.layoutBtnDialog);
        this.f75746R0 = linearLayout;
        linearLayout.setVisibility(0);
        this.f75744P0 = (Button) this.f75741M0.findViewById(AbstractC6918a0.confirm_btn_no);
        Button button = (Button) this.f75741M0.findViewById(AbstractC6918a0.confirm_btn_yes);
        this.f75745Q0 = button;
        button.setText(m92652XI(AbstractC8020f0.str_cap_open_setting));
        this.f75745Q0.setOnClickListener(this);
        this.f75744P0.setText(m92652XI(AbstractC8020f0.str_close));
        this.f75744P0.setOnClickListener(this);
        SystemUI.m89412p(this.f75741M0).m89427V(0);
        return this.f75741M0;
    }

    /* renamed from: dM */
    public void m82430dM(boolean z11) {
        if (z11) {
            int i11 = this.f75748T0;
            if (i11 == 122 || i11 == 127) {
                AbstractC23057e7.m118305l(true);
            }
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "OpenPermisionsSettingView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        boolean z11;
        super.onActivityResult(i11, i12, intent);
        ArrayList arrayList = this.f75747S0;
        if (arrayList != null) {
            if (AbstractC23034c6.m118167n(getContext(), (String[]) this.f75747S0.toArray(new String[arrayList.size()])) == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            m82430dM(z11);
        }
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.confirm_btn_yes) {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + m92648SI().getPackageName()));
            intent.addFlags(268435456);
            if (m92648SI() instanceof ZaloBubbleActivity) {
                ZaloBubbleActivity.m57031a5();
            }
            this.f72421L0.m92676n2().startActivityForResult(intent, 3001);
            C18922m.m99141t().m99143L();
            if (this.f75748T0 == 122) {
                AbstractC23647d.m123906p("38305");
                AbstractC23647d.m123893c();
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.confirm_btn_no) {
            finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f75748T0 == 122) {
                AbstractC23647d.m123906p("38306");
                AbstractC23647d.m123893c();
            }
            this.f72421L0.finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        super.mo37135xJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f75747S0 = m92642L3.getStringArrayList("extra_list_permssion");
            if (m92642L3.containsKey("str_request_code")) {
                i11 = m92642L3.getInt("str_request_code");
            } else {
                i11 = -1;
            }
            this.f75748T0 = i11;
        }
        ArrayList arrayList = this.f75747S0;
        boolean z14 = false;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = this.f75747S0.iterator();
            boolean z15 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (z15 && !"android.permission.WRITE_EXTERNAL_STORAGE".equals(str) && !"android.permission.READ_EXTERNAL_STORAGE".equals(str)) {
                    z15 = false;
                }
                if (z11 && !"android.permission.READ_CONTACTS".equals(str) && !"android.permission.WRITE_CONTACTS".equals(str)) {
                    z11 = false;
                }
                if (z12 && !"android.permission.READ_MEDIA_IMAGES".equals(str) && !"android.permission.READ_MEDIA_VIDEO".equals(str) && !"android.permission.READ_MEDIA_VISUAL_USER_SELECTED".equals(str) && !"android.permission.ACCESS_MEDIA_LOCATION".equals(str)) {
                    z12 = false;
                }
                if (z13 && !"android.permission.BLUETOOTH_CONNECT".equals(str)) {
                    z13 = false;
                }
            }
            z14 = z15;
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (z14) {
            this.f75743O0.setText(AbstractC8020f0.str_quick_open_permissons_storage_setting);
            this.f75742N0.setText(m92652XI(AbstractC8020f0.permission_storage_reminder_title));
            return;
        }
        if (z11) {
            this.f75743O0.setText(AbstractC8020f0.str_quick_open_permissons_contact_setting);
            this.f75742N0.setText(m92652XI(AbstractC8020f0.permission_contact_reminder_title));
        } else if (z12) {
            this.f75743O0.setText(AbstractC8020f0.str_quick_open_permissons_storage_setting);
            this.f75742N0.setText(m92652XI(AbstractC8020f0.permission_storage_reminder_title));
        } else if (z13) {
            this.f75743O0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_request_nearby_devices_permission_setting));
            this.f75742N0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_request_nearby_devices_permission_title));
        } else {
            this.f75743O0.setText(AbstractC8020f0.str_quick_open_permissons_setting_hint);
            this.f75742N0.setText(m92652XI(AbstractC8020f0.permission_reminder_title));
        }
    }
}

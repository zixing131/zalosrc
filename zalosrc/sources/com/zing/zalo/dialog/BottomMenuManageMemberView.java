package com.zing.zalo.dialog;

import am.C0943w;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.BottomMenuManageMemberView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import me0.AbstractC23028c0;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p656xs.AbstractC30201b;
import p716zh.C31973j5;
import ui0.C27280g;

/* loaded from: classes3.dex */
public class BottomMenuManageMemberView extends BottomPickerView implements View.OnClickListener, C23744a.c {

    /* renamed from: U0 */
    C23528a f43412U0;

    /* renamed from: V0 */
    View f43413V0;

    /* renamed from: W0 */
    ImageButton f43414W0;

    /* renamed from: X0 */
    View f43415X0;

    /* renamed from: Y0 */
    GroupAvatarView f43416Y0;

    /* renamed from: Z0 */
    RobotoTextView f43417Z0;

    /* renamed from: a1 */
    AppCompatImageView f43418a1;

    /* renamed from: b1 */
    AppCompatImageView f43419b1;

    /* renamed from: c1 */
    AppCompatImageView f43420c1;

    /* renamed from: d1 */
    RobotoTextView f43421d1;

    /* renamed from: e1 */
    RobotoTextView f43422e1;

    /* renamed from: f1 */
    RobotoTextView f43423f1;

    /* renamed from: g1 */
    RobotoTextView f43424g1;

    /* renamed from: h1 */
    RobotoTextView f43425h1;

    /* renamed from: i1 */
    RobotoTextView f43426i1;

    /* renamed from: j1 */
    RobotoTextView f43427j1;

    /* renamed from: k1 */
    C31973j5 f43428k1;

    /* renamed from: l1 */
    ContactProfile f43429l1;

    /* renamed from: m1 */
    int f43430m1 = 1;

    /* renamed from: n1 */
    InterfaceC7969a f43431n1;

    /* renamed from: com.zing.zalo.dialog.BottomMenuManageMemberView$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC7969a {
        /* renamed from: a */
        void mo42834a(int i11, String str, String str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AL */
    public /* synthetic */ void m42808AL(View view) {
        if (this.f43431n1 != null) {
            AbstractC23647d.m123897g("1591109");
            this.f43431n1.mo42834a(1, this.f43428k1.m153781r(), this.f43429l1.f42434r);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BL */
    public /* synthetic */ void m42809BL(View view) {
        if (this.f43431n1 != null) {
            AbstractC23647d.m123897g("1591110");
            this.f43431n1.mo42834a(2, this.f43428k1.m153781r(), this.f43429l1.f42434r);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CL */
    public /* synthetic */ void m42810CL(View view) {
        if (this.f43431n1 != null) {
            AbstractC23647d.m123897g("1591113");
            this.f43431n1.mo42834a(3, this.f43428k1.m153781r(), this.f43429l1.f42434r);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DL */
    public /* synthetic */ void m42811DL(View view) {
        if (this.f43431n1 != null) {
            AbstractC23647d.m123897g("1591114");
            this.f43431n1.mo42834a(4, this.f43428k1.m153781r(), this.f43429l1.f42434r);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EL */
    public /* synthetic */ void m42812EL(View view) {
        if (this.f43431n1 != null) {
            AbstractC23647d.m123897g("1591115");
            this.f43431n1.mo42834a(5, this.f43428k1.m153781r(), this.f43429l1.f42434r);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FL */
    public /* synthetic */ void m42813FL(View view) {
        if (this.f43431n1 != null) {
            AbstractC23647d.m123897g("1591116");
            this.f43431n1.mo42834a(6, this.f43428k1.m153781r(), this.f43429l1.f42434r);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GL */
    public /* synthetic */ void m42814GL(View view) {
        if (this.f43431n1 != null) {
            AbstractC23647d.m123897g("1591112");
            this.f43431n1.mo42834a(7, this.f43428k1.m153781r(), this.f43429l1.f42434r);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HL */
    public /* synthetic */ void m42815HL(View view) {
        if (this.f43431n1 != null) {
            AbstractC23647d.m123897g("1591124");
            this.f43431n1.mo42834a(8, this.f43428k1.m153781r(), this.f43429l1.f42434r);
        }
        dismiss();
    }

    /* renamed from: IL */
    public static BottomMenuManageMemberView m42816IL(String str, ContactProfile contactProfile, int i11, InterfaceC7969a interfaceC7969a) {
        Bundle m78535kL = BottomPickerView.m78535kL();
        m78535kL.putString("GROUP_ID", str);
        m78535kL.putString("INTERACTED_UID", contactProfile.f42434r);
        m78535kL.putString("INTERACTED_AVT", contactProfile.f42446v);
        m78535kL.putString("INTERACTED_DPN", contactProfile.f42437s);
        m78535kL.putInt("INTERACTED_TYPE_CONTACT", contactProfile.f42352K0);
        m78535kL.putInt("VIEW_MODE", i11);
        BottomMenuManageMemberView bottomMenuManageMemberView = new BottomMenuManageMemberView();
        bottomMenuManageMemberView.m42831KL(interfaceC7969a);
        bottomMenuManageMemberView.mo60305zK(m78535kL);
        return bottomMenuManageMemberView;
    }

    /* renamed from: LL */
    private void m42817LL() {
        ContactProfile contactProfile;
        if (this.f43428k1 != null && (contactProfile = this.f43429l1) != null) {
            String str = contactProfile.f42434r;
            if (!C21927m.m114302u().m114357s().m153137g(str) && this.f43429l1.f42352K0 <= 0) {
                if (AbstractC23309i.m121783c9() == 1 && !AbstractC21935u.m114515E(this.f43429l1.f42434r)) {
                    this.f43419b1.setVisibility(0);
                } else {
                    this.f43419b1.setVisibility(8);
                }
            } else {
                this.f43419b1.setVisibility(8);
                this.f43421d1.setText(AbstractC8020f0.str_view_oa_profile);
            }
            int i11 = this.f43430m1;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            this.f43422e1.setVisibility(8);
                            this.f43423f1.setVisibility(8);
                            this.f43425h1.setVisibility(8);
                            this.f43424g1.setVisibility(8);
                            this.f43427j1.setVisibility(8);
                            if (!this.f43428k1.m153742T()) {
                                this.f43426i1.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    this.f43422e1.setVisibility(8);
                    this.f43423f1.setVisibility(8);
                    this.f43425h1.setVisibility(8);
                    this.f43424g1.setVisibility(8);
                    this.f43426i1.setVisibility(8);
                    return;
                }
                this.f43422e1.setVisibility(8);
                this.f43426i1.setVisibility(8);
                this.f43427j1.setVisibility(8);
                if (!this.f43428k1.m153778p0()) {
                    this.f43423f1.setVisibility(8);
                    this.f43424g1.setVisibility(8);
                    this.f43425h1.setVisibility(8);
                    return;
                }
                return;
            }
            this.f43426i1.setVisibility(8);
            this.f43427j1.setVisibility(8);
            if (this.f43428k1.m153778p0()) {
                if (this.f43428k1.m153744V(str)) {
                    this.f43422e1.setVisibility(8);
                    return;
                } else {
                    this.f43423f1.setVisibility(8);
                    return;
                }
            }
            if (this.f43428k1.m153743U()) {
                if (!this.f43428k1.m153780q0(str) && !this.f43428k1.m153744V(str)) {
                    this.f43423f1.setVisibility(8);
                    this.f43422e1.setVisibility(8);
                    this.f43426i1.setVisibility(8);
                    return;
                } else {
                    this.f43423f1.setVisibility(8);
                    this.f43422e1.setVisibility(8);
                    this.f43424g1.setVisibility(8);
                    this.f43425h1.setVisibility(8);
                    return;
                }
            }
            this.f43423f1.setVisibility(8);
            this.f43422e1.setVisibility(8);
            this.f43424g1.setVisibility(8);
            this.f43425h1.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yL */
    public /* synthetic */ void m42828yL(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zL */
    public /* synthetic */ void m42829zL(View view) {
        if (this.f43431n1 != null) {
            AbstractC23647d.m123897g("1591108");
            this.f43431n1.mo42834a(0, this.f43428k1.m153781r(), this.f43429l1.f42434r);
        }
        dismiss();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        String str2;
        int i11;
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = this.f88762c0.m92642L3();
            if (m92642L3 != null) {
                if (m92642L3.containsKey("GROUP_ID")) {
                    this.f43428k1 = C0943w.m4462l().m4472f(m92642L3.getString("GROUP_ID"));
                }
                String str3 = "";
                if (!m92642L3.containsKey("INTERACTED_UID")) {
                    str = "";
                } else {
                    str = m92642L3.getString("INTERACTED_UID");
                }
                if (!m92642L3.containsKey("INTERACTED_AVT")) {
                    str2 = "";
                } else {
                    str2 = m92642L3.getString("INTERACTED_AVT");
                }
                if (m92642L3.containsKey("INTERACTED_DPN")) {
                    str3 = m92642L3.getString("INTERACTED_DPN");
                }
                if (m92642L3.containsKey("INTERACTED_TYPE_CONTACT")) {
                    i11 = m92642L3.getInt("INTERACTED_TYPE_CONTACT");
                } else {
                    i11 = 0;
                }
                ContactProfile contactProfile = new ContactProfile();
                this.f43429l1 = contactProfile;
                contactProfile.f42434r = str;
                contactProfile.f42446v = str2;
                contactProfile.f42437s = str3;
                contactProfile.f42352K0 = i11;
                if (m92642L3.containsKey("VIEW_MODE")) {
                    this.f43430m1 = m92642L3.getInt("VIEW_MODE");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: JL */
    void m42830JL() {
        try {
            C23744a.m124114c().m124117e(this, 52);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KL */
    public void m42831KL(InterfaceC7969a interfaceC7969a) {
        this.f43431n1 = interfaceC7969a;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        m42830JL();
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m42830JL();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.bottom_menu_popup_manage_member_view;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m42833xL();
    }

    @Override // p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 52) {
            String valueOf = String.valueOf(objArr[0]);
            if (this.f43428k1 != null) {
                if (valueOf.equals("group_" + this.f43428k1.m153781r())) {
                    dismiss();
                }
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        Drawable m139658a;
        super.mo37135xJ(bundle);
        if (this.f43428k1 == null) {
            return;
        }
        this.f43412U0 = new C23528a(this.f88762c0.getContext());
        this.f43413V0 = this.f83659I0.findViewById(AbstractC6918a0.layout_header);
        ImageButton imageButton = (ImageButton) this.f83659I0.findViewById(AbstractC6918a0.btn_close);
        this.f43414W0 = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: bn.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomMenuManageMemberView.this.m42828yL(view);
            }
        });
        this.f43415X0 = this.f83659I0.findViewById(AbstractC6918a0.member_container);
        this.f43416Y0 = (GroupAvatarView) this.f83659I0.findViewById(AbstractC6918a0.member_avatar);
        this.f43417Z0 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.member_name);
        this.f43418a1 = (AppCompatImageView) this.f83659I0.findViewById(AbstractC6918a0.ic_status);
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.f83659I0.findViewById(AbstractC6918a0.icon_call);
        this.f43419b1 = appCompatImageView;
        appCompatImageView.setOnClickListener(new View.OnClickListener() { // from class: bn.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomMenuManageMemberView.this.m42829zL(view);
            }
        });
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.f83659I0.findViewById(AbstractC6918a0.icon_send_msg);
        this.f43420c1 = appCompatImageView2;
        appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: bn.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomMenuManageMemberView.this.m42808AL(view);
            }
        });
        RobotoTextView robotoTextView = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.item_view_profile);
        this.f43421d1 = robotoTextView;
        robotoTextView.setOnClickListener(new View.OnClickListener() { // from class: bn.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomMenuManageMemberView.this.m42809BL(view);
            }
        });
        this.f43422e1 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.item_appoint_admin);
        if (this.f43428k1.m153747Y()) {
            this.f43422e1.setText(AbstractC8020f0.str_menu_item_appoint_community_admin);
        }
        this.f43422e1.setOnClickListener(new View.OnClickListener() { // from class: bn.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomMenuManageMemberView.this.m42810CL(view);
            }
        });
        this.f43423f1 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.item_remove_admin);
        if (this.f43428k1.m153747Y()) {
            this.f43423f1.setText(AbstractC8020f0.str_menu_item_remove_community_admin);
        }
        this.f43423f1.setOnClickListener(new View.OnClickListener() { // from class: bn.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomMenuManageMemberView.this.m42811DL(view);
            }
        });
        RobotoTextView robotoTextView2 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.item_block_member);
        this.f43424g1 = robotoTextView2;
        robotoTextView2.setOnClickListener(new View.OnClickListener() { // from class: bn.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomMenuManageMemberView.this.m42812EL(view);
            }
        });
        RobotoTextView robotoTextView3 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.item_unblock_member);
        this.f43426i1 = robotoTextView3;
        robotoTextView3.setOnClickListener(new View.OnClickListener() { // from class: bn.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomMenuManageMemberView.this.m42813FL(view);
            }
        });
        this.f43425h1 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.item_remove_from_group);
        if (this.f43428k1.m153747Y()) {
            this.f43425h1.setText(AbstractC8020f0.str_menu_item_remove_from_community);
        }
        this.f43425h1.setOnClickListener(new View.OnClickListener() { // from class: bn.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomMenuManageMemberView.this.m42814GL(view);
            }
        });
        RobotoTextView robotoTextView4 = (RobotoTextView) this.f83659I0.findViewById(AbstractC6918a0.item_remove_invitation);
        this.f43427j1 = robotoTextView4;
        robotoTextView4.setOnClickListener(new View.OnClickListener() { // from class: bn.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomMenuManageMemberView.this.m42815HL(view);
            }
        });
        m42817LL();
        ContactProfile contactProfile = this.f43429l1;
        if (contactProfile != null) {
            this.f43417Z0.setText(AbstractC23028c0.m118085e(contactProfile, false, 0));
            this.f43416Y0.setUidForGenColor(this.f43429l1.f42434r);
            this.f43416Y0.setShortDpnAvt(this.f43429l1.f42427o1);
            this.f43416Y0.m75732d(this.f43429l1.f42446v);
            if (this.f43428k1.m153780q0(this.f43429l1.f42434r)) {
                this.f43418a1.setImageResource(AbstractC16803z.icn_rightmenu_key_gold);
                if (AbstractC30201b.m148949b(this.f43428k1, this.f43429l1) && (m139658a = C27280g.m139658a(m92689tK(), AbstractC23322a.zds_oic_oa_star_check_color_24)) != null) {
                    int i11 = AbstractC23222t7.f112586t;
                    m139658a.setBounds(0, 0, i11, i11);
                    this.f43417Z0.setCompoundDrawablePadding(AbstractC23222t7.f112552c);
                    this.f43417Z0.setCompoundDrawables(null, null, m139658a, null);
                    return;
                }
                return;
            }
            if (this.f43428k1.m153744V(this.f43429l1.f42434r)) {
                this.f43418a1.setImageResource(AbstractC16803z.icn_rightmenu_key_silver);
            }
        }
    }

    /* renamed from: xL */
    void m42833xL() {
        try {
            C23744a.m124114c().m124115b(this, 52);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

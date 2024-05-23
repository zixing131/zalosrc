package com.zing.zalo.p077ui.group.invitation.box;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.text.AbstractC1463b;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.group.GroupInvitationInfo;
import com.zing.zalo.p077ui.group.invitation.box.ConfirmDeclineInvitationBottomSheet;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.BottomPickerView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import p304ks.C21927m;
import p649xl.C30131y4;
import p716zh.C31853b5;

/* loaded from: classes5.dex */
public final class ConfirmDeclineInvitationBottomSheet extends BottomPickerView {
    public static final C11900b Companion = new C11900b(null);

    /* renamed from: U0 */
    public final String f61989U0 = "ConfirmDeclineInvitationBottomSheet";

    /* renamed from: V0 */
    private InterfaceC11899a f61990V0;

    /* renamed from: W0 */
    private C30131y4 f61991W0;

    /* renamed from: X0 */
    private GroupInvitationInfo f61992X0;

    /* renamed from: com.zing.zalo.ui.group.invitation.box.ConfirmDeclineInvitationBottomSheet$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11899a {
        /* renamed from: a */
        void mo66157a(boolean z11, boolean z12);
    }

    /* renamed from: com.zing.zalo.ui.group.invitation.box.ConfirmDeclineInvitationBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C11900b {
        private C11900b() {
        }

        public /* synthetic */ C11900b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ConfirmDeclineInvitationBottomSheet m66158a(InterfaceC11899a interfaceC11899a, GroupInvitationInfo groupInvitationInfo) {
            AbstractC19074t.m100208f(interfaceC11899a, "listener");
            AbstractC19074t.m100208f(groupInvitationInfo, "groupInvitationInfo");
            Bundle m78535kL = BottomPickerView.m78535kL();
            ConfirmDeclineInvitationBottomSheet confirmDeclineInvitationBottomSheet = new ConfirmDeclineInvitationBottomSheet();
            confirmDeclineInvitationBottomSheet.m66156rL(interfaceC11899a);
            m78535kL.putParcelable("KEY_INVITATION", groupInvitationInfo);
            confirmDeclineInvitationBottomSheet.mo60305zK(m78535kL);
            return confirmDeclineInvitationBottomSheet;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pL */
    public static final void m66154pL(ConfirmDeclineInvitationBottomSheet confirmDeclineInvitationBottomSheet, View view) {
        AbstractC19074t.m100208f(confirmDeclineInvitationBottomSheet, "this$0");
        confirmDeclineInvitationBottomSheet.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qL */
    public static final void m66155qL(ConfirmDeclineInvitationBottomSheet confirmDeclineInvitationBottomSheet, View view) {
        AbstractC19074t.m100208f(confirmDeclineInvitationBottomSheet, "this$0");
        confirmDeclineInvitationBottomSheet.dismiss();
        InterfaceC11899a interfaceC11899a = confirmDeclineInvitationBottomSheet.f61990V0;
        if (interfaceC11899a != null) {
            C30131y4 c30131y4 = confirmDeclineInvitationBottomSheet.f61991W0;
            C30131y4 c30131y42 = null;
            if (c30131y4 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y4 = null;
            }
            boolean isChecked = c30131y4.f140006t.isChecked();
            C30131y4 c30131y43 = confirmDeclineInvitationBottomSheet.f61991W0;
            if (c30131y43 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c30131y42 = c30131y43;
            }
            interfaceC11899a.mo66157a(isChecked, c30131y42.f140005s.isChecked());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView, com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f88762c0.m92642L3();
        if (m92642L3 != null) {
            Parcelable parcelable = m92642L3.getParcelable("KEY_INVITATION");
            AbstractC19074t.m100205c(parcelable);
            this.f61992X0 = (GroupInvitationInfo) parcelable;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView, com.zing.zalo.uicontrol.contentpickerpopup.ContentPickerPopupView
    /* renamed from: eL */
    public View mo62728eL(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        ContactProfile m40894l;
        String str3;
        ContactProfile m40894l2;
        ContactProfile m40894l3;
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30131y4 m148726c = C30131y4.m148726c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148726c, "inflate(...)");
        this.f61991W0 = m148726c;
        GroupInvitationInfo groupInvitationInfo = this.f61992X0;
        C30131y4 c30131y4 = null;
        if (groupInvitationInfo != null && groupInvitationInfo.m40898p()) {
            C30131y4 c30131y42 = this.f61991W0;
            if (c30131y42 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y42 = null;
            }
            c30131y42.f140008v.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_decline_community_invitation_confirm_dialog_title));
            C30131y4 c30131y43 = this.f61991W0;
            if (c30131y43 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y43 = null;
            }
            c30131y43.f140007u.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_decline_community_invitation_confirm_dialog_desc));
            C30131y4 c30131y44 = this.f61991W0;
            if (c30131y44 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y44 = null;
            }
            c30131y44.f140010x.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_block_invitation_from_community_checkbox_title));
        }
        C31853b5 m114312J = C21927m.m114302u().m114312J();
        GroupInvitationInfo groupInvitationInfo2 = this.f61992X0;
        if (groupInvitationInfo2 != null && (m40894l3 = groupInvitationInfo2.m40894l()) != null) {
            str = m40894l3.f42434r;
        } else {
            str = null;
        }
        if (m114312J.m153137g(str)) {
            C30131y4 c30131y45 = this.f61991W0;
            if (c30131y45 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y45 = null;
            }
            RobotoTextView robotoTextView = c30131y45.f140011y;
            Resources m92651WI = m92651WI();
            int i11 = AbstractC8020f0.str_group_invitation_invitor_is_blocked;
            Object[] objArr = new Object[1];
            GroupInvitationInfo groupInvitationInfo3 = this.f61992X0;
            if (groupInvitationInfo3 != null && (m40894l2 = groupInvitationInfo3.m40894l()) != null) {
                str3 = m40894l2.f42437s;
            } else {
                str3 = null;
            }
            objArr[0] = str3;
            robotoTextView.setText(AbstractC1463b.m7440a(m92651WI.getString(i11, objArr), 0));
            C30131y4 c30131y46 = this.f61991W0;
            if (c30131y46 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y46 = null;
            }
            c30131y46.f140006t.setEnabled(false);
            C30131y4 c30131y47 = this.f61991W0;
            if (c30131y47 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y47 = null;
            }
            c30131y47.f140006t.setAlpha(0.3f);
            C30131y4 c30131y48 = this.f61991W0;
            if (c30131y48 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y48 = null;
            }
            c30131y48.f140006t.setChecked(true);
        } else {
            C30131y4 c30131y49 = this.f61991W0;
            if (c30131y49 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y49 = null;
            }
            RobotoTextView robotoTextView2 = c30131y49.f140011y;
            Resources m92651WI2 = m92651WI();
            int i12 = AbstractC8020f0.str_group_invitation_block_invitator_title;
            Object[] objArr2 = new Object[1];
            GroupInvitationInfo groupInvitationInfo4 = this.f61992X0;
            if (groupInvitationInfo4 != null && (m40894l = groupInvitationInfo4.m40894l()) != null) {
                str2 = m40894l.f42437s;
            } else {
                str2 = null;
            }
            objArr2[0] = str2;
            robotoTextView2.setText(AbstractC1463b.m7440a(m92651WI2.getString(i12, objArr2), 0));
            C30131y4 c30131y410 = this.f61991W0;
            if (c30131y410 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y410 = null;
            }
            c30131y410.f140006t.setEnabled(true);
            C30131y4 c30131y411 = this.f61991W0;
            if (c30131y411 == null) {
                AbstractC19074t.m100223u("binding");
                c30131y411 = null;
            }
            c30131y411.f140006t.setAlpha(1.0f);
        }
        C30131y4 c30131y412 = this.f61991W0;
        if (c30131y412 == null) {
            AbstractC19074t.m100223u("binding");
            c30131y412 = null;
        }
        c30131y412.f140003q.setText(m92651WI().getString(AbstractC8020f0.str_btn_back));
        C30131y4 c30131y413 = this.f61991W0;
        if (c30131y413 == null) {
            AbstractC19074t.m100223u("binding");
            c30131y413 = null;
        }
        c30131y413.f140004r.setText(m92651WI().getString(AbstractC8020f0.str_decline_group_invitation_confirm_dialog_button));
        C30131y4 c30131y414 = this.f61991W0;
        if (c30131y414 == null) {
            AbstractC19074t.m100223u("binding");
            c30131y414 = null;
        }
        c30131y414.f140003q.setOnClickListener(new View.OnClickListener() { // from class: d70.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmDeclineInvitationBottomSheet.m66154pL(ConfirmDeclineInvitationBottomSheet.this, view);
            }
        });
        C30131y4 c30131y415 = this.f61991W0;
        if (c30131y415 == null) {
            AbstractC19074t.m100223u("binding");
            c30131y415 = null;
        }
        c30131y415.f140004r.setOnClickListener(new View.OnClickListener() { // from class: d70.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfirmDeclineInvitationBottomSheet.m66155qL(ConfirmDeclineInvitationBottomSheet.this, view);
            }
        });
        C30131y4 c30131y416 = this.f61991W0;
        if (c30131y416 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30131y4 = c30131y416;
        }
        LinearLayout root = c30131y4.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomPickerView
    /* renamed from: mL */
    protected int mo42832mL() {
        return AbstractC7409c0.layout_confirm_decline_invitation_bottom_sheet;
    }

    /* renamed from: rL */
    public final void m66156rL(InterfaceC11899a interfaceC11899a) {
        AbstractC19074t.m100208f(interfaceC11899a, "listener");
        this.f61990V0 = interfaceC11899a;
    }
}

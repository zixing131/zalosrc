package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p354n3.C23528a;
import p363nh.C23744a;
import p716zh.C31973j5;
import vg.C28203u6;

/* loaded from: classes6.dex */
public class GroupSuggestInviteMemberView extends BaseInviteGroupMemberView implements C23744a.c, InterfaceC0733x {

    /* renamed from: X0 */
    View f74261X0;

    /* renamed from: Y0 */
    RecyclerView f74262Y0;

    /* renamed from: Z0 */
    GroupSuggestInviteMemberAdapter f74263Z0;

    /* renamed from: a1 */
    MultiStateView f74264a1;

    /* renamed from: c1 */
    C23528a f74266c1;

    /* renamed from: d1 */
    GroupSuggestInviteMemberAdapter.InterfaceC6963c f74267d1;

    /* renamed from: e1 */
    String f74268e1;

    /* renamed from: b1 */
    ArrayList f74265b1 = new ArrayList();

    /* renamed from: f1 */
    ContactProfile f74269f1 = null;

    /* renamed from: g1 */
    HashMap f74270g1 = new HashMap();

    /* renamed from: com.zing.zalo.ui.zviews.GroupSuggestInviteMemberView$a */
    /* loaded from: classes6.dex */
    class C14452a implements GroupSuggestInviteMemberAdapter.InterfaceC6963c {
        C14452a() {
        }

        @Override // com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter.InterfaceC6963c
        /* renamed from: a */
        public void mo35717a() {
            GroupSuggestInviteMemberView groupSuggestInviteMemberView = GroupSuggestInviteMemberView.this;
            AbstractC23211s7.m119575h(groupSuggestInviteMemberView.f74268e1, groupSuggestInviteMemberView.f72421L0.m92676n2(), true);
        }

        @Override // com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter.InterfaceC6963c
        /* renamed from: b */
        public void mo35718b(ContactProfile contactProfile) {
            GroupSuggestInviteMemberView groupSuggestInviteMemberView = GroupSuggestInviteMemberView.this;
            if (groupSuggestInviteMemberView.f74269f1 != null) {
                return;
            }
            groupSuggestInviteMemberView.f72362W0.m155389c();
            GroupSuggestInviteMemberView.this.f72362W0.m155387a(new InviteContactProfile(contactProfile));
            GroupSuggestInviteMemberView groupSuggestInviteMemberView2 = GroupSuggestInviteMemberView.this;
            groupSuggestInviteMemberView2.f74269f1 = contactProfile;
            groupSuggestInviteMemberView2.f72356Q0 = 2;
            groupSuggestInviteMemberView2.m78433lM(groupSuggestInviteMemberView2.f74268e1, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m80685oM() {
        m80689qM(AbstractC8020f0.str_empty_msg_suggest_invite_member);
        m80690rM(false);
        this.f74263Z0.m35710O(this.f74265b1);
        this.f74263Z0.m10008p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public void m80686pM() {
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.kp
            @Override // java.lang.Runnable
            public final void run() {
                GroupSuggestInviteMemberView.this.m80685oM();
            }
        });
    }

    /* renamed from: sM */
    private void m80687sM(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (C28203u6.f131407a.m141809c(str) != null && this.f74270g1.containsKey(str)) {
                this.f74265b1.remove(this.f74270g1.remove(str));
            }
        }
        m80686pM();
    }

    /* renamed from: tM */
    private void m80688tM(int i11) {
        GroupSuggestInviteMemberAdapter.C6962b c6962b = (GroupSuggestInviteMemberAdapter.C6962b) this.f74270g1.get(this.f74269f1.f42434r);
        if (c6962b != null && i11 != 0) {
            if (i11 != 17007 && i11 != 17032) {
                if (i11 != 17053 && i11 != 18002 && i11 != 18005) {
                    c6962b.f38109e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_invite_error_undefine);
                } else {
                    c6962b.f38109e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_invite_error_send_group_invitation);
                }
            } else {
                c6962b.f38109e = AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_invite_error_in_approval_list);
            }
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.jp
                @Override // java.lang.Runnable
                public final void run() {
                    GroupSuggestInviteMemberView.this.m80686pM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        ArrayList parcelableArrayList;
        boolean z11;
        super.mo37111CJ(bundle);
        this.f74270g1.clear();
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("extra_group_id")) {
                this.f74268e1 = m92642L3.getString("extra_group_id");
            }
            if (m92642L3.containsKey("extra_preload_data") && (parcelableArrayList = m92642L3.getParcelableArrayList("extra_preload_data")) != null) {
                this.f74265b1.clear();
                int size = parcelableArrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ContactProfile contactProfile = (ContactProfile) parcelableArrayList.get(i11);
                    contactProfile.f42373R0 = 1;
                    if (!this.f74270g1.containsKey(contactProfile.f42434r)) {
                        GroupSuggestInviteMemberAdapter.C6962b c6962b = new GroupSuggestInviteMemberAdapter.C6962b(0);
                        c6962b.f38106b = contactProfile;
                        if (i11 > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c6962b.f38108d = z11;
                        c6962b.f38107c = false;
                        this.f74265b1.add(c6962b);
                        this.f74270g1.put(contactProfile.f42434r, c6962b);
                    }
                }
            }
        }
        this.f72358S0 = false;
        this.f72359T0 = true;
        this.f74266c1 = new C23528a(this.f72421L0.m92648SI());
        this.f74267d1 = new C14452a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.group_suggest_invite_member_view, viewGroup, false);
        this.f74261X0 = inflate;
        this.f74264a1 = (MultiStateView) inflate.findViewById(AbstractC6918a0.multi_state);
        this.f74262Y0 = (RecyclerView) this.f74261X0.findViewById(AbstractC6918a0.list_contact_profile);
        this.f74262Y0.setLayoutManager(new LinearLayoutManager(this.f72421L0.m92648SI()));
        GroupSuggestInviteMemberAdapter groupSuggestInviteMemberAdapter = new GroupSuggestInviteMemberAdapter(this.f72421L0.m92648SI(), this.f74265b1, this.f74266c1, this.f74267d1);
        this.f74263Z0 = groupSuggestInviteMemberAdapter;
        this.f74262Y0.setAdapter(groupSuggestInviteMemberAdapter);
        return this.f74261X0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 27);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseInviteGroupMemberView
    /* renamed from: gM */
    public void mo78429gM(int i11, ArrayList arrayList) {
        if (i11 == 0) {
            ContactProfile contactProfile = this.f74269f1;
            if (contactProfile != null) {
                ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_msg_toast_add_suggest_invite_member_success, contactProfile.m40383Q(true, true)));
                if (this.f74270g1.containsKey(this.f74269f1.f42434r)) {
                    this.f74265b1.remove(this.f74270g1.remove(this.f74269f1.f42434r));
                    m80686pM();
                }
            }
        } else {
            m80688tM(i11);
            C31973j5 c31973j5 = this.f72357R0;
            if (c31973j5 != null) {
                AbstractC23184q2.m119440E(c31973j5.m153781r(), 12, m78432kM());
            }
        }
        this.f74269f1 = null;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupSuggestInviteMemberView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseInviteGroupMemberView
    /* renamed from: iM */
    public int mo78430iM(boolean z11, JSONObject jSONObject) {
        if (z11) {
            try {
                String optString = jSONObject.optString("wrong_members", "");
                if (!TextUtils.isEmpty(optString)) {
                    JSONArray jSONArray = new JSONArray(optString);
                    if (jSONArray.length() > 0) {
                        return jSONArray.getJSONObject(0).getInt("errorCode");
                    }
                }
                String optString2 = jSONObject.optString("wrong_phones", "");
                if (!TextUtils.isEmpty(optString2)) {
                    JSONArray jSONArray2 = new JSONArray(optString2);
                    if (jSONArray2.length() > 0) {
                        return jSONArray2.getJSONObject(0).getInt("errorCode");
                    }
                }
                if (Integer.parseInt(jSONObject.optString("isPendingList")) > 0) {
                    return 17007;
                }
            } catch (JSONException e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return 0;
    }

    /* renamed from: qM */
    public void m80689qM(int i11) {
        MultiStateView multiStateView = this.f74264a1;
        if (multiStateView != null) {
            multiStateView.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
        }
    }

    /* renamed from: rM */
    public void m80690rM(boolean z11) {
        if (z11) {
            this.f74262Y0.setVisibility(8);
            this.f74264a1.setVisibility(0);
            this.f74264a1.setState(MultiStateView.EnumC15914e.LOADING);
        } else if (this.f74265b1.size() > 0) {
            this.f74264a1.setVisibility(8);
            this.f74262Y0.setVisibility(0);
        } else {
            this.f74262Y0.setVisibility(8);
            this.f74264a1.setVisibility(0);
            this.f74264a1.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 27 && objArr != null && objArr.length >= 3) {
            String str = (String) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            ArrayList arrayList = new ArrayList(Arrays.asList(TextUtils.split((String) objArr[2], ";")));
            boolean contains = arrayList.contains(CoreUtility.f89233i);
            if (this.f74268e1.equals(str) && !arrayList.isEmpty()) {
                if (intValue != 3) {
                    if ((intValue == 4 || intValue == 10) && contains) {
                        finish();
                        return;
                    }
                    return;
                }
                m80687sM(arrayList);
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 27);
    }
}

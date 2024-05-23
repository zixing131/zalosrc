package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import am.C0943w;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7026c2;
import com.zing.zalo.adapters.C7038d2;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.chat.ChatView;
import com.zing.zalo.p077ui.zviews.GroupNearbyLobbyZView;
import com.zing.zalo.uicontrol.C16665v;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p363nh.C23744a;
import p716zh.C31973j5;
import p716zh.C32076q5;
import v50.C27870vb;
import vg.C28139n5;

/* loaded from: classes6.dex */
public class GroupNearbyLobbyZView extends BaseZaloView implements C23744a.c, C7026c2.a, InterfaceC0733x {

    /* renamed from: M0 */
    C23528a f73867M0;

    /* renamed from: N0 */
    View f73868N0;

    /* renamed from: O0 */
    TextView f73869O0;

    /* renamed from: P0 */
    TextView f73870P0;

    /* renamed from: Q0 */
    RecyclerView f73871Q0;

    /* renamed from: S0 */
    ArrayList f73873S0;

    /* renamed from: V0 */
    LinearLayoutManager f73876V0;

    /* renamed from: W0 */
    C7026c2 f73877W0;

    /* renamed from: X0 */
    C7038d2 f73878X0;

    /* renamed from: d1 */
    boolean f73884d1;

    /* renamed from: e1 */
    boolean f73885e1;

    /* renamed from: R0 */
    ArrayList f73872R0 = new ArrayList();

    /* renamed from: T0 */
    WeakHashMap f73874T0 = new WeakHashMap();

    /* renamed from: U0 */
    ArrayList f73875U0 = new ArrayList();

    /* renamed from: Y0 */
    int f73879Y0 = 1;

    /* renamed from: Z0 */
    String f73880Z0 = "";

    /* renamed from: a1 */
    String f73881a1 = "";

    /* renamed from: b1 */
    String f73882b1 = "";

    /* renamed from: c1 */
    boolean f73883c1 = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupNearbyLobbyZView$a */
    /* loaded from: classes6.dex */
    public class C14376a extends RecyclerView.AbstractC1892s {
        C14376a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            super.mo952b(recyclerView, i11);
            try {
                if (i11 == 0) {
                    GroupNearbyLobbyZView.this.f73877W0.m35913Z(false);
                    GroupNearbyLobbyZView.this.f73877W0.m10008p();
                } else {
                    GroupNearbyLobbyZView.this.f73877W0.m35913Z(true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            super.mo10176d(recyclerView, i11, i12);
            try {
                if (GroupNearbyLobbyZView.this.f73876V0.m9740Y1() + GroupNearbyLobbyZView.this.f73876V0.m10110a() >= GroupNearbyLobbyZView.this.f73876V0.m10127i()) {
                    GroupNearbyLobbyZView groupNearbyLobbyZView = GroupNearbyLobbyZView.this;
                    if (groupNearbyLobbyZView.f73883c1 && !groupNearbyLobbyZView.f73884d1 && !groupNearbyLobbyZView.f73877W0.m35909S()) {
                        GroupNearbyLobbyZView groupNearbyLobbyZView2 = GroupNearbyLobbyZView.this;
                        groupNearbyLobbyZView2.f73879Y0++;
                        groupNearbyLobbyZView2.f73877W0.m35911X(1);
                        GroupNearbyLobbyZView.this.f73877W0.m10008p();
                        GroupNearbyLobbyZView.this.m80260qM();
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupNearbyLobbyZView$b */
    /* loaded from: classes6.dex */
    public class C14377b implements InterfaceC20094a {
        C14377b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m80267f() {
            GroupNearbyLobbyZView groupNearbyLobbyZView = GroupNearbyLobbyZView.this;
            groupNearbyLobbyZView.f73877W0.m35912Y(groupNearbyLobbyZView.f73875U0);
            GroupNearbyLobbyZView.this.f73877W0.m35911X(0);
            GroupNearbyLobbyZView.this.f73877W0.m10008p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m80268g() {
            GroupNearbyLobbyZView groupNearbyLobbyZView = GroupNearbyLobbyZView.this;
            groupNearbyLobbyZView.f73883c1 = false;
            groupNearbyLobbyZView.f73877W0.m35911X(0);
            GroupNearbyLobbyZView.this.f73877W0.m10008p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m80269h() {
            try {
                GroupNearbyLobbyZView.this.f73877W0.m35911X(2);
                GroupNearbyLobbyZView.this.f73877W0.m10008p();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            GroupNearbyLobbyZView groupNearbyLobbyZView = GroupNearbyLobbyZView.this;
            groupNearbyLobbyZView.f73884d1 = false;
            if (groupNearbyLobbyZView.f72421L0.m92674mJ()) {
                GroupNearbyLobbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.kl
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupNearbyLobbyZView.C14377b.this.m80269h();
                    }
                });
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            String str;
            String string;
            long j11;
            String string2;
            String string3;
            String string4;
            String string5;
            int i11;
            String string6;
            boolean z12;
            String str2 = "checkinTime";
            String str3 = "userId";
            try {
                GroupNearbyLobbyZView groupNearbyLobbyZView = GroupNearbyLobbyZView.this;
                groupNearbyLobbyZView.f73884d1 = false;
                if (groupNearbyLobbyZView.f72421L0.m92674mJ()) {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    GroupNearbyLobbyZView groupNearbyLobbyZView2 = GroupNearbyLobbyZView.this;
                    if (jSONObject.getInt("isLoadMore") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    groupNearbyLobbyZView2.f73883c1 = z11;
                    JSONArray jSONArray = jSONObject.getJSONArray("entries");
                    int i12 = 0;
                    while (i12 < jSONArray.length()) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                        ContactProfile contactProfile = new ContactProfile();
                        String str4 = "";
                        if (jSONObject2.isNull(str3)) {
                            str = str3;
                            string = "";
                        } else {
                            str = str3;
                            string = jSONObject2.getString(str3);
                        }
                        contactProfile.f42434r = string;
                        if (jSONObject2.isNull(str2)) {
                            j11 = 0;
                        } else {
                            j11 = jSONObject2.getLong(str2);
                        }
                        String str5 = str2;
                        contactProfile.f42454x1 = j11;
                        if (jSONObject2.isNull("code")) {
                            string2 = "";
                        } else {
                            string2 = jSONObject2.getString("code");
                        }
                        contactProfile.f42457y1 = string2;
                        if (jSONObject2.isNull("displayName")) {
                            string3 = "";
                        } else {
                            string3 = jSONObject2.getString("displayName");
                        }
                        contactProfile.f42437s = string3;
                        if (jSONObject2.isNull("status")) {
                            string4 = "";
                        } else {
                            string4 = jSONObject2.getString("status");
                        }
                        contactProfile.f42458z = string4;
                        if (jSONObject2.isNull("avatar")) {
                            string5 = "";
                        } else {
                            string5 = jSONObject2.getString("avatar");
                        }
                        contactProfile.f42446v = string5;
                        if (jSONObject2.isNull("gender")) {
                            i11 = 0;
                        } else {
                            i11 = jSONObject2.getInt("gender");
                        }
                        contactProfile.f42449w = i11;
                        if (jSONObject2.isNull("dob")) {
                            string6 = "";
                        } else {
                            string6 = jSONObject2.getString("dob");
                        }
                        contactProfile.f42452x = string6;
                        if (!jSONObject2.isNull("isFriend")) {
                            jSONObject2.getInt("isFriend");
                        }
                        if (jSONObject2.has(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION)) {
                            JSONObject jSONObject3 = jSONObject2.getJSONObject(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
                            if (!jSONObject3.isNull("address")) {
                                str4 = jSONObject3.getString("address");
                            }
                            contactProfile.m40397a1(str4);
                        }
                        if (jSONObject2.optInt("isGroupOwner") == 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            GroupNearbyLobbyZView.this.f73873S0.add(contactProfile.f42434r);
                        }
                        if (!GroupNearbyLobbyZView.this.f73874T0.containsKey(contactProfile.f42434r)) {
                            WeakHashMap weakHashMap = GroupNearbyLobbyZView.this.f73874T0;
                            String str6 = contactProfile.f42434r;
                            weakHashMap.put(str6, str6);
                            GroupNearbyLobbyZView.this.f73872R0.add(contactProfile);
                            C16665v c16665v = new C16665v(contactProfile);
                            c16665v.m88805e(z12);
                            GroupNearbyLobbyZView.this.f73875U0.add(c16665v);
                        }
                        i12++;
                        str2 = str5;
                        str3 = str;
                    }
                    GroupNearbyLobbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.il
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupNearbyLobbyZView.C14377b.this.m80267f();
                        }
                    });
                }
            } catch (Exception e11) {
                GroupNearbyLobbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.jl
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupNearbyLobbyZView.C14377b.this.m80268g();
                    }
                });
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.GroupNearbyLobbyZView$c */
    /* loaded from: classes6.dex */
    public class C14378c implements InterfaceC20094a {
        C14378c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m80272e(C31973j5 c31973j5) {
            GroupNearbyLobbyZView.this.mo49315c4();
            GroupNearbyLobbyZView.this.m80263tM(c31973j5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m80273f() {
            try {
                GroupNearbyLobbyZView.this.f73868N0.findViewById(AbstractC6918a0.btn_join_group).setEnabled(false);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String m104492d;
            try {
                GroupNearbyLobbyZView groupNearbyLobbyZView = GroupNearbyLobbyZView.this;
                boolean z11 = false;
                groupNearbyLobbyZView.f73885e1 = false;
                if (groupNearbyLobbyZView.f72421L0.m92674mJ()) {
                    if (c20096c.m104491c() == -17024) {
                        m104492d = AbstractC23136l9.m118743r0(AbstractC8020f0.str_request_sent_and_wait_admin_approval_v2);
                        GroupNearbyLobbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ml
                            @Override // java.lang.Runnable
                            public final void run() {
                                GroupNearbyLobbyZView.C14378c.this.m80273f();
                            }
                        });
                    } else {
                        if (c20096c.m104491c() == -117) {
                            z11 = true;
                        }
                        if (z11) {
                            m104492d = GroupNearbyLobbyZView.this.m92652XI(AbstractC8020f0.str_group_code_expired);
                        } else {
                            m104492d = c20096c.m104492d();
                        }
                    }
                    GroupNearbyLobbyZView.this.m80258jM(z11, m104492d);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                GroupNearbyLobbyZView groupNearbyLobbyZView = GroupNearbyLobbyZView.this;
                groupNearbyLobbyZView.f73885e1 = false;
                if (groupNearbyLobbyZView.f72421L0.m92674mJ()) {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data").getJSONObject("group");
                    C19637j c19637j = C19637j.f97466a;
                    Pair m102835R = c19637j.m102835R(jSONObject);
                    final C31973j5 c31973j5 = (C31973j5) m102835R.first;
                    C32076q5 c32076q5 = (C32076q5) m102835R.second;
                    if (C0943w.m4462l().m4472f(c31973j5.m153781r()) == null) {
                        if (c31973j5.m153758f().equals(CoreUtility.f89233i)) {
                            c19637j.m102856l(c31973j5.m153781r(), false);
                        }
                        C0943w.m4462l().m4477n(c31973j5, c32076q5);
                        AbstractC23184q2.m119438C(c31973j5.m153781r());
                    }
                    GroupNearbyLobbyZView.this.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.ll
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupNearbyLobbyZView.C14378c.this.m80272e(c31973j5);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
                GroupNearbyLobbyZView groupNearbyLobbyZView2 = GroupNearbyLobbyZView.this;
                groupNearbyLobbyZView2.m80258jM(false, groupNearbyLobbyZView2.m92652XI(AbstractC8020f0.str_group_unknown_error));
            }
        }
    }

    /* renamed from: iM */
    private String m80251iM() {
        String str = "";
        if (TextUtils.isEmpty(this.f73880Z0)) {
            return "";
        }
        for (int i11 = 0; i11 < this.f73880Z0.length(); i11++) {
            str = str.concat(" " + this.f73880Z0.charAt(i11));
        }
        return str;
    }

    /* renamed from: kM */
    private void m80252kM() {
        String m92652XI;
        try {
            this.f73869O0 = (TextView) this.f73868N0.findViewById(AbstractC6918a0.tv_invite_code);
            this.f73871Q0 = (RecyclerView) this.f73868N0.findViewById(AbstractC6918a0.recycler_view);
            this.f73870P0 = (TextView) this.f73868N0.findViewById(AbstractC6918a0.tv_description);
            this.f73869O0.setText(m80251iM());
            TextView textView = this.f73870P0;
            if (!TextUtils.isEmpty(this.f73882b1)) {
                m92652XI = this.f73882b1;
            } else {
                m92652XI = m92652XI(AbstractC8020f0.str_group_lobby_description);
            }
            textView.setText(m92652XI);
            NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f73868N0.getContext());
            this.f73876V0 = noPredictiveItemAnimLinearLayoutMngr;
            noPredictiveItemAnimLinearLayoutMngr.m9723C2(1);
            this.f73871Q0.setLayoutManager(this.f73876V0);
            C7038d2 c7038d2 = new C7038d2();
            this.f73878X0 = c7038d2;
            this.f73871Q0.m9816A(c7038d2);
            this.f73877W0 = new C7026c2(this.f73867M0, C7026c2.d.GROUP_NEARBY_MODE, 4);
            this.f73871Q0.setHasFixedSize(true);
            this.f73871Q0.setAdapter(this.f73877W0);
            ArrayList arrayList = this.f73875U0;
            if (arrayList != null && arrayList.size() > 0) {
                this.f73877W0.m35912Y(this.f73875U0);
                this.f73877W0.m10008p();
            }
            this.f73877W0.m35910W(this);
            this.f73871Q0.m9826E(new C14376a());
            this.f73868N0.findViewById(AbstractC6918a0.btn_join_group).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.gl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupNearbyLobbyZView.this.m80254nM(view);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public /* synthetic */ void m80253mM(String str, boolean z11) {
        try {
            ToastUtils.showMess(str);
            mo49315c4();
            if (z11) {
                finish();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m80254nM(View view) {
        m80259lM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m80255oM() {
        try {
            this.f73877W0.m35912Y(this.f73875U0);
            this.f73877W0.m10008p();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m80256pM() {
        try {
            this.f73877W0.m35912Y(this.f73875U0);
            this.f73877W0.m10008p();
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f73867M0 = new C23528a(m92648SI());
        int i11 = 0;
        if (bundle != null) {
            this.f73872R0 = bundle.getParcelableArrayList("extra_data");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("extra_group_owner_uids");
            this.f73873S0 = stringArrayList;
            if (stringArrayList == null) {
                this.f73873S0 = new ArrayList();
            }
            if (this.f73872R0 != null) {
                while (i11 < this.f73872R0.size()) {
                    ContactProfile contactProfile = (ContactProfile) this.f73872R0.get(i11);
                    WeakHashMap weakHashMap = this.f73874T0;
                    String str = contactProfile.f42434r;
                    weakHashMap.put(str, str);
                    C16665v c16665v = new C16665v(contactProfile);
                    ArrayList arrayList = this.f73873S0;
                    if (arrayList != null && arrayList.contains(contactProfile.f42434r)) {
                        c16665v.m88805e(true);
                    }
                    this.f73875U0.add(c16665v);
                    i11++;
                }
            }
            this.f73880Z0 = bundle.getString("extra_pin");
            this.f73881a1 = bundle.getString("extra_lobby_id");
            this.f73882b1 = bundle.getString("extra_lobby_description");
            this.f73883c1 = bundle.getBoolean("extra_load_more");
            return;
        }
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.containsKey("extra_pin")) {
            this.f73880Z0 = m92642L3.getString("extra_pin");
        }
        if (m92642L3 != null && m92642L3.containsKey("extra_lobby_id")) {
            this.f73881a1 = m92642L3.getString("extra_lobby_id");
        }
        if (m92642L3 != null && m92642L3.containsKey("extra_lobby_description")) {
            this.f73882b1 = m92642L3.getString("extra_lobby_description");
        }
        if (m92642L3 != null && m92642L3.containsKey("extra_load_more")) {
            this.f73883c1 = m92642L3.getBoolean("extra_load_more");
        }
        if (m92642L3 != null && m92642L3.containsKey("extra_data")) {
            this.f73872R0 = m92642L3.getParcelableArrayList("extra_data");
        }
        if (m92642L3 != null && m92642L3.containsKey("extra_group_owner_uids")) {
            this.f73873S0 = m92642L3.getStringArrayList("extra_group_owner_uids");
        }
        if (this.f73873S0 == null) {
            this.f73873S0 = new ArrayList();
        }
        if (this.f73872R0 != null) {
            while (i11 < this.f73872R0.size()) {
                ContactProfile contactProfile2 = (ContactProfile) this.f73872R0.get(i11);
                WeakHashMap weakHashMap2 = this.f73874T0;
                String str2 = contactProfile2.f42434r;
                weakHashMap2.put(str2, str2);
                C16665v c16665v2 = new C16665v(contactProfile2);
                ArrayList arrayList2 = this.f73873S0;
                if (arrayList2 != null && arrayList2.contains(contactProfile2.f42434r)) {
                    c16665v2.m88805e(true);
                }
                this.f73875U0.add(c16665v2);
                i11++;
            }
        }
    }

    @Override // com.zing.zalo.adapters.C7026c2.a
    /* renamed from: E5 */
    public void mo35914E5() {
        this.f73877W0.m35911X(1);
        this.f73877W0.m10008p();
        m80260qM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f73868N0 = layoutInflater.inflate(AbstractC7409c0.group_rada_lobby_view, viewGroup, false);
        m80252kM();
        return this.f73868N0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.m124114c().m124117e(this, 30);
        C23744a.m124114c().m124117e(this, 31);
    }

    @Override // com.zing.zalo.adapters.C7026c2.a
    /* renamed from: Rs */
    public boolean mo35915Rs(ContactProfile contactProfile) {
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putParcelableArrayList("extra_data", this.f73872R0);
        bundle.putString("extra_pin", this.f73880Z0);
        bundle.putBoolean("extra_load_more", this.f73883c1);
        bundle.putString("extra_lobby_id", this.f73881a1);
        bundle.putString("extra_lobby_description", this.f73882b1);
    }

    @Override // com.zing.zalo.adapters.C7026c2.a
    /* renamed from: ZE */
    public void mo35916ZE() {
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupNearbyLobbyZView";
    }

    /* renamed from: hM */
    void m80257hM() {
        new C0766k().mo1645g8(this.f73881a1);
    }

    /* renamed from: jM */
    void m80258jM(final boolean z11, final String str) {
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.hl
            @Override // java.lang.Runnable
            public final void run() {
                GroupNearbyLobbyZView.this.m80253mM(str, z11);
            }
        });
    }

    /* renamed from: lM */
    void m80259lM() {
        if (this.f73885e1) {
            return;
        }
        if (!C23055e5.m118271f()) {
            m80258jM(false, m92652XI(AbstractC8020f0.NETWORK_ERROR_MSG));
            return;
        }
        this.f73885e1 = true;
        mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14378c());
        c0766k.mo1452I6(C28139n5.m141620j().m141645r(), C28139n5.m141620j().m141640m(), this.f73880Z0, this.f73881a1);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            m80257hM();
            finish();
            return true;
        }
        return false;
    }

    /* renamed from: qM */
    void m80260qM() {
        try {
            if (this.f73884d1) {
                return;
            }
            this.f73884d1 = true;
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14377b());
            double m141645r = C28139n5.m141620j().m141645r();
            double m141640m = C28139n5.m141620j().m141640m();
            int m122489v1 = AbstractC23309i.m122489v1();
            ArrayList arrayList = this.f73872R0;
            c0766k.mo1661i8(m141645r, m141640m, m122489v1, this.f73879Y0, 20, Integer.parseInt(((ContactProfile) arrayList.get(arrayList.size() - 1)).f42434r), this.f73880Z0, this.f73881a1);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            this.f73884d1 = false;
        }
    }

    /* renamed from: rM */
    void m80261rM(ContactProfile contactProfile) {
        try {
            if (!this.f73874T0.containsKey(contactProfile.f42434r)) {
                WeakHashMap weakHashMap = this.f73874T0;
                String str = contactProfile.f42434r;
                weakHashMap.put(str, str);
                this.f73872R0.add(contactProfile);
                this.f73875U0.add(new C16665v(contactProfile));
                if (this.f72421L0.m92674mJ()) {
                    mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.el
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupNearbyLobbyZView.this.m80255oM();
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: sM */
    void m80262sM(String str) {
        try {
            if (this.f73874T0.containsKey(str)) {
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f73872R0.size()) {
                        break;
                    }
                    if (((ContactProfile) this.f73872R0.get(i11)).f42434r.equals(str)) {
                        this.f73872R0.remove(i11);
                        this.f73875U0.remove(i11);
                        break;
                    }
                    i11++;
                }
                this.f73873S0.remove(str);
                this.f73874T0.remove(str);
                if (this.f72421L0.m92674mJ()) {
                    mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.fl
                        @Override // java.lang.Runnable
                        public final void run() {
                            GroupNearbyLobbyZView.this.m80256pM();
                        }
                    });
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: tM */
    void m80263tM(C31973j5 c31973j5) {
        try {
            ContactProfile contactProfile = new ContactProfile(1, c31973j5.m153781r());
            contactProfile.f42437s = c31973j5.m153793y();
            Bundle m140776b = new C27870vb(contactProfile.mo2478b()).m140780g(contactProfile).m140776b();
            m140776b.putString("groupId", c31973j5.m153781r());
            m140776b.putString("groupName", c31973j5.m153793y());
            m140776b.putInt("SHOW_WITH_FLAGS", 7340032);
            m92676n2().mo35573l4(ChatView.class, m140776b, 1, true);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 != 30) {
            if (i11 == 31) {
                try {
                    String str = (String) objArr[0];
                    String str2 = (String) objArr[1];
                    if (!TextUtils.isEmpty(str2) && str2.equals(this.f73881a1)) {
                        m80262sM(str);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                    return;
                }
            }
            return;
        }
        try {
            ContactProfile contactProfile = (ContactProfile) objArr[0];
            String str3 = (String) objArr[1];
            if (!TextUtils.isEmpty(str3) && str3.equals(this.f73881a1)) {
                m80261rM(contactProfile);
            }
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.m124114c().m124115b(this, 30);
        C23744a.m124114c().m124115b(this, 31);
    }
}

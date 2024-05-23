package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.GroupAdminMemberView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23262x6;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p361nb.AbstractC23647d;
import p656xs.AbstractC30201b;
import p716zh.C31973j5;
import qm0.AbstractC25368s;
import zc0.C31784b;

/* loaded from: classes6.dex */
public final class GroupAdminMemberView extends BaseGroupMemberView implements InterfaceC0733x {
    public static final C14304a Companion = new C14304a(null);

    /* renamed from: G1 */
    private InterfaceC0765j f73543G1 = new C0766k();

    /* renamed from: H1 */
    private InterfaceC20094a f73544H1 = new C14305b();

    /* renamed from: com.zing.zalo.ui.zviews.GroupAdminMemberView$a */
    /* loaded from: classes6.dex */
    public static final class C14304a {
        private C14304a() {
        }

        public /* synthetic */ C14304a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final Bundle m79877a(String str) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("extra_activity_title", str);
            }
            return bundle;
        }

        /* renamed from: b */
        public final GroupAdminMemberView m79878b(Bundle bundle) {
            GroupAdminMemberView groupAdminMemberView = new GroupAdminMemberView();
            groupAdminMemberView.mo60305zK(bundle);
            return groupAdminMemberView;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupAdminMemberView$b */
    /* loaded from: classes6.dex */
    public static final class C14305b implements InterfaceC20094a {
        C14305b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m79880d(C20096c c20096c, GroupAdminMemberView groupAdminMemberView) {
            MultiStateView.EnumC15915f enumC15915f;
            int i11;
            AbstractC19074t.m100208f(c20096c, "$this_run");
            AbstractC19074t.m100208f(groupAdminMemberView, "this$0");
            try {
                int m104491c = c20096c.m104491c();
                groupAdminMemberView.mo78422yN(false);
                MultiStateView multiStateView = groupAdminMemberView.m78410hN().f137468t;
                multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
                if (m104491c == 50001) {
                    enumC15915f = MultiStateView.EnumC15915f.NETWORK_ERROR;
                } else {
                    enumC15915f = MultiStateView.EnumC15915f.UNKNOWN_ERROR;
                }
                multiStateView.setErrorType(enumC15915f);
                if (m104491c == 50001) {
                    i11 = AbstractC8020f0.NETWORK_ERROR_MSG;
                } else {
                    i11 = AbstractC8020f0.str_tv_loadingMemberList_error;
                }
                multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(i11));
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            GroupAdminMemberView.this.m78418sN();
            try {
                final GroupAdminMemberView groupAdminMemberView = GroupAdminMemberView.this;
                groupAdminMemberView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.yg
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupAdminMemberView.C14305b.m79880d(C20096c.this, groupAdminMemberView);
                    }
                });
                GroupAdminMemberView.this.f72325C1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            ContactProfile contactProfile;
            String obj2;
            int i11;
            boolean z12;
            int i12;
            boolean z13;
            ContactProfile contactProfile2;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = new JSONObject(obj.toString());
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                int i13 = 0;
                if (!jSONObject.isNull("error_code") && jSONObject.getInt("error_code") == 0) {
                    GroupAdminMemberView groupAdminMemberView = GroupAdminMemberView.this;
                    if (groupAdminMemberView.f72323A1 == 0) {
                        groupAdminMemberView.f72337r1.clear();
                        GroupAdminMemberView.this.f72330k1.clear();
                        GroupAdminMemberView groupAdminMemberView2 = GroupAdminMemberView.this;
                        int optInt = jSONObject2.optInt("ownerId");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(optInt);
                        groupAdminMemberView2.f72342w1 = sb2.toString();
                    }
                    GroupAdminMemberView groupAdminMemberView3 = GroupAdminMemberView.this;
                    if (jSONObject2.optInt("hasMore") == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    groupAdminMemberView3.f72345z1 = z11;
                    GroupAdminMemberView.this.f72324B1 = jSONObject2.optInt("lastId");
                    JSONArray optJSONArray = jSONObject2.optJSONArray("adminMembers");
                    if (optJSONArray == null) {
                        optJSONArray = new JSONArray();
                    }
                    JSONArray jSONArray = optJSONArray;
                    int length = jSONArray.length();
                    int i14 = 0;
                    while (i14 < length) {
                        try {
                            Object obj3 = jSONArray.get(i14);
                            AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject3 = (JSONObject) obj3;
                            GroupAdminMemberView groupAdminMemberView4 = GroupAdminMemberView.this;
                            int optInt2 = jSONObject3.optInt("uid");
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(optInt2);
                            String sb4 = sb3.toString();
                            String optString = jSONObject3.optString("dpn");
                            String optString2 = jSONObject3.optString("avt");
                            int optInt3 = jSONObject3.optInt("typeContact");
                            if (!TextUtils.isEmpty(sb4) && !groupAdminMemberView4.f72330k1.containsKey(sb4)) {
                                GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(i13);
                                if (AbstractC19074t.m100204b(groupAdminMemberView4.f72342w1, sb4)) {
                                    c6938b.f38025e = true;
                                } else {
                                    c6938b.f38027g = true;
                                }
                                ContactProfile m78411iN = groupAdminMemberView4.m78411iN(sb4, optString, optString2, optInt3);
                                c6938b.f38022b = m78411iN;
                                c6938b.f38026f = AbstractC30201b.m148949b(groupAdminMemberView4.f72357R0, m78411iN);
                                JSONObject optJSONObject = jSONObject3.optJSONObject("inviteInfo");
                                if (optJSONObject != null) {
                                    contactProfile2 = new ContactProfile();
                                    int optInt4 = optJSONObject.optInt("uid");
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(optInt4);
                                    contactProfile2.f42434r = sb5.toString();
                                    contactProfile2.f42437s = optJSONObject.optString("dpn");
                                    contactProfile2.f42446v = optJSONObject.optString("avt");
                                    contactProfile2.f42376S0 = optJSONObject.optInt("src");
                                    contactProfile2.f42330D = optJSONObject.optInt("ts");
                                } else {
                                    contactProfile2 = null;
                                }
                                c6938b.f38023c = contactProfile2;
                                groupAdminMemberView4.f72337r1.add(c6938b);
                                groupAdminMemberView4.f72330k1.put(sb4, c6938b);
                            }
                            C19637j.f97466a.m102837T(sb4, jSONObject3);
                        } catch (Exception e11) {
                            AbstractC23350e.m122778h(e11);
                        }
                        i14++;
                        i13 = 0;
                    }
                    Iterator it = GroupAdminMemberView.this.f72337r1.iterator();
                    while (it.hasNext()) {
                        GroupFullMemberAdapter.C6938b c6938b2 = (GroupFullMemberAdapter.C6938b) it.next();
                        if (c6938b2.f38021a == 0 && (contactProfile = c6938b2.f38022b) != null) {
                            if (AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
                                String m120002o = AbstractC23262x6.m120002o(AbstractC23136l9.m118743r0(AbstractC8020f0.str_you));
                                AbstractC19074t.m100207e(m120002o, "convertSignToNoSign(...)");
                                int length2 = m120002o.length() - 1;
                                int i15 = 0;
                                boolean z14 = false;
                                while (i15 <= length2) {
                                    if (!z14) {
                                        i12 = i15;
                                    } else {
                                        i12 = length2;
                                    }
                                    if (AbstractC19074t.m100209g(m120002o.charAt(i12), 32) <= 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (!z14) {
                                        if (!z13) {
                                            z14 = true;
                                        } else {
                                            i15++;
                                        }
                                    } else if (!z13) {
                                        break;
                                    } else {
                                        length2--;
                                    }
                                }
                                obj2 = m120002o.subSequence(i15, length2 + 1).toString();
                            } else {
                                String m120002o2 = AbstractC23262x6.m120002o(contactProfile.m40383Q(true, false));
                                AbstractC19074t.m100207e(m120002o2, "convertSignToNoSign(...)");
                                int length3 = m120002o2.length() - 1;
                                int i16 = 0;
                                boolean z15 = false;
                                while (i16 <= length3) {
                                    if (!z15) {
                                        i11 = i16;
                                    } else {
                                        i11 = length3;
                                    }
                                    if (AbstractC19074t.m100209g(m120002o2.charAt(i11), 32) <= 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z15) {
                                        if (!z12) {
                                            z15 = true;
                                        } else {
                                            i16++;
                                        }
                                    } else if (!z12) {
                                        break;
                                    } else {
                                        length3--;
                                    }
                                }
                                obj2 = m120002o2.subSequence(i16, length3 + 1).toString();
                            }
                            contactProfile.f42440t = obj2;
                        }
                    }
                    GroupAdminMemberView groupAdminMemberView5 = GroupAdminMemberView.this;
                    if (groupAdminMemberView5.f72323A1 == 0) {
                        C31973j5 c31973j5 = groupAdminMemberView5.f72357R0;
                        if (c31973j5 != null && c31973j5.m153778p0()) {
                            GroupAdminMemberView.this.f72337r1.add(new GroupFullMemberAdapter.C6938b(2));
                        }
                        GroupAdminMemberView groupAdminMemberView6 = GroupAdminMemberView.this;
                        Collections.sort(groupAdminMemberView6.f72337r1, groupAdminMemberView6.f72343x1);
                    }
                    GroupAdminMemberView groupAdminMemberView7 = GroupAdminMemberView.this;
                    if (groupAdminMemberView7.f72345z1) {
                        groupAdminMemberView7.f72323A1++;
                    }
                    groupAdminMemberView7.mo78416pN();
                }
                GroupAdminMemberView.this.f72325C1 = false;
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
                GroupAdminMemberView.this.m78418sN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupAdminMemberView$c */
    /* loaded from: classes6.dex */
    public static final class C14306c extends RecyclerView.AbstractC1892s {
        C14306c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                try {
                    GroupFullMemberAdapter groupFullMemberAdapter = GroupAdminMemberView.this.f72331l1;
                    if (groupFullMemberAdapter != null) {
                        groupFullMemberAdapter.m35636Q(false);
                        groupFullMemberAdapter.m10008p();
                    }
                    LinearLayoutManager linearLayoutManager = GroupAdminMemberView.this.f72333n1;
                    AbstractC19074t.m100205c(linearLayoutManager);
                    int m10127i = linearLayoutManager.m10127i();
                    LinearLayoutManager linearLayoutManager2 = GroupAdminMemberView.this.f72333n1;
                    AbstractC19074t.m100205c(linearLayoutManager2);
                    if (linearLayoutManager2.m9745c2() >= m10127i - 2) {
                        GroupAdminMemberView groupAdminMemberView = GroupAdminMemberView.this;
                        if (!groupAdminMemberView.f72325C1 && groupAdminMemberView.f72345z1) {
                            groupAdminMemberView.mo78412jN();
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TN */
    public static final void m79873TN(GroupAdminMemberView groupAdminMemberView) {
        AbstractC19074t.m100208f(groupAdminMemberView, "this$0");
        ActionBar actionBar = groupAdminMemberView.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(AbstractC23136l9.m118746s0(AbstractC8020f0.str_group_admin_count_v2, Integer.valueOf(groupAdminMemberView.f72337r1.size() - 1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UN */
    public static final boolean m79874UN(GroupAdminMemberView groupAdminMemberView, RecyclerView recyclerView, int i11, View view) {
        GroupFullMemberAdapter.C6938b m35631L;
        ContactProfile contactProfile;
        AbstractC19074t.m100208f(groupAdminMemberView, "this$0");
        groupAdminMemberView.f72334o1 = i11;
        String str = groupAdminMemberView.f72339t1;
        AbstractC19074t.m100205c(str);
        GroupFullMemberAdapter groupFullMemberAdapter = groupAdminMemberView.f72331l1;
        if (groupFullMemberAdapter != null && (m35631L = groupFullMemberAdapter.m35631L(groupAdminMemberView.f72334o1)) != null && m35631L.f38021a == 0 && (contactProfile = m35631L.f38022b) != null && !AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
            groupAdminMemberView.f72326D1 = m35631L.f38022b;
            GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
            if (interfaceC6939c != null) {
                AbstractC23647d.m123897g("1591101");
                interfaceC6939c.mo35657j(str, contactProfile, 2);
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public static final void m79875VN(GroupAdminMemberView groupAdminMemberView, RecyclerView recyclerView, int i11, View view) {
        GroupFullMemberAdapter.C6938b m35631L;
        AbstractC19074t.m100208f(groupAdminMemberView, "this$0");
        try {
            groupAdminMemberView.f72334o1 = i11;
            String str = groupAdminMemberView.f72339t1;
            AbstractC19074t.m100205c(str);
            GroupFullMemberAdapter groupFullMemberAdapter = groupAdminMemberView.f72331l1;
            if (groupFullMemberAdapter != null && (m35631L = groupFullMemberAdapter.m35631L(groupAdminMemberView.f72334o1)) != null) {
                if (m35631L.f38021a == 2) {
                    GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
                    if (interfaceC6939c != null) {
                        AbstractC23647d.m123897g("1591030");
                        interfaceC6939c.mo35658k(str);
                    }
                } else {
                    ContactProfile contactProfile = m35631L.f38022b;
                    if (contactProfile != null) {
                        if (!AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
                            groupAdminMemberView.f72326D1 = contactProfile;
                            AbstractC23647d.m123897g("1591101");
                            GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c2 = groupFullMemberAdapter.f38013z;
                            if (interfaceC6939c2 != null) {
                                AbstractC23647d.m123897g("1591101");
                                interfaceC6939c2.mo35657j(str, contactProfile, 2);
                            }
                        } else {
                            GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c3 = groupFullMemberAdapter.f38013z;
                            if (interfaceC6939c3 != null) {
                                AbstractC23647d.m123897g("1591122");
                                String str2 = contactProfile.f42434r;
                                AbstractC19074t.m100207e(str2, "uid");
                                interfaceC6939c3.mo35659l(str2, str);
                            }
                        }
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: CN */
    public void mo78394CN() {
        boolean z11;
        int i11;
        super.mo78394CN();
        try {
            C31973j5 c31973j5 = this.f72357R0;
            if (c31973j5 != null) {
                z11 = c31973j5.m153747Y();
            } else {
                z11 = false;
            }
            Context m92686rK = this.f72421L0.m92686rK();
            AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
            this.f72331l1 = new GroupFullMemberAdapter(m92686rK, this.f72336q1, this.f72335p1, this.f72344y1, 2, null, z11, 32, null);
            m78410hN().f137465q.setAdapter(this.f72331l1);
            m78410hN().f137466r.setVisibility(0);
            RobotoTextView robotoTextView = m78410hN().f137467s;
            if (z11) {
                i11 = AbstractC8020f0.str_community_manage_owner_admin_view_desc;
            } else {
                i11 = AbstractC8020f0.str_manage_admin_view_desc_v4;
            }
            robotoTextView.setText(i11);
            GroupFullMemberAdapter groupFullMemberAdapter = this.f72331l1;
            if (groupFullMemberAdapter != null) {
                groupFullMemberAdapter.f38011x = true;
            }
            C31784b.m152808a(m78410hN().f137465q).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.vg
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i12, View view) {
                    GroupAdminMemberView.m79875VN(GroupAdminMemberView.this, recyclerView, i12, view);
                }
            });
            C31784b.m152808a(m78410hN().f137465q).m152810c(new C31784b.e() { // from class: com.zing.zalo.ui.zviews.wg
                @Override // zc0.C31784b.e
                /* renamed from: T3 */
                public final boolean mo81113T3(RecyclerView recyclerView, int i12, View view) {
                    boolean m79874UN;
                    m79874UN = GroupAdminMemberView.m79874UN(GroupAdminMemberView.this, recyclerView, i12, view);
                    return m79874UN;
                }
            });
            m78410hN().f137465q.m9826E(new C14306c());
            AbstractC23126l.m118627a("GroupAdminMemberView");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        m92637BK(true);
        mo78394CN();
        mo78415mN();
        LinearLayout root = m78410hN().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: WN */
    public void m79876WN(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.f72330k1.containsKey(str)) {
                ArrayList arrayList2 = this.f72337r1;
                AbstractC19069o0.m100184a(arrayList2).remove(this.f72330k1.remove(str));
            }
        }
        Collections.sort(this.f72337r1, this.f72343x1);
        mo78416pN();
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupAdminMemberView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: jN */
    public void mo78412jN() {
        if (TextUtils.isEmpty(this.f72339t1) || this.f72325C1) {
            return;
        }
        this.f72325C1 = true;
        m78406bN(10);
        this.f73543G1.mo1704o8(this.f73544H1);
        this.f73543G1.mo1617d4(this.f72339t1, this.f72323A1, this.f72324B1, (byte) 1);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 101) {
            AbstractC23647d.m123897g("1591031");
            if (intent != null && i12 == -1 && intent.hasExtra("extra_selected_profiles")) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
                if (parcelableArrayListExtra == null) {
                    parcelableArrayListExtra = new ArrayList();
                } else {
                    AbstractC19074t.m100205c(parcelableArrayListExtra);
                }
                m78405aN(this.f72339t1, parcelableArrayListExtra);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: pN */
    public synchronized void mo78416pN() {
        super.mo78416pN();
        this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.xg
            @Override // java.lang.Runnable
            public final void run() {
                GroupAdminMemberView.m79873TN(GroupAdminMemberView.this);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        List m131505m;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 27 && objArr.length >= 3) {
            Object obj = objArr[0];
            AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.String");
            Object obj2 = objArr[1];
            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            Object obj3 = objArr[2];
            AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
            String[] split = TextUtils.split((String) obj3, ";");
            AbstractC19074t.m100207e(split, "split(...)");
            m131505m = AbstractC25368s.m131505m(Arrays.copyOf(split, split.length));
            ArrayList arrayList = new ArrayList(m131505m);
            boolean contains = arrayList.contains(CoreUtility.f89233i);
            if (AbstractC19074t.m100204b(this.f72339t1, (String) obj) && (!arrayList.isEmpty())) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                if (intValue != 10) {
                                    if (intValue == 11) {
                                        mo78399IN(arrayList);
                                        return;
                                    }
                                    return;
                                } else if (contains) {
                                    finish();
                                    return;
                                } else {
                                    mo78396FN(arrayList);
                                    return;
                                }
                            }
                            mo78397GN(arrayList);
                            return;
                        }
                        if (contains) {
                            finish();
                            return;
                        } else {
                            mo78403NN(arrayList);
                            return;
                        }
                    }
                    m79876WN(arrayList);
                    return;
                }
                mo78404ON(arrayList);
            }
        }
    }
}

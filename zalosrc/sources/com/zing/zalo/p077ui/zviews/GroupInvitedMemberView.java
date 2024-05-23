package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import am.C0943w;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.GroupInvitedMemberView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import gw.C19637j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p361nb.AbstractC23647d;
import p716zh.C31973j5;
import qm0.AbstractC25368s;
import zc0.C31784b;

/* loaded from: classes6.dex */
public final class GroupInvitedMemberView extends BaseGroupMemberView implements InterfaceC0733x {
    public static final C14354a Companion = new C14354a(null);

    /* renamed from: G1 */
    private InterfaceC0765j f73779G1 = new C0766k();

    /* renamed from: H1 */
    private InterfaceC20094a f73780H1 = new C14355b();

    /* renamed from: com.zing.zalo.ui.zviews.GroupInvitedMemberView$a */
    /* loaded from: classes6.dex */
    public static final class C14354a {
        private C14354a() {
        }

        public /* synthetic */ C14354a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final GroupInvitedMemberView m80179a(Bundle bundle) {
            GroupInvitedMemberView groupInvitedMemberView = new GroupInvitedMemberView();
            groupInvitedMemberView.mo60305zK(bundle);
            return groupInvitedMemberView;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInvitedMemberView$b */
    /* loaded from: classes6.dex */
    public static final class C14355b implements InterfaceC20094a {
        C14355b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m80181d(C20096c c20096c, GroupInvitedMemberView groupInvitedMemberView) {
            MultiStateView.EnumC15915f enumC15915f;
            int i11;
            AbstractC19074t.m100208f(c20096c, "$this_apply");
            AbstractC19074t.m100208f(groupInvitedMemberView, "this$0");
            try {
                int m104491c = c20096c.m104491c();
                groupInvitedMemberView.mo78422yN(false);
                MultiStateView multiStateView = groupInvitedMemberView.m78410hN().f137468t;
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
            GroupInvitedMemberView.this.m78418sN();
            try {
                final GroupInvitedMemberView groupInvitedMemberView = GroupInvitedMemberView.this;
                groupInvitedMemberView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.jk
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupInvitedMemberView.C14355b.m80181d(C20096c.this, groupInvitedMemberView);
                    }
                });
                GroupInvitedMemberView.this.f72325C1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            String str;
            String str2;
            ContactProfile contactProfile;
            String str3 = "typeContact";
            String str4 = "avt";
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                GroupInvitedMemberView groupInvitedMemberView = GroupInvitedMemberView.this;
                if (groupInvitedMemberView.f72323A1 == 0) {
                    groupInvitedMemberView.f72337r1.clear();
                    GroupInvitedMemberView.this.f72330k1.clear();
                    GroupInvitedMemberView groupInvitedMemberView2 = GroupInvitedMemberView.this;
                    int optInt = jSONObject.optInt("ownerId");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(optInt);
                    groupInvitedMemberView2.f72342w1 = sb2.toString();
                }
                GroupInvitedMemberView groupInvitedMemberView3 = GroupInvitedMemberView.this;
                int i11 = 0;
                if (jSONObject.optInt("hasMore") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                groupInvitedMemberView3.f72345z1 = z11;
                GroupInvitedMemberView.this.f72324B1 = jSONObject.optInt("lastId");
                JSONArray optJSONArray = jSONObject.optJSONArray("inviteMembers");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                JSONArray jSONArray = optJSONArray;
                int length = jSONArray.length();
                int i12 = 0;
                while (i12 < length) {
                    try {
                        Object obj2 = jSONArray.get(i12);
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject2 = (JSONObject) obj2;
                        GroupInvitedMemberView groupInvitedMemberView4 = GroupInvitedMemberView.this;
                        int optInt2 = jSONObject2.optInt("uid");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(optInt2);
                        String sb4 = sb3.toString();
                        String optString = jSONObject2.optString("dpn");
                        String optString2 = jSONObject2.optString(str4);
                        int optInt3 = jSONObject2.optInt(str3);
                        if (!TextUtils.isEmpty(sb4) && !groupInvitedMemberView4.f72330k1.containsKey(sb4)) {
                            GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(i11);
                            ContactProfile m78411iN = groupInvitedMemberView4.m78411iN(sb4, optString, optString2, optInt3);
                            m78411iN.f42428p = jSONObject2.getInt(str3);
                            c6938b.f38022b = m78411iN;
                            JSONObject optJSONObject = jSONObject2.optJSONObject("inviteInfo");
                            if (optJSONObject != null) {
                                contactProfile = new ContactProfile();
                                int optInt4 = optJSONObject.optInt("uid");
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(optInt4);
                                contactProfile.f42434r = sb5.toString();
                                contactProfile.f42437s = optJSONObject.optString("dpn");
                                contactProfile.f42446v = optJSONObject.optString(str4);
                                contactProfile.f42376S0 = optJSONObject.optInt("src");
                                int optInt5 = optJSONObject.optInt("ts");
                                str = str3;
                                str2 = str4;
                                try {
                                    contactProfile.f42330D = optInt5;
                                } catch (Exception e11) {
                                    e = e11;
                                    AbstractC23350e.m122778h(e);
                                    i12++;
                                    str3 = str;
                                    str4 = str2;
                                    i11 = 0;
                                }
                            } else {
                                str = str3;
                                str2 = str4;
                                contactProfile = null;
                            }
                            c6938b.f38023c = contactProfile;
                            groupInvitedMemberView4.f72337r1.add(c6938b);
                            groupInvitedMemberView4.f72330k1.put(sb4, c6938b);
                        } else {
                            str = str3;
                            str2 = str4;
                        }
                        C19637j.f97466a.m102837T(sb4, jSONObject2);
                    } catch (Exception e12) {
                        e = e12;
                        str = str3;
                        str2 = str4;
                    }
                    i12++;
                    str3 = str;
                    str4 = str2;
                    i11 = 0;
                }
                GroupInvitedMemberView groupInvitedMemberView5 = GroupInvitedMemberView.this;
                if (groupInvitedMemberView5.f72345z1) {
                    groupInvitedMemberView5.f72323A1++;
                }
                groupInvitedMemberView5.f72325C1 = false;
                groupInvitedMemberView5.mo78416pN();
            } catch (Exception e13) {
                AbstractC23350e.m122778h(e13);
                GroupInvitedMemberView.this.m78418sN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInvitedMemberView$c */
    /* loaded from: classes6.dex */
    public static final class C14356c extends RecyclerView.AbstractC1892s {
        C14356c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: b */
        public void mo952b(RecyclerView recyclerView, int i11) {
            String str;
            int i12;
            boolean z11;
            Editable text;
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo952b(recyclerView, i11);
            if (i11 == 0) {
                try {
                    GroupFullMemberAdapter groupFullMemberAdapter = GroupInvitedMemberView.this.f72331l1;
                    if (groupFullMemberAdapter != null) {
                        groupFullMemberAdapter.m35636Q(false);
                        groupFullMemberAdapter.m10008p();
                    }
                    LinearLayoutManager linearLayoutManager = GroupInvitedMemberView.this.f72333n1;
                    AbstractC19074t.m100205c(linearLayoutManager);
                    int m10127i = linearLayoutManager.m10127i();
                    LinearLayoutManager linearLayoutManager2 = GroupInvitedMemberView.this.f72333n1;
                    AbstractC19074t.m100205c(linearLayoutManager2);
                    int m9745c2 = linearLayoutManager2.m9745c2();
                    EditText editText = GroupInvitedMemberView.this.f72332m1;
                    if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
                        str = "";
                    }
                    int length = str.length() - 1;
                    int i13 = 0;
                    boolean z12 = false;
                    while (i13 <= length) {
                        if (!z12) {
                            i12 = i13;
                        } else {
                            i12 = length;
                        }
                        if (AbstractC19074t.m100209g(str.charAt(i12), 32) <= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z12) {
                            if (!z11) {
                                z12 = true;
                            } else {
                                i13++;
                            }
                        } else if (!z11) {
                            break;
                        } else {
                            length--;
                        }
                    }
                    if (TextUtils.isEmpty(str.subSequence(i13, length + 1).toString()) && m9745c2 >= m10127i - 2) {
                        GroupInvitedMemberView groupInvitedMemberView = GroupInvitedMemberView.this;
                        if (!groupInvitedMemberView.f72325C1 && groupInvitedMemberView.f72345z1) {
                            groupInvitedMemberView.mo78412jN();
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupInvitedMemberView$d */
    /* loaded from: classes6.dex */
    public static final class C14357d implements InterfaceC20094a {
        C14357d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            GroupInvitedMemberView.this.f72421L0.mo49315c4();
            ToastUtils.m89268p(c20096c.m104492d());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "response");
            GroupInvitedMemberView.this.f72421L0.mo49315c4();
            GroupInvitedMemberView groupInvitedMemberView = GroupInvitedMemberView.this;
            if (groupInvitedMemberView.f72330k1.containsKey(groupInvitedMemberView.f72340u1)) {
                GroupInvitedMemberView groupInvitedMemberView2 = GroupInvitedMemberView.this;
                ArrayList arrayList = groupInvitedMemberView2.f72337r1;
                AbstractC19069o0.m100184a(arrayList).remove(groupInvitedMemberView2.f72330k1.remove(groupInvitedMemberView2.f72340u1));
                GroupInvitedMemberView.this.mo78416pN();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TN */
    public static final void m80175TN(GroupInvitedMemberView groupInvitedMemberView) {
        AbstractC19074t.m100208f(groupInvitedMemberView, "this$0");
        try {
            groupInvitedMemberView.mo78422yN(false);
            GroupFullMemberAdapter groupFullMemberAdapter = groupInvitedMemberView.f72331l1;
            if (groupFullMemberAdapter != null) {
                groupFullMemberAdapter.m35635P(groupInvitedMemberView.f72336q1);
                groupFullMemberAdapter.m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UN */
    public static final void m80176UN(GroupInvitedMemberView groupInvitedMemberView, String str, RecyclerView recyclerView, int i11, View view) {
        GroupFullMemberAdapter.C6938b m35631L;
        ContactProfile contactProfile;
        GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c;
        AbstractC19074t.m100208f(groupInvitedMemberView, "this$0");
        AbstractC19074t.m100208f(str, "$groupId");
        try {
            groupInvitedMemberView.f72334o1 = i11;
            GroupFullMemberAdapter groupFullMemberAdapter = groupInvitedMemberView.f72331l1;
            if (groupFullMemberAdapter != null && (m35631L = groupFullMemberAdapter.m35631L(i11)) != null && (contactProfile = m35631L.f38022b) != null && m35631L.f38021a == 0 && (interfaceC6939c = groupFullMemberAdapter.f38013z) != null) {
                AbstractC23647d.m123897g("1591101");
                interfaceC6939c.mo35657j(str, contactProfile, 3);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public static final boolean m80177VN(GroupInvitedMemberView groupInvitedMemberView, String str, RecyclerView recyclerView, int i11, View view) {
        GroupFullMemberAdapter.C6938b m35631L;
        ContactProfile contactProfile;
        AbstractC19074t.m100208f(groupInvitedMemberView, "this$0");
        AbstractC19074t.m100208f(str, "$groupId");
        groupInvitedMemberView.f72334o1 = i11;
        GroupFullMemberAdapter groupFullMemberAdapter = groupInvitedMemberView.f72331l1;
        if (groupFullMemberAdapter != null && (m35631L = groupFullMemberAdapter.m35631L(i11)) != null && m35631L.f38021a == 0 && (contactProfile = m35631L.f38022b) != null && !AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
            groupInvitedMemberView.f72326D1 = m35631L.f38022b;
            GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
            if (interfaceC6939c != null) {
                AbstractC23647d.m123897g("1591101");
                interfaceC6939c.mo35657j(str, contactProfile, 3);
                return true;
            }
            return true;
        }
        return true;
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
            this.f72331l1 = new GroupFullMemberAdapter(m92686rK, this.f72336q1, this.f72335p1, this.f72344y1, 5, null, z11, 32, null);
            m78410hN().f137465q.setAdapter(this.f72331l1);
            m78410hN().f137466r.setVisibility(0);
            RobotoTextView robotoTextView = m78410hN().f137467s;
            if (z11) {
                i11 = AbstractC8020f0.str_community_desc_tab_invited;
            } else {
                i11 = AbstractC8020f0.str_desc_tab_invited_v2;
            }
            robotoTextView.setText(i11);
            GroupFullMemberAdapter groupFullMemberAdapter = this.f72331l1;
            if (groupFullMemberAdapter != null) {
                groupFullMemberAdapter.f38011x = true;
            }
            final String str = this.f72339t1;
            AbstractC19074t.m100205c(str);
            C31784b.m152808a(m78410hN().f137465q).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.hk
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i12, View view) {
                    GroupInvitedMemberView.m80176UN(GroupInvitedMemberView.this, str, recyclerView, i12, view);
                }
            });
            C31784b.m152808a(m78410hN().f137465q).m152810c(new C31784b.e() { // from class: com.zing.zalo.ui.zviews.ik
                @Override // zc0.C31784b.e
                /* renamed from: T3 */
                public final boolean mo81113T3(RecyclerView recyclerView, int i12, View view) {
                    boolean m80177VN;
                    m80177VN = GroupInvitedMemberView.m80177VN(GroupInvitedMemberView.this, str, recyclerView, i12, view);
                    return m80177VN;
                }
            });
            m78410hN().f137465q.m9826E(new C14356c());
            this.f76931a1 = new C14357d();
            AbstractC23126l.m118627a("GroupInvitedMemberView");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        mo78394CN();
        mo78415mN();
        LinearLayout root = m78410hN().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    /* renamed from: WN */
    public void m80178WN(ArrayList arrayList) {
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
        mo78416pN();
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupInvitedMemberView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: jN */
    public void mo78412jN() {
        if (TextUtils.isEmpty(this.f72339t1) || this.f72325C1) {
            return;
        }
        this.f72325C1 = true;
        m78406bN(10);
        this.f73779G1.mo1704o8(this.f73780H1);
        this.f73779G1.mo1617d4(this.f72339t1, this.f72323A1, this.f72324B1, (byte) 4);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: pN */
    public synchronized void mo78416pN() {
        try {
            this.f72336q1.clear();
            this.f72336q1.addAll(mo78408fN(this.f72337r1));
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.gk
                @Override // java.lang.Runnable
                public final void run() {
                    GroupInvitedMemberView.m80175TN(GroupInvitedMemberView.this);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
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
            if (AbstractC19074t.m100204b(this.f72339t1, (String) obj)) {
                if (intValue != 3) {
                    if (intValue != 4 && intValue != 10) {
                        if (intValue == 12) {
                            m78401LN();
                            return;
                        }
                        return;
                    } else {
                        if (contains) {
                            finish();
                            return;
                        }
                        return;
                    }
                }
                m80178WN(arrayList);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: yN */
    public void mo78422yN(boolean z11) {
        int i11;
        super.mo78422yN(z11);
        C31973j5 c31973j5 = this.f72357R0;
        if (c31973j5 != null && c31973j5.m153747Y()) {
            i11 = AbstractC8020f0.str_community_tab_invited_empty_desc;
        } else {
            i11 = AbstractC8020f0.str_group_tab_invited_empty_desc;
        }
        m78421xN(i11);
    }
}

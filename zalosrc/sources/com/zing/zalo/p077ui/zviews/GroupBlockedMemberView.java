package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
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
import com.zing.zalo.p077ui.zviews.GroupBlockedMemberView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23222t7;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p361nb.AbstractC23647d;
import p716zh.C31973j5;
import qm0.AbstractC25368s;
import vg.C28203u6;
import zc0.C31784b;

/* loaded from: classes6.dex */
public final class GroupBlockedMemberView extends BaseGroupMemberView implements InterfaceC0733x {
    public static final C14315a Companion = new C14315a(null);

    /* renamed from: G1 */
    private InterfaceC0765j f73563G1 = new C0766k();

    /* renamed from: H1 */
    private InterfaceC20094a f73564H1 = new C14316b();

    /* renamed from: com.zing.zalo.ui.zviews.GroupBlockedMemberView$a */
    /* loaded from: classes6.dex */
    public static final class C14315a {
        private C14315a() {
        }

        public /* synthetic */ C14315a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final GroupBlockedMemberView m79938a(Bundle bundle) {
            GroupBlockedMemberView groupBlockedMemberView = new GroupBlockedMemberView();
            groupBlockedMemberView.mo60305zK(bundle);
            return groupBlockedMemberView;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupBlockedMemberView$b */
    /* loaded from: classes6.dex */
    public static final class C14316b implements InterfaceC20094a {
        C14316b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m79940d(C20096c c20096c, GroupBlockedMemberView groupBlockedMemberView) {
            MultiStateView.EnumC15915f enumC15915f;
            int i11;
            AbstractC19074t.m100208f(c20096c, "$this_apply");
            AbstractC19074t.m100208f(groupBlockedMemberView, "this$0");
            try {
                int m104491c = c20096c.m104491c();
                groupBlockedMemberView.mo78422yN(false);
                MultiStateView multiStateView = groupBlockedMemberView.m78410hN().f137468t;
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
            GroupBlockedMemberView.this.m78418sN();
            try {
                final GroupBlockedMemberView groupBlockedMemberView = GroupBlockedMemberView.this;
                groupBlockedMemberView.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.nh
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupBlockedMemberView.C14316b.m79940d(C20096c.this, groupBlockedMemberView);
                    }
                });
                GroupBlockedMemberView.this.f72325C1 = false;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11;
            ContactProfile contactProfile;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject jSONObject = new JSONObject(obj.toString()).getJSONObject("data");
                GroupBlockedMemberView groupBlockedMemberView = GroupBlockedMemberView.this;
                if (groupBlockedMemberView.f72323A1 == 0) {
                    groupBlockedMemberView.f72337r1.clear();
                    GroupBlockedMemberView.this.f72330k1.clear();
                    GroupBlockedMemberView groupBlockedMemberView2 = GroupBlockedMemberView.this;
                    int optInt = jSONObject.optInt("ownerId");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(optInt);
                    groupBlockedMemberView2.f72342w1 = sb2.toString();
                }
                GroupBlockedMemberView groupBlockedMemberView3 = GroupBlockedMemberView.this;
                if (jSONObject.optInt("hasMore") == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                groupBlockedMemberView3.f72345z1 = z11;
                GroupBlockedMemberView.this.f72324B1 = jSONObject.optInt("lastId");
                JSONArray optJSONArray = jSONObject.optJSONArray("blockMembers");
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                JSONArray jSONArray = optJSONArray;
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    try {
                        Object obj2 = jSONArray.get(i11);
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject2 = (JSONObject) obj2;
                        GroupBlockedMemberView groupBlockedMemberView4 = GroupBlockedMemberView.this;
                        int optInt2 = jSONObject2.optInt("uid");
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(optInt2);
                        String sb4 = sb3.toString();
                        String optString = jSONObject2.optString("dpn");
                        String optString2 = jSONObject2.optString("avt");
                        int optInt3 = jSONObject2.optInt("typeContact");
                        if (!TextUtils.isEmpty(sb4) && !groupBlockedMemberView4.f72330k1.containsKey(sb4)) {
                            GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                            ContactProfile m78411iN = groupBlockedMemberView4.m78411iN(sb4, optString, optString2, optInt3);
                            m78411iN.f42428p = jSONObject2.getInt("typeContact");
                            c6938b.f38022b = m78411iN;
                            JSONObject optJSONObject = jSONObject2.optJSONObject("blockInfo");
                            if (optJSONObject != null) {
                                contactProfile = new ContactProfile();
                                int optInt4 = optJSONObject.optInt("uid");
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(optInt4);
                                contactProfile.f42434r = sb5.toString();
                                contactProfile.f42437s = optJSONObject.optString("dpn");
                                contactProfile.f42446v = optJSONObject.optString("avt");
                                contactProfile.f42376S0 = optJSONObject.optInt("src");
                                contactProfile.f42330D = optJSONObject.optInt("ts");
                            } else {
                                contactProfile = null;
                            }
                            c6938b.f38024d = contactProfile;
                            groupBlockedMemberView4.f72337r1.add(c6938b);
                            groupBlockedMemberView4.f72330k1.put(sb4, c6938b);
                        }
                    } catch (Exception e11) {
                        AbstractC23350e.m122778h(e11);
                    }
                }
                GroupBlockedMemberView groupBlockedMemberView5 = GroupBlockedMemberView.this;
                if (groupBlockedMemberView5.f72323A1 == 0 && groupBlockedMemberView5.f72337r1.size() > 0) {
                    GroupBlockedMemberView.this.f72337r1.add(new GroupFullMemberAdapter.C6938b(3));
                    GroupBlockedMemberView groupBlockedMemberView6 = GroupBlockedMemberView.this;
                    Collections.sort(groupBlockedMemberView6.f72337r1, groupBlockedMemberView6.f72343x1);
                }
                GroupBlockedMemberView groupBlockedMemberView7 = GroupBlockedMemberView.this;
                if (groupBlockedMemberView7.f72345z1) {
                    groupBlockedMemberView7.f72323A1++;
                }
                groupBlockedMemberView7.f72325C1 = false;
                groupBlockedMemberView7.mo78416pN();
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
                GroupBlockedMemberView.this.m78418sN();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.GroupBlockedMemberView$c */
    /* loaded from: classes6.dex */
    public static final class C14317c extends RecyclerView.AbstractC1892s {
        C14317c() {
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
                    GroupFullMemberAdapter groupFullMemberAdapter = GroupBlockedMemberView.this.f72331l1;
                    if (groupFullMemberAdapter != null) {
                        groupFullMemberAdapter.m35636Q(false);
                        groupFullMemberAdapter.m10008p();
                    }
                    LinearLayoutManager linearLayoutManager = GroupBlockedMemberView.this.f72333n1;
                    AbstractC19074t.m100205c(linearLayoutManager);
                    int m10127i = linearLayoutManager.m10127i();
                    LinearLayoutManager linearLayoutManager2 = GroupBlockedMemberView.this.f72333n1;
                    AbstractC19074t.m100205c(linearLayoutManager2);
                    int m9745c2 = linearLayoutManager2.m9745c2();
                    EditText editText = GroupBlockedMemberView.this.f72332m1;
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
                        GroupBlockedMemberView groupBlockedMemberView = GroupBlockedMemberView.this;
                        if (!groupBlockedMemberView.f72325C1 && groupBlockedMemberView.f72345z1) {
                            groupBlockedMemberView.mo78412jN();
                        }
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VN */
    public static final void m79931VN(GroupBlockedMemberView groupBlockedMemberView) {
        AbstractC19074t.m100208f(groupBlockedMemberView, "this$0");
        try {
            ActionBar actionBar = groupBlockedMemberView.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_admin_tool_open_block_list_v2));
            }
            groupBlockedMemberView.m78421xN(AbstractC8020f0.str_emptyResult);
            groupBlockedMemberView.mo78422yN(false);
            GroupFullMemberAdapter groupFullMemberAdapter = groupBlockedMemberView.f72331l1;
            if (groupFullMemberAdapter != null) {
                groupFullMemberAdapter.m35635P(groupBlockedMemberView.f72336q1);
                groupFullMemberAdapter.m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: XN */
    public static final void m79932XN(GroupBlockedMemberView groupBlockedMemberView, View view) {
        AbstractC19074t.m100208f(groupBlockedMemberView, "this$0");
        GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c = groupBlockedMemberView.f72344y1;
        if (interfaceC6939c != null) {
            String str = groupBlockedMemberView.f72339t1;
            AbstractC19074t.m100205c(str);
            interfaceC6939c.mo35652e(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YN */
    public static final boolean m79933YN(GroupBlockedMemberView groupBlockedMemberView, RecyclerView recyclerView, int i11, View view) {
        GroupFullMemberAdapter.C6938b m35631L;
        ContactProfile contactProfile;
        AbstractC19074t.m100208f(groupBlockedMemberView, "this$0");
        groupBlockedMemberView.f72334o1 = i11;
        String str = groupBlockedMemberView.f72339t1;
        AbstractC19074t.m100205c(str);
        GroupFullMemberAdapter groupFullMemberAdapter = groupBlockedMemberView.f72331l1;
        if (groupFullMemberAdapter != null && (m35631L = groupFullMemberAdapter.m35631L(groupBlockedMemberView.f72334o1)) != null && m35631L.f38021a == 0 && (contactProfile = m35631L.f38022b) != null && !AbstractC19074t.m100204b(CoreUtility.f89233i, contactProfile.f42434r)) {
            groupBlockedMemberView.f72326D1 = m35631L.f38022b;
            GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c = groupFullMemberAdapter.f38013z;
            if (interfaceC6939c != null) {
                AbstractC23647d.m123897g("1591101");
                interfaceC6939c.mo35657j(str, contactProfile, 4);
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZN */
    public static final void m79934ZN(GroupBlockedMemberView groupBlockedMemberView, RecyclerView recyclerView, int i11, View view) {
        GroupFullMemberAdapter.C6938b m35631L;
        GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c;
        AbstractC19074t.m100208f(groupBlockedMemberView, "this$0");
        try {
            groupBlockedMemberView.f72334o1 = i11;
            String str = groupBlockedMemberView.f72339t1;
            AbstractC19074t.m100205c(str);
            GroupFullMemberAdapter groupFullMemberAdapter = groupBlockedMemberView.f72331l1;
            if (groupFullMemberAdapter != null && (m35631L = groupFullMemberAdapter.m35631L(groupBlockedMemberView.f72334o1)) != null) {
                if (m35631L.f38021a == 3) {
                    GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c2 = groupFullMemberAdapter.f38013z;
                    if (interfaceC6939c2 != null) {
                        AbstractC23647d.m123897g("1591044");
                        interfaceC6939c2.mo35652e(str);
                    }
                } else {
                    ContactProfile contactProfile = m35631L.f38022b;
                    if (contactProfile != null && (interfaceC6939c = groupFullMemberAdapter.f38013z) != null) {
                        AbstractC23647d.m123897g("1591101");
                        interfaceC6939c.mo35657j(str, contactProfile, 4);
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aO */
    public static final void m79935aO(ArrayList arrayList, GroupBlockedMemberView groupBlockedMemberView) {
        AbstractC19074t.m100208f(arrayList, "$uids");
        AbstractC19074t.m100208f(groupBlockedMemberView, "this$0");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!groupBlockedMemberView.f72330k1.containsKey(str)) {
                if (groupBlockedMemberView.f72337r1.size() == 0) {
                    groupBlockedMemberView.f72337r1.add(new GroupFullMemberAdapter.C6938b(3));
                }
                ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
                if (m141798e != null) {
                    GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                    c6938b.f38022b = m141798e;
                    groupBlockedMemberView.f72337r1.add(c6938b);
                    HashMap hashMap = groupBlockedMemberView.f72330k1;
                    AbstractC19074t.m100205c(str);
                    hashMap.put(str, c6938b);
                }
            }
        }
        Collections.sort(groupBlockedMemberView.f72337r1, groupBlockedMemberView.f72343x1);
        groupBlockedMemberView.mo78416pN();
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
            GroupFullMemberAdapter groupFullMemberAdapter = new GroupFullMemberAdapter(m92686rK, this.f72336q1, this.f72335p1, this.f72344y1, 4, null, z11, 32, null);
            groupFullMemberAdapter.f38011x = true;
            this.f72331l1 = groupFullMemberAdapter;
            m78410hN().f137465q.setAdapter(this.f72331l1);
            m78410hN().f137466r.setVisibility(0);
            RobotoTextView robotoTextView = m78410hN().f137467s;
            if (z11) {
                i11 = AbstractC8020f0.str_community_desc_tab_blocked;
            } else {
                i11 = AbstractC8020f0.str_group_blacklist_hint_v4;
            }
            robotoTextView.setText(i11);
            C31784b.m152808a(m78410hN().f137465q).m152809b(new C31784b.d() { // from class: com.zing.zalo.ui.zviews.jh
                @Override // zc0.C31784b.d
                /* renamed from: i0 */
                public final void mo17458i0(RecyclerView recyclerView, int i12, View view) {
                    GroupBlockedMemberView.m79934ZN(GroupBlockedMemberView.this, recyclerView, i12, view);
                }
            });
            C31784b.m152808a(m78410hN().f137465q).m152810c(new C31784b.e() { // from class: com.zing.zalo.ui.zviews.kh
                @Override // zc0.C31784b.e
                /* renamed from: T3 */
                public final boolean mo81113T3(RecyclerView recyclerView, int i12, View view) {
                    boolean m79933YN;
                    m79933YN = GroupBlockedMemberView.m79933YN(GroupBlockedMemberView.this, recyclerView, i12, view);
                    return m79933YN;
                }
            });
            m78410hN().f137465q.m9826E(new C14317c());
            AbstractC23126l.m118627a("GroupBlockedMemberView");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: FN */
    public void mo78396FN(final ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            if (m141798e != null) {
                if (this.f72337r1.size() == 0) {
                    this.f72337r1.add(new GroupFullMemberAdapter.C6938b(3));
                }
                if (!this.f72330k1.containsKey(str)) {
                    GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                    c6938b.f38022b = m141798e;
                    this.f72337r1.add(c6938b);
                    HashMap hashMap = this.f72330k1;
                    AbstractC19074t.m100205c(str);
                    hashMap.put(str, c6938b);
                }
            } else {
                arrayList2.add(str);
            }
        }
        Collections.sort(this.f72337r1, this.f72343x1);
        mo78416pN();
        AbstractC23184q2.m119463u(arrayList2, new Runnable() { // from class: com.zing.zalo.ui.zviews.ih
            @Override // java.lang.Runnable
            public final void run() {
                GroupBlockedMemberView.m79935aO(arrayList, this);
            }
        });
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
    public void m79936WN(boolean z11) {
        MultiStateView multiStateView = m78410hN().f137468t;
        multiStateView.setEnableBtnEmpty(z11);
        if (z11) {
            multiStateView.setBtnEmptyString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_block_member));
            multiStateView.setEmptyOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.mh
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    GroupBlockedMemberView.m79932XN(GroupBlockedMemberView.this, view);
                }
            });
        }
    }

    /* renamed from: bO */
    public void m79937bO(ArrayList arrayList) {
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
        return "GroupBlockedMemberView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: jN */
    public void mo78412jN() {
        if (TextUtils.isEmpty(this.f72339t1) || this.f72325C1) {
            return;
        }
        this.f72325C1 = true;
        m78406bN(10);
        this.f73563G1.mo1704o8(this.f73564H1);
        this.f73563G1.mo1617d4(this.f72339t1, this.f72323A1, this.f72324B1, (byte) 2);
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 103) {
            AbstractC23647d.m123897g("1591045");
            if (intent != null && i12 == -1 && intent.hasExtra("extra_selected_profiles")) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("extra_selected_profiles");
                if (parcelableArrayListExtra == null) {
                    parcelableArrayListExtra = new ArrayList();
                } else {
                    AbstractC19074t.m100205c(parcelableArrayListExtra);
                }
                m78407eN(this.f72339t1, parcelableArrayListExtra);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: pN */
    public synchronized void mo78416pN() {
        try {
            try {
                this.f72336q1.clear();
                if (this.f72337r1.size() == 1) {
                    this.f72337r1.clear();
                }
                this.f72336q1.addAll(mo78408fN(this.f72337r1));
                this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.lh
                    @Override // java.lang.Runnable
                    public final void run() {
                        GroupBlockedMemberView.m79931VN(GroupBlockedMemberView.this);
                    }
                });
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        } catch (Throwable th2) {
            throw th2;
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
            if (AbstractC19074t.m100204b(this.f72339t1, (String) obj) && (!arrayList.isEmpty())) {
                if (intValue != 3) {
                    if (intValue != 4) {
                        if (intValue == 10) {
                            if (contains) {
                                finish();
                                return;
                            } else {
                                mo78396FN(arrayList);
                                return;
                            }
                        }
                        return;
                    }
                    if (contains) {
                        finish();
                        return;
                    }
                    return;
                }
                m79937bO(arrayList);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.BaseGroupMemberView
    /* renamed from: yN */
    public void mo78422yN(boolean z11) {
        super.mo78422yN(z11);
        m78421xN(AbstractC8020f0.ignorelist_empty_v2);
        m79936WN(true);
        m78392AN(AbstractC23222t7.f112516C, AbstractC23222t7.f112572m, AbstractC23222t7.f112516C, AbstractC23222t7.f112572m);
    }
}

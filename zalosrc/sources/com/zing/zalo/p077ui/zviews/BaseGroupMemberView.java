package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import ae.InterfaceC0765j;
import am.AbstractC0924m0;
import am.C0927o;
import am.C0943w;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.AbstractC2364o0;
import bh.C2799a;
import bp0.AbstractC3102n;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7145n;
import com.zing.zalo.adapters.GroupFullMemberAdapter;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.dialog.BottomMenuManageMemberView;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.group.bottomsheet.setting.ManageMemberPermissionSettingBottomSheet;
import com.zing.zalo.p077ui.zviews.BaseGroupMemberView;
import com.zing.zalo.p077ui.zviews.ManageMembersView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SimpleMenuListPopupView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import com.zing.zalocore.CoreUtility;
import dj.C18005u0;
import fn0.AbstractC19060k;
import fn0.AbstractC19069o0;
import fn0.AbstractC19074t;
import gw.AbstractC19646n0;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22033k0;
import me0.AbstractC23034c6;
import me0.AbstractC23126l;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.AbstractC23211s7;
import me0.C23055e5;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C29756d0;
import p716zh.C31973j5;
import p716zh.C31986k3;
import p716zh.C32002l4;
import p716zh.C32076q5;
import p716zh.C32118t5;
import pm0.C24848g0;
import v50.C27870vb;
import vg.C28203u6;

/* loaded from: classes6.dex */
public abstract class BaseGroupMemberView extends RemoveGroupMemberBaseView implements C23744a.c {
    public static final C14087a Companion = new C14087a(null);

    /* renamed from: A1 */
    public int f72323A1;

    /* renamed from: B1 */
    public int f72324B1;

    /* renamed from: C1 */
    public boolean f72325C1;

    /* renamed from: D1 */
    public ContactProfile f72326D1;

    /* renamed from: F1 */
    private boolean f72328F1;

    /* renamed from: j1 */
    public C29756d0 f72329j1;

    /* renamed from: l1 */
    public GroupFullMemberAdapter f72331l1;

    /* renamed from: m1 */
    public EditText f72332m1;

    /* renamed from: n1 */
    public LinearLayoutManager f72333n1;

    /* renamed from: o1 */
    public int f72334o1;

    /* renamed from: p1 */
    public C23528a f72335p1;

    /* renamed from: s1 */
    public String f72338s1;

    /* renamed from: v1 */
    public boolean f72341v1;

    /* renamed from: k1 */
    public HashMap f72330k1 = new HashMap();

    /* renamed from: q1 */
    public ArrayList f72336q1 = new ArrayList();

    /* renamed from: r1 */
    public ArrayList f72337r1 = new ArrayList();

    /* renamed from: t1 */
    public String f72339t1 = "";

    /* renamed from: u1 */
    public String f72340u1 = "";

    /* renamed from: w1 */
    public String f72342w1 = "";

    /* renamed from: x1 */
    public Comparator f72343x1 = new C14090d();

    /* renamed from: y1 */
    public GroupFullMemberAdapter.InterfaceC6939c f72344y1 = new C14091e();

    /* renamed from: z1 */
    public boolean f72345z1 = true;

    /* renamed from: E1 */
    private InterfaceC0765j f72327E1 = new C0766k();

    /* renamed from: com.zing.zalo.ui.zviews.BaseGroupMemberView$a */
    /* loaded from: classes6.dex */
    public static final class C14087a {
        private C14087a() {
        }

        public /* synthetic */ C14087a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BaseGroupMemberView$b */
    /* loaded from: classes6.dex */
    public static final class C14088b implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ArrayList f72347b;

        C14088b(ArrayList arrayList) {
            this.f72347b = arrayList;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            boolean z11;
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                BaseGroupMemberView.this.f72421L0.mo49315c4();
                C31973j5 c31973j5 = BaseGroupMemberView.this.f72357R0;
                if (c31973j5 != null) {
                    z11 = c31973j5.m153747Y();
                } else {
                    z11 = false;
                }
                ToastUtils.m89261i(c20096c, z11);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            int size;
            int i11;
            AbstractC19074t.m100208f(obj, C0927o.f3427r);
            try {
                BaseGroupMemberView.this.f72421L0.mo49315c4();
                StringBuilder sb2 = new StringBuilder("");
                C31973j5 m4473g = C0943w.f3447a.m4473g(BaseGroupMemberView.this.f72339t1);
                ArrayList arrayList = new ArrayList();
                if (this.f72347b.size() > 4) {
                    size = 3;
                } else {
                    size = this.f72347b.size();
                }
                int size2 = this.f72347b.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    Object obj2 = this.f72347b.get(i12);
                    AbstractC19074t.m100207e(obj2, "get(...)");
                    InviteContactProfile inviteContactProfile = (InviteContactProfile) obj2;
                    String m114542i = AbstractC21935u.m114542i(inviteContactProfile.f42434r, inviteContactProfile.f42437s);
                    sb2.append(m114542i);
                    if (i12 < this.f72347b.size() - 1) {
                        sb2.append(", ");
                    }
                    if (arrayList.size() < size) {
                        arrayList.add(new C32118t5(inviteContactProfile.f42434r, m114542i, false));
                    }
                }
                int size3 = this.f72347b.size() - 3;
                if (!TextUtils.isEmpty(sb2)) {
                    if (m4473g != null && m4473g.m153747Y()) {
                        i11 = AbstractC8020f0.str_msg_info_set_community_admin_for_other_by_me;
                    } else {
                        i11 = AbstractC8020f0.str_msg_info_set_admin_by_me_v2;
                    }
                    C2799a.a aVar = C2799a.Companion;
                    String m118743r0 = AbstractC23136l9.m118743r0(i11);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    AbstractC19646n0.m102971e1(AbstractC23136l9.m118746s0(i11, sb2.toString()), new C18005u0.a().m95727i(4).m95730l(aVar.m13514b(m118743r0, 1, size, size3)).m95726h(arrayList).m95721c(), m4473g, true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BaseGroupMemberView$c */
    /* loaded from: classes6.dex */
    public static final class C14089c implements InterfaceC20094a {
        C14089c() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                boolean z11 = false;
                BaseGroupMemberView.this.m78393BN(false);
                if (c20096c.m104491c() != 0) {
                    C31973j5 c31973j5 = BaseGroupMemberView.this.f72357R0;
                    if (c31973j5 != null) {
                        z11 = c31973j5.m153747Y();
                    }
                    ToastUtils.m89261i(c20096c, z11);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
                BaseGroupMemberView.this.f72421L0.mo78960q3();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                boolean z11 = false;
                BaseGroupMemberView.this.m78393BN(false);
                BaseGroupMemberView.this.f72421L0.mo49315c4();
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.isNull("data") && jSONObject.isNull("error_code")) {
                        return;
                    }
                    int i11 = jSONObject.getInt("error_code");
                    if (i11 != 0) {
                        C31973j5 c31973j5 = BaseGroupMemberView.this.f72357R0;
                        if (c31973j5 != null) {
                            z11 = c31973j5.m153747Y();
                        }
                        ToastUtils.m89260h(i11, z11);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            } catch (Exception e12) {
                AbstractC23350e.m122778h(e12);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BaseGroupMemberView$d */
    /* loaded from: classes6.dex */
    public static final class C14090d implements Comparator {
        C14090d() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(GroupFullMemberAdapter.C6938b c6938b, GroupFullMemberAdapter.C6938b c6938b2) {
            String str;
            int m127121q;
            int m127121q2;
            AbstractC19074t.m100208f(c6938b, "object1");
            AbstractC19074t.m100208f(c6938b2, "object2");
            int i11 = c6938b.f38021a;
            int i12 = c6938b2.f38021a;
            if (i11 > i12) {
                return -1;
            }
            if (i11 < i12) {
                return 1;
            }
            if (c6938b.f38025e) {
                return -1;
            }
            if (c6938b2.f38025e) {
                return 1;
            }
            ContactProfile contactProfile = c6938b.f38022b;
            String str2 = null;
            if (contactProfile != null) {
                str = contactProfile.f42440t;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            ContactProfile contactProfile2 = c6938b2.f38022b;
            if (contactProfile2 != null) {
                str2 = contactProfile2.f42440t;
            }
            if (str2 != null) {
                str3 = str2;
            }
            boolean z11 = c6938b.f38027g;
            if (z11 && c6938b2.f38027g) {
                m127121q2 = AbstractC24341v.m127121q(str, str3, true);
                return m127121q2;
            }
            if (z11) {
                return -1;
            }
            if (!c6938b2.f38027g) {
                m127121q = AbstractC24341v.m127121q(str, str3, true);
                return m127121q;
            }
            return 1;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BaseGroupMemberView$e */
    /* loaded from: classes6.dex */
    public static final class C14091e implements GroupFullMemberAdapter.InterfaceC6939c {

        /* renamed from: a */
        private final AbstractC22055v0.g f72349a;

        /* renamed from: com.zing.zalo.ui.zviews.BaseGroupMemberView$e$a */
        /* loaded from: classes6.dex */
        public static final class a implements AbstractC22055v0.g {

            /* renamed from: a */
            final /* synthetic */ BaseGroupMemberView f72351a;

            a(BaseGroupMemberView baseGroupMemberView) {
                this.f72351a = baseGroupMemberView;
            }

            @Override // l30.AbstractC22055v0.g
            /* renamed from: O */
            public void mo46561O() {
                GroupFullMemberAdapter groupFullMemberAdapter = this.f72351a.f72331l1;
                if (groupFullMemberAdapter != null) {
                    groupFullMemberAdapter.m10008p();
                }
            }

            @Override // l30.AbstractC22055v0.g
            /* renamed from: a */
            public void mo46562a(String str, C22033k0.g gVar) {
                AbstractC19074t.m100208f(str, "msg");
                AbstractC19074t.m100208f(gVar, "errorCode");
                if (this.f72351a.m92672lJ()) {
                    ToastUtils.showMess(str);
                }
                mo46561O();
            }
        }

        /* renamed from: com.zing.zalo.ui.zviews.BaseGroupMemberView$e$b */
        /* loaded from: classes6.dex */
        public static final class b extends C7145n.g {

            /* renamed from: a */
            final /* synthetic */ BaseGroupMemberView f72352a;

            b(BaseGroupMemberView baseGroupMemberView) {
                this.f72352a = baseGroupMemberView;
            }

            @Override // com.zing.zalo.adapters.C7145n.g, com.zing.zalo.adapters.C7145n.a
            /* renamed from: a */
            public void mo36357a(int i11) {
                this.f72352a.m78409gN();
                if (i11 == AbstractC8020f0.str_copy_existing_group) {
                    this.f72352a.f72421L0.showDialog(1001);
                }
            }
        }

        C14091e() {
            this.f72349a = new a(BaseGroupMemberView.this);
        }

        /* renamed from: p */
        public static final void m78426p(BaseGroupMemberView baseGroupMemberView, int i11, String str, String str2) {
            AbstractC19074t.m100208f(baseGroupMemberView, "this$0");
            AbstractC19074t.m100205c(str);
            AbstractC19074t.m100205c(str2);
            baseGroupMemberView.m78413kN(i11, str, str2);
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: b */
        public void mo35649b(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            try {
                String mo2478b = contactProfile.mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                AbstractC23211s7.m119583p(BaseGroupMemberView.this.f72421L0.m92676n2(), new C27870vb(mo2478b).m140780g(contactProfile).m140776b(), contactProfile);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: c */
        public void mo35650c(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            try {
                BaseGroupMemberView baseGroupMemberView = BaseGroupMemberView.this;
                if (!TextUtils.isEmpty(contactProfile.f42434r)) {
                    TrackingSource trackingSource = new TrackingSource(21);
                    trackingSource.m40677a("groupId", baseGroupMemberView.f72339t1);
                    C31973j5 m4473g = C0943w.f3447a.m4473g(baseGroupMemberView.f72339t1);
                    if (m4473g != null) {
                        trackingSource.m40677a("groupVisibility", Integer.valueOf(m4473g.m153740S()));
                        trackingSource.m40678b("nameHolder", m4473g.m153793y());
                    }
                    C21927m.m114302u().m114330e0(contactProfile.f42434r, trackingSource);
                }
                baseGroupMemberView.f76936f1 = contactProfile;
                m78427q(contactProfile);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: d */
        public void mo35651d(String str, ArrayList arrayList) {
            C17487o0 mo35579p;
            AbstractC19074t.m100208f(str, "groupId");
            AbstractC19074t.m100208f(arrayList, "listSuggestInvite");
            C32076q5 m4476k = C0943w.f3447a.m4476k(BaseGroupMemberView.this.f72339t1);
            if (m4476k != null && C31986k3.f147083a.m154105P1(m4476k.m154721j()) && m4476k.m154717f() >= AbstractC0924m0.m4248u3()) {
                ToastUtils.m89266n(AbstractC8020f0.str_group_exceed_max_member_e2ee, Integer.valueOf(AbstractC0924m0.m4248u3()));
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("extra_group_id", BaseGroupMemberView.this.f72339t1);
            bundle.putBoolean("BOL_EXTRA_FROM_GROUP_MEMEBER", true);
            bundle.putInt("INT_EXTRA_TRACKING_SOURCE", 3);
            if (arrayList.size() > 0) {
                bundle.putString("extra_preload_data", InviteToCreateGroupView.m80904EM(BaseGroupMemberView.this.f72339t1, arrayList));
            }
            InterfaceC27218a m92676n2 = BaseGroupMemberView.this.f72421L0.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93069k2(InviteToCreateGroupView.class, bundle, 1, true);
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: e */
        public void mo35652e(String str) {
            C17487o0 mo35579p;
            AbstractC19074t.m100208f(str, "groupId");
            if (!BaseGroupMemberView.this.f72357R0.m153742T()) {
                BaseGroupMemberView.this.m78369EN();
                return;
            }
            AbstractC23647d.m123897g("1591044");
            Bundle m83056qM = ProfilePickerView.m83056qM(new ArrayList(), 50, AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_block_member));
            m83056qM.putBoolean("extra_viewmode_group", true);
            m83056qM.putBoolean("extra_show_full_member", true);
            m83056qM.putString("extra_group_id", BaseGroupMemberView.this.f72339t1);
            InterfaceC27218a m92676n2 = BaseGroupMemberView.this.f72421L0.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93066i2(ProfilePickerView.class, m83056qM, 103, 1, true);
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: f */
        public void mo35653f(boolean z11, String str) {
            C17487o0 mo35579p;
            AbstractC19074t.m100208f(str, "entryPoint");
            if (!BaseGroupMemberView.this.f72357R0.m153742T()) {
                BaseGroupMemberView.this.m78369EN();
                return;
            }
            InterfaceC27218a m92676n2 = BaseGroupMemberView.this.f72421L0.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                BaseGroupMemberView baseGroupMemberView = BaseGroupMemberView.this;
                if (baseGroupMemberView.m92674mJ() && !baseGroupMemberView.m92681pJ()) {
                    Bundle m78535kL = BottomPickerView.m78535kL();
                    C31973j5 c31973j5 = baseGroupMemberView.f72357R0;
                    boolean z12 = false;
                    if (c31973j5 != null && c31973j5.m153747Y()) {
                        z12 = true;
                    }
                    m78535kL.putBoolean("EXTRA_IS_COMMUNITY", z12);
                    ManageMemberPermissionSettingBottomSheet.C11898a c11898a = ManageMemberPermissionSettingBottomSheet.Companion;
                    AbstractC19074t.m100205c(m78535kL);
                    c11898a.m66151a(m78535kL, z11, 30, str);
                    mo35579p.mo89694j2(ManageMemberPermissionSettingBottomSheet.class, m78535kL, 105, "ManageMemberPermissionSettingBottomSheet", 2, true);
                }
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: g */
        public void mo35654g(Rect rect) {
            AbstractC19074t.m100208f(rect, "rect");
            ArrayList arrayList = new ArrayList();
            if (AbstractC23309i.m122079k2()) {
                Context m92689tK = BaseGroupMemberView.this.m92689tK();
                int i11 = AbstractC8020f0.str_copy_existing_group;
                arrayList.add(new C7145n.b(m92689tK, 5, i11, AbstractC23136l9.m118743r0(i11), ""));
            }
            if (arrayList.size() == 0) {
                return;
            }
            SimpleMenuListPopupView m87992ML = SimpleMenuListPopupView.m87992ML(arrayList, new b(BaseGroupMemberView.this), rect, -1);
            m87992ML.m87997PL(true);
            m87992ML.m87998QL(true);
            BaseGroupMemberView.this.f72421L0.m92649TI().m93060e2(0, m87992ML, "TAG_OPTION_MENU_POPUP", 0, false);
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: h */
        public void mo35655h(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            if (!BaseGroupMemberView.this.f72357R0.m153742T()) {
                BaseGroupMemberView.this.m78369EN();
            } else {
                BaseGroupMemberView.this.m78419uN(contactProfile);
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: i */
        public void mo35656i(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            String str = contactProfile.f42434r;
            AbstractC19074t.m100207e(str, "uid");
            BaseGroupMemberView baseGroupMemberView = BaseGroupMemberView.this;
            if (baseGroupMemberView.f72357R0 == null) {
                baseGroupMemberView.f72357R0 = C0943w.f3447a.m4472f(baseGroupMemberView.f72339t1);
            }
            C31973j5 c31973j5 = BaseGroupMemberView.this.f72357R0;
            if (c31973j5 != null && !c31973j5.m153780q0(str)) {
                if (!BaseGroupMemberView.this.f72357R0.m153778p0()) {
                    BaseGroupMemberView.this.m78369EN();
                    return;
                }
                BaseGroupMemberView.this.f76928X0 = str;
                ArrayList arrayList = new ArrayList();
                arrayList.add(BaseGroupMemberView.this.f76928X0);
                BaseGroupMemberView.this.m78417rN(arrayList);
                AbstractC23647d.m123897g("1591032");
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: j */
        public void mo35657j(String str, ContactProfile contactProfile, int i11) {
            AbstractC19074t.m100208f(str, "gId");
            AbstractC19074t.m100208f(contactProfile, "interactedProfile");
            BaseGroupMemberView.this.f72421L0.m92649TI().m93058d2(0, BottomMenuManageMemberView.m42816IL(str, contactProfile, i11, new BottomMenuManageMemberView.InterfaceC7969a() { // from class: com.zing.zalo.ui.zviews.j2
                public /* synthetic */ C15757j2() {
                }

                @Override // com.zing.zalo.dialog.BottomMenuManageMemberView.InterfaceC7969a
                /* renamed from: a */
                public final void mo42834a(int i12, String str2, String str3) {
                    BaseGroupMemberView.C14091e.m78426p(BaseGroupMemberView.this, i12, str2, str3);
                }
            }), 104, "BottomMenuManageMemberView", 0, false);
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: k */
        public void mo35658k(String str) {
            int i11;
            C17487o0 mo35579p;
            AbstractC19074t.m100208f(str, "groupId");
            if (!BaseGroupMemberView.this.f72357R0.m153778p0()) {
                BaseGroupMemberView.this.m78369EN();
                return;
            }
            AbstractC23647d.m123897g("1591030");
            ArrayList arrayList = new ArrayList();
            if (BaseGroupMemberView.this.f72357R0.m153747Y()) {
                i11 = AbstractC8020f0.str_add_community_admins;
            } else {
                i11 = AbstractC8020f0.str_add_group_admin_title_v2;
            }
            Bundle m83056qM = ProfilePickerView.m83056qM(arrayList, 50, AbstractC23136l9.m118743r0(i11));
            m83056qM.putBoolean("extra_viewmode_group", true);
            m83056qM.putString("extra_group_id", BaseGroupMemberView.this.f72339t1);
            InterfaceC27218a m92676n2 = BaseGroupMemberView.this.f72421L0.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93066i2(ProfilePickerView.class, m83056qM, 101, 1, true);
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: l */
        public void mo35659l(String str, String str2) {
            C17487o0 c17487o0;
            AbstractC19074t.m100208f(str, "profileId");
            AbstractC19074t.m100208f(str2, "groupId");
            InterfaceC27218a m92676n2 = BaseGroupMemberView.this.f72421L0.m92676n2();
            if (m92676n2 != null) {
                c17487o0 = m92676n2.mo35579p();
            } else {
                c17487o0 = null;
            }
            AbstractC23211s7.m119562B(str, c17487o0, str2, C32002l4.Companion.m154288b(ZMediaPlayer.FFP_PROP_INT64_SELECTED_AUDIO_STREAM, 14));
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: m */
        public void mo35660m(ContactProfile contactProfile) {
            GroupFullMemberAdapter groupFullMemberAdapter;
            AbstractC19074t.m100208f(contactProfile, "profile");
            if (AbstractC22055v0.m115146f(contactProfile.f42434r, BaseGroupMemberView.this.m92676n2(), BaseGroupMemberView.this, 0, 351, null, this.f72349a) && (groupFullMemberAdapter = BaseGroupMemberView.this.f72331l1) != null) {
                groupFullMemberAdapter.m10008p();
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: n */
        public void mo35661n(String str) {
            C17487o0 mo35579p;
            AbstractC19074t.m100208f(str, "groupId");
            if (!BaseGroupMemberView.this.f72357R0.m153742T()) {
                BaseGroupMemberView.this.m78369EN();
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("extra_group_id", str);
            InterfaceC27218a m92676n2 = BaseGroupMemberView.this.f72421L0.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93066i2(GroupMemApprovalView.class, bundle, 102, 1, true);
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullMemberAdapter.InterfaceC6939c
        /* renamed from: o */
        public void mo35662o(String str, ArrayList arrayList) {
            C17487o0 mo35579p;
            AbstractC19074t.m100208f(str, "groupId");
            AbstractC19074t.m100208f(arrayList, "listSuggestInvite");
            Bundle bundle = new Bundle();
            bundle.putString("extra_group_id", BaseGroupMemberView.this.f72339t1);
            bundle.putBoolean("BOL_EXTRA_FROM_GROUP_MEMEBER", true);
            if (arrayList.size() > 0) {
                bundle.putParcelableArrayList("extra_preload_data", arrayList);
            }
            InterfaceC27218a m92676n2 = BaseGroupMemberView.this.f72421L0.m92676n2();
            if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
                mo35579p.m93069k2(GroupSuggestInviteMemberView.class, bundle, 1, true);
            }
        }

        /* renamed from: q */
        public void m78427q(ContactProfile contactProfile) {
            AbstractC19074t.m100208f(contactProfile, "profile");
            BaseGroupMemberView.this.m83610wM(contactProfile);
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BaseGroupMemberView$f */
    /* loaded from: classes6.dex */
    public static final class C14092f implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ContactProfile f72354b;

        C14092f(ContactProfile contactProfile) {
            this.f72354b = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            try {
                boolean z11 = false;
                BaseGroupMemberView.this.m78393BN(false);
                if (c20096c.m104491c() != 0) {
                    C31973j5 c31973j5 = BaseGroupMemberView.this.f72357R0;
                    if (c31973j5 != null) {
                        z11 = c31973j5.m153747Y();
                    }
                    ToastUtils.m89261i(c20096c, z11);
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.error_message));
                }
                BaseGroupMemberView.this.f72421L0.mo78960q3();
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0045 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:3:0x0005, B:6:0x001e, B:9:0x003b, B:11:0x0045, B:12:0x004e, B:15:0x0027, B:17:0x002d, B:19:0x0033, B:20:0x0037), top: B:2:0x0005 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                boolean z11 = false;
                BaseGroupMemberView.this.m78393BN(false);
                BaseGroupMemberView.this.f72421L0.mo49315c4();
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.isNull("data")) {
                    if (!jSONObject.isNull("error_code")) {
                    }
                    if (BaseGroupMemberView.this.f72421L0.m92672lJ()) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_msg_toast_unbanned_mem_for_owner));
                    }
                    BaseGroupMemberView baseGroupMemberView = BaseGroupMemberView.this;
                    String str = this.f72354b.f42434r;
                    AbstractC19074t.m100207e(str, "uid");
                    baseGroupMemberView.m78391vN(str);
                }
                int i11 = jSONObject.getInt("error_code");
                if (i11 != 0) {
                    C31973j5 c31973j5 = BaseGroupMemberView.this.f72357R0;
                    if (c31973j5 != null) {
                        z11 = c31973j5.m153747Y();
                    }
                    ToastUtils.m89260h(i11, z11);
                    return;
                }
                if (BaseGroupMemberView.this.f72421L0.m92672lJ()) {
                }
                BaseGroupMemberView baseGroupMemberView2 = BaseGroupMemberView.this;
                String str2 = this.f72354b.f42434r;
                AbstractC19074t.m100207e(str2, "uid");
                baseGroupMemberView2.m78391vN(str2);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: DN */
    public static final void m78368DN(BaseGroupMemberView baseGroupMemberView) {
        AbstractC19074t.m100208f(baseGroupMemberView, "this$0");
        if (C23055e5.m118273h(false, 1, null)) {
            baseGroupMemberView.mo78412jN();
            return;
        }
        baseGroupMemberView.mo78422yN(false);
        MultiStateView multiStateView = baseGroupMemberView.m78410hN().f137468t;
        multiStateView.setState(MultiStateView.EnumC15914e.ERROR);
        multiStateView.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
        multiStateView.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
    }

    /* renamed from: EN */
    public final void m78369EN() {
        ToastUtils.m89268p(AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_perform_action));
    }

    /* renamed from: HN */
    public static final void m78370HN(String str, BaseGroupMemberView baseGroupMemberView) {
        AbstractC19074t.m100208f(str, "$finalUid");
        AbstractC19074t.m100208f(baseGroupMemberView, "$this_run");
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null) {
            GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
            c6938b.f38022b = m141798e;
            baseGroupMemberView.m78400KN(c6938b, true, false);
            baseGroupMemberView.f72337r1.add(c6938b);
            baseGroupMemberView.f72330k1.put(str, c6938b);
            Collections.sort(baseGroupMemberView.f72337r1, baseGroupMemberView.f72343x1);
            baseGroupMemberView.mo78416pN();
        }
    }

    /* renamed from: JN */
    public static final void m78371JN(BaseGroupMemberView baseGroupMemberView, String str) {
        AbstractC19074t.m100208f(baseGroupMemberView, "$this_run");
        AbstractC19074t.m100208f(str, "$uid");
        baseGroupMemberView.m78400KN((GroupFullMemberAdapter.C6938b) baseGroupMemberView.f72330k1.get(baseGroupMemberView.f72342w1), false, false);
        baseGroupMemberView.f72342w1 = str;
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null) {
            GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
            c6938b.f38022b = m141798e;
            baseGroupMemberView.m78400KN(c6938b, true, false);
            baseGroupMemberView.f72337r1.add(c6938b);
            baseGroupMemberView.f72330k1.put(str, c6938b);
        }
        Collections.sort(baseGroupMemberView.f72337r1, baseGroupMemberView.f72343x1);
        baseGroupMemberView.mo78416pN();
    }

    /* renamed from: PN */
    public static final void m78374PN(ArrayList arrayList, BaseGroupMemberView baseGroupMemberView) {
        AbstractC19074t.m100208f(arrayList, "$listUnknownUid");
        AbstractC19074t.m100208f(baseGroupMemberView, "this$0");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            if (m141798e != null) {
                GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                c6938b.f38022b = m141798e;
                baseGroupMemberView.m78400KN(c6938b, false, true);
                baseGroupMemberView.f72337r1.add(c6938b);
                HashMap hashMap = baseGroupMemberView.f72330k1;
                AbstractC19074t.m100205c(str);
                hashMap.put(str, c6938b);
            }
        }
        Collections.sort(baseGroupMemberView.f72337r1, baseGroupMemberView.f72343x1);
        baseGroupMemberView.mo78416pN();
    }

    /* renamed from: cN */
    public static final void m78385cN(BaseGroupMemberView baseGroupMemberView) {
        AbstractC19074t.m100208f(baseGroupMemberView, "this$0");
        GroupFullMemberAdapter groupFullMemberAdapter = baseGroupMemberView.f72331l1;
        if (groupFullMemberAdapter != null) {
            groupFullMemberAdapter.m35635P(baseGroupMemberView.f72336q1);
            groupFullMemberAdapter.m10008p();
        }
    }

    /* renamed from: dN */
    public static final void m78386dN(BaseGroupMemberView baseGroupMemberView) {
        AbstractC19074t.m100208f(baseGroupMemberView, "this$0");
        GroupFullMemberAdapter groupFullMemberAdapter = baseGroupMemberView.f72331l1;
        if (groupFullMemberAdapter != null) {
            groupFullMemberAdapter.m35635P(baseGroupMemberView.f72336q1);
            groupFullMemberAdapter.m10008p();
        }
    }

    /* renamed from: nN */
    public static final void m78387nN(BaseGroupMemberView baseGroupMemberView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(baseGroupMemberView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        ArrayList arrayList = new ArrayList();
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, baseGroupMemberView.f72340u1, false, 2, null);
        if (m141800i != null) {
            arrayList.add(new InviteContactProfile(m141800i));
            baseGroupMemberView.m78407eN(baseGroupMemberView.f72339t1, arrayList);
        }
    }

    /* renamed from: oN */
    public static final void m78388oN(BaseGroupMemberView baseGroupMemberView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(baseGroupMemberView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        ArrayList arrayList = new ArrayList();
        ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, baseGroupMemberView.f72340u1, false, 2, null);
        if (m141800i != null) {
            arrayList.add(new InviteContactProfile(m141800i));
            baseGroupMemberView.m78405aN(baseGroupMemberView.f72339t1, arrayList);
        }
    }

    /* renamed from: qN */
    public static final void m78389qN(BaseGroupMemberView baseGroupMemberView) {
        AbstractC19074t.m100208f(baseGroupMemberView, "this$0");
        try {
            baseGroupMemberView.m78421xN(AbstractC8020f0.str_emptyResult);
            baseGroupMemberView.mo78422yN(false);
            GroupFullMemberAdapter groupFullMemberAdapter = baseGroupMemberView.f72331l1;
            if (groupFullMemberAdapter != null) {
                groupFullMemberAdapter.m35635P(baseGroupMemberView.f72336q1);
                groupFullMemberAdapter.m10008p();
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: tN */
    public static final void m78390tN(BaseGroupMemberView baseGroupMemberView) {
        AbstractC19074t.m100208f(baseGroupMemberView, "this$0");
        GroupFullMemberAdapter groupFullMemberAdapter = baseGroupMemberView.f72331l1;
        if (groupFullMemberAdapter != null) {
            groupFullMemberAdapter.m35635P(baseGroupMemberView.f72336q1);
            groupFullMemberAdapter.m10008p();
        }
    }

    /* renamed from: vN */
    public final void m78391vN(String str) {
        ContactProfile contactProfile;
        String str2;
        if (this.f72330k1.containsKey(str)) {
            this.f72330k1.remove(str);
            Iterator it = this.f72337r1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                GroupFullMemberAdapter.C6938b c6938b = (GroupFullMemberAdapter.C6938b) it.next();
                if (c6938b.f38021a == 0 && (contactProfile = c6938b.f38022b) != null) {
                    if (contactProfile != null) {
                        str2 = contactProfile.f42434r;
                    } else {
                        str2 = null;
                    }
                    if (AbstractC19074t.m100204b(str2, str)) {
                        this.f72337r1.remove(c6938b);
                        break;
                    }
                }
            }
        }
        mo78416pN();
    }

    /* renamed from: AN */
    public final void m78392AN(int i11, int i12, int i13, int i14) {
        m78410hN().f137468t.m87366h(i11, i12, i13, i14);
    }

    /* renamed from: BN */
    public final void m78393BN(boolean z11) {
        this.f72328F1 = z11;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        this.f72335p1 = new C23528a(this.f72421L0.m92648SI());
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35554O(32);
        }
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (m92642L3.containsKey("extra_group_id")) {
                String string = m92642L3.getString("extra_group_id");
                this.f72339t1 = string;
                this.f72357R0 = C0943w.f3447a.m4472f(string);
            }
            if (m92642L3.containsKey("extra_activity_title")) {
                this.f72338s1 = m92642L3.getString("extra_activity_title");
            }
            if (m92642L3.containsKey("EXTRA_IS_HIDE_ACTION_BAR")) {
                this.f72341v1 = m92642L3.getBoolean("EXTRA_IS_HIDE_ACTION_BAR");
            }
        }
    }

    /* renamed from: CN */
    public void mo78394CN() {
        boolean z11;
        try {
            this.f72333n1 = new LinearLayoutManager(this.f72421L0.m92648SI());
            m78410hN().f137465q.setLayoutManager(this.f72333n1);
            m78410hN().f137468t.setEnableLoadingText(true);
            m78421xN(AbstractC8020f0.empty_list);
            m78423zN(AbstractC8020f0.str_tv_loading);
            C31973j5 c31973j5 = this.f72357R0;
            if (c31973j5 != null) {
                z11 = c31973j5.m153747Y();
            } else {
                z11 = false;
            }
            Context m92686rK = this.f72421L0.m92686rK();
            AbstractC19074t.m100207e(m92686rK, "requireActivity(...)");
            this.f72331l1 = new GroupFullMemberAdapter(m92686rK, this.f72336q1, this.f72335p1, this.f72344y1, 1, null, z11, 32, null);
            m78410hN().f137465q.setAdapter(this.f72331l1);
            mo78422yN(true);
            m78410hN().f137468t.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.a2
                public /* synthetic */ C15422a2() {
                }

                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    BaseGroupMemberView.m78368DN(BaseGroupMemberView.this);
                }
            });
            AbstractC23126l.m118627a("BaseGroupMemberView");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i11 != 1004) {
            if (i11 != 1005) {
                return super.mo39014DJ(i11);
            }
            ContactProfile m141800i = C28203u6.m141800i(C28203u6.f131407a, this.f72340u1, false, 2, null);
            if (m141800i == null) {
                return null;
            }
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            C8009j.a m43173v = aVar.m43159h(7).m43173v(2);
            if (this.f72357R0.m153747Y()) {
                i14 = AbstractC8020f0.str_title_dialog_confirm_block_community_mem;
            } else {
                i14 = AbstractC8020f0.str_title_dialog_confirm_block_member;
            }
            C8009j.a m43172u = m43173v.m43172u(AbstractC23136l9.m118746s0(i14, m141800i.mo2475c()));
            if (this.f72357R0.m153747Y()) {
                i15 = AbstractC8020f0.str_desc_dialog_confirm_block_community_mem;
            } else {
                i15 = AbstractC8020f0.str_desc_dialog_confirm_block_member;
            }
            m43172u.m43162k(AbstractC23136l9.m118746s0(i15, m141800i.mo2475c())).m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.str_button_block, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.h2
                public /* synthetic */ C15684h2() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i16) {
                    BaseGroupMemberView.m78387nN(BaseGroupMemberView.this, interfaceC17463d, i16);
                }
            });
            return aVar.m43152a();
        }
        ContactProfile m141800i2 = C28203u6.m141800i(C28203u6.f131407a, this.f72340u1, false, 2, null);
        if (m141800i2 == null) {
            return null;
        }
        String mo2475c = m141800i2.mo2475c();
        AbstractC19074t.m100207e(mo2475c, "getDpn(...)");
        int length = mo2475c.length();
        int i16 = this.f76930Z0;
        if (length > i16) {
            String substring = mo2475c.substring(0, i16);
            AbstractC19074t.m100207e(substring, "substring(...)");
            mo2475c = substring + "...";
        }
        C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
        C8009j.a m43173v2 = aVar2.m43159h(4).m43173v(2);
        if (this.f72357R0.m153747Y()) {
            i12 = AbstractC8020f0.str_title_dialog_confirm_appoint_community_admin;
        } else {
            i12 = AbstractC8020f0.str_title_dialog_confirm_appoint_admin;
        }
        C8009j.a m43172u2 = m43173v2.m43172u(AbstractC23136l9.m118746s0(i12, m141800i2.mo2475c()));
        if (this.f72357R0.m153747Y()) {
            i13 = AbstractC8020f0.str_desc_dialog_confirm_appoint_community_admin;
        } else {
            i13 = AbstractC8020f0.str_desc_dialog_confirm_appoint_admin;
        }
        m43172u2.m43162k(AbstractC23136l9.m118746s0(i13, mo2475c)).m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b()).m43169r(AbstractC8020f0.str_button_appoint, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.g2
            public /* synthetic */ C15647g2() {
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i17) {
                BaseGroupMemberView.m78388oN(BaseGroupMemberView.this, interfaceC17463d, i17);
            }
        });
        return aVar2.m43152a();
    }

    @Override // com.zing.zalo.p077ui.zviews.RemoveGroupMemberBaseView
    /* renamed from: FM */
    public void mo78395FM() {
        AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f72331l1);
    }

    /* renamed from: FN */
    public void mo78396FN(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        mo78403NN(arrayList);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29756d0 m147832a = C29756d0.m147832a(layoutInflater.inflate(AbstractC7409c0.base_group_member_view, viewGroup, false));
        AbstractC19074t.m100207e(m147832a, "bind(...)");
        m78420wN(m147832a);
        m92637BK(true);
        mo78394CN();
        return m78410hN().getRoot();
    }

    /* renamed from: GN */
    public void mo78397GN(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        if (arrayList.size() == 2) {
            this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
            Object obj = arrayList.get(0);
            AbstractC19074t.m100207e(obj, "get(...)");
            C28203u6 c28203u6 = C28203u6.f131407a;
            C24848g0 c24848g0 = null;
            if (C28203u6.m141798e(c28203u6, (String) obj, null, 2, null) != null && this.f72330k1.containsKey(obj)) {
                ArrayList arrayList2 = this.f72337r1;
                AbstractC19069o0.m100184a(arrayList2).remove(this.f72330k1.remove(obj));
            }
            Object obj2 = arrayList.get(1);
            AbstractC19074t.m100207e(obj2, "get(...)");
            String str = (String) obj2;
            ContactProfile m141798e = C28203u6.m141798e(c28203u6, str, null, 2, null);
            if (m141798e != null) {
                if (this.f72330k1.containsKey(obj2)) {
                    m78400KN((GroupFullMemberAdapter.C6938b) this.f72330k1.get(obj2), true, false);
                } else {
                    GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                    c6938b.f38022b = m141798e;
                    m78400KN(c6938b, true, false);
                    this.f72337r1.add(c6938b);
                    this.f72330k1.put(obj2, c6938b);
                }
                Collections.sort(this.f72337r1, this.f72343x1);
                mo78416pN();
                c24848g0 = C24848g0.f119245a;
            }
            if (c24848g0 == null) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(obj2);
                AbstractC23184q2.m119463u(arrayList3, new Runnable() { // from class: com.zing.zalo.ui.zviews.d2

                    /* renamed from: p */
                    public final /* synthetic */ String f80098p;

                    /* renamed from: q */
                    public final /* synthetic */ BaseGroupMemberView f80099q;

                    public /* synthetic */ RunnableC15536d2(String str2, BaseGroupMemberView this) {
                        r1 = str2;
                        r2 = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseGroupMemberView.m78370HN(r1, r2);
                    }
                });
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.RemoveGroupMemberBaseView
    /* renamed from: HM */
    public void mo78398HM() {
    }

    /* renamed from: IN */
    public void mo78399IN(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        if (arrayList.size() != 1) {
            return;
        }
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        Object obj = arrayList.get(0);
        AbstractC19074t.m100207e(obj, "get(...)");
        String str = (String) obj;
        C24848g0 c24848g0 = null;
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null) {
            m78400KN((GroupFullMemberAdapter.C6938b) this.f72330k1.get(this.f72342w1), false, false);
            ArrayList arrayList2 = this.f72337r1;
            AbstractC19069o0.m100184a(arrayList2).remove(this.f72330k1.remove(this.f72342w1));
            this.f72342w1 = str;
            if (this.f72330k1.containsKey(str)) {
                m78400KN((GroupFullMemberAdapter.C6938b) this.f72330k1.get(str), true, false);
            } else {
                GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                c6938b.f38022b = m141798e;
                m78400KN(c6938b, true, false);
                this.f72337r1.add(c6938b);
                this.f72330k1.put(str, c6938b);
            }
            Collections.sort(this.f72337r1, this.f72343x1);
            mo78416pN();
            c24848g0 = C24848g0.f119245a;
        }
        if (c24848g0 == null) {
            AbstractC23184q2.m119463u(arrayList, new Runnable() { // from class: com.zing.zalo.ui.zviews.b2

                /* renamed from: q */
                public final /* synthetic */ String f79872q;

                public /* synthetic */ RunnableC15459b2(String str2) {
                    r2 = str2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseGroupMemberView.m78371JN(BaseGroupMemberView.this, r2);
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 27);
        bVar.m124119a().m124117e(this, 62);
        bVar.m124119a().m124117e(this, 6080);
    }

    /* renamed from: KN */
    public final void m78400KN(GroupFullMemberAdapter.C6938b c6938b, boolean z11, boolean z12) {
        if (c6938b != null) {
            c6938b.f38027g = z12;
            c6938b.f38025e = z11;
        }
    }

    /* renamed from: LN */
    public final void m78401LN() {
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        this.f72323A1 = 0;
        this.f72324B1 = 0;
        mo78412jN();
    }

    /* renamed from: MN */
    public void m78402MN(int i11, boolean z11, int i12, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC19074t.m100208f(arrayList, "dataContact");
        AbstractC19074t.m100208f(arrayList2, "listSuggestInvite");
        ManageMembersView.C14568a c14568a = ManageMembersView.Companion;
        c14568a.m81555c(z11);
        c14568a.m81556d(i11);
        c14568a.m81559g(arrayList);
        c14568a.m81558f(arrayList2);
        c14568a.m81557e(i12);
    }

    /* renamed from: NN */
    public void mo78403NN(ArrayList arrayList) {
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

    /* renamed from: ON */
    public void mo78404ON(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "uids");
        this.f72357R0 = C0943w.f3447a.m4472f(this.f72339t1);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
            if (m141798e != null) {
                if (this.f72330k1.containsKey(str)) {
                    m78400KN((GroupFullMemberAdapter.C6938b) this.f72330k1.get(str), false, true);
                } else {
                    GroupFullMemberAdapter.C6938b c6938b = new GroupFullMemberAdapter.C6938b(0);
                    c6938b.f38022b = m141798e;
                    m78400KN(c6938b, false, true);
                    this.f72337r1.add(c6938b);
                    HashMap hashMap = this.f72330k1;
                    AbstractC19074t.m100205c(str);
                    hashMap.put(str, c6938b);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (arrayList2.size() > 0) {
            AbstractC23184q2.m119463u(arrayList2, new Runnable() { // from class: com.zing.zalo.ui.zviews.z1

                /* renamed from: p */
                public final /* synthetic */ ArrayList f82796p;

                /* renamed from: q */
                public final /* synthetic */ BaseGroupMemberView f82797q;

                public /* synthetic */ RunnableC16397z1(ArrayList arrayList22, BaseGroupMemberView this) {
                    r1 = arrayList22;
                    r2 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseGroupMemberView.m78374PN(r1, r2);
                }
            });
        } else {
            Collections.sort(this.f72337r1, this.f72343x1);
            mo78416pN();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            if (this.f72341v1) {
                actionBar.setVisibility(8);
                return;
            }
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_chat_group_member_title));
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            actionBar.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: XJ */
    public void mo37122XJ(boolean z11, boolean z12) {
        InterfaceC27218a m92676n2;
        InterfaceC27218a m92676n22;
        super.mo37122XJ(z11, z12);
        if (m92672lJ() && m92674mJ() && z11 && (m92676n2 = this.f72421L0.m92676n2()) != null && m92676n2.getWindow() != null && (m92676n22 = this.f72421L0.m92676n2()) != null) {
            m92676n22.mo35554O(32);
        }
    }

    /* renamed from: aN */
    public final void m78405aN(String str, ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "admins");
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C14088b(arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InviteContactProfile) it.next()).f42434r);
        }
        c0766k.mo1444H6(str, arrayList2, true);
    }

    /* renamed from: bN */
    public final void m78406bN(int i11) {
        int size = this.f72336q1.size();
        if (size > 0) {
            Object obj = this.f72336q1.get(size - 1);
            AbstractC19074t.m100207e(obj, "get(...)");
            if (((GroupFullMemberAdapter.C6938b) obj).f38021a != 4 && this.f72337r1.size() >= i11) {
                this.f72336q1.add(new GroupFullMemberAdapter.C6938b(4));
                this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.e2
                    public /* synthetic */ RunnableC15573e2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseGroupMemberView.m78385cN(BaseGroupMemberView.this);
                    }
                });
                return;
            }
            return;
        }
        if (this.f72337r1.size() >= i11) {
            this.f72336q1.add(new GroupFullMemberAdapter.C6938b(4));
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.f2
                public /* synthetic */ RunnableC15610f2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseGroupMemberView.m78386dN(BaseGroupMemberView.this);
                }
            });
        }
    }

    /* renamed from: eN */
    public final void m78407eN(String str, ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "contactList");
        if (this.f72328F1) {
            return;
        }
        this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
        this.f72328F1 = true;
        this.f72327E1.mo1704o8(new C14089c());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((InviteContactProfile) it.next()).f42434r);
        }
        this.f72327E1.mo1781y4(str, arrayList2, true);
    }

    /* renamed from: fN */
    public List mo78408fN(List list) {
        AbstractC19074t.m100208f(list, "data");
        return list;
    }

    /* renamed from: gN */
    public final void m78409gN() {
        try {
            C17487o0 m92649TI = this.f72421L0.m92649TI();
            AbstractC19074t.m100207e(m92649TI, "getChildZaloViewManager(...)");
            ZaloView m92996E0 = m92649TI.m92996E0("TAG_OPTION_MENU_POPUP");
            if (m92996E0 != null) {
                m92649TI.mo92702G1(m92996E0, m92996E0.f88756W);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "";
    }

    /* renamed from: hN */
    public final C29756d0 m78410hN() {
        C29756d0 c29756d0 = this.f72329j1;
        if (c29756d0 != null) {
            return c29756d0;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:            if (android.text.TextUtils.isEmpty(r2) != false) goto L30;     */
    /* renamed from: iN */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ContactProfile m78411iN(String str, String str2, String str3, int i11) {
        String str4;
        AbstractC19074t.m100208f(str, "uid");
        String str5 = null;
        ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, str, null, 2, null);
        if (m141798e != null) {
            str4 = m141798e.f42437s;
        } else {
            str4 = null;
        }
        if (!TextUtils.isEmpty(str4)) {
            if (m141798e != null) {
                str5 = m141798e.f42446v;
            }
        }
        m141798e = new ContactProfile(str);
        m141798e.f42437s = str2;
        m141798e.f42446v = str3;
        m141798e.f42352K0 = i11;
        m141798e.f42330D = System.currentTimeMillis();
        C7960e.m41971c6().m42221O7(m141798e, false);
        if (AbstractC19074t.m100204b(CoreUtility.f89233i, str)) {
            m141798e = new ContactProfile(str);
            m141798e.f42437s = str2;
            m141798e.f42446v = str3;
            m141798e.f42352K0 = i11;
            m141798e.f42330D = System.currentTimeMillis();
        }
        AbstractC19074t.m100205c(m141798e);
        return m141798e;
    }

    /* renamed from: jN */
    public void mo78412jN() {
    }

    /* renamed from: kN */
    public final void m78413kN(int i11, String str, String str2) {
        ContactProfile m141800i;
        AbstractC19074t.m100208f(str, "groupId");
        AbstractC19074t.m100208f(str2, "uid");
        this.f72340u1 = str2;
        switch (i11) {
            case 0:
                AbstractC3102n.m15598q(this.f72421L0, 98, C28203u6.m141800i(C28203u6.f131407a, str2, false, 2, null));
                return;
            case 1:
                GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c = this.f72344y1;
                if (interfaceC6939c != null) {
                    ContactProfile m141800i2 = C28203u6.m141800i(C28203u6.f131407a, str2, false, 2, null);
                    if (m141800i2 == null) {
                        m141800i2 = new ContactProfile(str2);
                    }
                    interfaceC6939c.mo35649b(m141800i2);
                    return;
                }
                return;
            case 2:
                GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c2 = this.f72344y1;
                if (interfaceC6939c2 != null) {
                    interfaceC6939c2.mo35659l(str2, str);
                    return;
                }
                return;
            case 3:
                if (this.f72357R0.m153778p0()) {
                    this.f72421L0.showDialog(1004);
                    return;
                } else {
                    m78369EN();
                    return;
                }
            case 4:
                GroupFullMemberAdapter.InterfaceC6939c interfaceC6939c3 = this.f72344y1;
                if (interfaceC6939c3 != null && (m141800i = C28203u6.m141800i(C28203u6.f131407a, str2, false, 2, null)) != null) {
                    interfaceC6939c3.mo35656i(m141800i);
                    return;
                }
                return;
            case 5:
                if (!this.f72357R0.m153778p0() && (!this.f72357R0.m153742T() || this.f72357R0.m153744V(this.f72340u1))) {
                    m78369EN();
                    return;
                } else {
                    this.f72421L0.showDialog(1005);
                    return;
                }
            case 6:
                if (this.f72357R0.m153742T()) {
                    ContactProfile m141800i3 = C28203u6.m141800i(C28203u6.f131407a, str2, false, 2, null);
                    if (m141800i3 == null) {
                        m141800i3 = new ContactProfile(str2);
                    }
                    m78419uN(m141800i3);
                    return;
                }
                m78369EN();
                return;
            case 7:
                if (!this.f72357R0.m153778p0() && (!this.f72357R0.m153742T() || this.f72357R0.m153744V(this.f72340u1))) {
                    m78369EN();
                    return;
                } else {
                    m83605LM(str, str2);
                    return;
                }
            case 8:
                if (this.f72357R0.m153742T()) {
                    m83604KM(str, str2);
                    return;
                } else {
                    m78369EN();
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: lN */
    public void mo78414lN(String str, int i11, boolean z11) {
        AbstractC19074t.m100208f(str, "groupId");
    }

    /* renamed from: mN */
    public void mo78415mN() {
        if (this.f72345z1) {
            mo78412jN();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        boolean m153768k0;
        boolean booleanExtra;
        if (i11 != 105) {
            if (i11 == 10099 && i12 == -1) {
                AbstractC2364o0.m12369l(this.f72421L0.m92676n2(), this.f72331l1);
                return;
            }
            return;
        }
        C31973j5 c31973j5 = this.f72357R0;
        if (i12 == -1 && intent != null && c31973j5 != null && m153768k0 != (booleanExtra = intent.getBooleanExtra("RESULT_DATA_NEW_CHECKED_VALUE", (m153768k0 = c31973j5.m153768k0())))) {
            if (c31973j5.m153742T()) {
                mo78414lN(c31973j5.m153781r(), 12, booleanExtra);
            } else {
                m78369EN();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            this.f72421L0.finish();
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 125) {
            if (AbstractC23034c6.m118136V(iArr) && AbstractC23034c6.m118167n(this.f72421L0.m92686rK(), AbstractC23034c6.f112030g) == 0) {
                AbstractC3102n.m15598q(this.f72421L0, 98, this.f72326D1);
            } else {
                AbstractC23034c6.m118162k0(this, 125);
            }
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // com.zing.zalo.p077ui.zviews.RemoveGroupMemberBaseView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        GroupFullMemberAdapter groupFullMemberAdapter = this.f72331l1;
        if (groupFullMemberAdapter != null) {
            groupFullMemberAdapter.m10008p();
        }
    }

    /* renamed from: pN */
    public synchronized void mo78416pN() {
        ArrayList arrayList;
        try {
            this.f72336q1.clear();
            int size = this.f72337r1.size();
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    ContactProfile contactProfile = ((GroupFullMemberAdapter.C6938b) this.f72337r1.get(i11)).f38022b;
                    if (contactProfile != null && (arrayList = contactProfile.f42399a1) != null) {
                        arrayList.clear();
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            this.f72336q1.addAll(mo78408fN(this.f72337r1));
            this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.c2
                public /* synthetic */ RunnableC15495c2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BaseGroupMemberView.m78389qN(BaseGroupMemberView.this);
                }
            });
        } catch (Exception e12) {
            AbstractC23350e.m122778h(e12);
        }
    }

    /* renamed from: rN */
    public final void m78417rN(ArrayList arrayList) {
        this.f72421L0.mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(this.f76935e1);
        c0766k.mo1444H6(this.f72339t1, arrayList, false);
    }

    /* renamed from: sN */
    public final void m78418sN() {
        int size = this.f72336q1.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i11 = size - 1;
            Object obj = this.f72336q1.get(size);
            AbstractC19074t.m100207e(obj, "get(...)");
            if (((GroupFullMemberAdapter.C6938b) obj).f38021a == 4) {
                this.f72336q1.remove(size);
                this.f72827B0.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.i2
                    public /* synthetic */ RunnableC15721i2() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseGroupMemberView.m78390tN(BaseGroupMemberView.this);
                    }
                });
                return;
            } else if (i11 >= 0) {
                size = i11;
            } else {
                return;
            }
        }
    }

    /* renamed from: uN */
    public final void m78419uN(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        try {
            if (this.f72328F1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            this.f72328F1 = true;
            ArrayList arrayList = new ArrayList();
            arrayList.add(contactProfile.f42434r);
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14092f(contactProfile));
            c0766k.mo1781y4(this.f72339t1, arrayList, false);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: wN */
    public final void m78420wN(C29756d0 c29756d0) {
        AbstractC19074t.m100208f(c29756d0, "<set-?>");
        this.f72329j1 = c29756d0;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
    }

    /* renamed from: xN */
    public final void m78421xN(int i11) {
        m78410hN().f137468t.setEmptyViewString(AbstractC23136l9.m118743r0(i11));
    }

    /* renamed from: yN */
    public void mo78422yN(boolean z11) {
        if (z11) {
            m78410hN().f137465q.setVisibility(8);
            MultiStateView multiStateView = m78410hN().f137468t;
            multiStateView.setVisibility(0);
            multiStateView.setState(MultiStateView.EnumC15914e.LOADING);
            return;
        }
        if (this.f72336q1.size() > 0) {
            m78410hN().f137468t.setVisibility(8);
            m78410hN().f137465q.setVisibility(0);
        } else {
            m78410hN().f137465q.setVisibility(8);
            MultiStateView multiStateView2 = m78410hN().f137468t;
            multiStateView2.setVisibility(0);
            multiStateView2.setState(MultiStateView.EnumC15914e.EMPTY);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 27);
        bVar.m124119a().m124115b(this, 62);
        bVar.m124119a().m124115b(this, 6080);
    }

    /* renamed from: zN */
    public final void m78423zN(int i11) {
        m78410hN().f137468t.setLoadingString(AbstractC23136l9.m118743r0(i11));
    }
}

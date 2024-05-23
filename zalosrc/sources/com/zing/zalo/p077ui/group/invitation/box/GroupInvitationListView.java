package com.zing.zalo.p077ui.group.invitation.box;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi.C2804c;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.adapters.C7191r1;
import com.zing.zalo.control.group.GroupInvitationInfo;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.group.invitation.box.ConfirmDeclineInvitationBottomSheet;
import com.zing.zalo.p077ui.group.invitation.box.GroupInvitationListView;
import com.zing.zalo.p077ui.zviews.GroupLobbyView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import d70.C17804c;
import d70.C17811j;
import d70.InterfaceC17805d;
import d70.InterfaceC17806e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gw.C19669z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p227i3.C20218v;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p649xl.C29851i5;
import p656xs.AbstractC30200a;
import vg.AbstractC28207v1;

/* loaded from: classes5.dex */
public final class GroupInvitationListView extends SlidableZaloView implements InterfaceC17806e, C23744a.c {
    public static final C11901a Companion = new C11901a(null);

    /* renamed from: P0 */
    private C7191r1 f62007P0;

    /* renamed from: Q0 */
    private InterfaceC17805d f62008Q0;

    /* renamed from: R0 */
    private C17804c f62009R0;

    /* renamed from: S0 */
    private C29851i5 f62010S0;

    /* renamed from: T0 */
    private GroupInvitationInfo f62011T0;

    /* renamed from: U0 */
    private C8009j f62012U0;

    /* renamed from: com.zing.zalo.ui.group.invitation.box.GroupInvitationListView$a */
    /* loaded from: classes5.dex */
    public static final class C11901a {
        private C11901a() {
        }

        public /* synthetic */ C11901a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.group.invitation.box.GroupInvitationListView$b */
    /* loaded from: classes5.dex */
    public static final class C11902b implements ConfirmDeclineInvitationBottomSheet.InterfaceC11899a {

        /* renamed from: b */
        final /* synthetic */ GroupInvitationInfo f62014b;

        C11902b(GroupInvitationInfo groupInvitationInfo) {
            this.f62014b = groupInvitationInfo;
        }

        @Override // com.zing.zalo.p077ui.group.invitation.box.ConfirmDeclineInvitationBottomSheet.InterfaceC11899a
        /* renamed from: a */
        public void mo66157a(boolean z11, boolean z12) {
            InterfaceC17805d interfaceC17805d = GroupInvitationListView.this.f62008Q0;
            if (interfaceC17805d == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC17805d = null;
            }
            interfaceC17805d.mo94042Wc(this.f62014b, Boolean.valueOf(z11), Boolean.valueOf(z12));
        }
    }

    /* renamed from: com.zing.zalo.ui.group.invitation.box.GroupInvitationListView$c */
    /* loaded from: classes5.dex */
    public static final class C11903c extends SimpleAdapter {

        /* renamed from: p */
        final /* synthetic */ GroupInvitationListView f62015p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11903c(List list, GroupInvitationListView groupInvitationListView, Context context, int i11, String[] strArr, int[] iArr) {
            super(context, list, i11, strArr, iArr);
            this.f62015p = groupInvitationListView;
        }

        @Override // android.widget.SimpleAdapter
        public void setViewText(TextView textView, String str) {
            AbstractC19074t.m100208f(textView, C20218v.f100059b);
            AbstractC19074t.m100208f(str, "text");
            super.setViewText(textView, str);
            if (AbstractC19074t.m100204b(str, AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_decline_group_invitation_title))) {
                textView.setTextColor(Color.parseColor("#ff5252"));
            } else {
                textView.setTextColor(C23212s8.m119607o(this.f62015p.getContext(), AbstractC21196a.TextColor1));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.group.invitation.box.GroupInvitationListView$d */
    /* loaded from: classes5.dex */
    public static final class C11904d implements C7191r1.b {
        C11904d() {
        }

        @Override // com.zing.zalo.adapters.C7191r1.b
        /* renamed from: a */
        public void mo36587a() {
            InterfaceC17805d interfaceC17805d = GroupInvitationListView.this.f62008Q0;
            if (interfaceC17805d == null) {
                AbstractC19074t.m100223u("mPresenter");
                interfaceC17805d = null;
            }
            interfaceC17805d.mo94043jb();
        }

        @Override // com.zing.zalo.adapters.C7191r1.b
        /* renamed from: b */
        public void mo36588b(GroupInvitationInfo groupInvitationInfo) {
            if (groupInvitationInfo != null) {
                GroupInvitationListView.this.m66173qM(groupInvitationInfo);
            }
        }

        @Override // com.zing.zalo.adapters.C7191r1.b
        /* renamed from: c */
        public void mo36589c() {
            GroupInvitationListView.this.m66174rM();
        }

        @Override // com.zing.zalo.adapters.C7191r1.b
        /* renamed from: d */
        public void mo36590d(GroupInvitationInfo groupInvitationInfo) {
            if (groupInvitationInfo != null) {
                GroupInvitationListView groupInvitationListView = GroupInvitationListView.this;
                groupInvitationListView.m66170nM(groupInvitationInfo);
                groupInvitationListView.f62011T0 = groupInvitationInfo;
            }
        }
    }

    /* renamed from: mM */
    private final void m66169mM(int i11, GroupInvitationInfo groupInvitationInfo) {
        if (i11 == AbstractC8020f0.str_view_group_invitation_info_title || i11 == AbstractC8020f0.str_view_community_invitation_info_title) {
            m66173qM(groupInvitationInfo);
        } else if (i11 == AbstractC8020f0.str_group_decline_group_invitation_title) {
            ConfirmDeclineInvitationBottomSheet m66158a = ConfirmDeclineInvitationBottomSheet.Companion.m66158a(new C11902b(groupInvitationInfo), groupInvitationInfo);
            this.f72421L0.m92649TI().m93058d2(0, m66158a, 100, m66158a.f61989U0, 0, false);
        }
    }

    /* renamed from: nM */
    public final void m66170nM(GroupInvitationInfo groupInvitationInfo) {
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        if (groupInvitationInfo.m40898p()) {
            i11 = AbstractC8020f0.str_view_community_invitation_info_title;
        } else {
            i11 = AbstractC8020f0.str_view_group_invitation_info_title;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        hashMap.put("name", m118743r0);
        if (groupInvitationInfo.m40898p()) {
            i12 = AbstractC8020f0.str_view_community_invitation_info_title;
        } else {
            i12 = AbstractC8020f0.str_view_group_invitation_info_title;
        }
        hashMap.put("id", Integer.valueOf(i12));
        arrayList.add(hashMap);
        HashMap hashMap2 = new HashMap();
        String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_decline_group_invitation_title);
        AbstractC19074t.m100207e(m118743r02, "getString(...)");
        hashMap2.put("name", m118743r02);
        hashMap2.put("id", Integer.valueOf(AbstractC8020f0.str_group_decline_group_invitation_title));
        arrayList.add(hashMap2);
        arrayList.isEmpty();
        C11903c c11903c = new C11903c(arrayList, this, this.f72421L0.m92648SI(), AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name"}, new int[]{AbstractC6918a0.tv_active_time_passcode});
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43155d(true);
        aVar.m43172u(groupInvitationInfo.m40887e());
        aVar.m43153b(c11903c, new InterfaceC17463d.d() { // from class: d70.k

            /* renamed from: p */
            public final /* synthetic */ SimpleAdapter f90065p;

            /* renamed from: q */
            public final /* synthetic */ GroupInvitationListView f90066q;

            /* renamed from: r */
            public final /* synthetic */ GroupInvitationInfo f90067r;

            public /* synthetic */ C17812k(SimpleAdapter c11903c2, GroupInvitationListView this, GroupInvitationInfo groupInvitationInfo2) {
                r1 = c11903c2;
                r2 = this;
                r3 = groupInvitationInfo2;
            }

            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                GroupInvitationListView.m66171oM(r1, r2, r3, interfaceC17463d, i13);
            }
        });
        C8009j m43152a = aVar.m43152a();
        this.f62012U0 = m43152a;
        if (m43152a != null) {
            AbstractC19074t.m100205c(m43152a);
            if (!m43152a.m92868m()) {
                C8009j c8009j = this.f62012U0;
                AbstractC19074t.m100205c(c8009j);
                c8009j.mo13822K();
            }
        }
    }

    /* renamed from: oM */
    public static final void m66171oM(SimpleAdapter simpleAdapter, GroupInvitationListView groupInvitationListView, GroupInvitationInfo groupInvitationInfo, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(simpleAdapter, "$a");
        AbstractC19074t.m100208f(groupInvitationListView, "this$0");
        AbstractC19074t.m100208f(groupInvitationInfo, "$invitation");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        Object item = simpleAdapter.getItem(i11);
        AbstractC19074t.m100206d(item, "null cannot be cast to non-null type java.util.HashMap<*, *>");
        Object obj = ((HashMap) item).get("id");
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Int");
        groupInvitationListView.m66169mM(((Integer) obj).intValue(), groupInvitationInfo);
    }

    /* renamed from: pM */
    private final void m66172pM() {
        int i11;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C29851i5 c29851i5 = this.f62010S0;
        C7191r1 c7191r1 = null;
        if (c29851i5 == null) {
            AbstractC19074t.m100223u("binding");
            c29851i5 = null;
        }
        ZdsActionBar zdsActionBar = c29851i5.f138146r;
        if (AbstractC30200a.m148947f()) {
            i11 = AbstractC8020f0.str_group_invitation_item_title_v2;
        } else {
            i11 = AbstractC8020f0.str_group_invitation_item_title;
        }
        String m118743r0 = AbstractC23136l9.m118743r0(i11);
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        zdsActionBar.setMiddleTitle(m118743r0);
        C29851i5 c29851i52 = this.f62010S0;
        if (c29851i52 == null) {
            AbstractC19074t.m100223u("binding");
            c29851i52 = null;
        }
        c29851i52.f138145q.setLayoutManager(new LinearLayoutManager(m92689tK));
        Context m92689tK2 = m92689tK();
        AbstractC19074t.m100207e(m92689tK2, "requireContext(...)");
        this.f62007P0 = new C7191r1(m92689tK2);
        C29851i5 c29851i53 = this.f62010S0;
        if (c29851i53 == null) {
            AbstractC19074t.m100223u("binding");
            c29851i53 = null;
        }
        RecyclerView recyclerView = c29851i53.f138145q;
        C7191r1 c7191r12 = this.f62007P0;
        if (c7191r12 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c7191r12 = null;
        }
        recyclerView.setAdapter(c7191r12);
        C7191r1 c7191r13 = this.f62007P0;
        if (c7191r13 == null) {
            AbstractC19074t.m100223u("mAdapter");
        } else {
            c7191r1 = c7191r13;
        }
        c7191r1.m36585S(new C11904d());
    }

    /* renamed from: qM */
    public final void m66173qM(GroupInvitationInfo groupInvitationInfo) {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        bundle.putString("extra_group_id", groupInvitationInfo.m40886d());
        bundle.putBoolean("BOL_EXTRA_NEED_REQUEST_DATA", true);
        bundle.putBoolean("EXTRA_FROM_INVITATION_BOX", true);
        bundle.putInt("INT_EXTRA_JOIN_SOURCE", 10);
        bundle.putParcelable("EXTRA_GROUP_INVITATION_INFO", groupInvitationInfo);
        bundle.putBoolean("EXTRA_IS_COMMUNITY", groupInvitationInfo.m40898p());
        InterfaceC27218a m92676n2 = this.f72421L0.m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(GroupLobbyView.class, bundle, 1, true);
        }
    }

    /* renamed from: rM */
    public final void m66174rM() {
        AbstractC28207v1.m141994i3("action.open.inapp", 3, m92676n2(), this, AbstractC23306f.m120583H().m110204g().m116320l(), null);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (!AbstractC23309i.m120961G2()) {
            mo59032jx(AbstractC8020f0.str_this_feature_is_not_available);
            finish();
        }
        this.f62009R0 = C17804c.m94039a();
        C17811j c17811j = new C17811j(this, C2804c.f11236a, C19669z.Companion.m103232a());
        this.f62008Q0 = c17811j;
        C17804c c17804c = this.f62009R0;
        if (c17804c == null) {
            AbstractC19074t.m100223u("mArgs");
            c17804c = null;
        }
        c17811j.mo995Nd(c17804c, null);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29851i5 m148069c = C29851i5.m148069c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148069c, "inflate(...)");
        this.f62010S0 = m148069c;
        m66172pM();
        C29851i5 c29851i5 = this.f62010S0;
        if (c29851i5 == null) {
            AbstractC19074t.m100223u("binding");
            c29851i5 = null;
        }
        LinearLayout root = c29851i5.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        InterfaceC17805d interfaceC17805d = this.f62008Q0;
        if (interfaceC17805d == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC17805d = null;
        }
        interfaceC17805d.mo994F2();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124117e(this, 5114);
        bVar.m124119a().m124117e(this, 5115);
        bVar.m124119a().m124117e(this, 5116);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "GroupInvitationListView";
    }

    @Override // d70.InterfaceC17806e
    /* renamed from: j0 */
    public void mo66175j0() {
        C7191r1 c7191r1 = this.f62007P0;
        if (c7191r1 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c7191r1 = null;
        }
        c7191r1.m36586T();
    }

    @Override // d70.InterfaceC17806e
    /* renamed from: si */
    public void mo66176si(List list, boolean z11) {
        C7191r1 c7191r1 = this.f62007P0;
        if (c7191r1 == null) {
            AbstractC19074t.m100223u("mAdapter");
            c7191r1 = null;
        }
        c7191r1.m36584Q(list, z11);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        InterfaceC17805d interfaceC17805d = null;
        switch (i11) {
            case 5114:
                InterfaceC17805d interfaceC17805d2 = this.f62008Q0;
                if (interfaceC17805d2 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                } else {
                    interfaceC17805d = interfaceC17805d2;
                }
                interfaceC17805d.mo94040B8();
                return;
            case 5115:
                InterfaceC17805d interfaceC17805d3 = this.f62008Q0;
                if (interfaceC17805d3 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                } else {
                    interfaceC17805d = interfaceC17805d3;
                }
                interfaceC17805d.mo94044qf();
                return;
            case 5116:
                InterfaceC17805d interfaceC17805d4 = this.f62008Q0;
                if (interfaceC17805d4 == null) {
                    AbstractC19074t.m100223u("mPresenter");
                } else {
                    interfaceC17805d = interfaceC17805d4;
                }
                interfaceC17805d.mo94041Be();
                return;
            default:
                return;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        InterfaceC17805d interfaceC17805d = this.f62008Q0;
        if (interfaceC17805d == null) {
            AbstractC19074t.m100223u("mPresenter");
            interfaceC17805d = null;
        }
        interfaceC17805d.mo94043jb();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.b bVar = C23744a.Companion;
        bVar.m124119a().m124115b(this, 5114);
        bVar.m124119a().m124115b(this, 5115);
        bVar.m124119a().m124115b(this, 5116);
    }
}

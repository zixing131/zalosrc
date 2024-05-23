package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseMemberItemModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import java.util.ArrayList;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p193h0.AbstractC19694b;
import p262jb.AbstractC21196a;
import p354n3.C23528a;

/* loaded from: classes3.dex */
public class GroupSuggestInviteMemberAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    ArrayList f38096r;

    /* renamed from: s */
    boolean f38097s = false;

    /* renamed from: t */
    public Context f38098t;

    /* renamed from: u */
    C23528a f38099u;

    /* renamed from: v */
    InterfaceC6963c f38100v;

    /* loaded from: classes3.dex */
    public static class HeaderModuleView extends ModulesView implements InterfaceC6961a {

        /* renamed from: K */
        C22126c0 f38101K;

        /* renamed from: L */
        C21693c f38102L;

        /* renamed from: M */
        C16719g f38103M;

        public HeaderModuleView(Context context) {
            super(context);
            m88987U(-1, -2);
            C16719g c16719g = new C16719g(context);
            this.f38103M = c16719g;
            c16719g.m89106L().m89028L(-1, AbstractC23222t7.f112564i);
            this.f38103M.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89028L(-1, -2).m89042Z(AbstractC23222t7.f112586t, 0, AbstractC23222t7.f112566j, 0).m89029M(12).m89023G(this.f38103M);
            C21693c c21693c = new C21693c(context);
            this.f38102L = c21693c;
            C16718f m89028L = c21693c.m89106L().m89028L(-2, -2);
            Boolean bool = Boolean.TRUE;
            m89028L.m89017A(bool).m89029M(12);
            this.f38102L.mo111925v1(AbstractC19694b.m103336d(context, AbstractC16803z.icn_csc_sticker_option_vertical));
            this.f38102L.m89085A0(AbstractC23136l9.m118718j(context));
            C16718f m89106L = this.f38102L.m89106L();
            int i11 = AbstractC23222t7.f112566j;
            m89106L.m89042Z(i11, i11, i11, i11);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f38101K = c22126c0;
            c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.SectionTitleColor1));
            this.f38101K.mo111964L1(AbstractC23222t7.f112580q);
            this.f38101K.mo111965M1(1);
            this.f38101K.m89106L().m89049e0(this.f38102L).m89073z(bool).m89027K(true);
            c16716d.m89001g1(this.f38102L);
            c16716d.m89001g1(this.f38101K);
            mo69681L(this.f38103M);
            mo69681L(c16716d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public static /* synthetic */ void m35712W(C16719g c16719g) {
        }

        @Override // com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter.InterfaceC6961a
        /* renamed from: j */
        public void mo35713j(C6962b c6962b, int i11, boolean z11) {
            int i12;
            if (c6962b == null) {
                return;
            }
            try {
                this.f38101K.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_chat_info_participant_header));
                C16719g c16719g = this.f38103M;
                if (c6962b.f38107c) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                c16719g.mo44614b1(i12);
                this.f38102L.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.p2
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g2) {
                        GroupSuggestInviteMemberAdapter.HeaderModuleView.m35712W(c16719g2);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class MemberRowModuleView extends BaseMemberItemModuleView implements InterfaceC6961a {
        public MemberRowModuleView(Context context, C23528a c23528a) {
            super(context, c23528a);
            this.f64549L.mo44614b1(8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public /* synthetic */ void m35715W(boolean z11, C6962b c6962b, C16719g c16719g) {
            InterfaceC6963c interfaceC6963c = GroupSuggestInviteMemberAdapter.this.f38100v;
            if (interfaceC6963c != null) {
                if (z11) {
                    interfaceC6963c.mo35717a();
                } else {
                    interfaceC6963c.mo35718b(c6962b.f38106b);
                }
            }
        }

        @Override // com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter.InterfaceC6961a
        /* renamed from: j */
        public void mo35713j(final C6962b c6962b, int i11, boolean z11) {
            int i12;
            int i13;
            int i14;
            if (c6962b == null) {
                return;
            }
            try {
                int i15 = 8;
                this.f64549L.mo44614b1(8);
                if (c6962b.f38105a == 0) {
                    ContactProfile contactProfile = c6962b.f38106b;
                    this.f64550M.m115407x1(C23212s8.m119607o(this.f84675p, AbstractC21196a.TextColor1));
                    this.f64550M.m115406w1(contactProfile.m40383Q(true, true));
                    this.f64552O.m115439w1(C23278z2.m120143n());
                    this.f64552O.m115429C1(false, false);
                    this.f64552O.m115433q1(contactProfile);
                    C16719g c16719g = this.f64549L;
                    if (c6962b.f38108d) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    c16719g.mo44614b1(i12);
                    final boolean z12 = !TextUtils.isEmpty(c6962b.f38109e);
                    this.f64551N.m111959G1(c6962b.f38109e);
                    this.f64551N.mo111964L1(AbstractC23222t7.f112574n);
                    C22126c0 c22126c0 = this.f64551N;
                    if (z12) {
                        i15 = 0;
                    }
                    c22126c0.mo44614b1(i15);
                    this.f64555R.mo44614b1(0);
                    C22126c0 c22126c02 = this.f64555R;
                    if (z12) {
                        i13 = AbstractC8020f0.str_btn_open;
                    } else {
                        i13 = AbstractC8020f0.str_add;
                    }
                    c22126c02.m111959G1(AbstractC23136l9.m118743r0(i13));
                    C22126c0 c22126c03 = this.f64555R;
                    if (z12) {
                        i14 = AbstractC8915g0.btnType2_small;
                    } else {
                        i14 = AbstractC8915g0.btnType1_small;
                    }
                    AbstractC23022b5.m118023a(c22126c03, i14);
                    this.f64555R.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.q2
                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g2) {
                            GroupSuggestInviteMemberAdapter.MemberRowModuleView.this.m35715W(z12, c6962b, c16719g2);
                        }
                    });
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter$a */
    /* loaded from: classes3.dex */
    private interface InterfaceC6961a {
        /* renamed from: j */
        void mo35713j(C6962b c6962b, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter$b */
    /* loaded from: classes3.dex */
    public static class C6962b {

        /* renamed from: a */
        public int f38105a;

        /* renamed from: b */
        public ContactProfile f38106b;

        /* renamed from: c */
        public boolean f38107c;

        /* renamed from: d */
        public boolean f38108d;

        /* renamed from: e */
        public String f38109e = "";

        public C6962b(int i11) {
            this.f38105a = i11;
        }

        /* renamed from: a */
        public int m35716a() {
            return this.f38105a;
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC6963c {
        /* renamed from: a */
        void mo35717a();

        /* renamed from: b */
        void mo35718b(ContactProfile contactProfile);
    }

    /* renamed from: com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter$d */
    /* loaded from: classes3.dex */
    public static class C6964d extends AbstractC6965e {

        /* renamed from: I */
        public ModulesView f38110I;

        public C6964d(ModulesView modulesView) {
            super(modulesView);
            this.f38110I = modulesView;
        }

        @Override // com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter.AbstractC6965e, com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter.InterfaceC6961a
        /* renamed from: j */
        public void mo35713j(C6962b c6962b, int i11, boolean z11) {
            super.mo35713j(c6962b, i11, z11);
            ViewParent viewParent = this.f38110I;
            if (viewParent instanceof InterfaceC6961a) {
                ((InterfaceC6961a) viewParent).mo35713j(c6962b, i11, z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupSuggestInviteMemberAdapter$e */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC6965e extends RecyclerView.AbstractC1876c0 implements InterfaceC6961a {
        public AbstractC6965e(View view) {
            super(view);
        }

        /* renamed from: j */
        public void mo35713j(C6962b c6962b, int i11, boolean z11) {
        }
    }

    public GroupSuggestInviteMemberAdapter(Context context, ArrayList arrayList, C23528a c23528a, InterfaceC6963c interfaceC6963c) {
        this.f38098t = context;
        this.f38099u = c23528a;
        this.f38096r = new ArrayList(arrayList);
        this.f38100v = interfaceC6963c;
    }

    /* renamed from: L */
    public C6962b m35707L(int i11) {
        ArrayList arrayList = this.f38096r;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C6962b) this.f38096r.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void mo9990A(AbstractC6965e abstractC6965e, int i11) {
        abstractC6965e.mo35713j(m35707L(i11), i11, this.f38097s);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public AbstractC6965e mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 == 5) {
            return new C6964d(new HeaderModuleView(this.f38098t));
        }
        return new C6964d(new MemberRowModuleView(this.f38098t, this.f38099u));
    }

    /* renamed from: O */
    public void m35710O(ArrayList arrayList) {
        try {
            this.f38096r = new ArrayList(arrayList);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        ArrayList arrayList = this.f38096r;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C6962b) this.f38096r.get(i11)).m35716a();
    }
}

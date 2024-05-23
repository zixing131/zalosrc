package com.zing.zalo.p077ui.chat.widget.search;

import android.content.Context;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import bi0.AbstractC2807a;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.chat.widget.search.ChatFilterSearchAdapter;
import com.zing.zalo.uicontrol.C16640q2;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalocore.CoreUtility;
import en0.InterfaceC18494a;
import i70.C20380b;
import java.util.ArrayList;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22126c0;
import ld0.C22448a;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p348mi.C23302b;
import p354n3.C23528a;
import p379o3.C24003n;
import p716zh.C31870c7;
import pm0.C24848g0;

/* loaded from: classes5.dex */
public class ChatFilterSearchAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    C23528a f61331r;

    /* renamed from: s */
    private ArrayList f61332s = new ArrayList();

    /* renamed from: t */
    private String f61333t = "";

    /* renamed from: u */
    private InterfaceC11794f f61334u;

    /* loaded from: classes5.dex */
    public class ContactModulesView extends ModulesView implements InterfaceC11791c {

        /* renamed from: K */
        C16716d f61335K;

        /* renamed from: L */
        C21693c f61336L;

        /* renamed from: M */
        C3977j f61337M;

        /* renamed from: N */
        C22126c0 f61338N;

        /* renamed from: O */
        C22126c0 f61339O;

        /* renamed from: P */
        C21691a f61340P;

        public ContactModulesView(Context context) {
            super(context);
            m88987U(-1, -2);
            this.f61337M = new C3977j(context);
            C21693c c21693c = new C21693c(context);
            this.f61336L = c21693c;
            C16718f m89106L = c21693c.m89106L();
            int i11 = AbstractC23222t7.f112528I;
            m89106L.m89028L(i11, i11).m89032P(AbstractC23222t7.f112586t, AbstractC23222t7.f112566j, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
            C21691a c21691a = new C21691a(context);
            this.f61340P = c21691a;
            C16718f m89027K = c21691a.m89106L().m89017A(Boolean.TRUE).m89034R(AbstractC23222t7.f112558f).m89035S(AbstractC23222t7.f112586t).m89027K(true);
            int i12 = AbstractC23222t7.f112514B;
            m89027K.m89028L(i12, i12);
            this.f61340P.m111906k1(null);
            this.f61340P.m111905j1(AbstractC23136l9.m118665N(context, AbstractC16803z.icn_bottomsheet_selectsingle_check));
            this.f61340P.mo89093E0(false);
            C16716d c16716d = new C16716d(context);
            this.f61335K = c16716d;
            c16716d.m89106L().m89054h0(this.f61336L).m89049e0(this.f61340P).m89027K(true).m89029M(12).m89028L(-1, -2);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f61338N = c22126c0;
            c22126c0.m89106L().m89028L(-1, -2);
            this.f61338N.m111953A1(1);
            C22126c0 c22126c02 = this.f61338N;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c02.m111980v1(truncateAt);
            this.f61338N.mo111964L1(AbstractC23222t7.f112586t);
            this.f61338N.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            C22126c0 c22126c03 = new C22126c0(context);
            this.f61339O = c22126c03;
            c22126c03.m89106L().m89023G(this.f61338N).m89028L(-1, -2);
            this.f61339O.m111953A1(1);
            this.f61339O.m111980v1(truncateAt);
            this.f61339O.mo111964L1(AbstractC23222t7.f112582r);
            this.f61339O.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            this.f61339O.mo44614b1(8);
            this.f61335K.m89001g1(this.f61338N);
            this.f61335K.m89001g1(this.f61339O);
            mo69681L(this.f61336L);
            mo69681L(this.f61340P);
            mo69681L(this.f61335K);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public /* synthetic */ void m65599W(C11795g c11795g, C16719g c16719g) {
            if (ChatFilterSearchAdapter.this.f61334u != null) {
                ChatFilterSearchAdapter.this.f61334u.mo60449c(c11795g);
            }
        }

        @Override // com.zing.zalo.p077ui.chat.widget.search.ChatFilterSearchAdapter.InterfaceC11791c
        /* renamed from: e */
        public void mo65600e(final C11795g c11795g) {
            C31870c7 c31870c7;
            if (!(c11795g instanceof C11792d) || (c31870c7 = ((C11792d) c11795g).f61345b) == null) {
                return;
            }
            String str = c31870c7.f146371g;
            if (c31870c7.f146365a == 1) {
                this.f61336L.mo111926w1(AbstractC16803z.icn_csc_toolbar_mention_all);
            } else {
                String str2 = c31870c7.f146367c;
                C24003n m120143n = C23278z2.m120143n();
                if (TextUtils.isEmpty(str2)) {
                    this.f61336L.setTag(1090453505, c31870c7.f146366b);
                    this.f61336L.mo111925v1(m120143n.f116261b);
                } else if (C23302b.f113247a.m120523d(str2) && !CoreUtility.f89233i.equals(c31870c7.f146366b)) {
                    String m118087g = AbstractC23028c0.m118087g(str);
                    int m12307a = C2343e.m12307a(c31870c7.f146366b, false);
                    this.f61336L.setTag(1090453505, c31870c7.f146367c + c31870c7.f146366b);
                    this.f61336L.mo111925v1(C16640q2.m88404a().mo88412f(m118087g, m12307a));
                } else {
                    AbstractC23268y2.m120033g(ChatFilterSearchAdapter.this.f61331r, this.f61337M, this.f61336L, str2, m120143n, false);
                }
            }
            this.f61338N.m111959G1(str);
            if (TextUtils.equals(ChatFilterSearchAdapter.this.f61333t, c31870c7.f146366b)) {
                this.f61340P.mo89091D0(true);
                setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.stencils_filter_search_chat_selected_bg));
            } else {
                this.f61340P.mo89091D0(false);
                setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.stencils_contact_bg));
            }
            this.f61335K.mo89109M0(new C16719g.c() { // from class: r60.a
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ChatFilterSearchAdapter.ContactModulesView.this.m65599W(c11795g, c16719g);
                }
            });
        }
    }

    /* loaded from: classes5.dex */
    public class HideMembersLabelModuleView extends ModulesView implements InterfaceC11791c {

        /* renamed from: K */
        C22126c0 f61342K;

        public HideMembersLabelModuleView(Context context) {
            super(context);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f61342K = c22126c0;
            c22126c0.m89106L().m89028L(-1, -2).m89041Y(AbstractC23136l9.m118742r(8.0f));
            this.f61342K.mo111965M1(0);
            this.f61342K.m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
            this.f61342K.mo111964L1(AbstractC23222t7.f112576o);
            this.f61342K.m111961I1(Layout.Alignment.ALIGN_NORMAL);
            this.f61342K.m111955C1(new C22448a());
            mo69681L(this.f61342K);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: W */
        public C24848g0 m65602W() {
            if (ChatFilterSearchAdapter.this.f61334u != null) {
                ChatFilterSearchAdapter.this.f61334u.mo60448b();
            }
            return C24848g0.f119245a;
        }

        @Override // com.zing.zalo.p077ui.chat.widget.search.ChatFilterSearchAdapter.InterfaceC11791c
        /* renamed from: e */
        public void mo65600e(C11795g c11795g) {
            int i11;
            if (!(c11795g instanceof C11793e)) {
                return;
            }
            C11793e c11793e = (C11793e) c11795g;
            boolean m65604c = c11793e.m65604c();
            boolean m65603b = c11793e.m65603b();
            if (m65604c) {
                if (m65603b) {
                    this.f61342K.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_community_search_msg_hide_members_title_for_owner_admin));
                    return;
                } else {
                    this.f61342K.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_search_msg_hide_members_title_for_admins_v2));
                    return;
                }
            }
            if (m65603b) {
                i11 = AbstractC8020f0.str_community_search_msg_hide_members_title_for_other;
            } else {
                i11 = AbstractC8020f0.str_search_msg_hide_members_title_for_other_v2;
            }
            this.f61342K.m111959G1(C20380b.m106164c(getContext(), null, AbstractC23136l9.m118743r0(i11), "search_msg_by_sender", new InterfaceC18494a() { // from class: r60.b
                @Override // en0.InterfaceC18494a
                /* renamed from: V4 */
                public final Object mo12V4() {
                    C24848g0 m65602W;
                    m65602W = ChatFilterSearchAdapter.HideMembersLabelModuleView.this.m65602W();
                    return m65602W;
                }
            }));
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.search.ChatFilterSearchAdapter$a */
    /* loaded from: classes5.dex */
    public static class C11789a extends C11790b {

        /* renamed from: I */
        private final ModulesView f61344I;

        public C11789a(ModulesView modulesView) {
            super(modulesView);
            this.f61344I = modulesView;
        }

        @Override // com.zing.zalo.p077ui.chat.widget.search.ChatFilterSearchAdapter.C11790b, com.zing.zalo.p077ui.chat.widget.search.ChatFilterSearchAdapter.InterfaceC11791c
        /* renamed from: e */
        public void mo65600e(C11795g c11795g) {
            ViewParent viewParent = this.f61344I;
            if (viewParent instanceof InterfaceC11791c) {
                ((InterfaceC11791c) viewParent).mo65600e(c11795g);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.search.ChatFilterSearchAdapter$b */
    /* loaded from: classes5.dex */
    public static class C11790b extends RecyclerView.AbstractC1876c0 implements InterfaceC11791c {
        public C11790b(View view) {
            super(view);
        }

        /* renamed from: e */
        public void mo65600e(C11795g c11795g) {
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.search.ChatFilterSearchAdapter$c */
    /* loaded from: classes5.dex */
    private interface InterfaceC11791c {
        /* renamed from: e */
        void mo65600e(C11795g c11795g);
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.search.ChatFilterSearchAdapter$d */
    /* loaded from: classes5.dex */
    public static class C11792d extends C11795g {

        /* renamed from: b */
        public C31870c7 f61345b;

        public C11792d(C31870c7 c31870c7) {
            super(1);
            this.f61345b = c31870c7;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.search.ChatFilterSearchAdapter$e */
    /* loaded from: classes5.dex */
    public static class C11793e extends C11795g {

        /* renamed from: b */
        private final boolean f61346b;

        /* renamed from: c */
        private final boolean f61347c;

        public C11793e(boolean z11, boolean z12) {
            super(2);
            this.f61346b = z11;
            this.f61347c = z12;
        }

        /* renamed from: b */
        public boolean m65603b() {
            return this.f61347c;
        }

        /* renamed from: c */
        public boolean m65604c() {
            return this.f61346b;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.search.ChatFilterSearchAdapter$f */
    /* loaded from: classes5.dex */
    public interface InterfaceC11794f {
        /* renamed from: b */
        void mo60448b();

        /* renamed from: c */
        void mo60449c(C11795g c11795g);
    }

    /* renamed from: com.zing.zalo.ui.chat.widget.search.ChatFilterSearchAdapter$g */
    /* loaded from: classes5.dex */
    public static class C11795g {

        /* renamed from: a */
        int f61348a;

        protected C11795g(int i11) {
            this.f61348a = i11;
        }

        /* renamed from: a */
        public int m65605a() {
            return this.f61348a;
        }
    }

    public ChatFilterSearchAdapter(Context context) {
        this.f61331r = new C23528a(context);
    }

    /* renamed from: N */
    public C11795g m65592N(int i11) {
        ArrayList arrayList = this.f61332s;
        if (arrayList != null && i11 >= 0 && i11 < arrayList.size()) {
            return (C11795g) this.f61332s.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9990A(C11790b c11790b, int i11) {
        c11790b.mo65600e(m65592N(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public C11790b mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 == 1) {
            return new C11789a(new ContactModulesView(viewGroup.getContext()));
        }
        if (i11 == 2) {
            return new C11789a(new HideMembersLabelModuleView(viewGroup.getContext()));
        }
        return new C11790b(new View(viewGroup.getContext()));
    }

    /* renamed from: Q */
    public void m65595Q(ArrayList arrayList) {
        this.f61332s = arrayList;
    }

    /* renamed from: R */
    public void m65596R(InterfaceC11794f interfaceC11794f) {
        this.f61334u = interfaceC11794f;
    }

    /* renamed from: S */
    public void m65597S(String str) {
        this.f61333t = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f61332s.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C11795g m65592N = m65592N(i11);
        if (m65592N != null) {
            return m65592N.m65605a();
        }
        return super.mo10005m(i11);
    }
}

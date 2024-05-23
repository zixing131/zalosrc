package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.GroupFullNicknameAdapter;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseChatSettingItemModuleView;
import com.zing.zalo.p077ui.moduleview.chatinfo.BaseMemberItemModuleView;
import com.zing.zalo.p077ui.zviews.NicknameInGroupView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import java.util.ArrayList;
import me0.AbstractC23022b5;
import me0.AbstractC23028c0;
import me0.AbstractC23136l9;
import me0.AbstractC23184q2;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p716zh.C31973j5;

/* loaded from: classes3.dex */
public class GroupFullNicknameAdapter extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    public Context f38042r;

    /* renamed from: s */
    C23528a f38043s;

    /* renamed from: t */
    ArrayList f38044t;

    /* renamed from: u */
    C31973j5 f38045u;

    /* renamed from: v */
    NicknameInGroupView.InterfaceC14696f f38046v;

    /* renamed from: w */
    boolean f38047w = false;

    /* renamed from: x */
    String f38048x = AbstractC23136l9.m118743r0(AbstractC8020f0.str_set_nickname);

    /* loaded from: classes3.dex */
    public class MemberNicknameView extends BaseMemberItemModuleView implements InterfaceC6944b {
        public MemberNicknameView(Context context, C23528a c23528a) {
            super(context, c23528a);
            this.f64555R.mo44614b1(8);
            this.f64555R.mo89109M0(null);
            this.f64550M.mo44614b1(0);
            this.f64551N.mo44614b1(0);
        }

        /* renamed from: W */
        public /* synthetic */ void m35670W(C6945c c6945c, C16719g c16719g) {
            NicknameInGroupView.InterfaceC14696f interfaceC14696f = GroupFullNicknameAdapter.this.f38046v;
            if (interfaceC14696f != null) {
                interfaceC14696f.mo82345a(c6945c.f38051b);
            }
        }

        @Override // com.zing.zalo.adapters.GroupFullNicknameAdapter.InterfaceC6944b
        /* renamed from: l */
        public void mo35671l(C6945c c6945c, int i11, boolean z11) {
            ContactProfile contactProfile;
            if (c6945c == null) {
                return;
            }
            try {
                this.f64549L.mo44614b1(8);
                if (c6945c.f38050a != 0 || (contactProfile = c6945c.f38051b) == null) {
                    return;
                }
                this.f64550M.m115407x1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
                String m153705A = GroupFullNicknameAdapter.this.f38045u.m153705A(contactProfile.f42434r);
                if (TextUtils.isEmpty(m153705A)) {
                    this.f64550M.m115406w1(GroupFullNicknameAdapter.this.f38048x);
                    this.f64550M.m115408y1(0);
                } else {
                    this.f64550M.m115406w1(m153705A);
                    this.f64550M.m115408y1(1);
                }
                this.f64551N.m111959G1(AbstractC23028c0.m118085e(contactProfile, false, AbstractC8020f0.str_me));
                if (c6945c.f38052c) {
                    this.f64553P.mo44614b1(0);
                    this.f64553P.mo111926w1(AbstractC16803z.ic_grpadmin_masterkey);
                } else if (c6945c.f38053d) {
                    this.f64553P.mo44614b1(0);
                    this.f64553P.mo111926w1(AbstractC16803z.ic_grpadmin);
                } else {
                    this.f64553P.mo44614b1(4);
                }
                if (GroupFullNicknameAdapter.this.f38045u.m153766j0() && !GroupFullNicknameAdapter.this.f38045u.m153742T()) {
                    this.f64556S.mo44614b1(8);
                    this.f64556S.mo89109M0(null);
                    this.f64552O.m115439w1(C23278z2.m120143n());
                    this.f64552O.m115429C1(false, false);
                    this.f64552O.m115433q1(contactProfile);
                }
                this.f64556S.mo44614b1(0);
                this.f64556S.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.p1

                    /* renamed from: q */
                    public final /* synthetic */ GroupFullNicknameAdapter.C6945c f39250q;

                    public /* synthetic */ C7169p1(GroupFullNicknameAdapter.C6945c c6945c2) {
                        r2 = c6945c2;
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        GroupFullNicknameAdapter.MemberNicknameView.this.m35670W(r2, c16719g);
                    }
                });
                this.f64552O.m115439w1(C23278z2.m120143n());
                this.f64552O.m115429C1(false, false);
                this.f64552O.m115433q1(contactProfile);
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullNicknameAdapter$a */
    /* loaded from: classes3.dex */
    public static class C6943a extends RecyclerView.AbstractC1876c0 implements InterfaceC6944b {
        public C6943a(View view) {
            super(view);
        }

        @Override // com.zing.zalo.adapters.GroupFullNicknameAdapter.InterfaceC6944b
        /* renamed from: l */
        public void mo35671l(C6945c c6945c, int i11, boolean z11) {
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullNicknameAdapter$b */
    /* loaded from: classes3.dex */
    private interface InterfaceC6944b {
        /* renamed from: l */
        void mo35671l(C6945c c6945c, int i11, boolean z11);
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullNicknameAdapter$c */
    /* loaded from: classes3.dex */
    public static class C6945c {

        /* renamed from: a */
        public int f38050a;

        /* renamed from: b */
        public ContactProfile f38051b;

        /* renamed from: c */
        public boolean f38052c;

        /* renamed from: d */
        public boolean f38053d;

        public C6945c(int i11) {
            this.f38050a = i11;
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullNicknameAdapter$d */
    /* loaded from: classes3.dex */
    public static class C6946d extends C6943a {

        /* renamed from: I */
        LinearLayout f38054I;

        /* renamed from: J */
        LinearLayout f38055J;

        public C6946d(View view) {
            super(view);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterError);
            this.f38054I = linearLayout;
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
            this.f38055J = linearLayout2;
            linearLayout2.setVisibility(0);
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullNicknameAdapter$e */
    /* loaded from: classes3.dex */
    public static class C6947e extends C6943a {

        /* renamed from: I */
        public ModulesView f38056I;

        public C6947e(ModulesView modulesView) {
            super(modulesView);
            this.f38056I = modulesView;
        }

        @Override // com.zing.zalo.adapters.GroupFullNicknameAdapter.C6943a, com.zing.zalo.adapters.GroupFullNicknameAdapter.InterfaceC6944b
        /* renamed from: l */
        public void mo35671l(C6945c c6945c, int i11, boolean z11) {
            super.mo35671l(c6945c, i11, z11);
            ViewParent viewParent = this.f38056I;
            if (viewParent instanceof InterfaceC6944b) {
                ((InterfaceC6944b) viewParent).mo35671l(c6945c, i11, z11);
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullNicknameAdapter$f */
    /* loaded from: classes3.dex */
    public static class C6948f extends C6945c {

        /* renamed from: e */
        boolean f38057e;

        public C6948f(boolean z11) {
            super(2);
            this.f38057e = z11;
        }
    }

    /* renamed from: com.zing.zalo.adapters.GroupFullNicknameAdapter$g */
    /* loaded from: classes3.dex */
    public static class C6949g extends BaseChatSettingItemModuleView implements InterfaceC6944b {

        /* renamed from: V */
        C16716d f38058V;

        /* renamed from: W */
        boolean f38059W;

        public C6949g(Context context, boolean z11) {
            super(context);
            this.f64531N.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f64531N.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_set_nickname_permission));
            this.f64532O.mo44614b1(0);
            this.f64533P.mo44614b1(8);
            this.f64537T.mo44614b1(8);
            this.f64538U.mo44614b1(8);
            this.f64528K.mo44614b1(8);
            this.f64529L.mo44614b1(8);
            C16716d m118026d = AbstractC23022b5.m118026d(context);
            this.f38058V = m118026d;
            m118026d.m89106L().m89023G(this.f64530M);
            mo69681L(this.f38058V);
            this.f38059W = z11;
        }

        @Override // com.zing.zalo.adapters.GroupFullNicknameAdapter.InterfaceC6944b
        /* renamed from: l */
        public void mo35671l(C6945c c6945c, int i11, boolean z11) {
            this.f64532O.m111959G1(AbstractC23184q2.m119454l(((C6948f) c6945c).f38057e, this.f38059W));
        }
    }

    public GroupFullNicknameAdapter(Context context, ArrayList arrayList, C23528a c23528a, C31973j5 c31973j5) {
        this.f38042r = context;
        this.f38044t = new ArrayList(arrayList);
        this.f38043s = c23528a;
        this.f38045u = c31973j5;
    }

    /* renamed from: L */
    public C6945c m35663L(int i11) {
        if (i11 >= 0 && i11 < this.f38044t.size()) {
            return (C6945c) this.f38044t.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M */
    public void mo9990A(C6943a c6943a, int i11) {
        try {
            c6943a.mo35671l(m35663L(i11), i11, this.f38047w);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public C6943a mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 != 0) {
            boolean z11 = false;
            if (i11 != 1) {
                if (i11 != 2) {
                    return new C6943a(new View(this.f38042r));
                }
                C31973j5 c31973j5 = this.f38045u;
                if (c31973j5 != null && c31973j5.m153747Y()) {
                    z11 = true;
                }
                return new C6947e(new C6949g(this.f38042r, z11));
            }
            return new C6946d(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.group_rada_footer, viewGroup, false));
        }
        return new C6947e(new MemberNicknameView(this.f38042r, this.f38043s));
    }

    /* renamed from: O */
    public void m35666O(ArrayList arrayList) {
        try {
            this.f38044t = new ArrayList(arrayList);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: P */
    public void m35667P(NicknameInGroupView.InterfaceC14696f interfaceC14696f) {
        this.f38046v = interfaceC14696f;
    }

    /* renamed from: Q */
    public void m35668Q(boolean z11) {
        this.f38047w = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38044t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return m35663L(i11).f38050a;
    }
}

package com.zing.zalo.adapters;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7191r1;
import com.zing.zalo.control.group.GroupInvitationInfo;
import com.zing.zalo.p077ui.group.invitation.box.GroupInvitationItemView;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uidrawing.C16719g;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import i70.C20379a;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23306f;
import p656xs.AbstractC30200a;
import pm0.C24848g0;

/* renamed from: com.zing.zalo.adapters.r1 */
/* loaded from: classes3.dex */
public final class C7191r1 extends RecyclerView.AbstractC1880g {
    public static final a Companion = new a(null);

    /* renamed from: r */
    private final int f39401r;

    /* renamed from: s */
    private final int f39402s;

    /* renamed from: t */
    private final List f39403t;

    /* renamed from: u */
    private final Context f39404u;

    /* renamed from: v */
    private b f39405v;

    /* renamed from: w */
    private final LayoutInflater f39406w;

    /* renamed from: x */
    private boolean f39407x;

    /* renamed from: com.zing.zalo.adapters.r1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.adapters.r1$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo36587a();

        /* renamed from: b */
        void mo36588b(GroupInvitationInfo groupInvitationInfo);

        /* renamed from: c */
        void mo36589c();

        /* renamed from: d */
        void mo36590d(GroupInvitationInfo groupInvitationInfo);
    }

    /* renamed from: com.zing.zalo.adapters.r1$c */
    /* loaded from: classes3.dex */
    public final class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private GroupInvitationItemView f39408I;

        /* renamed from: J */
        private RobotoTextView f39409J;

        /* renamed from: K */
        private RobotoTextView f39410K;

        /* renamed from: L */
        private RobotoButton f39411L;

        /* renamed from: M */
        final /* synthetic */ C7191r1 f39412M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7191r1 c7191r1, View view, int i11) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f39412M = c7191r1;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            this.f39411L = (RobotoButton) view.findViewById(AbstractC6918a0.btn_refresh);
                            return;
                        }
                        return;
                    }
                    this.f39410K = (RobotoTextView) view.findViewById(AbstractC6918a0.tvEmpty);
                    return;
                }
                this.f39408I = view instanceof GroupInvitationItemView ? (GroupInvitationItemView) view : null;
                return;
            }
            this.f39409J = view instanceof RobotoTextView ? (RobotoTextView) view : null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public static final void m36594m0(C7191r1 c7191r1, GroupInvitationInfo groupInvitationInfo, View view) {
            AbstractC19074t.m100208f(c7191r1, "this$0");
            AbstractC19074t.m100208f(groupInvitationInfo, "$invitation");
            b bVar = c7191r1.f39405v;
            if (bVar != null) {
                bVar.mo36588b(groupInvitationInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public static final void m36595n0(C7191r1 c7191r1, GroupInvitationInfo groupInvitationInfo, C16719g c16719g) {
            AbstractC19074t.m100208f(c7191r1, "this$0");
            AbstractC19074t.m100208f(groupInvitationInfo, "$invitation");
            b bVar = c7191r1.f39405v;
            if (bVar != null) {
                bVar.mo36590d(groupInvitationInfo);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o0 */
        public static final void m36596o0(C7191r1 c7191r1, View view) {
            AbstractC19074t.m100208f(c7191r1, "this$0");
            b bVar = c7191r1.f39405v;
            if (bVar != null) {
                bVar.mo36587a();
            }
        }

        /* renamed from: l0 */
        public final void m36597l0(int i11) {
            try {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 == 4) {
                            RobotoButton robotoButton = this.f39411L;
                            if (robotoButton != null) {
                                final C7191r1 c7191r1 = this.f39412M;
                                robotoButton.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.u1
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view) {
                                        C7191r1.c.m36596o0(C7191r1.this, view);
                                    }
                                });
                            }
                        }
                    } else {
                        RobotoTextView robotoTextView = this.f39410K;
                        if (robotoTextView != null) {
                            robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_invitation_list_empty_title));
                        }
                    }
                } else {
                    GroupInvitationItemView groupInvitationItemView = this.f39408I;
                    if (groupInvitationItemView != null) {
                        final C7191r1 c7191r12 = this.f39412M;
                        final GroupInvitationInfo groupInvitationInfo = (GroupInvitationInfo) c7191r12.f39403t.get(m9929A());
                        groupInvitationItemView.m66162W(groupInvitationInfo);
                        groupInvitationItemView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.s1
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C7191r1.c.m36594m0(C7191r1.this, groupInvitationInfo, view);
                            }
                        });
                        groupInvitationItemView.getMenuModule().mo89109M0(new C16719g.c() { // from class: com.zing.zalo.adapters.t1
                            @Override // com.zing.zalo.uidrawing.C16719g.c
                            /* renamed from: y */
                            public final void mo929y(C16719g c16719g) {
                                C7191r1.c.m36595n0(C7191r1.this, groupInvitationInfo, c16719g);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.r1$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {
        d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m36598a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m36598a() {
            b bVar = C7191r1.this.f39405v;
            if (bVar != null) {
                bVar.mo36589c();
            }
        }
    }

    public C7191r1(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f39401r = AbstractC23136l9.m118742r(14.0f);
        this.f39402s = AbstractC23136l9.m118742r(16.0f);
        this.f39403t = new ArrayList();
        this.f39404u = context;
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f39406w = (LayoutInflater) systemService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m36581R(C7191r1 c7191r1, List list, boolean z11) {
        AbstractC19074t.m100208f(c7191r1, "this$0");
        c7191r1.f39407x = false;
        c7191r1.f39403t.clear();
        if (list != null) {
            if (z11) {
                GroupInvitationInfo groupInvitationInfo = new GroupInvitationInfo();
                groupInvitationInfo.m40882D(0);
                c7191r1.f39403t.add(0, groupInvitationInfo);
            }
            if (list.isEmpty()) {
                GroupInvitationInfo groupInvitationInfo2 = new GroupInvitationInfo();
                groupInvitationInfo2.m40882D(2);
                c7191r1.f39403t.add(groupInvitationInfo2);
            } else {
                c7191r1.f39403t.addAll(list);
            }
        }
        c7191r1.m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9990A(c cVar, int i11) {
        AbstractC19074t.m100208f(cVar, "holder");
        cVar.m36597l0(mo10005m(i11));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        View view;
        AbstractC19074t.m100208f(viewGroup, "parent");
        try {
            viewGroup.setBackgroundColor(C23212s8.m119607o(this.f39404u, AbstractC16781w.SecondaryBackgroundColor));
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            View robotoTextView = new RobotoTextView(this.f39404u);
                            robotoTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                            view = robotoTextView;
                        } else {
                            viewGroup.setBackgroundColor(C23212s8.m119607o(this.f39404u, AbstractC16781w.PrimaryBackgroundColor));
                            View inflate = this.f39406w.inflate(AbstractC7409c0.layout_error_state, viewGroup, false);
                            AbstractC19074t.m100207e(inflate, "inflate(...)");
                            inflate.getLayoutParams().height = -2;
                            view = inflate;
                        }
                    } else {
                        viewGroup.setBackgroundColor(C23212s8.m119607o(this.f39404u, AbstractC16781w.PrimaryBackgroundColor));
                        View inflate2 = this.f39406w.inflate(AbstractC7409c0.layout_empty_state, viewGroup, false);
                        AbstractC19074t.m100207e(inflate2, "inflate(...)");
                        inflate2.getLayoutParams().height = -2;
                        view = inflate2;
                    }
                } else {
                    view = new GroupInvitationItemView(this.f39404u);
                }
            } else {
                RobotoTextView robotoTextView2 = new RobotoTextView(this.f39404u);
                robotoTextView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                robotoTextView2.setTextSize(1, 14.0f);
                robotoTextView2.setTextColor(C23212s8.m119607o(this.f39404u, AbstractC21196a.TextColor2));
                int i12 = this.f39402s;
                int i13 = this.f39401r;
                robotoTextView2.setPadding(i12, i13, i12, i13);
                robotoTextView2.setBackgroundColor(C23212s8.m119607o(this.f39404u, AbstractC16781w.SecondaryBackgroundColor));
                if (AbstractC30200a.m148947f()) {
                    Context context = this.f39404u;
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_invitation_instruction_v2);
                    AbstractC19074t.m100207e(m118743r0, "getString(...)");
                    robotoTextView2.setText(C20379a.m106158b(context, null, m118743r0, new d(), AbstractC23306f.m120583H().m110204g().m116321m(), null, "invitation_box_info"));
                    robotoTextView2.setMovementMethod(LinkMovementMethod.getInstance());
                    view = robotoTextView2;
                } else {
                    robotoTextView2.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_group_invitation_instruction));
                    view = robotoTextView2;
                }
            }
            return new c(this, view, i11);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return new c(this, new View(this.f39404u), i11);
        }
    }

    /* renamed from: Q */
    public final void m36584Q(final List list, final boolean z11) {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.adapters.q1
            @Override // java.lang.Runnable
            public final void run() {
                C7191r1.m36581R(C7191r1.this, list, z11);
            }
        });
    }

    /* renamed from: S */
    public final void m36585S(b bVar) {
        this.f39405v = bVar;
    }

    /* renamed from: T */
    public final void m36586T() {
        if (!this.f39407x) {
            this.f39407x = true;
            this.f39403t.clear();
            GroupInvitationInfo groupInvitationInfo = new GroupInvitationInfo();
            groupInvitationInfo.m40882D(3);
            this.f39403t.add(groupInvitationInfo);
            m10008p();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39403t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        int m40896n = ((GroupInvitationInfo) this.f39403t.get(i11)).m40896n();
        if (m40896n == 0) {
            return 1;
        }
        if (m40896n != 1) {
            if (m40896n == 2) {
                return 3;
            }
            if (m40896n != 3) {
                return 0;
            }
            return 4;
        }
        return 2;
    }
}

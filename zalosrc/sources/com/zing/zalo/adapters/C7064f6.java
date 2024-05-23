package com.zing.zalo.adapters;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import au.C2343e;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7064f6;
import com.zing.zalo.p077ui.widget.AvatarImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.uicontrol.C16640q2;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p142ey.C18644n;
import p304ks.C21933s;
import p348mi.C23302b;
import p354n3.C23528a;
import p716zh.C31874cb;
import r30.AbstractC25636f;
import r30.C25641k;
import w60.C28786i;

/* renamed from: com.zing.zalo.adapters.f6 */
/* loaded from: classes3.dex */
public class C7064f6 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    public boolean f38610r = false;

    /* renamed from: s */
    List f38611s;

    /* renamed from: t */
    C23528a f38612t;

    /* renamed from: u */
    C28786i.a f38613u;

    /* renamed from: com.zing.zalo.adapters.f6$a */
    /* loaded from: classes3.dex */
    public class a extends b {

        /* renamed from: I */
        AvatarImageView f38614I;

        /* renamed from: J */
        RobotoTextView f38615J;

        /* renamed from: K */
        RobotoTextView f38616K;

        /* renamed from: L */
        View f38617L;

        /* renamed from: M */
        RobotoTextView f38618M;

        /* renamed from: N */
        View f38619N;

        /* renamed from: O */
        View f38620O;

        /* renamed from: P */
        int f38621P;

        public a(View view, int i11) {
            super(view);
            this.f38621P = i11;
            if (i11 == 0) {
                this.f38614I = (AvatarImageView) view.findViewById(AbstractC6918a0.img_avt);
                this.f38615J = (RobotoTextView) view.findViewById(AbstractC6918a0.name);
                this.f38616K = (RobotoTextView) view.findViewById(AbstractC6918a0.des);
                this.f38617L = view.findViewById(AbstractC6918a0.numnotification_layoutfriendsuggest);
                this.f38618M = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_accept_friend_request);
                this.f38619N = view.findViewById(AbstractC6918a0.btn_remove);
                this.f38620O = view.findViewById(AbstractC6918a0.tvDecline);
            }
        }

        /* renamed from: o0 */
        public /* synthetic */ void m36077o0(C31874cb c31874cb, View view) {
            C28786i.a aVar = C7064f6.this.f38613u;
            if (aVar != null) {
                aVar.mo87067b(c31874cb, false, C21933s.m114404I().m114486q0(c31874cb.f146385a));
            }
        }

        /* renamed from: p0 */
        public /* synthetic */ void m36078p0(C31874cb c31874cb, View view) {
            C28786i.a aVar = C7064f6.this.f38613u;
            if (aVar != null) {
                aVar.mo87066a(c31874cb, false, C21933s.m114404I().m114486q0(c31874cb.f146385a));
            }
        }

        /* renamed from: q0 */
        public /* synthetic */ void m36079q0(C31874cb c31874cb, View view) {
            C28786i.a aVar = C7064f6.this.f38613u;
            if (aVar != null) {
                aVar.mo87069d(c31874cb, false, C21933s.m114404I().m114486q0(c31874cb.f146385a));
            }
        }

        /* renamed from: r0 */
        public /* synthetic */ void m36080r0(C31874cb c31874cb, View view) {
            C28786i.a aVar = C7064f6.this.f38613u;
            if (aVar != null) {
                aVar.mo87072g(c31874cb, false, C21933s.m114404I().m114486q0(c31874cb.f146385a));
            }
        }

        /* renamed from: s0 */
        public /* synthetic */ void m36081s0(View view) {
            C28786i.a aVar = C7064f6.this.f38613u;
            if (aVar != null) {
                aVar.mo87071f();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0089 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0017, B:9:0x0022, B:10:0x0060, B:13:0x0074, B:15:0x0089, B:16:0x0096, B:18:0x00a3, B:20:0x00af, B:22:0x00c3, B:23:0x00c6, B:24:0x0122, B:26:0x0135, B:27:0x0164, B:30:0x0142, B:32:0x014b, B:33:0x0158, B:34:0x00dc, B:36:0x00e4, B:38:0x00f2, B:39:0x00f5, B:40:0x00fc, B:42:0x0115, B:43:0x0118, B:44:0x008c, B:46:0x003b, B:48:0x0176), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0135 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0017, B:9:0x0022, B:10:0x0060, B:13:0x0074, B:15:0x0089, B:16:0x0096, B:18:0x00a3, B:20:0x00af, B:22:0x00c3, B:23:0x00c6, B:24:0x0122, B:26:0x0135, B:27:0x0164, B:30:0x0142, B:32:0x014b, B:33:0x0158, B:34:0x00dc, B:36:0x00e4, B:38:0x00f2, B:39:0x00f5, B:40:0x00fc, B:42:0x0115, B:43:0x0118, B:44:0x008c, B:46:0x003b, B:48:0x0176), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0142 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0017, B:9:0x0022, B:10:0x0060, B:13:0x0074, B:15:0x0089, B:16:0x0096, B:18:0x00a3, B:20:0x00af, B:22:0x00c3, B:23:0x00c6, B:24:0x0122, B:26:0x0135, B:27:0x0164, B:30:0x0142, B:32:0x014b, B:33:0x0158, B:34:0x00dc, B:36:0x00e4, B:38:0x00f2, B:39:0x00f5, B:40:0x00fc, B:42:0x0115, B:43:0x0118, B:44:0x008c, B:46:0x003b, B:48:0x0176), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00e4 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0017, B:9:0x0022, B:10:0x0060, B:13:0x0074, B:15:0x0089, B:16:0x0096, B:18:0x00a3, B:20:0x00af, B:22:0x00c3, B:23:0x00c6, B:24:0x0122, B:26:0x0135, B:27:0x0164, B:30:0x0142, B:32:0x014b, B:33:0x0158, B:34:0x00dc, B:36:0x00e4, B:38:0x00f2, B:39:0x00f5, B:40:0x00fc, B:42:0x0115, B:43:0x0118, B:44:0x008c, B:46:0x003b, B:48:0x0176), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00fc A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0017, B:9:0x0022, B:10:0x0060, B:13:0x0074, B:15:0x0089, B:16:0x0096, B:18:0x00a3, B:20:0x00af, B:22:0x00c3, B:23:0x00c6, B:24:0x0122, B:26:0x0135, B:27:0x0164, B:30:0x0142, B:32:0x014b, B:33:0x0158, B:34:0x00dc, B:36:0x00e4, B:38:0x00f2, B:39:0x00f5, B:40:0x00fc, B:42:0x0115, B:43:0x0118, B:44:0x008c, B:46:0x003b, B:48:0x0176), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x008c A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0017, B:9:0x0022, B:10:0x0060, B:13:0x0074, B:15:0x0089, B:16:0x0096, B:18:0x00a3, B:20:0x00af, B:22:0x00c3, B:23:0x00c6, B:24:0x0122, B:26:0x0135, B:27:0x0164, B:30:0x0142, B:32:0x014b, B:33:0x0158, B:34:0x00dc, B:36:0x00e4, B:38:0x00f2, B:39:0x00f5, B:40:0x00fc, B:42:0x0115, B:43:0x0118, B:44:0x008c, B:46:0x003b, B:48:0x0176), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0072  */
        @Override // com.zing.zalo.adapters.C7064f6.b
        /* renamed from: i0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo36082i0(C31874cb c31874cb, int i11) {
            int i12;
            String m118339r;
            try {
                int i13 = this.f38621P;
                if (i13 == 0) {
                    this.f38615J.setText(c31874cb.m153180d(true, false));
                    if (!TextUtils.isEmpty(c31874cb.f146393i) && !C23302b.f113247a.m120523d(c31874cb.f146393i)) {
                        ((C23528a) C7064f6.this.f38612t.m123612r(this.f38614I)).m123618x(c31874cb.f146393i, C23278z2.m120143n());
                        View view = this.f38617L;
                        if (!C21933s.m114404I().m114486q0(c31874cb.f146385a)) {
                            i12 = 0;
                        } else {
                            i12 = 8;
                        }
                        view.setVisibility(i12);
                        this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.a6

                            /* renamed from: q */
                            public final /* synthetic */ C31874cb f38329q;

                            public /* synthetic */ ViewOnClickListenerC7006a6(C31874cb c31874cb2) {
                                r2 = c31874cb2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                C7064f6.a.this.m36077o0(r2, view2);
                            }
                        });
                        if (TextUtils.isEmpty(c31874cb2.f146397m)) {
                            m118339r = c31874cb2.f146397m;
                        } else {
                            m118339r = AbstractC23059e9.m118339r(c31874cb2.f146399o, c31874cb2.f146389e, c31874cb2.f146394j);
                        }
                        if (C25641k.m132506o().m132527w(c31874cb2.f146385a) && C18644n.m98531l().m98558u(c31874cb2.f146385a)) {
                            this.f38618M.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_suggest_friend_send_msg));
                            this.f38619N.setVisibility(4);
                            View view2 = this.f38620O;
                            if (view2 != null) {
                                view2.setVisibility(8);
                            }
                            this.f38618M.setVisibility(0);
                            m118339r = AbstractC23136l9.m118743r0(AbstractC8020f0.str_accept_friend_done);
                            this.f38618M.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.b6

                                /* renamed from: q */
                                public final /* synthetic */ C31874cb f38369q;

                                public /* synthetic */ ViewOnClickListenerC7018b6(C31874cb c31874cb2) {
                                    r2 = c31874cb2;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view3) {
                                    C7064f6.a.this.m36078p0(r2, view3);
                                }
                            });
                        } else if (!AbstractC25636f.m132484n(c31874cb2.f146385a)) {
                            this.f38618M.setVisibility(4);
                            this.f38619N.setVisibility(4);
                            View view3 = this.f38620O;
                            if (view3 != null) {
                                view3.setVisibility(0);
                            }
                            this.f7784p.setOnClickListener(null);
                        } else {
                            this.f38618M.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_accept_friend_request));
                            this.f38618M.setVisibility(0);
                            this.f38619N.setVisibility(0);
                            View view4 = this.f38620O;
                            if (view4 != null) {
                                view4.setVisibility(8);
                            }
                            this.f38618M.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.c6

                                /* renamed from: q */
                                public final /* synthetic */ C31874cb f38429q;

                                public /* synthetic */ ViewOnClickListenerC7030c6(C31874cb c31874cb2) {
                                    r2 = c31874cb2;
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view5) {
                                    C7064f6.a.this.m36079q0(r2, view5);
                                }
                            });
                        }
                        this.f38616K.setText(m118339r);
                        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) this.f7784p.getLayoutParams();
                        if (i11 != 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = AbstractC23136l9.m118742r(16.0f);
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = AbstractC23136l9.m118742r(6.0f);
                        } else if (i11 == C7064f6.this.mo10003k() - 1) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = AbstractC23136l9.m118742r(6.0f);
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = AbstractC23136l9.m118742r(16.0f);
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = AbstractC23136l9.m118742r(6.0f);
                            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = AbstractC23136l9.m118742r(6.0f);
                        }
                        this.f7784p.setLayoutParams(layoutParams);
                        this.f38619N.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.d6

                            /* renamed from: q */
                            public final /* synthetic */ C31874cb f38488q;

                            public /* synthetic */ ViewOnClickListenerC7042d6(C31874cb c31874cb2) {
                                r2 = c31874cb2;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view5) {
                                C7064f6.a.this.m36080r0(r2, view5);
                            }
                        });
                        return;
                    }
                    int m12307a = C2343e.m12307a(c31874cb2.f146385a, false);
                    ((C23528a) C7064f6.this.f38612t.m123612r(this.f38614I)).m123615u(C16640q2.m88404a().mo88412f(AbstractC23028c0.m118087g(c31874cb2.m153180d(true, false)), m12307a));
                    View view5 = this.f38617L;
                    if (!C21933s.m114404I().m114486q0(c31874cb2.f146385a)) {
                    }
                    view5.setVisibility(i12);
                    this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.a6

                        /* renamed from: q */
                        public final /* synthetic */ C31874cb f38329q;

                        public /* synthetic */ ViewOnClickListenerC7006a6(C31874cb c31874cb2) {
                            r2 = c31874cb2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view22) {
                            C7064f6.a.this.m36077o0(r2, view22);
                        }
                    });
                    if (TextUtils.isEmpty(c31874cb2.f146397m)) {
                    }
                    if (C25641k.m132506o().m132527w(c31874cb2.f146385a)) {
                    }
                    if (!AbstractC25636f.m132484n(c31874cb2.f146385a)) {
                    }
                    this.f38616K.setText(m118339r);
                    RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) this.f7784p.getLayoutParams();
                    if (i11 != 0) {
                    }
                    this.f7784p.setLayoutParams(layoutParams2);
                    this.f38619N.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.d6

                        /* renamed from: q */
                        public final /* synthetic */ C31874cb f38488q;

                        public /* synthetic */ ViewOnClickListenerC7042d6(C31874cb c31874cb2) {
                            r2 = c31874cb2;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view52) {
                            C7064f6.a.this.m36080r0(r2, view52);
                        }
                    });
                    return;
                }
                if (i13 == 1) {
                    this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.e6
                        public /* synthetic */ ViewOnClickListenerC7053e6() {
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            C7064f6.a.this.m36081s0(view6);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.f6$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {
        public b(View view) {
            super(view);
        }

        /* renamed from: i0 */
        public abstract void mo36082i0(C31874cb c31874cb, int i11);
    }

    public C7064f6(C23528a c23528a, C28786i.a aVar) {
        this.f38612t = c23528a;
        this.f38613u = aVar;
    }

    /* renamed from: L */
    public C31874cb m36068L(int i11) {
        List list = this.f38611s;
        if (list != null && list.size() > i11) {
            return (C31874cb) this.f38611s.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M */
    public void mo9990A(b bVar, int i11) {
        bVar.mo36082i0((C31874cb) this.f38611s.get(i11), i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        if (ZaloListView.m86975fN()) {
            if (i11 == 1) {
                return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_see_all_request_friend, viewGroup, false), i11);
            }
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_request_friend_tab_contact_new, viewGroup, false), i11);
        }
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_request_friend_tab_contact, viewGroup, false), i11);
    }

    /* renamed from: O */
    public void m36071O(List list) {
        if (ZaloListView.m86975fN() && list.size() > 3) {
            this.f38611s = new ArrayList();
            for (int i11 = 0; i11 < 3; i11++) {
                this.f38611s.add((C31874cb) list.get(i11));
            }
            C31874cb c31874cb = new C31874cb();
            c31874cb.f146385a = "-1";
            this.f38611s.add(c31874cb);
            return;
        }
        this.f38611s = new ArrayList(list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f38611s;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        C31874cb m36068L = m36068L(i11);
        if (m36068L != null && "-1".equals(m36068L.f146385a)) {
            return 1;
        }
        return 0;
    }
}

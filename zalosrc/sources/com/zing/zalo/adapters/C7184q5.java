package com.zing.zalo.adapters;

import android.content.Context;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7184q5;
import com.zing.zalo.adapters.C7192r2;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.NoPredictiveItemAnimLinearLayoutMngr;
import com.zing.zalo.zview.AbstractC17466e;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import me0.AbstractC23028c0;
import me0.AbstractC23059e9;
import me0.AbstractC23063f2;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.C23278z2;
import on0.AbstractC24341v;
import p142ey.C18644n;
import p304ks.C21927m;
import p304ks.C21933s;
import p348mi.C23302b;
import p489rn.C25927x0;
import p716zh.C31859bb;
import p716zh.C31874cb;

/* renamed from: com.zing.zalo.adapters.q5 */
/* loaded from: classes3.dex */
public final class C7184q5 extends RecyclerView.AbstractC1880g implements C7192r2.b {

    /* renamed from: L */
    private static final int f39347L = 0;

    /* renamed from: r */
    private ArrayList f39350r;

    /* renamed from: s */
    private Context f39351s;

    /* renamed from: t */
    private LayoutInflater f39352t;

    /* renamed from: u */
    private e f39353u;

    /* renamed from: v */
    private boolean f39354v;

    /* renamed from: w */
    private int f39355w;

    /* renamed from: x */
    private c f39356x;

    /* renamed from: y */
    private HashMap f39357y;
    public static final a Companion = new a(null);

    /* renamed from: z */
    private static final int f39349z = 1;

    /* renamed from: A */
    private static final int f39336A = 2;

    /* renamed from: B */
    private static final int f39337B = 3;

    /* renamed from: C */
    private static final int f39338C = 4;

    /* renamed from: D */
    private static final int f39339D = 5;

    /* renamed from: E */
    private static final int f39340E = 6;

    /* renamed from: F */
    private static final int f39341F = 7;

    /* renamed from: G */
    private static final int f39342G = 8;

    /* renamed from: H */
    private static final int f39343H = 9;

    /* renamed from: I */
    private static final int f39344I = 10;

    /* renamed from: J */
    private static final int f39345J = 11;

    /* renamed from: K */
    private static final int f39346K = 12;

    /* renamed from: M */
    private static final int f39348M = 3;

    /* renamed from: com.zing.zalo.adapters.q5$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.adapters.q5$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: i0 */
        public abstract void mo36542i0(C31859bb c31859bb, int i11);
    }

    /* renamed from: com.zing.zalo.adapters.q5$c */
    /* loaded from: classes3.dex */
    public final class c extends b {

        /* renamed from: I */
        private TextView f39358I;

        /* renamed from: J */
        private TextView f39359J;

        /* renamed from: K */
        private LinearLayout f39360K;

        /* renamed from: L */
        private LinearLayout f39361L;

        /* renamed from: M */
        private boolean f39362M;

        /* renamed from: N */
        private GroupAvatarView[] f39363N;

        /* renamed from: O */
        private TextView f39364O;

        /* renamed from: P */
        private View f39365P;

        /* renamed from: Q */
        final /* synthetic */ C7184q5 f39366Q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7184q5 c7184q5, View view, int i11, Context context) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f39366Q = c7184q5;
            this.f39363N = new GroupAvatarView[C7184q5.f39348M];
            m36552s0(view, i11, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public static final void m36547n0(C7184q5 c7184q5, C31874cb c31874cb, int i11, View view) {
            AbstractC19074t.m100208f(c7184q5, "this$0");
            e m36526Y = c7184q5.m36526Y();
            if (m36526Y != null) {
                AbstractC19074t.m100205c(c31874cb);
                m36526Y.mo36559ew(c31874cb, i11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o0 */
        public static final void m36548o0(C31859bb c31859bb, C7184q5 c7184q5, View view) {
            e m36526Y;
            AbstractC19074t.m100208f(c7184q5, "this$0");
            if (c31859bb.f146290a == 2 && c7184q5.m36526Y() != null && (m36526Y = c7184q5.m36526Y()) != null) {
                m36526Y.mo36564u1();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p0 */
        public static final void m36549p0(C7184q5 c7184q5, View view) {
            e m36526Y;
            AbstractC19074t.m100208f(c7184q5, "this$0");
            if (c7184q5.m36526Y() != null && (m36526Y = c7184q5.m36526Y()) != null) {
                m36526Y.mo36563t3();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q0 */
        public static final void m36550q0(C7184q5 c7184q5, View view) {
            e m36526Y;
            AbstractC19074t.m100208f(c7184q5, "this$0");
            if (c7184q5.m36526Y() != null && (m36526Y = c7184q5.m36526Y()) != null) {
                m36526Y.mo36557B1();
            }
        }

        @Override // com.zing.zalo.adapters.C7184q5.b
        /* renamed from: i0 */
        public void mo36542i0(final C31859bb c31859bb, final int i11) {
            int i12;
            String m118743r0;
            if (c31859bb != null) {
                try {
                    final C31874cb m153145a = c31859bb.m153145a();
                    int mo10005m = this.f39366Q.mo10005m(i11);
                    String str = null;
                    if (mo10005m == C7184q5.f39337B) {
                        this.f39362M = false;
                        TextView textView = this.f39358I;
                        if (textView != null) {
                            if (m153145a != null) {
                                str = m153145a.f146387c;
                            }
                            textView.setText(str);
                        }
                        View view = this.f7784p;
                        final C7184q5 c7184q5 = this.f39366Q;
                        view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.r5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                C7184q5.c.m36547n0(C7184q5.this, m153145a, i11, view2);
                            }
                        });
                        return;
                    }
                    if (mo10005m == C7184q5.f39338C) {
                        View view2 = this.f7784p;
                        final C7184q5 c7184q52 = this.f39366Q;
                        view2.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.s5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                C7184q5.c.m36548o0(C31859bb.this, c7184q52, view3);
                            }
                        });
                        return;
                    }
                    if (mo10005m == C7184q5.f39340E) {
                        if (c31859bb.f146290a == 4) {
                            C31874cb c31874cb = c31859bb.f146291b;
                            if (c31874cb != null && !TextUtils.isEmpty(c31874cb.f146387c)) {
                                m118743r0 = c31859bb.f146291b.f146387c;
                            } else {
                                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.suggestfriend_title);
                            }
                            AbstractC19074t.m100205c(m118743r0);
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_request_friend);
                            AbstractC19074t.m100205c(m118743r0);
                        }
                        TextView textView2 = this.f39359J;
                        AbstractC19074t.m100205c(textView2);
                        textView2.setText(m118743r0);
                        return;
                    }
                    if (mo10005m == C7184q5.f39341F) {
                        LinearLayout linearLayout = this.f39360K;
                        AbstractC19074t.m100205c(linearLayout);
                        linearLayout.setVisibility(0);
                        LinearLayout linearLayout2 = this.f39361L;
                        AbstractC19074t.m100205c(linearLayout2);
                        linearLayout2.setVisibility(8);
                        return;
                    }
                    if (mo10005m == C7184q5.f39342G) {
                        LinearLayout linearLayout3 = this.f39361L;
                        AbstractC19074t.m100205c(linearLayout3);
                        linearLayout3.setVisibility(0);
                        LinearLayout linearLayout4 = this.f39360K;
                        AbstractC19074t.m100205c(linearLayout4);
                        linearLayout4.setVisibility(8);
                        LinearLayout linearLayout5 = this.f39361L;
                        AbstractC19074t.m100205c(linearLayout5);
                        final C7184q5 c7184q53 = this.f39366Q;
                        linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.t5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                C7184q5.c.m36549p0(C7184q5.this, view3);
                            }
                        });
                        return;
                    }
                    if (mo10005m == C7184q5.f39343H) {
                        View view3 = this.f7784p;
                        final C7184q5 c7184q54 = this.f39366Q;
                        view3.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.u5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                C7184q5.c.m36550q0(C7184q5.this, view4);
                            }
                        });
                        return;
                    }
                    if (mo10005m == C7184q5.f39344I) {
                        ViewGroup.LayoutParams layoutParams = this.f7784p.getLayoutParams();
                        if (layoutParams != null) {
                            if (this.f39366Q.mo10003k() > 1) {
                                i12 = -2;
                            } else {
                                i12 = -1;
                            }
                            layoutParams.height = i12;
                        }
                        this.f7784p.setLayoutParams(layoutParams);
                        return;
                    }
                    if (mo10005m == C7184q5.f39346K) {
                        TextView textView3 = this.f39364O;
                        if (textView3 != null) {
                            if (m153145a != null) {
                                str = m153145a.f146387c;
                            }
                            textView3.setText(str);
                        }
                        View view4 = this.f39365P;
                        if (view4 != null) {
                            view4.setVisibility(8);
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: r0 */
        public final View m36551r0() {
            return this.f39365P;
        }

        /* renamed from: s0 */
        public void m36552s0(View view, int i11, Context context) {
            AbstractC19074t.m100208f(view, "itemView");
            if (i11 == C7184q5.f39337B) {
                View findViewById = view.findViewById(AbstractC6918a0.title_row);
                AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
                this.f39358I = (TextView) findViewById;
                return;
            }
            if (i11 != C7184q5.f39339D) {
                if (i11 == C7184q5.f39340E) {
                    View findViewById2 = view.findViewById(AbstractC6918a0.tv_suggest_title);
                    AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
                    this.f39359J = (TextView) findViewById2;
                    return;
                }
                if (i11 == C7184q5.f39341F || i11 == C7184q5.f39342G) {
                    View findViewById3 = view.findViewById(AbstractC6918a0.layoutFeedFooterLoading);
                    AbstractC19074t.m100206d(findViewById3, "null cannot be cast to non-null type android.widget.LinearLayout");
                    LinearLayout linearLayout = (LinearLayout) findViewById3;
                    this.f39360K = linearLayout;
                    AbstractC19074t.m100205c(linearLayout);
                    linearLayout.setBackgroundResource(AbstractC17466e.transparent);
                    View findViewById4 = view.findViewById(AbstractC6918a0.layoutFeedFooterError);
                    AbstractC19074t.m100206d(findViewById4, "null cannot be cast to non-null type android.widget.LinearLayout");
                    this.f39361L = (LinearLayout) findViewById4;
                    return;
                }
                if (i11 == C7184q5.f39346K) {
                    this.f39364O = (TextView) view.findViewById(AbstractC6918a0.tv_time);
                    this.f39365P = view.findViewById(AbstractC6918a0.shadow_view);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.q5$d */
    /* loaded from: classes3.dex */
    public final class d extends b {

        /* renamed from: I */
        private TextView f39367I;

        /* renamed from: J */
        private RecyclerView f39368J;

        /* renamed from: K */
        private C7015b3 f39369K;

        /* renamed from: L */
        private Context f39370L;

        /* renamed from: M */
        final /* synthetic */ C7184q5 f39371M;

        /* renamed from: com.zing.zalo.adapters.q5$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends RecyclerView.AbstractC1892s {

            /* renamed from: b */
            final /* synthetic */ NoPredictiveItemAnimLinearLayoutMngr f39373b;

            /* renamed from: c */
            final /* synthetic */ C7184q5 f39374c;

            a(NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr, C7184q5 c7184q5) {
                this.f39373b = noPredictiveItemAnimLinearLayoutMngr;
                this.f39374c = c7184q5;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
            /* renamed from: d */
            public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
                e m36526Y;
                AbstractC19074t.m100208f(recyclerView, "recyclerView");
                super.mo10176d(recyclerView, i11, i12);
                if (d.this.m36555l0() != null) {
                    int m9745c2 = this.f39373b.m9745c2();
                    AbstractC19074t.m100205c(d.this.m36555l0());
                    if (m9745c2 >= r3.mo10003k() - 1 && (m36526Y = this.f39374c.m36526Y()) != null) {
                        m36526Y.mo36562sd();
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C7184q5 c7184q5, View view, int i11, Context context) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f39371M = c7184q5;
            this.f39370L = context;
            m36556m0(view, i11, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m36554k0(C7184q5 c7184q5, C31874cb c31874cb, int i11, int i12) {
            e m36526Y;
            AbstractC19074t.m100208f(c7184q5, "this$0");
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 6 && (m36526Y = c7184q5.m36526Y()) != null) {
                            AbstractC19074t.m100205c(c31874cb);
                            m36526Y.mo36561r6(c31874cb, i12, 3);
                            return;
                        }
                        return;
                    }
                    e m36526Y2 = c7184q5.m36526Y();
                    if (m36526Y2 != null) {
                        AbstractC19074t.m100205c(c31874cb);
                        m36526Y2.mo36561r6(c31874cb, i12, 0);
                        return;
                    }
                    return;
                }
                e m36526Y3 = c7184q5.m36526Y();
                if (m36526Y3 != null) {
                    AbstractC19074t.m100205c(c31874cb);
                    m36526Y3.mo36559ew(c31874cb, i12);
                    return;
                }
                return;
            }
            e m36526Y4 = c7184q5.m36526Y();
            if (m36526Y4 != null) {
                AbstractC19074t.m100205c(c31874cb);
                m36526Y4.mo36561r6(c31874cb, i12, 2);
            }
        }

        @Override // com.zing.zalo.adapters.C7184q5.b
        /* renamed from: i0 */
        public void mo36542i0(C31859bb c31859bb, int i11) {
            TextView textView = this.f39367I;
            if (textView != null) {
                textView.setText(C21933s.m114404I().f107933v);
            }
            if (this.f39369K == null) {
                NoPredictiveItemAnimLinearLayoutMngr noPredictiveItemAnimLinearLayoutMngr = new NoPredictiveItemAnimLinearLayoutMngr(this.f39370L);
                noPredictiveItemAnimLinearLayoutMngr.m9723C2(0);
                RecyclerView recyclerView = this.f39368J;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(noPredictiveItemAnimLinearLayoutMngr);
                }
                C7015b3 c7015b3 = new C7015b3();
                this.f39369K = c7015b3;
                final C7184q5 c7184q5 = this.f39371M;
                c7015b3.m35855P(new C25927x0.a() { // from class: com.zing.zalo.adapters.v5
                    @Override // p489rn.C25927x0.a
                    /* renamed from: x2 */
                    public final void mo36956x2(C31874cb c31874cb, int i12, int i13) {
                        C7184q5.d.m36554k0(C7184q5.this, c31874cb, i12, i13);
                    }
                });
                RecyclerView recyclerView2 = this.f39368J;
                if (recyclerView2 != null) {
                    recyclerView2.setAdapter(this.f39369K);
                }
                RecyclerView recyclerView3 = this.f39368J;
                if (recyclerView3 != null) {
                    recyclerView3.m9826E(new a(noPredictiveItemAnimLinearLayoutMngr, this.f39371M));
                }
            }
            C7015b3 c7015b32 = this.f39369K;
            if (c7015b32 != null) {
                c7015b32.m35854O(C21933s.m114404I().m114416F());
            }
            C7015b3 c7015b33 = this.f39369K;
            if (c7015b33 != null) {
                c7015b33.m10008p();
            }
        }

        /* renamed from: l0 */
        public final C7015b3 m36555l0() {
            return this.f39369K;
        }

        /* renamed from: m0 */
        public void m36556m0(View view, int i11, Context context) {
            AbstractC19074t.m100208f(view, "itemView");
            this.f39368J = (RecyclerView) view.findViewById(AbstractC6918a0.horizontal_recycle_view);
            this.f39367I = (TextView) view.findViewById(AbstractC6918a0.tv_suggest_title);
        }
    }

    /* renamed from: com.zing.zalo.adapters.q5$e */
    /* loaded from: classes3.dex */
    public interface e {
        /* renamed from: B1 */
        void mo36557B1();

        /* renamed from: R3 */
        boolean mo36558R3(String str);

        /* renamed from: ew */
        void mo36559ew(C31874cb c31874cb, int i11);

        /* renamed from: g2 */
        boolean mo36560g2(String str);

        /* renamed from: r6 */
        void mo36561r6(C31874cb c31874cb, int i11, int i12);

        /* renamed from: sd */
        void mo36562sd();

        /* renamed from: t3 */
        void mo36563t3();

        /* renamed from: u1 */
        void mo36564u1();

        /* renamed from: u4 */
        void mo36565u4();
    }

    /* renamed from: com.zing.zalo.adapters.q5$f */
    /* loaded from: classes3.dex */
    public final class f extends b {

        /* renamed from: I */
        private GroupAvatarView f39375I;

        /* renamed from: J */
        private RobotoTextView f39376J;

        /* renamed from: K */
        private RobotoTextView f39377K;

        /* renamed from: L */
        private RobotoTextView f39378L;

        /* renamed from: M */
        private TextView f39379M;

        /* renamed from: N */
        private TextView f39380N;

        /* renamed from: O */
        private View f39381O;

        /* renamed from: P */
        private TextView f39382P;

        /* renamed from: Q */
        private View f39383Q;

        /* renamed from: R */
        private int f39384R;

        /* renamed from: S */
        private int f39385S;

        /* renamed from: T */
        private TextView f39386T;

        /* renamed from: U */
        private TextView f39387U;

        /* renamed from: V */
        private TextView f39388V;

        /* renamed from: W */
        final /* synthetic */ C7184q5 f39389W;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C7184q5 c7184q5, View view, int i11, Context context) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f39389W = c7184q5;
            m36574q0(view, i11, context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n0 */
        public static final void m36570n0(C7184q5 c7184q5, C31874cb c31874cb, int i11, View view) {
            AbstractC19074t.m100208f(c7184q5, "this$0");
            AbstractC19074t.m100208f(c31874cb, "$contact");
            e m36526Y = c7184q5.m36526Y();
            if (m36526Y != null) {
                m36526Y.mo36559ew(c31874cb, i11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o0 */
        public static final void m36571o0(C7184q5 c7184q5, C31874cb c31874cb, View view) {
            e m36526Y;
            AbstractC19074t.m100208f(c7184q5, "this$0");
            AbstractC19074t.m100208f(c31874cb, "$contact");
            if (c7184q5.m36526Y() != null && (m36526Y = c7184q5.m36526Y()) != null) {
                m36526Y.mo36565u4();
            }
            c31874cb.f146382D = true;
            c7184q5.m10008p();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p0 */
        public static final void m36572p0(f fVar, View view) {
            TextView textView;
            AbstractC19074t.m100208f(fVar, "this$0");
            TextView textView2 = fVar.f39382P;
            if (textView2 != null && textView2.getVisibility() == 0 && (textView = fVar.f39382P) != null) {
                textView.performClick();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s0 */
        public static final void m36573s0(C7184q5 c7184q5, C31874cb c31874cb, int i11, int i12, View view) {
            AbstractC19074t.m100208f(c7184q5, "this$0");
            AbstractC19074t.m100208f(c31874cb, "$item");
            e m36526Y = c7184q5.m36526Y();
            if (m36526Y != null) {
                m36526Y.mo36561r6(c31874cb, i11, i12);
            }
        }

        @Override // com.zing.zalo.adapters.C7184q5.b
        /* renamed from: i0 */
        public void mo36542i0(C31859bb c31859bb, final int i11) {
            String str;
            int i12;
            int i13;
            int i14;
            int i15;
            String obj;
            int i16;
            boolean z11;
            int i17;
            int i18;
            int i19;
            int i21;
            String string;
            int i22;
            int i23;
            int i24;
            if (c31859bb != null) {
                try {
                    c31859bb.f146293d = this.f7784p;
                    final C31874cb m153145a = c31859bb.m153145a();
                    AbstractC19074t.m100207e(m153145a, "getContact(...)");
                    boolean m36531b0 = this.f39389W.m36531b0(m153145a.f146385a);
                    if (!this.f39389W.m36529a0(m153145a.f146385a)) {
                        this.f7784p.setBackgroundResource(AbstractC16803z.stencils_bg_white_with_press_state);
                    } else {
                        this.f7784p.setBackgroundResource(AbstractC16803z.stencils_bg_highlight_request_friend);
                    }
                    if (m153145a.f146400p == 3 && !AbstractC23063f2.m118359k(m153145a.f146385a) && !C18644n.m98531l().m98558u(m153145a.f146385a)) {
                        m153145a.f146400p = 1;
                    }
                    long j11 = m153145a.f146398n;
                    if (j11 > 0) {
                        if (j11 < 100000000000L) {
                            j11 *= 1000;
                        }
                        str = AbstractC23160o0.m119270m0(j11);
                    } else {
                        str = null;
                    }
                    TextView textView = this.f39386T;
                    if (textView != null) {
                        textView.setVisibility(8);
                    }
                    TextView textView2 = this.f39387U;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    View view = this.f39381O;
                    if (view != null) {
                        view.setVisibility(8);
                    }
                    int i25 = m153145a.f146400p;
                    if (i25 == 5) {
                        View view2 = this.f39383Q;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        if (m153145a.f146390f <= 0) {
                            RobotoTextView robotoTextView = this.f39377K;
                            if (robotoTextView != null) {
                                robotoTextView.setText(this.f39389W.m36525X().getString(AbstractC8020f0.str_reject_friend_done));
                            }
                            RobotoTextView robotoTextView2 = this.f39377K;
                            if (robotoTextView2 != null) {
                                robotoTextView2.setVisibility(0);
                            }
                        } else if (!TextUtils.isEmpty(m153145a.f146386b)) {
                            RobotoTextView robotoTextView3 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView3);
                            robotoTextView3.setText(m153145a.f146386b);
                            RobotoTextView robotoTextView4 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView4);
                            robotoTextView4.setVisibility(0);
                        } else {
                            RobotoTextView robotoTextView5 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView5);
                            robotoTextView5.setVisibility(8);
                        }
                        View view3 = this.f39381O;
                        if (view3 != null) {
                            view3.setVisibility(0);
                        }
                        TextView textView3 = this.f39379M;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                        TextView textView4 = this.f39380N;
                        if (textView4 != null) {
                            textView4.setVisibility(8);
                        }
                    } else if (i25 == 3) {
                        View view4 = this.f39383Q;
                        if (view4 != null) {
                            view4.setVisibility(8);
                        }
                        if (m153145a.f146390f <= 0) {
                            if (m153145a.f146399o == 2) {
                                RobotoTextView robotoTextView6 = this.f39377K;
                                if (robotoTextView6 != null) {
                                    robotoTextView6.setText(this.f39389W.m36525X().getString(AbstractC8020f0.str_accept_friend_done));
                                }
                            } else {
                                RobotoTextView robotoTextView7 = this.f39377K;
                                if (robotoTextView7 != null) {
                                    robotoTextView7.setText(this.f39389W.m36525X().getString(AbstractC8020f0.str_done_action_friend_suggest_new));
                                }
                            }
                            RobotoTextView robotoTextView8 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView8);
                            robotoTextView8.setVisibility(0);
                        } else if (!TextUtils.isEmpty(m153145a.f146386b)) {
                            RobotoTextView robotoTextView9 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView9);
                            robotoTextView9.setText(m153145a.f146386b);
                            RobotoTextView robotoTextView10 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView10);
                            robotoTextView10.setVisibility(0);
                        } else {
                            RobotoTextView robotoTextView11 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView11);
                            robotoTextView11.setVisibility(8);
                        }
                        TextView textView5 = this.f39379M;
                        AbstractC19074t.m100205c(textView5);
                        textView5.setVisibility(8);
                        TextView textView6 = this.f39380N;
                        AbstractC19074t.m100205c(textView6);
                        if (m153145a.f146406v == 1) {
                            i24 = 0;
                        } else {
                            i24 = 8;
                        }
                        textView6.setVisibility(i24);
                    } else if (m153145a.f146390f > 0) {
                        TextView textView7 = this.f39379M;
                        if (textView7 != null) {
                            textView7.setText(this.f39389W.m36525X().getString(AbstractC8020f0.str_suggest_func_follow_page));
                        }
                        if (C21927m.m114302u().m114357s().m153137g(m153145a.f146385a)) {
                            TextView textView8 = this.f39380N;
                            AbstractC19074t.m100205c(textView8);
                            if (m153145a.f146406v == 1) {
                                i23 = 0;
                            } else {
                                i23 = 8;
                            }
                            textView8.setVisibility(i23);
                            TextView textView9 = this.f39379M;
                            AbstractC19074t.m100205c(textView9);
                            textView9.setVisibility(8);
                        } else {
                            TextView textView10 = this.f39379M;
                            AbstractC19074t.m100205c(textView10);
                            if (m153145a.f146406v == 1) {
                                i21 = 0;
                            } else {
                                i21 = 8;
                            }
                            textView10.setVisibility(i21);
                            TextView textView11 = this.f39380N;
                            AbstractC19074t.m100205c(textView11);
                            textView11.setVisibility(8);
                        }
                        if (!TextUtils.isEmpty(m153145a.f146386b)) {
                            string = m153145a.f146386b;
                        } else {
                            string = this.f39389W.m36525X().getResources().getString(AbstractC8020f0.str_maybe_you_care);
                        }
                        if (!TextUtils.isEmpty(string)) {
                            RobotoTextView robotoTextView12 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView12);
                            robotoTextView12.setText(string);
                            RobotoTextView robotoTextView13 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView13);
                            robotoTextView13.setVisibility(0);
                        } else {
                            RobotoTextView robotoTextView14 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView14);
                            robotoTextView14.setVisibility(8);
                        }
                        View view5 = this.f39383Q;
                        AbstractC19074t.m100205c(view5);
                        view5.setVisibility(8);
                        if (m36531b0) {
                            RobotoTextView robotoTextView15 = this.f39377K;
                            if (robotoTextView15 != null) {
                                robotoTextView15.setText(this.f39389W.m36525X().getString(AbstractC8020f0.str_done_action_page_suggest));
                            }
                            RobotoTextView robotoTextView16 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView16);
                            robotoTextView16.setVisibility(0);
                            TextView textView12 = this.f39379M;
                            AbstractC19074t.m100205c(textView12);
                            textView12.setVisibility(8);
                            TextView textView13 = this.f39380N;
                            AbstractC19074t.m100205c(textView13);
                            if (m153145a.f146406v == 1) {
                                i22 = 0;
                            } else {
                                i22 = 8;
                            }
                            textView13.setVisibility(i22);
                        }
                    } else {
                        int i26 = m153145a.f146399o;
                        if (i26 == 1) {
                            TextView textView14 = this.f39379M;
                            if (textView14 != null) {
                                textView14.setText(this.f39389W.m36525X().getString(AbstractC8020f0.str_suggest_func_add_friend_new));
                            }
                            TextView textView15 = this.f39379M;
                            AbstractC19074t.m100205c(textView15);
                            if (m153145a.f146406v == 1) {
                                i18 = 0;
                            } else {
                                i18 = 8;
                            }
                            textView15.setVisibility(i18);
                            TextView textView16 = this.f39380N;
                            AbstractC19074t.m100205c(textView16);
                            textView16.setVisibility(8);
                            String str2 = m153145a.f146396l;
                            if (!TextUtils.isEmpty(m153145a.f146397m)) {
                                RobotoTextView robotoTextView17 = this.f39377K;
                                AbstractC19074t.m100205c(robotoTextView17);
                                robotoTextView17.setText(m153145a.f146397m);
                                RobotoTextView robotoTextView18 = this.f39377K;
                                AbstractC19074t.m100205c(robotoTextView18);
                                robotoTextView18.setVisibility(0);
                            } else {
                                String m118339r = AbstractC23059e9.m118339r(m153145a.f146399o, m153145a.f146389e, m153145a.f146394j);
                                if (!TextUtils.isEmpty(m118339r)) {
                                    RobotoTextView robotoTextView19 = this.f39377K;
                                    AbstractC19074t.m100205c(robotoTextView19);
                                    robotoTextView19.setText(m118339r);
                                    RobotoTextView robotoTextView20 = this.f39377K;
                                    AbstractC19074t.m100205c(robotoTextView20);
                                    robotoTextView20.setVisibility(0);
                                } else {
                                    RobotoTextView robotoTextView21 = this.f39377K;
                                    AbstractC19074t.m100205c(robotoTextView21);
                                    robotoTextView21.setVisibility(8);
                                }
                            }
                            if (TextUtils.isEmpty(str2)) {
                                View view6 = this.f39383Q;
                                AbstractC19074t.m100205c(view6);
                                view6.setVisibility(8);
                            } else {
                                m36576t0(this.f39378L, str2, !m153145a.f146382D);
                                View view7 = this.f39383Q;
                                AbstractC19074t.m100205c(view7);
                                view7.setVisibility(0);
                            }
                            if (m36531b0 || AbstractC23063f2.m118359k(m153145a.f146385a)) {
                                RobotoTextView robotoTextView22 = this.f39377K;
                                if (robotoTextView22 != null) {
                                    robotoTextView22.setText(this.f39389W.m36525X().getString(AbstractC8020f0.str_done_action_friend_suggest_new));
                                }
                                RobotoTextView robotoTextView23 = this.f39377K;
                                if (robotoTextView23 != null) {
                                    robotoTextView23.setVisibility(0);
                                }
                                TextView textView17 = this.f39379M;
                                AbstractC19074t.m100205c(textView17);
                                textView17.setVisibility(8);
                                TextView textView18 = this.f39380N;
                                AbstractC19074t.m100205c(textView18);
                                if (m153145a.f146406v == 1) {
                                    i19 = 0;
                                } else {
                                    i19 = 8;
                                }
                                textView18.setVisibility(i19);
                                View view8 = this.f39383Q;
                                if (view8 != null) {
                                    view8.setVisibility(8);
                                }
                            }
                        } else if (i26 == 2) {
                            TextView textView19 = this.f39379M;
                            AbstractC19074t.m100205c(textView19);
                            textView19.setVisibility(8);
                            TextView textView20 = this.f39380N;
                            AbstractC19074t.m100205c(textView20);
                            textView20.setVisibility(8);
                            TextView textView21 = this.f39386T;
                            if (textView21 != null) {
                                if (m153145a.f146406v == 1) {
                                    i14 = 0;
                                } else {
                                    i14 = 8;
                                }
                                textView21.setVisibility(i14);
                            }
                            TextView textView22 = this.f39387U;
                            if (textView22 != null) {
                                if (m153145a.f146407w == 1) {
                                    i15 = 0;
                                } else {
                                    i15 = 8;
                                }
                                textView22.setVisibility(i15);
                            }
                            String str3 = m153145a.f146396l;
                            if (!TextUtils.isEmpty(m153145a.f146397m)) {
                                obj = m153145a.f146397m;
                            } else {
                                int i27 = m153145a.f146389e;
                                if (i27 != -1 && i27 != 30 && i27 != 10) {
                                    obj = AbstractC23059e9.m118339r(m153145a.f146399o, i27, m153145a.f146394j);
                                }
                                String m118339r2 = AbstractC23059e9.m118339r(m153145a.f146399o, i27, m153145a.f146394j);
                                AbstractC19074t.m100207e(m118339r2, "getTypeRequestFromSourceInfo(...)");
                                int length = m118339r2.length() - 1;
                                int i28 = 0;
                                boolean z12 = false;
                                while (i28 <= length) {
                                    if (!z12) {
                                        i16 = i28;
                                    } else {
                                        i16 = length;
                                    }
                                    if (AbstractC19074t.m100209g(m118339r2.charAt(i16), 32) <= 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (!z12) {
                                        if (!z11) {
                                            z12 = true;
                                        } else {
                                            i28++;
                                        }
                                    } else if (!z11) {
                                        break;
                                    } else {
                                        length--;
                                    }
                                }
                                obj = m118339r2.subSequence(i28, length + 1).toString();
                            }
                            if (TextUtils.isEmpty(obj) && TextUtils.isEmpty(str)) {
                                RobotoTextView robotoTextView24 = this.f39377K;
                                if (robotoTextView24 != null) {
                                    robotoTextView24.setVisibility(8);
                                }
                            } else {
                                RobotoTextView robotoTextView25 = this.f39377K;
                                if (robotoTextView25 != null) {
                                    robotoTextView25.setVisibility(0);
                                }
                                if (TextUtils.isEmpty(str)) {
                                    RobotoTextView robotoTextView26 = this.f39377K;
                                    if (robotoTextView26 != null) {
                                        robotoTextView26.setText(obj);
                                    }
                                } else if (TextUtils.isEmpty(obj)) {
                                    RobotoTextView robotoTextView27 = this.f39377K;
                                    if (robotoTextView27 != null) {
                                        robotoTextView27.setText(str);
                                    }
                                } else {
                                    RobotoTextView robotoTextView28 = this.f39377K;
                                    if (robotoTextView28 != null) {
                                        C19067n0 c19067n0 = C19067n0.f94947a;
                                        String format = String.format("%s • %s", Arrays.copyOf(new Object[]{str, obj}, 2));
                                        AbstractC19074t.m100207e(format, "format(...)");
                                        robotoTextView28.setText(format);
                                    }
                                }
                            }
                            if (TextUtils.isEmpty(str3)) {
                                View view9 = this.f39383Q;
                                AbstractC19074t.m100205c(view9);
                                view9.setVisibility(8);
                            } else {
                                m36576t0(this.f39378L, str3, !m153145a.f146382D);
                                View view10 = this.f39383Q;
                                AbstractC19074t.m100205c(view10);
                                view10.setVisibility(0);
                            }
                            if (m36531b0) {
                                RobotoTextView robotoTextView29 = this.f39377K;
                                if (robotoTextView29 != null) {
                                    robotoTextView29.setText(this.f39389W.m36525X().getString(AbstractC8020f0.str_accept_friend_done));
                                }
                                RobotoTextView robotoTextView30 = this.f39377K;
                                if (robotoTextView30 != null) {
                                    robotoTextView30.setVisibility(0);
                                }
                                View view11 = this.f39383Q;
                                AbstractC19074t.m100205c(view11);
                                view11.setVisibility(8);
                                TextView textView23 = this.f39380N;
                                AbstractC19074t.m100205c(textView23);
                                if (m153145a.f146406v == 1) {
                                    i17 = 0;
                                } else {
                                    i17 = 8;
                                }
                                textView23.setVisibility(i17);
                                TextView textView24 = this.f39386T;
                                if (textView24 != null) {
                                    textView24.setVisibility(8);
                                }
                                TextView textView25 = this.f39387U;
                                if (textView25 != null) {
                                    textView25.setVisibility(8);
                                }
                                View view12 = this.f39383Q;
                                if (view12 != null) {
                                    view12.setVisibility(8);
                                }
                            }
                        } else {
                            TextView textView26 = this.f39379M;
                            if (textView26 != null) {
                                textView26.setText(this.f39389W.m36525X().getString(AbstractC8020f0.str_suggest_func_add_friend_new));
                            }
                            TextView textView27 = this.f39379M;
                            AbstractC19074t.m100205c(textView27);
                            if (m153145a.f146406v == 1) {
                                i12 = 0;
                            } else {
                                i12 = 8;
                            }
                            textView27.setVisibility(i12);
                            TextView textView28 = this.f39380N;
                            AbstractC19074t.m100205c(textView28);
                            textView28.setVisibility(8);
                            String string2 = this.f39389W.m36525X().getString(AbstractC8020f0.str_you_may_know);
                            AbstractC19074t.m100207e(string2, "getString(...)");
                            RobotoTextView robotoTextView31 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView31);
                            robotoTextView31.setText(string2);
                            RobotoTextView robotoTextView32 = this.f39377K;
                            AbstractC19074t.m100205c(robotoTextView32);
                            robotoTextView32.setVisibility(0);
                            View view13 = this.f39383Q;
                            AbstractC19074t.m100205c(view13);
                            view13.setVisibility(8);
                            if (m36531b0 || AbstractC23063f2.m118359k(m153145a.f146385a)) {
                                RobotoTextView robotoTextView33 = this.f39377K;
                                if (robotoTextView33 != null) {
                                    robotoTextView33.setText(this.f39389W.m36525X().getString(AbstractC8020f0.str_done_action_friend_suggest_new));
                                }
                                RobotoTextView robotoTextView34 = this.f39377K;
                                AbstractC19074t.m100205c(robotoTextView34);
                                robotoTextView34.setVisibility(0);
                                TextView textView29 = this.f39379M;
                                AbstractC19074t.m100205c(textView29);
                                textView29.setVisibility(8);
                                TextView textView30 = this.f39380N;
                                AbstractC19074t.m100205c(textView30);
                                if (m153145a.f146406v == 1) {
                                    i13 = 0;
                                } else {
                                    i13 = 8;
                                }
                                textView30.setVisibility(i13);
                            }
                        }
                    }
                    m36575r0(this.f39379M, m153145a, i11, 0);
                    m36575r0(this.f39380N, m153145a, i11, 3);
                    m36575r0(this.f39381O, m153145a, i11, 4);
                    m36575r0(this.f39386T, m153145a, i11, 1);
                    m36575r0(this.f39387U, m153145a, i11, 2);
                    String m153180d = m153145a.m153180d(true, false);
                    RobotoTextView robotoTextView35 = this.f39376J;
                    if (robotoTextView35 != null) {
                        robotoTextView35.setText(m153180d);
                    }
                    if (C23302b.f113247a.m120523d(m153145a.f146393i)) {
                        if (TextUtils.isEmpty(m153145a.f146401q)) {
                            m153145a.f146401q = AbstractC23028c0.m118087g(m153145a.m153180d(true, false));
                        }
                        if (!TextUtils.isEmpty(m153145a.f146401q)) {
                            GroupAvatarView groupAvatarView = this.f39375I;
                            AbstractC19074t.m100205c(groupAvatarView);
                            groupAvatarView.setShortDpnAvt(m153145a.f146401q);
                            GroupAvatarView groupAvatarView2 = this.f39375I;
                            AbstractC19074t.m100205c(groupAvatarView2);
                            groupAvatarView2.setUidForGenColor(m153145a.f146385a);
                        }
                    }
                    GroupAvatarView groupAvatarView3 = this.f39375I;
                    AbstractC19074t.m100205c(groupAvatarView3);
                    groupAvatarView3.setImageOption(C23278z2.m120143n());
                    if (!TextUtils.isEmpty(m153145a.f146393i)) {
                        GroupAvatarView groupAvatarView4 = this.f39375I;
                        AbstractC19074t.m100205c(groupAvatarView4);
                        groupAvatarView4.setScrollingMode(this.f39389W.m36535d0());
                        GroupAvatarView groupAvatarView5 = this.f39375I;
                        AbstractC19074t.m100205c(groupAvatarView5);
                        groupAvatarView5.m75732d(m153145a.f146393i);
                    }
                    TextView textView31 = this.f39388V;
                    if (textView31 != null) {
                        String m153181e = m153145a.m153181e();
                        if (TextUtils.isEmpty(m153181e)) {
                            textView31.setVisibility(8);
                        } else {
                            textView31.setText(m153181e);
                            textView31.setVisibility(0);
                        }
                    }
                    View view14 = this.f7784p;
                    final C7184q5 c7184q5 = this.f39389W;
                    view14.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.w5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view15) {
                            C7184q5.f.m36570n0(C7184q5.this, m153145a, i11, view15);
                        }
                    });
                    TextView textView32 = this.f39382P;
                    AbstractC19074t.m100205c(textView32);
                    final C7184q5 c7184q52 = this.f39389W;
                    textView32.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.x5
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view15) {
                            C7184q5.f.m36571o0(C7184q5.this, m153145a, view15);
                        }
                    });
                    View view15 = this.f39383Q;
                    if (view15 != null) {
                        view15.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.y5
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view16) {
                                C7184q5.f.m36572p0(C7184q5.f.this, view16);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: q0 */
        public void m36574q0(View view, int i11, Context context) {
            AbstractC19074t.m100208f(view, "itemView");
            View findViewById = view.findViewById(AbstractC6918a0.buddy_dp);
            AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type com.zing.zalo.ui.widget.GroupAvatarView");
            this.f39375I = (GroupAvatarView) findViewById;
            View findViewById2 = view.findViewById(AbstractC6918a0.name);
            AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type com.zing.zalo.ui.widget.RobotoTextView");
            this.f39376J = (RobotoTextView) findViewById2;
            View findViewById3 = view.findViewById(AbstractC6918a0.tvBALabel);
            AbstractC19074t.m100206d(findViewById3, "null cannot be cast to non-null type com.zing.zalo.ui.widget.RobotoTextView");
            this.f39388V = (RobotoTextView) findViewById3;
            View findViewById4 = view.findViewById(AbstractC6918a0.tvInvitation);
            AbstractC19074t.m100206d(findViewById4, "null cannot be cast to non-null type com.zing.zalo.ui.widget.RobotoTextView");
            this.f39377K = (RobotoTextView) findViewById4;
            View findViewById5 = view.findViewById(AbstractC6918a0.tvInvitationDetail);
            AbstractC19074t.m100206d(findViewById5, "null cannot be cast to non-null type com.zing.zalo.ui.widget.RobotoTextView");
            this.f39378L = (RobotoTextView) findViewById5;
            View findViewById6 = view.findViewById(AbstractC6918a0.btn_combine_func_1);
            AbstractC19074t.m100206d(findViewById6, "null cannot be cast to non-null type android.widget.TextView");
            this.f39379M = (TextView) findViewById6;
            View findViewById7 = view.findViewById(AbstractC6918a0.btn_combine_func_4);
            AbstractC19074t.m100206d(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
            this.f39380N = (TextView) findViewById7;
            this.f39386T = (TextView) view.findViewById(AbstractC6918a0.btn_accept);
            this.f39387U = (TextView) view.findViewById(AbstractC6918a0.btn_reject);
            this.f39381O = view.findViewById(AbstractC6918a0.btn_reject_done);
            this.f39382P = (TextView) view.findViewById(AbstractC6918a0.view_see_more);
            this.f39383Q = view.findViewById(AbstractC6918a0.view_container);
            this.f39384R = AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_l_r);
            this.f39385S = (AbstractC23136l9.m118722k0() - (this.f39384R * 5)) - AbstractC23136l9.m118655I(AbstractC16802y.avt_L);
        }

        /* renamed from: r0 */
        public final void m36575r0(View view, final C31874cb c31874cb, final int i11, final int i12) {
            AbstractC19074t.m100208f(c31874cb, "item");
            if (view != null) {
                final C7184q5 c7184q5 = this.f39389W;
                view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.z5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C7184q5.f.m36573s0(C7184q5.this, c31874cb, i11, i12, view2);
                    }
                });
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:            if (r2 == null) goto L8;     */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r11v2 */
        /* renamed from: t0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void m36576t0(TextView textView, String str, boolean z11) {
            String str2;
            StaticLayout staticLayout;
            ?? r11;
            StaticLayout.Builder obtain;
            StaticLayout.Builder lineSpacing;
            StaticLayout.Builder alignment;
            StaticLayout.Builder includePad;
            StaticLayout.Builder obtain2;
            StaticLayout.Builder lineSpacing2;
            StaticLayout.Builder alignment2;
            StaticLayout.Builder includePad2;
            String m127114D;
            if (textView == null) {
                return;
            }
            if (str != null) {
                m127114D = AbstractC24341v.m127114D(str, "\"", "", false, 4, null);
                str2 = m127114D;
            }
            str2 = "";
            textView.setText(str2);
            if (z11) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.btn_see_more);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                if (Build.VERSION.SDK_INT >= 24) {
                    obtain2 = StaticLayout.Builder.obtain(str2, 0, str2.length(), textView.getPaint(), this.f39385S);
                    lineSpacing2 = obtain2.setLineSpacing(0.0f, 1.0f);
                    alignment2 = lineSpacing2.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                    includePad2 = alignment2.setIncludePad(false);
                    staticLayout = includePad2.build();
                    AbstractC19074t.m100205c(staticLayout);
                    r11 = 0;
                } else {
                    r11 = 0;
                    staticLayout = new StaticLayout(str2, textView.getPaint(), this.f39385S, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                int i11 = 0;
                while (staticLayout.getLineCount() > 2) {
                    if (i11 > 0) {
                        i11--;
                    } else {
                        i11 = staticLayout.getLineEnd(1) - m118743r0.length();
                    }
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    Object[] objArr = new Object[2];
                    String substring = str2.substring(r11, i11);
                    AbstractC19074t.m100207e(substring, "substring(...)");
                    objArr[r11] = substring;
                    objArr[1] = m118743r0;
                    String format = String.format("%s... %s", Arrays.copyOf(objArr, 2));
                    AbstractC19074t.m100207e(format, "format(...)");
                    if (Build.VERSION.SDK_INT >= 24) {
                        obtain = StaticLayout.Builder.obtain(format, r11, format.length(), textView.getPaint(), this.f39385S);
                        lineSpacing = obtain.setLineSpacing(0.0f, 1.0f);
                        alignment = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
                        includePad = alignment.setIncludePad(r11);
                        staticLayout = includePad.build();
                        AbstractC19074t.m100205c(staticLayout);
                    } else {
                        staticLayout = new StaticLayout(format, textView.getPaint(), this.f39385S, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    }
                }
                if (i11 > 0) {
                    String substring2 = str2.substring(r11, i11);
                    AbstractC19074t.m100207e(substring2, "substring(...)");
                    textView.setText(substring2 + "...");
                    TextView textView2 = this.f39382P;
                    if (textView2 != 0) {
                        textView2.setVisibility(r11);
                        return;
                    }
                    return;
                }
                TextView textView3 = this.f39382P;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                    return;
                }
                return;
            }
            textView.setMaxLines(Integer.MAX_VALUE);
            TextView textView4 = this.f39382P;
            AbstractC19074t.m100205c(textView4);
            textView4.setVisibility(8);
        }
    }

    public C7184q5(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f39351s = context;
        Object systemService = context.getSystemService("layout_inflater");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        this.f39352t = (LayoutInflater) systemService;
        this.f39357y = new HashMap();
    }

    /* renamed from: V */
    public final C31859bb m36523V(int i11) {
        ArrayList arrayList = this.f39350r;
        if (arrayList != null) {
            AbstractC19074t.m100205c(arrayList);
            if (arrayList.size() > i11) {
                ArrayList arrayList2 = this.f39350r;
                AbstractC19074t.m100205c(arrayList2);
                return (C31859bb) arrayList2.get(i11);
            }
        }
        return null;
    }

    /* renamed from: W */
    public final List m36524W() {
        return this.f39350r;
    }

    /* renamed from: X */
    public final Context m36525X() {
        return this.f39351s;
    }

    /* renamed from: Y */
    public final e m36526Y() {
        return this.f39353u;
    }

    /* renamed from: Z */
    public final boolean m36527Z(int i11) {
        try {
            ArrayList arrayList = this.f39350r;
            if (arrayList == null) {
                return false;
            }
            AbstractC19074t.m100205c(arrayList);
            if (arrayList.size() <= i11) {
                return false;
            }
            ArrayList arrayList2 = this.f39350r;
            AbstractC19074t.m100205c(arrayList2);
            return ((C31859bb) arrayList2.get(i11)).m153146b();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: a */
    public boolean mo36528a(int i11) {
        if (mo10005m(i11) == f39346K) {
            return true;
        }
        return false;
    }

    /* renamed from: a0 */
    public final boolean m36529a0(String str) {
        e eVar = this.f39353u;
        if (eVar != null) {
            AbstractC19074t.m100205c(eVar);
            return eVar.mo36558R3(str);
        }
        return false;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: b */
    public void mo36530b(View view, int i11) {
        View view2;
        C31859bb m36523V = m36523V(i11);
        c cVar = this.f39356x;
        if (cVar != null) {
            cVar.mo36542i0(m36523V, i11);
        }
        c cVar2 = this.f39356x;
        if (cVar2 != null) {
            view2 = cVar2.m36551r0();
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* renamed from: b0 */
    public final boolean m36531b0(String str) {
        e eVar = this.f39353u;
        if (eVar != null) {
            AbstractC19074t.m100205c(eVar);
            return eVar.mo36560g2(str);
        }
        return false;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: c */
    public int mo36532c(int i11) {
        while (!mo36528a(i11)) {
            i11--;
            if (i11 < 0) {
                return -1;
            }
        }
        return i11;
    }

    /* renamed from: c0 */
    public final boolean m36533c0(int i11) {
        try {
            C31859bb m36523V = m36523V(i11);
            AbstractC19074t.m100205c(m36523V);
            return m36523V.m153147c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: d */
    public View mo36534d(int i11, ViewGroup viewGroup) {
        if (this.f39356x == null) {
            View inflate = this.f39352t.inflate(AbstractC7409c0.row_time_request, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
            this.f39356x = new c(this, inflate, f39346K, this.f39351s);
        }
        c cVar = this.f39356x;
        AbstractC19074t.m100205c(cVar);
        View view = cVar.f7784p;
        AbstractC19074t.m100207e(view, "itemView");
        return view;
    }

    /* renamed from: d0 */
    public final boolean m36535d0() {
        return this.f39354v;
    }

    @Override // com.zing.zalo.adapters.C7192r2.b
    /* renamed from: e */
    public boolean mo36536e(int i11) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: e0, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        try {
            C31859bb m36523V = m36523V(i11);
            if (m36523V != null) {
                bVar.mo36542i0(m36523V, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        View inflate;
        AbstractC19074t.m100208f(viewGroup, "parent");
        if (i11 == f39336A || i11 == f39349z) {
            View inflate2 = this.f39352t.inflate(AbstractC7409c0.layout_request_friend_row, viewGroup, false);
            AbstractC19074t.m100207e(inflate2, "inflate(...)");
            return new f(this, inflate2, i11, this.f39351s);
        }
        if (i11 == f39337B) {
            inflate = this.f39352t.inflate(AbstractC7409c0.item_list_header_row, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
        } else if (i11 == f39338C) {
            inflate = this.f39352t.inflate(AbstractC7409c0.item_see_more_request_friend, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
        } else if (i11 == f39339D) {
            inflate = this.f39352t.inflate(AbstractC7409c0.suggest_seperate_line, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
        } else if (i11 == f39340E) {
            inflate = this.f39352t.inflate(AbstractC7409c0.suggest_title_layout, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
        } else if (i11 == f39341F || i11 == f39342G) {
            inflate = this.f39352t.inflate(AbstractC7409c0.footer_loading, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
        } else if (i11 == f39343H) {
            inflate = this.f39352t.inflate(AbstractC7409c0.item_open_request_friend, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
        } else if (i11 == f39344I) {
            inflate = this.f39352t.inflate(AbstractC7409c0.item_request_friend_empty, viewGroup, false);
            AbstractC19074t.m100207e(inflate, "inflate(...)");
        } else {
            if (i11 == f39345J) {
                View inflate3 = this.f39352t.inflate(AbstractC7409c0.suggest_friend_horizontal_layout, viewGroup, false);
                AbstractC19074t.m100207e(inflate3, "inflate(...)");
                return new d(this, inflate3, i11, this.f39351s);
            }
            if (i11 == f39346K) {
                inflate = this.f39352t.inflate(AbstractC7409c0.row_time_request, viewGroup, false);
                AbstractC19074t.m100207e(inflate, "inflate(...)");
            } else {
                inflate = this.f39352t.inflate(AbstractC7409c0.feed_item_unsupport, viewGroup, false);
                AbstractC19074t.m100207e(inflate, "inflate(...)");
            }
        }
        return new c(this, inflate, i11, this.f39351s);
    }

    /* renamed from: g0 */
    public final void m36539g0(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "itemList");
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.f39350r = arrayList2;
        this.f39355w = 0;
        AbstractC19074t.m100205c(arrayList2);
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList arrayList3 = this.f39350r;
            AbstractC19074t.m100205c(arrayList3);
            Object obj = arrayList3.get(i11);
            AbstractC19074t.m100207e(obj, "get(...)");
            if (((C31859bb) obj).m153145a() != null) {
                this.f39355w++;
            }
        }
    }

    /* renamed from: h0 */
    public final void m36540h0(e eVar) {
        this.f39353u = eVar;
    }

    /* renamed from: i0 */
    public final void m36541i0(boolean z11) {
        this.f39354v = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        ArrayList arrayList = this.f39350r;
        if (arrayList != null) {
            AbstractC19074t.m100205c(arrayList);
            return arrayList.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return 0L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        int i12;
        int i13 = f39347L;
        try {
            ArrayList arrayList = this.f39350r;
            if (arrayList != null) {
                AbstractC19074t.m100205c(arrayList);
                Object obj = arrayList.get(i11);
                AbstractC19074t.m100207e(obj, "get(...)");
                switch (((C31859bb) obj).f146290a) {
                    case 0:
                        if (m36527Z(i11)) {
                            if (m36533c0(i11)) {
                                i12 = f39336A;
                            } else {
                                i12 = f39349z;
                            }
                        } else {
                            i12 = f39337B;
                        }
                        return i12;
                    case 1:
                    case 2:
                        return f39338C;
                    case 3:
                        return f39339D;
                    case 4:
                    case 5:
                        return f39340E;
                    case 6:
                        return f39341F;
                    case 7:
                        return f39342G;
                    case 8:
                        return f39343H;
                    case 9:
                        return f39344I;
                    case 10:
                        return f39345J;
                    case 11:
                        return f39346K;
                    default:
                        return i13;
                }
            }
            return i13;
        } catch (Exception e11) {
            e11.printStackTrace();
            return i13;
        }
    }
}

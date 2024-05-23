package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.adapters.C7137m2;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.group.poll.PollProgressView;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.QuickActionViewLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import h70.C19909c;
import h70.C19916j;
import h70.C19917k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import ln0.AbstractC22543l;
import me0.AbstractC23244v8;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23304d;
import p354n3.C23528a;
import p588vw.C28652r;
import p716zh.C31862c;
import p716zh.C31961i8;
import vg.C28203u6;

/* renamed from: com.zing.zalo.adapters.m2 */
/* loaded from: classes3.dex */
public final class C7137m2 extends RecyclerView.AbstractC1880g {
    public static final c Companion = new c(null);

    /* renamed from: r */
    private final Context f38997r;

    /* renamed from: s */
    private final C23528a f38998s;

    /* renamed from: t */
    private final ArrayList f38999t = new ArrayList();

    /* renamed from: u */
    private final d f39000u;

    /* renamed from: com.zing.zalo.adapters.m2$a */
    /* loaded from: classes3.dex */
    public static final class a extends b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.l2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7137m2.a.m36313p0(C7137m2.a.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p0 */
        public static final void m36313p0(a aVar, View view) {
            AbstractC19074t.m100208f(aVar, "this$0");
            d m36316k0 = aVar.m36316k0();
            if (m36316k0 != null) {
                m36316k0.mo36324e();
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.m2$b */
    /* loaded from: classes3.dex */
    public static class b extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        private C23528a f39001I;

        /* renamed from: J */
        private d f39002J;

        /* renamed from: K */
        private C19909c f39003K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: i0 */
        public void mo36314i0(C19909c c19909c) {
            AbstractC19074t.m100208f(c19909c, "item");
            this.f39003K = c19909c;
        }

        /* renamed from: j0 */
        public final C23528a m36315j0() {
            return this.f39001I;
        }

        /* renamed from: k0 */
        public final d m36316k0() {
            return this.f39002J;
        }

        /* renamed from: l0 */
        public final C19909c m36317l0() {
            return this.f39003K;
        }

        /* renamed from: m0 */
        public final void m36318m0(C23528a c23528a) {
            this.f39001I = c23528a;
        }

        /* renamed from: n0 */
        public final void m36319n0(d dVar) {
            this.f39002J = dVar;
        }
    }

    /* renamed from: com.zing.zalo.adapters.m2$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.adapters.m2$d */
    /* loaded from: classes3.dex */
    public interface d {
        /* renamed from: a */
        void mo36320a(C31862c c31862c, String str, String str2);

        /* renamed from: b */
        void mo36321b(C31961i8.a aVar);

        /* renamed from: c */
        void mo36322c(C31961i8.a aVar);

        /* renamed from: d */
        void mo36323d();

        /* renamed from: e */
        void mo36324e();

        /* renamed from: f */
        void mo36325f(C31961i8.a aVar);

        /* renamed from: g */
        void mo36326g();
    }

    /* renamed from: com.zing.zalo.adapters.m2$e */
    /* loaded from: classes3.dex */
    public static final class e extends b {

        /* renamed from: L */
        private final TextView f39004L;

        /* renamed from: M */
        private final TextView f39005M;

        /* renamed from: N */
        private final View f39006N;

        /* renamed from: O */
        private final TextView f39007O;

        /* renamed from: P */
        private final TextView f39008P;

        /* renamed from: Q */
        private final View f39009Q;

        /* renamed from: R */
        private final View f39010R;

        /* renamed from: S */
        private final View f39011S;

        /* renamed from: T */
        private final TextView f39012T;

        /* renamed from: U */
        private final View f39013U;

        /* renamed from: V */
        private FrameLayout f39014V;

        /* renamed from: W */
        private C19916j f39015W;

        /* renamed from: com.zing.zalo.adapters.m2$e$a */
        /* loaded from: classes3.dex */
        public static final class a implements InterfaceC13567b1.a {
            a() {
            }

            @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
            /* renamed from: B5 */
            public void mo36332B5(C31862c c31862c, String str, String str2, int i11) {
                AbstractC19074t.m100208f(c31862c, "actionItemInfo");
                AbstractC19074t.m100208f(str, "actionType");
                AbstractC19074t.m100208f(str2, "actionData");
                d m36316k0 = e.this.m36316k0();
                if (m36316k0 != null) {
                    m36316k0.mo36320a(c31862c, str, str2);
                }
            }

            @Override // com.zing.zalo.p077ui.widget.InterfaceC13567b1.a
            /* renamed from: P1 */
            public void mo36333P1(QuickActionViewLayout quickActionViewLayout, C31862c c31862c) {
                AbstractC19074t.m100208f(quickActionViewLayout, "view");
                AbstractC19074t.m100208f(c31862c, "actionItemInfo");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            View findViewById = view.findViewById(AbstractC6918a0.tv_create_info);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            TextView textView = (TextView) findViewById;
            this.f39004L = textView;
            View findViewById2 = view.findViewById(AbstractC6918a0.tv_group_poll_question);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            this.f39005M = (TextView) findViewById2;
            View findViewById3 = view.findViewById(AbstractC6918a0.end_time_container);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            this.f39006N = findViewById3;
            View findViewById4 = view.findViewById(AbstractC6918a0.tv_end_time_poll);
            AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
            this.f39007O = (TextView) findViewById4;
            View findViewById5 = view.findViewById(AbstractC6918a0.tv_multi_choice_text);
            AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
            this.f39008P = (TextView) findViewById5;
            View findViewById6 = view.findViewById(AbstractC6918a0.anonymous_container);
            AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
            this.f39009Q = findViewById6;
            View findViewById7 = view.findViewById(AbstractC6918a0.hide_vote_preview_container);
            AbstractC19074t.m100207e(findViewById7, "findViewById(...)");
            this.f39010R = findViewById7;
            View findViewById8 = view.findViewById(AbstractC6918a0.container_group_poll_no_votes);
            AbstractC19074t.m100207e(findViewById8, "findViewById(...)");
            this.f39011S = findViewById8;
            View findViewById9 = view.findViewById(AbstractC6918a0.tv_group_poll_no_votes);
            AbstractC19074t.m100207e(findViewById9, "findViewById(...)");
            this.f39012T = (TextView) findViewById9;
            View findViewById10 = view.findViewById(AbstractC6918a0.icon_next);
            AbstractC19074t.m100207e(findViewById10, "findViewById(...)");
            this.f39013U = findViewById10;
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.n2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7137m2.e.m36329q0(C7137m2.e.this, view2);
                }
            });
            findViewById8.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.o2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C7137m2.e.m36330r0(C7137m2.e.this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q0 */
        public static final void m36329q0(e eVar, View view) {
            AbstractC19074t.m100208f(eVar, "this$0");
            d m36316k0 = eVar.m36316k0();
            if (m36316k0 != null) {
                m36316k0.mo36326g();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r0 */
        public static final void m36330r0(e eVar, View view) {
            d m36316k0;
            AbstractC19074t.m100208f(eVar, "this$0");
            C19916j c19916j = eVar.f39015W;
            if (c19916j != null) {
                AbstractC19074t.m100205c(c19916j);
                if (c19916j.m103669a() && (m36316k0 = eVar.m36316k0()) != null) {
                    m36316k0.mo36323d();
                }
            }
        }

        /* renamed from: s0 */
        private final void m36331s0(C31862c c31862c) {
            ViewStub viewStub;
            if (c31862c != null && !c31862c.m153154f() && !c31862c.f146332y && c31862c.m153155h() && c31862c.m153149a()) {
                if (this.f39014V == null && (viewStub = (ViewStub) this.f7784p.findViewById(AbstractC6918a0.vs_quick_action_view)) != null) {
                    View inflate = viewStub.inflate();
                    AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                    this.f39014V = (FrameLayout) inflate;
                }
                FrameLayout frameLayout = this.f39014V;
                if (frameLayout != null) {
                    if (frameLayout != null) {
                        frameLayout.removeAllViews();
                    }
                    FrameLayout frameLayout2 = this.f39014V;
                    if (frameLayout2 != null) {
                        frameLayout2.setVisibility(0);
                    }
                    QuickActionViewLayout quickActionViewLayout = new QuickActionViewLayout(this.f7784p.getContext(), c31862c.f146309b);
                    quickActionViewLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                    quickActionViewLayout.setId(AbstractC6918a0.view_quick_action_top);
                    FrameLayout frameLayout3 = this.f39014V;
                    AbstractC19074t.m100205c(frameLayout3);
                    frameLayout3.addView(quickActionViewLayout);
                    quickActionViewLayout.m75818b(c31862c, new a());
                    return;
                }
                return;
            }
            FrameLayout frameLayout4 = this.f39014V;
            if (frameLayout4 != null) {
                frameLayout4.removeAllViews();
            }
            FrameLayout frameLayout5 = this.f39014V;
            if (frameLayout5 != null) {
                frameLayout5.setVisibility(8);
            }
        }

        @Override // com.zing.zalo.adapters.C7137m2.b
        /* renamed from: i0 */
        public void mo36314i0(C19909c c19909c) {
            int i11;
            int i12;
            AbstractC19074t.m100208f(c19909c, "item");
            super.mo36314i0(c19909c);
            this.f39015W = c19909c.m103598c();
            C19916j m103598c = c19909c.m103598c();
            if (m103598c == null) {
                return;
            }
            CharSequence m103671c = m103598c.m103671c();
            if (m103671c.length() > 0) {
                this.f39004L.setVisibility(0);
                this.f39004L.setText(m103671c);
            } else {
                this.f39004L.setVisibility(8);
            }
            this.f39005M.setText(m103598c.m103674f());
            AbstractC23244v8.m119759w(this.f39005M);
            if (m103598c.m103673e()) {
                this.f39006N.setVisibility(0);
                this.f39007O.setText(m103598c.m103672d());
            } else {
                this.f39006N.setVisibility(8);
            }
            this.f39008P.setText(m103598c.m103670b());
            View view = this.f39009Q;
            if (m103598c.m103678j()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
            View view2 = this.f39010R;
            if (m103598c.m103679k()) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            view2.setVisibility(i12);
            if (m103598c.m103677i() > 0) {
                this.f39011S.setVisibility(0);
                this.f39012T.setText(m103598c.m103676h());
                if (m103598c.m103669a()) {
                    this.f39012T.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC16781w.LinkColor));
                    this.f39013U.setVisibility(0);
                } else {
                    this.f39012T.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC21196a.TextColor1));
                    this.f39013U.setVisibility(8);
                }
            } else {
                this.f39011S.setVisibility(8);
            }
            m36331s0(m103598c.m103675g());
        }
    }

    /* renamed from: com.zing.zalo.adapters.m2$f */
    /* loaded from: classes3.dex */
    public static final class f extends b implements View.OnClickListener, View.OnLongClickListener {

        /* renamed from: L */
        private final View f39017L;

        /* renamed from: M */
        private final PollProgressView f39018M;

        /* renamed from: N */
        private final View f39019N;

        /* renamed from: O */
        private final View f39020O;

        /* renamed from: P */
        private final ImageView f39021P;

        /* renamed from: Q */
        private final RobotoTextView f39022Q;

        /* renamed from: R */
        private final View f39023R;

        /* renamed from: S */
        private final RecyclingImageView[] f39024S;

        /* renamed from: T */
        private final TextView f39025T;

        /* renamed from: U */
        private String f39026U;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f39024S = r0;
            View findViewById = view.findViewById(AbstractC6918a0.container);
            AbstractC19074t.m100207e(findViewById, "findViewById(...)");
            this.f39017L = findViewById;
            findViewById.setOnClickListener(this);
            findViewById.setOnLongClickListener(this);
            View findViewById2 = view.findViewById(AbstractC6918a0.option_container);
            AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
            this.f39019N = findViewById2;
            View findViewById3 = view.findViewById(AbstractC6918a0.option_container_stroke);
            AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
            this.f39020O = findViewById3;
            View findViewById4 = view.findViewById(AbstractC6918a0.pb_voting_percent);
            AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
            this.f39018M = (PollProgressView) findViewById4;
            View findViewById5 = view.findViewById(AbstractC6918a0.ic_enable_vote);
            AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
            this.f39021P = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(AbstractC6918a0.tv_option);
            AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
            this.f39022Q = (RobotoTextView) findViewById6;
            View findViewById7 = view.findViewById(AbstractC6918a0.no_votes_container);
            AbstractC19074t.m100207e(findViewById7, "findViewById(...)");
            this.f39023R = findViewById7;
            findViewById7.setOnClickListener(this);
            RecyclingImageView[] recyclingImageViewArr = {view.findViewById(AbstractC6918a0.avt1), view.findViewById(AbstractC6918a0.avt2), view.findViewById(AbstractC6918a0.avt3)};
            View findViewById8 = view.findViewById(AbstractC6918a0.avtCount);
            AbstractC19074t.m100207e(findViewById8, "findViewById(...)");
            this.f39025T = (TextView) findViewById8;
        }

        /* renamed from: o0 */
        private final C31961i8.a m36334o0() {
            C19917k m103599d;
            C19909c m36317l0 = m36317l0();
            if (m36317l0 != null && (m103599d = m36317l0.m103599d()) != null) {
                return m103599d.m103683c();
            }
            return null;
        }

        /* renamed from: p0 */
        private final C19917k m36335p0() {
            C19909c m36317l0 = m36317l0();
            if (m36317l0 != null) {
                return m36317l0.m103599d();
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x0245 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x0008, B:5:0x000e, B:10:0x0016, B:13:0x001d, B:16:0x004c, B:18:0x0052, B:19:0x006e, B:21:0x0072, B:24:0x0079, B:27:0x0084, B:28:0x0097, B:30:0x00ac, B:35:0x00d8, B:37:0x00e5, B:39:0x00ec, B:41:0x00f0, B:43:0x00fe, B:45:0x0106, B:47:0x012c, B:49:0x0130, B:52:0x0138, B:54:0x0140, B:59:0x014d, B:61:0x0161, B:63:0x0169, B:64:0x018a, B:68:0x0179, B:58:0x018e, B:71:0x0116, B:73:0x0191, B:75:0x0196, B:77:0x019c, B:78:0x01cd, B:81:0x01d8, B:84:0x01de, B:85:0x0211, B:87:0x0216, B:90:0x021d, B:91:0x024a, B:94:0x0225, B:95:0x01f8, B:96:0x01b5, B:97:0x023f, B:98:0x00bb, B:101:0x00c0, B:103:0x00c4, B:104:0x00cd, B:105:0x0245, B:106:0x008e, B:107:0x0062, B:108:0x003f), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0062 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x0008, B:5:0x000e, B:10:0x0016, B:13:0x001d, B:16:0x004c, B:18:0x0052, B:19:0x006e, B:21:0x0072, B:24:0x0079, B:27:0x0084, B:28:0x0097, B:30:0x00ac, B:35:0x00d8, B:37:0x00e5, B:39:0x00ec, B:41:0x00f0, B:43:0x00fe, B:45:0x0106, B:47:0x012c, B:49:0x0130, B:52:0x0138, B:54:0x0140, B:59:0x014d, B:61:0x0161, B:63:0x0169, B:64:0x018a, B:68:0x0179, B:58:0x018e, B:71:0x0116, B:73:0x0191, B:75:0x0196, B:77:0x019c, B:78:0x01cd, B:81:0x01d8, B:84:0x01de, B:85:0x0211, B:87:0x0216, B:90:0x021d, B:91:0x024a, B:94:0x0225, B:95:0x01f8, B:96:0x01b5, B:97:0x023f, B:98:0x00bb, B:101:0x00c0, B:103:0x00c4, B:104:0x00cd, B:105:0x0245, B:106:0x008e, B:107:0x0062, B:108:0x003f), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x0008, B:5:0x000e, B:10:0x0016, B:13:0x001d, B:16:0x004c, B:18:0x0052, B:19:0x006e, B:21:0x0072, B:24:0x0079, B:27:0x0084, B:28:0x0097, B:30:0x00ac, B:35:0x00d8, B:37:0x00e5, B:39:0x00ec, B:41:0x00f0, B:43:0x00fe, B:45:0x0106, B:47:0x012c, B:49:0x0130, B:52:0x0138, B:54:0x0140, B:59:0x014d, B:61:0x0161, B:63:0x0169, B:64:0x018a, B:68:0x0179, B:58:0x018e, B:71:0x0116, B:73:0x0191, B:75:0x0196, B:77:0x019c, B:78:0x01cd, B:81:0x01d8, B:84:0x01de, B:85:0x0211, B:87:0x0216, B:90:0x021d, B:91:0x024a, B:94:0x0225, B:95:0x01f8, B:96:0x01b5, B:97:0x023f, B:98:0x00bb, B:101:0x00c0, B:103:0x00c4, B:104:0x00cd, B:105:0x0245, B:106:0x008e, B:107:0x0062, B:108:0x003f), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ac A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x0008, B:5:0x000e, B:10:0x0016, B:13:0x001d, B:16:0x004c, B:18:0x0052, B:19:0x006e, B:21:0x0072, B:24:0x0079, B:27:0x0084, B:28:0x0097, B:30:0x00ac, B:35:0x00d8, B:37:0x00e5, B:39:0x00ec, B:41:0x00f0, B:43:0x00fe, B:45:0x0106, B:47:0x012c, B:49:0x0130, B:52:0x0138, B:54:0x0140, B:59:0x014d, B:61:0x0161, B:63:0x0169, B:64:0x018a, B:68:0x0179, B:58:0x018e, B:71:0x0116, B:73:0x0191, B:75:0x0196, B:77:0x019c, B:78:0x01cd, B:81:0x01d8, B:84:0x01de, B:85:0x0211, B:87:0x0216, B:90:0x021d, B:91:0x024a, B:94:0x0225, B:95:0x01f8, B:96:0x01b5, B:97:0x023f, B:98:0x00bb, B:101:0x00c0, B:103:0x00c4, B:104:0x00cd, B:105:0x0245, B:106:0x008e, B:107:0x0062, B:108:0x003f), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d8 A[Catch: Exception -> 0x005f, LOOP:0: B:34:0x00d6->B:35:0x00d8, LOOP_END, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x0008, B:5:0x000e, B:10:0x0016, B:13:0x001d, B:16:0x004c, B:18:0x0052, B:19:0x006e, B:21:0x0072, B:24:0x0079, B:27:0x0084, B:28:0x0097, B:30:0x00ac, B:35:0x00d8, B:37:0x00e5, B:39:0x00ec, B:41:0x00f0, B:43:0x00fe, B:45:0x0106, B:47:0x012c, B:49:0x0130, B:52:0x0138, B:54:0x0140, B:59:0x014d, B:61:0x0161, B:63:0x0169, B:64:0x018a, B:68:0x0179, B:58:0x018e, B:71:0x0116, B:73:0x0191, B:75:0x0196, B:77:0x019c, B:78:0x01cd, B:81:0x01d8, B:84:0x01de, B:85:0x0211, B:87:0x0216, B:90:0x021d, B:91:0x024a, B:94:0x0225, B:95:0x01f8, B:96:0x01b5, B:97:0x023f, B:98:0x00bb, B:101:0x00c0, B:103:0x00c4, B:104:0x00cd, B:105:0x0245, B:106:0x008e, B:107:0x0062, B:108:0x003f), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ec A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x0008, B:5:0x000e, B:10:0x0016, B:13:0x001d, B:16:0x004c, B:18:0x0052, B:19:0x006e, B:21:0x0072, B:24:0x0079, B:27:0x0084, B:28:0x0097, B:30:0x00ac, B:35:0x00d8, B:37:0x00e5, B:39:0x00ec, B:41:0x00f0, B:43:0x00fe, B:45:0x0106, B:47:0x012c, B:49:0x0130, B:52:0x0138, B:54:0x0140, B:59:0x014d, B:61:0x0161, B:63:0x0169, B:64:0x018a, B:68:0x0179, B:58:0x018e, B:71:0x0116, B:73:0x0191, B:75:0x0196, B:77:0x019c, B:78:0x01cd, B:81:0x01d8, B:84:0x01de, B:85:0x0211, B:87:0x0216, B:90:0x021d, B:91:0x024a, B:94:0x0225, B:95:0x01f8, B:96:0x01b5, B:97:0x023f, B:98:0x00bb, B:101:0x00c0, B:103:0x00c4, B:104:0x00cd, B:105:0x0245, B:106:0x008e, B:107:0x0062, B:108:0x003f), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0196 A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x0008, B:5:0x000e, B:10:0x0016, B:13:0x001d, B:16:0x004c, B:18:0x0052, B:19:0x006e, B:21:0x0072, B:24:0x0079, B:27:0x0084, B:28:0x0097, B:30:0x00ac, B:35:0x00d8, B:37:0x00e5, B:39:0x00ec, B:41:0x00f0, B:43:0x00fe, B:45:0x0106, B:47:0x012c, B:49:0x0130, B:52:0x0138, B:54:0x0140, B:59:0x014d, B:61:0x0161, B:63:0x0169, B:64:0x018a, B:68:0x0179, B:58:0x018e, B:71:0x0116, B:73:0x0191, B:75:0x0196, B:77:0x019c, B:78:0x01cd, B:81:0x01d8, B:84:0x01de, B:85:0x0211, B:87:0x0216, B:90:0x021d, B:91:0x024a, B:94:0x0225, B:95:0x01f8, B:96:0x01b5, B:97:0x023f, B:98:0x00bb, B:101:0x00c0, B:103:0x00c4, B:104:0x00cd, B:105:0x0245, B:106:0x008e, B:107:0x0062, B:108:0x003f), top: B:2:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x023f A[Catch: Exception -> 0x005f, TryCatch #0 {Exception -> 0x005f, blocks: (B:3:0x0008, B:5:0x000e, B:10:0x0016, B:13:0x001d, B:16:0x004c, B:18:0x0052, B:19:0x006e, B:21:0x0072, B:24:0x0079, B:27:0x0084, B:28:0x0097, B:30:0x00ac, B:35:0x00d8, B:37:0x00e5, B:39:0x00ec, B:41:0x00f0, B:43:0x00fe, B:45:0x0106, B:47:0x012c, B:49:0x0130, B:52:0x0138, B:54:0x0140, B:59:0x014d, B:61:0x0161, B:63:0x0169, B:64:0x018a, B:68:0x0179, B:58:0x018e, B:71:0x0116, B:73:0x0191, B:75:0x0196, B:77:0x019c, B:78:0x01cd, B:81:0x01d8, B:84:0x01de, B:85:0x0211, B:87:0x0216, B:90:0x021d, B:91:0x024a, B:94:0x0225, B:95:0x01f8, B:96:0x01b5, B:97:0x023f, B:98:0x00bb, B:101:0x00c0, B:103:0x00c4, B:104:0x00cd, B:105:0x0245, B:106:0x008e, B:107:0x0062, B:108:0x003f), top: B:2:0x0008 }] */
        @Override // com.zing.zalo.adapters.C7137m2.b
        /* renamed from: i0 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo36314i0(C19909c c19909c) {
            C19917k m103599d;
            C31961i8.a m36334o0;
            int i11;
            String str;
            ArrayList arrayList;
            int m116584g;
            int i12;
            int i13;
            String format;
            int i14;
            AbstractC19074t.m100208f(c19909c, "item");
            super.mo36314i0(c19909c);
            try {
                C19909c m36317l0 = m36317l0();
                if (m36317l0 == null || (m103599d = m36317l0.m103599d()) == null || (m36334o0 = m36334o0()) == null) {
                    return;
                }
                boolean m103688h = m103599d.m103688h();
                this.f39018M.setProgressColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC16781w.PollProgressActive));
                ImageView imageView = this.f39021P;
                if (!m103599d.m103681a()) {
                    if (m103599d.m103685e()) {
                        if (!m103688h) {
                            i11 = 4;
                        }
                    } else {
                        i11 = 8;
                    }
                    imageView.setVisibility(i11);
                    if (!m103688h) {
                        this.f39021P.setImageResource(AbstractC16803z.ic_check_circle_solid_24);
                        this.f39022Q.setTextStyleBold(true);
                    } else {
                        this.f39021P.setImageResource(AbstractC16803z.ic_radio_unchecked_line_24);
                        this.f39022Q.setTextStyleBold(false);
                    }
                    str = this.f39026U;
                    if (str != null && str.length() != 0 && !AbstractC19074t.m100204b(this.f39026U, m36334o0.f146905e)) {
                        this.f39018M.setProgress(m103599d.m103686f());
                        this.f39022Q.setText(C28652r.m143349v().m143357H(m36334o0.f146901a));
                        if (!m103599d.m103682b()) {
                            this.f39023R.setVisibility(0);
                            if (!m103599d.m103687g() && (arrayList = m36334o0.f146907g) != null) {
                                int i15 = m36334o0.f146902b;
                                m116584g = i15 <= 3 ? AbstractC22543l.m116584g(i15, arrayList.size()) : AbstractC22543l.m116584g(2, arrayList.size());
                                for (i12 = 0; i12 < 3; i12++) {
                                    RecyclingImageView recyclingImageView = this.f39024S[i12];
                                    AbstractC19074t.m100205c(recyclingImageView);
                                    recyclingImageView.setVisibility(8);
                                }
                                if (!m103599d.m103687g()) {
                                    if (m36334o0.f146904d) {
                                        RecyclingImageView recyclingImageView2 = this.f39024S[0];
                                        AbstractC19074t.m100205c(recyclingImageView2);
                                        recyclingImageView2.setVisibility(0);
                                        ContactProfile contactProfile = AbstractC23304d.f113368c0;
                                        if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42446v)) {
                                            AbstractC23268y2.m120028b(m36315j0(), this.f39024S[0], contactProfile, C23278z2.m120143n(), false);
                                        } else {
                                            AbstractC23268y2.m120031e(m36315j0(), this.f39024S[0], AbstractC23304d.f113368c0.f42446v, C23278z2.m120143n());
                                        }
                                        i14 = 1;
                                    } else {
                                        i14 = 0;
                                    }
                                    ArrayList arrayList2 = m36334o0.f146907g;
                                    if (arrayList2 != null) {
                                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                                            ContactProfile contactProfile2 = (ContactProfile) arrayList2.get(size);
                                            if (contactProfile2 != null && !AbstractC19074t.m100204b(contactProfile2.f42434r, AbstractC23304d.f113368c0.f42434r)) {
                                                RecyclingImageView recyclingImageView3 = this.f39024S[i14];
                                                AbstractC19074t.m100205c(recyclingImageView3);
                                                recyclingImageView3.setVisibility(0);
                                                ContactProfile m141798e = C28203u6.m141798e(C28203u6.f131407a, contactProfile2.f42434r, null, 2, null);
                                                if (m141798e != null && !TextUtils.isEmpty(m141798e.f42446v)) {
                                                    AbstractC23268y2.m120028b(m36315j0(), this.f39024S[i14], m141798e, C23278z2.m120143n(), false);
                                                } else {
                                                    AbstractC23268y2.m120031e(m36315j0(), this.f39024S[i14], contactProfile2.f42446v, C23278z2.m120143n());
                                                }
                                                i14++;
                                                if (i14 >= m116584g) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                i13 = m36334o0.f146902b - m116584g;
                                if (i13 <= 0) {
                                    if (m103599d.m103687g()) {
                                        this.f39025T.setTextSize(1, 14.0f);
                                        this.f39025T.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC21196a.TextColor1));
                                    } else {
                                        this.f39025T.setTextSize(1, 12.0f);
                                        this.f39025T.setTextColor(C23212s8.m119607o(this.f7784p.getContext(), AbstractC16781w.LinkColor));
                                    }
                                    this.f39025T.setVisibility(0);
                                    if (i13 > 999) {
                                        i13 = 999;
                                    }
                                    TextView textView = this.f39025T;
                                    if (m116584g > 0) {
                                        C19067n0 c19067n0 = C19067n0.f94947a;
                                        format = String.format(Locale.ENGLISH, "+%d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
                                        AbstractC19074t.m100207e(format, "format(...)");
                                    } else {
                                        C19067n0 c19067n02 = C19067n0.f94947a;
                                        format = String.format(Locale.ENGLISH, "%d", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1));
                                        AbstractC19074t.m100207e(format, "format(...)");
                                    }
                                    textView.setText(format);
                                    if (m116584g != 0 && !m103599d.m103687g()) {
                                        this.f39025T.setBackgroundResource(AbstractC16803z.bg_rounded_tv_more);
                                    }
                                    ViewGroup.LayoutParams layoutParams = this.f39025T.getLayoutParams();
                                    AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                                    layoutParams2.leftMargin = 0;
                                    this.f39025T.setLayoutParams(layoutParams2);
                                    this.f39025T.setBackground(null);
                                } else {
                                    this.f39025T.setVisibility(8);
                                }
                            }
                            m116584g = 0;
                            while (i12 < 3) {
                            }
                            if (!m103599d.m103687g()) {
                            }
                            i13 = m36334o0.f146902b - m116584g;
                            if (i13 <= 0) {
                            }
                        } else {
                            this.f39023R.setVisibility(8);
                        }
                        this.f39026U = m36334o0.f146905e;
                    }
                    this.f39018M.setProgressWithAnimation(m103599d.m103686f());
                    this.f39022Q.setText(C28652r.m143349v().m143357H(m36334o0.f146901a));
                    if (!m103599d.m103682b()) {
                    }
                    this.f39026U = m36334o0.f146905e;
                }
                i11 = 0;
                imageView.setVisibility(i11);
                if (!m103688h) {
                }
                str = this.f39026U;
                if (str != null) {
                    this.f39018M.setProgress(m103599d.m103686f());
                    this.f39022Q.setText(C28652r.m143349v().m143357H(m36334o0.f146901a));
                    if (!m103599d.m103682b()) {
                    }
                    this.f39026U = m36334o0.f146905e;
                }
                this.f39018M.setProgressWithAnimation(m103599d.m103686f());
                this.f39022Q.setText(C28652r.m143349v().m143357H(m36334o0.f146901a));
                if (!m103599d.m103682b()) {
                }
                this.f39026U = m36334o0.f146905e;
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d m36316k0;
            d m36316k02;
            AbstractC19074t.m100208f(view, "view");
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.container) {
                C19917k m36335p0 = m36335p0();
                if (m36335p0 != null && m36335p0.m103684d() != 2 && m36335p0.m103681a() && m36334o0() != null && (m36316k02 = m36316k0()) != null) {
                    C31961i8.a m36334o0 = m36334o0();
                    AbstractC19074t.m100206d(m36334o0, "null cannot be cast to non-null type com.zing.zalo.control.PollInfo.PollOption");
                    m36316k02.mo36325f(m36334o0);
                    return;
                }
                return;
            }
            if (id2 == AbstractC6918a0.no_votes_container && m36334o0() != null && m36335p0() != null) {
                C19917k m36335p02 = m36335p0();
                AbstractC19074t.m100205c(m36335p02);
                if (!m36335p02.m103687g() && (m36316k0 = m36316k0()) != null) {
                    C31961i8.a m36334o02 = m36334o0();
                    AbstractC19074t.m100206d(m36334o02, "null cannot be cast to non-null type com.zing.zalo.control.PollInfo.PollOption");
                    m36316k0.mo36321b(m36334o02);
                }
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            C31961i8.a aVar;
            d m36316k0;
            C19917k m103599d;
            C19917k m103599d2;
            AbstractC19074t.m100208f(view, "view");
            C19909c m36317l0 = m36317l0();
            C31961i8.a aVar2 = null;
            if (m36317l0 != null && (m103599d2 = m36317l0.m103599d()) != null) {
                aVar = m103599d2.m103683c();
            } else {
                aVar = null;
            }
            if (aVar != null && (m36316k0 = m36316k0()) != null) {
                C19909c m36317l02 = m36317l0();
                if (m36317l02 != null && (m103599d = m36317l02.m103599d()) != null) {
                    aVar2 = m103599d.m103683c();
                }
                AbstractC19074t.m100206d(aVar2, "null cannot be cast to non-null type com.zing.zalo.control.PollInfo.PollOption");
                m36316k0.mo36322c(aVar2);
                return true;
            }
            return true;
        }
    }

    public C7137m2(Context context, d dVar) {
        this.f38997r = context;
        this.f38998s = new C23528a(context);
        this.f39000u = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void mo9990A(b bVar, int i11) {
        AbstractC19074t.m100208f(bVar, "holder");
        Object obj = this.f38999t.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        bVar.m36319n0(this.f39000u);
        bVar.mo36314i0((C19909c) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b mo9992C(ViewGroup viewGroup, int i11) {
        Object obj;
        b eVar;
        AbstractC19074t.m100208f(viewGroup, "parent");
        Context context = this.f38997r;
        if (context != null) {
            obj = context.getSystemService("layout_inflater");
        } else {
            obj = null;
        }
        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    eVar = new b(new View(viewGroup.getContext()));
                } else {
                    View inflate = layoutInflater.inflate(AbstractC7409c0.group_poll_item_add_option, viewGroup, false);
                    AbstractC19074t.m100205c(inflate);
                    eVar = new a(inflate);
                }
            } else {
                View inflate2 = layoutInflater.inflate(AbstractC7409c0.group_poll_item_voting_option, viewGroup, false);
                AbstractC19074t.m100205c(inflate2);
                eVar = new f(inflate2);
            }
        } else {
            View inflate3 = layoutInflater.inflate(AbstractC7409c0.group_poll_item_poll_info, viewGroup, false);
            AbstractC19074t.m100205c(inflate3);
            eVar = new e(inflate3);
        }
        eVar.m36318m0(this.f38998s);
        return eVar;
    }

    /* renamed from: N */
    public final void m36310N(List list) {
        AbstractC19074t.m100208f(list, "items");
        this.f38999t.clear();
        this.f38999t.addAll(list);
        m10008p();
    }

    /* renamed from: O */
    public final void m36311O(C19909c c19909c) {
        AbstractC19074t.m100208f(c19909c, "item");
        int size = this.f38999t.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (AbstractC19074t.m100204b(this.f38999t.get(i11), c19909c)) {
                m10010r(i11, 0);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f38999t.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return ((C19909c) this.f38999t.get(i11)).m103596a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return ((C19909c) this.f38999t.get(i11)).m103597b();
    }
}

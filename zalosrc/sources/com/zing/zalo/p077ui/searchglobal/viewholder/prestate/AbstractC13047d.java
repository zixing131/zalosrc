package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import ac.C0708i;
import ai.InterfaceC0861a;
import android.content.Context;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.search.MiniProgramAvatarModuleView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.InterfaceC16976f1;
import com.zing.zalo.zdesign.component.TrackingLinearLayout;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import jn0.AbstractC21317c;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import p578vk.AbstractC28275a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import q80.C25174m;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d */
/* loaded from: classes6.dex */
public abstract class AbstractC13047d extends RecyclerView.AbstractC1876c0 {

    /* renamed from: R */
    private static int f67342R;

    /* renamed from: S */
    private static int f67343S;

    /* renamed from: I */
    private final InterfaceC18319c f67345I;

    /* renamed from: J */
    private AbstractC28275a.b f67346J;

    /* renamed from: K */
    private boolean f67347K;

    /* renamed from: L */
    private final InterfaceC24854k f67348L;

    /* renamed from: M */
    private final InterfaceC24854k f67349M;

    /* renamed from: N */
    private final View f67350N;

    /* renamed from: O */
    private final InterfaceC24854k f67351O;

    /* renamed from: P */
    private final InterfaceC24854k f67352P;

    /* renamed from: Q */
    private final InterfaceC24854k f67353Q;
    public static final a Companion = new a(null);

    /* renamed from: T */
    private static final int f67344T = View.generateViewId();

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public final View m73299c(ViewGroup viewGroup, boolean z11) {
            int m73301e = m73301e(viewGroup);
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            TrackingLinearLayout trackingLinearLayout = new TrackingLinearLayout(context);
            int m118742r = AbstractC23136l9.m118742r(4.0f);
            int m118742r2 = AbstractC23136l9.m118742r(64.0f);
            trackingLinearLayout.setOrientation(1);
            trackingLinearLayout.setLayoutParams(new RecyclerView.LayoutParams(m73301e, -2));
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m118742r2, m118742r2);
            layoutParams.gravity = 1;
            trackingLinearLayout.addView(frameLayout, layoutParams);
            if (!z11) {
                GroupAvatarView groupAvatarView = new GroupAvatarView(viewGroup.getContext());
                groupAvatarView.setId(AbstractC6918a0.img_avt);
                groupAvatarView.setImageResource(AbstractC16803z.default_avatar);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
                layoutParams2.gravity = 17;
                frameLayout.addView(groupAvatarView, layoutParams2);
            } else {
                Context context2 = viewGroup.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                C25174m c25174m = new C25174m(context2);
                c25174m.m89106L().m89028L(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
                Context context3 = viewGroup.getContext();
                AbstractC19074t.m100207e(context3, "getContext(...)");
                MiniProgramAvatarModuleView miniProgramAvatarModuleView = new MiniProgramAvatarModuleView(context3, c25174m);
                miniProgramAvatarModuleView.setId(AbstractC6918a0.img_avt);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
                layoutParams3.gravity = 17;
                frameLayout.addView(miniProgramAvatarModuleView, layoutParams3);
            }
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView.setId(AbstractC13047d.f67344T);
            zAppCompatImageView.setImageResource(AbstractC16803z.ic_oa_verify);
            zAppCompatImageView.setVisibility(8);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            layoutParams4.setMargins(AbstractC23136l9.m118742r(40.0f), AbstractC23136l9.m118742r(40.0f), 0, 0);
            frameLayout.addView(zAppCompatImageView, layoutParams4);
            ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView2.setId(AbstractC13047d.f67344T);
            zAppCompatImageView2.setImageResource(AbstractC16803z.ic_oa_verify);
            zAppCompatImageView2.setVisibility(8);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            layoutParams5.setMargins(AbstractC23136l9.m118742r(40.0f), AbstractC23136l9.m118742r(40.0f), 0, 0);
            frameLayout.addView(zAppCompatImageView2, layoutParams5);
            ZAppCompatImageView zAppCompatImageView3 = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView3.setId(AbstractC6918a0.btn_close);
            zAppCompatImageView3.setImageResource(AbstractC16803z.icn_remove);
            zAppCompatImageView3.setVisibility(8);
            zAppCompatImageView3.setPadding(m118742r, m118742r, m118742r, m118742r);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(28.0f), AbstractC23136l9.m118742r(28.0f));
            layoutParams6.gravity = 8388661;
            frameLayout.addView(zAppCompatImageView3, layoutParams6);
            Context context4 = viewGroup.getContext();
            AbstractC19074t.m100207e(context4, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context4);
            robotoTextView.setId(AbstractC6918a0.name);
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            robotoTextView.setIncludeFontPadding(false);
            robotoTextView.setMaxLines(2);
            robotoTextView.setMinLines(2);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setTextSize(0, AbstractC23136l9.m118742r(14.0f));
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
            robotoTextView.setGravity(1);
            int m118742r3 = AbstractC23136l9.m118742r(4.0f);
            layoutParams7.setMargins(m118742r3, m118742r3, m118742r3, m118742r3);
            trackingLinearLayout.addView(robotoTextView, layoutParams7);
            return trackingLinearLayout;
        }

        /* renamed from: d */
        public final View m73300d(ViewGroup viewGroup, boolean z11) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setBackgroundResource(AbstractC16803z.stencils_bg_white_with_press_state);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            if (!z11) {
                GroupAvatarView groupAvatarView = new GroupAvatarView(viewGroup.getContext());
                groupAvatarView.setId(AbstractC6918a0.img_avt);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
                layoutParams.gravity = 16;
                layoutParams.setMarginStart(AbstractC23136l9.m118742r(16.0f));
                layoutParams.setMargins(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(12.0f));
                frameLayout.addView(groupAvatarView, layoutParams);
            } else {
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C25174m c25174m = new C25174m(context);
                c25174m.m89106L().m89028L(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
                Context context2 = viewGroup.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                MiniProgramAvatarModuleView miniProgramAvatarModuleView = new MiniProgramAvatarModuleView(context2, c25174m);
                miniProgramAvatarModuleView.setId(AbstractC6918a0.img_avt);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(24.0f));
                layoutParams2.gravity = 16;
                layoutParams2.setMarginStart(AbstractC23136l9.m118742r(16.0f));
                layoutParams2.setMargins(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(12.0f));
                frameLayout.addView(miniProgramAvatarModuleView, layoutParams2);
            }
            Context context3 = viewGroup.getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context3);
            robotoTextView.setId(AbstractC6918a0.name);
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            robotoTextView.setMaxLines(1);
            robotoTextView.setGravity(16);
            robotoTextView.setIncludeFontPadding(false);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setTextSize(0, AbstractC23136l9.m118742r(14.0f));
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(AbstractC23136l9.m118742r(56.0f), AbstractC23136l9.m118742r(15.0f), AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(15.0f));
            layoutParams3.gravity = 16;
            frameLayout.addView(robotoTextView, layoutParams3);
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView.setId(AbstractC6918a0.btn_close);
            zAppCompatImageView.setImageResource(AbstractC16803z.ic_search_global_prestate_delete);
            int m118742r = AbstractC23136l9.m118742r(19.0f);
            zAppCompatImageView.setPadding(m118742r, m118742r, m118742r, m118742r);
            zAppCompatImageView.setVisibility(8);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
            layoutParams4.gravity = 8388629;
            frameLayout.addView(zAppCompatImageView, layoutParams4);
            return frameLayout;
        }

        /* renamed from: e */
        public final int m73301e(ViewGroup viewGroup) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            if (viewGroup.getResources().getConfiguration().screenWidthDp == AbstractC13047d.f67343S) {
                return AbstractC13047d.f67342R;
            }
            int i11 = viewGroup.getResources().getConfiguration().screenWidthDp - 16;
            float f11 = 0.0f;
            for (int i12 = 4; i12 < 7; i12++) {
                f11 = i11 / i12;
                if (f11 > 104.0f) {
                    if (i12 == 6) {
                        f11 = 104.0f;
                    }
                } else {
                    if (f11 >= 72.0f) {
                        break;
                    }
                    f11 = 72.0f;
                }
            }
            AbstractC13047d.f67342R = AbstractC23136l9.m118742r(f11);
            return AbstractC13047d.f67342R;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC13047d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
            super(AbstractC13047d.Companion.m73299c(viewGroup, false), interfaceC18319c);
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC13047d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
            super(AbstractC13047d.Companion.m73299c(viewGroup, true), interfaceC18319c);
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC13047d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
            super(AbstractC13047d.Companion.m73300d(viewGroup, false), interfaceC18319c);
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC13047d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
            super(AbstractC13047d.Companion.m73300d(viewGroup, true), interfaceC18319c);
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ View f67354q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.f67354q = view;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23528a mo12V4() {
            return new C23528a(this.f67354q.getContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d$g */
    /* loaded from: classes6.dex */
    public static final class g extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ View f67355q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(View view) {
            super(0);
            this.f67355q = view;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3977j mo12V4() {
            Context context = this.f67355q.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new C3977j(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d$h */
    /* loaded from: classes6.dex */
    public static final class h extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ View f67356q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(View view) {
            super(0);
            this.f67356q = view;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ImageView mo12V4() {
            return (ImageView) this.f67356q.findViewById(AbstractC6918a0.btn_close);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d$i */
    /* loaded from: classes6.dex */
    public static final class i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ View f67357q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(View view) {
            super(0);
            this.f67357q = view;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final RobotoTextView mo12V4() {
            return (RobotoTextView) this.f67357q.findViewById(AbstractC6918a0.name);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.d$j */
    /* loaded from: classes6.dex */
    public static final class j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ View f67358q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(View view) {
            super(0);
            this.f67358q = view;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ImageView mo12V4() {
            return (ImageView) this.f67358q.findViewById(AbstractC13047d.f67344T);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC13047d(View view, InterfaceC18319c interfaceC18319c) {
        super(view);
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        InterfaceC24854k m129210a4;
        InterfaceC24854k m129210a5;
        AbstractC19074t.m100208f(view, "itemView");
        this.f67345I = interfaceC18319c;
        m129210a = AbstractC24856m.m129210a(new f(view));
        this.f67348L = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new g(view));
        this.f67349M = m129210a2;
        this.f67350N = view.findViewById(AbstractC6918a0.img_avt);
        m129210a3 = AbstractC24856m.m129210a(new i(view));
        this.f67351O = m129210a3;
        m129210a4 = AbstractC24856m.m129210a(new h(view));
        this.f67352P = m129210a4;
        m129210a5 = AbstractC24856m.m129210a(new j(view));
        this.f67353Q = m129210a5;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.a
            public /* synthetic */ ViewOnClickListenerC13041a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC13047d.m73280l0(AbstractC13047d.this, view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.b
            public /* synthetic */ ViewOnLongClickListenerC13043b() {
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean m73281m0;
                m73281m0 = AbstractC13047d.m73281m0(AbstractC13047d.this, view2);
                return m73281m0;
            }
        });
        m73290x0().setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.c
            public /* synthetic */ ViewOnClickListenerC13045c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC13047d.m73282n0(AbstractC13047d.this, view2);
            }
        });
    }

    /* renamed from: C0 */
    private final void m73276C0() {
        this.f7784p.clearAnimation();
        this.f7784p.setPivotX(0.5f);
        this.f7784p.setPivotY(0.5f);
    }

    /* renamed from: l0 */
    public static final void m73280l0(AbstractC13047d abstractC13047d, View view) {
        InterfaceC18319c interfaceC18319c;
        AbstractC19074t.m100208f(abstractC13047d, "this$0");
        AbstractC28275a.b bVar = abstractC13047d.f67346J;
        if (bVar != null && bVar.m142475c() != null && (interfaceC18319c = abstractC13047d.f67345I) != null) {
        }
    }

    /* renamed from: m0 */
    public static final boolean m73281m0(AbstractC13047d abstractC13047d, View view) {
        AbstractC19074t.m100208f(abstractC13047d, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC13047d.f67345I;
        if (interfaceC18319c != null) {
            return true;
        }
        return true;
    }

    /* renamed from: n0 */
    public static final void m73282n0(AbstractC13047d abstractC13047d, View view) {
        AbstractC19074t.m100208f(abstractC13047d, "this$0");
        try {
            InterfaceC18319c interfaceC18319c = abstractC13047d.f67345I;
            if (interfaceC18319c != null) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t0 */
    public static /* synthetic */ void m73287t0(AbstractC13047d abstractC13047d, AbstractC28275a.b bVar, boolean z11, Object obj, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                obj = null;
            }
            abstractC13047d.m73295s0(bVar, z11, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    /* renamed from: v0 */
    private final C23528a m73288v0() {
        return (C23528a) this.f67348L.getValue();
    }

    /* renamed from: w0 */
    private final C3977j m73289w0() {
        return (C3977j) this.f67349M.getValue();
    }

    /* renamed from: x0 */
    private final ImageView m73290x0() {
        return (ImageView) this.f67352P.getValue();
    }

    /* renamed from: y0 */
    private final RobotoTextView m73291y0() {
        return (RobotoTextView) this.f67351O.getValue();
    }

    /* renamed from: z0 */
    private final ImageView m73292z0() {
        return (ImageView) this.f67353Q.getValue();
    }

    /* renamed from: A0 */
    public final void m73293A0() {
        AbstractC28275a.j jVar;
        AbstractC28275a.b bVar = this.f67346J;
        if (bVar != null) {
            jVar = bVar.m142471f();
        } else {
            jVar = null;
        }
        if (AbstractC19074t.m100204b(jVar, AbstractC28275a.j.a.f131918a)) {
            this.f7784p.clearAnimation();
        }
    }

    /* renamed from: B0 */
    public final void m73294B0() {
        AbstractC28275a.j jVar;
        AbstractC28275a.b bVar = this.f67346J;
        if (bVar != null) {
            jVar = bVar.m142471f();
        } else {
            jVar = null;
        }
        if (!AbstractC19074t.m100204b(jVar, AbstractC28275a.j.a.f131918a)) {
            return;
        }
        RotateAnimation rotateAnimation = new RotateAnimation(-3.0f, 3.0f, 1, 0.4f, 1, 0.45f);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setRepeatMode(2);
        rotateAnimation.setDuration(120L);
        rotateAnimation.setStartOffset((-30) + AbstractC21317c.f103810p.mo110379h(60L));
        this.f7784p.clearAnimation();
        this.f7784p.startAnimation(rotateAnimation);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* renamed from: s0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m73295s0(AbstractC28275a.b bVar, boolean z11, Object obj) {
        boolean z12;
        InterfaceC18319c interfaceC18319c;
        C18316b c18316b;
        int i11;
        AbstractC19074t.m100208f(bVar, "data");
        this.f67346J = bVar;
        KeyEvent.Callback callback = this.f7784p;
        AbstractC19074t.m100207e(callback, "itemView");
        ContactProfile contactProfile = null;
        if (callback instanceof InterfaceC16976f1) {
            if (bVar instanceof AbstractC28275a.n) {
                InterfaceC16976f1 interfaceC16976f1 = (InterfaceC16976f1) callback;
                interfaceC16976f1.setIdTracking("gs_prestate_quick_access");
                C0708i c0708i = new C0708i();
                String mo2478b = bVar.m142475c().mo2478b();
                AbstractC19074t.m100207e(mo2478b, "getUid(...)");
                c0708i.m1075f("uid", mo2478b);
                interfaceC16976f1.setTrackingExtraData(c0708i);
            } else {
                InterfaceC16976f1 interfaceC16976f12 = (InterfaceC16976f1) callback;
                interfaceC16976f12.setIdTracking("no_tracking");
                interfaceC16976f12.setTrackingExtraData(null);
            }
        }
        boolean m100204b = AbstractC19074t.m100204b(bVar.m142471f(), AbstractC28275a.j.b.f131919a);
        if (obj == null) {
            m73291y0().setText(bVar.m142476d());
            ImageView m73292z0 = m73292z0();
            if (m73292z0 != null) {
                InterfaceC0861a m142475c = bVar.m142475c();
                if (m142475c instanceof ContactProfile) {
                    contactProfile = (ContactProfile) m142475c;
                }
                if (contactProfile != null && (contactProfile.m40359B0() || contactProfile.m40372J0() || AbstractC25495a.m132086k(contactProfile.f42434r))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                m73292z0.setVisibility(i11);
            }
        }
        m73296u0(bVar, z11, obj, m100204b);
        if (obj == null || AbstractC19074t.m100204b(obj, "ChangeEditMode") || AbstractC19074t.m100204b(obj, "ResumeShaking")) {
            try {
                interfaceC18319c = this.f67345I;
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (interfaceC18319c != null && (c18316b = (C18316b) interfaceC18319c.mo205i9(new C18316b("Search.PreState.IsEditorState", null, null, null, 14, null))) != null) {
                z12 = AbstractC19074t.m100204b(c18316b.m97245a(), Boolean.TRUE);
                this.f67347K = z12;
                if (!m100204b) {
                    m73290x0().setVisibility(0);
                    return;
                }
                if (z12) {
                    if (m73290x0().getVisibility() != 0) {
                        AutoTransition autoTransition = new AutoTransition();
                        autoTransition.addTarget((View) m73290x0());
                        autoTransition.setDuration(125L);
                        ViewParent parent = m73290x0().getParent();
                        AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                        TransitionManager.beginDelayedTransition((ViewGroup) parent, autoTransition);
                        m73290x0().setVisibility(0);
                        m73294B0();
                        return;
                    }
                    if (AbstractC19074t.m100204b(obj, "ResumeShaking")) {
                        m73294B0();
                        return;
                    }
                    return;
                }
                if (m73290x0().getVisibility() != 8) {
                    AutoTransition autoTransition2 = new AutoTransition();
                    autoTransition2.addTarget((View) m73290x0());
                    autoTransition2.setDuration(125L);
                    ViewParent parent2 = m73290x0().getParent();
                    AbstractC19074t.m100206d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
                    TransitionManager.beginDelayedTransition((ViewGroup) parent2, autoTransition2);
                    m73290x0().setVisibility(8);
                    m73276C0();
                    return;
                }
                if (AbstractC19074t.m100204b(obj, "ResumeShaking")) {
                    m73276C0();
                    return;
                }
                return;
            }
            z12 = false;
            this.f67347K = z12;
            if (!m100204b) {
            }
        }
    }

    /* renamed from: u0 */
    public void m73296u0(AbstractC28275a.b bVar, boolean z11, Object obj, boolean z12) {
        GroupAvatarView groupAvatarView;
        MiniProgramAvatarModuleView miniProgramAvatarModuleView;
        AbstractC19074t.m100208f(bVar, "data");
        if (obj == null || AbstractC19074t.m100204b(obj, "ScrollStateChanged")) {
            View view = this.f67350N;
            if (view instanceof GroupAvatarView) {
                groupAvatarView = (GroupAvatarView) view;
            } else {
                groupAvatarView = null;
            }
            if (groupAvatarView != null) {
                try {
                    InterfaceC0861a m142475c = bVar.m142475c();
                    if (z12 && AbstractC25495a.m132079d(m142475c.mo2478b()) && obj == null) {
                        ((GroupAvatarView) this.f67350N).setImageResource(AbstractC16803z.ic_search_global_group);
                        View view2 = this.f67350N;
                        int m118742r = AbstractC23136l9.m118742r(16.0f);
                        view2.setPadding(m118742r, m118742r, m118742r, m118742r);
                    } else {
                        this.f67350N.setPadding(0, 0, 0, 0);
                        if (bVar.m142470e() != null) {
                            ((GroupAvatarView) this.f67350N).m75734f(bVar.m142470e().m154671e());
                        } else if (m142475c instanceof ContactProfile) {
                            AbstractC23268y2.m120027a((GroupAvatarView) this.f67350N, (ContactProfile) m142475c, false);
                        } else {
                            ((GroupAvatarView) this.f67350N).m75732d(bVar.m142474b());
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }
        if (obj == null) {
            View view3 = this.f67350N;
            if (view3 instanceof MiniProgramAvatarModuleView) {
                miniProgramAvatarModuleView = (MiniProgramAvatarModuleView) view3;
            } else {
                miniProgramAvatarModuleView = null;
            }
            if (miniProgramAvatarModuleView != null) {
                if (bVar.m142474b().length() > 0) {
                    AbstractC23268y2.m120033g(m73288v0(), m73289w0(), ((MiniProgramAvatarModuleView) this.f67350N).getModule(), bVar.m142474b(), C23278z2.m120126f0(), false);
                } else {
                    ((MiniProgramAvatarModuleView) this.f67350N).getModule().mo111925v1(null);
                }
            }
        }
    }
}

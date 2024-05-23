package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import ai.InterfaceC0861a;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.search.MiniProgramAvatarModuleView;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.RadioButton;
import ea0.InterfaceC18319c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p461qu.AbstractC25495a;
import p578vk.AbstractC28275a;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import q80.C25174m;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.g */
/* loaded from: classes6.dex */
public abstract class AbstractC13050g extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: R */
    private static final int f67361R = View.generateViewId();

    /* renamed from: I */
    private final InterfaceC18319c f67362I;

    /* renamed from: J */
    private final View f67363J;

    /* renamed from: K */
    private final C23528a f67364K;

    /* renamed from: L */
    private final InterfaceC24854k f67365L;

    /* renamed from: M */
    private final RobotoTextView f67366M;

    /* renamed from: N */
    private final CompoundButton f67367N;

    /* renamed from: O */
    private final ImageView f67368O;

    /* renamed from: P */
    private AbstractC28275a.d f67369P;

    /* renamed from: Q */
    private final CompoundButton.OnCheckedChangeListener f67370Q;

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.g$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: c */
        public final View m73318c(ViewGroup viewGroup, boolean z11) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            float f11 = 48;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(51), AbstractC23136l9.m118742r(f11));
            layoutParams.rightMargin = AbstractC23136l9.m118742r(12.0f);
            frameLayout.setLayoutParams(layoutParams);
            if (!z11) {
                GroupAvatarView groupAvatarView = new GroupAvatarView(viewGroup.getContext());
                groupAvatarView.setId(AbstractC6918a0.avatar_view);
                groupAvatarView.setImageResource(AbstractC16803z.default_avatar2);
                frameLayout.addView(groupAvatarView, new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11)));
            } else {
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C25174m c25174m = new C25174m(context);
                c25174m.m89106L().m89028L(AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11));
                Context context2 = viewGroup.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                MiniProgramAvatarModuleView miniProgramAvatarModuleView = new MiniProgramAvatarModuleView(context2, c25174m);
                miniProgramAvatarModuleView.setId(AbstractC6918a0.avatar_view);
                frameLayout.addView(miniProgramAvatarModuleView, new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11)));
            }
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView.setId(AbstractC13050g.f67361R);
            zAppCompatImageView.setImageResource(AbstractC16803z.ic_oa_verify);
            zAppCompatImageView.setVisibility(8);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            float f12 = f11 - 16.0f;
            layoutParams2.setMargins(AbstractC23136l9.m118742r(f12), AbstractC23136l9.m118742r(f12), 0, 0);
            frameLayout.addView(zAppCompatImageView, layoutParams2);
            ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView2.setId(AbstractC13050g.f67361R);
            zAppCompatImageView2.setImageResource(AbstractC16803z.ic_oa_verify);
            zAppCompatImageView2.setVisibility(8);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            layoutParams3.setMargins(AbstractC23136l9.m118742r(f12), AbstractC23136l9.m118742r(f12), 0, 0);
            frameLayout.addView(zAppCompatImageView2, layoutParams3);
            ZAppCompatImageView zAppCompatImageView3 = new ZAppCompatImageView(frameLayout.getContext());
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(f11), AbstractC23136l9.m118742r(f11));
            zAppCompatImageView3.setImageResource(AbstractC16803z.roundedcorneredview_bbv_avt_selected);
            zAppCompatImageView3.setVisibility(8);
            frameLayout.addView(zAppCompatImageView3, layoutParams4);
            ZAppCompatImageView zAppCompatImageView4 = new ZAppCompatImageView(frameLayout.getContext());
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(18.0f), AbstractC23136l9.m118742r(18.0f));
            layoutParams5.gravity = 8388661;
            zAppCompatImageView4.setImageResource(AbstractC16803z.icn_remove);
            zAppCompatImageView4.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            zAppCompatImageView4.setVisibility(0);
            frameLayout.addView(zAppCompatImageView4, layoutParams5);
            return frameLayout;
        }

        /* renamed from: d */
        public final View m73319d(ViewGroup viewGroup, boolean z11) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            int m118742r = AbstractC23136l9.m118742r(12.0f);
            int m118742r2 = AbstractC23136l9.m118742r(16.0f);
            int m118742r3 = AbstractC23136l9.m118742r(48.0f);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, AbstractC23136l9.m118742r(72.0f)));
            frameLayout.setBackgroundResource(AbstractC16803z.search_global_bg_rect_white_with_press_state);
            if (!z11) {
                GroupAvatarView groupAvatarView = new GroupAvatarView(viewGroup.getContext());
                groupAvatarView.setId(AbstractC6918a0.avatar_view);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m118742r3, m118742r3);
                layoutParams.setMargins(m118742r2, m118742r, 0, m118742r);
                layoutParams.gravity = 8388627;
                frameLayout.addView(groupAvatarView, layoutParams);
            } else {
                Context context = viewGroup.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C25174m c25174m = new C25174m(context);
                c25174m.m89106L().m89028L(m118742r3, m118742r3);
                Context context2 = viewGroup.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                MiniProgramAvatarModuleView miniProgramAvatarModuleView = new MiniProgramAvatarModuleView(context2, c25174m);
                miniProgramAvatarModuleView.setId(AbstractC6918a0.avatar_view);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(m118742r3, m118742r3);
                layoutParams2.setMargins(m118742r2, m118742r, 0, m118742r);
                layoutParams2.gravity = 8388627;
                frameLayout.addView(miniProgramAvatarModuleView, layoutParams2);
            }
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView.setId(AbstractC13050g.f67361R);
            zAppCompatImageView.setImageResource(AbstractC16803z.ic_oa_verify);
            zAppCompatImageView.setVisibility(8);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            layoutParams3.setMargins(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(44.0f), 0, 0);
            frameLayout.addView(zAppCompatImageView, layoutParams3);
            ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView2.setId(AbstractC13050g.f67361R);
            zAppCompatImageView2.setImageResource(AbstractC16803z.ic_oa_verify);
            zAppCompatImageView2.setVisibility(8);
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(16.0f));
            layoutParams4.setMargins(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(44.0f), 0, 0);
            frameLayout.addView(zAppCompatImageView2, layoutParams4);
            Context context3 = viewGroup.getContext();
            AbstractC19074t.m100207e(context3, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context3);
            robotoTextView.setId(AbstractC6918a0.tv_text);
            FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams5.setMargins(AbstractC23136l9.m118742r(80.0f), m118742r, AbstractC23136l9.m118742r(56.0f), m118742r);
            layoutParams5.gravity = 16;
            robotoTextView.setMaxLines(1);
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            robotoTextView.setTextSize(0, AbstractC23136l9.m118742r(15.0f));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            frameLayout.addView(robotoTextView, layoutParams5);
            Context context4 = viewGroup.getContext();
            AbstractC19074t.m100207e(context4, "getContext(...)");
            RadioButton radioButton = new RadioButton(context4);
            radioButton.setId(AbstractC6918a0.checkbox);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams6.setMargins(0, m118742r, m118742r2, m118742r);
            layoutParams6.gravity = 8388629;
            radioButton.setClickable(false);
            radioButton.setFocusable(false);
            radioButton.setDuplicateParentStateEnabled(false);
            frameLayout.addView(radioButton, layoutParams6);
            return frameLayout;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.g$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC13050g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
            super(AbstractC13050g.Companion.m73318c(viewGroup, false), interfaceC18319c, null);
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.g$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC13050g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
            super(AbstractC13050g.Companion.m73318c(viewGroup, true), interfaceC18319c, null);
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.g$d */
    /* loaded from: classes6.dex */
    public static final class d extends AbstractC13050g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
            super(AbstractC13050g.Companion.m73319d(viewGroup, false), interfaceC18319c, null);
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.g$e */
    /* loaded from: classes6.dex */
    public static final class e extends AbstractC13050g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
            super(AbstractC13050g.Companion.m73319d(viewGroup, true), interfaceC18319c, null);
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.g$f */
    /* loaded from: classes6.dex */
    public static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ View f67371q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.f67371q = view;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C3977j mo12V4() {
            Context context = this.f67371q.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            return new C3977j(context);
        }
    }

    public /* synthetic */ AbstractC13050g(View view, InterfaceC18319c interfaceC18319c, AbstractC19060k abstractC19060k) {
        this(view, interfaceC18319c);
    }

    /* renamed from: k0 */
    public static final void m73309k0(AbstractC13050g abstractC13050g, View view) {
        AbstractC19074t.m100208f(abstractC13050g, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC13050g.f67362I;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m73311n0(AbstractC13050g abstractC13050g, AbstractC28275a.d dVar, boolean z11, Object obj, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 4) != 0) {
                obj = null;
            }
            abstractC13050g.m73314m0(dVar, z11, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    /* renamed from: p0 */
    private final C3977j m73312p0() {
        return (C3977j) this.f67365L.getValue();
    }

    /* renamed from: q0 */
    public static final void m73313q0(AbstractC13050g abstractC13050g, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(abstractC13050g, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC13050g.f67362I;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: m0 */
    public final void m73314m0(AbstractC28275a.d dVar, boolean z11, Object obj) {
        CompoundButton compoundButton;
        RadioButton radioButton;
        ContactProfile contactProfile;
        int i11;
        AbstractC19074t.m100208f(dVar, "dataItem");
        this.f67369P = dVar;
        C24848g0 c24848g0 = null;
        if (obj == null) {
            RobotoTextView robotoTextView = this.f67366M;
            if (robotoTextView != null) {
                robotoTextView.setText(dVar.m142476d());
            }
            ImageView imageView = this.f67368O;
            if (imageView != null) {
                InterfaceC0861a m142475c = dVar.m142475c();
                if (m142475c instanceof ContactProfile) {
                    contactProfile = (ContactProfile) m142475c;
                } else {
                    contactProfile = null;
                }
                if (contactProfile != null && (contactProfile.m40359B0() || contactProfile.m40372J0() || AbstractC25495a.m132086k(contactProfile.f42434r))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
        }
        m73315o0(dVar, z11, obj);
        if (obj == null || AbstractC19074t.m100204b(obj, "OnSelectStateChanged")) {
            CompoundButton compoundButton2 = this.f67367N;
            if ((compoundButton2 == null || compoundButton2.isChecked() != dVar.m142479g()) && (compoundButton = this.f67367N) != null) {
                compoundButton.setOnCheckedChangeListener(null);
                if (compoundButton instanceof RadioButton) {
                    radioButton = (RadioButton) compoundButton;
                } else {
                    radioButton = null;
                }
                if (radioButton != null) {
                    radioButton.m90615f(dVar.m142479g(), AbstractC19074t.m100204b(obj, "OnSelectStateChanged"));
                    c24848g0 = C24848g0.f119245a;
                }
                if (c24848g0 == null) {
                    compoundButton.setChecked(dVar.m142479g());
                }
                compoundButton.setOnCheckedChangeListener(this.f67370Q);
            }
        }
    }

    /* renamed from: o0 */
    public void m73315o0(AbstractC28275a.d dVar, boolean z11, Object obj) {
        GroupAvatarView groupAvatarView;
        MiniProgramAvatarModuleView miniProgramAvatarModuleView;
        AbstractC19074t.m100208f(dVar, "dataItem");
        if (obj == null || AbstractC19074t.m100204b(obj, "ScrollStateChanged")) {
            View view = this.f67363J;
            if (view instanceof GroupAvatarView) {
                groupAvatarView = (GroupAvatarView) view;
            } else {
                groupAvatarView = null;
            }
            if (groupAvatarView != null) {
                if (dVar.m142475c() instanceof ContactProfile) {
                    AbstractC23268y2.m120027a((GroupAvatarView) this.f67363J, (ContactProfile) dVar.m142475c(), false);
                } else {
                    ((GroupAvatarView) this.f67363J).m75732d(dVar.m142474b());
                }
            }
        }
        if (obj == null) {
            View view2 = this.f67363J;
            if (view2 instanceof MiniProgramAvatarModuleView) {
                miniProgramAvatarModuleView = (MiniProgramAvatarModuleView) view2;
            } else {
                miniProgramAvatarModuleView = null;
            }
            if (miniProgramAvatarModuleView != null) {
                if (dVar.m142474b().length() > 0) {
                    AbstractC23268y2.m120033g(this.f67364K, m73312p0(), ((MiniProgramAvatarModuleView) this.f67363J).getModule(), dVar.m142474b(), C23278z2.m120126f0(), false);
                } else {
                    ((MiniProgramAvatarModuleView) this.f67363J).getModule().mo111925v1(null);
                }
            }
        }
    }

    private AbstractC13050g(View view, InterfaceC18319c interfaceC18319c) {
        super(view);
        InterfaceC24854k m129210a;
        this.f67362I = interfaceC18319c;
        this.f67363J = view.findViewById(AbstractC6918a0.avatar_view);
        this.f67364K = new C23528a(view.getContext());
        m129210a = AbstractC24856m.m129210a(new f(view));
        this.f67365L = m129210a;
        this.f67366M = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_text);
        this.f67367N = (CompoundButton) view.findViewById(AbstractC6918a0.checkbox);
        this.f67368O = (ImageView) view.findViewById(f67361R);
        this.f67370Q = new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.e
            public /* synthetic */ C13048e() {
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                AbstractC13050g.m73313q0(AbstractC13050g.this, compoundButton, z11);
            }
        };
        view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.f
            public /* synthetic */ ViewOnClickListenerC13049f() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC13050g.m73309k0(AbstractC13050g.this, view2);
            }
        });
    }
}

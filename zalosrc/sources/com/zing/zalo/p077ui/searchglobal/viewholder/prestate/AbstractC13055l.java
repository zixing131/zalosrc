package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.content.Context;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p578vk.AbstractC28275a;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.l */
/* loaded from: classes6.dex */
public abstract class AbstractC13055l extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private final InterfaceC18319c f67379I;

    /* renamed from: J */
    private final TextView f67380J;

    /* renamed from: K */
    private final ImageView f67381K;

    /* renamed from: L */
    private AbstractC28275a.h f67382L;

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.l$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ViewGroup m73333a(ViewGroup viewGroup) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            int m118742r = AbstractC23136l9.m118742r(4.0f);
            int m118742r2 = AbstractC23136l9.m118742r(8.0f);
            int m118742r3 = AbstractC23136l9.m118742r(12.0f);
            int m118742r4 = AbstractC23136l9.m118742r(14.0f);
            int m118742r5 = AbstractC23136l9.m118742r(28.0f);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
            frameLayout.setPadding(0, 0, 0, m118742r3);
            FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
            frameLayout2.setPadding(m118742r3, m118742r2, m118742r3, m118742r2);
            frameLayout2.setBackgroundResource(AbstractC16803z.search_global_bg_filter_with_press_state);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(m118742r, m118742r + m118742r3, m118742r, m118742r);
            frameLayout.addView(frameLayout2, layoutParams);
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(viewGroup.getContext());
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(m118742r4, m118742r4);
            layoutParams2.gravity = 16;
            zAppCompatImageView.setImageResource(AbstractC16803z.ic_search_global_prestate_query);
            frameLayout2.addView(zAppCompatImageView, layoutParams2);
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setTextSize(0, m118742r4);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setId(AbstractC6918a0.tv_text);
            int i11 = m118742r3 / 2;
            robotoTextView.setPadding(m118742r4 + i11, 0, 0, 0);
            frameLayout2.addView(robotoTextView, -2, -2);
            ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView2.setId(AbstractC6918a0.btn_close);
            zAppCompatImageView2.setVisibility(8);
            zAppCompatImageView2.setPadding(m118742r, m118742r, m118742r, m118742r);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(m118742r5, m118742r5);
            layoutParams3.gravity = 8388661;
            layoutParams3.topMargin = (m118742r3 + i11) - (m118742r5 / 2);
            zAppCompatImageView2.setImageResource(AbstractC16803z.icn_remove);
            frameLayout.addView(zAppCompatImageView2, layoutParams3);
            return frameLayout;
        }

        /* renamed from: b */
        public final ViewGroup m73334b(ViewGroup viewGroup) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setBackgroundResource(AbstractC16803z.search_global_bg_rect_transparent_with_press_state);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, AbstractC23136l9.m118742r(52.0f)));
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView.setImageResource(AbstractC16803z.ic_search_global_prestate_query);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(18.0f), AbstractC23136l9.m118742r(18.0f));
            layoutParams.gravity = 16;
            layoutParams.setMargins(AbstractC23136l9.m118742r(19.0f), AbstractC23136l9.m118742r(15.0f), 0, AbstractC23136l9.m118742r(15.0f));
            frameLayout.addView(zAppCompatImageView, layoutParams);
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setId(AbstractC6918a0.tv_text);
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            robotoTextView.setMaxLines(1);
            robotoTextView.setGravity(16);
            robotoTextView.setIncludeFontPadding(false);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setMaxScaledTextSize(AbstractC23136l9.m118742r(18.0f));
            robotoTextView.setTextSize(0, AbstractC23136l9.m118742r(14.0f));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(AbstractC23136l9.m118742r(56.0f), AbstractC23136l9.m118742r(15.0f), AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(15.0f));
            layoutParams2.gravity = 16;
            frameLayout.addView(robotoTextView, layoutParams2);
            ZAppCompatImageView zAppCompatImageView2 = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView2.setId(AbstractC6918a0.btn_close);
            zAppCompatImageView2.setImageResource(AbstractC16803z.ic_search_global_prestate_delete);
            int m118742r = AbstractC23136l9.m118742r(19.0f);
            zAppCompatImageView2.setPadding(m118742r, m118742r, m118742r, m118742r);
            zAppCompatImageView2.setVisibility(8);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
            layoutParams3.gravity = 8388629;
            frameLayout.addView(zAppCompatImageView2, layoutParams3);
            return frameLayout;
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.l$b */
    /* loaded from: classes6.dex */
    public static final class b extends AbstractC13055l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
            super(AbstractC13055l.Companion.m73333a(viewGroup), interfaceC18319c, null);
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.l$c */
    /* loaded from: classes6.dex */
    public static final class c extends AbstractC13055l {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
            super(AbstractC13055l.Companion.m73334b(viewGroup), interfaceC18319c, null);
            AbstractC19074t.m100208f(viewGroup, "parent");
        }
    }

    public /* synthetic */ AbstractC13055l(View view, InterfaceC18319c interfaceC18319c, AbstractC19060k abstractC19060k) {
        this(view, interfaceC18319c);
    }

    /* renamed from: l0 */
    public static final void m73327l0(AbstractC13055l abstractC13055l, View view) {
        AbstractC19074t.m100208f(abstractC13055l, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC13055l.f67379I;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: m0 */
    public static final boolean m73328m0(AbstractC13055l abstractC13055l, View view) {
        AbstractC19074t.m100208f(abstractC13055l, "this$0");
        InterfaceC18319c interfaceC18319c = abstractC13055l.f67379I;
        if (interfaceC18319c != null) {
            return true;
        }
        return true;
    }

    /* renamed from: n0 */
    public static final void m73329n0(AbstractC13055l abstractC13055l, View view) {
        AbstractC19074t.m100208f(abstractC13055l, "this$0");
        try {
            InterfaceC18319c interfaceC18319c = abstractC13055l.f67379I;
            if (interfaceC18319c != null) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p0 */
    public static /* synthetic */ void m73330p0(AbstractC13055l abstractC13055l, AbstractC28275a.h hVar, Object obj, int i11, Object obj2) {
        if (obj2 == null) {
            if ((i11 & 2) != 0) {
                obj = null;
            }
            abstractC13055l.m73332o0(hVar, obj);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bind");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:            if (fn0.AbstractC19074t.m100204b(r12.m97245a(), java.lang.Boolean.TRUE) != false) goto L47;     */
    /* renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m73331q0(AbstractC28275a.h hVar) {
        if (this.f67381K == null) {
            return;
        }
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!AbstractC19074t.m100204b(hVar.m142485c(), AbstractC28275a.j.b.f131919a)) {
            InterfaceC18319c interfaceC18319c = this.f67379I;
            if (interfaceC18319c != null && (r12 = (C18316b) interfaceC18319c.mo205i9(new C18316b("Search.PreState.IsEditorState", null, null, null, 14, null))) != null) {
            }
            if (this.f67381K.getVisibility() != 8) {
                AutoTransition autoTransition = new AutoTransition();
                autoTransition.addTarget((View) this.f67381K);
                autoTransition.setDuration(125L);
                ViewParent parent = this.f67381K.getParent();
                AbstractC19074t.m100206d(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                TransitionManager.beginDelayedTransition((ViewGroup) parent, autoTransition);
                this.f67381K.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f67381K.getVisibility() != 0) {
            AutoTransition autoTransition2 = new AutoTransition();
            autoTransition2.addTarget((View) this.f67381K);
            autoTransition2.setDuration(125L);
            ViewParent parent2 = this.f67381K.getParent();
            AbstractC19074t.m100206d(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            TransitionManager.beginDelayedTransition((ViewGroup) parent2, autoTransition2);
            this.f67381K.setVisibility(0);
        }
    }

    /* renamed from: o0 */
    public final void m73332o0(AbstractC28275a.h hVar, Object obj) {
        AbstractC19074t.m100208f(hVar, "data");
        this.f67382L = hVar;
        if (obj == null) {
            this.f67380J.setText(hVar.m142484b());
        }
        if (obj == null || AbstractC19074t.m100204b(obj, "ChangeEditMode")) {
            m73331q0(hVar);
        }
    }

    private AbstractC13055l(View view, InterfaceC18319c interfaceC18319c) {
        super(view);
        this.f67379I = interfaceC18319c;
        this.f67380J = (TextView) this.f7784p.findViewById(AbstractC6918a0.tv_text);
        ImageView imageView = (ImageView) this.f7784p.findViewById(AbstractC6918a0.btn_close);
        this.f67381K = imageView;
        this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.i
            public /* synthetic */ ViewOnClickListenerC13052i() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                AbstractC13055l.m73327l0(AbstractC13055l.this, view2);
            }
        });
        this.f7784p.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.j
            public /* synthetic */ ViewOnLongClickListenerC13053j() {
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean m73328m0;
                m73328m0 = AbstractC13055l.m73328m0(AbstractC13055l.this, view2);
                return m73328m0;
            }
        });
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.k
                public /* synthetic */ ViewOnClickListenerC13054k() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    AbstractC13055l.m73329n0(AbstractC13055l.this, view2);
                }
            });
        }
    }
}

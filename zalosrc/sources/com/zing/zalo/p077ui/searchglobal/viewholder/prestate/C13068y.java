package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.Switch;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p578vk.AbstractC28275a;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.y */
/* loaded from: classes6.dex */
public final class C13068y extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private final RobotoTextView f67408I;

    /* renamed from: J */
    private final Switch f67409J;

    /* renamed from: K */
    private final View f67410K;

    /* renamed from: L */
    private AbstractC28275a.x f67411L;

    /* renamed from: M */
    private final CompoundButton.OnCheckedChangeListener f67412M;

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.y$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final View m73364a(ViewGroup viewGroup) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            int m118742r = AbstractC23136l9.m118742r(14.0f);
            int m118742r2 = AbstractC23136l9.m118742r(15.0f);
            int m118742r3 = AbstractC23136l9.m118742r(16.0f);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            frameLayout.setBackgroundColor(C23212s8.m119607o(frameLayout.getContext(), AbstractC16781w.PrimaryBackgroundColor));
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setId(AbstractC6918a0.tv_text);
            robotoTextView.setTextSize(0, m118742r);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(m118742r3, m118742r2, AbstractC23136l9.m118742r(72.0f), m118742r2);
            frameLayout.addView(robotoTextView, layoutParams);
            View view = new View(viewGroup.getContext());
            view.setId(AbstractC6918a0.click_view);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(72.0f), -1);
            layoutParams2.gravity = 8388613;
            frameLayout.addView(view, layoutParams2);
            Context context2 = viewGroup.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            Switch r12 = new Switch(context2, null);
            r12.setId(AbstractC6918a0.stencil_switch);
            r12.setDuplicateParentStateEnabled(true);
            r12.m90686i(true, false);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, AbstractC23136l9.m118742r(48.0f));
            layoutParams3.gravity = 8388629;
            layoutParams3.setMarginEnd(m118742r3);
            frameLayout.addView(r12, layoutParams3);
            return frameLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13068y(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(Companion.m73364a(viewGroup));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f67408I = (RobotoTextView) this.f7784p.findViewById(AbstractC6918a0.tv_text);
        Switch r32 = (Switch) this.f7784p.findViewById(AbstractC6918a0.stencil_switch);
        this.f67409J = r32;
        View findViewById = this.f7784p.findViewById(AbstractC6918a0.click_view);
        this.f67410K = findViewById;
        C13066w c13066w = new CompoundButton.OnCheckedChangeListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.w

            /* renamed from: b */
            public final /* synthetic */ C13068y f67406b;

            public /* synthetic */ C13066w(C13068y this) {
                r2 = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                C13068y.m73362n0(InterfaceC18319c.this, r2, compoundButton, z11);
            }
        };
        this.f67412M = c13066w;
        r32.setOnCheckedChangeListener(c13066w);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.x
            public /* synthetic */ ViewOnClickListenerC13067x() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13068y.m73360k0(C13068y.this, view);
            }
        });
    }

    /* renamed from: k0 */
    public static final void m73360k0(C13068y c13068y, View view) {
        AbstractC19074t.m100208f(c13068y, "this$0");
        c13068y.f67409J.setChecked(!r0.isChecked());
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m73361m0(C13068y c13068y, AbstractC28275a.x xVar, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        c13068y.m73363l0(xVar, obj);
    }

    /* renamed from: n0 */
    public static final void m73362n0(InterfaceC18319c interfaceC18319c, C13068y c13068y, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(c13068y, "this$0");
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: l0 */
    public final void m73363l0(AbstractC28275a.x xVar, Object obj) {
        AbstractC19074t.m100208f(xVar, "data");
        if (obj == null) {
            this.f67408I.setText(xVar.m142504a().m142506a());
        }
        if ((obj == null || AbstractC19074t.m100204b(obj, "OnSelectStateChanged")) && this.f67409J.isChecked() != xVar.m142505b()) {
            this.f67409J.setOnCheckedChangeListener(null);
            this.f67409J.m90686i(xVar.m142505b(), false);
            this.f67409J.setOnCheckedChangeListener(this.f67412M);
        }
        this.f67411L = xVar;
    }
}

package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p578vk.AbstractC28275a;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.v */
/* loaded from: classes6.dex */
public final class C13065v extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private final InterfaceC18319c f67401I;

    /* renamed from: J */
    private AbstractC28275a.u f67402J;

    /* renamed from: K */
    private final RobotoTextView f67403K;

    /* renamed from: L */
    private final ZAppCompatImageView f67404L;

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.v$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final View m73357a(ViewGroup viewGroup) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            int m73301e = AbstractC13047d.Companion.m73301e(viewGroup);
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            int m118742r = AbstractC23136l9.m118742r(4.0f);
            int m118742r2 = AbstractC23136l9.m118742r(64.0f);
            linearLayout.setOrientation(1);
            linearLayout.setPadding(m118742r, 0, m118742r, 0);
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(m73301e, -2));
            linearLayout.setGravity(16);
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m118742r2, m118742r2);
            layoutParams.gravity = 1;
            linearLayout.addView(frameLayout, layoutParams);
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView.setId(AbstractC6918a0.img_avt);
            zAppCompatImageView.setImageResource(AbstractC16803z.default_avatar);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(48.0f));
            layoutParams2.gravity = 17;
            frameLayout.addView(zAppCompatImageView, layoutParams2);
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setId(AbstractC6918a0.name);
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            robotoTextView.setIncludeFontPadding(false);
            robotoTextView.setMaxLines(2);
            robotoTextView.setMinLines(2);
            robotoTextView.setText(AbstractC8020f0.str_add);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setTextSize(0, AbstractC23136l9.m118742r(14.0f));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            robotoTextView.setGravity(1);
            int m118742r3 = AbstractC23136l9.m118742r(4.0f);
            layoutParams3.setMargins(m118742r3, m118742r3, m118742r3, m118742r3);
            linearLayout.addView(robotoTextView, layoutParams3);
            return linearLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13065v(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(Companion.m73357a(viewGroup));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f67401I = interfaceC18319c;
        View findViewById = this.f7784p.findViewById(AbstractC6918a0.name);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f67403K = (RobotoTextView) findViewById;
        View findViewById2 = this.f7784p.findViewById(AbstractC6918a0.img_avt);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f67404L = (ZAppCompatImageView) findViewById2;
        this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.u
            public /* synthetic */ ViewOnClickListenerC13064u() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13065v.m73355j0(C13065v.this, view);
            }
        });
    }

    /* renamed from: j0 */
    public static final void m73355j0(C13065v c13065v, View view) {
        AbstractC19074t.m100208f(c13065v, "this$0");
        InterfaceC18319c interfaceC18319c = c13065v.f67401I;
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: k0 */
    public final void m73356k0(AbstractC28275a.u uVar) {
        AbstractC19074t.m100208f(uVar, "dataItem");
        this.f67402J = uVar;
        this.f67403K.setText(uVar.m142503b());
        this.f67404L.setImageResource(uVar.m142502a());
    }
}

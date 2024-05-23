package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p578vk.AbstractC28275a;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.h */
/* loaded from: classes6.dex */
public final class C13051h extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private final InterfaceC18319c f67372I;

    /* renamed from: J */
    private final ZAppCompatImageView f67373J;

    /* renamed from: K */
    private final RobotoTextView f67374K;

    /* renamed from: L */
    private AbstractC28275a.e f67375L;

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.h$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public final View m73323b(ViewGroup viewGroup) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            AspectRatioImageView aspectRatioImageView = new AspectRatioImageView(viewGroup.getContext());
            aspectRatioImageView.setId(AbstractC6918a0.img_avt);
            aspectRatioImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC23136l9.m118712h(viewGroup.getContext(), 80.0f), AbstractC23136l9.m118712h(viewGroup.getContext(), 80.0f));
            layoutParams.gravity = 1;
            layoutParams.topMargin = AbstractC23136l9.m118712h(viewGroup.getContext(), 16.0f);
            frameLayout.addView(aspectRatioImageView, layoutParams);
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setId(AbstractC6918a0.tv_text);
            robotoTextView.setGravity(17);
            robotoTextView.setIncludeFontPadding(false);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setTextSize(0, AbstractC23136l9.m118712h(viewGroup.getContext(), 15.0f));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(AbstractC23136l9.m118712h(viewGroup.getContext(), 48.0f), AbstractC23136l9.m118712h(viewGroup.getContext(), 112.0f), AbstractC23136l9.m118712h(viewGroup.getContext(), 48.0f), AbstractC23136l9.m118712h(viewGroup.getContext(), 16.0f));
            layoutParams2.gravity = 1;
            frameLayout.addView(robotoTextView, layoutParams2);
            return frameLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13051h(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(Companion.m73323b(viewGroup));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f67372I = interfaceC18319c;
        View findViewById = this.f7784p.findViewById(AbstractC6918a0.img_avt);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f67373J = (ZAppCompatImageView) findViewById;
        View findViewById2 = this.f7784p.findViewById(AbstractC6918a0.tv_text);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f67374K = (RobotoTextView) findViewById2;
    }

    /* renamed from: i0 */
    public final void m73321i0(AbstractC28275a.e eVar) {
        AbstractC19074t.m100208f(eVar, "dataItem");
        AbstractC28275a.e eVar2 = this.f67375L;
        if (eVar2 == null || eVar.m142481a() != eVar2.m142481a()) {
            this.f67373J.setImageResource(eVar.m142481a());
        }
        AbstractC28275a.e eVar3 = this.f67375L;
        if (eVar3 == null || eVar.m142482b() != eVar3.m142482b()) {
            this.f67374K.setText(eVar.m142482b());
        }
        this.f67375L = eVar;
    }
}

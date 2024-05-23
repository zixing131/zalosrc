package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p578vk.AbstractC28275a;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.t */
/* loaded from: classes6.dex */
public class C13063t extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private final View f67397I;

    /* renamed from: J */
    private final int f67398J;

    /* renamed from: K */
    private final int f67399K;

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.t$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final View m73353a(ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            int m118742r = AbstractC23136l9.m118742r(8.0f);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            View view = new View(viewGroup.getContext());
            view.setId(AbstractC6918a0.separator);
            view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.ItemSeparatorColor));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            if (z11) {
                layoutParams.height = m118742r;
            } else {
                layoutParams.height = 1;
                int i11 = m118742r + m118742r;
                layoutParams.setMargins(i11, m118742r, i11, 0);
            }
            frameLayout.addView(view, layoutParams);
            return frameLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13063t(ViewGroup viewGroup, boolean z11) {
        super(Companion.m73353a(viewGroup, z11));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f67397I = this.f7784p.findViewById(AbstractC6918a0.separator);
        this.f67398J = AbstractC23136l9.m118742r(8.0f);
        this.f67399K = AbstractC23136l9.m118742r(16.0f);
    }

    /* renamed from: i0 */
    public final void m73352i0(AbstractC28275a.q qVar) {
        AbstractC19074t.m100208f(qVar, "data");
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (qVar instanceof AbstractC28275a.p) {
            ViewGroup.LayoutParams layoutParams = this.f67397I.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            }
            if (marginLayoutParams != null) {
                int i11 = this.f67399K;
                marginLayoutParams.setMargins(i11, 0, i11, this.f67398J);
                this.f67397I.requestLayout();
                return;
            }
            return;
        }
        if (qVar instanceof AbstractC28275a.t) {
            ViewGroup.LayoutParams layoutParams2 = this.f67397I.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            }
            if (marginLayoutParams != null) {
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.f67397I.requestLayout();
                return;
            }
            return;
        }
        if (qVar instanceof AbstractC28275a.s) {
            ViewGroup.LayoutParams layoutParams3 = this.f67397I.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
            }
            if (marginLayoutParams != null) {
                int i12 = this.f67399K;
                marginLayoutParams.setMargins(i12, this.f67398J, i12, 0);
                this.f67397I.requestLayout();
                return;
            }
            return;
        }
        boolean z11 = qVar instanceof AbstractC28275a.r;
    }
}

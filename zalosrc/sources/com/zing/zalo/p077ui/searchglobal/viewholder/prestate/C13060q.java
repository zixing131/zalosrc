package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.q */
/* loaded from: classes6.dex */
public final class C13060q extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.q$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final View m73346a(ViewGroup viewGroup) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            int m118742r = AbstractC23136l9.m118742r(6.0f);
            int m118742r2 = AbstractC23136l9.m118742r(8.0f);
            int m118742r3 = AbstractC23136l9.m118742r(10.0f);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            FrameLayout frameLayout2 = new FrameLayout(viewGroup.getContext());
            frameLayout2.setId(AbstractC6918a0.contentPanel);
            frameLayout2.setBackgroundResource(AbstractC16803z.background_search_global_media_transparent);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(m118742r2, 0, 0, m118742r2);
            frameLayout.addView(frameLayout2, layoutParams);
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setId(AbstractC6918a0.tv_text);
            robotoTextView.setPadding(m118742r2, m118742r2, m118742r2 + m118742r2 + m118742r3, m118742r2);
            robotoTextView.setText(AbstractC8020f0.str_search_global_pre_state_edit_search_history);
            robotoTextView.setTextSize(0, AbstractC23136l9.m118742r(15.0f));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC16781w.LinkColor));
            frameLayout2.addView(robotoTextView, new FrameLayout.LayoutParams(-2, -2));
            ZAppCompatImageView zAppCompatImageView = new ZAppCompatImageView(viewGroup.getContext());
            zAppCompatImageView.setColorFilter(C23212s8.m119607o(zAppCompatImageView.getContext(), AbstractC2807a.icon_01), PorterDuff.Mode.SRC_IN);
            zAppCompatImageView.setImageResource(AbstractC16803z.ic_arrow_right);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(m118742r, m118742r3);
            layoutParams2.gravity = 8388629;
            layoutParams2.setMarginEnd(m118742r2);
            frameLayout2.addView(zAppCompatImageView, layoutParams2);
            return frameLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13060q(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(Companion.m73346a(viewGroup));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f7784p.findViewById(AbstractC6918a0.contentPanel).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.p
            public /* synthetic */ ViewOnClickListenerC13059p() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13060q.m73345j0(InterfaceC18319c.this, view);
            }
        });
    }

    /* renamed from: j0 */
    public static final void m73345j0(InterfaceC18319c interfaceC18319c, View view) {
        if (interfaceC18319c != null) {
        }
    }
}

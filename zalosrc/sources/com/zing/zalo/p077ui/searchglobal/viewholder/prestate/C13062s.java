package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
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
import p578vk.AbstractC28275a;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.s */
/* loaded from: classes6.dex */
public final class C13062s extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private AbstractC28275a.o f67396I;

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.s$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: b */
        public final View m73351b(ViewGroup viewGroup) {
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            int m118742r = AbstractC23136l9.m118742r(12.0f);
            int m118742r2 = AbstractC23136l9.m118742r(16.0f);
            frameLayout.setBackgroundResource(AbstractC16803z.background_search_global_media_transparent);
            frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setId(AbstractC6918a0.tv_text);
            robotoTextView.setPadding(m118742r2, m118742r, m118742r, m118742r);
            robotoTextView.setText(AbstractC8020f0.btn_see_more);
            robotoTextView.setTextSize(0, AbstractC23136l9.m118742r(15.0f));
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC16781w.LinkColor));
            robotoTextView.setMaxLines(1);
            robotoTextView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(robotoTextView, new FrameLayout.LayoutParams(-1, -2));
            View view = new View(viewGroup.getContext());
            view.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.ItemSeparatorColor));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
            layoutParams.setMargins(m118742r2, 0, m118742r2, 0);
            frameLayout.addView(view, layoutParams);
            return frameLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13062s(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(Companion.m73351b(viewGroup));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f7784p.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.r

            /* renamed from: q */
            public final /* synthetic */ C13062s f67395q;

            public /* synthetic */ ViewOnClickListenerC13061r(C13062s this) {
                r2 = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13062s.m73348j0(InterfaceC18319c.this, r2, view);
            }
        });
    }

    /* renamed from: j0 */
    public static final void m73348j0(InterfaceC18319c interfaceC18319c, C13062s c13062s, View view) {
        AbstractC19074t.m100208f(c13062s, "this$0");
        if (interfaceC18319c != null) {
        }
    }

    /* renamed from: k0 */
    public final void m73349k0(AbstractC28275a.o oVar) {
        AbstractC19074t.m100208f(oVar, "dataItem");
        this.f67396I = oVar;
    }
}

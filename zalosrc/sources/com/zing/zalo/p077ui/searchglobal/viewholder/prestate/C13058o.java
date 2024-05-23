package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p578vk.AbstractC28275a;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.o */
/* loaded from: classes6.dex */
public class C13058o extends RecyclerView.AbstractC1876c0 {
    public static final a Companion = new a(null);

    /* renamed from: I */
    private final InterfaceC18319c f67388I;

    /* renamed from: J */
    private final TextView f67389J;

    /* renamed from: K */
    private final TextView f67390K;

    /* renamed from: L */
    private final View f67391L;

    /* renamed from: M */
    private AbstractC28275a.k f67392M;

    /* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.o$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final View m73343a(ViewGroup viewGroup, boolean z11) {
            AbstractC19074t.m100208f(viewGroup, "parent");
            LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
            linearLayout.setOrientation(0);
            if (z11) {
                linearLayout.setBackgroundColor(C23212s8.m119607o(linearLayout.getContext(), AbstractC16781w.PrimaryBackgroundColor));
            }
            linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            Context context = viewGroup.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            RobotoTextView robotoTextView = new RobotoTextView(context);
            robotoTextView.setId(AbstractC6918a0.text);
            robotoTextView.setMaxLines(1);
            robotoTextView.setIncludeFontPadding(false);
            robotoTextView.setGravity(16);
            robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC21196a.TextColor1));
            robotoTextView.setTextSize(0, AbstractC23136l9.m118742r(14.0f));
            robotoTextView.setPaddingRelative(AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(24.0f), AbstractC23136l9.m118742r(12.0f));
            robotoTextView.setFontStyle(7);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
            layoutParams.weight = 1.0f;
            linearLayout.addView(robotoTextView, layoutParams);
            FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
            frameLayout.setId(AbstractC6918a0.container);
            frameLayout.setPadding(0, AbstractC23136l9.m118742r(10.0f), 0, AbstractC23136l9.m118742r(10.0f));
            frameLayout.setVisibility(8);
            linearLayout.addView(frameLayout, -2, -1);
            Context context2 = viewGroup.getContext();
            AbstractC19074t.m100207e(context2, "getContext(...)");
            RobotoTextView robotoTextView2 = new RobotoTextView(context2);
            robotoTextView2.setId(AbstractC6918a0.text2);
            int m118742r = AbstractC23136l9.m118742r(6.0f);
            robotoTextView2.setPadding(m118742r, m118742r, m118742r, m118742r);
            robotoTextView2.setBackgroundResource(AbstractC16803z.background_search_global_media_transparent);
            robotoTextView2.setIncludeFontPadding(false);
            robotoTextView2.setGravity(16);
            robotoTextView2.setMaxLines(1);
            robotoTextView2.setAllCaps(true);
            robotoTextView2.setDuplicateParentStateEnabled(true);
            robotoTextView2.setTextColor(C23212s8.m119607o(robotoTextView2.getContext(), AbstractC16781w.LinkColor));
            robotoTextView2.setTextSize(0, AbstractC23136l9.m118742r(14.0f));
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 16;
            frameLayout.addView(robotoTextView2, layoutParams2);
            return linearLayout;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13058o(ViewGroup viewGroup, boolean z11, InterfaceC18319c interfaceC18319c) {
        super(Companion.m73343a(viewGroup, z11));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f67388I = interfaceC18319c;
        View findViewById = this.f7784p.findViewById(AbstractC6918a0.text);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f67389J = (TextView) findViewById;
        View findViewById2 = this.f7784p.findViewById(AbstractC6918a0.text2);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f67390K = (TextView) findViewById2;
        View findViewById3 = this.f7784p.findViewById(AbstractC6918a0.container);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f67391L = findViewById3;
        findViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.searchglobal.viewholder.prestate.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C13058o.m73341j0(C13058o.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m73341j0(C13058o c13058o, View view) {
        AbstractC28275a.f fVar;
        AbstractC19074t.m100208f(c13058o, "this$0");
        InterfaceC18319c interfaceC18319c = c13058o.f67388I;
        if (interfaceC18319c != null) {
            AbstractC28275a.k kVar = c13058o.f67392M;
            if (kVar != null) {
                fVar = kVar.m142498d();
            } else {
                fVar = null;
            }
        }
    }

    /* renamed from: k0 */
    public final void m73342k0(AbstractC28275a.k kVar) {
        C18316b c18316b;
        AbstractC19074t.m100208f(kVar, "data");
        this.f67392M = kVar;
        this.f67389J.setText(kVar.m142495a());
        TextView textView = this.f67389J;
        textView.setPadding(textView.getPaddingLeft(), kVar.m142497c(), this.f67389J.getPaddingRight(), kVar.m142496b());
        AbstractC28275a.f m142498d = kVar.m142498d();
        if (AbstractC19074t.m100204b(m142498d, AbstractC28275a.f.d.f131906a)) {
            InterfaceC18319c interfaceC18319c = this.f67388I;
            if (interfaceC18319c != null && (c18316b = (C18316b) interfaceC18319c.mo205i9(new C18316b("Search.PreState.IsEditorState", null, null, null, 14, null))) != null && AbstractC19074t.m100204b(c18316b.m97245a(), Boolean.TRUE)) {
                this.f67390K.setText(AbstractC8020f0.str_finished);
            } else {
                this.f67390K.setText(AbstractC8020f0.str_edit);
            }
            this.f67391L.setVisibility(0);
            return;
        }
        if (AbstractC19074t.m100204b(m142498d, AbstractC28275a.f.a.f131903a) || AbstractC19074t.m100204b(m142498d, AbstractC28275a.f.b.f131904a) || AbstractC19074t.m100204b(m142498d, AbstractC28275a.f.c.f131905a)) {
            this.f67391L.setVisibility(0);
            this.f67390K.setText(AbstractC8020f0.str_search_global_delete_all);
        } else if (AbstractC19074t.m100204b(m142498d, AbstractC28275a.f.e.f131907a)) {
            this.f67391L.setVisibility(8);
        }
    }
}

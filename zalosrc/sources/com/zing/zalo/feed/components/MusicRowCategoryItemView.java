package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bo.C3029r;
import bo.InterfaceC3045u2;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p649xl.C29780e6;

/* loaded from: classes4.dex */
public final class MusicRowCategoryItemView extends RelativeLayout {

    /* renamed from: p */
    private C29780e6 f45073p;

    /* renamed from: q */
    private InterfaceC3045u2 f45074q;

    /* renamed from: r */
    public C23528a f45075r;

    public MusicRowCategoryItemView(Context context) {
        super(context);
        m44451g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m44446c(MusicRowCategoryItemView musicRowCategoryItemView, C3029r c3029r, View view) {
        AbstractC19074t.m100208f(musicRowCategoryItemView, "this$0");
        InterfaceC3045u2 interfaceC3045u2 = musicRowCategoryItemView.f45074q;
        if (interfaceC3045u2 != null) {
            interfaceC3045u2.mo14631rG(new C3029r.a(c3029r));
        }
    }

    /* renamed from: d */
    private final void m44447d(C29780e6 c29780e6, C3029r c3029r) {
        int i11;
        LinearLayout linearLayout = c29780e6.f137660q;
        Context context = getContext();
        if (c3029r.m14582d()) {
            i11 = AbstractC16803z.round_corner_border_selected_tab_category;
        } else {
            i11 = AbstractC16803z.round_corner_border_normal_tab_category;
        }
        linearLayout.setBackground(AbstractC23136l9.m118665N(context, i11));
    }

    /* renamed from: e */
    private final void m44448e(C29780e6 c29780e6, C3029r c3029r) {
        int i11;
        RecyclingImageView recyclingImageView = c29780e6.f137661r;
        if (c3029r.m14579a().length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        recyclingImageView.setVisibility(i11);
        if (c3029r.m14579a().length() > 0) {
            c29780e6.f137661r.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_feed));
            ((C23528a) getMAQ().m123612r(c29780e6.f137661r)).m123618x(c3029r.m14579a(), C23278z2.m120123e0());
        }
    }

    /* renamed from: f */
    private final void m44449f(C29780e6 c29780e6, C3029r c3029r) {
        RobotoTextView robotoTextView = c29780e6.f137662s;
        robotoTextView.setText(c3029r.m14581c());
        robotoTextView.setTextStyleBold(c3029r.m14582d());
    }

    /* renamed from: b */
    public final void m44450b(final C3029r c3029r) {
        if (c3029r == null) {
            return;
        }
        C29780e6 c29780e6 = this.f45073p;
        if (c29780e6 == null) {
            AbstractC19074t.m100223u("binding");
            c29780e6 = null;
        }
        m44447d(c29780e6, c3029r);
        m44448e(c29780e6, c3029r);
        m44449f(c29780e6, c3029r);
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.x6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MusicRowCategoryItemView.m44446c(MusicRowCategoryItemView.this, c3029r, view);
            }
        });
    }

    /* renamed from: g */
    public final void m44451g(Context context) {
        C29780e6 m147896c = C29780e6.m147896c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m147896c, "inflate(...)");
        this.f45073p = m147896c;
        setMAQ(new C23528a(getContext()));
    }

    public final InterfaceC3045u2 getListener() {
        return this.f45074q;
    }

    public final C23528a getMAQ() {
        C23528a c23528a = this.f45075r;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    public final void setListener(InterfaceC3045u2 interfaceC3045u2) {
        this.f45074q = interfaceC3045u2;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f45075r = c23528a;
    }

    public MusicRowCategoryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m44451g(context);
    }
}

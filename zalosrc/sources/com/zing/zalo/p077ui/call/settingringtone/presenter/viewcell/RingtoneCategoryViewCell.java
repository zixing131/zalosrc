package com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.call.settingringtone.presenter.viewcell.RingtoneCategoryViewCell;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import k50.C21474b;
import me0.AbstractC23136l9;
import me0.C23278z2;
import n50.InterfaceC23568b;
import p354n3.C23528a;
import p649xl.C30097w4;

/* loaded from: classes5.dex */
public final class RingtoneCategoryViewCell extends RelativeLayout {

    /* renamed from: p */
    private C30097w4 f56557p;

    /* renamed from: q */
    private InterfaceC23568b f56558q;

    /* renamed from: r */
    public C23528a f56559r;

    public RingtoneCategoryViewCell(Context context) {
        super(context);
        m58984g(context);
    }

    /* renamed from: c */
    public static final void m58979c(RingtoneCategoryViewCell ringtoneCategoryViewCell, C21474b c21474b, View view) {
        AbstractC19074t.m100208f(ringtoneCategoryViewCell, "this$0");
        InterfaceC23568b interfaceC23568b = ringtoneCategoryViewCell.f56558q;
        if (interfaceC23568b != null) {
            interfaceC23568b.mo58771i5(new C21474b.a(c21474b));
        }
    }

    /* renamed from: d */
    private final void m58980d(C30097w4 c30097w4, C21474b c21474b) {
        int i11;
        LinearLayout linearLayout = c30097w4.f139780q;
        Context context = linearLayout.getContext();
        if (c21474b.m111082d()) {
            i11 = AbstractC16803z.round_corner_border_selected_tab_category;
        } else {
            i11 = AbstractC16803z.round_corner_border_normal_tab_category;
        }
        linearLayout.setBackground(AbstractC23136l9.m118665N(context, i11));
    }

    /* renamed from: e */
    private final void m58981e(C30097w4 c30097w4, C21474b c21474b) {
        int i11;
        RecyclingImageView recyclingImageView = c30097w4.f139781r;
        if (c21474b.m111079a().length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        recyclingImageView.setVisibility(i11);
        if (c21474b.m111079a().length() > 0) {
            RecyclingImageView recyclingImageView2 = c30097w4.f139781r;
            recyclingImageView2.setImageDrawable(AbstractC23136l9.m118665N(recyclingImageView2.getContext(), AbstractC16803z.bg_feed));
            ((C23528a) getMAQ().m123612r(c30097w4.f139781r)).m123618x(c21474b.m111079a(), C23278z2.m120123e0());
        }
    }

    /* renamed from: f */
    private final void m58982f(C30097w4 c30097w4, C21474b c21474b) {
        RobotoTextView robotoTextView = c30097w4.f139782s;
        robotoTextView.setText(c21474b.m111081c());
        robotoTextView.setTextStyleBold(c21474b.m111082d());
    }

    /* renamed from: b */
    public final void m58983b(C21474b c21474b) {
        if (c21474b == null) {
            return;
        }
        C30097w4 c30097w4 = this.f56557p;
        if (c30097w4 == null) {
            AbstractC19074t.m100223u("binding");
            c30097w4 = null;
        }
        m58980d(c30097w4, c21474b);
        m58981e(c30097w4, c21474b);
        m58982f(c30097w4, c21474b);
        setOnClickListener(new View.OnClickListener() { // from class: s50.a

            /* renamed from: q */
            public final /* synthetic */ C21474b f124376q;

            public /* synthetic */ ViewOnClickListenerC26147a(C21474b c21474b2) {
                r2 = c21474b2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RingtoneCategoryViewCell.m58979c(RingtoneCategoryViewCell.this, r2, view);
            }
        });
    }

    /* renamed from: g */
    public final void m58984g(Context context) {
        C30097w4 m148644c = C30097w4.m148644c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148644c, "inflate(...)");
        this.f56557p = m148644c;
        setMAQ(new C23528a(getContext()));
    }

    public final InterfaceC23568b getListener() {
        return this.f56558q;
    }

    public final C23528a getMAQ() {
        C23528a c23528a = this.f56559r;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    public final void setListener(InterfaceC23568b interfaceC23568b) {
        this.f56558q = interfaceC23568b;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f56559r = c23528a;
    }

    public RingtoneCategoryViewCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m58984g(context);
    }
}

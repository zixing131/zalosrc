package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import bo.C3004m;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import p354n3.C23528a;
import p649xl.C30014r6;

/* loaded from: classes4.dex */
public final class AlbumRowSelectInfoView extends RelativeLayout {

    /* renamed from: p */
    private C30014r6 f44124p;

    /* renamed from: q */
    private InterfaceC8070a f44125q;

    /* renamed from: r */
    public C23528a f44126r;

    /* renamed from: com.zing.zalo.feed.components.AlbumRowSelectInfoView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8070a {

        /* renamed from: com.zing.zalo.feed.components.AlbumRowSelectInfoView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m43508a(InterfaceC8070a interfaceC8070a, C3004m c3004m) {
                AbstractC19074t.m100208f(c3004m, "albumRowSelectInfo");
            }
        }

        /* renamed from: d */
        void mo43426d(C3004m c3004m);
    }

    public AlbumRowSelectInfoView(Context context) {
        super(context);
        m43507h(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m43501c(AlbumRowSelectInfoView albumRowSelectInfoView, C3004m c3004m, View view) {
        AbstractC19074t.m100208f(albumRowSelectInfoView, "this$0");
        InterfaceC8070a interfaceC8070a = albumRowSelectInfoView.f44125q;
        if (interfaceC8070a != null) {
            interfaceC8070a.mo43426d(c3004m);
        }
    }

    /* renamed from: d */
    private final void m43502d(C30014r6 c30014r6, C3004m c3004m) {
        int i11;
        RobotoTextView robotoTextView = c30014r6.f139211r;
        robotoTextView.setText(c3004m.m14400a());
        if (c3004m.m14400a().length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
    }

    /* renamed from: e */
    private final void m43503e(C30014r6 c30014r6, C3004m c3004m) {
        boolean z11;
        if (c3004m.m14401b()) {
            c30014r6.f139212s.setImageResource(c3004m.m14403d());
        }
        if (c3004m.m14402c()) {
            RecyclingImageView recyclingImageView = c30014r6.f139213t;
            int i11 = 0;
            if (c3004m.m14404e().length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                i11 = 8;
            }
            recyclingImageView.setVisibility(i11);
            if (z11) {
                ((C23528a) getAquery().m123612r(recyclingImageView)).m123616v(c3004m.m14404e());
            }
        }
    }

    /* renamed from: f */
    private final void m43504f(C30014r6 c30014r6, C3004m c3004m) {
        int i11;
        View view = c30014r6.f139214u;
        if (c3004m.m14407h()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
    }

    /* renamed from: g */
    private final void m43505g(C30014r6 c30014r6, C3004m c3004m) {
        int i11;
        RobotoTextView robotoTextView = c30014r6.f139215v;
        robotoTextView.setText(c3004m.m14405f());
        if (c3004m.m14405f().length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
    }

    /* renamed from: b */
    public final void m43506b(final C3004m c3004m) {
        if (c3004m == null) {
            return;
        }
        C30014r6 c30014r6 = this.f44124p;
        if (c30014r6 == null) {
            AbstractC19074t.m100223u("binding");
            c30014r6 = null;
        }
        m43503e(c30014r6, c3004m);
        m43505g(c30014r6, c3004m);
        m43502d(c30014r6, c3004m);
        m43504f(c30014r6, c3004m);
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlbumRowSelectInfoView.m43501c(AlbumRowSelectInfoView.this, c3004m, view);
            }
        });
    }

    public final InterfaceC8070a getAlbumRowSelectInfoListener() {
        return this.f44125q;
    }

    public final C23528a getAquery() {
        C23528a c23528a = this.f44126r;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("aquery");
        return null;
    }

    /* renamed from: h */
    public final void m43507h(Context context) {
        C30014r6 m148441c = C30014r6.m148441c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148441c, "inflate(...)");
        this.f44124p = m148441c;
        setAquery(new C23528a(context));
    }

    public final void setAlbumRowSelectInfoListener(InterfaceC8070a interfaceC8070a) {
        this.f44125q = interfaceC8070a;
    }

    public final void setAquery(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f44126r = c23528a;
    }

    public AlbumRowSelectInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43507h(context);
    }
}

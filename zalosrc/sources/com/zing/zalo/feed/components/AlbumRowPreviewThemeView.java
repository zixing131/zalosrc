package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bo.C2999l;
import fn0.AbstractC19074t;
import me0.C23278z2;
import p354n3.C23528a;
import p649xl.C29996q6;

/* loaded from: classes4.dex */
public final class AlbumRowPreviewThemeView extends RelativeLayout {

    /* renamed from: p */
    private C29996q6 f44121p;

    /* renamed from: q */
    private InterfaceC8069a f44122q;

    /* renamed from: r */
    public C23528a f44123r;

    /* renamed from: com.zing.zalo.feed.components.AlbumRowPreviewThemeView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8069a {

        /* renamed from: com.zing.zalo.feed.components.AlbumRowPreviewThemeView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m43499a(InterfaceC8069a interfaceC8069a, C2999l c2999l) {
                AbstractC19074t.m100208f(c2999l, "albumRowPreviewThemeData");
            }
        }

        /* renamed from: a */
        void mo43423a(C2999l c2999l);
    }

    public AlbumRowPreviewThemeView(Context context) {
        super(context);
        m43498g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m43493c(AlbumRowPreviewThemeView albumRowPreviewThemeView, C2999l c2999l, View view) {
        AbstractC19074t.m100208f(albumRowPreviewThemeView, "this$0");
        InterfaceC8069a interfaceC8069a = albumRowPreviewThemeView.f44122q;
        if (interfaceC8069a != null) {
            interfaceC8069a.mo43423a(c2999l);
        }
    }

    /* renamed from: d */
    private final void m43494d(C29996q6 c29996q6, C2999l c2999l) {
        int i11;
        ImageView imageView = c29996q6.f139096r;
        if (c2999l.m14240d()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
    }

    /* renamed from: e */
    private final void m43495e(C29996q6 c29996q6, C2999l c2999l) {
        if (c2999l.m14238b().length() != 0) {
            ((C23528a) getMAQ().m123612r(c29996q6.f139097s)).m123618x(c2999l.m14238b(), C23278z2.m120123e0());
        }
    }

    /* renamed from: f */
    private final void m43496f(C29996q6 c29996q6, C2999l c2999l) {
        c29996q6.f139098t.setText(c2999l.m14239c());
    }

    /* renamed from: b */
    public final void m43497b(final C2999l c2999l) {
        if (c2999l == null) {
            return;
        }
        C29996q6 c29996q6 = this.f44121p;
        if (c29996q6 == null) {
            AbstractC19074t.m100223u("binding");
            c29996q6 = null;
        }
        m43495e(c29996q6, c2999l);
        m43494d(c29996q6, c2999l);
        m43496f(c29996q6, c2999l);
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlbumRowPreviewThemeView.m43493c(AlbumRowPreviewThemeView.this, c2999l, view);
            }
        });
    }

    /* renamed from: g */
    public final void m43498g(Context context) {
        C29996q6 m148401c = C29996q6.m148401c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148401c, "inflate(...)");
        this.f44121p = m148401c;
        if (m148401c == null) {
            AbstractC19074t.m100223u("binding");
            m148401c = null;
        }
        m148401c.f139097s.setClipToOutline(true);
        setMAQ(new C23528a(getContext()));
    }

    public final InterfaceC8069a getAlbumRowPreviewThemeItemListener() {
        return this.f44122q;
    }

    public final C23528a getMAQ() {
        C23528a c23528a = this.f44123r;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    public final void setAlbumRowPreviewThemeItemListener(InterfaceC8069a interfaceC8069a) {
        this.f44122q = interfaceC8069a;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f44123r = c23528a;
    }

    public AlbumRowPreviewThemeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43498g(context);
    }
}

package com.zing.zalo.feed.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import fn0.AbstractC19074t;
import p354n3.C23528a;
import p649xl.C29888k6;

/* loaded from: classes4.dex */
public final class AlbumRowCreateAlbumView extends RelativeLayout {

    /* renamed from: p */
    private C29888k6 f44095p;

    /* renamed from: q */
    private InterfaceC8061a f44096q;

    /* renamed from: r */
    public C23528a f44097r;

    /* renamed from: com.zing.zalo.feed.components.AlbumRowCreateAlbumView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8061a {

        /* renamed from: com.zing.zalo.feed.components.AlbumRowCreateAlbumView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m43438a(InterfaceC8061a interfaceC8061a) {
            }
        }

        /* renamed from: h */
        void mo43427h();
    }

    public AlbumRowCreateAlbumView(Context context) {
        super(context);
        m43437b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m43436c(AlbumRowCreateAlbumView albumRowCreateAlbumView, View view) {
        AbstractC19074t.m100208f(albumRowCreateAlbumView, "this$0");
        InterfaceC8061a interfaceC8061a = albumRowCreateAlbumView.f44096q;
        if (interfaceC8061a != null) {
            interfaceC8061a.mo43427h();
        }
    }

    /* renamed from: b */
    public final void m43437b(Context context) {
        C29888k6 m148160c = C29888k6.m148160c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148160c, "inflate(...)");
        this.f44095p = m148160c;
        setMAQ(new C23528a(getContext()));
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlbumRowCreateAlbumView.m43436c(AlbumRowCreateAlbumView.this, view);
            }
        });
    }

    public final InterfaceC8061a getAlbumRowCreateAlbumListener() {
        return this.f44096q;
    }

    public final C23528a getMAQ() {
        C23528a c23528a = this.f44097r;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    public final void setAlbumRowCreateAlbumListener(InterfaceC8061a interfaceC8061a) {
        this.f44096q = interfaceC8061a;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f44097r = c23528a;
    }

    public AlbumRowCreateAlbumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43437b(context);
    }
}

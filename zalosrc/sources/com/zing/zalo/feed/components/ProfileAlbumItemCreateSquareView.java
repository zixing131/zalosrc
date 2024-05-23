package com.zing.zalo.feed.components;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import bo.C2979h;
import com.zing.zalo.AbstractC16802y;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import p649xl.C30031s6;

/* loaded from: classes4.dex */
public final class ProfileAlbumItemCreateSquareView extends FrameLayout {

    /* renamed from: p */
    public C30031s6 f45086p;

    /* renamed from: q */
    private InterfaceC8214a f45087q;

    /* renamed from: r */
    private int f45088r;

    /* renamed from: com.zing.zalo.feed.components.ProfileAlbumItemCreateSquareView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8214a {

        /* renamed from: com.zing.zalo.feed.components.ProfileAlbumItemCreateSquareView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m44467a(InterfaceC8214a interfaceC8214a) {
            }
        }

        /* renamed from: X0 */
        void mo43422X0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAlbumItemCreateSquareView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f45088r = 1;
        m44466g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m44461c(ProfileAlbumItemCreateSquareView profileAlbumItemCreateSquareView, View view) {
        AbstractC19074t.m100208f(profileAlbumItemCreateSquareView, "this$0");
        InterfaceC8214a interfaceC8214a = profileAlbumItemCreateSquareView.f45087q;
        if (interfaceC8214a != null) {
            interfaceC8214a.mo43422X0();
        }
    }

    /* renamed from: d */
    private final void m44462d() {
        int i11 = this.f45088r;
        if (i11 == 1) {
            m44464f();
        } else if (i11 == 2) {
            m44463e();
        }
    }

    /* renamed from: e */
    private final void m44463e() {
        getBinding().f139295q.getLayoutParams().width = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_width_large);
        getBinding().f139295q.getLayoutParams().height = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_height_large);
        getBinding().f139297s.getLayoutParams().height = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_cover_height_large);
        if (getBinding().f139298t.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = getBinding().f139298t.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_title_margin_top_large);
        }
    }

    /* renamed from: f */
    private final void m44464f() {
        getBinding().f139295q.getLayoutParams().width = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_width_normal);
        getBinding().f139295q.getLayoutParams().height = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_height_normal);
        getBinding().f139297s.getLayoutParams().height = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_cover_height_normal);
        if (getBinding().f139298t.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = getBinding().f139298t.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_title_margin_top_normal);
        }
    }

    /* renamed from: b */
    public final void m44465b(C2979h c2979h) {
        if (c2979h == null) {
            return;
        }
        try {
            this.f45088r = c2979h.m14135a();
            m44462d();
            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.b7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ProfileAlbumItemCreateSquareView.m44461c(ProfileAlbumItemCreateSquareView.this, view);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: g */
    public final void m44466g(Context context) {
        AbstractC19074t.m100208f(context, "context");
        try {
            C30031s6 m148484b = C30031s6.m148484b(LayoutInflater.from(context), this);
            AbstractC19074t.m100207e(m148484b, "inflate(...)");
            setBinding(m148484b);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    public final C30031s6 getBinding() {
        C30031s6 c30031s6 = this.f45086p;
        if (c30031s6 != null) {
            return c30031s6;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    public final InterfaceC8214a getProfileAlbumItemCreateSquareViewListener() {
        return this.f45087q;
    }

    public final void setBinding(C30031s6 c30031s6) {
        AbstractC19074t.m100208f(c30031s6, "<set-?>");
        this.f45086p = c30031s6;
    }

    public final void setProfileAlbumItemCreateSquareViewListener(InterfaceC8214a interfaceC8214a) {
        this.f45087q = interfaceC8214a;
    }
}

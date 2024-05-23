package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import bo.C2994k;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.feed.mvp.profile.model.ProfilePreviewAlbumItem;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.C13778s1;
import com.zing.zalo.p077ui.widget.EnumC13569b3;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p649xl.C29907l7;

/* loaded from: classes4.dex */
public final class AlbumItemSquareView extends FrameLayout {

    /* renamed from: p */
    public C23528a f44075p;

    /* renamed from: q */
    public C29907l7 f44076q;

    /* renamed from: r */
    private InterfaceC8052a f44077r;

    /* renamed from: s */
    private final PrivacyInfo f44078s;

    /* renamed from: t */
    private int f44079t;

    /* renamed from: com.zing.zalo.feed.components.AlbumItemSquareView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8052a {

        /* renamed from: com.zing.zalo.feed.components.AlbumItemSquareView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m43408a(InterfaceC8052a interfaceC8052a, ProfilePreviewAlbumItem profilePreviewAlbumItem) {
                AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
            }

            /* renamed from: b */
            public static void m43409b(InterfaceC8052a interfaceC8052a, ProfilePreviewAlbumItem profilePreviewAlbumItem) {
                AbstractC19074t.m100208f(profilePreviewAlbumItem, "profilePreviewAlbumItem");
            }
        }

        /* renamed from: f */
        void mo43406f(ProfilePreviewAlbumItem profilePreviewAlbumItem);

        /* renamed from: g */
        void mo43407g(ProfilePreviewAlbumItem profilePreviewAlbumItem);
    }

    /* renamed from: com.zing.zalo.feed.components.AlbumItemSquareView$b */
    /* loaded from: classes4.dex */
    public static final class C8053b extends C23999j {
        C8053b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c3979l != null) {
                try {
                    if (c3979l.m18839c() != null) {
                        AlbumItemSquareView.this.getBinding().f138575v.setRatio((c3979l.m18839c().getHeight() * 1.0f) / c3979l.m18839c().getWidth());
                        AlbumItemSquareView.this.getBinding().f138575v.setScaleOption(6);
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlbumItemSquareView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f44078s = new PrivacyInfo();
        this.f44079t = 1;
        m43405i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m43393d(AlbumItemSquareView albumItemSquareView, ProfilePreviewAlbumItem profilePreviewAlbumItem, View view) {
        AbstractC19074t.m100208f(albumItemSquareView, "this$0");
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "$profilePreviewAlbumItem");
        InterfaceC8052a interfaceC8052a = albumItemSquareView.f44077r;
        if (interfaceC8052a != null) {
            interfaceC8052a.mo43407g(profilePreviewAlbumItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final boolean m43394e(AlbumItemSquareView albumItemSquareView, ProfilePreviewAlbumItem profilePreviewAlbumItem, View view) {
        AbstractC19074t.m100208f(albumItemSquareView, "this$0");
        AbstractC19074t.m100208f(profilePreviewAlbumItem, "$profilePreviewAlbumItem");
        InterfaceC8052a interfaceC8052a = albumItemSquareView.f44077r;
        if (interfaceC8052a != null) {
            interfaceC8052a.mo43406f(profilePreviewAlbumItem);
            return false;
        }
        return false;
    }

    /* renamed from: f */
    private final void m43395f() {
        int i11 = this.f44079t;
        if (i11 == 1) {
            m43397h();
        } else if (i11 == 2) {
            m43396g();
        }
    }

    /* renamed from: g */
    private final void m43396g() {
        getBinding().f138570q.getLayoutParams().width = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_width_large);
        getBinding().f138570q.getLayoutParams().height = m43398j(AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_height_large), 14, 12, AbstractC23222t7.f112572m);
        getBinding().f138571r.getLayoutParams().height = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_cover_height_large);
        if (getBinding().f138579z.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = getBinding().f138579z.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_title_margin_top_large);
        }
    }

    /* renamed from: h */
    private final void m43397h() {
        getBinding().f138570q.getLayoutParams().width = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_width_normal);
        getBinding().f138570q.getLayoutParams().height = m43398j(AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_height_normal), 14, 12, AbstractC23222t7.f112572m);
        getBinding().f138571r.getLayoutParams().height = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_cover_height_normal);
        if (getBinding().f138579z.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = getBinding().f138579z.getLayoutParams();
            AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).topMargin = AbstractC23136l9.m118736p(AbstractC16802y.profile_album_row_item_title_margin_top_normal);
        }
    }

    /* renamed from: j */
    private final int m43398j(int i11, int i12, int i13, int i14) {
        EnumC13569b3 enumC13569b3 = EnumC13569b3.TEXT;
        float m76963d = C13778s1.m76963d(enumC13569b3.m76022e());
        float m76020c = enumC13569b3.m76020c(3);
        if (m76963d <= m76020c) {
            return i11;
        }
        return (i11 - ((int) ((14 * m76020c) + (12 * m76020c)))) + ((int) ((i12 * m76963d) + (i13 * m76963d))) + i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m43399k(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
        boolean z11;
        C24003n m120123e0 = C23278z2.m120123e0();
        if (profilePreviewAlbumItem.getCropInfo().isValidData()) {
            m120123e0 = C23278z2.m120130h0();
            m120123e0.f116282w = profilePreviewAlbumItem.getCropInfo().getCropRect();
        }
        getBinding().f138571r.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_feed));
        int i11 = 0;
        if (!TextUtils.isEmpty(profilePreviewAlbumItem.getThumb())) {
            if (profilePreviewAlbumItem.getSize() == 0) {
                ((C23528a) getMAQuery().m123612r(getBinding().f138578y)).m123618x(profilePreviewAlbumItem.getThumb(), m120123e0);
                z11 = true;
                AspectRatioImageView aspectRatioImageView = getBinding().f138578y;
                if (!z11) {
                    i11 = 8;
                }
                aspectRatioImageView.setVisibility(i11);
            }
            ((C23528a) getMAQuery().m123612r(getBinding().f138571r)).m123618x(profilePreviewAlbumItem.getThumb(), m120123e0);
        }
        z11 = false;
        AspectRatioImageView aspectRatioImageView2 = getBinding().f138578y;
        if (!z11) {
        }
        aspectRatioImageView2.setVisibility(i11);
    }

    /* renamed from: l */
    private final void m43400l(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
        String str;
        RobotoTextView robotoTextView = getBinding().f138572s;
        if (profilePreviewAlbumItem == null || (str = profilePreviewAlbumItem.getDesc()) == null) {
            str = "";
        }
        robotoTextView.setText(str);
    }

    /* renamed from: m */
    private final void m43401m(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
        int i11;
        String icon = profilePreviewAlbumItem.getIcon();
        boolean z11 = !TextUtils.isEmpty(icon);
        AspectRatioImageView aspectRatioImageView = getBinding().f138575v;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        aspectRatioImageView.setVisibility(i11);
        if (z11) {
            ((C23528a) getMAQuery().m123612r(getBinding().f138575v)).m123579C(icon, C23278z2.m120123e0(), new C8053b());
        }
    }

    /* renamed from: n */
    private final void m43402n(C2994k c2994k) {
        int i11;
        this.f44078s.f45973p = c2994k.m14199b().getPrivacyType();
        getBinding().f138577x.setImageDrawable(AbstractC23136l9.m118665N(getContext(), this.f44078s.m45144l()));
        AspectRatioImageView aspectRatioImageView = getBinding().f138577x;
        if (c2994k.m14200c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        aspectRatioImageView.setVisibility(i11);
    }

    /* renamed from: p */
    private final void m43403p(ProfilePreviewAlbumItem profilePreviewAlbumItem) {
        String str;
        RobotoTextView robotoTextView = getBinding().f138579z;
        if (profilePreviewAlbumItem == null || (str = profilePreviewAlbumItem.getTitle()) == null) {
            str = "";
        }
        robotoTextView.setText(str);
    }

    /* renamed from: c */
    public final void m43404c(C2994k c2994k) {
        if (c2994k == null) {
            return;
        }
        try {
            final ProfilePreviewAlbumItem m14199b = c2994k.m14199b();
            this.f44079t = c2994k.m14198a();
            m43395f();
            m43399k(m14199b);
            m43401m(m14199b);
            m43403p(m14199b);
            m43400l(m14199b);
            m43402n(c2994k);
            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AlbumItemSquareView.m43393d(AlbumItemSquareView.this, m14199b, view);
                }
            });
            setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.feed.components.b
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean m43394e;
                    m43394e = AlbumItemSquareView.m43394e(AlbumItemSquareView.this, m14199b, view);
                    return m43394e;
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    public final C29907l7 getBinding() {
        C29907l7 c29907l7 = this.f44076q;
        if (c29907l7 != null) {
            return c29907l7;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    public final C23528a getMAQuery() {
        C23528a c23528a = this.f44075p;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQuery");
        return null;
    }

    public final PrivacyInfo getPrivacyInfo() {
        return this.f44078s;
    }

    public final InterfaceC8052a getSuggestAlbumItemViewListener() {
        return this.f44077r;
    }

    /* renamed from: i */
    public final void m43405i(Context context) {
        AbstractC19074t.m100208f(context, "context");
        try {
            setMAQuery(new C23528a(context));
            C29907l7 m148202b = C29907l7.m148202b(LayoutInflater.from(context), this);
            AbstractC19074t.m100207e(m148202b, "inflate(...)");
            setBinding(m148202b);
            m43395f();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    public final void setBinding(C29907l7 c29907l7) {
        AbstractC19074t.m100208f(c29907l7, "<set-?>");
        this.f44076q = c29907l7;
    }

    public final void setMAQuery(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f44075p = c23528a;
    }

    public final void setSuggestAlbumItemViewListener(InterfaceC8052a interfaceC8052a) {
        this.f44077r = interfaceC8052a;
    }
}

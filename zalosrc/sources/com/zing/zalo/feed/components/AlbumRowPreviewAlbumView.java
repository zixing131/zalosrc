package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import bo.C2989j;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C24003n;
import p649xl.C29960o6;

/* loaded from: classes4.dex */
public final class AlbumRowPreviewAlbumView extends RelativeLayout {

    /* renamed from: p */
    private C29960o6 f44113p;

    /* renamed from: q */
    private InterfaceC8066a f44114q;

    /* renamed from: r */
    public C23528a f44115r;

    /* renamed from: s */
    private final PrivacyInfo f44116s;

    /* renamed from: com.zing.zalo.feed.components.AlbumRowPreviewAlbumView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8066a {

        /* renamed from: com.zing.zalo.feed.components.AlbumRowPreviewAlbumView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m43471a(InterfaceC8066a interfaceC8066a, C2989j c2989j) {
                AbstractC19074t.m100208f(c2989j, "albumRowPreviewAlbumData");
            }
        }

        /* renamed from: b */
        void mo43424b(C2989j c2989j);
    }

    public AlbumRowPreviewAlbumView(Context context) {
        super(context);
        this.f44116s = new PrivacyInfo();
        m43470h(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m43464c(AlbumRowPreviewAlbumView albumRowPreviewAlbumView, C2989j c2989j, View view) {
        AbstractC19074t.m100208f(albumRowPreviewAlbumView, "this$0");
        InterfaceC8066a interfaceC8066a = albumRowPreviewAlbumView.f44114q;
        if (interfaceC8066a != null) {
            interfaceC8066a.mo43424b(c2989j);
        }
    }

    /* renamed from: d */
    private final void m43465d(C29960o6 c29960o6, C2989j c2989j) {
        int i11;
        RobotoTextView robotoTextView = c29960o6.f138869s;
        robotoTextView.setText(c2989j.m14171a());
        if (c2989j.m14171a().length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
        AspectRatioImageView aspectRatioImageView = c29960o6.f138870t;
        aspectRatioImageView.setImageDrawable(AbstractC23136l9.m118665N(aspectRatioImageView.getContext(), this.f44116s.m45143k()));
    }

    /* renamed from: e */
    private final void m43466e(C29960o6 c29960o6, C2989j c2989j) {
        int i11;
        FrameLayout frameLayout = c29960o6.f138872v;
        int i12 = 8;
        if (c2989j.m14177g()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        frameLayout.setVisibility(i11);
        ImageView imageView = c29960o6.f138873w;
        if (c2989j.m14177g()) {
            i12 = 0;
        }
        imageView.setVisibility(i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m43467f(C29960o6 c29960o6, C2989j c2989j) {
        boolean z11;
        C24003n m120123e0 = C23278z2.m120123e0();
        c29960o6.f138868r.setImageDrawable(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_feed));
        int i11 = 0;
        if (!TextUtils.isEmpty(c2989j.m14174d())) {
            if (c2989j.m14176f()) {
                ((C23528a) getMAQ().m123612r(c29960o6.f138874x)).m123618x(c2989j.m14174d(), m120123e0);
                z11 = true;
                AspectRatioImageView aspectRatioImageView = c29960o6.f138874x;
                if (!z11) {
                    i11 = 8;
                }
                aspectRatioImageView.setVisibility(i11);
            }
            ((C23528a) getMAQ().m123612r(c29960o6.f138868r)).m123618x(c2989j.m14174d(), m120123e0);
        }
        z11 = false;
        AspectRatioImageView aspectRatioImageView2 = c29960o6.f138874x;
        if (!z11) {
        }
        aspectRatioImageView2.setVisibility(i11);
    }

    /* renamed from: g */
    private final void m43468g(C29960o6 c29960o6, C2989j c2989j) {
        int i11;
        RobotoTextView robotoTextView = c29960o6.f138875y;
        robotoTextView.setText(c2989j.m14175e());
        if (c2989j.m14175e().length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
    }

    /* renamed from: b */
    public final void m43469b(final C2989j c2989j) {
        if (c2989j == null) {
            return;
        }
        this.f44116s.f45973p = c2989j.m14173c();
        C29960o6 c29960o6 = this.f44113p;
        if (c29960o6 == null) {
            AbstractC19074t.m100223u("binding");
            c29960o6 = null;
        }
        m43467f(c29960o6, c2989j);
        m43468g(c29960o6, c2989j);
        m43465d(c29960o6, c2989j);
        m43466e(c29960o6, c2989j);
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlbumRowPreviewAlbumView.m43464c(AlbumRowPreviewAlbumView.this, c2989j, view);
            }
        });
    }

    public final InterfaceC8066a getAlbumRowPreviewAlbumItemListener() {
        return this.f44114q;
    }

    public final C23528a getMAQ() {
        C23528a c23528a = this.f44115r;
        if (c23528a != null) {
            return c23528a;
        }
        AbstractC19074t.m100223u("mAQ");
        return null;
    }

    public final PrivacyInfo getPrivacyInfo() {
        return this.f44116s;
    }

    /* renamed from: h */
    public final void m43470h(Context context) {
        C29960o6 m148318c = C29960o6.m148318c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148318c, "inflate(...)");
        this.f44113p = m148318c;
        setMAQ(new C23528a(getContext()));
    }

    public final void setAlbumRowPreviewAlbumItemListener(InterfaceC8066a interfaceC8066a) {
        this.f44114q = interfaceC8066a;
    }

    public final void setMAQ(C23528a c23528a) {
        AbstractC19074t.m100208f(c23528a, "<set-?>");
        this.f44115r = c23528a;
    }

    public AlbumRowPreviewAlbumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44116s = new PrivacyInfo();
        m43470h(context);
    }
}

package com.zing.zalo.feed.uicontrols.commentpreview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bo.C2971f1;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.stickers.FeedStickerView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gs.C19591a;
import is.C20820s0;
import me0.AbstractC23136l9;
import me0.AbstractC23170p;
import me0.C23278z2;
import p354n3.C23528a;
import p471r3.C25630b;
import p588vw.C28644j;

/* loaded from: classes4.dex */
public final class CommentPreviewView extends FrameLayout {
    public static final C8872a Companion = new C8872a(null);

    /* renamed from: p */
    private final C23528a f47394p;

    /* renamed from: q */
    private final View f47395q;

    /* renamed from: r */
    private final RecyclingImageView f47396r;

    /* renamed from: s */
    private final FeedStickerView f47397s;

    /* renamed from: t */
    private final FrameLayout f47398t;

    /* renamed from: u */
    private final ImageView f47399u;

    /* renamed from: v */
    private C19591a f47400v;

    /* renamed from: w */
    private String f47401w;

    /* renamed from: com.zing.zalo.feed.uicontrols.commentpreview.CommentPreviewView$a */
    /* loaded from: classes4.dex */
    public static final class C8872a {
        private C8872a() {
        }

        public /* synthetic */ C8872a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f47394p = new C23528a(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.preview_comment_layout_content, (ViewGroup) this, false);
        this.f47395q = inflate;
        RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
        this.f47396r = recyclingImageView;
        FeedStickerView feedStickerView = new FeedStickerView(getContext());
        this.f47397s = feedStickerView;
        this.f47398t = (FrameLayout) inflate.findViewById(AbstractC6918a0.imv_content_preview);
        this.f47399u = (ImageView) inflate.findViewById(AbstractC6918a0.ic_remove_preview);
        C19591a c19591a = new C19591a();
        c19591a.m102563f(0);
        this.f47400v = c19591a;
        this.f47401w = "";
        int m118736p = AbstractC23136l9.m118736p(AbstractC16802y.preview_comment_content_size);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m118736p, m118736p);
        recyclingImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        recyclingImageView.setLayoutParams(layoutParams);
        feedStickerView.m56564m(m118736p, m118736p);
        feedStickerView.setLayoutParams(layoutParams);
        addView(inflate);
    }

    /* renamed from: c */
    private final void m47330c(MediaItem mediaItem) {
        this.f47398t.removeAllViews();
        this.f47398t.addView(this.f47396r);
        this.f47396r.setImageDrawable(AbstractC23170p.m119358p(getContext()));
        ((C23528a) this.f47394p.m123612r(this.f47396r)).m123618x(mediaItem.m41146h0(), C23278z2.m120123e0());
    }

    /* renamed from: e */
    private final void m47331e(C25630b c25630b) {
        String valueOf;
        this.f47398t.removeAllViews();
        this.f47398t.addView(this.f47397s);
        C2971f1 c2971f1 = new C2971f1(null, null, false, null, null, 31, null);
        c2971f1.m14060g("preview_comment");
        if (this.f47401w.length() > 0) {
            valueOf = this.f47401w;
        } else {
            valueOf = String.valueOf(System.currentTimeMillis());
        }
        c2971f1.m14061h(valueOf);
        c2971f1.m14059f(C28644j.m143233Y().m143282P0(c25630b));
        C20820s0.m108740n(this.f47397s, c2971f1, this.f47394p);
    }

    /* renamed from: a */
    public final void m47332a() {
        this.f47398t.removeAllViews();
        setVisibility(8);
    }

    /* renamed from: b */
    public final void m47333b(C19591a c19591a) {
        C25630b m102559b;
        String valueOf;
        AbstractC19074t.m100208f(c19591a, "previewData");
        if (!this.f47397s.m56562k() && (m102559b = c19591a.m102559b()) != null) {
            C2971f1 c2971f1 = new C2971f1(null, null, false, null, null, 31, null);
            c2971f1.m14060g("preview_comment");
            if (this.f47401w.length() > 0) {
                valueOf = this.f47401w;
            } else {
                valueOf = String.valueOf(System.currentTimeMillis());
            }
            c2971f1.m14061h(valueOf);
            c2971f1.m14059f(C28644j.m143233Y().m143282P0(m102559b));
            C20820s0.m108740n(this.f47397s, c2971f1, this.f47394p);
        }
    }

    /* renamed from: d */
    public final void m47334d(C19591a c19591a) {
        AbstractC19074t.m100208f(c19591a, "previewData");
        int m102560c = c19591a.m102560c();
        if (m102560c != 1) {
            if (m102560c == 2) {
                C25630b m102559b = c19591a.m102559b();
                if (m102559b != null) {
                    m47331e(m102559b);
                }
                this.f47400v = c19591a;
                return;
            }
            return;
        }
        MediaItem m102558a = c19591a.m102558a();
        if (m102558a != null) {
            m47330c(m102558a);
        }
        this.f47400v = c19591a;
    }

    public final C19591a getPreviewData() {
        return this.f47400v;
    }

    public final String getStickerUniqueId() {
        return this.f47401w;
    }

    public final void setOnCloseButtonClickListener(View.OnClickListener onClickListener) {
        AbstractC19074t.m100208f(onClickListener, "onClickListener");
        this.f47399u.setOnClickListener(onClickListener);
    }

    public final void setStickerUniqueId(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        this.f47401w = str;
    }
}

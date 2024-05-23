package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.StickerProgressView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.bd */
/* loaded from: classes3.dex */
public final class C29733bd implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f137351p;

    /* renamed from: q */
    public final RecyclingImageView f137352q;

    /* renamed from: r */
    public final StickerProgressView f137353r;

    /* renamed from: s */
    public final TextView f137354s;

    private C29733bd(RelativeLayout relativeLayout, RecyclingImageView recyclingImageView, StickerProgressView stickerProgressView, TextView textView) {
        this.f137351p = relativeLayout;
        this.f137352q = recyclingImageView;
        this.f137353r = stickerProgressView;
        this.f137354s = textView;
    }

    /* renamed from: a */
    public static C29733bd m147782a(View view) {
        int i11 = AbstractC6918a0.img_badge_music;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC6918a0.loading_progress;
            StickerProgressView stickerProgressView = (StickerProgressView) AbstractC22716b.m117526a(view, i11);
            if (stickerProgressView != null) {
                i11 = AbstractC6918a0.text_current;
                TextView textView = (TextView) AbstractC22716b.m117526a(view, i11);
                if (textView != null) {
                    return new C29733bd((RelativeLayout) view, recyclingImageView, stickerProgressView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29733bd m147783c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_box_lyric_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147782a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137351p;
    }
}

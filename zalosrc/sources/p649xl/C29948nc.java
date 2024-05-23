package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.StickerView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.nc */
/* loaded from: classes3.dex */
public final class C29948nc implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138807p;

    /* renamed from: q */
    public final ProgressBar f138808q;

    /* renamed from: r */
    public final ImageView f138809r;

    /* renamed from: s */
    public final StickerView f138810s;

    private C29948nc(FrameLayout frameLayout, ProgressBar progressBar, ImageView imageView, StickerView stickerView) {
        this.f138807p = frameLayout;
        this.f138808q = progressBar;
        this.f138809r = imageView;
        this.f138810s = stickerView;
    }

    /* renamed from: a */
    public static C29948nc m148292a(View view) {
        int i11 = AbstractC6918a0.progress_id;
        ProgressBar progressBar = (ProgressBar) AbstractC22716b.m117526a(view, i11);
        if (progressBar != null) {
            i11 = AbstractC6918a0.sticker_icon_voice;
            ImageView imageView = (ImageView) AbstractC22716b.m117526a(view, i11);
            if (imageView != null) {
                i11 = AbstractC6918a0.sticker_item_element;
                StickerView stickerView = (StickerView) AbstractC22716b.m117526a(view, i11);
                if (stickerView != null) {
                    return new C29948nc((FrameLayout) view, progressBar, imageView, stickerView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29948nc m148293c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.sticker_grid_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148292a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138807p;
    }
}

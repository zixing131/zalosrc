package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.o3 */
/* loaded from: classes3.dex */
public final class C29957o3 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138851p;

    /* renamed from: q */
    public final FrameLayout f138852q;

    /* renamed from: r */
    public final RecyclingImageView f138853r;

    /* renamed from: s */
    public final FrameLayout f138854s;

    private C29957o3(FrameLayout frameLayout, FrameLayout frameLayout2, RecyclingImageView recyclingImageView, FrameLayout frameLayout3) {
        this.f138851p = frameLayout;
        this.f138852q = frameLayout2;
        this.f138853r = recyclingImageView;
        this.f138854s = frameLayout3;
    }

    /* renamed from: a */
    public static C29957o3 m148307a(View view) {
        int i11 = AbstractC6918a0.btn_comment_full;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null) {
            i11 = AbstractC6918a0.btn_comment_icon;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null) {
                i11 = AbstractC6918a0.btn_comment_mini;
                FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                if (frameLayout2 != null) {
                    return new C29957o3((FrameLayout) view, frameLayout, recyclingImageView, frameLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29957o3 m148308c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.feed_comment_button, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148307a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138851p;
    }
}

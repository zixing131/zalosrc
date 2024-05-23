package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zdesign.component.ButtonWithProgress;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.q3 */
/* loaded from: classes3.dex */
public final class C29993q3 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139084p;

    /* renamed from: q */
    public final RobotoTextView f139085q;

    /* renamed from: r */
    public final RecyclingImageView f139086r;

    /* renamed from: s */
    public final ButtonWithProgress f139087s;

    private C29993q3(RelativeLayout relativeLayout, RobotoTextView robotoTextView, RecyclingImageView recyclingImageView, ButtonWithProgress buttonWithProgress) {
        this.f139084p = relativeLayout;
        this.f139085q = robotoTextView;
        this.f139086r = recyclingImageView;
        this.f139087s = buttonWithProgress;
    }

    /* renamed from: a */
    public static C29993q3 m148390a(View view) {
        int i11 = AbstractC6918a0.error_msg;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.icon;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null) {
                i11 = AbstractC6918a0.retry_button;
                ButtonWithProgress buttonWithProgress = (ButtonWithProgress) AbstractC22716b.m117526a(view, i11);
                if (buttonWithProgress != null) {
                    return new C29993q3((RelativeLayout) view, robotoTextView, recyclingImageView, buttonWithProgress);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29993q3 m148391c(LayoutInflater layoutInflater) {
        return m148392d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C29993q3 m148392d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.feed_item_video_channel_error_state, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148390a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139084p;
    }
}

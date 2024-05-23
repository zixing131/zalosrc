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

/* renamed from: xl.t3 */
/* loaded from: classes3.dex */
public final class C30045t3 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139373p;

    /* renamed from: q */
    public final RobotoTextView f139374q;

    /* renamed from: r */
    public final RecyclingImageView f139375r;

    /* renamed from: s */
    public final ButtonWithProgress f139376s;

    private C30045t3(RelativeLayout relativeLayout, RobotoTextView robotoTextView, RecyclingImageView recyclingImageView, ButtonWithProgress buttonWithProgress) {
        this.f139373p = relativeLayout;
        this.f139374q = robotoTextView;
        this.f139375r = recyclingImageView;
        this.f139376s = buttonWithProgress;
    }

    /* renamed from: a */
    public static C30045t3 m148514a(View view) {
        int i11 = AbstractC6918a0.error_msg;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.icon;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null) {
                i11 = AbstractC6918a0.retry_button;
                ButtonWithProgress buttonWithProgress = (ButtonWithProgress) AbstractC22716b.m117526a(view, i11);
                if (buttonWithProgress != null) {
                    return new C30045t3((RelativeLayout) view, robotoTextView, recyclingImageView, buttonWithProgress);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30045t3 m148515c(LayoutInflater layoutInflater) {
        return m148516d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30045t3 m148516d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.feed_item_zinstant_ads_error_state, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148514a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139373p;
    }
}

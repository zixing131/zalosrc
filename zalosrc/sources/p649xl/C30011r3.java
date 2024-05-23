package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.r3 */
/* loaded from: classes3.dex */
public final class C30011r3 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f139189p;

    /* renamed from: q */
    public final View f139190q;

    /* renamed from: r */
    public final LinearLayout f139191r;

    /* renamed from: s */
    public final RobotoTextView f139192s;

    /* renamed from: t */
    public final RobotoTextView f139193t;

    private C30011r3(LinearLayout linearLayout, View view, LinearLayout linearLayout2, RobotoTextView robotoTextView, RobotoTextView robotoTextView2) {
        this.f139189p = linearLayout;
        this.f139190q = view;
        this.f139191r = linearLayout2;
        this.f139192s = robotoTextView;
        this.f139193t = robotoTextView2;
    }

    /* renamed from: a */
    public static C30011r3 m148432a(View view) {
        int i11 = AbstractC6918a0.dot_divider;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i11 = AbstractC6918a0.section_subtitle;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.section_title;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    return new C30011r3(linearLayout, m117526a, linearLayout, robotoTextView, robotoTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30011r3 m148433c(LayoutInflater layoutInflater) {
        return m148434d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30011r3 m148434d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.feed_item_video_channel_header, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148432a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f139189p;
    }
}

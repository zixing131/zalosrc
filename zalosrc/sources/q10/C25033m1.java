package q10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.shortvideo.p072ui.widget.SwipeAndPullDismissLayout;
import com.zing.zalo.shortvideo.p072ui.widget.ZchInAppNotificationView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.AvatarImageView;
import com.zing.zalo.shortvideo.p072ui.widget.p074iv.PulseImageView;
import com.zing.zalo.shortvideo.p072ui.widget.tv.EllipsizedTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;
import v00.AbstractC27410e;

/* renamed from: q10.m1 */
/* loaded from: classes5.dex */
public final class C25033m1 implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f120102p;

    /* renamed from: q */
    public final SwipeAndPullDismissLayout f120103q;

    /* renamed from: r */
    public final ZchInAppNotificationView f120104r;

    /* renamed from: s */
    public final AvatarImageView f120105s;

    /* renamed from: t */
    public final PulseImageView f120106t;

    /* renamed from: u */
    public final FrameLayout f120107u;

    /* renamed from: v */
    public final EllipsizedTextView f120108v;

    /* renamed from: w */
    public final EllipsizedTextView f120109w;

    /* renamed from: x */
    public final EllipsizedTextView f120110x;

    private C25033m1(FrameLayout frameLayout, SwipeAndPullDismissLayout swipeAndPullDismissLayout, ZchInAppNotificationView zchInAppNotificationView, AvatarImageView avatarImageView, PulseImageView pulseImageView, FrameLayout frameLayout2, EllipsizedTextView ellipsizedTextView, EllipsizedTextView ellipsizedTextView2, EllipsizedTextView ellipsizedTextView3) {
        this.f120102p = frameLayout;
        this.f120103q = swipeAndPullDismissLayout;
        this.f120104r = zchInAppNotificationView;
        this.f120105s = avatarImageView;
        this.f120106t = pulseImageView;
        this.f120107u = frameLayout2;
        this.f120108v = ellipsizedTextView;
        this.f120109w = ellipsizedTextView2;
        this.f120110x = ellipsizedTextView3;
    }

    /* renamed from: a */
    public static C25033m1 m129886a(View view) {
        int i11 = AbstractC27409d.inAppContainerView;
        SwipeAndPullDismissLayout swipeAndPullDismissLayout = (SwipeAndPullDismissLayout) AbstractC22716b.m117526a(view, i11);
        if (swipeAndPullDismissLayout != null) {
            i11 = AbstractC27409d.inAppNotiView;
            ZchInAppNotificationView zchInAppNotificationView = (ZchInAppNotificationView) AbstractC22716b.m117526a(view, i11);
            if (zchInAppNotificationView != null) {
                i11 = AbstractC27409d.ivAvatar;
                AvatarImageView avatarImageView = (AvatarImageView) AbstractC22716b.m117526a(view, i11);
                if (avatarImageView != null) {
                    i11 = AbstractC27409d.ivRing;
                    PulseImageView pulseImageView = (PulseImageView) AbstractC22716b.m117526a(view, i11);
                    if (pulseImageView != null) {
                        i11 = AbstractC27409d.masterFrame;
                        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                        if (frameLayout != null) {
                            i11 = AbstractC27409d.tvDes;
                            EllipsizedTextView ellipsizedTextView = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                            if (ellipsizedTextView != null) {
                                i11 = AbstractC27409d.tvTitle;
                                EllipsizedTextView ellipsizedTextView2 = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                if (ellipsizedTextView2 != null) {
                                    i11 = AbstractC27409d.tvToast;
                                    EllipsizedTextView ellipsizedTextView3 = (EllipsizedTextView) AbstractC22716b.m117526a(view, i11);
                                    if (ellipsizedTextView3 != null) {
                                        return new C25033m1((FrameLayout) view, swipeAndPullDismissLayout, zchInAppNotificationView, avatarImageView, pulseImageView, frameLayout, ellipsizedTextView, ellipsizedTextView2, ellipsizedTextView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C25033m1 m129887c(LayoutInflater layoutInflater) {
        return m129888d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C25033m1 m129888d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC27410e.zch_layout_master, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m129886a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f120102p;
    }
}

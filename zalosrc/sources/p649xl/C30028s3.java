package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.TimelineSkeletonView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.s3 */
/* loaded from: classes3.dex */
public final class C30028s3 implements InterfaceC22715a {

    /* renamed from: p */
    private final RelativeLayout f139285p;

    /* renamed from: q */
    public final TimelineSkeletonView f139286q;

    private C30028s3(RelativeLayout relativeLayout, TimelineSkeletonView timelineSkeletonView) {
        this.f139285p = relativeLayout;
        this.f139286q = timelineSkeletonView;
    }

    /* renamed from: a */
    public static C30028s3 m148476a(View view) {
        int i11 = AbstractC6918a0.skeleton_view;
        TimelineSkeletonView timelineSkeletonView = (TimelineSkeletonView) AbstractC22716b.m117526a(view, i11);
        if (timelineSkeletonView != null) {
            return new C30028s3((RelativeLayout) view, timelineSkeletonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C30028s3 m148477c(LayoutInflater layoutInflater) {
        return m148478d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C30028s3 m148478d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.feed_item_video_channel_loading_state, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148476a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f139285p;
    }
}

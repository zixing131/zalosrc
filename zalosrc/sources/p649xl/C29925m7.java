package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.TimelineSkeletonView;
import p338m2.InterfaceC22715a;

/* renamed from: xl.m7 */
/* loaded from: classes3.dex */
public final class C29925m7 implements InterfaceC22715a {

    /* renamed from: p */
    private final TimelineSkeletonView f138664p;

    /* renamed from: q */
    public final TimelineSkeletonView f138665q;

    private C29925m7(TimelineSkeletonView timelineSkeletonView, TimelineSkeletonView timelineSkeletonView2) {
        this.f138664p = timelineSkeletonView;
        this.f138665q = timelineSkeletonView2;
    }

    /* renamed from: a */
    public static C29925m7 m148242a(View view) {
        if (view != null) {
            TimelineSkeletonView timelineSkeletonView = (TimelineSkeletonView) view;
            return new C29925m7(timelineSkeletonView, timelineSkeletonView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29925m7 m148243c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.layout_time_line_loading_state, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148242a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TimelineSkeletonView getRoot() {
        return this.f138664p;
    }
}

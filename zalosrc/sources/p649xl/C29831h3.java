package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.recyclerview.SlidingTabRecyclerView;
import p338m2.InterfaceC22715a;

/* renamed from: xl.h3 */
/* loaded from: classes3.dex */
public final class C29831h3 implements InterfaceC22715a {

    /* renamed from: p */
    private final SlidingTabRecyclerView f137961p;

    /* renamed from: q */
    public final SlidingTabRecyclerView f137962q;

    private C29831h3(SlidingTabRecyclerView slidingTabRecyclerView, SlidingTabRecyclerView slidingTabRecyclerView2) {
        this.f137961p = slidingTabRecyclerView;
        this.f137962q = slidingTabRecyclerView2;
    }

    /* renamed from: a */
    public static C29831h3 m148021a(View view) {
        if (view != null) {
            SlidingTabRecyclerView slidingTabRecyclerView = (SlidingTabRecyclerView) view;
            return new C29831h3(slidingTabRecyclerView, slidingTabRecyclerView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29831h3 m148022c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.emoji_reaction_indicator_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148021a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SlidingTabRecyclerView getRoot() {
        return this.f137961p;
    }
}

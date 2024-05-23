package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.view.ViewPager;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zdesign.component.Button;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.f0 */
/* loaded from: classes3.dex */
public final class C29792f0 implements InterfaceC22715a {

    /* renamed from: p */
    private final LinearLayout f137720p;

    /* renamed from: q */
    public final Button f137721q;

    /* renamed from: r */
    public final FrameLayout f137722r;

    /* renamed from: s */
    public final ViewPager f137723s;

    /* renamed from: t */
    public final FrameLayout f137724t;

    /* renamed from: u */
    public final C29849i3 f137725u;

    /* renamed from: v */
    public final RecyclerView f137726v;

    /* renamed from: w */
    public final FrameLayout f137727w;

    private C29792f0(LinearLayout linearLayout, Button button, FrameLayout frameLayout, ViewPager viewPager, FrameLayout frameLayout2, C29849i3 c29849i3, RecyclerView recyclerView, FrameLayout frameLayout3) {
        this.f137720p = linearLayout;
        this.f137721q = button;
        this.f137722r = frameLayout;
        this.f137723s = viewPager;
        this.f137724t = frameLayout2;
        this.f137725u = c29849i3;
        this.f137726v = recyclerView;
        this.f137727w = frameLayout3;
    }

    /* renamed from: a */
    public static C29792f0 m147922a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.btn_jump_today;
        Button button = (Button) AbstractC22716b.m117526a(view, i11);
        if (button != null) {
            i11 = AbstractC6918a0.calendar_container;
            FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
            if (frameLayout != null) {
                i11 = AbstractC6918a0.calendar_pager;
                ViewPager viewPager = (ViewPager) AbstractC22716b.m117526a(view, i11);
                if (viewPager != null) {
                    i11 = AbstractC6918a0.drag_view;
                    FrameLayout frameLayout2 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                    if (frameLayout2 != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.empty_view))) != null) {
                        C29849i3 m148063a = C29849i3.m148063a(m117526a);
                        i11 = AbstractC6918a0.event_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) AbstractC22716b.m117526a(view, i11);
                        if (recyclerView != null) {
                            i11 = AbstractC6918a0.main_view;
                            FrameLayout frameLayout3 = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                            if (frameLayout3 != null) {
                                return new C29792f0((LinearLayout) view, button, frameLayout, viewPager, frameLayout2, m148063a, recyclerView, frameLayout3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29792f0 m147923c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.birthday_hub_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147922a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.f137720p;
    }
}

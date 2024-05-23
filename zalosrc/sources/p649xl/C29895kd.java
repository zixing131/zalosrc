package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.ReactionHorizontalView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.kd */
/* loaded from: classes3.dex */
public final class C29895kd implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f138501p;

    /* renamed from: q */
    public final C29715ad f138502q;

    /* renamed from: r */
    public final ReactionHorizontalView f138503r;

    /* renamed from: s */
    public final FrameLayout f138504s;

    private C29895kd(FrameLayout frameLayout, C29715ad c29715ad, ReactionHorizontalView reactionHorizontalView, FrameLayout frameLayout2) {
        this.f138501p = frameLayout;
        this.f138502q = c29715ad;
        this.f138503r = reactionHorizontalView;
        this.f138504s = frameLayout2;
    }

    /* renamed from: a */
    public static C29895kd m148174a(View view) {
        int i11 = AbstractC6918a0.story_bottom_input_message;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            C29715ad m147737a = C29715ad.m147737a(m117526a);
            int i12 = AbstractC6918a0.story_message_and_reaction_bar;
            ReactionHorizontalView reactionHorizontalView = (ReactionHorizontalView) AbstractC22716b.m117526a(view, i12);
            if (reactionHorizontalView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new C29895kd(frameLayout, m147737a, reactionHorizontalView, frameLayout);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f138501p;
    }
}

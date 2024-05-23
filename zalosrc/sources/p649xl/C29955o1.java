package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicomponents.reddot.RedDotRobotoTextView;
import p338m2.InterfaceC22715a;

/* renamed from: xl.o1 */
/* loaded from: classes3.dex */
public final class C29955o1 implements InterfaceC22715a {

    /* renamed from: p */
    private final RedDotRobotoTextView f138846p;

    /* renamed from: q */
    public final RedDotRobotoTextView f138847q;

    private C29955o1(RedDotRobotoTextView redDotRobotoTextView, RedDotRobotoTextView redDotRobotoTextView2) {
        this.f138846p = redDotRobotoTextView;
        this.f138847q = redDotRobotoTextView2;
    }

    /* renamed from: a */
    public static C29955o1 m148301a(View view) {
        if (view != null) {
            RedDotRobotoTextView redDotRobotoTextView = (RedDotRobotoTextView) view;
            return new C29955o1(redDotRobotoTextView, redDotRobotoTextView);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C29955o1 m148302c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.camera_video_mode_picker_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m148301a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RedDotRobotoTextView getRoot() {
        return this.f138846p;
    }
}

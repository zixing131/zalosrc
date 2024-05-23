package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.camera.videos.videocrop.VideoCropLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.n1 */
/* loaded from: classes3.dex */
public final class C29937n1 implements InterfaceC22715a {

    /* renamed from: p */
    private final VideoCropLayout f138744p;

    /* renamed from: q */
    public final FrameLayout f138745q;

    /* renamed from: r */
    public final RobotoTextView f138746r;

    /* renamed from: s */
    public final RobotoTextView f138747s;

    /* renamed from: t */
    public final RobotoTextView f138748t;

    /* renamed from: u */
    public final VideoCropLayout f138749u;

    private C29937n1(VideoCropLayout videoCropLayout, FrameLayout frameLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3, VideoCropLayout videoCropLayout2) {
        this.f138744p = videoCropLayout;
        this.f138745q = frameLayout;
        this.f138746r = robotoTextView;
        this.f138747s = robotoTextView2;
        this.f138748t = robotoTextView3;
        this.f138749u = videoCropLayout2;
    }

    /* renamed from: a */
    public static C29937n1 m148264a(View view) {
        int i11 = AbstractC6918a0.crop_view;
        FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
        if (frameLayout != null) {
            i11 = AbstractC6918a0.left_info_text;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                i11 = AbstractC6918a0.right_info_text;
                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView2 != null) {
                    i11 = AbstractC6918a0.start_end_duration_text;
                    RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView3 != null) {
                        VideoCropLayout videoCropLayout = (VideoCropLayout) view;
                        return new C29937n1(videoCropLayout, frameLayout, robotoTextView, robotoTextView2, robotoTextView3, videoCropLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public VideoCropLayout getRoot() {
        return this.f138744p;
    }
}

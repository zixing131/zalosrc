package p649xl;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.camera.videos.customviews.VideoSpeedSeekBar;
import com.zing.zalo.camera.videos.videospeed.VideoSpeedLayout;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.p1 */
/* loaded from: classes3.dex */
public final class C29973p1 implements InterfaceC22715a {

    /* renamed from: p */
    private final VideoSpeedLayout f138928p;

    /* renamed from: q */
    public final View f138929q;

    /* renamed from: r */
    public final AppCompatImageButton f138930r;

    /* renamed from: s */
    public final LinearLayout f138931s;

    /* renamed from: t */
    public final RobotoTextView f138932t;

    /* renamed from: u */
    public final RobotoTextView f138933u;

    /* renamed from: v */
    public final VideoSpeedLayout f138934v;

    /* renamed from: w */
    public final VideoSpeedSeekBar f138935w;

    private C29973p1(VideoSpeedLayout videoSpeedLayout, View view, AppCompatImageButton appCompatImageButton, LinearLayout linearLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, VideoSpeedLayout videoSpeedLayout2, VideoSpeedSeekBar videoSpeedSeekBar) {
        this.f138928p = videoSpeedLayout;
        this.f138929q = view;
        this.f138930r = appCompatImageButton;
        this.f138931s = linearLayout;
        this.f138932t = robotoTextView;
        this.f138933u = robotoTextView2;
        this.f138934v = videoSpeedLayout2;
        this.f138935w = videoSpeedSeekBar;
    }

    /* renamed from: a */
    public static C29973p1 m148348a(View view) {
        int i11 = AbstractC6918a0.overlay_view;
        View m117526a = AbstractC22716b.m117526a(view, i11);
        if (m117526a != null) {
            i11 = AbstractC6918a0.reverse_button;
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) AbstractC22716b.m117526a(view, i11);
            if (appCompatImageButton != null) {
                i11 = AbstractC6918a0.right_controls;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null) {
                    i11 = AbstractC6918a0.speed_indicator_text;
                    RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                    if (robotoTextView != null) {
                        i11 = AbstractC6918a0.speed_save_text;
                        RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                        if (robotoTextView2 != null) {
                            VideoSpeedLayout videoSpeedLayout = (VideoSpeedLayout) view;
                            i11 = AbstractC6918a0.video_speed_seek_bar;
                            VideoSpeedSeekBar videoSpeedSeekBar = (VideoSpeedSeekBar) AbstractC22716b.m117526a(view, i11);
                            if (videoSpeedSeekBar != null) {
                                return new C29973p1(videoSpeedLayout, m117526a, appCompatImageButton, linearLayout, robotoTextView, robotoTextView2, videoSpeedLayout, videoSpeedSeekBar);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public VideoSpeedLayout getRoot() {
        return this.f138928p;
    }
}

package p649xl;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.camera.music.p060ui.MusicView;
import com.zing.zalo.p077ui.imgdecor.caption.customview.CaptionRoundedTextView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicomponents.imagebutton.ActiveImageButton;
import com.zing.zalo.uicontrol.recyclerview.ZRecyclerView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.gd */
/* loaded from: classes3.dex */
public final class C29823gd implements InterfaceC22715a {

    /* renamed from: p */
    private final MusicView f137897p;

    /* renamed from: q */
    public final ActiveImageButton f137898q;

    /* renamed from: r */
    public final RobotoTextView f137899r;

    /* renamed from: s */
    public final C29743c5 f137900s;

    /* renamed from: t */
    public final LinearLayout f137901t;

    /* renamed from: u */
    public final View f137902u;

    /* renamed from: v */
    public final FrameLayout f137903v;

    /* renamed from: w */
    public final ZRecyclerView f137904w;

    /* renamed from: x */
    public final CaptionRoundedTextView f137905x;

    /* renamed from: y */
    public final RobotoTextView f137906y;

    private C29823gd(MusicView musicView, ActiveImageButton activeImageButton, RobotoTextView robotoTextView, C29743c5 c29743c5, LinearLayout linearLayout, View view, FrameLayout frameLayout, ZRecyclerView zRecyclerView, CaptionRoundedTextView captionRoundedTextView, RobotoTextView robotoTextView2) {
        this.f137897p = musicView;
        this.f137898q = activeImageButton;
        this.f137899r = robotoTextView;
        this.f137900s = c29743c5;
        this.f137901t = linearLayout;
        this.f137902u = view;
        this.f137903v = frameLayout;
        this.f137904w = zRecyclerView;
        this.f137905x = captionRoundedTextView;
        this.f137906y = robotoTextView2;
    }

    /* renamed from: a */
    public static C29823gd m148001a(View view) {
        View m117526a;
        View m117526a2;
        int i11 = AbstractC6918a0.btn_music_delete;
        ActiveImageButton activeImageButton = (ActiveImageButton) AbstractC22716b.m117526a(view, i11);
        if (activeImageButton != null) {
            i11 = AbstractC6918a0.btn_music_done;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.layout_song_info))) != null) {
                C29743c5 m147802a = C29743c5.m147802a(m117526a);
                i11 = AbstractC6918a0.music_bottom_panel;
                LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                if (linearLayout != null && (m117526a2 = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.music_onboarding_target))) != null) {
                    i11 = AbstractC6918a0.music_top_panel;
                    FrameLayout frameLayout = (FrameLayout) AbstractC22716b.m117526a(view, i11);
                    if (frameLayout != null) {
                        i11 = AbstractC6918a0.recycler_view_story_effects;
                        ZRecyclerView zRecyclerView = (ZRecyclerView) AbstractC22716b.m117526a(view, i11);
                        if (zRecyclerView != null) {
                            i11 = AbstractC6918a0.story_lyric_font_selector;
                            CaptionRoundedTextView captionRoundedTextView = (CaptionRoundedTextView) AbstractC22716b.m117526a(view, i11);
                            if (captionRoundedTextView != null) {
                                i11 = AbstractC6918a0.tv_alert_no_music_visual;
                                RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                if (robotoTextView2 != null) {
                                    return new C29823gd((MusicView) view, activeImageButton, robotoTextView, m147802a, linearLayout, m117526a2, frameLayout, zRecyclerView, captionRoundedTextView, robotoTextView2);
                                }
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
    public MusicView getRoot() {
        return this.f137897p;
    }
}

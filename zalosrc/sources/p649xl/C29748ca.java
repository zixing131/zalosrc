package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.ProfileMusicPlayerView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.ca */
/* loaded from: classes3.dex */
public final class C29748ca implements InterfaceC22715a {

    /* renamed from: p */
    private final FrameLayout f137423p;

    /* renamed from: q */
    public final MultiStateView f137424q;

    /* renamed from: r */
    public final ProfileMusicPlayerView f137425r;

    private C29748ca(FrameLayout frameLayout, MultiStateView multiStateView, ProfileMusicPlayerView profileMusicPlayerView) {
        this.f137423p = frameLayout;
        this.f137424q = multiStateView;
        this.f137425r = profileMusicPlayerView;
    }

    /* renamed from: a */
    public static C29748ca m147813a(View view) {
        int i11 = AbstractC6918a0.multi_state;
        MultiStateView multiStateView = (MultiStateView) AbstractC22716b.m117526a(view, i11);
        if (multiStateView != null) {
            i11 = AbstractC6918a0.player_view;
            ProfileMusicPlayerView profileMusicPlayerView = (ProfileMusicPlayerView) AbstractC22716b.m117526a(view, i11);
            if (profileMusicPlayerView != null) {
                return new C29748ca((FrameLayout) view, multiStateView, profileMusicPlayerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29748ca m147814c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.profile_music_bottom_sheet, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147813a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FrameLayout getRoot() {
        return this.f137423p;
    }
}

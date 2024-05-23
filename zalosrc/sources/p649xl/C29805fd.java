package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.components.EmptyContentView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.fd */
/* loaded from: classes3.dex */
public final class C29805fd implements InterfaceC22715a {

    /* renamed from: A */
    public final RobotoTextView f137779A;

    /* renamed from: B */
    public final LinearLayout f137780B;

    /* renamed from: C */
    public final RelativeLayout f137781C;

    /* renamed from: D */
    public final RobotoTextView f137782D;

    /* renamed from: E */
    public final RobotoTextView f137783E;

    /* renamed from: F */
    public final RoundCornerImageView f137784F;

    /* renamed from: G */
    public final RoundCornerImageView f137785G;

    /* renamed from: H */
    public final LinearLayout f137786H;

    /* renamed from: I */
    public final RecyclingImageView f137787I;

    /* renamed from: p */
    private final RelativeLayout f137788p;

    /* renamed from: q */
    public final RobotoTextView f137789q;

    /* renamed from: r */
    public final RobotoTextView f137790r;

    /* renamed from: s */
    public final RelativeLayout f137791s;

    /* renamed from: t */
    public final View f137792t;

    /* renamed from: u */
    public final RecyclingImageView f137793u;

    /* renamed from: v */
    public final EmptyContentView f137794v;

    /* renamed from: w */
    public final RelativeLayout f137795w;

    /* renamed from: x */
    public final RelativeLayout f137796x;

    /* renamed from: y */
    public final RelativeLayout f137797y;

    /* renamed from: z */
    public final RelativeLayout f137798z;

    private C29805fd(RelativeLayout relativeLayout, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RelativeLayout relativeLayout2, View view, RecyclingImageView recyclingImageView, EmptyContentView emptyContentView, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RobotoTextView robotoTextView3, LinearLayout linearLayout, RelativeLayout relativeLayout7, RobotoTextView robotoTextView4, RobotoTextView robotoTextView5, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, LinearLayout linearLayout2, RecyclingImageView recyclingImageView2) {
        this.f137788p = relativeLayout;
        this.f137789q = robotoTextView;
        this.f137790r = robotoTextView2;
        this.f137791s = relativeLayout2;
        this.f137792t = view;
        this.f137793u = recyclingImageView;
        this.f137794v = emptyContentView;
        this.f137795w = relativeLayout3;
        this.f137796x = relativeLayout4;
        this.f137797y = relativeLayout5;
        this.f137798z = relativeLayout6;
        this.f137779A = robotoTextView3;
        this.f137780B = linearLayout;
        this.f137781C = relativeLayout7;
        this.f137782D = robotoTextView4;
        this.f137783E = robotoTextView5;
        this.f137784F = roundCornerImageView;
        this.f137785G = roundCornerImageView2;
        this.f137786H = linearLayout2;
        this.f137787I = recyclingImageView2;
    }

    /* renamed from: a */
    public static C29805fd m147957a(View view) {
        View m117526a;
        int i11 = AbstractC6918a0.artist_name;
        RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
        if (robotoTextView != null) {
            i11 = AbstractC6918a0.artist_name_error_can_not_stream;
            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView2 != null) {
                i11 = AbstractC6918a0.description_error_can_not_stream;
                RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                if (relativeLayout != null && (m117526a = AbstractC22716b.m117526a(view, (i11 = AbstractC6918a0.divider))) != null) {
                    i11 = AbstractC6918a0.icn_slide_hint;
                    RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                    if (recyclingImageView != null) {
                        i11 = AbstractC6918a0.layout_empty_content_no_network;
                        EmptyContentView emptyContentView = (EmptyContentView) AbstractC22716b.m117526a(view, i11);
                        if (emptyContentView != null) {
                            i11 = AbstractC6918a0.layout_error_can_not_stream;
                            RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                            if (relativeLayout2 != null) {
                                i11 = AbstractC6918a0.layout_error_empty;
                                RelativeLayout relativeLayout3 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                if (relativeLayout3 != null) {
                                    i11 = AbstractC6918a0.layout_music_detail;
                                    RelativeLayout relativeLayout4 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                    if (relativeLayout4 != null) {
                                        RelativeLayout relativeLayout5 = (RelativeLayout) view;
                                        i11 = AbstractC6918a0.post_story_button;
                                        RobotoTextView robotoTextView3 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                        if (robotoTextView3 != null) {
                                            i11 = AbstractC6918a0.song_detail;
                                            LinearLayout linearLayout = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                            if (linearLayout != null) {
                                                i11 = AbstractC6918a0.song_info_container;
                                                RelativeLayout relativeLayout6 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                                if (relativeLayout6 != null) {
                                                    i11 = AbstractC6918a0.song_name;
                                                    RobotoTextView robotoTextView4 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                    if (robotoTextView4 != null) {
                                                        i11 = AbstractC6918a0.song_name_error_can_not_stream;
                                                        RobotoTextView robotoTextView5 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                                        if (robotoTextView5 != null) {
                                                            i11 = AbstractC6918a0.song_thumb;
                                                            RoundCornerImageView roundCornerImageView = (RoundCornerImageView) AbstractC22716b.m117526a(view, i11);
                                                            if (roundCornerImageView != null) {
                                                                i11 = AbstractC6918a0.song_thumb_error_can_not_stream;
                                                                RoundCornerImageView roundCornerImageView2 = (RoundCornerImageView) AbstractC22716b.m117526a(view, i11);
                                                                if (roundCornerImageView2 != null) {
                                                                    i11 = AbstractC6918a0.zing_mp3_button;
                                                                    LinearLayout linearLayout2 = (LinearLayout) AbstractC22716b.m117526a(view, i11);
                                                                    if (linearLayout2 != null) {
                                                                        i11 = AbstractC6918a0.zing_mp3_icon;
                                                                        RecyclingImageView recyclingImageView2 = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
                                                                        if (recyclingImageView2 != null) {
                                                                            return new C29805fd(relativeLayout5, robotoTextView, robotoTextView2, relativeLayout, m117526a, recyclingImageView, emptyContentView, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, robotoTextView3, linearLayout, relativeLayout6, robotoTextView4, robotoTextView5, roundCornerImageView, roundCornerImageView2, linearLayout2, recyclingImageView2);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    /* renamed from: c */
    public static C29805fd m147958c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.story_music_detail_bottom_sheet_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return m147957a(inflate);
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public RelativeLayout getRoot() {
        return this.f137788p;
    }
}

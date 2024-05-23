package p649xl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.AspectRatioImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;

/* renamed from: xl.l7 */
/* loaded from: classes3.dex */
public final class C29907l7 implements InterfaceC22715a {

    /* renamed from: p */
    private final View f138569p;

    /* renamed from: q */
    public final RelativeLayout f138570q;

    /* renamed from: r */
    public final RecyclingImageView f138571r;

    /* renamed from: s */
    public final RobotoTextView f138572s;

    /* renamed from: t */
    public final RelativeLayout f138573t;

    /* renamed from: u */
    public final RelativeLayout f138574u;

    /* renamed from: v */
    public final AspectRatioImageView f138575v;

    /* renamed from: w */
    public final RelativeLayout f138576w;

    /* renamed from: x */
    public final AspectRatioImageView f138577x;

    /* renamed from: y */
    public final AspectRatioImageView f138578y;

    /* renamed from: z */
    public final RobotoTextView f138579z;

    private C29907l7(View view, RelativeLayout relativeLayout, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, AspectRatioImageView aspectRatioImageView, RelativeLayout relativeLayout4, AspectRatioImageView aspectRatioImageView2, AspectRatioImageView aspectRatioImageView3, RobotoTextView robotoTextView2) {
        this.f138569p = view;
        this.f138570q = relativeLayout;
        this.f138571r = recyclingImageView;
        this.f138572s = robotoTextView;
        this.f138573t = relativeLayout2;
        this.f138574u = relativeLayout3;
        this.f138575v = aspectRatioImageView;
        this.f138576w = relativeLayout4;
        this.f138577x = aspectRatioImageView2;
        this.f138578y = aspectRatioImageView3;
        this.f138579z = robotoTextView2;
    }

    /* renamed from: a */
    public static C29907l7 m148201a(View view) {
        int i11 = AbstractC6918a0.container;
        RelativeLayout relativeLayout = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
        if (relativeLayout != null) {
            i11 = AbstractC6918a0.cover;
            RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
            if (recyclingImageView != null) {
                i11 = AbstractC6918a0.desc;
                RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                if (robotoTextView != null) {
                    i11 = AbstractC6918a0.desc_container;
                    RelativeLayout relativeLayout2 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                    if (relativeLayout2 != null) {
                        i11 = AbstractC6918a0.empty_album_containter;
                        RelativeLayout relativeLayout3 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                        if (relativeLayout3 != null) {
                            i11 = AbstractC6918a0.icon;
                            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
                            if (aspectRatioImageView != null) {
                                i11 = AbstractC6918a0.layout_cover;
                                RelativeLayout relativeLayout4 = (RelativeLayout) AbstractC22716b.m117526a(view, i11);
                                if (relativeLayout4 != null) {
                                    i11 = AbstractC6918a0.privacyIcon;
                                    AspectRatioImageView aspectRatioImageView2 = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
                                    if (aspectRatioImageView2 != null) {
                                        i11 = AbstractC6918a0.thumb_empty;
                                        AspectRatioImageView aspectRatioImageView3 = (AspectRatioImageView) AbstractC22716b.m117526a(view, i11);
                                        if (aspectRatioImageView3 != null) {
                                            i11 = AbstractC6918a0.title;
                                            RobotoTextView robotoTextView2 = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
                                            if (robotoTextView2 != null) {
                                                return new C29907l7(view, relativeLayout, recyclingImageView, robotoTextView, relativeLayout2, relativeLayout3, aspectRatioImageView, relativeLayout4, aspectRatioImageView2, aspectRatioImageView3, robotoTextView2);
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

    /* renamed from: b */
    public static C29907l7 m148202b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(AbstractC7409c0.layout_suggest_album_item, viewGroup);
            return m148201a(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // p338m2.InterfaceC22715a
    public View getRoot() {
        return this.f138569p;
    }
}

package q10;

import android.view.View;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.shortvideo.p072ui.component.p073rv.item.ChannelCtaItem;
import p338m2.AbstractC22716b;
import p338m2.InterfaceC22715a;
import v00.AbstractC27409d;

/* renamed from: q10.k */
/* loaded from: classes5.dex */
public final class C25023k implements InterfaceC22715a {

    /* renamed from: p */
    private final ChannelCtaItem f120015p;

    /* renamed from: q */
    public final RecyclingImageView f120016q;

    /* renamed from: r */
    public final RobotoTextView f120017r;

    private C25023k(ChannelCtaItem channelCtaItem, RecyclingImageView recyclingImageView, RobotoTextView robotoTextView) {
        this.f120015p = channelCtaItem;
        this.f120016q = recyclingImageView;
        this.f120017r = robotoTextView;
    }

    /* renamed from: a */
    public static C25023k m129863a(View view) {
        int i11 = AbstractC27409d.ivIcon;
        RecyclingImageView recyclingImageView = (RecyclingImageView) AbstractC22716b.m117526a(view, i11);
        if (recyclingImageView != null) {
            i11 = AbstractC27409d.tvCta;
            RobotoTextView robotoTextView = (RobotoTextView) AbstractC22716b.m117526a(view, i11);
            if (robotoTextView != null) {
                return new C25023k((ChannelCtaItem) view, recyclingImageView, robotoTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // p338m2.InterfaceC22715a
    /* renamed from: b */
    public ChannelCtaItem getRoot() {
        return this.f120015p;
    }
}

package cd0;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.p077ui.widget.imageview.RoundCornerImageView;
import com.zing.zalo.uidrawing.C16719g;
import ho0.AbstractC20110a;
import l30.AbstractC22055v0;
import me0.C23212s8;

/* renamed from: cd0.c */
/* loaded from: classes4.dex */
public abstract class AbstractC3424c implements AbstractC22055v0.j {

    /* renamed from: p */
    public View f14376p;

    /* renamed from: q */
    public RecyclingImageView f14377q;

    /* renamed from: r */
    public ImageView f14378r;

    /* renamed from: s */
    public ProgressBar f14379s;

    /* renamed from: t */
    public ImageView f14380t;

    /* renamed from: u */
    public AbstractC22055v0.k f14381u;

    /* renamed from: v */
    public int f14382v = -1;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m17192a(View view) {
        if (view != null) {
            try {
                this.f14376p = view;
                this.f14377q = (RecyclingImageView) view.findViewById(AbstractC6918a0.ic_story_thumb);
                this.f14378r = (ImageView) this.f14376p.findViewById(AbstractC6918a0.ic_story_indicator);
                this.f14379s = (ProgressBar) this.f14376p.findViewById(AbstractC6918a0.ic_story_loading);
                this.f14380t = (ImageView) this.f14376p.findViewById(AbstractC6918a0.ic_story_sent_fail);
                RecyclingImageView recyclingImageView = this.f14377q;
                if (recyclingImageView != null && (recyclingImageView instanceof RoundCornerImageView)) {
                    ((RoundCornerImageView) recyclingImageView).setRoundCornerColor(C23212s8.m119607o(recyclingImageView.getContext(), AbstractC16781w.PrimaryBackgroundColor));
                    RecyclingImageView recyclingImageView2 = this.f14377q;
                    recyclingImageView2.setStrokeColor(C23212s8.m119607o(recyclingImageView2.getContext(), AbstractC16781w.SecondaryBackgroundColor));
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: f */
    public void m17193f(int i11) {
        int i12;
        this.f14382v = i11;
        AbstractC22055v0.k m115152l = AbstractC22055v0.m115152l(i11);
        this.f14381u = m115152l;
        if (m115152l != null) {
            RecyclingImageView recyclingImageView = this.f14377q;
            if (recyclingImageView != null) {
                ViewGroup.LayoutParams layoutParams = recyclingImageView.getLayoutParams();
                if (layoutParams != null) {
                    AbstractC22055v0.k kVar = this.f14381u;
                    layoutParams.width = kVar.f108642a;
                    layoutParams.height = kVar.f108643b;
                    this.f14377q.setLayoutParams(layoutParams);
                }
                int i13 = this.f14381u.f108647f;
                if (i13 > 0) {
                    RecyclingImageView recyclingImageView2 = this.f14377q;
                    if (recyclingImageView2 instanceof RoundCornerImageView) {
                        ((RoundCornerImageView) recyclingImageView2).setRoundRadius(i13);
                    }
                }
            }
            ImageView imageView = this.f14378r;
            if (imageView != null) {
                if (this.f14381u.f108646e) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                imageView.setVisibility(i12);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f14378r.getLayoutParams();
                if (marginLayoutParams != null) {
                    AbstractC22055v0.k kVar2 = this.f14381u;
                    int i14 = kVar2.f108644c;
                    marginLayoutParams.width = i14;
                    marginLayoutParams.height = i14;
                    int i15 = kVar2.f108645d;
                    marginLayoutParams.leftMargin = i15;
                    marginLayoutParams.bottomMargin = i15;
                    this.f14378r.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    @Override // l30.AbstractC22055v0.j
    public int getPopulatePosition() {
        return this.f14382v;
    }

    @Override // l30.AbstractC22055v0.j
    public C16719g getThumbModule() {
        return null;
    }

    @Override // l30.AbstractC22055v0.j
    public int getThumbRoundCorner() {
        AbstractC22055v0.k kVar = this.f14381u;
        if (kVar != null) {
            return kVar.f108647f;
        }
        return 0;
    }

    @Override // l30.AbstractC22055v0.j
    public View getThumbView() {
        return this.f14377q;
    }
}

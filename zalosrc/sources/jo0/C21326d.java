package jo0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.C3979l;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.StickerView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import jo0.C21326d;
import ko0.C21786a;
import p354n3.C23528a;
import p379o3.AbstractC24006q;
import p471r3.C25630b;
import p588vw.C28644j;
import vg.C28020b3;

/* renamed from: jo0.d */
/* loaded from: classes7.dex */
public final class C21326d extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final Context f103833r;

    /* renamed from: s */
    private boolean f103834s;

    /* renamed from: t */
    private boolean f103835t;

    /* renamed from: u */
    private final C23528a f103836u;

    /* renamed from: v */
    private b f103837v;

    /* renamed from: w */
    private ArrayList f103838w;

    /* renamed from: jo0.d$a */
    /* loaded from: classes7.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
        }

        /* renamed from: i0 */
        public void mo110431i0(C21786a.a aVar) {
            AbstractC19074t.m100208f(aVar, "stickerInfo");
        }
    }

    /* renamed from: jo0.d$b */
    /* loaded from: classes7.dex */
    public interface b {
        /* renamed from: a */
        void mo110432a(C25630b c25630b);
    }

    /* renamed from: jo0.d$c */
    /* loaded from: classes7.dex */
    public final class c extends a {

        /* renamed from: I */
        private ProgressBar f103839I;

        /* renamed from: J */
        private StickerView f103840J;

        /* renamed from: K */
        final /* synthetic */ C21326d f103841K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C21326d c21326d, View view) {
            super(view);
            AbstractC19074t.m100208f(view, "itemView");
            this.f103841K = c21326d;
            StickerView stickerView = (StickerView) view.findViewById(AbstractC6918a0.sticker_item_element);
            this.f103840J = stickerView;
            if (stickerView != null) {
                stickerView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            ProgressBar progressBar = (ProgressBar) view.findViewById(AbstractC6918a0.progress_id);
            this.f103839I = progressBar;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k0 */
        public static final void m110434k0(C21326d c21326d, C25630b c25630b, View view) {
            AbstractC19074t.m100208f(c21326d, "this$0");
            AbstractC19074t.m100208f(c25630b, "$gifInfo");
            b m110422M = c21326d.m110422M();
            if (m110422M != null) {
                m110422M.mo110432a(c25630b);
            }
        }

        /* renamed from: l0 */
        private final void m110435l0(C25630b c25630b, RecyclingImageView recyclingImageView, ProgressBar progressBar) {
            if (!c25630b.m132448z()) {
                C28020b3.m141166H(C28020b3.f130648a, recyclingImageView, this.f103841K.f103836u, c25630b, progressBar, false, null, 24, null);
                return;
            }
            throw new RuntimeException("Not load sticker DEFAULT by AQuery");
        }

        @Override // jo0.C21326d.a
        /* renamed from: i0 */
        public void mo110431i0(C21786a.a aVar) {
            C3979l m125837F1;
            AbstractC19074t.m100208f(aVar, "stickerInfo");
            super.mo110431i0(aVar);
            StickerView stickerView = this.f103840J;
            if (stickerView != null) {
                final C21326d c21326d = this.f103841K;
                stickerView.m56980l();
                final C25630b m143290W = C28644j.m143233Y().m143290W(String.valueOf(aVar.m112439b()));
                AbstractC19074t.m100207e(m143290W, "getAnimationInfo(...)");
                if (aVar.m112438a() == 0) {
                    stickerView.setImageBitmap(C28020b3.f130648a.m141206w(m143290W));
                } else if (c21326d.m110424O() && !c21326d.m110423N()) {
                    ProgressBar progressBar = this.f103839I;
                    if (progressBar != null) {
                        m110435l0(m143290W, stickerView, progressBar);
                    }
                } else if (AbstractC24006q.m125853Z1(m143290W.m132446x()) && (m125837F1 = AbstractC24006q.m125837F1(m143290W.m132446x())) != null) {
                    stickerView.setImageBitmap(m125837F1.m18839c());
                }
                stickerView.setEmoticon(String.valueOf(aVar.m112439b()));
                stickerView.setOnClickListener(new View.OnClickListener() { // from class: jo0.e
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C21326d.c.m110434k0(C21326d.this, m143290W, view);
                    }
                });
            }
        }
    }

    public C21326d(Context context) {
        AbstractC19074t.m100208f(context, "mContext");
        this.f103833r = context;
        this.f103838w = new ArrayList();
        m110427R(new ArrayList());
        this.f103836u = new C23528a(context);
    }

    /* renamed from: M */
    public final b m110422M() {
        return this.f103837v;
    }

    /* renamed from: N */
    public final boolean m110423N() {
        return this.f103834s;
    }

    /* renamed from: O */
    public final boolean m110424O() {
        return this.f103835t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        AbstractC19074t.m100208f(aVar, "holder");
        Object obj = this.f103838w.get(i11);
        AbstractC19074t.m100207e(obj, "get(...)");
        aVar.mo110431i0((C21786a.a) obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        AbstractC19074t.m100208f(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f103833r).inflate(AbstractC7409c0.call_item_sticker, viewGroup, false);
        AbstractC19074t.m100205c(inflate);
        return new c(this, inflate);
    }

    /* renamed from: R */
    public final void m110427R(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "value");
        this.f103838w = new ArrayList(arrayList);
        m10008p();
    }

    /* renamed from: S */
    public final void m110428S(b bVar) {
        this.f103837v = bVar;
    }

    /* renamed from: T */
    public final void m110429T(boolean z11) {
        this.f103834s = z11;
    }

    /* renamed from: U */
    public final void m110430U(boolean z11) {
        this.f103835t = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f103838w.size();
    }
}

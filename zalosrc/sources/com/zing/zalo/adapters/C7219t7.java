package com.zing.zalo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import cg.AbstractC3460h;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.data.mediapicker.model.VideoItem;
import com.zing.zalo.media.pojo.VideoBlendingParam;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.AbstractC23280z4;
import me0.C23278z2;
import mm0.AbstractC23350e;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p559uv.C27373c;

/* renamed from: com.zing.zalo.adapters.t7 */
/* loaded from: classes3.dex */
public class C7219t7 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final C23528a f39586r;

    /* renamed from: s */
    private final b f39587s;

    /* renamed from: t */
    private final C24003n f39588t;

    /* renamed from: u */
    private final List f39589u = new ArrayList();

    /* renamed from: v */
    private boolean f39590v = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.t7$a */
    /* loaded from: classes3.dex */
    public class a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ c f39591l1;

        a(c cVar) {
            this.f39591l1 = cVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l != null) {
                try {
                    this.f39591l1.f39595K.setImageBitmap(c3979l.m18839c());
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.t7$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        boolean mo36731a(MediaItem mediaItem);

        /* renamed from: b */
        void mo36732b(MediaItem mediaItem);
    }

    /* renamed from: com.zing.zalo.adapters.t7$c */
    /* loaded from: classes3.dex */
    public static class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        final View f39593I;

        /* renamed from: J */
        final View f39594J;

        /* renamed from: K */
        final RoundedImageView f39595K;

        /* renamed from: L */
        final RobotoTextView f39596L;

        /* renamed from: M */
        final RobotoTextView f39597M;

        /* renamed from: N */
        public String f39598N;

        c(View view) {
            super(view);
            this.f39593I = view;
            this.f39594J = view.findViewById(AbstractC6918a0.slider_selected_view);
            this.f39595K = (RoundedImageView) view.findViewById(AbstractC6918a0.slider_image_view);
            this.f39596L = (RobotoTextView) view.findViewById(AbstractC6918a0.slider_duration);
            this.f39597M = (RobotoTextView) view.findViewById(AbstractC6918a0.slider_gif_label);
            this.f39598N = "";
        }
    }

    public C7219t7(C23528a c23528a, b bVar) {
        this.f39586r = c23528a;
        this.f39587s = bVar;
        C24003n c24003n = new C24003n();
        this.f39588t = c24003n;
        c24003n.f116275p = true;
        c24003n.f116276q = true;
        c24003n.f116260a = AbstractC23222t7.f112579p0;
        c24003n.f116266g = C23278z2.m120110a();
        c24003n.f116262c = -4;
        m9999J(true);
    }

    /* renamed from: N */
    private void m36723N(c cVar, MediaItem mediaItem) {
        String m120364z = AbstractC23280z4.m120364z(mediaItem);
        if (!Objects.equals(m120364z, cVar.f39598N)) {
            cVar.f39598N = m120364z;
            ((C23528a) this.f39586r.m123612r(cVar.f39595K)).m123579C(m120364z, this.f39588t, new a(cVar).m125762H1(-4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m36724O(MediaItem mediaItem, View view) {
        b bVar = this.f39587s;
        if (bVar != null) {
            bVar.mo36732b(mediaItem);
        }
    }

    /* renamed from: M */
    public void m36725M(MediaItem mediaItem) {
        Iterator it = this.f39589u.iterator();
        while (it.hasNext()) {
            if (((MediaItem) it.next()).mo41081Q().equals(mediaItem.mo41081Q())) {
                return;
            }
        }
        this.f39589u.add(mediaItem);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo9990A(c cVar, int i11) {
        int i12;
        VideoBlendingParam videoBlendingParam;
        int i13;
        final MediaItem mediaItem = (MediaItem) this.f39589u.get(i11);
        ViewGroup.LayoutParams layoutParams = cVar.f39593I.getLayoutParams();
        int m41144g0 = mediaItem.m41144g0();
        int m41137b0 = mediaItem.m41137b0();
        if (m41144g0 != 0 && m41137b0 != 0) {
            int i14 = (AbstractC23222t7.f112551b0 * m41144g0) / m41137b0;
            layoutParams.width = i14;
            int i15 = AbstractC23222t7.f112539R;
            if (i14 < i15) {
                layoutParams.width = i15;
            } else {
                int i16 = AbstractC23222t7.f112579p0;
                if (i14 > i16) {
                    layoutParams.width = i16;
                }
            }
        } else {
            layoutParams.width = AbstractC23222t7.f112551b0;
        }
        cVar.f39593I.setLayoutParams(layoutParams);
        this.f39588t.f116260a = layoutParams.width;
        AbstractC23136l9.m118744r1(cVar.f39595K, 0);
        m36723N(cVar, mediaItem);
        if (mediaItem instanceof VideoItem) {
            VideoItem videoItem = (VideoItem) mediaItem;
            AbstractC23136l9.m118744r1(cVar.f39596L, 0);
            long m41213t1 = videoItem.m41213t1();
            if (videoItem.m41205A1() && videoItem.m41217x1() != null && (videoBlendingParam = ((C27373c) videoItem.m41217x1()).f128947T) != null && (i13 = videoBlendingParam.f48265Q) > 0) {
                m41213t1 = i13;
            }
            cVar.f39596L.setText(AbstractC3460h.m17440h(m41213t1));
        } else {
            AbstractC23136l9.m118744r1(cVar.f39596L, 8);
        }
        RobotoTextView robotoTextView = cVar.f39597M;
        if (mediaItem.m41163p0()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        AbstractC23136l9.m118744r1(robotoTextView, i12);
        b bVar = this.f39587s;
        if (bVar != null && bVar.mo36731a(mediaItem)) {
            AbstractC23136l9.m118744r1(cVar.f39594J, 0);
        } else {
            AbstractC23136l9.m118744r1(cVar.f39594J, 8);
        }
        cVar.f39593I.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.s7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C7219t7.this.m36724O(mediaItem, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public c mo9992C(ViewGroup viewGroup, int i11) {
        return new c(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.slider_preview_photo_item, viewGroup, false));
    }

    /* renamed from: R */
    public void m36728R(MediaItem mediaItem) {
        Iterator it = this.f39589u.iterator();
        while (it.hasNext()) {
            if (((MediaItem) it.next()).mo41081Q().equals(mediaItem.mo41081Q())) {
                it.remove();
            }
        }
    }

    /* renamed from: S */
    public void m36729S(List list) {
        this.f39589u.clear();
        this.f39589u.addAll(new ArrayList(list));
    }

    /* renamed from: T */
    public void m36730T(boolean z11) {
        this.f39590v = z11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39589u.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        if (i11 < this.f39589u.size()) {
            if (((MediaItem) this.f39589u.get(i11)).mo41090x() > 0) {
                return ((MediaItem) this.f39589u.get(i11)).mo41090x();
            }
            return ((MediaItem) this.f39589u.get(i11)).mo41081Q().hashCode();
        }
        return super.mo10004l(i11);
    }
}

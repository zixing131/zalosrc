package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import b40.C2526d;
import c30.C3251l;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.uicontrol.ZSimpleGIFView;
import com.zing.zalo.zview.AbstractC17466e;
import gi.EnumC19449b;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23999j;
import p471r3.C25630b;
import p485rj.C25809a;
import p588vw.C28644j;
import vg.C28020b3;

/* renamed from: com.zing.zalo.adapters.o6 */
/* loaded from: classes3.dex */
public class C7163o6 extends RecyclerView.AbstractC1880g {

    /* renamed from: x */
    private static final int f39227x = AbstractC23136l9.m118742r(80.0f);

    /* renamed from: y */
    private static final int f39228y = AbstractC23136l9.m118742r(80.0f);

    /* renamed from: z */
    private static final int f39229z = AbstractC23136l9.m118742r(106.5f);

    /* renamed from: r */
    private final Context f39230r;

    /* renamed from: s */
    private List f39231s;

    /* renamed from: t */
    private final C23528a f39232t;

    /* renamed from: u */
    private boolean f39233u = false;

    /* renamed from: v */
    private int f39234v = 0;

    /* renamed from: w */
    private final b f39235w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.o6$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {
        a(View view) {
            super(view);
        }
    }

    /* renamed from: com.zing.zalo.adapters.o6$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo36451a(int i11);

        /* renamed from: b */
        void mo36452b(View view);

        /* renamed from: c */
        void mo36453c(C3251l c3251l);
    }

    public C7163o6(Context context, b bVar) {
        this.f39230r = context;
        this.f39232t = new C23528a(context);
        this.f39235w = bVar;
    }

    /* renamed from: N */
    private C3251l m36442N(int i11) {
        if (i11 < 0) {
            return null;
        }
        try {
            if (i11 >= this.f39231s.size()) {
                return null;
            }
            return (C3251l) this.f39231s.get(i11);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m36443Q(int i11, View view) {
        b bVar = this.f39235w;
        if (bVar != null) {
            bVar.mo36451a(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ boolean m36444R(int i11, View view) {
        b bVar = this.f39235w;
        if (bVar != null) {
            bVar.mo36453c(m36442N(i11));
            return true;
        }
        return false;
    }

    /* renamed from: O */
    public int m36445O() {
        return this.f39234v;
    }

    /* renamed from: P */
    public C3251l m36446P() {
        return m36442N(this.f39234v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, final int i11) {
        boolean z11;
        int i12;
        String m133083e;
        View view = aVar.f7784p;
        view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.m6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C7163o6.this.m36443Q(i11, view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.adapters.n6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                boolean m36444R;
                m36444R = C7163o6.this.m36444R(i11, view2);
                return m36444R;
            }
        });
        view.setTag(Integer.valueOf(i11));
        StickerView stickerView = (StickerView) view.findViewById(AbstractC6918a0.sticker);
        ZSimpleGIFView zSimpleGIFView = (ZSimpleGIFView) view.findViewById(AbstractC6918a0.gif);
        StickerView stickerView2 = (StickerView) view.findViewById(AbstractC6918a0.thumb);
        ProgressBar progressBar = (ProgressBar) view.findViewById(AbstractC6918a0.progress);
        stickerView.setVisibility(8);
        zSimpleGIFView.setVisibility(8);
        stickerView2.setVisibility(8);
        progressBar.setVisibility(8);
        if (this.f39234v == i11) {
            z11 = true;
        } else {
            z11 = false;
        }
        C3251l c3251l = (C3251l) this.f39231s.get(i11);
        if (z11) {
            i12 = AbstractC16803z.bg_select_item_say_hi_box;
        } else {
            i12 = AbstractC17466e.transparent;
        }
        AbstractC23136l9.m118693a1(view, i12);
        int m9931C = aVar.m9931C();
        if (m9931C != 1) {
            if (m9931C != 2) {
                if (m9931C == 3) {
                    stickerView2.setVisibility(0);
                    String m16515e = c3251l.m16515e();
                    if (!this.f39233u || C23999j.m125696L2(m16515e, C23278z2.m120123e0())) {
                        ((C23528a) this.f39232t.m123612r(stickerView2)).m123619y(m16515e, C23278z2.m120123e0(), 10);
                        return;
                    }
                    return;
                }
                return;
            }
            C25809a m16511a = c3251l.m16511a();
            if (m16511a != null) {
                zSimpleGIFView.setVisibility(0);
                if (TextUtils.isEmpty(m16511a.m133083e())) {
                    m133083e = m16511a.m133079a();
                } else {
                    m133083e = m16511a.m133083e();
                }
                zSimpleGIFView.m88227l(new ZSimpleGIFView.C16554f(m133083e, m16511a.m133084f(), m16511a.m133085g(), m16511a.m133080b(), "SayHiBoxStickerAdapter"), i11, null);
                zSimpleGIFView.m88224g(100L);
                return;
            }
            return;
        }
        view.setPadding(0, 0, 0, 0);
        view.getLayoutParams().height = f39228y;
        view.getLayoutParams().width = f39227x;
        stickerView.setVisibility(0);
        int i13 = AbstractC23222t7.f112566j;
        stickerView.m56981m(i13, i13, i13, i13);
        C25630b m143282P0 = C28644j.m143233Y().m143282P0(c3251l.m16514d());
        c3251l.m16522l(m143282P0);
        if (m143282P0.m132448z()) {
            stickerView.m56979j(m143282P0, System.currentTimeMillis() + "", true, false, false, true);
        } else {
            C28020b3.f130648a.m141183G(m143282P0, this.f39232t, stickerView, progressBar, true);
        }
        if (i11 == 0) {
            boolean m132391I = C25630b.m132391I(m143282P0);
            b bVar = this.f39235w;
            if (bVar != null && m132391I) {
                bVar.mo36452b(view);
            }
            C2526d.f10270a.m12724p0("quick_action", EnumC19449b.f96544s.m101746d(), m132391I);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        int i12;
        View inflate = LayoutInflater.from(this.f39230r).inflate(AbstractC7409c0.say_hi_box_sticker_item, (ViewGroup) null);
        if (i11 == 2) {
            i12 = f39229z;
        } else {
            i12 = f39227x;
        }
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(i12, -1);
        int m118742r = AbstractC23136l9.m118742r(3.0f);
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = m118742r;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = m118742r;
        inflate.setLayoutParams(layoutParams);
        return new a(inflate);
    }

    /* renamed from: U */
    public void m36449U(List list) {
        this.f39231s = list;
        m10008p();
    }

    /* renamed from: V */
    public void m36450V(int i11) {
        this.f39234v = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f39231s;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        try {
            C3251l c3251l = (C3251l) this.f39231s.get(i11);
            if (c3251l.m16517g()) {
                return 2;
            }
            if (!c3251l.m16518h()) {
                return 1;
            }
            return 3;
        } catch (Exception e11) {
            e11.printStackTrace();
            return 1;
        }
    }
}

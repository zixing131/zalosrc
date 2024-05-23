package com.zing.zalo.adapters;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.uicontrol.OAVideoItemView;
import com.zing.zalocore.CoreUtility;
import hf0.C20040b;
import java.util.ArrayList;
import java.util.List;
import p448qh.AbstractC25280e;
import p448qh.C25286k;
import p716zh.C32106s7;

/* renamed from: com.zing.zalo.adapters.y4 */
/* loaded from: classes3.dex */
public class C7271y4 extends RecyclerView.AbstractC1880g {

    /* renamed from: s */
    OAVideoItemView.InterfaceC16474c f39879s;

    /* renamed from: t */
    Rect f39880t;

    /* renamed from: v */
    C20040b f39882v;

    /* renamed from: w */
    AbstractC25280e f39883w;

    /* renamed from: r */
    ArrayList f39878r = new ArrayList();

    /* renamed from: u */
    boolean f39881u = false;

    /* renamed from: com.zing.zalo.adapters.y4$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public OAVideoItemView f39884I;

        /* renamed from: J */
        public ProgressBar f39885J;

        public a(View view, int i11) {
            super(view);
            if (i11 != 0) {
                if (i11 == 1) {
                    this.f39885J = (ProgressBar) view;
                }
            } else if (view instanceof OAVideoItemView) {
                OAVideoItemView oAVideoItemView = (OAVideoItemView) view;
                this.f39884I = oAVideoItemView;
                oAVideoItemView.m87779b();
            }
        }
    }

    public C7271y4() {
        C20040b c20040b = new C20040b(this, 5, true);
        this.f39882v = c20040b;
        c20040b.m104018i0(0.8f);
        this.f39882v.m104014d0(true);
        C25286k c25286k = new C25286k(CoreUtility.f89233i, this);
        this.f39883w = c25286k;
        this.f39882v.m104017g0(c25286k);
    }

    /* renamed from: L */
    public C20040b m37024L() {
        return this.f39882v;
    }

    /* renamed from: M */
    public int m37025M() {
        return this.f39878r.size();
    }

    /* renamed from: N */
    public List m37026N() {
        return this.f39878r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public void mo9990A(a aVar, int i11) {
        try {
            if (mo10005m(i11) == 0) {
                C32106s7 c32106s7 = (C32106s7) this.f39878r.get(i11);
                OAVideoItemView oAVideoItemView = aVar.f39884I;
                if (oAVideoItemView != null) {
                    oAVideoItemView.setParentRect(this.f39880t);
                    aVar.f39884I.setOAOaVideoInteractionListener(this.f39879s);
                    boolean z11 = false;
                    aVar.f39884I.m87778a(c32106s7, i11, false);
                    OAVideoItemView oAVideoItemView2 = aVar.f39884I;
                    if (i11 == mo10003k() - 1) {
                        z11 = true;
                    }
                    oAVideoItemView2.setIsLastItemInList(z11);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        View inflate;
        if (this.f39880t == null && viewGroup.getWidth() > 0 && viewGroup.getHeight() > 0) {
            this.f39880t = new Rect(0, 0, viewGroup.getWidth(), viewGroup.getHeight());
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i11 != 0) {
            if (i11 != 1) {
                inflate = null;
            } else {
                inflate = from.inflate(AbstractC7409c0.oa_video_playlist_loading_item, viewGroup, false);
            }
        } else {
            inflate = from.inflate(AbstractC7409c0.oa_video_playlist_video_item, viewGroup, false);
        }
        return new a(inflate, i11);
    }

    /* renamed from: Q */
    public void m37029Q() {
        if (m37024L() != null) {
            m37024L().m104003N();
        }
    }

    /* renamed from: R */
    public void m37030R() {
        if (m37024L() != null) {
            m37024L().m104005P();
        }
    }

    /* renamed from: S */
    public void m37031S() {
        if (m37024L() != null) {
            m37024L().m104006Q();
        }
    }

    /* renamed from: T */
    public void m37032T(RecyclerView recyclerView, int i11, int i12, C20040b.b bVar) {
        try {
            if (m37024L() != null) {
                m37024L().m104007R(CoreUtility.f89233i, recyclerView, i11, i12, bVar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: U */
    public void m37033U(RecyclerView recyclerView, int i11) {
        try {
            if (m37024L() != null) {
                m37024L().m104008S(recyclerView, i11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: V */
    public void m37034V() {
        if (m37024L() != null) {
            m37024L().m104009T();
        }
    }

    /* renamed from: W */
    public void m37035W(boolean z11) {
        this.f39881u = z11;
    }

    /* renamed from: X */
    public void m37036X(OAVideoItemView.InterfaceC16474c interfaceC16474c) {
        this.f39879s = interfaceC16474c;
    }

    /* renamed from: Y */
    public void m37037Y(List list) {
        this.f39878r.clear();
        if (list != null) {
            this.f39878r.addAll(list);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f39878r.size() + (this.f39881u ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        if (i11 < this.f39878r.size()) {
            return 0;
        }
        return 1;
    }
}

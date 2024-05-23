package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.zing.zalo.feed.uicontrols.C8880k;
import com.zing.zalo.uidrawing.ModulesView;
import i40.InterfaceC20272b;
import is.AbstractC20826v0;

/* loaded from: classes4.dex */
public class FeedGridModulesView extends ModulesView implements InterfaceC20272b {

    /* renamed from: K */
    C8880k f47318K;

    /* renamed from: L */
    InterfaceC8857a f47319L;

    /* renamed from: com.zing.zalo.feed.uicontrols.FeedGridModulesView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8857a {
        /* renamed from: D0 */
        void mo47301D0(int i11, int i12);

        /* renamed from: V3 */
        int mo47302V3();

        /* renamed from: Y1 */
        int mo47303Y1();
    }

    public FeedGridModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m47299a0(context);
    }

    /* renamed from: V */
    public void m47295V(C8884o c8884o, int i11, boolean z11, boolean z12) {
        C8880k c8880k = this.f47318K;
        if (c8880k != null) {
            c8880k.m47373t1(c8884o, i11, z11, z12, 0);
        }
    }

    /* renamed from: W */
    public void m47296W(C8884o c8884o, int i11, boolean z11, boolean z12, int i12) {
        this.f47318K.m47373t1(c8884o, i11, z11, z12, i12);
    }

    /* renamed from: X */
    public void m47297X(C8884o c8884o, boolean z11, int i11) {
        m47298Y(c8884o, z11, i11, null);
    }

    /* renamed from: Y */
    public void m47298Y(C8884o c8884o, boolean z11, int i11, AbstractC20826v0.j jVar) {
        C8880k c8880k = this.f47318K;
        if (c8880k != null) {
            c8880k.m47375v1(c8884o, z11, i11, jVar);
        }
    }

    /* renamed from: a0 */
    void m47299a0(Context context) {
        C8880k c8880k = new C8880k(context);
        this.f47318K = c8880k;
        c8880k.m89106L().m89060k0(-1).m89030N(-2).m89026J(true);
        C8880k c8880k2 = this.f47318K;
        c8880k2.f47459a1 = this;
        mo69681L(c8880k2);
        setTag(String.format("image#%s", 0));
    }

    /* renamed from: b0 */
    public void m47300b0(int i11) {
        int i12;
        int i13;
        int i14;
        Rect mo43986q = this.f47318K.mo43986q(i11);
        if (mo43986q != null) {
            InterfaceC8857a interfaceC8857a = this.f47319L;
            if (interfaceC8857a != null) {
                i12 = interfaceC8857a.mo47303Y1();
            } else {
                i12 = 0;
            }
            InterfaceC8857a interfaceC8857a2 = this.f47319L;
            if (interfaceC8857a2 != null) {
                i13 = interfaceC8857a2.mo47302V3();
            } else {
                i13 = 0;
            }
            int i15 = mo43986q.top;
            if (i15 < i12) {
                i14 = -(i12 - i15);
            } else {
                int i16 = mo43986q.bottom;
                if (i16 > i13) {
                    i14 = i16 - i13;
                } else {
                    i14 = 0;
                }
            }
            InterfaceC8857a interfaceC8857a3 = this.f47319L;
            if (interfaceC8857a3 != null) {
                interfaceC8857a3.mo47301D0(0, i14);
            }
        }
    }

    @Override // i40.InterfaceC20272b
    /* renamed from: q */
    public Rect mo43986q(int i11) {
        C8880k c8880k = this.f47318K;
        if (c8880k != null) {
            return c8880k.mo43986q(i11);
        }
        return null;
    }

    public void setItemClickListener(C8880k.f fVar) {
        C8880k c8880k = this.f47318K;
        if (c8880k != null) {
            c8880k.m47366D1(fVar);
        }
    }

    @Override // android.view.ViewGroup
    public void setLayoutMode(int i11) {
        C8880k c8880k = this.f47318K;
        if (c8880k != null) {
            c8880k.m47367E1(i11);
        }
    }

    public void setScrollDelegate(InterfaceC8857a interfaceC8857a) {
        this.f47319L = interfaceC8857a;
    }

    public void setSourceActionLog(int i11) {
        C8880k c8880k = this.f47318K;
        if (c8880k != null) {
            c8880k.m47369G1(i11);
        }
    }

    public void setUseFileCache(boolean z11) {
        C8880k c8880k = this.f47318K;
        if (c8880k != null) {
            c8880k.m47370H1(z11);
        }
    }

    public void setWidth(int i11) {
        C8880k c8880k = this.f47318K;
        if (c8880k != null) {
            c8880k.m47371I1(i11);
        }
    }
}

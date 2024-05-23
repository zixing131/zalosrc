package com.zing.zalo.p077ui.widget;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.C13648i1;
import java.util.ArrayList;
import java.util.List;
import me0.C23278z2;
import p354n3.C23528a;
import p716zh.C31862c;

/* renamed from: com.zing.zalo.ui.widget.i1 */
/* loaded from: classes6.dex */
public class C13648i1 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f70408r = new ArrayList();

    /* renamed from: s */
    C23528a f70409s;

    /* renamed from: t */
    b f70410t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.i1$a */
    /* loaded from: classes6.dex */
    public class a extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        View f70411I;

        /* renamed from: J */
        RecyclingImageView f70412J;

        /* renamed from: K */
        RobotoTextView f70413K;

        /* renamed from: L */
        GradientDrawable f70414L;

        /* renamed from: M */
        C31862c.a f70415M;

        /* renamed from: N */
        b f70416N;

        a(View view, b bVar) {
            super(view);
            this.f70411I = view.findViewById(AbstractC6918a0.container);
            this.f70412J = (RecyclingImageView) view.findViewById(AbstractC6918a0.iv_icon);
            this.f70413K = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_title);
            this.f70414L = (GradientDrawable) this.f70411I.getBackground();
            this.f70416N = bVar;
            view.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.g1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C13648i1.a.this.m76272l0(view2);
                }
            });
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.zing.zalo.ui.widget.h1
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    boolean m76273m0;
                    m76273m0 = C13648i1.a.m76273m0(view2);
                    return m76273m0;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public /* synthetic */ void m76272l0(View view) {
            b bVar;
            C31862c.a aVar = this.f70415M;
            if (aVar != null && (bVar = this.f70416N) != null) {
                bVar.mo76218a(this, aVar);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: m0 */
        public static /* synthetic */ boolean m76273m0(View view) {
            ViewParent viewParent = (ViewParent) view;
            while (viewParent != 0 && !(viewParent instanceof InterfaceC13567b1)) {
                viewParent = viewParent.getParent();
            }
            if (viewParent != 0) {
                return ((View) viewParent).performLongClick();
            }
            return false;
        }

        /* renamed from: k0 */
        public void m76274k0(C31862c.a aVar) {
            this.f70415M = aVar;
            if (aVar != null) {
                ((C23528a) C13648i1.this.f70409s.m123612r(this.f70412J)).m123618x(aVar.f146335b, C23278z2.m120146o0());
                this.f70413K.setText(aVar.f146334a);
                this.f70414L.setColor(aVar.f146336c);
            } else {
                this.f70412J.setImageBitmap(null);
                this.f70413K.setText((CharSequence) null);
                this.f70414L.setColor(0);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.i1$b */
    /* loaded from: classes6.dex */
    public interface b {
        /* renamed from: a */
        void mo76218a(a aVar, C31862c.a aVar2);
    }

    public C13648i1(C23528a c23528a, b bVar) {
        this.f70409s = c23528a;
        this.f70410t = bVar;
    }

    /* renamed from: L */
    private C31862c.a m76268L(int i11) {
        List list = this.f70408r;
        if (list != null && i11 < list.size()) {
            return (C31862c.a) this.f70408r.get(i11);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        try {
            if (abstractC1876c0 instanceof a) {
                ((a) abstractC1876c0).m76274k0(m76268L(i11));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 != 0) {
            return null;
        }
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.pinned_buttons_bar_item_view, viewGroup, false), this.f70410t);
    }

    /* renamed from: M */
    public void m76269M(List list) {
        this.f70408r = list;
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f70408r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        return 0;
    }
}

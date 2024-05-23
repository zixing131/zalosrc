package nk0;

import android.graphics.Canvas;
import android.view.MotionEvent;
import androidx.core.util.InterfaceC1479a;
import com.zing.zalo.zinstant.utils.C17204p;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zinstant.zom.node.ZOMContainer;
import com.zing.zalo.zinstant.zom.properties.ZOMLoading;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import qk0.AbstractC25310f;
import qk0.InterfaceC25307c;
import tj0.AbstractC26719d;
import tj0.C26721f;

/* renamed from: nk0.u */
/* loaded from: classes7.dex */
public class C23858u extends AbstractC23825g0 implements InterfaceC25307c {

    /* renamed from: H */
    private LinkedHashMap f115203H;

    /* renamed from: I */
    private final LinkedList f115204I;

    /* renamed from: J */
    private final LinkedList f115205J;

    /* renamed from: K */
    private final ArrayList f115206K;

    /* renamed from: L */
    private AbstractC26719d f115207L;

    public C23858u(C23855s0 c23855s0, ZOMContainer zOMContainer) {
        super(c23855s0, zOMContainer);
        this.f115203H = new LinkedHashMap();
        this.f115204I = new LinkedList();
        this.f115205J = new LinkedList();
        this.f115206K = new ArrayList();
        m124663o2();
        m124660k2();
    }

    /* renamed from: k2 */
    private void m124660k2() {
        if (((ZOMContainer) m131007J()).mLoading == null) {
            this.f115207L = null;
            return;
        }
        ZOMLoading zOMLoading = ((ZOMContainer) m131007J()).mLoading;
        AbstractC26719d m137443a = C26721f.m137443a(zOMLoading.mVariant);
        this.f115207L = m137443a;
        m137443a.m137424W(zOMLoading);
        this.f115207L.setAlpha(m131021p());
        this.f115207L.setCallback(m131031z());
        m124498M1(this.f115207L);
    }

    /* renamed from: l2 */
    private AbstractC25310f m124661l2(ZOM zom) {
        if (zom == null) {
            return null;
        }
        AbstractC25310f m91834a = C17204p.m91834a(m131000E(), zom);
        if (m91834a != null) {
            m91834a.m131009L0(m130996B());
            m91834a.m131010M0(m131026t().getTransformDrawing());
        }
        return m91834a;
    }

    /* renamed from: m2 */
    private void m124662m2(InterfaceC1479a interfaceC1479a) {
        Iterator it = this.f115206K.iterator();
        while (it.hasNext()) {
            interfaceC1479a.accept((AbstractC25310f) it.next());
        }
    }

    /* renamed from: o2 */
    private void m124663o2() {
        m124667s2();
        this.f115206K.addAll(this.f115203H.values());
        this.f115205J.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q2 */
    public /* synthetic */ void m124665q2(AbstractC25310f abstractC25310f) {
        abstractC25310f.m131009L0(m130996B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r2 */
    public /* synthetic */ void m124666r2(AbstractC25310f abstractC25310f) {
        abstractC25310f.m131010M0(m131026t().getTransformDrawing());
    }

    /* renamed from: s2 */
    private void m124667s2() {
        ZOM[] zomArr = ((ZOMContainer) m131007J()).mChildren;
        if (zomArr == null) {
            this.f115203H.clear();
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ZOM zom : zomArr) {
            AbstractC25310f abstractC25310f = (AbstractC25310f) this.f115203H.remove(zom);
            if (abstractC25310f == null && (abstractC25310f = m124661l2(zom)) != null) {
                this.f115205J.add(abstractC25310f);
            }
            if (abstractC25310f != null) {
                linkedHashMap.put(zom, abstractC25310f);
            }
        }
        this.f115204I.addAll(this.f115203H.values());
        this.f115203H = linkedHashMap;
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: S0 */
    public void mo124501S0() {
        super.mo124501S0();
        m124662m2(new InterfaceC1479a() { // from class: nk0.q
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ((AbstractC25310f) obj).mo124501S0();
            }
        });
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: i0 */
    public void mo124509i0() {
        super.mo124509i0();
        m124662m2(new InterfaceC1479a() { // from class: nk0.n
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ((AbstractC25310f) obj).m131019n();
            }
        });
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: j0 */
    public void mo124435j0(final Canvas canvas) {
        super.mo124435j0(canvas);
        m124662m2(new InterfaceC1479a() { // from class: nk0.s
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ((AbstractC25310f) obj).m131020o(canvas);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: l0 */
    public void mo124511l0(Canvas canvas) {
        super.mo124511l0(canvas);
        canvas.save();
        canvas.translate(m131023r().left, m131023r().top);
        AbstractC26719d abstractC26719d = this.f115207L;
        if (abstractC26719d != null) {
            abstractC26719d.draw(canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: m0 */
    public void mo124512m0() {
        super.mo124512m0();
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: n0 */
    public void mo124436n0() {
        super.mo124436n0();
        AbstractC26719d abstractC26719d = this.f115207L;
        if (abstractC26719d != null) {
            abstractC26719d.setAlpha(m131021p());
        }
        m124662m2(new InterfaceC1479a() { // from class: nk0.o
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                C23858u.this.m124665q2((AbstractC25310f) obj);
            }
        });
    }

    /* renamed from: n2 */
    public List m124668n2() {
        return this.f115206K;
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f, nk0.InterfaceC23806a
    public void onPause() {
        super.onPause();
        m124662m2(new InterfaceC1479a() { // from class: nk0.m
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ((AbstractC25310f) obj).onPause();
            }
        });
        AbstractC26719d abstractC26719d = this.f115207L;
        if (abstractC26719d != null) {
            abstractC26719d.m137420J();
        }
    }

    @Override // qk0.AbstractC25310f, nk0.InterfaceC23806a
    public void onResume() {
        super.onResume();
        m124662m2(new InterfaceC1479a() { // from class: nk0.p
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ((AbstractC25310f) obj).onResume();
            }
        });
        AbstractC26719d abstractC26719d = this.f115207L;
        if (abstractC26719d != null) {
            abstractC26719d.m137421K();
        }
    }

    @Override // qk0.AbstractC25310f, nk0.InterfaceC23806a
    public void onStart() {
        super.onStart();
        m124662m2(new InterfaceC1479a() { // from class: nk0.k
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ((AbstractC25310f) obj).onStart();
            }
        });
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f, nk0.InterfaceC23806a
    public void onStop() {
        super.onStop();
        m124662m2(new InterfaceC1479a() { // from class: nk0.l
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ((AbstractC25310f) obj).onStop();
            }
        });
    }

    @Override // nk0.AbstractC23825g0
    /* renamed from: p1 */
    public boolean mo124513p1(MotionEvent motionEvent, int i11) {
        if (!m131015Y()) {
            return false;
        }
        for (int size = this.f115206K.size() - 1; size > -1; size--) {
            AbstractC25310f abstractC25310f = (AbstractC25310f) this.f115206K.get(size);
            if (abstractC25310f != null && abstractC25310f.m131003G() == AbstractC25310f.a.ZinstantNode && ((AbstractC23825g0) abstractC25310f).mo124513p1(motionEvent, i11)) {
                return true;
            }
        }
        return super.mo124513p1(motionEvent, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qk0.AbstractC25310f
    /* renamed from: q0 */
    public void mo124669q0() {
        super.mo124669q0();
        AbstractC26719d abstractC26719d = this.f115207L;
        if (abstractC26719d != null) {
            abstractC26719d.m137421K();
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: r0 */
    public void mo124439r0(int i11) {
        super.mo124439r0(i11);
        if ((i11 & 16) != 0) {
            m124667s2();
        }
    }

    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: t0 */
    public void mo124514t0() {
        super.mo124514t0();
        m124662m2(new InterfaceC1479a() { // from class: nk0.t
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                ((AbstractC25310f) obj).m131001E0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: u */
    public int mo124516u() {
        if (super.mo124516u() >= 2) {
            return 2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: u0 */
    public void mo124517u0() {
        super.mo124517u0();
        ZOMLoading zOMLoading = ((ZOMContainer) m131007J()).mLoading;
        if (zOMLoading != null) {
            int m131021p = m131021p();
            AbstractC26719d abstractC26719d = this.f115207L;
            if (abstractC26719d == null || abstractC26719d.m137416D() != zOMLoading.mVariant) {
                m124660k2();
            }
            AbstractC26719d abstractC26719d2 = this.f115207L;
            if (abstractC26719d2 != null) {
                abstractC26719d2.m137424W(zOMLoading);
                this.f115207L.setAlpha(m131021p);
                m124497E1(this.f115207L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // nk0.AbstractC23825g0, qk0.AbstractC25310f
    /* renamed from: v0 */
    public void mo124443v0() {
        super.mo124443v0();
        AbstractC26719d abstractC26719d = this.f115207L;
        if (abstractC26719d != null) {
            m124498M1(abstractC26719d);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qk0.AbstractC25310f
    /* renamed from: w0 */
    public void mo124670w0() {
        super.mo124670w0();
        AbstractC26719d abstractC26719d = this.f115207L;
        if (abstractC26719d != null) {
            abstractC26719d.m137420J();
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: x0 */
    public void mo124444x0(ZOM zom, int i11) {
        super.mo124444x0(zom, i11);
        if ((i11 & 16) != 0) {
            this.f115206K.clear();
            this.f115206K.addAll(this.f115203H.values());
            while (!this.f115205J.isEmpty()) {
                AbstractC25310f abstractC25310f = (AbstractC25310f) this.f115205J.pop();
                abstractC25310f.m131009L0(m130996B());
                abstractC25310f.m131010M0(m131026t().getTransformDrawing());
                abstractC25310f.m131012Q0();
            }
            while (!this.f115204I.isEmpty()) {
                ((AbstractC25310f) this.f115204I.pop()).m131001E0();
            }
        }
    }

    @Override // qk0.AbstractC25310f
    /* renamed from: y0 */
    public void mo124595y0() {
        super.mo124595y0();
        m124662m2(new InterfaceC1479a() { // from class: nk0.r
            @Override // androidx.core.util.InterfaceC1479a
            public final void accept(Object obj) {
                C23858u.this.m124666r2((AbstractC25310f) obj);
            }
        });
    }
}

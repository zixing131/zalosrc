package p448qh;

import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import au.C2370r0;
import bo.C2966e1;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.feed.adapters.FeedBaseAdapter;
import com.zing.zalo.zmedia.player.ZMediaHandlerThread;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import p448qh.AbstractC25280e;
import p489rn.AbstractC25881j;
import p716zh.C32106s7;

/* renamed from: qh.i */
/* loaded from: classes3.dex */
public class C25284i extends AbstractC25280e {

    /* renamed from: k */
    C2370r0 f121265k;

    /* renamed from: l */
    C2370r0 f121266l;

    public C25284i(String str, FeedBaseAdapter feedBaseAdapter) {
        super(1, str);
        m130839q(3);
        this.f121266l = new C2370r0(feedBaseAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m130845B(AbstractC25280e.c cVar) {
        List m43215R;
        C3000l0 c3000l0;
        C3000l0 c3000l02;
        try {
            ArrayList arrayList = new ArrayList();
            SparseIntArray sparseIntArray = new SparseIntArray();
            int i11 = 0;
            if (m130848z() != null) {
                List m133531Q = m130848z().m133531Q();
                if (m133531Q != null && !m133531Q.isEmpty()) {
                    while (i11 < m133531Q.size()) {
                        C2966e1 c2966e1 = (C2966e1) m133531Q.get(i11);
                        if (c2966e1 != null && (c3000l02 = c2966e1.f11703a) != null) {
                            int i12 = c2966e1.f11705c;
                            if (i12 != 38) {
                                if (i12 != 49) {
                                    if (i12 == 62) {
                                        m130852x(arrayList, sparseIntArray, c3000l02, i11);
                                    }
                                } else {
                                    m130851w(arrayList, sparseIntArray, c3000l02, i11);
                                }
                            } else {
                                m130850v(arrayList, sparseIntArray, c3000l02, i11);
                            }
                        }
                        i11++;
                    }
                }
            } else if (m130847y() != null && (m43215R = m130847y().m43215R()) != null && !m43215R.isEmpty()) {
                while (i11 < m43215R.size()) {
                    C2966e1 c2966e12 = (C2966e1) m43215R.get(i11);
                    if (c2966e12 != null && (c3000l0 = c2966e12.f11703a) != null) {
                        int i13 = c2966e12.f11705c;
                        if (i13 != 38) {
                            if (i13 == 49) {
                                m130851w(arrayList, sparseIntArray, c3000l0, i11);
                            }
                        } else {
                            m130850v(arrayList, sparseIntArray, c3000l0, i11);
                        }
                    }
                    i11++;
                }
            }
            cVar.mo130822a(arrayList, sparseIntArray);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: y */
    private FeedBaseAdapter m130847y() {
        C2370r0 c2370r0 = this.f121266l;
        if (c2370r0 != null) {
            return (FeedBaseAdapter) c2370r0.m12394a();
        }
        return null;
    }

    /* renamed from: z */
    private AbstractC25881j m130848z() {
        C2370r0 c2370r0 = this.f121265k;
        if (c2370r0 != null) {
            return (AbstractC25881j) c2370r0.m12394a();
        }
        return null;
    }

    /* renamed from: A */
    List m130849A() {
        AbstractC25881j m130848z = m130848z();
        if (m130848z != null) {
            return m130848z.m133531Q();
        }
        FeedBaseAdapter m130847y = m130847y();
        if (m130847y != null) {
            return m130847y.m43215R();
        }
        return null;
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: d */
    protected void mo130831d(final AbstractC25280e.c cVar) {
        ZMediaHandlerThread.getInstance().execute(new Runnable() { // from class: qh.h
            @Override // java.lang.Runnable
            public final void run() {
                C25284i.this.m130845B(cVar);
            }
        });
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: f */
    public int mo130832f() {
        List m130849A = m130849A();
        if (m130849A != null) {
            return m130849A.size();
        }
        return 0;
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: g */
    public RecyclerView.AbstractC1880g mo130833g() {
        C2370r0 c2370r0 = this.f121265k;
        if (c2370r0 != null) {
            return (RecyclerView.AbstractC1880g) c2370r0.m12394a();
        }
        return null;
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: p */
    public void mo130838p() {
        super.mo130838p();
        C2370r0 c2370r0 = this.f121266l;
        if (c2370r0 != null) {
            c2370r0.m12395b(null);
        }
        C2370r0 c2370r02 = this.f121265k;
        if (c2370r02 != null) {
            c2370r02.m12395b(null);
        }
    }

    /* renamed from: v */
    void m130850v(List list, SparseIntArray sparseIntArray, C3000l0 c3000l0, int i11) {
        C3025q0 c3025q0;
        C3025q0.c cVar;
        C3020p0 m14322a0 = c3000l0.m14322a0();
        if (m14322a0 != null && (c3025q0 = m14322a0.f12023C) != null && (cVar = c3025q0.f12135z) != null && cVar.f12165p == 3) {
            String str = cVar.f12163n;
            String str2 = m14322a0.f12057p;
            if (!TextUtils.isEmpty(str)) {
                list.add(new ZMediaPlayer.HLSItem(str2, str, m14322a0.f12057p, this.f121249c));
                sparseIntArray.put(i11, list.size() - 1);
            }
        }
    }

    /* renamed from: w */
    void m130851w(List list, SparseIntArray sparseIntArray, C3000l0 c3000l0, int i11) {
        C17391z m108789V;
        C3020p0 m14322a0 = c3000l0.m14322a0();
        if (!c3000l0.m14285C0() && m14322a0 != null && (m108789V = AbstractC20826v0.m108789V(m14322a0)) != null && !m108789V.m92538c()) {
            String m92536a = m108789V.m92536a(ZMediaPlayerSettings.getVideoConfig(m108789V.f88629l));
            String str = m108789V.f88618a;
            if (!TextUtils.isEmpty(m92536a)) {
                list.add(new ZMediaPlayer.HLSItem(str, m92536a, m14322a0.f12057p, m108789V.f88629l));
                sparseIntArray.put(i11, list.size() - 1);
            }
        }
    }

    /* renamed from: x */
    void m130852x(List list, SparseIntArray sparseIntArray, C3000l0 c3000l0, int i11) {
        C17391z c17391z;
        C3020p0 m14322a0 = c3000l0.m14322a0();
        if (m14322a0 != null && m14322a0.m14480I()) {
            C32106s7 m154973b = C32106s7.m154973b(m14322a0);
            if (m154973b != null) {
                c17391z = m154973b.m154978g();
            } else {
                c17391z = null;
            }
            if (c17391z != null) {
                String m92536a = c17391z.m92536a(ZMediaPlayerSettings.getVideoConfig(c17391z.f88629l));
                if (!TextUtils.isEmpty(m92536a)) {
                    list.add(new ZMediaPlayer.HLSItem(c17391z.f88618a, m92536a, this.f121250d, c17391z.f88629l));
                    sparseIntArray.put(i11, list.size() - 1);
                }
            }
        }
    }

    public C25284i(String str, AbstractC25881j abstractC25881j) {
        super(1, str);
        m130839q(3);
        this.f121265k = new C2370r0(abstractC25881j);
    }
}

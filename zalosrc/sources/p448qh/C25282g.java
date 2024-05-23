package p448qh;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import au.C2370r0;
import com.zing.zalo.p077ui.chat.AbstractC11316a;
import com.zing.zalo.zmedia.player.ZMediaHandlerThread;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import dj.C17945a0;
import dj.C18013y0;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import p448qh.AbstractC25280e;
import p559uv.C27373c;
import p716zh.C32098s;
import p716zh.C32106s7;
import w50.C28771c;

/* renamed from: qh.g */
/* loaded from: classes3.dex */
public class C25282g extends AbstractC25280e {

    /* renamed from: k */
    C2370r0 f121262k;

    public C25282g(String str, AbstractC11316a abstractC11316a) {
        super(0, str);
        m130839q(3);
        this.f121262k = new C2370r0(abstractC11316a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m130844v(SparseArray sparseArray, AbstractC25280e.c cVar) {
        C17391z c17391z;
        try {
            ArrayList arrayList = new ArrayList();
            SparseIntArray sparseIntArray = new SparseIntArray();
            int size = sparseArray.size();
            for (int i11 = 0; i11 < size; i11++) {
                int keyAt = sparseArray.keyAt(i11);
                C17945a0 c17945a0 = (C17945a0) sparseArray.valueAt(i11);
                if (c17945a0.m95306y8()) {
                    C27373c m102936U0 = AbstractC19646n0.m102936U0(c17945a0);
                    if (m102936U0 != null) {
                        String m140220E = m102936U0.m140220E();
                        String m41044h = c17945a0.m95029V3().m41044h();
                        if (!TextUtils.isEmpty(m140220E) && !AbstractC23041d2.m118194A(m140220E)) {
                            arrayList.add(new ZMediaPlayer.HLSItem(m41044h, m140220E, this.f121250d, this.f121249c));
                            sparseIntArray.put(keyAt, arrayList.size() - 1);
                        }
                    }
                } else if (c17945a0.m94929K2() instanceof C18013y0) {
                    C32106s7 m154972a = C32106s7.m154972a((C18013y0) c17945a0.m94929K2());
                    if (m154972a != null) {
                        c17391z = m154972a.m154978g();
                    } else {
                        c17391z = null;
                    }
                    if (c17391z != null) {
                        String m92536a = c17391z.m92536a(ZMediaPlayerSettings.getVideoConfig(c17391z.f88629l));
                        if (!TextUtils.isEmpty(m92536a)) {
                            arrayList.add(new ZMediaPlayer.HLSItem(c17391z.f88618a, m92536a, this.f121250d, c17391z.f88629l));
                            sparseIntArray.put(keyAt, arrayList.size() - 1);
                        }
                    }
                }
            }
            cVar.mo130822a(arrayList, sparseIntArray);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: d */
    protected void mo130831d(final AbstractC25280e.c cVar) {
        AbstractC11316a abstractC11316a;
        C17945a0 m143951k;
        C32098s c32098s;
        try {
            final SparseArray sparseArray = new SparseArray();
            C2370r0 c2370r0 = this.f121262k;
            if (c2370r0 != null) {
                abstractC11316a = (AbstractC11316a) c2370r0.m12394a();
            } else {
                abstractC11316a = null;
            }
            if (abstractC11316a != null) {
                int m60491e0 = abstractC11316a.m60491e0();
                int mo10003k = abstractC11316a.mo10003k();
                for (int i11 = m60491e0; i11 < mo10003k; i11++) {
                    Object m60492f0 = abstractC11316a.m60492f0(i11 - m60491e0);
                    if ((m60492f0 instanceof C28771c) && (m143951k = ((C28771c) m60492f0).m143951k()) != null) {
                        if (m143951k.m95306y8()) {
                            sparseArray.put(i11, m143951k);
                        } else if (m143951k.m94977P7() && (m143951k.m94929K2() instanceof C18013y0) && (c32098s = ((C18013y0) m143951k.m94929K2()).f91251B) != null && c32098s.f147956f == 4) {
                            sparseArray.put(i11, m143951k);
                        }
                    }
                }
            }
            ZMediaHandlerThread.getInstance().execute(new Runnable() { // from class: qh.f
                @Override // java.lang.Runnable
                public final void run() {
                    C25282g.this.m130844v(sparseArray, cVar);
                }
            });
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: f */
    public int mo130832f() {
        List list;
        C2370r0 c2370r0 = this.f121262k;
        if (c2370r0 == null) {
            return 0;
        }
        AbstractC11316a abstractC11316a = (AbstractC11316a) c2370r0.m12394a();
        if (abstractC11316a != null) {
            list = abstractC11316a.m60494h0();
        } else {
            list = null;
        }
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: g */
    public RecyclerView.AbstractC1880g mo130833g() {
        C2370r0 c2370r0 = this.f121262k;
        if (c2370r0 != null) {
            return (RecyclerView.AbstractC1880g) c2370r0.m12394a();
        }
        return null;
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: p */
    public void mo130838p() {
        super.mo130838p();
        C2370r0 c2370r0 = this.f121262k;
        if (c2370r0 != null) {
            c2370r0.m12395b(null);
        }
    }
}

package p448qh;

import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import au.C2370r0;
import com.zing.zalo.adapters.C7271y4;
import com.zing.zalo.zmedia.player.ZMediaHandlerThread;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import p448qh.AbstractC25280e;
import p716zh.C32106s7;

/* renamed from: qh.k */
/* loaded from: classes3.dex */
public class C25286k extends AbstractC25280e {

    /* renamed from: k */
    C2370r0 f121270k;

    public C25286k(String str, C7271y4 c7271y4) {
        super(3, str);
        m130839q(3);
        this.f121270k = new C2370r0(c7271y4);
    }

    /* renamed from: x */
    public /* synthetic */ void m130854x(List list, AbstractC25280e.c cVar) {
        try {
            ArrayList arrayList = new ArrayList();
            SparseIntArray sparseIntArray = new SparseIntArray();
            if (!list.isEmpty()) {
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C32106s7 c32106s7 = (C32106s7) list.get(i11);
                    if (c32106s7 != null) {
                        m130855v(arrayList, sparseIntArray, c32106s7, i11);
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
    protected void mo130831d(AbstractC25280e.c cVar) {
        ZMediaHandlerThread.getInstance().execute(new Runnable() { // from class: qh.j

            /* renamed from: q */
            public final /* synthetic */ List f121268q;

            /* renamed from: r */
            public final /* synthetic */ AbstractC25280e.c f121269r;

            public /* synthetic */ RunnableC25285j(List list, AbstractC25280e.c cVar2) {
                r2 = list;
                r3 = cVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C25286k.this.m130854x(r2, r3);
            }
        });
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: f */
    public int mo130832f() {
        return m130856w().size();
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: g */
    public RecyclerView.AbstractC1880g mo130833g() {
        C2370r0 c2370r0 = this.f121270k;
        if (c2370r0 != null) {
            return (RecyclerView.AbstractC1880g) c2370r0.m12394a();
        }
        return null;
    }

    @Override // p448qh.AbstractC25280e
    /* renamed from: p */
    public void mo130838p() {
        super.mo130838p();
        C2370r0 c2370r0 = this.f121270k;
        if (c2370r0 != null) {
            c2370r0.m12395b(null);
        }
    }

    /* renamed from: v */
    void m130855v(List list, SparseIntArray sparseIntArray, C32106s7 c32106s7, int i11) {
        C17391z m154978g;
        if (c32106s7 != null && (m154978g = c32106s7.m154978g()) != null && !m154978g.m92538c()) {
            String m92536a = m154978g.m92536a(ZMediaPlayerSettings.getVideoConfig(m154978g.f88629l));
            String str = m154978g.f88618a;
            if (!TextUtils.isEmpty(m92536a)) {
                list.add(new ZMediaPlayer.HLSItem(str, m92536a, c32106s7.m154975d(), m154978g.f88629l));
                sparseIntArray.put(i11, list.size() - 1);
            }
        }
    }

    /* renamed from: w */
    List m130856w() {
        C7271y4 c7271y4;
        C2370r0 c2370r0 = this.f121270k;
        if (c2370r0 != null && (c7271y4 = (C7271y4) c2370r0.m12394a()) != null) {
            return new ArrayList(c7271y4.m37026N());
        }
        return new ArrayList();
    }
}

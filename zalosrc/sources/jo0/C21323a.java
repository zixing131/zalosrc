package jo0;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.C7903a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import java.util.ArrayList;
import java.util.List;
import jo0.C21323a;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: jo0.a */
/* loaded from: classes7.dex */
public class C21323a extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    private final List f103822r = new ArrayList();

    /* renamed from: s */
    private final Context f103823s;

    /* renamed from: t */
    private final a f103824t;

    /* renamed from: u */
    private final int f103825u;

    /* renamed from: jo0.a$a */
    /* loaded from: classes7.dex */
    public interface a {
        /* renamed from: a */
        void mo13057a(ContactProfile.C7867c c7867c, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: jo0.a$b */
    /* loaded from: classes7.dex */
    public static class b extends ModulesView {

        /* renamed from: K */
        public C21693c f103826K;

        /* renamed from: L */
        public C21693c f103827L;

        /* renamed from: M */
        public C22126c0 f103828M;

        public b(Context context) {
            super(context);
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -2);
            int i11 = AbstractC23222t7.f112562h;
            layoutParams.setMargins(i11, i11, i11, i11);
            setLayoutParams(layoutParams);
            C21693c c21693c = new C21693c(context);
            this.f103827L = c21693c;
            c21693c.mo111926w1(AbstractC16803z.ic_call_video_call_back_button);
            C16718f m89106L = this.f103827L.m89106L();
            int i12 = AbstractC23222t7.f112534M;
            C16718f m89029M = m89106L.m89028L(i12, i12).m89034R(AbstractC23222t7.f112566j).m89035S(AbstractC23222t7.f112526H).m89029M(14);
            Boolean bool = Boolean.TRUE;
            m89029M.m89017A(bool);
            mo69681L(this.f103827L);
            C21693c c21693c2 = new C21693c(context);
            this.f103826K = c21693c2;
            c21693c2.mo111926w1(AbstractC16803z.ic_call_audio_call_back_button);
            C16718f m89106L2 = this.f103826K.m89106L();
            int i13 = AbstractC23222t7.f112534M;
            m89106L2.m89028L(i13, i13).m89035S(AbstractC23222t7.f112566j).m89034R(AbstractC23222t7.f112566j).m89049e0(this.f103827L);
            mo69681L(this.f103826K);
            C22126c0 c22126c0 = new C22126c0(context);
            this.f103828M = c22126c0;
            c22126c0.mo44614b1(0);
            this.f103828M.m115422R1();
            this.f103828M.mo111965M1(0);
            this.f103828M.mo111964L1(AbstractC23222t7.f112588u);
            this.f103828M.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f103828M.m111953A1(2);
            this.f103828M.m111980v1(TextUtils.TruncateAt.END);
            this.f103828M.m89106L().m89029M(13).m89034R(AbstractC23222t7.f112526H).m89073z(bool).m89027K(true).m89049e0(this.f103826K);
            mo69681L(this.f103828M);
        }

        /* renamed from: V */
        public void m110415V(C7903a c7903a) {
            if (c7903a != null) {
                this.f103828M.m111959G1(c7903a.f42712a.m40444d());
            }
        }
    }

    /* renamed from: jo0.a$c */
    /* loaded from: classes7.dex */
    public class c extends RecyclerView.AbstractC1876c0 {

        /* renamed from: I */
        public b f103829I;

        public c(View view) {
            super(view);
            this.f103829I = (b) view;
            if (C21323a.this.f103825u == 0) {
                this.f103829I.f103828M.m89106L().m89017A(Boolean.TRUE);
            }
            if (C21323a.this.f103825u != 1 && C21323a.this.f103825u != 3) {
                this.f103829I.f103826K.mo44614b1(8);
            } else {
                this.f103829I.f103826K.mo89109M0(new C16719g.c() { // from class: jo0.b
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        C21323a.c.this.m110418l0(c16719g);
                    }
                });
            }
            if (C21323a.this.f103825u != 2 && C21323a.this.f103825u != 3) {
                this.f103829I.f103827L.mo44614b1(8);
                this.f103829I.f103826K.m89106L().m89035S(AbstractC23222t7.f112526H);
            } else {
                this.f103829I.f103827L.mo89109M0(new C16719g.c() { // from class: jo0.c
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        C21323a.c.this.m110419m0(c16719g);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l0 */
        public /* synthetic */ void m110418l0(C16719g c16719g) {
            if (C21323a.this.f103824t != null) {
                C21323a.this.f103824t.mo13057a(C21323a.this.m110413N(m9929A()).f42712a, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m0 */
        public /* synthetic */ void m110419m0(C16719g c16719g) {
            if (C21323a.this.f103824t != null) {
                C21323a.this.f103824t.mo13057a(C21323a.this.m110413N(m9929A()).f42712a, true);
            }
        }

        /* renamed from: k0 */
        public void m110420k0(int i11) {
            try {
                this.f103829I.m110415V(C21323a.this.m110413N(i11));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public C21323a(Context context, int i11, a aVar) {
        this.f103823s = context;
        this.f103824t = aVar;
        this.f103825u = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: A */
    public void mo9990A(RecyclerView.AbstractC1876c0 abstractC1876c0, int i11) {
        if (abstractC1876c0 instanceof c) {
            ((c) abstractC1876c0).m110420k0(i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: C */
    public RecyclerView.AbstractC1876c0 mo9992C(ViewGroup viewGroup, int i11) {
        return new c(new b(this.f103823s));
    }

    /* renamed from: N */
    public C7903a m110413N(int i11) {
        if (i11 >= 0 && i11 < this.f103822r.size()) {
            return (C7903a) this.f103822r.get(i11);
        }
        return null;
    }

    /* renamed from: O */
    public void m110414O(List list) {
        this.f103822r.clear();
        this.f103822r.addAll(list);
        m10008p();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        return this.f103822r.size();
    }
}

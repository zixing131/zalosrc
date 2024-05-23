package l80;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextPaint;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import id0.C20516b;
import id0.C20517c;
import java.util.List;
import kd0.C21693c;
import me0.AbstractC23136l9;
import p588vw.C28652r;
import ph.C24753f;

/* renamed from: l80.i */
/* loaded from: classes6.dex */
public class C22134i extends C16716d implements C16719g.c, C16719g.d {

    /* renamed from: M0 */
    C16716d[] f108996M0;

    /* renamed from: N0 */
    C21693c[] f108997N0;

    /* renamed from: O0 */
    int f108998O0;

    /* renamed from: P0 */
    int f108999P0;

    /* renamed from: Q0 */
    int f109000Q0;

    /* renamed from: R0 */
    int f109001R0;

    /* renamed from: S0 */
    int f109002S0;

    /* renamed from: T0 */
    int f109003T0;

    /* renamed from: U0 */
    int f109004U0;

    /* renamed from: V0 */
    int f109005V0;

    /* renamed from: W0 */
    TextPaint f109006W0;

    /* renamed from: X0 */
    String f109007X0;

    /* renamed from: Y0 */
    String f109008Y0;

    /* renamed from: Z0 */
    List f109009Z0;

    /* renamed from: a1 */
    int f109010a1;

    /* renamed from: b1 */
    Handler f109011b1;

    /* renamed from: c1 */
    C20517c f109012c1;

    /* renamed from: d1 */
    int f109013d1;

    /* renamed from: e1 */
    int f109014e1;

    /* renamed from: f1 */
    int f109015f1;

    /* renamed from: g1 */
    a f109016g1;

    /* renamed from: l80.i$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: a */
        void mo66754a(String str, String str2, C24753f c24753f);

        /* renamed from: b */
        void mo66755b(String str, String str2, int i11, int i12, int i13);
    }

    public C22134i(Context context, int i11, List list, int i12, int i13, int i14) {
        super(context);
        this.f109015f1 = i11;
        m115458o1(list, i12, i13, i14);
    }

    @Override // com.zing.zalo.uidrawing.C16719g.d
    /* renamed from: f */
    public void mo942f(C16719g c16719g) {
        try {
            if ((c16719g.m89133b0() instanceof Integer) && ((Integer) c16719g.m89133b0()).intValue() / 10 == 2) {
                int m89096G = c16719g.m89096G();
                int m89098H = c16719g.m89098H();
                int m89112O = c16719g.m89112O();
                a aVar = this.f109016g1;
                if (aVar != null) {
                    aVar.mo66755b(this.f109007X0, this.f109008Y0, m89096G, m89098H, m89112O);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o1 */
    void m115458o1(List list, int i11, int i12, int i13) {
        this.f109011b1 = new Handler(Looper.getMainLooper());
        this.f109009Z0 = list;
        this.f108998O0 = 30;
        this.f108999P0 = 30;
        this.f109000Q0 = 6;
        this.f109001R0 = i12;
        this.f109013d1 = i13;
        this.f109002S0 = AbstractC23136l9.m118742r(30);
        this.f109003T0 = AbstractC23136l9.m118742r(this.f108999P0);
        this.f109004U0 = AbstractC23136l9.m118742r(this.f109000Q0);
        this.f109005V0 = AbstractC23136l9.m118742r(i12);
        this.f109014e1 = AbstractC23136l9.m118742r(this.f109013d1);
        TextPaint textPaint = new TextPaint(1);
        this.f109006W0 = textPaint;
        textPaint.setTextSize(AbstractC23136l9.m118742r(12.0f));
        this.f109012c1 = new C20517c().m106598o(new C20516b().m106588d(1.0f).m106595l(0.75f).m106589e(1.0f).m106596m(0.75f).m106593j(100L)).m106598o(new C20516b().m106588d(0.75f).m106595l(1.0f).m106589e(0.75f).m106596m(1.0f).m106593j(100L));
        if (list != null && !list.isEmpty() && i11 <= list.size()) {
            this.f109010a1 = i11;
            this.f108997N0 = new C21693c[list.size()];
            this.f108996M0 = new C16716d[list.size()];
            C16716d c16716d = null;
            for (int i14 = 0; i14 < this.f109010a1; i14++) {
                this.f108997N0[i14] = new C21693c(getContext());
                this.f108997N0[i14].m89106L().m89060k0(this.f109002S0).m89030N(this.f109003T0).m89041Y(this.f109004U0).m89025I(true).m89029M(15);
                this.f108997N0[i14].mo111925v1(C28652r.m143349v().m143375n(((C24753f) list.get(i14)).m128596i(), this.f108998O0 - (this.f109000Q0 * 2)));
                this.f108997N0[i14].m89087B0(AbstractC16803z.icn_khomedia_circle_reaction);
                this.f108996M0[i14] = new C16716d(getContext());
                this.f108996M0[i14].m89106L().m89028L(-2, -2).m89029M(15).m89041Y(this.f109014e1).m89027K(true).m89034R(this.f109005V0).m89054h0(c16716d);
                this.f108996M0[i14].m89001g1(this.f108997N0[i14]);
                this.f108996M0[i14].m89129Y0(Integer.valueOf(i14 + 20));
                this.f108996M0[i14].mo89109M0(this);
                this.f108996M0[i14].m89111N0(this);
                m89001g1(this.f108996M0[i14]);
                c16716d = this.f108996M0[i14];
            }
        }
    }

    /* renamed from: p1 */
    public void m115459p1(a aVar) {
        this.f109016g1 = aVar;
    }

    /* renamed from: q1 */
    public void m115460q1(int i11, int i12, int i13) {
        try {
            this.f108998O0 = i11;
            this.f108999P0 = i12;
            this.f109001R0 = i13;
            this.f109002S0 = AbstractC23136l9.m118742r(i11);
            this.f109003T0 = AbstractC23136l9.m118742r(this.f108999P0);
            this.f109005V0 = AbstractC23136l9.m118742r(i13);
            for (int i14 = 0; i14 < this.f108997N0.length; i14++) {
                this.f108997N0[i14].mo111925v1(C28652r.m143349v().m143375n(((C24753f) this.f109009Z0.get(i14)).m128596i(), this.f108998O0 - (this.f109000Q0 * 2)));
            }
            requestLayout();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    public void requestLayout() {
        try {
            if (this.f108997N0 != null) {
                for (int i11 = 0; i11 < this.f109010a1; i11++) {
                    C21693c c21693c = this.f108997N0[i11];
                    if (c21693c != null) {
                        c21693c.m89106L().m89060k0(this.f109002S0).m89030N(this.f109003T0).m89041Y(this.f109004U0).m89029M(15).m89027K(true);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.requestLayout();
    }

    @Override // com.zing.zalo.uidrawing.C16719g.c
    /* renamed from: y */
    public void mo929y(C16719g c16719g) {
        try {
            if (c16719g.m89133b0() instanceof Integer) {
                int intValue = ((Integer) c16719g.m89133b0()).intValue();
                if (intValue / 10 == 2) {
                    c16719g.m89135c1(this.f109012c1);
                    a aVar = this.f109016g1;
                    if (aVar != null) {
                        aVar.mo66754a(this.f109007X0, this.f109008Y0, (C24753f) this.f109009Z0.get(intValue % 10));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}

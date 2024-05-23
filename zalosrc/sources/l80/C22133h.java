package l80;

import android.content.Context;
import com.androidquery.util.C3977j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.ArrayList;
import kd0.C21693c;
import me0.AbstractC23136l9;
import me0.AbstractC23268y2;
import me0.C23212s8;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C24003n;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: l80.h */
/* loaded from: classes6.dex */
public final class C22133h extends C16716d {

    /* renamed from: M0 */
    private int f108985M0;

    /* renamed from: N0 */
    private final ArrayList f108986N0;

    /* renamed from: O0 */
    private final ArrayList f108987O0;

    /* renamed from: P0 */
    private final ArrayList f108988P0;

    /* renamed from: Q0 */
    private final C24003n f108989Q0;

    /* renamed from: R0 */
    private int f108990R0;

    /* renamed from: S0 */
    private float f108991S0;

    /* renamed from: T0 */
    private int f108992T0;

    /* renamed from: U0 */
    private final int f108993U0;

    /* renamed from: V0 */
    private final InterfaceC24854k f108994V0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l80.h$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f108995q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f108995q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C23528a mo12V4() {
            return new C23528a(this.f108995q);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22133h(Context context, int i11) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f108985M0 = i11;
        this.f108986N0 = new ArrayList();
        this.f108987O0 = new ArrayList();
        this.f108988P0 = new ArrayList();
        this.f108989Q0 = C23278z2.m120143n();
        this.f108990R0 = C23212s8.m119607o(context, AbstractC16781w.btn_type_3_n);
        this.f108991S0 = AbstractC23136l9.m118742r(1.0f);
        this.f108992T0 = 3;
        this.f108993U0 = AbstractC23136l9.m118742r(12.0f);
        m129210a = AbstractC24856m.m129210a(new a(context));
        this.f108994V0 = m129210a;
        int i12 = this.f108992T0;
        for (int i13 = 0; i13 < i12; i13++) {
            this.f108986N0.add(new C3977j(context));
            C22128d0 c22128d0 = new C22128d0(context);
            c22128d0.m111929z1(5);
            this.f108987O0.add(c22128d0);
        }
    }

    /* renamed from: o1 */
    private final void m115452o1() {
        int size = this.f108988P0.size();
        for (int i11 = 0; i11 < size; i11++) {
            C22128d0 c22128d0 = (C22128d0) this.f108987O0.get(i11);
            c22128d0.f108917W0 = this.f108990R0;
            c22128d0.f108918X0 = this.f108991S0;
            AbstractC23268y2.m120033g(m115453p1(), (C3977j) this.f108986N0.get(i11), (C21693c) this.f108987O0.get(i11), (String) this.f108988P0.get(i11), this.f108989Q0, false);
        }
    }

    /* renamed from: p1 */
    private final C23528a m115453p1() {
        return (C23528a) this.f108994V0.getValue();
    }

    /* renamed from: s1 */
    private final void m115454s1() {
        int size = this.f108988P0.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C16718f m89106L = ((C22128d0) this.f108987O0.get(i12)).m89106L();
            int i13 = this.f108985M0;
            m89106L.m89028L(i13, i13);
            m89106L.f84720p = i11;
            ((C22128d0) this.f108987O0.get(i12)).mo44614b1(0);
            i11 += this.f108993U0;
            m89001g1((C16719g) this.f108987O0.get(i12));
        }
    }

    /* renamed from: q1 */
    public final void m115455q1(int i11) {
        C16718f m89106L = ((C22128d0) this.f108987O0.get(0)).m89106L();
        int i12 = this.f108985M0;
        m89106L.m89028L(i12, i12);
        ((C22128d0) this.f108987O0.get(0)).mo44614b1(0);
        m89001g1((C16719g) this.f108987O0.get(0));
        ((C22128d0) this.f108987O0.get(0)).mo111925v1(AbstractC23136l9.m118665N(getContext(), i11));
    }

    /* renamed from: r1 */
    public final void m115456r1(ArrayList arrayList) {
        AbstractC19074t.m100208f(arrayList, "avatars");
        this.f108988P0.clear();
        ArrayList arrayList2 = this.f108988P0;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList3.add(obj);
            }
        }
        arrayList2.addAll(arrayList3);
        m115454s1();
        m115452o1();
    }
}

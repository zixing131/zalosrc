package p716zh;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1796t0;
import androidx.lifecycle.AbstractC1804x0;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.LiveData;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19074t;
import java.util.Calendar;
import me0.AbstractC23136l9;
import p534u1.AbstractC26941a;
import pm0.C24860q;

/* renamed from: zh.lb */
/* loaded from: classes3.dex */
public final class C32009lb extends AbstractC1796t0 {

    /* renamed from: s */
    private int f147309s;

    /* renamed from: t */
    private int f147310t;

    /* renamed from: u */
    private int f147311u;

    /* renamed from: v */
    private int f147312v;

    /* renamed from: w */
    private final C1761c0 f147313w = new C1761c0(AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_range_picker_title));

    /* renamed from: x */
    private final C1761c0 f147314x = new C1761c0();

    /* renamed from: y */
    private final C1761c0 f147315y = new C1761c0();

    /* renamed from: z */
    private final C1761c0 f147316z = new C1761c0();

    /* renamed from: A */
    private final C1761c0 f147304A = new C1761c0();

    /* renamed from: B */
    private final C1761c0 f147305B = new C1761c0();

    /* renamed from: C */
    private final C1761c0 f147306C = new C1761c0();

    /* renamed from: D */
    private final C1761c0 f147307D = new C1761c0();

    /* renamed from: E */
    private final C1761c0 f147308E = new C1761c0();

    /* renamed from: zh.lb$a */
    /* loaded from: classes3.dex */
    public static final class a implements C1802w0.b {
        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: a */
        public /* synthetic */ AbstractC1796t0 mo1195a(Class cls, AbstractC26941a abstractC26941a) {
            return AbstractC1804x0.m9390b(this, cls, abstractC26941a);
        }

        @Override // androidx.lifecycle.C1802w0.b
        /* renamed from: b */
        public AbstractC1796t0 mo1196b(Class cls) {
            AbstractC19074t.m100208f(cls, "modelClass");
            return new C32009lb();
        }
    }

    /* renamed from: N */
    private final void m154304N() {
        if (this.f147309s == this.f147311u && this.f147310t == this.f147312v) {
            this.f147314x.mo9221n(Boolean.FALSE);
        } else {
            this.f147314x.mo9221n(Boolean.TRUE);
        }
    }

    /* renamed from: b0 */
    private final void m154305b0() {
        Object valueOf;
        C1761c0 c1761c0 = this.f147304A;
        int i11 = this.f147311u;
        int i12 = this.f147312v;
        if (i12 < 10) {
            valueOf = "0" + i12;
        } else {
            valueOf = Integer.valueOf(i12);
        }
        c1761c0.mo9221n(i11 + ":" + valueOf);
    }

    /* renamed from: c0 */
    private final void m154306c0() {
        Object valueOf;
        C1761c0 c1761c0 = this.f147316z;
        int i11 = this.f147309s;
        int i12 = this.f147310t;
        if (i12 < 10) {
            valueOf = "0" + i12;
        } else {
            valueOf = Integer.valueOf(i12);
        }
        c1761c0.mo9221n(i11 + ":" + valueOf);
    }

    /* renamed from: M */
    public final LiveData m154307M() {
        return this.f147314x;
    }

    /* renamed from: O */
    public final LiveData m154308O() {
        return this.f147307D;
    }

    /* renamed from: P */
    public final LiveData m154309P() {
        return this.f147306C;
    }

    /* renamed from: Q */
    public final LiveData m154310Q() {
        return this.f147305B;
    }

    /* renamed from: R */
    public final void m154311R(Bundle bundle) {
        if (bundle != null) {
            this.f147313w.mo9221n(bundle.getString("EXTRA_TITLE", AbstractC23136l9.m118743r0(AbstractC8020f0.str_time_range_picker_title)));
            long j11 = bundle.getLong("EXTRA_START_TIME", 0L);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j11);
            this.f147309s = calendar.get(11);
            this.f147310t = calendar.get(12);
            long j12 = bundle.getLong("EXTRA_END_TIME", 0L);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j12);
            this.f147311u = calendar2.get(11);
            this.f147312v = calendar2.get(12);
        }
        this.f147305B.mo9221n(new C24860q(Integer.valueOf(this.f147309s), Integer.valueOf(this.f147310t)));
        this.f147306C.mo9221n(Boolean.TRUE);
        this.f147307D.mo9221n(Boolean.FALSE);
        m154306c0();
        m154305b0();
        m154304N();
    }

    /* renamed from: S */
    public final void m154312S() {
        this.f147315y.mo9221n(Boolean.TRUE);
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, this.f147309s);
        calendar.set(12, this.f147310t);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        int i11 = this.f147311u;
        int i12 = this.f147309s;
        if (i11 < i12 || (i11 == i12 && this.f147312v <= this.f147310t)) {
            calendar.add(6, 1);
        }
        calendar.set(11, this.f147311u);
        calendar.set(12, this.f147312v);
        this.f147308E.mo9221n(new C24860q(Long.valueOf(timeInMillis), Long.valueOf(calendar.getTimeInMillis())));
    }

    /* renamed from: T */
    public final void m154313T() {
        this.f147306C.mo9221n(Boolean.FALSE);
        this.f147307D.mo9221n(Boolean.TRUE);
        this.f147305B.mo9221n(new C24860q(Integer.valueOf(this.f147311u), Integer.valueOf(this.f147312v)));
    }

    /* renamed from: U */
    public final void m154314U() {
        this.f147306C.mo9221n(Boolean.TRUE);
        this.f147307D.mo9221n(Boolean.FALSE);
        this.f147305B.mo9221n(new C24860q(Integer.valueOf(this.f147309s), Integer.valueOf(this.f147310t)));
    }

    /* renamed from: V */
    public final void m154315V(int i11, int i12) {
        Object mo9215f = this.f147306C.mo9215f();
        Boolean bool = Boolean.TRUE;
        if (AbstractC19074t.m100204b(mo9215f, bool)) {
            this.f147309s = i11;
            this.f147310t = i12;
            m154306c0();
        }
        if (AbstractC19074t.m100204b(this.f147307D.mo9215f(), bool)) {
            this.f147311u = i11;
            this.f147312v = i12;
            m154305b0();
        }
        m154304N();
    }

    /* renamed from: W */
    public final LiveData m154316W() {
        return this.f147308E;
    }

    /* renamed from: X */
    public final LiveData m154317X() {
        return this.f147304A;
    }

    /* renamed from: Y */
    public final LiveData m154318Y() {
        return this.f147316z;
    }

    /* renamed from: Z */
    public final LiveData m154319Z() {
        return this.f147315y;
    }

    /* renamed from: a0 */
    public final LiveData m154320a0() {
        return this.f147313w;
    }
}

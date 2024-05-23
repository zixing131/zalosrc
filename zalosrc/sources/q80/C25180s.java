package q80;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.uidrawing.C16716d;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hd0.C20005c;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p354n3.C23528a;
import p612wk.AbstractC29069a;
import pm0.C24848g0;

/* renamed from: q80.s */
/* loaded from: classes6.dex */
public final class C25180s extends C16716d implements InterfaceC18319c {
    public static final a Companion = new a(null);

    /* renamed from: M0 */
    private InterfaceC18319c f120805M0;

    /* renamed from: N0 */
    private final C25179r[] f120806N0;

    /* renamed from: q80.s$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25180s(Context context, C23528a c23528a, InterfaceC18319c interfaceC18319c) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c23528a, "aQ");
        this.f120805M0 = interfaceC18319c;
        m89106L().m89028L(-1, -2).m89046b0(AbstractC23136l9.m118742r(16.0f)).m89047c0(AbstractC23136l9.m118742r(16.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f));
        mo89161z0(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-1, -2);
        C20005c[] c20005cArr = new C20005c[4];
        for (int i11 = 0; i11 < 4; i11++) {
            C20005c m103822e = new C20005c().m103822e(i11 / 3);
            AbstractC19074t.m100207e(m103822e, "setXPercent(...)");
            c20005cArr[i11] = m103822e;
        }
        C25179r[] c25179rArr = new C25179r[3];
        int i12 = 0;
        while (i12 < 3) {
            C25179r c25179r = new C25179r(context, c23528a, null, 4, null);
            int i13 = i12 + 1;
            c25179r.m89106L().m89058j0(c20005cArr[i12]).m89052g0(c20005cArr[i13]);
            C24848g0 c24848g0 = C24848g0.f119245a;
            c25179rArr[i12] = c25179r;
            i12 = i13;
        }
        this.f120806N0 = c25179rArr;
        for (C25179r c25179r2 : c25179rArr) {
            c16716d.m89001g1(c25179r2);
            c25179r2.m130334u1(this);
        }
        m89001g1(c16716d);
    }

    /* renamed from: o1 */
    public final void m130336o1(List list, boolean z11) {
        AbstractC19074t.m100208f(list, "data");
        try {
            if (list.size() != 3) {
                return;
            }
            synchronized (this.f120806N0) {
                try {
                    C25179r[] c25179rArr = this.f120806N0;
                    int length = c25179rArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length) {
                        c25179rArr[i11].m130332q1((AbstractC29069a.o) list.get(i12), z11);
                        i11++;
                        i12++;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p1 */
    public final void m130337p1(List list, boolean z11) {
        AbstractC19074t.m100208f(list, "data");
        try {
            if (list.size() != 3) {
                return;
            }
            synchronized (this.f120806N0) {
                try {
                    C25179r[] c25179rArr = this.f120806N0;
                    int length = c25179rArr.length;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < length) {
                        c25179rArr[i11].m130333r1((AbstractC29069a.o) list.get(i12), z11, i12);
                        i11++;
                        i12++;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public C18316b mo205i9(C18316b c18316b) {
        AbstractC19074t.m100208f(c18316b, "action");
        InterfaceC18319c interfaceC18319c = this.f120805M0;
        if (interfaceC18319c != null) {
            return (C18316b) interfaceC18319c.mo205i9(c18316b);
        }
        return null;
    }

    /* renamed from: r1 */
    public final void m130339r1(InterfaceC18319c interfaceC18319c) {
        this.f120805M0 = interfaceC18319c;
    }

    public /* synthetic */ C25180s(Context context, C23528a c23528a, InterfaceC18319c interfaceC18319c, int i11, AbstractC19060k abstractC19060k) {
        this(context, c23528a, (i11 & 4) != 0 ? null : interfaceC18319c);
    }
}

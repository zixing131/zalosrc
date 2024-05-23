package ho0;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import pm0.C24848g0;

/* renamed from: ho0.a */
/* loaded from: classes.dex */
public abstract class AbstractC20110a {

    /* renamed from: a */
    public static final a f98889a = new a(null);

    /* renamed from: b */
    private static final ArrayList f98890b = new ArrayList();

    /* renamed from: c */
    private static volatile b[] f98891c = new b[0];

    /* renamed from: ho0.a$a */
    /* loaded from: classes.dex */
    public static final class a extends b {
        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: a */
        public void mo104548a(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104548a(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: b */
        public void mo104549b(Throwable th2) {
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104549b(th2);
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: c */
        public void mo104550c(Throwable th2, String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104550c(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: d */
        public void mo104551d(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104551d(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: e */
        public void mo104552e(Throwable th2) {
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104552e(th2);
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: f */
        public void mo104553f(Throwable th2, String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104553f(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: k */
        public void mo104554k(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104554k(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: n */
        protected void mo104555n(int i11, String str, String str2, Throwable th2) {
            AbstractC19074t.m100208f(str2, "message");
            throw new AssertionError();
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: o */
        public void mo104556o(int i11, String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104556o(i11, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: p */
        public void mo104557p(int i11, Throwable th2, String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104557p(i11, th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: r */
        public void mo104558r(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104558r(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: s */
        public void mo104559s(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104559s(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: t */
        public void mo104560t(Throwable th2) {
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104560t(th2);
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: u */
        public void mo104561u(Throwable th2, String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104561u(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // ho0.AbstractC20110a.b
        /* renamed from: v */
        public void mo104562v(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            for (b bVar : AbstractC20110a.f98891c) {
                bVar.mo104562v(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        /* renamed from: w */
        public final void m104563w(b bVar) {
            boolean z11;
            AbstractC19074t.m100208f(bVar, "tree");
            if (bVar != this) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                synchronized (AbstractC20110a.f98890b) {
                    AbstractC20110a.f98890b.add(bVar);
                    Object[] array = AbstractC20110a.f98890b.toArray(new b[0]);
                    if (array != null) {
                        AbstractC20110a.f98891c = (b[]) array;
                        C24848g0 c24848g0 = C24848g0.f119245a;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
        }

        /* renamed from: x */
        public final b m104564x(String str) {
            AbstractC19074t.m100208f(str, "tag");
            b[] bVarArr = AbstractC20110a.f98891c;
            int length = bVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                b bVar = bVarArr[i11];
                i11++;
                bVar.m104569h().set(str);
            }
            return this;
        }

        /* renamed from: y */
        public final void m104565y() {
            synchronized (AbstractC20110a.f98890b) {
                AbstractC20110a.f98890b.clear();
                AbstractC20110a.f98891c = new b[0];
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }

        private a() {
        }
    }

    /* renamed from: ho0.a$b */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a */
        private final ThreadLocal f98892a = new ThreadLocal();

        /* renamed from: i */
        private final String m104566i(Throwable th2) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            AbstractC19074t.m100207e(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        /* renamed from: q */
        private final void m104567q(int i11, Throwable th2, String str, Object... objArr) {
            boolean z11;
            String m104570j = m104570j();
            if (!m104572m(m104570j, i11)) {
                return;
            }
            if (str != null && str.length() != 0) {
                if (objArr.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    str = mo104568g(str, objArr);
                }
                if (th2 != null) {
                    str = ((Object) str) + '\n' + m104566i(th2);
                }
            } else if (th2 == null) {
                return;
            } else {
                str = m104566i(th2);
            }
            mo104555n(i11, m104570j, str, th2);
        }

        /* renamed from: a */
        public void mo104548a(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(3, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: b */
        public void mo104549b(Throwable th2) {
            m104567q(3, th2, null, new Object[0]);
        }

        /* renamed from: c */
        public void mo104550c(Throwable th2, String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(3, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: d */
        public void mo104551d(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(6, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: e */
        public void mo104552e(Throwable th2) {
            m104567q(6, th2, null, new Object[0]);
        }

        /* renamed from: f */
        public void mo104553f(Throwable th2, String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(6, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: g */
        public String mo104568g(String str, Object[] objArr) {
            AbstractC19074t.m100208f(str, "message");
            AbstractC19074t.m100208f(objArr, "args");
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            AbstractC19074t.m100207e(format, "java.lang.String.format(this, *args)");
            return format;
        }

        /* renamed from: h */
        public final /* synthetic */ ThreadLocal m104569h() {
            return this.f98892a;
        }

        /* renamed from: j */
        public /* synthetic */ String m104570j() {
            String str = (String) this.f98892a.get();
            if (str != null) {
                this.f98892a.remove();
            }
            return str;
        }

        /* renamed from: k */
        public void mo104554k(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(4, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: l */
        protected boolean m104571l(int i11) {
            return true;
        }

        /* renamed from: m */
        protected boolean m104572m(String str, int i11) {
            return m104571l(i11);
        }

        /* renamed from: n */
        protected abstract void mo104555n(int i11, String str, String str2, Throwable th2);

        /* renamed from: o */
        public void mo104556o(int i11, String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(i11, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: p */
        public void mo104557p(int i11, Throwable th2, String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(i11, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: r */
        public void mo104558r(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(2, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: s */
        public void mo104559s(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(5, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: t */
        public void mo104560t(Throwable th2) {
            m104567q(5, th2, null, new Object[0]);
        }

        /* renamed from: u */
        public void mo104561u(Throwable th2, String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(5, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        /* renamed from: v */
        public void mo104562v(String str, Object... objArr) {
            AbstractC19074t.m100208f(objArr, "args");
            m104567q(7, null, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* renamed from: d */
    public static void m104535d(String str, Object... objArr) {
        f98889a.mo104548a(str, objArr);
    }

    /* renamed from: e */
    public static void m104536e(Throwable th2) {
        f98889a.mo104549b(th2);
    }

    /* renamed from: f */
    public static void m104537f(Throwable th2, String str, Object... objArr) {
        f98889a.mo104550c(th2, str, objArr);
    }

    /* renamed from: g */
    public static void m104538g(String str, Object... objArr) {
        f98889a.mo104551d(str, objArr);
    }

    /* renamed from: h */
    public static void m104539h(Throwable th2) {
        f98889a.mo104552e(th2);
    }

    /* renamed from: i */
    public static void m104540i(Throwable th2, String str, Object... objArr) {
        f98889a.mo104553f(th2, str, objArr);
    }

    /* renamed from: j */
    public static void m104541j(String str, Object... objArr) {
        f98889a.mo104554k(str, objArr);
    }

    /* renamed from: k */
    public static void m104542k(int i11, String str, Object... objArr) {
        f98889a.mo104556o(i11, str, objArr);
    }

    /* renamed from: l */
    public static final b m104543l(String str) {
        return f98889a.m104564x(str);
    }

    /* renamed from: m */
    public static void m104544m(String str, Object... objArr) {
        f98889a.mo104558r(str, objArr);
    }

    /* renamed from: n */
    public static void m104545n(String str, Object... objArr) {
        f98889a.mo104559s(str, objArr);
    }

    /* renamed from: o */
    public static void m104546o(Throwable th2) {
        f98889a.mo104560t(th2);
    }

    /* renamed from: p */
    public static void m104547p(Throwable th2, String str, Object... objArr) {
        f98889a.mo104561u(th2, str, objArr);
    }
}

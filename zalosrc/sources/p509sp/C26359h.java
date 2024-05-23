package p509sp;

import ag0.AbstractC0837p0;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ho0.AbstractC20110a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23160o0;
import nh0.C23793c;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: sp.h */
/* loaded from: classes.dex */
public final class C26359h implements InterfaceC26357f {

    /* renamed from: a */
    public static final C26359h f125209a = new C26359h();

    /* renamed from: b */
    private static final AtomicBoolean f125210b = new AtomicBoolean(false);

    /* renamed from: c */
    private static final InterfaceC24854k f125211c;

    /* renamed from: sp.h$a */
    /* loaded from: classes.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f125212q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SimpleDateFormat mo12V4() {
            return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS");
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f125212q);
        f125211c = m129210a;
    }

    private C26359h() {
    }

    /* renamed from: c */
    private final void m135687c(long j11, String str, String str2, InterfaceC18494a interfaceC18494a) {
        if (C26360i.f125213a.m135694c(str)) {
            try {
                AbstractC20110a.a aVar = AbstractC20110a.f98889a;
                aVar.m104564x(m135688d(j11));
                aVar.mo104551d("[" + str + "] [" + str2 + "] [" + interfaceC18494a.mo12V4() + "]", new Object[0]);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: d */
    private final String m135688d(long j11) {
        Date date = new Date(j11);
        AbstractC23160o0.m119268l1(m135689e());
        String format = m135689e().format(date);
        if (format == null) {
            return String.valueOf(j11);
        }
        return format;
    }

    /* renamed from: e */
    private final SimpleDateFormat m135689e() {
        return (SimpleDateFormat) f125211c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m135690f(long j11, String str, String str2, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(str, "$feature");
        AbstractC19074t.m100208f(str2, "$action");
        AbstractC19074t.m100208f(interfaceC18494a, "$values");
        f125209a.m135687c(j11, str, str2, interfaceC18494a);
        f125210b.set(true);
    }

    @Override // p509sp.InterfaceC26357f
    /* renamed from: a */
    public void mo135685a(final String str, final String str2, final InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(str, "feature");
        AbstractC19074t.m100208f(str2, "action");
        AbstractC19074t.m100208f(interfaceC18494a, "values");
        final long mo124311f = C23793c.Companion.m124321a().mo124311f();
        if (f125210b.get()) {
            m135687c(mo124311f, str, str2, interfaceC18494a);
        } else {
            AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: sp.g
                @Override // java.lang.Runnable
                public final void run() {
                    C26359h.m135690f(mo124311f, str, str2, interfaceC18494a);
                }
            });
        }
    }
}

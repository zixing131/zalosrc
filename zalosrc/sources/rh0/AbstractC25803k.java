package rh0;

import android.os.Debug;
import android.text.TextUtils;
import com.zing.zalo.AbstractC7306b;
import com.zing.zalo.MainApplication;
import com.zing.zalo.zam.BlockCanaryANR;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import li.AbstractC22490a;
import me0.AbstractC23041d2;
import mx.AbstractC23466c;
import mx.AbstractC23473j;
import mx.AbstractC23477n;
import mx.C23470g;
import mx.C23475l;
import mx.C23476m;
import p042bx.C3150e;
import p171fx.AbstractC19160a;
import p171fx.AbstractC19164e;
import p171fx.AbstractC19166g;
import p171fx.C19168i;
import p248iy.AbstractC20887g;
import p280jx.AbstractC21394s;
import p308kx.C21965i;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import th.AbstractC26684e;
import zw.AbstractC32562b;

/* renamed from: rh0.k */
/* loaded from: classes.dex */
public abstract class AbstractC25803k {

    /* renamed from: a */
    static final String f123028a = "k";

    /* renamed from: b */
    public static AtomicInteger f123029b = new AtomicInteger();

    /* renamed from: c */
    private static final Object f123030c = new Object();

    /* renamed from: d */
    private static final List f123031d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e */
    private static final List f123032e = Collections.synchronizedList(new ArrayList());

    /* renamed from: f */
    private static final C3150e.b f123033f = new C3150e.b() { // from class: rh0.j
        @Override // p042bx.C3150e.b
        /* renamed from: a */
        public final void mo15866a(long j11, String str) {
            AbstractC25803k.m132970j(j11, str);
        }
    };

    /* renamed from: g */
    private static final C23470g.c f123034g = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh0.k$a */
    /* loaded from: classes.dex */
    public class a implements C23470g.c {

        /* renamed from: rh0.k$a$a */
        /* loaded from: classes7.dex */
        class C32967a extends AbstractC19160a {
            C32967a() {
            }

            @Override // p171fx.AbstractC19160a
            /* renamed from: a */
            public void mo98440a(List list) {
                long m122456u5 = AbstractC23309i.m122456u5();
                if (m122456u5 > 0 && System.currentTimeMillis() - m122456u5 > 259200000) {
                    AbstractC25803k.m132966f(false);
                }
            }
        }

        a() {
        }

        @Override // mx.C23470g.c
        /* renamed from: a */
        public void mo123232a() {
            AbstractC20110a.m104535d(AbstractC25803k.f123028a + ": onBecameBackground: ", new Object[0]);
            C21965i.m114682K();
            AbstractC21394s.m110853q(MainApplication.getAppContext());
            AbstractC19164e.m100525k();
            C19168i.m100579c(new C32967a());
        }

        @Override // mx.C23470g.c
        /* renamed from: b */
        public void mo123233b() {
            AtomicInteger atomicInteger = AbstractC25803k.f123029b;
            C21965i.m114683L();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh0.k$b */
    /* loaded from: classes7.dex */
    public class b extends AbstractC19160a {

        /* renamed from: b */
        final /* synthetic */ boolean f123036b;

        /* renamed from: c */
        final /* synthetic */ long f123037c;

        /* renamed from: d */
        final /* synthetic */ long f123038d;

        /* renamed from: e */
        final /* synthetic */ String f123039e;

        /* renamed from: f */
        final /* synthetic */ boolean f123040f;

        b(boolean z11, long j11, long j12, String str, boolean z12) {
            this.f123036b = z11;
            this.f123037c = j11;
            this.f123038d = j12;
            this.f123039e = str;
            this.f123040f = z12;
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            boolean z11 = this.f123036b;
            byte m123239c = C23475l.m123239c();
            AbstractC25803k.f123031d.add(AbstractC23477n.m123254b(this.f123037c, this.f123038d, this.f123039e, AbstractC23304d.f113357a.get(), z11 ? (byte) 1 : (byte) 0, this.f123040f ? (byte) 1 : (byte) 0, m123239c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh0.k$c */
    /* loaded from: classes7.dex */
    public class c extends AbstractC19160a {
        c() {
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            if (AbstractC23473j.m123236a(MainApplication.getAppContext())) {
                int size = list.size();
                StringBuilder sb2 = new StringBuilder();
                synchronized (AbstractC25803k.f123030c) {
                    for (int i11 = 0; i11 < size; i11++) {
                        try {
                            sb2.append(((AbstractC32562b) list.get(i11)).toString());
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (sb2.length() > 0) {
                    AbstractC23466c.m123219v(sb2.toString(), AbstractC23466c.m123212o("database/"));
                    AbstractC19166g.m100567q(System.currentTimeMillis());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh0.k$d */
    /* loaded from: classes7.dex */
    public class d extends AbstractC19160a {

        /* renamed from: b */
        final /* synthetic */ boolean f123041b;

        /* renamed from: c */
        final /* synthetic */ long f123042c;

        /* renamed from: d */
        final /* synthetic */ int f123043d;

        /* renamed from: e */
        final /* synthetic */ int f123044e;

        /* renamed from: f */
        final /* synthetic */ String f123045f;

        /* renamed from: g */
        final /* synthetic */ int f123046g;

        /* renamed from: h */
        final /* synthetic */ String f123047h;

        d(boolean z11, long j11, int i11, int i12, String str, int i13, String str2) {
            this.f123041b = z11;
            this.f123042c = j11;
            this.f123043d = i11;
            this.f123044e = i12;
            this.f123045f = str;
            this.f123046g = i13;
            this.f123047h = str2;
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            if (AbstractC23473j.m123236a(MainApplication.getAppContext())) {
                AtomicInteger atomicInteger = AbstractC25803k.f123029b;
                atomicInteger.set(atomicInteger.get() + 1);
                boolean z11 = this.f123041b;
                byte m123239c = C23475l.m123239c();
                AbstractC25803k.f123032e.add(AbstractC23477n.m123257e(this.f123042c, this.f123043d, this.f123044e, this.f123045f, this.f123046g, AbstractC23304d.f113357a.get(), z11 ? (byte) 1 : (byte) 0, this.f123047h, m123239c));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: rh0.k$e */
    /* loaded from: classes7.dex */
    public class e extends AbstractC19160a {
        e() {
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            if (AbstractC23473j.m123236a(MainApplication.getAppContext())) {
                int size = list.size();
                StringBuilder sb2 = new StringBuilder();
                synchronized (AbstractC25803k.f123030c) {
                    for (int i11 = 0; i11 < size; i11++) {
                        try {
                            sb2.append(((AbstractC32562b) list.get(i11)).toString());
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (sb2.length() > 0) {
                    AbstractC23466c.m123219v(sb2.toString(), AbstractC23466c.m123212o("network/"));
                    AbstractC19166g.m100568r(System.currentTimeMillis());
                }
            }
        }
    }

    /* renamed from: rh0.k$f */
    /* loaded from: classes7.dex */
    public class f extends AbstractC19160a {

        /* renamed from: b */
        final /* synthetic */ boolean f123048b;

        f(boolean z11) {
            this.f123048b = z11;
        }

        @Override // p171fx.AbstractC19160a
        /* renamed from: a */
        public void mo98440a(List list) {
            try {
                AbstractC23309i.m121204Mn(this.f123048b);
                AbstractC23309i.m121241Nn(this.f123048b);
                AbstractC19164e.m100540z(this.f123048b);
                AbstractC19164e.m100510B(this.f123048b);
                if (this.f123048b) {
                    AbstractC19164e.m100527m(MainApplication.getAppContext(), C25801i.m132957d().m132960c(), AbstractC7306b.f40031a, AbstractC7306b.f40033c, AbstractC26684e.f126413f);
                    AbstractC23309i.m121391Rp(System.currentTimeMillis());
                } else {
                    AbstractC19164e.m100524j();
                    AbstractC23041d2.m118210i(new File(AbstractC23466c.m123206i("/zalo/zam/")));
                    AbstractC23309i.m121391Rp(0L);
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: e */
    public static boolean m132965e() {
        return C23476m.m123248f();
    }

    /* renamed from: f */
    public static void m132966f(boolean z11) {
        C19168i.m100579c(new f(z11));
    }

    /* renamed from: g */
    public static C23470g.c m132967g() {
        return f123034g;
    }

    /* renamed from: h */
    public static C3150e.b m132968h() {
        return f123033f;
    }

    /* renamed from: i */
    private static boolean m132969i() {
        return AbstractC19444a.m101693a();
    }

    /* renamed from: j */
    public static /* synthetic */ void m132970j(long j11, String str) {
        BlockCanaryANR blockCanaryANR = new BlockCanaryANR(str);
        blockCanaryANR.setStackTrace(new StackTraceElement[0]);
        AbstractC22490a.m116282e(blockCanaryANR);
        AbstractC20887g.m109237o(120010);
    }

    /* renamed from: k */
    public static void m132971k(int i11, int i12, String str, int i13, String str2) {
        boolean z11;
        if (!C23476m.m123248f()) {
            return;
        }
        if (C23470g.m123227f() && C23470g.m123225c().m123231e()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C19168i.m100579c(new d(z11, System.currentTimeMillis(), i11, i12, str, i13, str2));
        List list = f123032e;
        if (list.size() > 50 || (!list.isEmpty() && System.currentTimeMillis() - AbstractC19166g.m100560j() > 3000)) {
            C19168i.m100580d(new e(), list);
        }
    }

    /* renamed from: l */
    public static void m132972l(String str, long j11) {
        boolean z11;
        if (TextUtils.isEmpty(str) || Debug.isDebuggerConnected() || !C23476m.m123248f()) {
            return;
        }
        if (C23470g.m123227f() && C23470g.m123225c().m123231e()) {
            z11 = true;
        } else {
            z11 = false;
        }
        C19168i.m100579c(new b(z11, System.currentTimeMillis(), j11, str, m132969i()));
        List list = f123031d;
        if (list.size() > 199 || (!list.isEmpty() && System.currentTimeMillis() - AbstractC19166g.m100554d() > 3000)) {
            C19168i.m100580d(new c(), list);
        }
    }
}

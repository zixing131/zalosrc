package tn;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.zing.zalo.zinstant.AbstractC17148f0;
import com.zing.zalo.zinstant.exception.ZinstantException;
import hk0.InterfaceC20083a;
import ik0.InterfaceC20578a0;
import java.util.concurrent.atomic.AtomicInteger;
import lk0.InterfaceC22508f;
import me0.AbstractC23136l9;

/* renamed from: tn.i0 */
/* loaded from: classes4.dex */
public class HandlerThreadC26753i0 extends HandlerThread {

    /* renamed from: p */
    private Handler f126914p;

    /* renamed from: q */
    private c f126915q;

    /* renamed from: r */
    private InterfaceC22508f f126916r;

    /* renamed from: s */
    private int f126917s;

    /* renamed from: t */
    private final AtomicInteger f126918t;

    /* renamed from: u */
    private int f126919u;

    /* renamed from: v */
    private String f126920v;

    /* renamed from: w */
    private final InterfaceC20083a f126921w;

    /* renamed from: tn.i0$a */
    /* loaded from: classes4.dex */
    class a implements InterfaceC20083a {
        a() {
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: a */
        public void mo15331a(InterfaceC20578a0 interfaceC20578a0) {
            HandlerThreadC26753i0.this.m137703l(interfaceC20578a0);
        }

        @Override // hk0.InterfaceC20083a
        /* renamed from: c */
        public void mo15332c(Exception exc) {
            if (HandlerThreadC26753i0.this.m137700h(exc)) {
                HandlerThreadC26753i0.this.m137704m();
            } else {
                HandlerThreadC26753i0.this.m137702k();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tn.i0$b */
    /* loaded from: classes4.dex */
    public class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            HandlerThreadC26753i0.this.m137699g(message);
        }
    }

    /* renamed from: tn.i0$c */
    /* loaded from: classes4.dex */
    public interface c {
        /* renamed from: a */
        void mo137711a(String str);

        /* renamed from: b */
        void mo137712b(String str, InterfaceC20578a0 interfaceC20578a0);
    }

    public HandlerThreadC26753i0(String str) {
        super("Z:" + str);
        this.f126917s = AbstractC23136l9.m118722k0();
        this.f126918t = new AtomicInteger(0);
        this.f126919u = 3;
        this.f126920v = "";
        this.f126921w = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public void m137699g(Message message) {
        if (message.what == 1) {
            m137701i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public boolean m137700h(Exception exc) {
        if (!(exc instanceof ZinstantException) || !((ZinstantException) exc).m91678c() || this.f126918t.get() >= this.f126919u) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m137701i() {
        if (this.f126916r != null && this.f126917s > 0) {
            this.f126918t.incrementAndGet();
            AbstractC17148f0.m91694m(this.f126916r, this.f126917s, this.f126921w);
        } else {
            m137702k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m137702k() {
        c cVar = this.f126915q;
        if (cVar != null) {
            cVar.mo137711a(this.f126920v);
        }
        quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m137703l(InterfaceC20578a0 interfaceC20578a0) {
        c cVar = this.f126915q;
        if (cVar != null) {
            if (interfaceC20578a0 != null) {
                cVar.mo137712b(this.f126920v, interfaceC20578a0);
            } else {
                cVar.mo137711a(this.f126920v);
            }
        }
        quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m137704m() {
        Handler m137705f = m137705f();
        if (m137705f != null) {
            m137705f.removeMessages(1);
            m137705f.sendEmptyMessage(1);
        } else {
            m137702k();
        }
    }

    /* renamed from: f */
    public Handler m137705f() {
        if (this.f126914p == null) {
            this.f126914p = new b(getLooper());
        }
        return this.f126914p;
    }

    /* renamed from: j */
    public void m137706j(InterfaceC22508f interfaceC22508f) {
        this.f126916r = interfaceC22508f;
        m137704m();
    }

    /* renamed from: n */
    public void m137707n(String str) {
        this.f126920v = str;
    }

    /* renamed from: o */
    public void m137708o(c cVar) {
        this.f126915q = cVar;
    }

    /* renamed from: p */
    public void m137709p(int i11) {
        if (i11 > 0) {
            this.f126919u = i11;
        }
    }

    /* renamed from: q */
    public void m137710q(int i11) {
        this.f126917s = i11;
    }

    @Override // android.os.HandlerThread
    public boolean quit() {
        Handler m137705f = m137705f();
        if (m137705f != null) {
            m137705f.removeMessages(1);
        }
        return super.quit();
    }
}

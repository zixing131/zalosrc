package th0;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import com.zing.zalo.zbrowser.cache.C16898b;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p664y.AbstractC30228a;
import p665y0.C30243e;
import th0.AbstractC26698d;

/* renamed from: th0.e */
/* loaded from: classes7.dex */
public class C26699e {

    /* renamed from: p */
    private static final String f126561p = "e";

    /* renamed from: f */
    private HandlerThread f126567f;

    /* renamed from: g */
    private Handler f126568g;

    /* renamed from: j */
    private String f126571j;

    /* renamed from: k */
    private AbstractC26698d.f f126572k;

    /* renamed from: l */
    private g f126573l;

    /* renamed from: a */
    private C26697c f126562a = null;

    /* renamed from: b */
    private int f126563b = 10;

    /* renamed from: d */
    private final Object f126565d = new Object();

    /* renamed from: e */
    private int f126566e = 1000;

    /* renamed from: n */
    private final Object f126575n = new Object();

    /* renamed from: o */
    private AbstractC26698d.e f126576o = new a();

    /* renamed from: c */
    private AtomicBoolean f126564c = new AtomicBoolean(false);

    /* renamed from: m */
    private Hashtable f126574m = new Hashtable();

    /* renamed from: i */
    private C30243e f126570i = new C30243e(this.f126563b);

    /* renamed from: h */
    private SparseArray f126569h = new SparseArray();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th0.e$a */
    /* loaded from: classes7.dex */
    public class a implements AbstractC26698d.e {
        a() {
        }

        @Override // th0.AbstractC26698d.e
        /* renamed from: a */
        public void mo137225a(String str) {
            C26699e.this.f126570i.m149141f(str);
            synchronized (C26699e.this.f126575n) {
                try {
                    ArrayList arrayList = (ArrayList) C26699e.this.f126574m.remove(str);
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AbstractC30228a.m149044a(it.next());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // th0.AbstractC26698d.e
        /* renamed from: b */
        public void mo137226b(String str) {
        }

        @Override // th0.AbstractC26698d.e
        /* renamed from: c */
        public void mo137227c(String str, int i11, boolean z11) {
            if (i11 >= 100 || z11) {
                synchronized (C26699e.this.f126575n) {
                    try {
                        ArrayList arrayList = (ArrayList) C26699e.this.f126574m.remove(str);
                        if (arrayList == null) {
                            return;
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AbstractC30228a.m149044a(it.next());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th0.e$b */
    /* loaded from: classes7.dex */
    public class b extends Handler {

        /* renamed from: a */
        final /* synthetic */ Context f126578a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Looper looper, Context context) {
            super(looper);
            this.f126578a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i11 = message.what;
            if (i11 != 1) {
                if (i11 == 2) {
                    Object obj = message.obj;
                    if (obj instanceof C26696b) {
                        C26696b c26696b = (C26696b) obj;
                        if (C26699e.this.f126569h.get(c26696b.hashCode()) == null) {
                            C26699e.this.f126569h.put(c26696b.hashCode(), c26696b.f126497a);
                        }
                        if (!C26699e.this.f126568g.hasMessages(1)) {
                            C26699e.this.f126568g.sendEmptyMessageDelayed(1, C26699e.this.f126566e);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            int size = C26699e.this.f126569h.size();
            if (size > 0) {
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < size; i12++) {
                    String str = (String) C26699e.this.f126569h.valueAt(i12);
                    if (str != null) {
                        arrayList.add(str);
                        C26699e.this.f126570i.m149140e(str, "");
                        AbstractC20110a.m104543l(C26699e.f126561p).mo104548a("request jumpLink: %s", str);
                    }
                }
                C26697c m137251r = C26699e.this.m137251r();
                if (m137251r != null) {
                    m137251r.m137182P(arrayList, C26699e.this.f126576o, null, this.f126578a);
                }
            }
            C26699e.this.f126569h.clear();
        }
    }

    /* renamed from: th0.e$c */
    /* loaded from: classes7.dex */
    public class c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Context f126580p;

        c(Context context) {
            this.f126580p = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C26699e.this.f126565d) {
                C26699e.this.m137249x(this.f126580p);
            }
        }
    }

    /* renamed from: th0.e$d */
    /* loaded from: classes7.dex */
    public class d implements g.a {

        /* renamed from: a */
        final /* synthetic */ Context f126582a;

        d(Context context) {
            this.f126582a = context;
        }

        @Override // th0.C26699e.g.a
        /* renamed from: a */
        public void mo137258a(int i11, String str) {
            AbstractC20110a.m104543l(C26699e.f126561p).mo104551d("request jump preload fail: %d - %s", Integer.valueOf(i11), str);
        }

        @Override // th0.C26699e.g.a
        /* renamed from: b */
        public void onSuccess(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    C26699e.this.f126573l.mo137260a(jSONObject.toString());
                } catch (Exception unused) {
                    return;
                }
            }
            C16898b m90364d = C16898b.m90364d(jSONObject);
            C26699e.this.f126562a = new C26697c(m90364d, C26699e.this.f126571j, C26699e.this.f126573l, this.f126582a);
            C26699e.this.f126562a.m137208I(C26699e.this.f126572k);
            C26699e.this.f126564c.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th0.e$e */
    /* loaded from: classes7.dex */
    public class e implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Context f126584p;

        e(Context context) {
            this.f126584p = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C26699e.this.f126565d) {
                try {
                    if (C26699e.this.f126562a != null) {
                        C26699e.this.f126562a.m137180L(this.f126584p);
                        C26699e.this.f126562a.m137213p();
                    }
                    C26699e.this.f126562a = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: th0.e$f */
    /* loaded from: classes7.dex */
    public class f implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f126586p;

        f(String str, AbstractC26698d.g gVar) {
            this.f126586p = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C26699e.this.m137254v(this.f126586p) || C26699e.this.m137253u(this.f126586p)) {
                    return;
                }
                C26699e.this.f126568g.sendMessage(C26699e.this.f126568g.obtainMessage(2, new C26696b(this.f126586p, null)));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: th0.e$g */
    /* loaded from: classes7.dex */
    public interface g {

        /* renamed from: th0.e$g$a */
        /* loaded from: classes7.dex */
        public interface a {
            /* renamed from: a */
            void mo137258a(int i11, String str);

            void onSuccess(Object obj);
        }

        /* renamed from: a */
        void mo137260a(String str);

        /* renamed from: b */
        void mo137261b(String str, a aVar);

        /* renamed from: c */
        String mo137262c();
    }

    public C26699e(g gVar, String str, Context context) {
        this.f126573l = gVar;
        this.f126571j = str;
        HandlerThread handlerThread = new HandlerThread(f126561p);
        this.f126567f = handlerThread;
        handlerThread.start();
        this.f126568g = new b(this.f126567f.getLooper(), context);
        m137248t(context);
    }

    /* renamed from: t */
    private void m137248t(Context context) {
        try {
            this.f126570i.m149138c();
            String mo137262c = this.f126573l.mo137262c();
            if (TextUtils.isEmpty(mo137262c)) {
                m137250q(new c(context));
                return;
            }
            C16898b m90363c = C16898b.m90363c(mo137262c);
            if (m90363c == null) {
                m90363c = C16898b.f86045D;
            }
            C26697c c26697c = new C26697c(m90363c, this.f126571j, this.f126573l, context);
            this.f126562a = c26697c;
            c26697c.m137208I(this.f126572k);
            this.f126564c.set(true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x */
    public void m137249x(Context context) {
        this.f126573l.mo137261b("https://media.zalo.me/", new d(context));
    }

    protected void finalize() {
        HandlerThread handlerThread = this.f126567f;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        super.finalize();
    }

    /* renamed from: q */
    public void m137250q(Runnable runnable) {
        Handler handler = this.f126568g;
        if (handler != null) {
            handler.post(runnable);
        }
    }

    /* renamed from: r */
    public C26697c m137251r() {
        return this.f126562a;
    }

    /* renamed from: s */
    public String m137252s(String str) {
        C26697c m137251r = m137251r();
        if (m137251r != null) {
            return m137251r.m137181O(str).toString();
        }
        return null;
    }

    /* renamed from: u */
    public boolean m137253u(String str) {
        if (this.f126570i.m149139d(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public boolean m137254v(String str) {
        try {
            C26697c m137251r = m137251r();
            if (m137251r != null) {
                return m137251r.m137214s().m90369h(str);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: w */
    public void m137255w(AbstractC26698d.g gVar, String str) {
        if (this.f126564c.get() && !m137254v(str)) {
            return;
        }
        m137250q(new f(str, gVar));
    }

    /* renamed from: y */
    public void m137256y(Context context) {
        m137250q(new e(context));
    }

    /* renamed from: z */
    public void m137257z(JSONObject jSONObject, Context context) {
        C26697c c26697c = this.f126562a;
        if (c26697c != null) {
            c26697c.m137183Q(jSONObject, context);
        }
    }
}

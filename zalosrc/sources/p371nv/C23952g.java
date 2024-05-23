package p371nv;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import bn0.AbstractC2933b;
import fn0.AbstractC19074t;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import mm0.AbstractC23350e;
import pm0.C24848g0;
import vg.C28121l5;

/* renamed from: nv.g */
/* loaded from: classes.dex */
public final class C23952g {

    /* renamed from: e */
    private static Handler f115930e;

    /* renamed from: a */
    public static final C23952g f115926a = new C23952g();

    /* renamed from: b */
    private static final ReentrantLock f115927b = new ReentrantLock();

    /* renamed from: c */
    private static Hashtable f115928c = new Hashtable();

    /* renamed from: d */
    private static Hashtable f115929d = new Hashtable();

    /* renamed from: f */
    private static Handler.Callback f115931f = new b();

    /* renamed from: nv.g$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final int f115932a;

        /* renamed from: b */
        private final String f115933b;

        /* renamed from: c */
        private final String f115934c;

        /* renamed from: d */
        private final Throwable f115935d;

        public a(int i11, String str, String str2, Throwable th2) {
            this.f115932a = i11;
            this.f115933b = str;
            this.f115934c = str2;
            this.f115935d = th2;
        }

        /* renamed from: a */
        public final String m125351a() {
            return this.f115934c;
        }

        /* renamed from: b */
        public final int m125352b() {
            return this.f115932a;
        }

        /* renamed from: c */
        public final Throwable m125353c() {
            return this.f115935d;
        }

        /* renamed from: d */
        public final String m125354d() {
            return this.f115933b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f115932a == aVar.f115932a && AbstractC19074t.m100204b(this.f115933b, aVar.f115933b) && AbstractC19074t.m100204b(this.f115934c, aVar.f115934c) && AbstractC19074t.m100204b(this.f115935d, aVar.f115935d);
        }

        public int hashCode() {
            int i11 = this.f115932a * 31;
            String str = this.f115933b;
            int hashCode = (i11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f115934c;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Throwable th2 = this.f115935d;
            return hashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        public String toString() {
            return "MessageLogData(priority=" + this.f115932a + ", tag=" + this.f115933b + ", message=" + this.f115934c + ", t=" + this.f115935d + ")";
        }
    }

    /* renamed from: nv.g$b */
    /* loaded from: classes.dex */
    public static final class b implements Handler.Callback {
        b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i11;
            boolean z11;
            Message message2;
            AbstractC23950e c23951f;
            C28121l5 c28121l5;
            Throwable th2;
            Throwable th3;
            AbstractC19074t.m100208f(message, "msg");
            try {
                i11 = message.what;
                z11 = false;
                message2 = null;
                th3 = null;
                th2 = null;
            } catch (Exception unused) {
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                Handler handler = C23952g.f115930e;
                                if (handler != null) {
                                    handler.removeMessages(5);
                                }
                                Handler handler2 = C23952g.f115930e;
                                if (handler2 != null) {
                                    handler2.sendEmptyMessageDelayed(5, 60000L);
                                }
                                for (AbstractC23950e abstractC23950e : C23952g.f115928c.values()) {
                                    if (abstractC23950e != null) {
                                        abstractC23950e.mo125331e();
                                    }
                                }
                            }
                        } else {
                            for (AbstractC23950e abstractC23950e2 : C23952g.f115928c.values()) {
                                if (abstractC23950e2 != null) {
                                    abstractC23950e2.mo125331e();
                                }
                            }
                            Object obj = message.obj;
                            if (obj instanceof Condition) {
                                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type java.util.concurrent.locks.Condition");
                                Condition condition = (Condition) obj;
                                ReentrantLock reentrantLock = C23952g.f115927b;
                                reentrantLock.lock();
                                try {
                                    condition.signalAll();
                                    C24848g0 c24848g0 = C24848g0.f119245a;
                                    reentrantLock.unlock();
                                } catch (Throwable th4) {
                                    reentrantLock.unlock();
                                    throw th4;
                                }
                            }
                        }
                    } else {
                        int i12 = message.arg1;
                        if (message.arg2 == 1) {
                            z11 = true;
                        }
                        Object obj2 = message.obj;
                        AbstractC23950e abstractC23950e3 = (AbstractC23950e) C23952g.f115928c.get(Integer.valueOf(i12));
                        if (abstractC23950e3 instanceof C23946a) {
                            AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.String");
                            File file = new File((String) obj2);
                            if (file.exists() && file.isFile()) {
                                FileInputStream fileInputStream = new FileInputStream(file);
                                try {
                                    String name = file.getName();
                                    AbstractC19074t.m100207e(name, "file.name");
                                    ((C23946a) abstractC23950e3).m125322k(fileInputStream, name);
                                    C24848g0 c24848g02 = C24848g0.f119245a;
                                    AbstractC2933b.m13890a(fileInputStream, null);
                                    if (z11) {
                                        file.delete();
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                } else {
                    int i13 = message.arg1;
                    AbstractC23950e abstractC23950e4 = (AbstractC23950e) C23952g.f115928c.get(Integer.valueOf(i13));
                    if (abstractC23950e4 instanceof C23951f) {
                        int i14 = message.arg2;
                        Bundle data = message.getData();
                        String string = data.getString("TAG");
                        String string2 = data.getString("MESSAGE");
                        Serializable serializable = data.getSerializable("THROWABLE");
                        if (serializable instanceof Throwable) {
                            th3 = (Throwable) serializable;
                        }
                        ((C23951f) abstractC23950e4).m125335m(i14, string, string2, th3);
                    } else {
                        C28121l5 c28121l52 = (C28121l5) C23952g.f115929d.get(Integer.valueOf(i13));
                        if (c28121l52 != null) {
                            Serializable serializable2 = message.getData().getSerializable("THROWABLE");
                            if (serializable2 instanceof Throwable) {
                                th2 = (Throwable) serializable2;
                            }
                            c28121l52.m141607b(new a(message.arg2, message.getData().getString("TAG"), message.getData().getString("MESSAGE"), th2));
                        }
                    }
                }
                return true;
            }
            int i15 = message.arg1;
            Object obj3 = message.obj;
            AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            if (C23952g.f115928c.containsKey(Integer.valueOf(i15))) {
                AbstractC23350e.m122772b("logger %d has been initiated", Integer.valueOf(i15));
                return true;
            }
            File file2 = new File(str);
            String string3 = message.getData().getString("secretKey");
            try {
                if (i15 != 0 && i15 != 4) {
                    c23951f = new C23946a(file2, string3, 524288L);
                } else {
                    c23951f = new C23951f(file2, string3, 2097152L);
                }
                C23952g.f115928c.put(Integer.valueOf(i15), c23951f);
                if ((c23951f instanceof C23951f) && (c28121l5 = (C28121l5) C23952g.f115929d.remove(Integer.valueOf(i15))) != null) {
                    List<a> m141606a = c28121l5.m141606a();
                    int size = m141606a.size();
                    for (a aVar : m141606a) {
                        ((C23951f) c23951f).m125335m(aVar.m125352b(), aVar.m125354d(), aVar.m125351a(), aVar.m125353c());
                    }
                    ((C23951f) c23951f).m125335m(4, null, "finish flush " + size + " logs from queue to logger", null);
                    c23951f.mo125331e();
                }
            } catch (IOException unused2) {
                AbstractC23350e.m122772b("logger %d delay init", Integer.valueOf(i15));
                Handler handler3 = C23952g.f115930e;
                if (handler3 != null) {
                    message2 = handler3.obtainMessage(message.what, message.arg1, message.arg2, message.obj);
                }
                if (message2 != null) {
                    message2.setData(message.getData());
                    Handler handler4 = C23952g.f115930e;
                    if (handler4 != null) {
                        handler4.sendMessageDelayed(message2, 60000L);
                    }
                }
            }
            return true;
        }
    }

    private C23952g() {
    }

    /* renamed from: e */
    private final void m125340e() {
        if (f115930e == null) {
            ReentrantLock reentrantLock = f115927b;
            reentrantLock.lock();
            try {
                if (f115930e == null) {
                    HandlerThread handlerThread = new HandlerThread("Z:file-logging");
                    handlerThread.start();
                    Handler handler = new Handler(handlerThread.getLooper(), f115931f);
                    f115930e = handler;
                    handler.sendEmptyMessageDelayed(5, 60000L);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    /* renamed from: f */
    public static final void m125341f(long j11) {
        Message message;
        try {
            if (f115930e == null) {
                return;
            }
            ReentrantLock reentrantLock = f115927b;
            Condition newCondition = reentrantLock.newCondition();
            Handler handler = f115930e;
            if (handler != null) {
                message = handler.obtainMessage(4);
            } else {
                message = null;
            }
            if (message != null) {
                message.obj = newCondition;
                reentrantLock.lock();
                try {
                    Handler handler2 = f115930e;
                    if (handler2 != null) {
                        handler2.sendMessage(message);
                    }
                    newCondition.await(j11, TimeUnit.MILLISECONDS);
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    private final String m125342g(int i11) {
        return i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "other" : "zdb" : "zplayer" : "crash" : "anr" : "general_log";
    }

    /* renamed from: h */
    public static final void m125343h(int i11, String str, String str2, Throwable th2) {
        m125347l(0, i11, str, str2, th2);
    }

    /* renamed from: i */
    public static final void m125344i(String str) {
        m125343h(4, null, str, null);
    }

    /* renamed from: j */
    public static final void m125345j(String str, String str2) {
        m125343h(4, str, str2, null);
    }

    /* renamed from: k */
    public static final void m125346k(int i11, String str, boolean z11) {
        Message message;
        Handler handler;
        AbstractC19074t.m100208f(str, "path");
        Handler handler2 = f115930e;
        if (handler2 != null) {
            message = handler2.obtainMessage(3, i11, z11 ? 1 : 0, str);
        } else {
            message = null;
        }
        if (message != null && (handler = f115930e) != null) {
            handler.sendMessage(message);
        }
    }

    /* renamed from: l */
    public static final void m125347l(int i11, int i12, String str, String str2, Throwable th2) {
        Message message;
        if (f115930e != null) {
            if (f115928c.containsKey(Integer.valueOf(i11)) || f115929d.containsKey(Integer.valueOf(i11))) {
                Handler handler = f115930e;
                if (handler != null) {
                    message = handler.obtainMessage(2, i11, i12);
                } else {
                    message = null;
                }
                if (message != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("TAG", str);
                    bundle.putString("MESSAGE", str2);
                    bundle.putSerializable("THROWABLE", th2);
                    message.setData(bundle);
                    Handler handler2 = f115930e;
                    if (handler2 != null) {
                        handler2.sendMessage(message);
                    }
                }
            }
        }
    }

    /* renamed from: n */
    private final void m125348n(int i11, String str, String str2) {
        Message message;
        m125340e();
        if (f115928c.containsKey(Integer.valueOf(i11))) {
            AbstractC23350e.m122777g("logger %d has been initiated", Integer.valueOf(i11));
            return;
        }
        Handler handler = f115930e;
        if (handler != null) {
            message = handler.obtainMessage(1, i11, 0, str);
        } else {
            message = null;
        }
        if (message != null) {
            Bundle bundle = new Bundle();
            bundle.putString("secretKey", str2);
            message.setData(bundle);
            Handler handler2 = f115930e;
            if (handler2 != null) {
                handler2.sendMessage(message);
            }
        }
    }

    /* renamed from: o */
    public static final void m125349o(String str, String str2) {
        AbstractC19074t.m100208f(str, "logFolderPath");
        AbstractC19074t.m100208f(str2, "secretKey");
        File file = new File(str);
        C23952g c23952g = f115926a;
        c23952g.m125348n(0, file.getPath() + "/" + c23952g.m125342g(0), str2);
        c23952g.m125348n(1, file.getPath() + "/" + c23952g.m125342g(1), str2);
        c23952g.m125348n(2, file.getPath() + "/" + c23952g.m125342g(2), str2);
        c23952g.m125348n(3, file.getPath() + "/" + c23952g.m125342g(3), str2);
        c23952g.m125348n(4, file.getPath() + "/" + c23952g.m125342g(4), str2);
    }

    /* renamed from: m */
    public final void m125350m(int i11) {
        f115929d.put(0, new C28121l5(i11));
        m125340e();
    }
}

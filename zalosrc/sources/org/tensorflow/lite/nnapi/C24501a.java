package org.tensorflow.lite.nnapi;

import org.tensorflow.lite.InterfaceC24497c;
import org.tensorflow.lite.InterfaceC24499f;
import org.tensorflow.lite.TensorFlowLite;

/* renamed from: org.tensorflow.lite.nnapi.a */
/* loaded from: classes7.dex */
public class C24501a implements InterfaceC24497c, AutoCloseable {

    /* renamed from: p */
    private a f118065p;

    /* renamed from: q */
    private b f118066q;

    /* renamed from: r */
    private boolean f118067r;

    /* renamed from: org.tensorflow.lite.nnapi.a$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* renamed from: a */
        private int f118068a = -1;

        /* renamed from: b */
        private String f118069b = null;

        /* renamed from: c */
        private String f118070c = null;

        /* renamed from: d */
        private String f118071d = null;

        /* renamed from: e */
        private Integer f118072e = null;

        /* renamed from: f */
        private Boolean f118073f = null;

        /* renamed from: g */
        private Boolean f118074g = null;

        /* renamed from: h */
        private long f118075h = 0;

        /* renamed from: a */
        public String m127835a() {
            return this.f118069b;
        }

        /* renamed from: b */
        public boolean m127836b() {
            Boolean bool = this.f118074g;
            if (bool != null && bool.booleanValue()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public String m127837c() {
            return this.f118070c;
        }

        /* renamed from: d */
        public int m127838d() {
            return this.f118068a;
        }

        /* renamed from: e */
        public int m127839e() {
            Integer num = this.f118072e;
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        /* renamed from: f */
        public String m127840f() {
            return this.f118071d;
        }

        /* renamed from: g */
        public long m127841g() {
            return this.f118075h;
        }

        /* renamed from: h */
        public Boolean m127842h() {
            return this.f118073f;
        }
    }

    /* renamed from: org.tensorflow.lite.nnapi.a$b */
    /* loaded from: classes7.dex */
    public interface b extends InterfaceC24497c, AutoCloseable {
        @Override // java.lang.AutoCloseable
        void close();
    }

    public C24501a(a aVar) {
        TensorFlowLite.m127818a();
        this.f118065p = aVar;
    }

    /* renamed from: b */
    private void m127833b() {
        String str;
        if (this.f118066q == null) {
            if (this.f118067r) {
                str = "Should not access delegate after delegate has been closed.";
            } else {
                str = "Should not access delegate before interpreter has been constructed.";
            }
            throw new IllegalStateException(str);
        }
    }

    @Override // org.tensorflow.lite.InterfaceC24497c
    /* renamed from: a */
    public long mo127820a() {
        m127833b();
        return this.f118066q.mo127820a();
    }

    /* renamed from: c */
    public void m127834c(InterfaceC24499f interfaceC24499f) {
        this.f118066q = interfaceC24499f.m127831a(this.f118065p);
        this.f118067r = true;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        b bVar = this.f118066q;
        if (bVar != null) {
            bVar.close();
            this.f118066q = null;
        }
    }

    public C24501a() {
        this(new a());
    }
}

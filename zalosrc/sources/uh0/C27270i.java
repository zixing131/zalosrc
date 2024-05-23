package uh0;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;

/* renamed from: uh0.i */
/* loaded from: classes7.dex */
public class C27270i {

    /* renamed from: l */
    private static final c f128279l = new a();

    /* renamed from: a */
    private final SSLEngine f128280a;

    /* renamed from: b */
    private final ExecutorService f128281b;

    /* renamed from: c */
    private final ByteBuffer f128282c;

    /* renamed from: d */
    private final ByteBuffer f128283d;

    /* renamed from: e */
    private final ByteBuffer f128284e;

    /* renamed from: f */
    private final ByteBuffer f128285f;

    /* renamed from: g */
    private final ByteBuffer f128286g;

    /* renamed from: h */
    private final SocketChannel f128287h;

    /* renamed from: i */
    private boolean f128288i = false;

    /* renamed from: j */
    private boolean f128289j = false;

    /* renamed from: k */
    private c f128290k;

    /* renamed from: uh0.i$a */
    /* loaded from: classes7.dex */
    static class a implements c {
        a() {
        }

        @Override // uh0.C27270i.c
        /* renamed from: a */
        public void mo139600a() {
        }

        @Override // uh0.C27270i.c
        /* renamed from: b */
        public void mo139601b() {
        }

        @Override // uh0.C27270i.c
        /* renamed from: c */
        public void mo139602c(byte[] bArr) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uh0.i$b */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f128291a;

        /* renamed from: b */
        static final /* synthetic */ int[] f128292b;

        static {
            int[] iArr = new int[SSLEngineResult.Status.values().length];
            f128292b = iArr;
            try {
                iArr[SSLEngineResult.Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f128292b[SSLEngineResult.Status.BUFFER_UNDERFLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f128292b[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f128292b[SSLEngineResult.Status.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SSLEngineResult.HandshakeStatus.values().length];
            f128291a = iArr2;
            try {
                iArr2[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f128291a[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f128291a[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f128291a[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f128291a[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* renamed from: uh0.i$c */
    /* loaded from: classes7.dex */
    public interface c {
        /* renamed from: a */
        void mo139600a();

        /* renamed from: b */
        void mo139601b();

        /* renamed from: c */
        void mo139602c(byte[] bArr);
    }

    public C27270i(SocketChannel socketChannel, SSLContext sSLContext, ExecutorService executorService, int i11, C27267f c27267f) {
        SSLEngine createSSLEngine = sSLContext.createSSLEngine(c27267f.f128233c, c27267f.f128234d);
        createSSLEngine.setUseClientMode(true);
        createSSLEngine.beginHandshake();
        this.f128280a = createSSLEngine;
        this.f128287h = socketChannel;
        this.f128281b = executorService;
        this.f128286g = ByteBuffer.allocate(i11);
        int packetBufferSize = createSSLEngine.getSession().getPacketBufferSize();
        this.f128282c = ByteBuffer.allocate(packetBufferSize);
        this.f128284e = ByteBuffer.allocate(packetBufferSize);
        int max = Math.max(createSSLEngine.getSession().getApplicationBufferSize(), i11);
        ByteBuffer allocate = ByteBuffer.allocate(max);
        this.f128283d = allocate;
        this.f128285f = ByteBuffer.allocate(max);
        allocate.limit(0);
        this.f128290k = f128279l;
    }

    /* renamed from: b */
    private void m139603b() {
        do {
        } while (m139606f());
    }

    /* renamed from: c */
    private int m139604c() {
        this.f128286g.clear();
        this.f128286g.limit(this.f128283d.remaining());
        int read = this.f128287h.read(this.f128286g);
        if (read == -1) {
            return -1;
        }
        if (read == 0) {
            return 0;
        }
        this.f128286g.flip();
        this.f128283d.put(this.f128286g);
        return read;
    }

    /* renamed from: d */
    private boolean m139605d() {
        int remaining = this.f128284e.remaining();
        if (remaining == 0) {
            return true;
        }
        if (remaining == this.f128287h.write(this.f128284e)) {
            this.f128284e.compact();
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private synchronized boolean m139606f() {
        boolean z11;
        try {
            int i11 = b.f128291a[this.f128280a.getHandshakeStatus().ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                throw new IllegalStateException("FINISHED");
                            }
                        } else {
                            Runnable delegatedTask = this.f128280a.getDelegatedTask();
                            if (delegatedTask != null) {
                                ExecutorService executorService = this.f128281b;
                                if (executorService != null) {
                                    executorService.execute(delegatedTask);
                                } else {
                                    delegatedTask.run();
                                }
                            }
                            return false;
                        }
                    } else if (!m139607j()) {
                        return false;
                    }
                } else if (!m139608k()) {
                    return false;
                }
                return true;
            }
            if (this.f128282c.position() > 0) {
                z11 = m139608k();
            } else {
                z11 = false;
            }
            if (this.f128283d.position() > 0) {
                z11 |= m139607j();
            }
            if (!z11 && this.f128288i && this.f128289j) {
                this.f128289j = false;
                this.f128290k.mo139601b();
            }
            return z11;
        } finally {
        }
    }

    /* renamed from: j */
    private boolean m139607j() {
        this.f128283d.flip();
        SSLEngineResult unwrap = this.f128280a.unwrap(this.f128283d, this.f128285f);
        this.f128283d.compact();
        int i11 = b.f128292b[unwrap.getStatus().ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return false;
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    this.f128290k.mo139600a();
                    return false;
                }
            } else {
                throw new IllegalStateException("failed to unwrap");
            }
        } else if (this.f128285f.position() > 0) {
            this.f128285f.flip();
            byte[] bArr = new byte[this.f128285f.remaining()];
            this.f128285f.get(bArr);
            this.f128290k.mo139602c(bArr);
            this.f128285f.compact();
        } else if (unwrap.getHandshakeStatus() == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            return false;
        }
        if (unwrap.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.FINISHED) {
            return true;
        }
        if (!this.f128288i) {
            this.f128288i = true;
            this.f128290k.mo139601b();
        }
        return false;
    }

    /* renamed from: k */
    private boolean m139608k() {
        this.f128282c.flip();
        SSLEngineResult wrap = this.f128280a.wrap(this.f128282c, this.f128284e);
        this.f128282c.compact();
        int i11 = b.f128292b[wrap.getStatus().ordinal()];
        if (i11 != 1) {
            if (i11 != 3) {
                if (i11 == 4) {
                    this.f128290k.mo139600a();
                    return false;
                }
            } else {
                throw new IllegalStateException("failed to wrap");
            }
        } else if (this.f128284e.position() > 0) {
            this.f128284e.flip();
            m139605d();
        }
        if (wrap.getHandshakeStatus() != SSLEngineResult.HandshakeStatus.FINISHED) {
            return true;
        }
        if (!this.f128288i) {
            this.f128288i = true;
            this.f128290k.mo139601b();
        }
        return false;
    }

    /* renamed from: a */
    public void m139609a() {
        if (this.f128284e.position() > 0 && !m139605d()) {
            return;
        }
        m139604c();
        m139603b();
    }

    /* renamed from: e */
    public boolean m139610e() {
        return this.f128289j;
    }

    /* renamed from: g */
    public void m139611g() {
        this.f128282c.clear();
        this.f128289j = true;
    }

    /* renamed from: h */
    public void m139612h(ByteBuffer byteBuffer) {
        this.f128282c.put(byteBuffer);
    }

    /* renamed from: i */
    public void m139613i(c cVar) {
        if (cVar == null) {
            cVar = f128279l;
        }
        this.f128290k = cVar;
    }
}

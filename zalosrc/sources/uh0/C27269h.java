package uh0;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import javax.net.ssl.SSLContext;
import uh0.C27265d;
import uh0.C27266e;
import uh0.C27270i;

/* renamed from: uh0.h */
/* loaded from: classes7.dex */
public class C27269h {

    /* renamed from: a */
    private final Selector f128242a;

    /* renamed from: b */
    private final ExecutorService f128243b;

    /* renamed from: c */
    private final SSLContext f128244c;

    /* renamed from: d */
    private final C27263b f128245d;

    /* renamed from: e */
    private int f128246e;

    /* renamed from: f */
    private final LinkedBlockingDeque f128247f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uh0.h$a */
    /* loaded from: classes7.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C27269h.this.m139595n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: uh0.h$b */
    /* loaded from: classes7.dex */
    public class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ C27266e.a f128249p;

        /* renamed from: q */
        final /* synthetic */ String f128250q;

        /* renamed from: r */
        final /* synthetic */ Map f128251r;

        b(C27266e.a aVar, String str, Map map) {
            this.f128249p = aVar;
            this.f128250q = str;
            this.f128251r = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            C27266e.a m139590i = C27269h.this.m139590i(this.f128249p);
            try {
                C27267f m139581a = C27267f.m139581a(this.f128250q);
                C27268g m139550a = C27269h.this.f128245d.m139550a(m139581a);
                SocketChannel socketChannel = m139550a.f128239c;
                C27265d c27265d = new C27265d(m139581a, this.f128251r, m139590i, 0);
                C27270i c27270i = m139550a.f128240d;
                if (c27270i != null) {
                    c27265d.m139571l(c27270i);
                }
                socketChannel.register(C27269h.this.f128242a, socketChannel.validOps(), c27265d);
            } catch (Exception e11) {
                m139590i.mo137224d(this.f128250q, e11.getMessage());
            }
        }
    }

    /* renamed from: uh0.h$c */
    /* loaded from: classes7.dex */
    public class c implements C27266e.a {

        /* renamed from: a */
        final /* synthetic */ C27266e.a f128253a;

        /* renamed from: uh0.h$c$a */
        /* loaded from: classes7.dex */
        class a implements Runnable {

            /* renamed from: p */
            final /* synthetic */ String f128255p;

            /* renamed from: q */
            final /* synthetic */ int f128256q;

            /* renamed from: r */
            final /* synthetic */ C27264c f128257r;

            a(String str, int i11, C27264c c27264c) {
                this.f128255p = str;
                this.f128256q = i11;
                this.f128257r = c27264c;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f128253a.mo137222b(this.f128255p, this.f128256q, this.f128257r);
            }
        }

        /* renamed from: uh0.h$c$b */
        /* loaded from: classes7.dex */
        class b implements Runnable {

            /* renamed from: p */
            final /* synthetic */ String f128259p;

            /* renamed from: q */
            final /* synthetic */ byte[] f128260q;

            /* renamed from: r */
            final /* synthetic */ C27264c f128261r;

            b(String str, byte[] bArr, C27264c c27264c) {
                this.f128259p = str;
                this.f128260q = bArr;
                this.f128261r = c27264c;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f128253a.mo137223c(this.f128259p, this.f128260q, this.f128261r);
            }
        }

        /* renamed from: uh0.h$c$c */
        /* loaded from: classes7.dex */
        class RunnableC32991c implements Runnable {

            /* renamed from: p */
            final /* synthetic */ String f128263p;

            /* renamed from: q */
            final /* synthetic */ int f128264q;

            /* renamed from: r */
            final /* synthetic */ C27264c f128265r;

            RunnableC32991c(String str, int i11, C27264c c27264c) {
                this.f128263p = str;
                this.f128264q = i11;
                this.f128265r = c27264c;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f128253a.mo137221a(this.f128263p, this.f128264q, this.f128265r);
            }
        }

        /* renamed from: uh0.h$c$d */
        /* loaded from: classes7.dex */
        class d implements Runnable {

            /* renamed from: p */
            final /* synthetic */ String f128267p;

            /* renamed from: q */
            final /* synthetic */ String f128268q;

            d(String str, String str2) {
                this.f128267p = str;
                this.f128268q = str2;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.f128253a.mo137224d(this.f128267p, this.f128268q);
            }
        }

        c(C27266e.a aVar) {
            this.f128253a = aVar;
        }

        @Override // uh0.C27266e.a
        /* renamed from: a */
        public void mo137221a(String str, int i11, C27264c c27264c) {
            C27269h.this.f128243b.execute(new RunnableC32991c(str, i11, c27264c));
        }

        @Override // uh0.C27266e.a
        /* renamed from: b */
        public void mo137222b(String str, int i11, C27264c c27264c) {
            C27269h.this.f128243b.execute(new a(str, i11, c27264c));
        }

        @Override // uh0.C27266e.a
        /* renamed from: c */
        public void mo137223c(String str, byte[] bArr, C27264c c27264c) {
            C27269h.this.f128243b.execute(new b(str, bArr, c27264c));
        }

        @Override // uh0.C27266e.a
        /* renamed from: d */
        public void mo137224d(String str, String str2) {
            C27269h.this.f128243b.execute(new d(str, str2));
        }
    }

    /* renamed from: uh0.h$d */
    /* loaded from: classes7.dex */
    public class d implements C27270i.c {

        /* renamed from: a */
        final /* synthetic */ C27265d f128270a;

        /* renamed from: b */
        final /* synthetic */ C27270i f128271b;

        /* renamed from: c */
        final /* synthetic */ SocketChannel f128272c;

        /* renamed from: d */
        final /* synthetic */ SelectionKey f128273d;

        /* renamed from: e */
        final /* synthetic */ C27266e f128274e;

        d(C27265d c27265d, C27270i c27270i, SocketChannel socketChannel, SelectionKey selectionKey, C27266e c27266e) {
            this.f128270a = c27265d;
            this.f128271b = c27270i;
            this.f128272c = socketChannel;
            this.f128273d = selectionKey;
            this.f128274e = c27266e;
        }

        @Override // uh0.C27270i.c
        /* renamed from: a */
        public void mo139600a() {
            this.f128274e.m139576c();
        }

        @Override // uh0.C27270i.c
        /* renamed from: b */
        public void mo139601b() {
            String m139560a = this.f128270a.m139560a();
            this.f128270a.m139572m(C27265d.a.SENDING_REQ);
            this.f128271b.m139612h(ByteBuffer.wrap(m139560a.getBytes()));
        }

        @Override // uh0.C27270i.c
        /* renamed from: c */
        public void mo139602c(byte[] bArr) {
            if (this.f128270a.m139564e() == C27265d.a.SENDING_REQ) {
                this.f128270a.m139572m(C27265d.a.RECV_HEADER);
            }
            C27269h.this.m139592k(bArr, this.f128270a, this.f128272c);
            if (this.f128270a.m139564e() == C27265d.a.ERROR) {
                C27265d c27265d = this.f128270a;
                c27265d.f128208g.mo137224d(c27265d.f128202a.f128231a, c27265d.m139561b());
                this.f128273d.cancel();
                C27263b.m139548d(this.f128272c);
            }
        }
    }

    /* renamed from: uh0.h$e */
    /* loaded from: classes7.dex */
    public class e implements Runnable {

        /* renamed from: p */
        final /* synthetic */ String f128276p;

        /* renamed from: q */
        final /* synthetic */ C27265d f128277q;

        e(String str, C27265d c27265d) {
            this.f128276p = str;
            this.f128277q = c27265d;
        }

        @Override // java.lang.Runnable
        public void run() {
            C27269h.this.m139594m(this.f128276p, this.f128277q);
        }
    }

    public C27269h(int i11, int i12) {
        try {
            this.f128242a = Selector.open();
            this.f128243b = Executors.newFixedThreadPool(i11);
            this.f128244c = SSLContext.getDefault();
            this.f128245d = new C27263b();
            this.f128246e = i12 < 1 ? Integer.MAX_VALUE : i12;
            this.f128247f = new LinkedBlockingDeque();
            new Thread(new a(), "ZNIODownloader io").start();
        } catch (Throwable th2) {
            throw new NullPointerException("Cannot init ZNIODownloader: " + th2.getMessage());
        }
    }

    /* renamed from: i */
    public C27266e.a m139590i(C27266e.a aVar) {
        if (aVar == null) {
            return aVar;
        }
        return new c(aVar);
    }

    /* renamed from: j */
    private C27270i.c m139591j(C27270i c27270i, C27265d c27265d, SelectionKey selectionKey) {
        return new d(c27265d, c27270i, (SocketChannel) selectionKey.channel(), selectionKey, c27265d.m139562c());
    }

    /* renamed from: k */
    public void m139592k(byte[] bArr, C27265d c27265d, SocketChannel socketChannel) {
        String m139575b;
        try {
            C27266e m139562c = c27265d.m139562c();
            if (c27265d.m139564e() == C27265d.a.RECV_HEADER) {
                if (!m139562c.m139578f(bArr, c27265d.f128208g) && (m139575b = m139562c.m139575b()) != null) {
                    c27265d.m139572m(C27265d.a.DONE);
                    this.f128247f.addFirst(new e(m139575b, c27265d));
                    return;
                }
                return;
            }
            if (c27265d.m139564e() == C27265d.a.RECV_DATA) {
                m139562c.m139580h(ByteBuffer.wrap(bArr), c27265d.f128208g);
                return;
            }
            throw new IllegalStateException("Illegal state while receiving response data: " + c27265d.m139564e());
        } catch (Exception e11) {
            c27265d.m139570k(e11.getMessage());
        }
    }

    /* renamed from: l */
    private C27265d.a m139593l(SocketChannel socketChannel, C27265d c27265d) {
        int m139579g;
        C27266e m139562c = c27265d.m139562c();
        do {
            try {
                m139579g = m139562c.m139579g(socketChannel);
                if (m139579g == -1) {
                    m139562c.m139576c();
                }
                if (m139579g > 0) {
                    m139592k(m139562c.m139577d(), c27265d, socketChannel);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                return c27265d.m139570k(e11.getMessage());
            }
        } while (m139579g > 0);
        return c27265d.m139564e();
    }

    /* renamed from: m */
    public void m139594m(String str, C27265d c27265d) {
        System.err.println("------------\nRedirect: " + str);
        if (c27265d.f128209h + 1 > 3) {
            c27265d.f128208g.mo137224d(str, "Too many redirects: " + (c27265d.f128209h + 1));
            return;
        }
        try {
            C27267f m139581a = C27267f.m139581a(str);
            C27268g m139550a = this.f128245d.m139550a(m139581a);
            SocketChannel socketChannel = m139550a.f128239c;
            C27265d c27265d2 = new C27265d(m139581a, c27265d.f128210i, c27265d.f128208g, c27265d.f128209h + 1);
            C27270i c27270i = m139550a.f128240d;
            if (c27270i != null) {
                c27265d2.m139571l(c27270i);
            }
            socketChannel.register(this.f128242a, socketChannel.validOps(), c27265d2);
        } catch (IOException e11) {
            c27265d.f128208g.mo137224d(str, e11.getMessage());
        }
    }

    /* renamed from: n */
    public void m139595n() {
        Runnable runnable;
        long currentTimeMillis = System.currentTimeMillis();
        while (this.f128242a.isOpen()) {
            try {
                if (!this.f128247f.isEmpty() && this.f128242a.keys().size() < this.f128246e && (runnable = (Runnable) this.f128247f.poll()) != null) {
                    runnable.run();
                }
                if (System.currentTimeMillis() - currentTimeMillis > 10000) {
                    this.f128245d.m139551b();
                    currentTimeMillis = System.currentTimeMillis();
                }
                try {
                    this.f128242a.select(100L);
                    Iterator<SelectionKey> it = this.f128242a.selectedKeys().iterator();
                    while (it.hasNext()) {
                        SelectionKey next = it.next();
                        it.remove();
                        if (!next.isValid()) {
                            next.cancel();
                        } else {
                            SocketChannel socketChannel = (SocketChannel) next.channel();
                            if (next.isConnectable()) {
                                try {
                                    if (!socketChannel.finishConnect()) {
                                        continue;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            Object attachment = next.attachment();
                            if (!(attachment instanceof C27265d)) {
                                next.cancel();
                                C27263b.m139548d(socketChannel);
                            } else {
                                C27265d c27265d = (C27265d) attachment;
                                if (c27265d.m139564e() == C27265d.a.DONE) {
                                    next.cancel();
                                    this.f128245d.m139553f(c27265d.f128202a, socketChannel, c27265d.m139563d());
                                } else if (!c27265d.m139566g()) {
                                    if (next.isWritable() && !c27265d.m139567h() && m139596o(socketChannel, c27265d) == C27265d.a.ERROR) {
                                        c27265d.f128208g.mo137224d(c27265d.f128202a.f128231a, c27265d.m139561b());
                                        next.cancel();
                                        C27263b.m139548d(socketChannel);
                                    } else if (next.isReadable() && c27265d.m139567h() && m139593l(socketChannel, c27265d) == C27265d.a.ERROR) {
                                        c27265d.f128208g.mo137224d(c27265d.f128202a.f128231a, c27265d.m139561b());
                                        next.cancel();
                                        C27263b.m139548d(socketChannel);
                                    }
                                } else {
                                    if (!c27265d.m139565f()) {
                                        try {
                                            C27270i c27270i = new C27270i(socketChannel, this.f128244c, this.f128243b, 65536, c27265d.f128202a);
                                            c27270i.m139613i(m139591j(c27270i, c27265d, next));
                                            c27265d.m139571l(c27270i);
                                        } catch (Exception e11) {
                                            c27265d.m139570k(e11.getMessage());
                                            c27265d.f128208g.mo137224d(c27265d.f128202a.f128231a, c27265d.m139561b());
                                            next.cancel();
                                            C27263b.m139548d(socketChannel);
                                        }
                                    } else {
                                        C27270i m139563d = c27265d.m139563d();
                                        if (m139563d.m139610e()) {
                                            m139563d.m139613i(m139591j(m139563d, c27265d, next));
                                        }
                                    }
                                    if (c27265d.m139568i() == C27265d.a.ERROR) {
                                        c27265d.f128208g.mo137224d(c27265d.f128202a.f128231a, c27265d.m139561b());
                                        next.cancel();
                                        C27263b.m139548d(socketChannel);
                                    }
                                }
                            }
                        }
                    }
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            } catch (Exception e13) {
                e13.printStackTrace();
            }
        }
    }

    /* renamed from: o */
    private C27265d.a m139596o(SocketChannel socketChannel, C27265d c27265d) {
        try {
            c27265d.m139572m(C27265d.a.SENDING_REQ);
            c27265d.m139569j(socketChannel);
            if (c27265d.m139567h()) {
                c27265d.m139572m(C27265d.a.RECV_HEADER);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            c27265d.m139570k(e11.getMessage());
        }
        return c27265d.m139564e();
    }

    /* renamed from: h */
    public void m139597h(String str, Map map, C27266e.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f128242a.isOpen()) {
            b bVar = new b(aVar, str, map);
            if (this.f128242a.keys().size() < this.f128246e) {
                this.f128243b.execute(bVar);
                return;
            } else {
                this.f128247f.add(bVar);
                return;
            }
        }
        throw new IOException("Http client instance has been shutdown");
    }

    /* renamed from: p */
    public void m139598p(int i11) {
        if (i11 < 1) {
            i11 = Integer.MAX_VALUE;
        }
        this.f128246e = i11;
    }

    /* renamed from: q */
    public void m139599q() {
        this.f128242a.close();
        this.f128243b.shutdown();
        this.f128245d.m139552c();
    }

    public C27269h() {
        this(1, 1);
    }
}

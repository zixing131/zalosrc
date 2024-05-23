package uh0;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: uh0.b */
/* loaded from: classes7.dex */
public class C27263b {

    /* renamed from: a */
    private final Map f128198a = new ConcurrentHashMap();

    /* renamed from: d */
    public static void m139548d(SocketChannel socketChannel) {
        try {
            socketChannel.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: e */
    public static SocketChannel m139549e(String str, int i11) {
        SocketChannel open = SocketChannel.open();
        open.configureBlocking(false);
        open.connect(new InetSocketAddress(str, i11));
        return open;
    }

    /* renamed from: a */
    public synchronized C27268g m139550a(C27267f c27267f) {
        try {
            String format = String.format("%s:%d", c27267f.f128233c, Integer.valueOf(c27267f.f128234d));
            if (this.f128198a.containsKey(format)) {
                LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) this.f128198a.get(format);
                while (true) {
                    C27268g c27268g = (C27268g) linkedBlockingQueue.poll();
                    if (linkedBlockingQueue.isEmpty()) {
                        this.f128198a.remove(format);
                    }
                    if (c27268g == null) {
                        break;
                    }
                    if (c27268g.f128239c.isConnected() && !c27268g.m139582a()) {
                        System.err.println("-------reuse connection-----");
                        return c27268g;
                    }
                    m139548d(c27268g.f128239c);
                }
            }
            String str = c27267f.f128233c;
            int i11 = c27267f.f128234d;
            return new C27268g(str, i11, m139549e(str, i11), null);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b */
    public void m139551b() {
        for (Map.Entry entry : this.f128198a.entrySet()) {
            String str = (String) entry.getKey();
            LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) entry.getValue();
            if (linkedBlockingQueue != null) {
                Iterator it = linkedBlockingQueue.iterator();
                while (it.hasNext()) {
                    C27268g c27268g = (C27268g) it.next();
                    if (c27268g.m139582a()) {
                        m139548d(c27268g.f128239c);
                        linkedBlockingQueue.remove(c27268g);
                    }
                }
                if (linkedBlockingQueue.isEmpty()) {
                    this.f128198a.remove(str);
                }
            }
        }
    }

    /* renamed from: c */
    public void m139552c() {
        Iterator it = this.f128198a.entrySet().iterator();
        while (it.hasNext()) {
            LinkedBlockingQueue linkedBlockingQueue = (LinkedBlockingQueue) ((Map.Entry) it.next()).getValue();
            if (linkedBlockingQueue != null) {
                while (!linkedBlockingQueue.isEmpty()) {
                    m139548d(((C27268g) linkedBlockingQueue.poll()).f128239c);
                }
            }
        }
        this.f128198a.clear();
    }

    /* renamed from: f */
    public synchronized void m139553f(C27267f c27267f, SocketChannel socketChannel, C27270i c27270i) {
        if (socketChannel == null) {
            return;
        }
        if (!socketChannel.isConnected()) {
            m139548d(socketChannel);
            return;
        }
        try {
            String format = String.format("%s:%d", c27267f.f128233c, Integer.valueOf(c27267f.f128234d));
            if (this.f128198a.containsKey(format)) {
                ((LinkedBlockingQueue) this.f128198a.get(format)).offer(new C27268g(c27267f.f128233c, c27267f.f128234d, socketChannel, c27270i));
            } else {
                LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
                if (linkedBlockingQueue.offer(new C27268g(c27267f.f128233c, c27267f.f128234d, socketChannel, c27270i))) {
                    this.f128198a.put(format, linkedBlockingQueue);
                }
            }
        } catch (Exception unused) {
        }
    }
}

package uh0;

import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import uh0.C27266e;

/* renamed from: uh0.d */
/* loaded from: classes7.dex */
public final class C27265d {

    /* renamed from: k */
    public static final String f128200k;

    /* renamed from: l */
    private static final Map f128201l;

    /* renamed from: a */
    public final C27267f f128202a;

    /* renamed from: b */
    private final C27264c f128203b;

    /* renamed from: c */
    private final ByteBuffer f128204c;

    /* renamed from: d */
    private a f128205d;

    /* renamed from: e */
    private String f128206e;

    /* renamed from: f */
    private C27266e f128207f;

    /* renamed from: g */
    public final C27266e.a f128208g;

    /* renamed from: h */
    public final int f128209h;

    /* renamed from: i */
    public final Map f128210i;

    /* renamed from: j */
    private C27270i f128211j;

    /* renamed from: uh0.d$a */
    /* loaded from: classes7.dex */
    public enum a {
        INIT,
        SENDING_REQ,
        RECV_HEADER,
        RECV_DATA,
        DONE,
        ERROR
    }

    static {
        String format = String.format("%s ZBrowser/%s Zalo android/%d", System.getProperty("http.agent"), "19.09.09", Integer.valueOf(ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE));
        f128200k = format;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f128201l = concurrentHashMap;
        concurrentHashMap.put("User-Agent", format);
        concurrentHashMap.put("Accept-Encoding", "gzip");
        concurrentHashMap.put("zbrowser", "1");
    }

    public C27265d(C27267f c27267f, Map map, C27266e.a aVar, int i11) {
        this.f128202a = c27267f;
        if (c27267f != null) {
            C27264c c27264c = new C27264c(f128201l);
            this.f128203b = c27264c;
            c27264c.m139559f(map);
            c27264c.m139558e("Host", c27267f.f128233c);
            this.f128204c = ByteBuffer.wrap(m139560a().getBytes());
            this.f128205d = a.INIT;
            this.f128206e = null;
            this.f128207f = null;
            this.f128208g = aVar;
            this.f128209h = i11;
            this.f128210i = map;
            this.f128211j = null;
            return;
        }
        throw new IllegalArgumentException("Http url is null");
    }

    /* renamed from: a */
    public String m139560a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("GET ");
        sb2.append(this.f128202a.f128235e);
        sb2.append(" ");
        sb2.append("HTTP/1.1");
        sb2.append("\r\n");
        for (String str : this.f128203b.m139556c()) {
            String m139555b = this.f128203b.m139555b(str);
            sb2.append(str);
            sb2.append(": ");
            sb2.append(m139555b);
            sb2.append("\r\n");
        }
        sb2.append("\r\n");
        return sb2.toString();
    }

    /* renamed from: b */
    public String m139561b() {
        return this.f128206e;
    }

    /* renamed from: c */
    public C27266e m139562c() {
        if (this.f128207f == null) {
            this.f128207f = new C27266e(this);
        }
        return this.f128207f;
    }

    /* renamed from: d */
    public C27270i m139563d() {
        return this.f128211j;
    }

    /* renamed from: e */
    public a m139564e() {
        return this.f128205d;
    }

    /* renamed from: f */
    public boolean m139565f() {
        return this.f128211j != null;
    }

    /* renamed from: g */
    public boolean m139566g() {
        return this.f128202a.f128232b.equals("https");
    }

    /* renamed from: h */
    public boolean m139567h() {
        if (this.f128204c.remaining() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public a m139568i() {
        if (!m139566g()) {
            return a.ERROR;
        }
        try {
            this.f128211j.m139609a();
        } catch (IOException e11) {
            e11.printStackTrace();
            if (this.f128205d != a.DONE) {
                m139570k(e11.getMessage());
            }
        }
        return this.f128205d;
    }

    /* renamed from: j */
    public int m139569j(SocketChannel socketChannel) {
        if (m139566g()) {
            return -1;
        }
        if (m139567h()) {
            return 0;
        }
        System.err.println("header to send: " + System.currentTimeMillis() + "\n" + new String(this.f128204c.array()));
        return socketChannel.write(this.f128204c);
    }

    /* renamed from: k */
    public a m139570k(String str) {
        a aVar = a.ERROR;
        this.f128205d = aVar;
        this.f128206e = str;
        return aVar;
    }

    /* renamed from: l */
    public void m139571l(C27270i c27270i) {
        if (this.f128211j == null) {
            this.f128211j = c27270i;
        }
    }

    /* renamed from: m */
    public a m139572m(a aVar) {
        if (aVar == null) {
            return null;
        }
        this.f128205d = aVar;
        return aVar;
    }
}

package uh0;

import java.nio.channels.SocketChannel;

/* renamed from: uh0.g */
/* loaded from: classes7.dex */
public class C27268g {

    /* renamed from: a */
    public final String f128237a;

    /* renamed from: b */
    public final int f128238b;

    /* renamed from: c */
    public final SocketChannel f128239c;

    /* renamed from: d */
    public final C27270i f128240d;

    /* renamed from: e */
    public final long f128241e;

    public C27268g(String str, int i11, SocketChannel socketChannel, C27270i c27270i) {
        this.f128237a = str;
        this.f128238b = i11;
        this.f128239c = socketChannel;
        this.f128240d = c27270i;
        if (c27270i != null) {
            c27270i.m139611g();
        }
        this.f128241e = System.currentTimeMillis();
    }

    /* renamed from: a */
    public boolean m139582a() {
        if ((System.currentTimeMillis() - this.f128241e) / 1000 > 30) {
            return true;
        }
        return false;
    }
}

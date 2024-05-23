package ki0;

import android.content.Context;
import com.zing.zalo.uidrawing.C16716d;
import kd0.C21693c;

/* renamed from: ki0.g */
/* loaded from: classes7.dex */
public class C21739g extends C16716d {

    /* renamed from: M0 */
    public C21740h f105572M0;

    /* renamed from: N0 */
    private final C21693c f105573N0;

    /* renamed from: O0 */
    private final C21693c f105574O0;

    /* renamed from: P0 */
    private int f105575P0;

    /* renamed from: Q0 */
    private final Context f105576Q0;

    public C21739g(Context context) {
        super(context);
        this.f105575P0 = 0;
        this.f105576Q0 = context;
        C21693c c21693c = new C21693c(context);
        this.f105573N0 = c21693c;
        c21693c.mo44614b1(8);
        c21693c.m89106L().m89027K(true);
        C21740h c21740h = new C21740h(context);
        this.f105572M0 = c21740h;
        c21740h.mo44614b1(0);
        this.f105572M0.m89106L().m89028L(-2, -2).m89054h0(c21693c).m89027K(true);
        C21693c c21693c2 = new C21693c(context);
        this.f105574O0 = c21693c2;
        c21693c2.mo44614b1(8);
        c21693c2.m89106L().m89054h0(this.f105572M0).m89027K(true);
        m89001g1(c21693c);
        m89001g1(this.f105572M0);
        m89001g1(c21693c2);
    }

    /* renamed from: o1 */
    public void m112184o1(int i11) {
        this.f105575P0 = i11;
        this.f105573N0.m89106L().m89047c0(this.f105575P0);
        this.f105574O0.m89106L().m89046b0(this.f105575P0);
    }
}

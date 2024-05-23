package p458qr;

import com.zing.zalo.feed.mvp.music.data.ExceptionLyric;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLoadInfo;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicLocationNotSupported;
import com.zing.zalo.feed.mvp.music.data.ExceptionMusicStreaming;
import com.zing.zalo.feed.mvp.music.data.ExceptionSearchMusic;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.LinkedHashMap;
import java.util.Map;
import p248iy.AbstractC20887g;

/* renamed from: qr.o */
/* loaded from: classes4.dex */
public final class C25482o {

    /* renamed from: a */
    public static final C25482o f122075a = new C25482o();

    /* renamed from: b */
    private static final Map f122076b = new LinkedHashMap();

    /* renamed from: c */
    private static final Map f122077c = new LinkedHashMap();

    /* renamed from: d */
    private static final Map f122078d = new LinkedHashMap();

    /* renamed from: e */
    private static final Map f122079e = new LinkedHashMap();

    /* renamed from: f */
    private static final Map f122080f = new LinkedHashMap();

    private C25482o() {
    }

    /* renamed from: a */
    private final int m131974a(Exception exc) {
        if (AbstractC19074t.m100204b(exc, ExceptionSearchMusic.f46314p)) {
            return 500037;
        }
        if (AbstractC19074t.m100204b(exc, ExceptionMusicLoadInfo.f46310p)) {
            return 500038;
        }
        if (AbstractC19074t.m100204b(exc, ExceptionLyric.f46309p)) {
            return 500039;
        }
        if (AbstractC19074t.m100204b(exc, ExceptionMusicStreaming.f46312p)) {
            return 500040;
        }
        if (AbstractC19074t.m100204b(exc, ExceptionMusicLocationNotSupported.f46311p)) {
            return 500041;
        }
        return 500042;
    }

    /* renamed from: b */
    private final int m131975b(int i11) {
        if (i11 == 1) {
            return 500051;
        }
        if (i11 == 2) {
            return 500052;
        }
        if (i11 == 3) {
            return 500053;
        }
        if (i11 == 6) {
            return 500054;
        }
        if (i11 != 7) {
            return i11 != 17 ? -1 : 500056;
        }
        return 500055;
    }

    /* renamed from: c */
    private final int m131976c(int i11) {
        if (i11 == 1) {
            return 500057;
        }
        if (i11 != 2) {
            return i11 != 3 ? -1 : 500059;
        }
        return 500058;
    }

    /* renamed from: d */
    private final int m131977d(int i11) {
        if (i11 == 0) {
            return 500024;
        }
        if (i11 != 1) {
            return i11 != 2 ? -1 : 500025;
        }
        return 500026;
    }

    /* renamed from: e */
    private final int m131978e(int i11) {
        if (i11 == 1) {
            return 500002;
        }
        if (i11 == 2) {
            return 500006;
        }
        if (i11 == 3) {
            return 500007;
        }
        if (i11 == 6) {
            return 500004;
        }
        if (i11 == 7) {
            return 500003;
        }
        if (i11 == 17) {
            return 500008;
        }
        if (i11 != 22) {
            return i11 != 24 ? -1 : 500014;
        }
        return 500005;
    }

    /* renamed from: f */
    private final int m131979f(int i11) {
        if (i11 == 1) {
            return 500028;
        }
        if (i11 != 2) {
            return i11 != 3 ? -1 : 500027;
        }
        return 500029;
    }

    /* renamed from: A */
    public final void m131980A(long j11, long j12, int i11) {
        AbstractC20887g.m109246x(500009, j11);
        AbstractC20887g.m109214A(m131978e(i11), String.valueOf(j12), j11);
    }

    /* renamed from: B */
    public final void m131981B(long j11) {
        AbstractC20887g.m109246x(500010, j11);
    }

    /* renamed from: C */
    public final void m131982C(long j11, long j12, int i11) {
        AbstractC20887g.m109246x(500030, j11);
        AbstractC20887g.m109214A(m131979f(i11), String.valueOf(j12), j11);
    }

    /* renamed from: D */
    public final void m131983D(long j11) {
        AbstractC20887g.m109246x(500031, j11);
    }

    /* renamed from: E */
    public final void m131984E(String str) {
        long j11;
        AbstractC19074t.m100208f(str, "feedId");
        Long l11 = (Long) f122080f.get(str);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = -1;
        }
        if (j11 != -1) {
            AbstractC20887g.m109214A(500063, str, j11);
        }
        AbstractC20110a.f98889a.mo104552e(new RuntimeException("QoS native feed ads zinstant failed 500063 feedId: " + str));
    }

    /* renamed from: F */
    public final void m131985F(String str) {
        long j11;
        AbstractC19074t.m100208f(str, "feedId");
        Map map = f122080f;
        Long l11 = (Long) map.remove(str);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = -1;
        }
        if (j11 != -1) {
            AbstractC20887g.m109214A(500062, str, j11);
        }
        map.put(str, -1L);
    }

    /* renamed from: G */
    public final void m131986G(String str) {
        long j11;
        AbstractC19074t.m100208f(str, "feedContentId");
        Map map = f122079e;
        Long l11 = (Long) map.remove(str);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = -1;
        }
        if (j11 != -1) {
            AbstractC20887g.m109246x(500050, j11);
        }
        map.put(str, -1L);
    }

    /* renamed from: H */
    public final void m131987H(String str) {
        long j11;
        AbstractC19074t.m100208f(str, "feedContentId");
        Map map = f122079e;
        Long l11 = (Long) map.remove(str);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = -1;
        }
        if (j11 != -1) {
            AbstractC20887g.m109246x(500049, j11);
        }
        map.put(str, -1L);
    }

    /* renamed from: I */
    public final void m131988I(int i11) {
        AbstractC20887g.m109246x(i11, System.currentTimeMillis());
    }

    /* renamed from: J */
    public final void m131989J(String str) {
        long j11;
        AbstractC19074t.m100208f(str, "feedId");
        Map map = f122076b;
        Long l11 = (Long) map.remove(str);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = -1;
        }
        if (j11 > 0) {
            AbstractC20887g.m109246x(500044, j11);
        }
        map.put(str, 0L);
    }

    /* renamed from: K */
    public final void m131990K(String str) {
        long j11;
        AbstractC19074t.m100208f(str, "feedId");
        Map map = f122076b;
        Long l11 = (Long) map.remove(str);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = -1;
        }
        if (j11 > 0) {
            AbstractC20887g.m109246x(500043, j11);
        } else if (j11 != 0) {
            AbstractC20887g.m109246x(500043, System.currentTimeMillis());
        }
        map.put(str, 0L);
    }

    /* renamed from: L */
    public final void m131991L(String str) {
        long j11;
        AbstractC19074t.m100208f(str, "feedId");
        Map map = f122077c;
        Long l11 = (Long) map.remove(str);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = -1;
        }
        if (j11 > 0) {
            AbstractC20887g.m109246x(500046, j11);
        }
        map.put(str, 0L);
    }

    /* renamed from: M */
    public final void m131992M(String str) {
        long j11;
        AbstractC19074t.m100208f(str, "feedId");
        Map map = f122077c;
        Long l11 = (Long) map.remove(str);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = -1;
        }
        if (j11 > 0) {
            AbstractC20887g.m109246x(500045, j11);
        } else if (j11 != 0) {
            AbstractC20887g.m109246x(500045, System.currentTimeMillis());
        }
        map.put(str, 0L);
    }

    /* renamed from: N */
    public final void m131993N(String str, long j11) {
        AbstractC19074t.m100208f(str, "uid");
        f122078d.put(str, Long.valueOf(j11));
    }

    /* renamed from: O */
    public final void m131994O(String str, long j11) {
        AbstractC19074t.m100208f(str, "feedId");
        Map map = f122080f;
        if (map.get(str) == null) {
            map.put(str, Long.valueOf(j11));
        }
    }

    /* renamed from: P */
    public final void m131995P(String str, long j11) {
        AbstractC19074t.m100208f(str, "feedContentId");
        Map map = f122079e;
        if (map.get(str) == null) {
            map.put(str, Long.valueOf(j11));
        }
    }

    /* renamed from: Q */
    public final void m131996Q(String str, long j11) {
        AbstractC19074t.m100208f(str, "feedId");
        Map map = f122076b;
        if (map.get(str) == null) {
            map.put(str, Long.valueOf(j11));
        }
    }

    /* renamed from: R */
    public final void m131997R(String str, long j11) {
        AbstractC19074t.m100208f(str, "feedId");
        Map map = f122077c;
        if (map.get(str) == null) {
            map.put(str, Long.valueOf(j11));
        }
    }

    /* renamed from: S */
    public final void m131998S() {
        f122076b.clear();
        f122077c.clear();
        f122078d.clear();
        f122079e.clear();
        f122080f.clear();
    }

    /* renamed from: g */
    public final void m131999g(long j11, Exception exc) {
        AbstractC19074t.m100208f(exc, "exceptionMusic");
        AbstractC20887g.m109238p(m131974a(exc), j11);
    }

    /* renamed from: h */
    public final void m132000h(long j11, int i11, int i12) {
        AbstractC20887g.m109238p(500021, j11);
        AbstractC20887g.m109241s(m131977d(i11), String.valueOf(i12), j11);
    }

    /* renamed from: i */
    public final void m132001i(long j11, Integer num) {
        String str;
        if (num == null || (str = num.toString()) == null) {
            str = "";
        }
        AbstractC20887g.m109241s(500022, str, j11);
    }

    /* renamed from: j */
    public final void m132002j(long j11, Integer num) {
        if (num != null) {
            AbstractC20887g.m109241s(500023, num.toString(), j11);
        } else {
            AbstractC20887g.m109238p(500023, j11);
        }
    }

    /* renamed from: k */
    public final void m132003k(long j11, int i11, int i12) {
        AbstractC20887g.m109238p(500009, j11);
        AbstractC20887g.m109241s(m131978e(i11), String.valueOf(i12), j11);
    }

    /* renamed from: l */
    public final void m132004l(long j11, Integer num) {
        String str;
        if (num == null || (str = num.toString()) == null) {
            str = "";
        }
        AbstractC20887g.m109241s(500010, str, j11);
    }

    /* renamed from: m */
    public final void m132005m(long j11, Integer num) {
        if (num != null) {
            AbstractC20887g.m109241s(500012, num.toString(), j11);
        } else {
            AbstractC20887g.m109238p(500012, j11);
        }
    }

    /* renamed from: n */
    public final void m132006n(long j11, Integer num) {
        if (num != null) {
            AbstractC20887g.m109241s(500011, num.toString(), j11);
        } else {
            AbstractC20887g.m109238p(500011, j11);
        }
    }

    /* renamed from: o */
    public final void m132007o(long j11, Integer num) {
        if (num != null) {
            AbstractC20887g.m109241s(500013, num.toString(), j11);
        } else {
            AbstractC20887g.m109238p(500013, j11);
        }
        AbstractC20110a.f98889a.mo104552e(new RuntimeException("QoS native video feed failed 500013 errorCode: " + num));
    }

    /* renamed from: p */
    public final void m132008p(long j11, int i11, int i12) {
        AbstractC20887g.m109238p(500030, j11);
        AbstractC20887g.m109241s(m131979f(i11), String.valueOf(i12), j11);
    }

    /* renamed from: q */
    public final void m132009q(long j11, Integer num) {
        String str;
        if (num == null || (str = num.toString()) == null) {
            str = "";
        }
        AbstractC20887g.m109241s(500031, str, j11);
    }

    /* renamed from: r */
    public final void m132010r(long j11, Integer num) {
        if (num != null) {
            AbstractC20887g.m109241s(500032, num.toString(), j11);
        } else {
            AbstractC20887g.m109238p(500032, j11);
        }
    }

    /* renamed from: s */
    public final void m132011s(long j11, Integer num) {
        if (num != null) {
            AbstractC20887g.m109241s(500033, num.toString(), j11);
        } else {
            AbstractC20887g.m109238p(500033, j11);
        }
        AbstractC20110a.f98889a.mo104552e(new RuntimeException("QoS native video story failed 500013 errorCode: " + num));
    }

    /* renamed from: t */
    public final void m132012t(int i11, long j11) {
        AbstractC20887g.m109246x(m131975b(i11), j11);
    }

    /* renamed from: u */
    public final void m132013u(int i11, long j11) {
        AbstractC20887g.m109246x(m131976c(i11), j11);
    }

    /* renamed from: v */
    public final void m132014v(String str, boolean z11) {
        long j11;
        int i11;
        AbstractC19074t.m100208f(str, "uid");
        Long l11 = (Long) f122078d.remove(str);
        if (l11 != null) {
            j11 = l11.longValue();
        } else {
            j11 = -1;
        }
        if (j11 != -1) {
            if (z11) {
                i11 = 500048;
            } else {
                i11 = 500047;
            }
            AbstractC20887g.m109246x(i11, j11);
        }
    }

    /* renamed from: w */
    public final void m132015w(long j11, long j12, int i11) {
        AbstractC20887g.m109246x(500021, j11);
        AbstractC20887g.m109214A(m131977d(i11), String.valueOf(j12), j11);
    }

    /* renamed from: x */
    public final void m132016x(long j11) {
        AbstractC20887g.m109246x(500022, j11);
    }

    /* renamed from: y */
    public final void m132017y(long j11, int i11) {
        AbstractC20887g.m109238p(i11 + 27000, j11);
    }

    /* renamed from: z */
    public final void m132018z(long j11, int i11) {
        AbstractC20887g.m109246x(i11 + 27000, j11);
    }
}

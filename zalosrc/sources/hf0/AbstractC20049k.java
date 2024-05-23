package hf0;

import android.util.SparseArray;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zmedia.view.C17391z;
import com.zing.zalo.zmedia.view.ZVideoView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: hf0.k */
/* loaded from: classes5.dex */
public abstract class AbstractC20049k {

    /* renamed from: q */
    protected static SparseArray f98584q;

    /* renamed from: r */
    protected static Map f98585r;

    /* renamed from: p */
    protected int f98586p;

    static {
        SparseArray sparseArray = new SparseArray();
        f98584q = sparseArray;
        sparseArray.put(0, new HashMap());
        f98584q.put(7, new HashMap());
        f98584q.put(1, new HashMap());
        f98584q.put(2, new HashMap());
        f98585r = new HashMap();
    }

    public AbstractC20049k(int i11) {
        this.f98586p = i11;
    }

    /* renamed from: a */
    public static void m104108a(ZVideoView zVideoView, int i11) {
        long j11;
        try {
            if (zVideoView.getCurrentPosition() != -1) {
                j11 = zVideoView.getCurrentPosition();
            } else {
                j11 = 0;
            }
            m104109b(zVideoView, i11, j11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m104109b(ZVideoView zVideoView, int i11, long j11) {
        try {
            if (zVideoView.getVideo() != null) {
                m104119m(i11, zVideoView.getVideo().f88618a, j11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m104110c() {
        f98585r.clear();
        f98584q.clear();
    }

    /* renamed from: d */
    public static long m104111d(int i11, String str) {
        try {
            Map map = (Map) f98584q.get(i11);
            if (map == null) {
                map = new HashMap();
                f98584q.put(i11, map);
            }
            Long l11 = (Long) map.get(str);
            if (l11 == null) {
                return -1L;
            }
            return l11.longValue();
        } catch (Exception e11) {
            e11.printStackTrace();
            return -1L;
        }
    }

    /* renamed from: e */
    public static int m104112e(int i11) {
        if (i11 == 1 || i11 == 2) {
            return 1;
        }
        if (i11 != 3) {
            return i11 != 5 ? 0 : 3;
        }
        return 2;
    }

    /* renamed from: g */
    public static ZMediaPlayerSettings.VideoConfig m104113g(int i11) {
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 6 && i11 != 7) {
                            return ZMediaPlayerSettings.getVideoConfig(8);
                        }
                    } else {
                        return ZMediaPlayerSettings.getVideoConfig(3);
                    }
                } else {
                    return ZMediaPlayerSettings.getVideoConfig(2);
                }
            } else {
                return ZMediaPlayerSettings.getVideoConfig(1);
            }
        }
        return ZMediaPlayerSettings.getVideoConfig(0);
    }

    /* renamed from: h */
    public static boolean m104114h(String str) {
        return f98585r.containsKey(str);
    }

    /* renamed from: i */
    public static void m104115i(ZVideoView zVideoView, int i11) {
        if (zVideoView != null) {
            try {
                int currentState = zVideoView.getCurrentState();
                if (currentState == 3 || currentState == 1 || currentState == 2) {
                    zVideoView.pause();
                }
                m104108a(zVideoView, i11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: j */
    public static void m104116j(ZVideoView zVideoView, C17391z c17391z, int i11, String str) {
        long j11;
        if (zVideoView != null) {
            try {
                if (c17391z.f88630m) {
                    if (m104114h(c17391z.f88618a)) {
                    }
                    j11 = m104111d(i11, str);
                    zVideoView.setZVideo(c17391z);
                    zVideoView.m92411e0((int) j11);
                }
                if (i11 != 0 && i11 != 7) {
                    j11 = 0;
                    zVideoView.setZVideo(c17391z);
                    zVideoView.m92411e0((int) j11);
                }
                j11 = m104111d(i11, str);
                zVideoView.setZVideo(c17391z);
                zVideoView.m92411e0((int) j11);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: k */
    public static void m104117k(int i11) {
        try {
            f98584q.put(i11, new HashMap());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public static void m104118l(String str, int i11) {
        try {
            if (!f98585r.containsKey(str)) {
                f98585r.put(str, str);
            }
            m104119m(i11, str, -1L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m104119m(int i11, String str, long j11) {
        try {
            Map map = (Map) f98584q.get(i11);
            if (map == null) {
                map = new HashMap();
                f98584q.put(i11, map);
            }
            map.put(str, Long.valueOf(j11));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    public int m104120f() {
        return this.f98586p;
    }
}

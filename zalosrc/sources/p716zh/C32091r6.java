package p716zh;

import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import dj.C17945a0;
import dj.C17958e1;
import dj.C17961f1;
import dj.C17969i0;
import dj.C18009w0;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import w50.C28771c;

/* renamed from: zh.r6 */
/* loaded from: classes3.dex */
public class C32091r6 {

    /* renamed from: a */
    public final int f147869a;

    /* renamed from: b */
    public boolean f147870b;

    /* renamed from: c */
    public int f147871c;

    /* renamed from: d */
    public int f147872d;

    /* renamed from: e */
    public int f147873e;

    /* renamed from: f */
    public int f147874f;

    /* renamed from: g */
    public int f147875g;

    /* renamed from: h */
    public int f147876h;

    /* renamed from: i */
    public int f147877i;

    /* renamed from: j */
    private final ArrayList f147878j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zh.r6$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public static C32091r6 f147879a = new C32091r6();
    }

    /* renamed from: a */
    public static int[] m154831a(int i11, int i12) {
        int[] iArr = {0, 0};
        if (i11 != 0 && i12 != 0) {
            double d11 = i11;
            double d12 = i12;
            double d13 = d11 / d12;
            if (d13 <= 0.6d) {
                i12 = (int) (d11 / 0.6d);
            } else if (d13 >= 2.5d) {
                i11 = (int) (d12 * 2.5d);
            }
            iArr[0] = i11;
            iArr[1] = i12;
        }
        return iArr;
    }

    /* renamed from: b */
    public static C32091r6 m154832b() {
        return a.f147879a;
    }

    /* renamed from: c */
    public static int[] m154833c(C17969i0 c17969i0) {
        int[] iArr = {0, 0};
        if (c17969i0 == null) {
            return iArr;
        }
        if (c17969i0 instanceof C18009w0) {
            C18009w0 c18009w0 = (C18009w0) c17969i0;
            iArr[0] = c18009w0.m95790x();
            iArr[1] = c18009w0.m95789w();
        } else if (c17969i0 instanceof C17961f1) {
            C17961f1 c17961f1 = (C17961f1) c17969i0;
            iArr[0] = c17961f1.m95497q();
            iArr[1] = c17961f1.m95495p();
        } else if (c17969i0 instanceof C17958e1) {
            C17958e1 c17958e1 = (C17958e1) c17969i0;
            iArr[0] = c17958e1.m95428q();
            iArr[1] = c17958e1.m95427p();
        }
        return iArr;
    }

    /* renamed from: e */
    public static int[] m154834e(C17969i0 c17969i0) {
        int[] iArr = {0, 0};
        if (c17969i0 == null) {
            return iArr;
        }
        if (c17969i0 instanceof C18009w0) {
            C18009w0 c18009w0 = (C18009w0) c17969i0;
            iArr[0] = c18009w0.m95739D();
            iArr[1] = c18009w0.m95738C();
        } else if (c17969i0 instanceof C17961f1) {
            C17961f1 c17961f1 = (C17961f1) c17969i0;
            iArr[0] = c17961f1.m95458L();
            iArr[1] = c17961f1.m95457K();
        } else if (c17969i0 instanceof C17958e1) {
            C17958e1 c17958e1 = (C17958e1) c17969i0;
            iArr[0] = c17958e1.m95430s();
            iArr[1] = c17958e1.m95429r();
        }
        return iArr;
    }

    /* renamed from: f */
    public static int m154835f(C17969i0 c17969i0) {
        if (c17969i0 == null) {
            return 0;
        }
        if (c17969i0 instanceof C18009w0) {
            return ((C18009w0) c17969i0).m95739D();
        }
        if (c17969i0 instanceof C17961f1) {
            return ((C17961f1) c17969i0).m95458L();
        }
        if (!(c17969i0 instanceof C17958e1)) {
            return 0;
        }
        return ((C17958e1) c17969i0).m95430s();
    }

    /* renamed from: j */
    public static void m154836j(C17969i0 c17969i0, int i11, int i12) {
        if (c17969i0 != null) {
            if (c17969i0 instanceof C18009w0) {
                C18009w0 c18009w0 = (C18009w0) c17969i0;
                c18009w0.m95771i0(i11);
                c18009w0.m95769h0(i12);
            } else if (c17969i0 instanceof C17961f1) {
                C17961f1 c17961f1 = (C17961f1) c17969i0;
                c17961f1.m95447C0(i11);
                c17961f1.m95445B0(i12);
            } else if (c17969i0 instanceof C17958e1) {
                C17958e1 c17958e1 = (C17958e1) c17969i0;
                c17958e1.m95436z(i11);
                c17958e1.m95435y(i12);
            }
        }
    }

    /* renamed from: d */
    public int m154837d(C28771c c28771c) {
        if (c28771c == null) {
            return 0;
        }
        int size = c28771c.m143950j().size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            C17945a0 m143953m = c28771c.m143953m(i12);
            if (m143953m != null) {
                i11 += m154835f(m143953m.m94929K2());
            }
            if (i12 != size - 1) {
                i11 += this.f147869a;
            }
        }
        return i11;
    }

    /* renamed from: g */
    public boolean m154838g(int i11) {
        return this.f147878j.contains(Integer.valueOf(i11));
    }

    /* renamed from: h */
    public void m154839h() {
        boolean z11;
        try {
            JSONObject jSONObject = new JSONObject(AbstractC23309i.m121300P8());
            if (jSONObject.optInt("setting") == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f147870b = z11;
            this.f147871c = Math.max(jSONObject.optInt("total_limit", 10), 0);
            this.f147876h = (int) (Math.min(Math.max(jSONObject.optDouble("min_width", 0.30000001192092896d), 0.0d), 0.3333333432674408d) * 1000.0d);
            this.f147877i = (int) (Math.max(jSONObject.optDouble("min_height", 0.3499999940395355d), 0.0d) * 1000.0d);
            this.f147872d = (int) (Math.min(Math.max(jSONObject.optDouble("threshold", 0.699999988079071d), 0.0d), 1.0d) * 1000.0d);
            this.f147873e = (int) (Math.max(jSONObject.optDouble("height", 0.33329999446868896d), 0.0d) * 1000.0d);
            this.f147874f = (int) (Math.min(Math.max(jSONObject.optDouble("special_threshold", 0.5d), 0.0d), 1.0d) * 1000.0d);
            this.f147875g = (int) (Math.max(jSONObject.optDouble("special_height", 0.4000000059604645d), 0.0d) * 1000.0d);
            this.f147878j.clear();
            JSONArray optJSONArray = jSONObject.optJSONArray("special_condition");
            if (optJSONArray != null && optJSONArray.length() != 0) {
                for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                    this.f147878j.add(Integer.valueOf(optJSONArray.optInt(i11)));
                }
            }
        } catch (JSONException e11) {
            e11.printStackTrace();
            this.f147870b = true;
            this.f147871c = 10;
            this.f147876h = 300;
            this.f147877i = 350;
            this.f147872d = IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING;
            this.f147873e = 333;
            this.f147874f = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;
            this.f147875g = (int) (ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE * 0.4f);
            this.f147878j.clear();
            this.f147878j.add(5);
            this.f147878j.add(7);
            this.f147878j.add(9);
        }
    }

    /* renamed from: i */
    public void m154840i(C28771c c28771c, int i11, int i12) {
        int m154835f;
        int size = c28771c.m143950j().size();
        int i13 = 1000 - (this.f147869a * (size - 1));
        double d11 = i13 / (i11 - r1);
        int max = (int) Math.max(i12 * d11, this.f147877i);
        ArrayList arrayList = new ArrayList();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            try {
                C17969i0 m94929K2 = ((C17945a0) c28771c.m143950j().get(i15)).m94929K2();
                int m154835f2 = (int) (m154835f(m94929K2) * d11);
                int i16 = this.f147876h;
                if (m154835f2 < i16) {
                    m154836j(m94929K2, i16, max);
                    i14++;
                } else {
                    arrayList.add(m94929K2);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        int i17 = this.f147876h * i14;
        int size2 = arrayList.size();
        for (int i18 = 0; i18 < size2; i18++) {
            try {
                C17969i0 c17969i0 = (C17969i0) arrayList.get(i18);
                if (i18 == size2 - 1) {
                    m154835f = i13 - i17;
                } else {
                    m154835f = (int) (m154835f(c17969i0) * d11);
                    i17 += m154835f;
                }
                m154836j(c17969i0, m154835f, max);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }
    }

    private C32091r6() {
        this.f147869a = AbstractC23136l9.m118742r(2.0f);
        this.f147878j = new ArrayList();
        m154839h();
    }
}

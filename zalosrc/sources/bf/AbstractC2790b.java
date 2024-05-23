package bf;

import android.graphics.Bitmap;
import android.location.Location;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bo.C3063z0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import im.C20612c;
import im.C20619j;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import lt.AbstractC22647c;
import org.json.JSONArray;
import org.json.JSONObject;
import vg.C28157p5;

/* renamed from: bf.b */
/* loaded from: classes3.dex */
public abstract class AbstractC2790b {

    /* renamed from: q */
    static final int[] f11107q = {0, 1, 3, 4, 1, 3, 4, 1, 3, 4};

    /* renamed from: r */
    static final int[] f11108r = {0, 2, 2, 2, 3, 3, 3, 5, 5, 5};

    /* renamed from: a */
    public int f11109a;

    /* renamed from: b */
    public int f11110b;

    /* renamed from: c */
    public boolean f11111c;

    /* renamed from: d */
    List f11112d;

    /* renamed from: e */
    JSONObject f11113e;

    /* renamed from: f */
    int[] f11114f;

    /* renamed from: g */
    int[] f11115g;

    /* renamed from: h */
    int[] f11116h;

    /* renamed from: i */
    int f11117i;

    /* renamed from: j */
    String f11118j;

    /* renamed from: k */
    String f11119k;

    /* renamed from: l */
    public double f11120l;

    /* renamed from: m */
    public double f11121m;

    /* renamed from: n */
    public String f11122n;

    /* renamed from: o */
    AbstractC22647c f11123o;

    /* renamed from: p */
    public JSONObject f11124p;

    /* renamed from: bf.b$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo13450a();
    }

    /* renamed from: bf.b$b */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        public float f11125a;

        /* renamed from: b */
        public float f11126b;

        /* renamed from: c */
        public float f11127c;

        /* renamed from: d */
        public int f11128d;

        public b(String[] strArr) {
            if (strArr != null && strArr.length >= 4) {
                this.f11125a = Float.parseFloat(strArr[0]);
                this.f11126b = Float.parseFloat(strArr[1]);
                this.f11127c = Float.parseFloat(strArr[2]);
                this.f11128d = Integer.parseInt(strArr[3]);
                return;
            }
            this.f11125a = 95.0f;
            this.f11126b = 95.0f;
            this.f11127c = 50.0f;
            this.f11128d = 9;
        }
    }

    /* renamed from: bf.b$c */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        public String f11129a;

        /* renamed from: b */
        public String f11130b;

        /* renamed from: c */
        public b f11131c;

        /* renamed from: d */
        public b f11132d;

        public c(JSONObject jSONObject) {
            try {
                this.f11129a = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                this.f11130b = jSONObject.optString("urlLandscape");
                String optString = jSONObject.optString("position");
                if (!TextUtils.isEmpty(optString)) {
                    this.f11131c = new b(optString.split(","));
                }
                String optString2 = jSONObject.optString("positionLandscape");
                if (!TextUtils.isEmpty(optString2)) {
                    this.f11132d = new b(optString2.split(","));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2790b(JSONObject jSONObject) {
        this.f11114f = new int[]{-1};
        this.f11115g = new int[]{-1};
        this.f11116h = new int[]{-1};
        try {
            this.f11109a = jSONObject.optInt("id");
            this.f11110b = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            boolean z11 = true;
            if (jSONObject.optInt("promote") != 1) {
                z11 = false;
            }
            this.f11111c = z11;
            if (jSONObject.has("showtime")) {
                JSONArray jSONArray = jSONObject.getJSONArray("showtime");
                if (jSONArray.length() > 0) {
                    this.f11114f = new int[jSONArray.length()];
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        this.f11114f[i11] = jSONArray.getInt(i11);
                    }
                }
            }
            if (jSONObject.has("dayofweek")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("dayofweek");
                if (jSONArray2.length() > 0) {
                    this.f11115g = new int[jSONArray2.length()];
                    for (int i12 = 0; i12 < jSONArray2.length(); i12++) {
                        this.f11115g[i12] = jSONArray2.getInt(i12);
                    }
                }
            }
            if (jSONObject.has("camera")) {
                JSONArray jSONArray3 = jSONObject.getJSONArray("camera");
                if (jSONArray3.length() > 0) {
                    this.f11116h = new int[jSONArray3.length()];
                    for (int i13 = 0; i13 < jSONArray3.length(); i13++) {
                        this.f11116h[i13] = jSONArray3.getInt(i13);
                    }
                }
            }
            this.f11112d = new ArrayList();
            if (jSONObject.has("items")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("items");
                for (int i14 = 0; i14 < optJSONArray.length(); i14++) {
                    this.f11112d.add(new c(optJSONArray.getJSONObject(i14)));
                }
            }
            if (jSONObject.has("template")) {
                this.f11117i = jSONObject.optInt("template");
            }
            if (jSONObject.has("address1")) {
                this.f11118j = jSONObject.optString("address1");
            }
            if (jSONObject.has("address2")) {
                this.f11119k = jSONObject.optString("address2");
            }
            if (jSONObject.has("icon")) {
                this.f11122n = jSONObject.optString("icon");
            }
            if (jSONObject.has("edited_data")) {
                this.f11124p = jSONObject.getJSONObject("edited_data");
            }
            if (jSONObject.has("longitude")) {
                this.f11120l = jSONObject.optDouble("longitude");
            }
            if (jSONObject.has("latitude")) {
                this.f11121m = jSONObject.optDouble("latitude");
            }
            this.f11113e = jSONObject;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m13440a(Bitmap bitmap, b bVar, float f11, ImageView imageView, int i11, int i12) {
        float[] fArr = new float[2];
        m13444h(bVar, f11, bitmap.getWidth(), bitmap.getHeight(), i11, i12, fArr);
        imageView.setX(fArr[0] - (r9 / 2));
        imageView.setY((i12 - fArr[1]) - (r8 / 2));
        imageView.setLayoutParams(new FrameLayout.LayoutParams((int) (bitmap.getWidth() * f11), (int) (bitmap.getHeight() * f11), 51));
    }

    /* renamed from: b */
    static boolean m13441b(int i11, long j11) {
        if (i11 == -1) {
            return true;
        }
        if (i11 == 0 && j11 >= 5 && j11 < 12) {
            return true;
        }
        if (i11 == 1 && j11 >= 12 && j11 < 18) {
            return true;
        }
        if (i11 != 2 || j11 < 18 || j11 >= 23) {
            return (i11 == 3 && j11 >= 0 && j11 < 5) || j11 >= 23;
        }
        return true;
    }

    /* renamed from: e */
    public static AbstractC2790b m13442e(JSONObject jSONObject) {
        if (jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE) == 1) {
            return new C2789a(jSONObject);
        }
        return new C2792d(jSONObject);
    }

    /* renamed from: f */
    public static void m13443f(List list, List list2, int i11) {
        boolean z11;
        boolean z12;
        int i12;
        try {
            list2.clear();
            int i13 = (Calendar.getInstance().get(7) + 5) % 7;
            long j11 = Calendar.getInstance().get(11);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC2790b abstractC2790b = (AbstractC2790b) it.next();
                    boolean z13 = true;
                    if (abstractC2790b.f11110b != 1 || ((i12 = abstractC2790b.f11117i) >= 1 && i12 <= 17)) {
                        int i14 = 0;
                        while (true) {
                            int[] iArr = abstractC2790b.f11116h;
                            if (i14 < iArr.length) {
                                int i15 = iArr[i14];
                                if (i15 == i11 || i15 == -1) {
                                    break;
                                } else {
                                    i14++;
                                }
                            } else {
                                z11 = false;
                                break;
                            }
                        }
                        z11 = true;
                        int i16 = 0;
                        while (true) {
                            int[] iArr2 = abstractC2790b.f11114f;
                            if (i16 < iArr2.length) {
                                if (m13441b(iArr2[i16], j11)) {
                                    z12 = true;
                                    break;
                                }
                                i16++;
                            } else {
                                z12 = false;
                                break;
                            }
                        }
                        int i17 = 0;
                        while (true) {
                            int[] iArr3 = abstractC2790b.f11115g;
                            if (i17 < iArr3.length) {
                                int i18 = iArr3[i17];
                                if (i18 == i13 || i18 == -1) {
                                    break;
                                } else {
                                    i17++;
                                }
                            } else {
                                z13 = false;
                                break;
                            }
                        }
                        if (z12 && z13 && z11) {
                            list2.add(abstractC2790b);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m13444h(b bVar, float f11, int i11, int i12, int i13, int i14, float[] fArr) {
        float f12;
        float f13;
        float f14;
        int i15 = (int) (i11 * f11);
        int i16 = (int) (i12 * f11);
        int[] iArr = f11107q;
        int i17 = bVar.f11128d;
        int i18 = iArr[i17];
        float f15 = 0.0f;
        if (i18 != 1) {
            if (i18 != 3) {
                if (i18 != 4) {
                    f12 = 0.0f;
                } else {
                    f12 = ((bVar.f11125a * i13) / 100.0f) - (i15 / 2);
                }
            } else {
                f12 = (bVar.f11125a * i13) / 100.0f;
            }
        } else {
            f12 = ((bVar.f11125a * i13) / 100.0f) + (i15 / 2);
        }
        int i19 = f11108r[i17];
        if (i19 != 2) {
            if (i19 != 3) {
                if (i19 == 5) {
                    f13 = i14;
                    f14 = ((bVar.f11126b * f13) / 100.0f) - (i16 / 2);
                }
            } else {
                float f16 = i14;
                f15 = f16 - ((bVar.f11126b * f16) / 100.0f);
            }
            if (fArr == null && fArr.length == 2) {
                fArr[0] = f12;
                fArr[1] = f15;
                return;
            }
        }
        f13 = i14;
        f14 = ((bVar.f11126b * f13) / 100.0f) + (i16 / 2);
        f15 = f13 - f14;
        if (fArr == null) {
        }
    }

    /* renamed from: c */
    public C3063z0 m13445c() {
        String str;
        Location m141673c;
        if (this.f11110b == 1) {
            int i11 = this.f11117i;
            if (i11 != 5 && i11 != 6 && i11 != 7 && i11 != 8 && i11 != 17) {
                str = this.f11118j;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                double d11 = this.f11120l;
                double d12 = this.f11121m;
                if (d11 == 0.0d && d12 == 0.0d && (m141673c = C28157p5.m141667d().m141673c()) != null) {
                    d11 = m141673c.getLongitude();
                    d12 = m141673c.getLatitude();
                }
                return new C3063z0(d11, d12, str, true);
            }
        }
        return null;
    }

    /* renamed from: d */
    public final AbstractC22647c m13446d(boolean z11) {
        AbstractC22647c mo13437k = mo13437k(z11);
        this.f11123o = mo13437k;
        return mo13437k;
    }

    /* renamed from: g */
    public String m13447g() {
        try {
            AbstractC22647c abstractC22647c = this.f11123o;
            if (abstractC22647c != null) {
                JSONObject mo1892F0 = abstractC22647c.mo1892F0();
                if (mo1892F0 != null) {
                    this.f11113e.put("edited_data", mo1892F0);
                } else {
                    this.f11113e.remove("edited_data");
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return this.f11113e.toString();
    }

    /* renamed from: i */
    public List m13448i() {
        return new ArrayList(this.f11112d);
    }

    /* renamed from: j */
    public abstract void mo13436j(ViewGroup viewGroup, int i11, int i12, boolean z11, a aVar);

    /* renamed from: k */
    abstract AbstractC22647c mo13437k(boolean z11);

    /* renamed from: l */
    public void m13449l(C20612c c20612c) {
        c20612c.m107262D(new C20619j(this.f11109a, this.f11110b, this.f11111c));
    }
}

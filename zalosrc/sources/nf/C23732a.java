package nf;

import ag.C0789i;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import bf.AbstractC2790b;
import com.zing.zalo.MainApplication;
import et.C18609p;
import et.C18610q;
import et.InterfaceC18608o;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import lt.AbstractC22647c;
import org.json.JSONArray;
import org.json.JSONObject;
import p239ih.C20556f;
import p276jt.AbstractC21351f;
import p276jt.C21347b;
import p276jt.C21348c;
import p276jt.C21349d;
import p276jt.C21352g;
import p276jt.C21354i;
import p276jt.C21357l;
import p276jt.C21358m;
import p370nt.C23934a;
import vg.AbstractC28236y3;

/* renamed from: nf.a */
/* loaded from: classes3.dex */
public final class C23732a {

    /* renamed from: a */
    private final a f114820a;

    /* renamed from: b */
    private final float[] f114821b;

    /* renamed from: c */
    private AbstractC22647c f114822c;

    /* renamed from: d */
    private final List f114823d;

    /* renamed from: e */
    private C21358m f114824e;

    /* renamed from: f */
    private Bitmap f114825f;

    /* renamed from: g */
    private C18610q f114826g;

    /* renamed from: h */
    private final int f114827h;

    /* renamed from: i */
    private final int f114828i;

    /* renamed from: nf.a$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo124089a(Bitmap bitmap);
    }

    /* renamed from: nf.a$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC18608o.a {
        b() {
        }

        @Override // et.InterfaceC18608o.a
        /* renamed from: a */
        public void mo98330a(Bitmap bitmap) {
            C23732a.this.f114820a.mo124089a(bitmap);
        }

        @Override // et.InterfaceC18608o.a
        /* renamed from: b */
        public void mo98331b(float[] fArr) {
            AbstractC19074t.m100208f(fArr, "pVMatrix");
            C23732a c23732a = C23732a.this;
            C18610q c18610q = new C18610q();
            c18610q.m98344c();
            c23732a.f114826g = c18610q;
            GLES20.glEnable(3042);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16640);
            C0789i c0789i = new C0789i(C23732a.this.f114825f);
            C21358m c21358m = C23732a.this.f114824e;
            if (c21358m != null) {
                C23732a c23732a2 = C23732a.this;
                c21358m.m110690g0(c23732a2.f114827h, c23732a2.f114828i);
                c21358m.m1946J();
                c21358m.m110691j0(c23732a2.f114826g, null, c23732a2.f114827h, c23732a2.f114828i);
            }
            for (AbstractC21351f abstractC21351f : C23732a.this.f114823d) {
                if (abstractC21351f instanceof C21349d) {
                    ((C21349d) abstractC21351f).m110590y0(c0789i);
                }
                abstractC21351f.m110603b0(C23732a.this.f114821b, C23732a.this.f114826g);
            }
            AbstractC22647c abstractC22647c = C23732a.this.f114822c;
            if (abstractC22647c != null) {
                C23732a c23732a3 = C23732a.this;
                abstractC22647c.m1995x();
                abstractC22647c.mo1956Z(c23732a3.f114827h, c23732a3.f114828i);
                abstractC22647c.m1946J();
                abstractC22647c.m117225M0(false);
                abstractC22647c.m117226N0(c23732a3.f114827h, c23732a3.f114828i);
                abstractC22647c.m117224D0(c23732a3.f114821b, c23732a3.f114826g, c23732a3.f114827h, c23732a3.f114828i, c23732a3.f114827h, c23732a3.f114828i, false);
            }
        }

        @Override // et.InterfaceC18608o.a
        /* renamed from: c */
        public Bitmap mo98332c() {
            return null;
        }
    }

    public C23732a(String str, a aVar) {
        AbstractC19074t.m100208f(str, "jsonString");
        AbstractC19074t.m100208f(aVar, "mListener");
        this.f114820a = aVar;
        float[] fArr = new float[16];
        this.f114821b = fArr;
        this.f114823d = new ArrayList();
        JSONObject jSONObject = new JSONObject(str);
        int optDouble = (int) jSONObject.optDouble("nw");
        this.f114827h = optDouble;
        int optDouble2 = (int) jSONObject.optDouble("nh");
        this.f114828i = optDouble2;
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        Matrix.orthoM(fArr2, 0, 0.0f, optDouble, 0.0f, optDouble2, 0.0f, 100.0f);
        Matrix.setLookAtM(fArr3, 0, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr3, 0);
        if (jSONObject.has("decor_objects_data")) {
            JSONArray jSONArray = new JSONArray(jSONObject.optString("decor_objects_data"));
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                AbstractC21351f m110601l0 = AbstractC21351f.m110601l0(jSONArray.getJSONObject(i11));
                if (m110601l0 != null) {
                    if (m110601l0 instanceof C21354i) {
                        C21354i c21354i = (C21354i) m110601l0;
                        InputStream m106838k = new C20556f(c21354i.m110643x0()).m106838k();
                        c21354i.m110645z0(BitmapFactory.decodeStream(m106838k));
                        if (m106838k != null) {
                            try {
                                m106838k.close();
                            } catch (Exception e11) {
                                AbstractC20110a.f98889a.mo104552e(e11);
                            }
                        }
                    } else if (m110601l0 instanceof C21357l) {
                        ((C21357l) m110601l0).m110671X0(MainApplication.Companion.m35500c());
                    } else if ((m110601l0 instanceof C21349d) && this.f114825f == null) {
                        this.f114825f = AbstractC28236y3.m142194e("emoticon.png");
                    }
                    this.f114823d.add(m110601l0);
                }
            }
        }
        if (jSONObject.has("doodle_data")) {
            C21348c c21348c = new C21348c();
            C21352g c21352g = new C21352g();
            Resources resources = MainApplication.Companion.m35500c().getResources();
            c21348c.m110578m0(new C21347b[]{new C21347b(resources, 0), new C21347b(resources, 1), new C21347b(resources, 2), new C21347b(resources, 3)});
            c21348c.m110580o0(0);
            c21352g.m110638u0(new C23934a[]{new C23934a(0), new C23934a(1), new C23934a(2)});
            c21352g.m110636s0(0);
            C21358m c21358m = new C21358m(c21348c, c21352g);
            c21358m.m110695p0(jSONObject.optString("doodle_data"));
            this.f114824e = c21358m;
        }
        if (jSONObject.has("location_filter_data")) {
            this.f114822c = AbstractC2790b.m13442e(new JSONObject(jSONObject.optString("location_filter_data"))).m13446d(true);
        }
        b bVar = new b();
        C18609p c18609p = new C18609p(this.f114827h, this.f114828i, EGL14.EGL_NO_CONTEXT, null);
        c18609p.mo98328a(bVar);
        c18609p.mo98329b();
    }
}

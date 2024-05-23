package p276jt;

import ag.AbstractC0784d;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.lifecycle.C1761c0;
import androidx.lifecycle.LiveData;
import cg.AbstractC3455c;
import com.zing.zalo.imgdecor.model.model.ArrowData;
import com.zing.zalo.imgdecor.model.model.CircleData;
import com.zing.zalo.imgdecor.model.model.PaintData;
import com.zing.zalo.imgdecor.model.model.RectData;
import et.C18610q;
import im.C20612c;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23237v1;
import mt.AbstractC23441a;
import mt.AbstractC23442b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p305kt.InterfaceC21941a;
import p305kt.InterfaceC21942b;
import p575vf.C27998a;
import p643xf.C29609b;
import se0.AbstractC26236a;
import se0.AbstractC26237b;

/* renamed from: jt.m */
/* loaded from: classes4.dex */
public class C21358m extends AbstractC0784d implements InterfaceC21942b {

    /* renamed from: F */
    private final C21348c f104110F;

    /* renamed from: G */
    private final C21352g f104111G;

    /* renamed from: H */
    private C29609b f104112H;

    /* renamed from: J */
    private C27998a f104114J;

    /* renamed from: K */
    private FloatBuffer f104115K;

    /* renamed from: L */
    private FloatBuffer f104116L;

    /* renamed from: Q */
    private int f104121Q;

    /* renamed from: R */
    private int f104122R;

    /* renamed from: X */
    private InterfaceC21941a f104128X;

    /* renamed from: I */
    private final Object f104113I = new Object();

    /* renamed from: M */
    private boolean f104117M = false;

    /* renamed from: N */
    private boolean f104118N = false;

    /* renamed from: O */
    private boolean f104119O = false;

    /* renamed from: P */
    private boolean f104120P = true;

    /* renamed from: S */
    private boolean f104123S = false;

    /* renamed from: T */
    private boolean f104124T = false;

    /* renamed from: U */
    private List f104125U = new ArrayList();

    /* renamed from: V */
    private final List f104126V = new ArrayList();

    /* renamed from: W */
    private final C1761c0 f104127W = new C1761c0();

    public C21358m(C21348c c21348c, C21352g c21352g) {
        this.f104110F = c21348c;
        this.f104111G = c21352g;
        c21348c.m110583t0(this);
        c21352g.m110640w0(this);
    }

    /* renamed from: b0 */
    private List m110678b0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC23441a abstractC23441a = (AbstractC23441a) it.next();
            if (abstractC23441a instanceof PaintData) {
                arrayList.add(this.f104110F.m110572d0((PaintData) abstractC23441a));
            } else {
                arrayList.add(abstractC23441a);
            }
        }
        return arrayList;
    }

    /* renamed from: h0 */
    public static boolean m110679h0(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("draw_data")) {
                return true;
            }
            if (jSONObject.getJSONArray("draw_data").length() >= 1) {
                return false;
            }
            return true;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* renamed from: i0 */
    private void m110680i0() {
        List list = this.f104125U;
        if (list != null) {
            this.f104127W.mo9221n(Integer.valueOf(list.size()));
        }
    }

    /* renamed from: m0 */
    private void m110681m0() {
        for (int size = this.f104125U.size() - 1; size >= 0; size--) {
            AbstractC23441a abstractC23441a = (AbstractC23441a) this.f104125U.get(size);
            if ((abstractC23441a instanceof PaintData) && ((PaintData) abstractC23441a).f47735r == 3) {
                this.f104125U.remove(size);
                this.f104126V.remove(size);
                return;
            }
        }
    }

    /* renamed from: n0 */
    private void m110682n0() {
        for (int size = this.f104125U.size() - 1; size >= 0; size--) {
            AbstractC23441a abstractC23441a = (AbstractC23441a) this.f104125U.get(size);
            if (!(abstractC23441a instanceof PaintData) || ((PaintData) abstractC23441a).f47735r != 3) {
                this.f104125U.remove(size);
                this.f104126V.remove(size);
                return;
            }
        }
    }

    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: A */
    public void mo1905A() {
        super.mo1905A();
        C27998a c27998a = this.f104114J;
        if (c27998a != null) {
            AbstractC26236a.m134900g(c27998a);
            this.f104114J = null;
        }
        this.f104110F.destroy();
        this.f104111G.destroy();
        C29609b c29609b = this.f104112H;
        if (c29609b != null) {
            c29609b.destroy();
            this.f104112H = null;
        }
    }

    /* renamed from: A0 */
    public void m110683A0(C20612c c20612c) {
        Iterator it = this.f104126V.iterator();
        while (it.hasNext()) {
            c20612c.m107298v().add(((AbstractC23441a) it.next()).mo47635b());
        }
    }

    @Override // ag.AbstractC0791k
    /* renamed from: B */
    public void mo1965B() {
        super.mo1965B();
        C29609b c29609b = this.f104112H;
        if (c29609b != null) {
            c29609b.m1993v();
        }
    }

    @Override // ag.AbstractC0791k
    /* renamed from: C */
    public void mo1966C() {
        super.mo1966C();
        C29609b c29609b = this.f104112H;
        if (c29609b != null) {
            c29609b.m1994w();
        }
    }

    @Override // ag.AbstractC0784d, ag.AbstractC0791k
    /* renamed from: D */
    public void mo1889D() {
        super.mo1889D();
        if (this.f104121Q != 0 && this.f104122R != 0) {
            C27998a c27998a = this.f104114J;
            if (c27998a != null) {
                AbstractC26236a.m134900g(c27998a);
                this.f104114J = null;
            }
            this.f104114J = AbstractC26236a.m134906m(this.f104121Q, this.f104122R);
            this.f104110F.m1995x();
            this.f104111G.m1995x();
            this.f104118N = true;
            InterfaceC21941a interfaceC21941a = this.f104128X;
            if (interfaceC21941a != null) {
                interfaceC21941a.mo38276h();
            }
        }
    }

    @Override // ag.AbstractC0791k
    /* renamed from: E */
    public void mo1890E() {
        super.mo1890E();
        C29609b c29609b = this.f104112H;
        if (c29609b != null) {
            c29609b.m1996y();
        }
    }

    @Override // ag.AbstractC0784d
    /* renamed from: R */
    protected void mo1909R() {
    }

    @Override // ag.AbstractC0784d
    /* renamed from: S */
    public void mo1897S(boolean z11) {
        super.mo1897S(z11);
        if (this.f104121Q != 0 && this.f104122R != 0) {
            this.f104115K = AbstractC26237b.m134918c(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
            this.f104116L = AbstractC26237b.m134918c(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
            this.f104110F.m110581p0(m1949M(), m1948L());
            this.f104111G.m110637t0(m1949M(), m1948L());
            C29609b c29609b = this.f104112H;
            if (c29609b != null) {
                c29609b.mo1956Z(m1949M(), m1948L());
            }
        }
    }

    /* renamed from: a0 */
    public void m110684a0() {
        this.f104125U.clear();
        this.f104126V.clear();
    }

    /* renamed from: c0 */
    public LiveData m110685c0() {
        return this.f104127W;
    }

    /* renamed from: d0 */
    public boolean m110686d0() {
        for (int i11 = 0; i11 < this.f104125U.size(); i11++) {
            AbstractC23441a abstractC23441a = (AbstractC23441a) this.f104125U.get(i11);
            if ((abstractC23441a instanceof PaintData) && ((PaintData) abstractC23441a).f47735r == 3) {
                return true;
            }
        }
        return false;
    }

    @Override // p305kt.InterfaceC21942b
    /* renamed from: e */
    public void mo110687e(AbstractC23441a abstractC23441a, AbstractC23441a abstractC23441a2) {
        this.f104125U.add(abstractC23441a);
        if (abstractC23441a2 != null) {
            this.f104126V.add(abstractC23441a2);
        } else {
            this.f104126V.add(abstractC23441a);
        }
        m110680i0();
    }

    /* renamed from: e0 */
    public boolean m110688e0() {
        if (this.f104125U.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public boolean m110689f0() {
        for (int i11 = 0; i11 < this.f104125U.size(); i11++) {
            AbstractC23441a abstractC23441a = (AbstractC23441a) this.f104125U.get(i11);
            if (!(abstractC23441a instanceof PaintData) || ((PaintData) abstractC23441a).f47735r != 3) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g0 */
    public void m110690g0(int i11, int i12) {
        if (this.f104121Q != i11 || this.f104122R != i12) {
            this.f104121Q = i11;
            this.f104122R = i12;
            mo1956Z(i11, i12);
            m1995x();
        }
    }

    /* renamed from: j0 */
    public void m110691j0(C18610q c18610q, FloatBuffer floatBuffer, int i11, int i12) {
        int i13;
        int i14;
        InterfaceC21941a interfaceC21941a;
        if (this.f104114J != null && (i13 = this.f104121Q) != 0 && (i14 = this.f104122R) != 0) {
            GLES20.glViewport(0, 0, i13, i14);
            if (!this.f104117M && !this.f104118N) {
                if (this.f104119O) {
                    this.f104110F.m110571c0();
                    this.f104111G.m110631d0();
                    synchronized (this.f104113I) {
                        this.f104119O = false;
                    }
                }
                if (this.f104120P) {
                    this.f104110F.m110573e0(this.f104114J, c18610q, this.f104116L);
                } else {
                    this.f104111G.m110632f0(this.f104114J, c18610q);
                }
            } else {
                AbstractC23237v1.m119715c("DoodleRenderer onDrawFrame Restore");
                if (this.f104125U.size() > 0) {
                    this.f104114J.m141108a();
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16640);
                    boolean z11 = this.f104117M;
                    if (z11 && this.f104123S) {
                        m110681m0();
                        m110680i0();
                    } else if (z11 && this.f104124T) {
                        m110682n0();
                        m110680i0();
                    } else if (z11) {
                        this.f104125U.remove(r0.size() - 1);
                        this.f104126V.remove(r0.size() - 1);
                        m110680i0();
                    }
                    for (AbstractC23441a abstractC23441a : this.f104125U) {
                        if (abstractC23441a.m123103d()) {
                            this.f104110F.m110575j0((PaintData) abstractC23441a, c18610q, this.f104116L);
                        } else {
                            this.f104111G.m110634q0((AbstractC23442b) abstractC23441a);
                        }
                    }
                    this.f104114J.m141115j();
                    this.f104110F.m110571c0();
                    this.f104110F.m110576k0();
                    this.f104111G.m110631d0();
                }
                if (this.f104118N && (interfaceC21941a = this.f104128X) != null) {
                    interfaceC21941a.mo38263c();
                }
                synchronized (this.f104113I) {
                    this.f104117M = false;
                    this.f104118N = false;
                    this.f104123S = false;
                    this.f104124T = false;
                }
                AbstractC23237v1.m119713a("DoodleRenderer onDrawFrame Restore");
            }
            GLES20.glViewport(0, 0, i11, i12);
            if (floatBuffer == null) {
                floatBuffer = this.f104115K;
            }
            c18610q.m98343b(this.f104114J.m141113g(), floatBuffer, this.f104116L, 1.0f);
            if (this.f104120P) {
                this.f104110F.m110570a0(c18610q, floatBuffer, this.f104116L);
            } else {
                this.f104111G.m110630a0(c18610q, floatBuffer, this.f104116L);
            }
        }
    }

    /* renamed from: k0 */
    public void m110692k0(MotionEvent motionEvent, float f11, float f12) {
        if (!this.f104117M && !this.f104118N) {
            if (this.f104120P) {
                this.f104110F.m110574i0(motionEvent, f11, f12);
            } else {
                this.f104111G.m110633p0(motionEvent, f11, f12);
            }
        }
    }

    /* renamed from: l0 */
    public void m110693l0(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            synchronized (this.f104113I) {
                try {
                    Iterator it = this.f104126V.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((AbstractC23441a) it.next()).mo47638h());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jSONObject.put("draw_data", jSONArray);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o0 */
    public void m110694o0() {
        synchronized (this.f104113I) {
            this.f104118N = true;
        }
    }

    /* renamed from: p0 */
    public void m110695p0(String str) {
        JSONArray optJSONArray;
        AbstractC23441a abstractC23441a;
        AbstractC23441a abstractC23441a2;
        this.f104125U.clear();
        this.f104126V.clear();
        try {
            try {
                if (!TextUtils.isEmpty(str) && (optJSONArray = new JSONObject(str).optJSONArray("draw_data")) != null && optJSONArray.length() > 0) {
                    synchronized (this.f104113I) {
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            try {
                                JSONObject jSONObject = optJSONArray.getJSONObject(i11);
                                if (jSONObject.optInt("mo") == 0) {
                                    abstractC23441a2 = new PaintData();
                                    abstractC23441a2.mo47634a(optJSONArray.getJSONObject(i11));
                                } else {
                                    int optInt = jSONObject.optInt("ty");
                                    if (optInt != 0) {
                                        if (optInt != 1) {
                                            if (optInt != 2) {
                                                abstractC23441a2 = null;
                                            } else {
                                                AbstractC23441a rectData = new RectData(optInt);
                                                rectData.mo47634a(jSONObject);
                                                abstractC23441a = rectData;
                                            }
                                        } else {
                                            AbstractC23441a arrowData = new ArrowData(optInt);
                                            arrowData.mo47634a(jSONObject);
                                            abstractC23441a = arrowData;
                                        }
                                    } else {
                                        AbstractC23441a circleData = new CircleData(optInt);
                                        circleData.mo47634a(jSONObject);
                                        abstractC23441a = circleData;
                                    }
                                    abstractC23441a2 = abstractC23441a;
                                }
                                if (abstractC23441a2 != null) {
                                    this.f104126V.add(abstractC23441a2);
                                }
                            } finally {
                            }
                        }
                        this.f104125U = m110678b0(this.f104126V);
                        m110680i0();
                    }
                }
            } catch (JSONException e11) {
                e11.printStackTrace();
            }
        } finally {
            this.f104118N = true;
        }
    }

    /* renamed from: q0 */
    public void m110696q0(Context context, Bitmap bitmap, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        if (!m1992u()) {
            AbstractC3455c.m17397a("setBackground in non-gl thread");
            return;
        }
        if (bitmap == null) {
            return;
        }
        C29609b c29609b = this.f104112H;
        if (c29609b == null) {
            C29609b c29609b2 = new C29609b(context, bitmap, floatBuffer, floatBuffer2);
            this.f104112H = c29609b2;
            c29609b2.m1995x();
            this.f104112H.mo1956Z(m1949M(), m1948L());
        } else {
            c29609b.m147179d0(bitmap);
        }
        this.f104110F.m110577l0(this.f104112H);
    }

    /* renamed from: r0 */
    public void m110697r0(boolean z11) {
        synchronized (this.f104113I) {
            this.f104119O = true;
        }
        this.f104120P = z11;
    }

    /* renamed from: s0 */
    public void m110698s0(int i11) {
        this.f104110F.m110579n0(i11);
        this.f104111G.m110635r0(i11);
    }

    /* renamed from: t0 */
    public void m110699t0(int i11) {
        synchronized (this.f104113I) {
            this.f104119O = true;
        }
        this.f104110F.m110580o0(i11);
    }

    /* renamed from: u0 */
    public void m110700u0(int i11) {
        synchronized (this.f104113I) {
            this.f104119O = true;
        }
        this.f104111G.m110636s0(i11);
    }

    /* renamed from: v0 */
    public void m110701v0(InterfaceC21941a interfaceC21941a) {
        this.f104128X = interfaceC21941a;
    }

    /* renamed from: w0 */
    public void m110702w0(float f11, int... iArr) {
        this.f104110F.m110582q0(f11, iArr);
        this.f104111G.m110639v0(f11);
    }

    /* renamed from: x0 */
    public void m110703x0() {
        if (m110688e0()) {
            synchronized (this.f104113I) {
                this.f104117M = true;
            }
        }
    }

    /* renamed from: y0 */
    public void m110704y0() {
        if (m110686d0()) {
            synchronized (this.f104113I) {
                this.f104117M = true;
                this.f104123S = true;
                this.f104124T = false;
            }
        }
    }

    /* renamed from: z0 */
    public void m110705z0() {
        if (m110689f0()) {
            synchronized (this.f104113I) {
                this.f104117M = true;
                this.f104124T = true;
                this.f104123S = false;
            }
        }
    }
}

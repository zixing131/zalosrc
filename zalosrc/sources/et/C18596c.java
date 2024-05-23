package et;

import android.opengl.GLES20;
import bg.C2794a;
import cg.C3459g;
import gt.AbstractC19593a;
import gt.C19594b;
import gt.C19595c;
import gt.C19596d;
import gt.C19597e;
import gt.C19598f;
import gt.C19599g;
import gt.C19600h;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p546uf.InterfaceC27243b;
import p575vf.C27998a;
import p575vf.C28000c;
import se0.AbstractC26237b;

/* renamed from: et.c */
/* loaded from: classes4.dex */
public class C18596c implements InterfaceC27243b {

    /* renamed from: a */
    private String f93471a;

    /* renamed from: b */
    private final LinkedList f93472b;

    /* renamed from: c */
    private C2794a f93473c;

    /* renamed from: d */
    private final String f93474d;

    /* renamed from: e */
    private final String f93475e;

    /* renamed from: f */
    int f93476f;

    /* renamed from: g */
    int f93477g;

    /* renamed from: h */
    private boolean f93478h;

    /* renamed from: i */
    private final FloatBuffer f93479i;

    /* renamed from: j */
    protected float f93480j;

    /* renamed from: k */
    private final float[] f93481k;

    /* renamed from: l */
    private final Object f93482l;

    /* renamed from: m */
    private final List f93483m;

    /* renamed from: n */
    private boolean f93484n;

    public C18596c() {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
    }

    /* renamed from: k */
    private void m98204k() {
    }

    /* renamed from: n */
    public static C18596c m98205n(JSONArray jSONArray, C3459g c3459g) {
        if (jSONArray.length() == 1) {
            return new C18596c(jSONArray.getJSONObject(0), c3459g);
        }
        if (jSONArray.length() > 1) {
            return new C18597d(jSONArray, c3459g);
        }
        return null;
    }

    /* renamed from: o */
    public static C18596c m98206o(JSONObject jSONObject, C3459g c3459g) {
        String string = jSONObject.getString("name");
        C18596c m98205n = m98205n(jSONObject.getJSONArray("pipeline"), c3459g);
        if (m98205n != null) {
            m98205n.f93471a = string;
        }
        return m98205n;
    }

    @Override // p546uf.InterfaceC27243b
    /* renamed from: a */
    public void mo98207a(int i11, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        synchronized (this.f93482l) {
            try {
                if (this.f93478h) {
                    if (this.f93484n) {
                        for (AbstractC19593a abstractC19593a : this.f93483m) {
                            if (abstractC19593a instanceof C19598f) {
                                C19598f c19598f = (C19598f) abstractC19593a;
                                C27998a m141118c = C28000c.m141116b().m141118c(this.f93476f, this.f93477g);
                                c19598f.f97356e = m141118c;
                                m141118c.m141108a();
                                m98210e("activeFrameBuffer");
                                c19598f.f97355d.mo98207a(i11, floatBuffer, floatBuffer2);
                                c19598f.f97356e.m141115j();
                                m98210e("restoreOldBuffer");
                            }
                        }
                    }
                    this.f93473c.m13466h();
                    m98218q();
                    int i12 = 0;
                    floatBuffer.position(0);
                    GLES20.glVertexAttribPointer(this.f93473c.m13460b("position"), 2, 5126, false, 0, (Buffer) floatBuffer);
                    GLES20.glEnableVertexAttribArray(this.f93473c.m13460b("position"));
                    m98210e("position");
                    int i13 = 0;
                    for (AbstractC19593a abstractC19593a2 : this.f93483m) {
                        if (abstractC19593a2 instanceof C19595c) {
                            C19595c c19595c = (C19595c) abstractC19593a2;
                            floatBuffer2.position(i12);
                            GLES20.glVertexAttribPointer(this.f93473c.m13460b(c19595c.f97351c), 2, 5126, false, 0, (Buffer) floatBuffer2);
                            GLES20.glEnableVertexAttribArray(this.f93473c.m13460b(c19595c.f97351c));
                            m98210e("FilterParamInput" + i13);
                            GLES20.glActiveTexture(33984 + i13);
                            m98210e("FilterParamInput" + i13);
                            GLES20.glBindTexture(3553, i11);
                            m98210e("FilterParamInput" + i13);
                            GLES20.glUniform1i(this.f93473c.m13460b(abstractC19593a2.f97339a), i13);
                            m98210e("FilterParamInput" + i13);
                        } else if (abstractC19593a2 instanceof C19598f) {
                            C19598f c19598f2 = (C19598f) abstractC19593a2;
                            FloatBuffer floatBuffer3 = this.f93479i;
                            FloatBuffer floatBuffer4 = c19598f2.f97357f;
                            if (floatBuffer4 != null) {
                                floatBuffer3 = floatBuffer4;
                            }
                            floatBuffer3.position(0);
                            GLES20.glVertexAttribPointer(this.f93473c.m13460b(c19598f2.f97354c), 2, 5126, false, 0, (Buffer) floatBuffer3);
                            GLES20.glEnableVertexAttribArray(this.f93473c.m13460b(c19598f2.f97354c));
                            m98210e("FilterParamOtherFilter" + i13);
                            GLES20.glActiveTexture(33984 + i13);
                            m98210e("FilterParamOtherFilter" + i13);
                            GLES20.glBindTexture(3553, c19598f2.f97356e.f130577a[1]);
                            m98210e("FilterParamOtherFilter" + i13);
                            GLES20.glUniform1i(this.f93473c.m13460b(abstractC19593a2.f97339a), i13);
                            m98210e("FilterParamOtherFilter" + i13);
                        } else if (abstractC19593a2 instanceof C19599g) {
                            C19599g c19599g = (C19599g) abstractC19593a2;
                            FloatBuffer floatBuffer5 = this.f93479i;
                            FloatBuffer floatBuffer6 = c19599g.f97359d;
                            if (floatBuffer6 != null) {
                                floatBuffer5 = floatBuffer6;
                            }
                            floatBuffer5.position(0);
                            Arrays.fill(this.f93481k, 0.0f);
                            floatBuffer5.get(this.f93481k);
                            float f11 = this.f93480j;
                            if (f11 != 1.0f && !this.f93484n) {
                                float[] fArr = this.f93481k;
                                fArr[0] = fArr[0] * f11;
                                fArr[2] = fArr[2] * f11;
                                fArr[4] = fArr[4] * f11;
                                fArr[6] = fArr[6] * f11;
                            }
                            c19599g.f97360e.clear();
                            c19599g.f97360e.put(this.f93481k);
                            c19599g.f97360e.position(0);
                            if (this.f93473c.m13460b(c19599g.f97358c) > -1) {
                                GLES20.glVertexAttribPointer(this.f93473c.m13460b(c19599g.f97358c), 2, 5126, false, 0, (Buffer) c19599g.f97360e);
                                GLES20.glEnableVertexAttribArray(this.f93473c.m13460b(c19599g.f97358c));
                                m98210e("FilterParamTexture");
                            }
                            GLES20.glActiveTexture(33984 + i13);
                            m98210e("FilterParamTexture glActiveTexture" + i13);
                            GLES20.glBindTexture(3553, c19599g.m102568b());
                            m98210e("FilterParamTexture glBindTexture" + i13);
                            GLES20.glUniform1i(this.f93473c.m13460b(abstractC19593a2.f97339a), i13);
                            m98210e("FilterParamTexture" + i13);
                        } else {
                            if (abstractC19593a2 instanceof C19594b) {
                                GLES20.glUniform1f(this.f93473c.m13460b(abstractC19593a2.f97339a), ((C19594b) abstractC19593a2).f97350c);
                                m98210e("FilterParamFloat");
                            } else if (abstractC19593a2 instanceof C19596d) {
                                GLES20.glUniform1i(this.f93473c.m13460b(abstractC19593a2.f97339a), ((C19596d) abstractC19593a2).f97352c);
                                m98210e("FilterParamInt");
                            } else if (abstractC19593a2 instanceof C19600h) {
                                C19600h c19600h = (C19600h) abstractC19593a2;
                                float[] fArr2 = c19600h.f97367c;
                                if (fArr2.length == 2) {
                                    GLES20.glUniform2fv(this.f93473c.m13460b(abstractC19593a2.f97339a), 1, c19600h.f97367c, 0);
                                } else if (fArr2.length == 3) {
                                    GLES20.glUniform3fv(this.f93473c.m13460b(abstractC19593a2.f97339a), 1, c19600h.f97367c, 0);
                                } else if (fArr2.length == 4) {
                                    GLES20.glUniform4fv(this.f93473c.m13460b(abstractC19593a2.f97339a), 1, c19600h.f97367c, 0);
                                }
                                m98210e("FilterParamVector");
                            } else if (abstractC19593a2 instanceof C19597e) {
                                C19597e c19597e = (C19597e) abstractC19593a2;
                                float[] fArr3 = c19597e.f97353c;
                                if (fArr3.length == 4) {
                                    GLES20.glUniformMatrix2fv(this.f93473c.m13460b(abstractC19593a2.f97339a), 1, false, c19597e.f97353c, 0);
                                } else if (fArr3.length == 9) {
                                    GLES20.glUniformMatrix3fv(this.f93473c.m13460b(abstractC19593a2.f97339a), 1, false, c19597e.f97353c, 0);
                                } else if (fArr3.length == 16) {
                                    GLES20.glUniformMatrix4fv(this.f93473c.m13460b(abstractC19593a2.f97339a), 1, false, c19597e.f97353c, 0);
                                }
                                m98210e("FilterParamMatrix");
                            }
                            i12 = 0;
                        }
                        i13++;
                        i12 = 0;
                    }
                    if (this.f93473c.m13460b("inputWidth") > -1) {
                        GLES20.glUniform1i(this.f93473c.m13460b("inputWidth"), this.f93476f);
                        m98210e("inputWidth");
                    }
                    if (this.f93473c.m13460b("inputHeight") > -1) {
                        GLES20.glUniform1i(this.f93473c.m13460b("inputHeight"), this.f93477g);
                        m98210e("inputHeight");
                    }
                    m98204k();
                    GLES20.glDrawArrays(5, 0, 4);
                    m98210e("glDrawArrays");
                    if (this.f93484n) {
                        for (AbstractC19593a abstractC19593a3 : this.f93483m) {
                            if (abstractC19593a3 instanceof C19598f) {
                                C19598f c19598f3 = (C19598f) abstractC19593a3;
                                C28000c.m141116b().m141119d(c19598f3.f97356e);
                                c19598f3.f97356e = null;
                            }
                        }
                    }
                    for (AbstractC19593a abstractC19593a4 : this.f93483m) {
                        if (abstractC19593a4 instanceof C19595c) {
                            GLES20.glDisableVertexAttribArray(this.f93473c.m13460b(((C19595c) abstractC19593a4).f97351c));
                            m98210e(" FilterParamInput glDisableVertexAttribArray" + i13);
                        } else if (abstractC19593a4 instanceof C19598f) {
                            GLES20.glDisableVertexAttribArray(this.f93473c.m13460b(((C19598f) abstractC19593a4).f97354c));
                            m98210e("FilterParamOtherFilter glDisableVertexAttribArray" + i13);
                        } else if (abstractC19593a4 instanceof C19599g) {
                            C19599g c19599g2 = (C19599g) abstractC19593a4;
                            if (this.f93473c.m13460b(c19599g2.f97358c) > -1) {
                                GLES20.glDisableVertexAttribArray(this.f93473c.m13460b(c19599g2.f97358c));
                                m98210e("FilterParamTexture glDisableVertexAttribArray");
                            }
                        }
                    }
                    GLES20.glBindTexture(3553, 0);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p546uf.InterfaceC27243b
    /* renamed from: b */
    public void mo98208b(int i11, int i12) {
        synchronized (this.f93482l) {
            try {
                if (this.f93484n) {
                    for (AbstractC19593a abstractC19593a : this.f93483m) {
                        if (abstractC19593a instanceof C19598f) {
                            ((C19598f) abstractC19593a).f97355d.mo98208b(i11, i12);
                        }
                    }
                }
                this.f93476f = i11;
                this.f93477g = i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p546uf.InterfaceC27243b
    /* renamed from: c */
    public final void mo98209c() {
        synchronized (this.f93482l) {
            try {
                if (!this.f93478h) {
                    for (AbstractC19593a abstractC19593a : this.f93483m) {
                        if (abstractC19593a instanceof C19598f) {
                            ((C19598f) abstractC19593a).f97355d.mo98209c();
                        } else if (abstractC19593a instanceof C19599g) {
                            ((C19599g) abstractC19593a).m102569c();
                        }
                    }
                    mo98215l();
                    this.f93478h = true;
                    mo98216m();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p546uf.InterfaceC27243b
    public final void destroy() {
        synchronized (this.f93482l) {
            try {
                if (this.f93478h) {
                    try {
                        this.f93478h = false;
                        C2794a c2794a = this.f93473c;
                        if (c2794a != null) {
                            c2794a.m13459a();
                        }
                        mo98214j();
                        for (AbstractC19593a abstractC19593a : this.f93483m) {
                            if (abstractC19593a instanceof C19598f) {
                                ((C19598f) abstractC19593a).f97355d.destroy();
                            } else if (abstractC19593a instanceof C19599g) {
                                ((C19599g) abstractC19593a).m102570d();
                            }
                        }
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public void m98210e(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            AbstractC23350e.m122774d("GPUImageFilter_" + mo98212g(), "checkGlError: " + str + ": glError " + glGetError);
        }
    }

    @Override // p546uf.InterfaceC27243b
    /* renamed from: f */
    public String mo98211f() {
        return this.f93471a;
    }

    /* renamed from: g */
    public String mo98212g() {
        return this.f93471a;
    }

    /* renamed from: h */
    public int m98213h() {
        return this.f93473c.m13463e();
    }

    /* renamed from: j */
    public void mo98214j() {
    }

    /* renamed from: l */
    public void mo98215l() {
        try {
            C2794a c2794a = new C2794a();
            this.f93473c = c2794a;
            c2794a.m13464f(this.f93474d, this.f93475e);
            this.f93478h = true;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public void mo98216m() {
    }

    /* renamed from: p */
    protected void m98217p(Runnable runnable) {
        synchronized (this.f93472b) {
            this.f93472b.addLast(runnable);
        }
    }

    /* renamed from: q */
    protected void m98218q() {
        while (!this.f93472b.isEmpty()) {
            ((Runnable) this.f93472b.removeFirst()).run();
        }
    }

    /* renamed from: r */
    public void m98219r(int i11, float f11) {
        m98217p(new Runnable() { // from class: et.b

            /* renamed from: p */
            public final /* synthetic */ int f93469p;

            /* renamed from: q */
            public final /* synthetic */ float f93470q;

            public /* synthetic */ RunnableC18595b(int i112, float f112) {
                r1 = i112;
                r2 = f112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GLES20.glUniform1f(r1, r2);
            }
        });
    }

    public String toString() {
        return "GPUImageFilter{mName='" + mo98212g() + "'}";
    }

    public C18596c(String str, String str2) {
        this.f93472b = new LinkedList();
        this.f93480j = 1.0f;
        this.f93481k = new float[8];
        this.f93482l = new Object();
        LinkedList linkedList = new LinkedList();
        this.f93483m = linkedList;
        this.f93484n = false;
        this.f93474d = str;
        this.f93475e = str2;
        this.f93479i = AbstractC26237b.m134918c(AbstractC26237b.f124629d);
        linkedList.add(new C19595c("inputImageTexture", "inputTextureCoordinate"));
    }

    public C18596c(JSONObject jSONObject, C3459g c3459g) {
        this.f93472b = new LinkedList();
        this.f93480j = 1.0f;
        this.f93481k = new float[8];
        this.f93482l = new Object();
        this.f93483m = new LinkedList();
        this.f93484n = false;
        this.f93471a = jSONObject.getString("name");
        this.f93474d = c3459g.m17430e(jSONObject.getString("vshader"));
        this.f93475e = c3459g.m17430e(jSONObject.getString("fshader"));
        this.f93479i = AbstractC26237b.m134918c(AbstractC26237b.f124629d);
        JSONArray optJSONArray = jSONObject.optJSONArray("param");
        for (int i11 = 0; optJSONArray != null && i11 < optJSONArray.length(); i11++) {
            AbstractC19593a m102566a = AbstractC19593a.m102566a(optJSONArray.getJSONObject(i11), c3459g);
            this.f93483m.add(m102566a);
            this.f93484n = this.f93484n || (m102566a instanceof C19598f);
        }
        this.f93480j = 1.0f;
    }
}

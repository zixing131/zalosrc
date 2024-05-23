package et;

import android.opengl.GLES20;
import cg.C3459g;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import p575vf.C27998a;
import p575vf.C28000c;
import se0.AbstractC26237b;

/* renamed from: et.d */
/* loaded from: classes4.dex */
public class C18597d extends C18596c {

    /* renamed from: o */
    private final List f93485o;

    /* renamed from: p */
    private final FloatBuffer f93486p;

    /* renamed from: q */
    private final FloatBuffer f93487q;

    /* renamed from: r */
    private final FloatBuffer f93488r;

    private C18597d() {
        this.f93485o = new ArrayList();
        this.f93486p = AbstractC26237b.m134918c(AbstractC26237b.f124626a);
        this.f93487q = AbstractC26237b.m134918c(AbstractC26237b.f124630e);
        this.f93488r = AbstractC26237b.m134918c(AbstractC26237b.m134922g(0, false, true));
    }

    @Override // et.C18596c, p546uf.InterfaceC27243b
    /* renamed from: a */
    public void mo98207a(int i11, FloatBuffer floatBuffer, FloatBuffer floatBuffer2) {
        FloatBuffer floatBuffer3;
        if (this.f93485o.size() <= 0) {
            return;
        }
        if (this.f93485o.size() == 1) {
            ((C18596c) this.f93485o.get(0)).mo98207a(i11, floatBuffer, floatBuffer2);
            return;
        }
        C27998a[] c27998aArr = new C27998a[2];
        c27998aArr[0] = C28000c.m141116b().m141118c(this.f93476f, this.f93477g);
        if (this.f93485o.size() > 2) {
            c27998aArr[1] = C28000c.m141116b().m141118c(this.f93476f, this.f93477g);
        }
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        for (int i12 = 0; i12 < this.f93485o.size() - 1; i12++) {
            int i13 = i12 % 2;
            c27998aArr[i13].m141108a();
            m98210e("GPUImageFilterChain activeFrameBuffer");
            C18596c c18596c = (C18596c) this.f93485o.get(i12);
            FloatBuffer floatBuffer4 = this.f93486p;
            if (i12 == 0 && this.f93485o.size() % 2 == 0) {
                floatBuffer3 = this.f93488r;
            } else {
                floatBuffer3 = this.f93487q;
            }
            c18596c.mo98207a(i11, floatBuffer4, floatBuffer3);
            c27998aArr[i13].m141115j();
            i11 = c27998aArr[i13].m141113g();
        }
        int i14 = iArr[0];
        if (i14 >= 0) {
            GLES20.glBindFramebuffer(36160, i14);
        }
        m98210e("GPUImageFilterChain glBindFramebuffer");
        List list = this.f93485o;
        ((C18596c) list.get(list.size() - 1)).mo98207a(i11, floatBuffer, floatBuffer2);
        C28000c.m141116b().m141119d(c27998aArr[0]);
        if (c27998aArr[1] != null) {
            C28000c.m141116b().m141119d(c27998aArr[1]);
        }
    }

    @Override // et.C18596c, p546uf.InterfaceC27243b
    /* renamed from: b */
    public void mo98208b(int i11, int i12) {
        super.mo98208b(i11, i12);
        Iterator it = this.f93485o.iterator();
        while (it.hasNext()) {
            ((C18596c) it.next()).mo98208b(i11, i12);
        }
    }

    @Override // et.C18596c, p546uf.InterfaceC27243b
    /* renamed from: f */
    public String mo98211f() {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < this.f93485o.size(); i11++) {
            if (i11 != 0) {
                sb2.append("_");
            }
            sb2.append(((C18596c) this.f93485o.get(i11)).mo98211f());
        }
        return sb2.toString();
    }

    @Override // et.C18596c
    /* renamed from: j */
    public void mo98214j() {
        Iterator it = this.f93485o.iterator();
        while (it.hasNext()) {
            ((C18596c) it.next()).destroy();
        }
        super.mo98214j();
    }

    @Override // et.C18596c
    /* renamed from: l */
    public void mo98215l() {
        super.mo98215l();
        Iterator it = this.f93485o.iterator();
        while (it.hasNext()) {
            ((C18596c) it.next()).mo98209c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C18597d(JSONArray jSONArray, C3459g c3459g) {
        this();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            this.f93485o.add(new C18596c(jSONArray.getJSONObject(i11), c3459g));
        }
    }

    public C18597d(List list) {
        this();
        this.f93485o.addAll(list);
    }
}

package mt;

import im.C20615f;
import org.json.JSONObject;

/* renamed from: mt.a */
/* loaded from: classes4.dex */
public abstract class AbstractC23441a {

    /* renamed from: p */
    public int f113878p;

    /* renamed from: q */
    private float f113879q;

    public AbstractC23441a(int i11) {
        this.f113878p = i11;
    }

    /* renamed from: a */
    public abstract void mo47634a(JSONObject jSONObject);

    /* renamed from: b */
    public abstract C20615f mo47635b();

    /* renamed from: c */
    public float mo47636c() {
        return this.f113879q;
    }

    /* renamed from: d */
    public final boolean m123103d() {
        return this.f113878p == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo47623e(JSONObject jSONObject);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo47624f(JSONObject jSONObject);

    /* renamed from: g */
    public void mo47637g(float f11) {
        this.f113879q = f11;
    }

    /* renamed from: h */
    public abstract JSONObject mo47638h();
}

package p664y;

import java.util.HashSet;
import org.json.JSONObject;
import p664y.AbstractAsyncTaskC30232e;

/* renamed from: y.j */
/* loaded from: classes2.dex */
public class C30237j implements AbstractAsyncTaskC30232e.b {

    /* renamed from: a */
    private JSONObject f140438a;

    /* renamed from: b */
    private final C30233f f140439b;

    public C30237j(C30233f c30233f) {
        this.f140439b = c30233f;
    }

    @Override // p664y.AbstractAsyncTaskC30232e.b
    /* renamed from: a */
    public JSONObject mo149085a() {
        return this.f140438a;
    }

    @Override // p664y.AbstractAsyncTaskC30232e.b
    /* renamed from: b */
    public void mo149086b(JSONObject jSONObject) {
        this.f140438a = jSONObject;
    }

    /* renamed from: c */
    public void m149094c(JSONObject jSONObject, HashSet hashSet, long j11) {
        this.f140439b.m149088c(new AsyncTaskC30236i(this, hashSet, jSONObject, j11));
    }

    /* renamed from: d */
    public void m149095d() {
        this.f140439b.m149088c(new AsyncTaskC30234g(this));
    }

    /* renamed from: e */
    public void m149096e(JSONObject jSONObject, HashSet hashSet, long j11) {
        this.f140439b.m149088c(new AsyncTaskC30235h(this, hashSet, jSONObject, j11));
    }
}

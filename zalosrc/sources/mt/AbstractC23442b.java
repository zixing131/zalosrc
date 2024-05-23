package mt;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import im.C20615f;
import me0.AbstractC23265y;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mt.b */
/* loaded from: classes4.dex */
public abstract class AbstractC23442b extends AbstractC23441a {

    /* renamed from: r */
    private int f113880r;

    /* renamed from: s */
    private final float[] f113881s;

    public AbstractC23442b(int i11) {
        super(1);
        this.f113880r = i11;
        this.f113881s = new float[4];
    }

    @Override // mt.AbstractC23441a
    /* renamed from: a */
    public void mo47634a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        this.f113878p = jSONObject.optInt("mo");
        mo47626l(jSONObject.optInt("ty"));
        AbstractC23265y.m120016c(this.f113881s, jSONObject.optInt("co"));
        mo47637g((float) jSONObject.optDouble("si"));
        mo47623e(jSONObject);
    }

    @Override // mt.AbstractC23441a
    /* renamed from: b */
    public C20615f mo47635b() {
        String m120018e = AbstractC23265y.m120018e(this.f113881s);
        AbstractC19074t.m100207e(m120018e, "convertIntToHexaColor(...)");
        return new C20615f(m120018e, (int) mo47636c(), mo47625j() + 100);
    }

    @Override // mt.AbstractC23441a
    /* renamed from: h */
    public JSONObject mo47638h() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mo", this.f113878p);
            jSONObject.put("ty", mo47625j());
            jSONObject.put("co", AbstractC23265y.m120014a(this.f113881s));
            jSONObject.put("si", Float.valueOf(mo47636c()));
            mo47624f(jSONObject);
        } catch (JSONException e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return jSONObject;
    }

    /* renamed from: i */
    public final float[] m123104i() {
        return this.f113881s;
    }

    /* renamed from: j */
    public abstract int mo47625j();

    /* renamed from: k */
    public final void m123105k(float[] fArr) {
        AbstractC19074t.m100208f(fArr, "color");
        float[] fArr2 = this.f113881s;
        fArr2[0] = fArr[0];
        fArr2[1] = fArr[1];
        fArr2[2] = fArr[2];
        fArr2[3] = fArr[3];
    }

    /* renamed from: l */
    public abstract void mo47626l(int i11);
}
